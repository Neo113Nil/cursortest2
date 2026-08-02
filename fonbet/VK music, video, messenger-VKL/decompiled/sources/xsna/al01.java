package xsna;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.cast.zzfg;
import com.google.android.gms.internal.cast.zzpm;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class al01 {
    public static final o100 w = new o100("MediaNotificationProxy", null);
    public final Context a;

    @Nullable
    public final NotificationManager b;
    public final NotificationOptions c;

    @Nullable
    public final okw d;
    public final ComponentName e;

    @Nullable
    public final ComponentName f;
    public ArrayList g = new ArrayList();

    @Nullable
    public int[] h;
    public final long i;
    public final i201 j;
    public final ImageHints k;
    public final Resources l;
    public ui01 m;
    public jk01 n;

    @Nullable
    public NotificationCompat.a o;

    @Nullable
    public NotificationCompat.a p;

    @Nullable
    public NotificationCompat.a q;

    @Nullable
    public NotificationCompat.a r;

    @Nullable
    public NotificationCompat.a s;

    @Nullable
    public NotificationCompat.a t;

    @Nullable
    public NotificationCompat.a u;

    @Nullable
    public NotificationCompat.a v;

    public al01(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        o100 o100Var = uz9.m;
        exc0.e("Must be called from the main thread.");
        uz9 uz9Var = uz9.o;
        exc0.i(uz9Var);
        exc0.e("Must be called from the main thread.");
        CastOptions castOptions = uz9Var.e;
        exc0.i(castOptions);
        CastMediaOptions castMediaOptions = castOptions.g;
        exc0.i(castMediaOptions);
        NotificationOptions notificationOptions = castMediaOptions.e;
        exc0.i(notificationOptions);
        this.c = notificationOptions;
        this.d = castMediaOptions.i();
        Resources resources = context.getResources();
        this.l = resources;
        this.e = new ComponentName(context.getApplicationContext(), castMediaOptions.b);
        String str = notificationOptions.e;
        if (TextUtils.isEmpty(str)) {
            this.f = null;
        } else {
            this.f = new ComponentName(context.getApplicationContext(), str);
        }
        this.i = notificationOptions.d;
        int dimensionPixelSize = resources.getDimensionPixelSize(notificationOptions.s);
        ImageHints imageHints = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.k = imageHints;
        this.j = new i201(context.getApplicationContext(), imageHints);
        if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        com.google.android.gms.internal.cast.zzr.zzb(zzpm.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final void a() {
        Bitmap bitmap;
        PendingIntent activities;
        NotificationCompat.a b;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.m == null) {
            return;
        }
        jk01 jk01Var = this.n;
        if (jk01Var == null || (bitmap = jk01Var.b) == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = null;
        }
        Context context = this.a;
        NotificationCompat.h hVar = new NotificationCompat.h(context, "cast_media_notification");
        hVar.q(bitmap);
        NotificationOptions notificationOptions = this.c;
        hVar.I.icon = notificationOptions.f;
        hVar.e = NotificationCompat.h.d(this.m.d);
        hVar.f = NotificationCompat.h.d(this.l.getString(notificationOptions.t, this.m.e));
        hVar.n(2, true);
        hVar.l = false;
        hVar.x = 1;
        ComponentName componentName = this.f;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            ArrayList arrayList = new ArrayList();
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    for (Intent a = jw50.a(context, component); a != null; a = jw50.a(context, a.getComponent())) {
                        arrayList.add(size, a);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
        }
        if (activities != null) {
            hVar.g = activities;
        }
        cc01 cc01Var = notificationOptions.G;
        o100 o100Var = w;
        if (cc01Var != null) {
            o100Var.a("actionsProvider != null", new Object[0]);
            int[] c = aq01.c(cc01Var);
            this.h = c != null ? (int[]) c.clone() : null;
            List<NotificationAction> b2 = aq01.b(cc01Var);
            this.g = new ArrayList();
            if (b2 != null) {
                for (NotificationAction notificationAction : b2) {
                    String str = notificationAction.b;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        b = b(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.e);
                        b = new NotificationCompat.a.C0022a(notificationAction.c, notificationAction.d, zzfg.zzb(context, 0, intent2, 67108864)).b();
                    }
                    if (b != null) {
                        this.g.add(b);
                    }
                }
            }
        } else {
            o100Var.a("actionsProvider == null", new Object[0]);
            this.g = new ArrayList();
            Iterator it = notificationOptions.b.iterator();
            while (it.hasNext()) {
                NotificationCompat.a b3 = b((String) it.next());
                if (b3 != null) {
                    this.g.add(b3);
                }
            }
            int[] iArr = notificationOptions.c;
            this.h = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            hVar.b((NotificationCompat.a) it2.next());
        }
        n970 n970Var = new n970();
        int[] iArr2 = this.h;
        if (iArr2 != null) {
            n970Var.e = iArr2;
        }
        MediaSessionCompat.Token token = this.m.a;
        if (token != null) {
            n970Var.f = token;
        }
        hVar.B(n970Var);
        notificationManager.notify("castMediaNotification", 1, hVar.c());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public final NotificationCompat.a b(String str) {
        char c;
        int i;
        int i2;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        long j = this.i;
        PendingIntent pendingIntent = null;
        Resources resources = this.l;
        Context context = this.a;
        ComponentName componentName = this.e;
        NotificationOptions notificationOptions = this.c;
        switch (c) {
            case 0:
                ui01 ui01Var = this.m;
                int i3 = ui01Var.c;
                if (!ui01Var.b) {
                    if (this.o == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent.setComponent(componentName);
                        this.o = new NotificationCompat.a.C0022a(notificationOptions.i, resources.getString(notificationOptions.w), zzfg.zzb(context, 0, intent, 67108864)).b();
                    }
                    return this.o;
                }
                if (this.p == null) {
                    if (i3 == 2) {
                        i = notificationOptions.g;
                        i2 = notificationOptions.u;
                    } else {
                        i = notificationOptions.h;
                        i2 = notificationOptions.v;
                    }
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    intent2.setComponent(componentName);
                    this.p = new NotificationCompat.a.C0022a(i, resources.getString(i2), zzfg.zzb(context, 0, intent2, 67108864)).b();
                }
                return this.p;
            case 1:
                boolean z = this.m.f;
                if (this.q == null) {
                    if (z) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent3.setComponent(componentName);
                        pendingIntent = zzfg.zzb(context, 0, intent3, 67108864);
                    }
                    this.q = new NotificationCompat.a.C0022a(notificationOptions.j, resources.getString(notificationOptions.x), pendingIntent).b();
                }
                return this.q;
            case 2:
                boolean z2 = this.m.g;
                if (this.r == null) {
                    if (z2) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent4.setComponent(componentName);
                        pendingIntent = zzfg.zzb(context, 0, intent4, 67108864);
                    }
                    this.r = new NotificationCompat.a.C0022a(notificationOptions.k, resources.getString(notificationOptions.y), pendingIntent).b();
                }
                return this.r;
            case 3:
                if (this.s == null) {
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent5.setComponent(componentName);
                    intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent zzb = zzfg.zzb(context, 0, intent5, 201326592);
                    o100 o100Var = aq01.a;
                    int i4 = notificationOptions.l;
                    if (j == 10000) {
                        i4 = notificationOptions.m;
                    } else if (j == ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                        i4 = notificationOptions.n;
                    }
                    int i5 = notificationOptions.z;
                    if (j == 10000) {
                        i5 = notificationOptions.A;
                    } else if (j == ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                        i5 = notificationOptions.B;
                    }
                    this.s = new NotificationCompat.a.C0022a(i4, resources.getString(i5), zzb).b();
                }
                return this.s;
            case 4:
                if (this.t == null) {
                    Intent intent6 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent6.setComponent(componentName);
                    intent6.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent zzb2 = zzfg.zzb(context, 0, intent6, 201326592);
                    o100 o100Var2 = aq01.a;
                    int i6 = notificationOptions.o;
                    if (j == 10000) {
                        i6 = notificationOptions.p;
                    } else if (j == ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                        i6 = notificationOptions.q;
                    }
                    int i7 = notificationOptions.C;
                    if (j == 10000) {
                        i7 = notificationOptions.D;
                    } else if (j == ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                        i7 = notificationOptions.E;
                    }
                    this.t = new NotificationCompat.a.C0022a(i6, resources.getString(i7), zzb2).b();
                }
                return this.t;
            case 5:
                if (this.v == null) {
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent7.setComponent(componentName);
                    this.v = new NotificationCompat.a.C0022a(notificationOptions.r, resources.getString(notificationOptions.F), zzfg.zzb(context, 0, intent7, 67108864)).b();
                }
                return this.v;
            case 6:
                if (this.u == null) {
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent8.setComponent(componentName);
                    this.u = new NotificationCompat.a.C0022a(notificationOptions.r, resources.getString(notificationOptions.F, ""), zzfg.zzb(context, 0, intent8, 67108864)).b();
                }
                return this.u;
            default:
                o100 o100Var3 = w;
                Log.e(o100Var3.a, o100Var3.c("Action: %s is not a pre-defined action.", str));
                return null;
        }
    }
}
