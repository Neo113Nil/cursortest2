package xsna;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.cast.zzfg;
import com.google.android.gms.internal.cast.zzfk;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class hp01 {
    public static final o100 v = new o100("MediaSessionManager", null);
    public final Context a;
    public final CastOptions b;
    public final zzbx c;

    @Nullable
    public final hui0 d;

    @Nullable
    public final NotificationOptions e;

    @Nullable
    public final ComponentName f;

    @Nullable
    public final ComponentName g;
    public final i201 h;
    public final i201 i;

    @Nullable
    public final al01 j;
    public final zzfk k;
    public final pp6 l;
    public final so01 m;

    @Nullable
    public lvf0 n;

    @Nullable
    public CastDevice o;

    @Nullable
    public MediaSessionCompat p;
    public boolean q;

    @Nullable
    public PlaybackStateCompat.CustomAction r;

    @Nullable
    public PlaybackStateCompat.CustomAction s;

    @Nullable
    public PlaybackStateCompat.CustomAction t;

    @Nullable
    public PlaybackStateCompat.CustomAction u;

    public hp01(Context context, CastOptions castOptions, zzbx zzbxVar) {
        NotificationOptions notificationOptions;
        this.a = context;
        this.b = castOptions;
        this.c = zzbxVar;
        o100 o100Var = uz9.m;
        exc0.e("Must be called from the main thread.");
        uz9 uz9Var = uz9.o;
        al01 al01Var = null;
        this.d = uz9Var != null ? uz9Var.d() : null;
        CastMediaOptions castMediaOptions = castOptions.g;
        this.e = castMediaOptions == null ? null : castMediaOptions.e;
        this.m = new so01(this);
        String str = castMediaOptions == null ? null : castMediaOptions.c;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = castMediaOptions == null ? null : castMediaOptions.b;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        i201 i201Var = new i201(context);
        this.h = i201Var;
        i201Var.e = new bm01(this);
        i201 i201Var2 = new i201(context);
        this.i = i201Var2;
        i201Var2.e = new pm01(this);
        this.k = new zzfk(Looper.getMainLooper());
        o100 o100Var2 = al01.w;
        CastMediaOptions castMediaOptions2 = castOptions.g;
        if (castMediaOptions2 != null && (notificationOptions = castMediaOptions2.e) != null) {
            cc01 cc01Var = notificationOptions.G;
            if (cc01Var != null) {
                List b = aq01.b(cc01Var);
                int[] c = aq01.c(cc01Var);
                int size = b == null ? 0 : b.size();
                if (b == null || b.isEmpty()) {
                    Log.e(o100Var2.a, o100Var2.c(s770.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (b.size() > 5) {
                    Log.e(o100Var2.a, o100Var2.c(s770.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (c == null || (c.length) == 0) {
                    Log.e(o100Var2.a, o100Var2.c(s770.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i : c) {
                        if (i < 0 || i >= size) {
                            Log.e(o100Var2.a, o100Var2.c(s770.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            al01Var = new al01(context);
        }
        this.j = al01Var;
        this.l = new pp6(this, 1);
    }

    public final void a(@Nullable lvf0 lvf0Var, @Nullable CastDevice castDevice) {
        ComponentName componentName;
        CastOptions castOptions = this.b;
        CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.g;
        if (this.q || castOptions == null || castMediaOptions == null || this.e == null || lvf0Var == null || castDevice == null || (componentName = this.g) == null) {
            v.a("skip attaching media session", new Object[0]);
            return;
        }
        this.n = lvf0Var;
        lvf0Var.t(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.a;
        PendingIntent zzb = zzfg.zzb(context, 0, intent, 67108864);
        if (castMediaOptions.g) {
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "CastMediaSession", componentName, zzb);
            this.p = mediaSessionCompat;
            d(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.e)) {
                mediaSessionCompat.setMetadata(new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, context.getResources().getString(R.string.cast_casting_to_device, this.o.e)).build());
            }
            mediaSessionCompat.setCallback(new hn01(this));
            mediaSessionCompat.setActive(true);
            this.c.zzv(mediaSessionCompat);
        }
        this.q = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        MediaInfo g;
        MediaMetadata mediaMetadata;
        boolean z;
        boolean z2;
        ui01 ui01Var;
        WebImage webImage;
        jk01 jk01Var;
        Uri uri;
        MediaQueueItem f;
        MediaInfo mediaInfo;
        lvf0 lvf0Var = this.n;
        if (lvf0Var == null) {
            return;
        }
        int D = lvf0Var.D();
        MediaInfo g2 = lvf0Var.g();
        if (lvf0Var.n() && (f = lvf0Var.f()) != null && (mediaInfo = f.b) != null) {
            g2 = mediaInfo;
        }
        d(D, g2);
        if (!lvf0Var.k()) {
            h();
            j();
            return;
        }
        if (D != 0) {
            al01 al01Var = this.j;
            if (al01Var != null) {
                v.a("Update media notification.", new Object[0]);
                CastDevice castDevice = this.o;
                lvf0 lvf0Var2 = this.n;
                MediaSessionCompat mediaSessionCompat = this.p;
                if (castDevice != null && lvf0Var2 != null && mediaSessionCompat != null && (g = lvf0Var2.g()) != null && (mediaMetadata = g.e) != null) {
                    List list = mediaMetadata.b;
                    MediaStatus h = lvf0Var2.h();
                    if (h != null) {
                        int i = h.q;
                        if (i == 1 || i == 2 || i == 3) {
                            z = true;
                            z2 = z;
                            boolean z3 = lvf0Var2.i() == 2;
                            int i2 = g.c;
                            String b = mediaMetadata.b("com.google.android.gms.cast.metadata.TITLE");
                            String str = castDevice.e;
                            ui01 ui01Var2 = new ui01(z3, i2, b, str, mediaSessionCompat.getSessionToken(), z, z2);
                            boolean z4 = z3;
                            boolean z5 = z;
                            boolean z6 = z2;
                            ui01Var = al01Var.m;
                            if (ui01Var != null || z4 != ui01Var.b || i2 != ui01Var.c || !o0a.c(b, ui01Var.d) || !o0a.c(str, ui01Var.e) || z5 != ui01Var.f || z6 != ui01Var.g) {
                                al01Var.m = ui01Var2;
                                al01Var.a();
                            }
                            if (al01Var.d != null) {
                                int i3 = al01Var.k.b;
                                webImage = okw.a(mediaMetadata);
                            } else {
                                webImage = (list == null || list.isEmpty()) ? null : (WebImage) list.get(0);
                            }
                            jk01 jk01Var2 = new jk01(webImage);
                            jk01Var = al01Var.n;
                            uri = jk01Var2.a;
                            if (jk01Var != null || !o0a.c(uri, jk01Var.a)) {
                                i201 i201Var = al01Var.j;
                                og0 og0Var = new og0();
                                og0Var.b = jk01Var2;
                                Objects.requireNonNull(al01Var);
                                og0Var.c = al01Var;
                                i201Var.e = og0Var;
                                i201Var.a(uri);
                            }
                        } else {
                            Integer num = (Integer) h.y.get(h.d);
                            if (num != null) {
                                boolean z7 = num.intValue() > 0;
                                z = num.intValue() < h.r.size() + (-1);
                                z2 = z7;
                                if (lvf0Var2.i() == 2) {
                                }
                                int i22 = g.c;
                                String b2 = mediaMetadata.b("com.google.android.gms.cast.metadata.TITLE");
                                String str2 = castDevice.e;
                                ui01 ui01Var22 = new ui01(z3, i22, b2, str2, mediaSessionCompat.getSessionToken(), z, z2);
                                boolean z42 = z3;
                                boolean z52 = z;
                                boolean z62 = z2;
                                ui01Var = al01Var.m;
                                if (ui01Var != null) {
                                }
                                al01Var.m = ui01Var22;
                                al01Var.a();
                                if (al01Var.d != null) {
                                }
                                jk01 jk01Var22 = new jk01(webImage);
                                jk01Var = al01Var.n;
                                uri = jk01Var22.a;
                                if (jk01Var != null) {
                                }
                                i201 i201Var2 = al01Var.j;
                                og0 og0Var2 = new og0();
                                og0Var2.b = jk01Var22;
                                Objects.requireNonNull(al01Var);
                                og0Var2.c = al01Var;
                                i201Var2.e = og0Var2;
                                i201Var2.a(uri);
                            }
                        }
                    }
                    z = false;
                    z2 = z;
                    if (lvf0Var2.i() == 2) {
                    }
                    int i222 = g.c;
                    String b22 = mediaMetadata.b("com.google.android.gms.cast.metadata.TITLE");
                    String str22 = castDevice.e;
                    ui01 ui01Var222 = new ui01(z3, i222, b22, str22, mediaSessionCompat.getSessionToken(), z, z2);
                    boolean z422 = z3;
                    boolean z522 = z;
                    boolean z622 = z2;
                    ui01Var = al01Var.m;
                    if (ui01Var != null) {
                    }
                    al01Var.m = ui01Var222;
                    al01Var.a();
                    if (al01Var.d != null) {
                    }
                    jk01 jk01Var222 = new jk01(webImage);
                    jk01Var = al01Var.n;
                    uri = jk01Var222.a;
                    if (jk01Var != null) {
                    }
                    i201 i201Var22 = al01Var.j;
                    og0 og0Var22 = new og0();
                    og0Var22.b = jk01Var222;
                    Objects.requireNonNull(al01Var);
                    og0Var22.c = al01Var;
                    i201Var22.e = og0Var22;
                    i201Var22.a(uri);
                }
            }
            if (lvf0Var.n()) {
                return;
            }
            i(true);
        }
    }

    public final void c(int i, @Nullable Bitmap bitmap) {
        MediaSessionCompat mediaSessionCompat = this.p;
        if (mediaSessionCompat == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        MediaSessionCompat mediaSessionCompat2 = this.p;
        MediaMetadataCompat metadata = mediaSessionCompat2 == null ? null : mediaSessionCompat2.getController().getMetadata();
        mediaSessionCompat.setMetadata((metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata)).putBitmap(i == 0 ? MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON : MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap).build());
    }

    public final void d(int i, @Nullable MediaInfo mediaInfo) {
        PlaybackStateCompat build;
        MediaSessionCompat mediaSessionCompat;
        MediaMetadata mediaMetadata;
        PendingIntent zza;
        MediaSessionCompat mediaSessionCompat2 = this.p;
        if (mediaSessionCompat2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
        lvf0 lvf0Var = this.n;
        NotificationOptions notificationOptions = this.e;
        if (lvf0Var == null || this.j == null) {
            build = builder.build();
        } else {
            builder.setState(i, (lvf0Var.D() == 0 || lvf0Var.m()) ? 0L : lvf0Var.d(), 1.0f);
            if (i == 0) {
                build = builder.build();
            } else {
                cc01 cc01Var = notificationOptions != null ? notificationOptions.G : null;
                lvf0 lvf0Var2 = this.n;
                long j = (lvf0Var2 == null || lvf0Var2.m() || this.n.q()) ? 0L : 256L;
                if (cc01Var != null) {
                    List<NotificationAction> b = aq01.b(cc01Var);
                    if (b != null) {
                        for (NotificationAction notificationAction : b) {
                            String str = notificationAction.b;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j = e(str, i, bundle) | j;
                            } else {
                                f(builder, str, notificationAction);
                            }
                        }
                    }
                } else if (notificationOptions != null) {
                    Iterator it = notificationOptions.b.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                            j = e(str2, i, bundle) | j;
                        } else {
                            f(builder, str2, null);
                        }
                    }
                }
                build = builder.setActions(j).build();
            }
        }
        mediaSessionCompat2.setPlaybackState(build);
        if (notificationOptions != null && notificationOptions.H) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (notificationOptions != null && notificationOptions.I) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            mediaSessionCompat2.setExtras(bundle);
        }
        if (i == 0) {
            mediaSessionCompat2.setMetadata(new MediaMetadataCompat.Builder().build());
            return;
        }
        if (this.n != null) {
            ComponentName componentName = this.f;
            if (componentName == null) {
                zza = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                zza = zzfg.zza(this.a, 0, intent, 201326592);
            }
            if (zza != null) {
                mediaSessionCompat2.setSessionActivity(zza);
            }
        }
        lvf0 lvf0Var3 = this.n;
        if (lvf0Var3 == null || (mediaSessionCompat = this.p) == null || mediaInfo == null || (mediaMetadata = mediaInfo.e) == null) {
            return;
        }
        long j2 = lvf0Var3.m() ? 0L : mediaInfo.f;
        String b2 = mediaMetadata.b("com.google.android.gms.cast.metadata.TITLE");
        String b3 = mediaMetadata.b("com.google.android.gms.cast.metadata.SUBTITLE");
        MediaSessionCompat mediaSessionCompat3 = this.p;
        MediaMetadataCompat metadata = mediaSessionCompat3 == null ? null : mediaSessionCompat3.getController().getMetadata();
        MediaMetadataCompat.Builder putLong = (metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata)).putLong(MediaMetadataCompat.METADATA_KEY_DURATION, j2);
        if (b2 != null) {
            putLong.putString(MediaMetadataCompat.METADATA_KEY_TITLE, b2);
            putLong.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, b2);
        }
        if (b3 != null) {
            putLong.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, b3);
        }
        mediaSessionCompat.setMetadata(putLong.build());
        Uri g = g(mediaMetadata);
        if (g != null) {
            this.h.a(g);
        } else {
            c(0, null);
        }
        Uri g2 = g(mediaMetadata);
        if (g2 != null) {
            this.i.a(g2);
        } else {
            c(3, null);
        }
    }

    public final long e(String str, int i, Bundle bundle) {
        char c;
        long j;
        int hashCode = str.hashCode();
        if (hashCode == -945151566) {
            if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -945080078) {
            if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            if (i == 3) {
                j = 514;
                i = 3;
            } else {
                j = 512;
            }
            if (i != 2) {
                return j;
            }
            return 516L;
        }
        if (c == 1) {
            lvf0 lvf0Var = this.n;
            if (lvf0Var != null && lvf0Var.E()) {
                return 16L;
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            return 0L;
        }
        if (c != 2) {
            return 0L;
        }
        lvf0 lvf0Var2 = this.n;
        if (lvf0Var2 != null && lvf0Var2.F()) {
            return 32L;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f(PlaybackStateCompat.Builder builder, String str, @Nullable NotificationAction notificationAction) {
        char c;
        PlaybackStateCompat.CustomAction customAction;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        Context context = this.a;
        NotificationOptions notificationOptions = this.e;
        if (c == 0) {
            if (this.r == null && notificationOptions != null) {
                long j = notificationOptions.d;
                o100 o100Var = aq01.a;
                int i = notificationOptions.z;
                if (j == 10000) {
                    i = notificationOptions.A;
                } else if (j == ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                    i = notificationOptions.B;
                }
                int i2 = notificationOptions.l;
                if (j == 10000) {
                    i2 = notificationOptions.m;
                } else if (j == ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                    i2 = notificationOptions.n;
                }
                this.r = new PlaybackStateCompat.CustomAction.Builder(MediaIntentReceiver.ACTION_FORWARD, context.getResources().getString(i), i2).build();
            }
            customAction = this.r;
        } else if (c == 1) {
            if (this.s == null && notificationOptions != null) {
                long j2 = notificationOptions.d;
                o100 o100Var2 = aq01.a;
                int i3 = notificationOptions.C;
                if (j2 == 10000) {
                    i3 = notificationOptions.D;
                } else if (j2 == ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                    i3 = notificationOptions.E;
                }
                int i4 = notificationOptions.o;
                if (j2 == 10000) {
                    i4 = notificationOptions.p;
                } else if (j2 == ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                    i4 = notificationOptions.q;
                }
                this.s = new PlaybackStateCompat.CustomAction.Builder(MediaIntentReceiver.ACTION_REWIND, context.getResources().getString(i3), i4).build();
            }
            customAction = this.s;
        } else if (c == 2) {
            if (this.t == null && notificationOptions != null) {
                this.t = new PlaybackStateCompat.CustomAction.Builder(MediaIntentReceiver.ACTION_STOP_CASTING, context.getResources().getString(notificationOptions.F), notificationOptions.r).build();
            }
            customAction = this.t;
        } else if (c != 3) {
            customAction = notificationAction != null ? new PlaybackStateCompat.CustomAction.Builder(str, notificationAction.d, notificationAction.c).build() : null;
        } else {
            if (this.u == null && notificationOptions != null) {
                this.u = new PlaybackStateCompat.CustomAction.Builder(MediaIntentReceiver.ACTION_DISCONNECT, context.getResources().getString(notificationOptions.F), notificationOptions.r).build();
            }
            customAction = this.u;
        }
        if (customAction != null) {
            builder.addCustomAction(customAction);
        }
    }

    @Nullable
    public final Uri g(MediaMetadata mediaMetadata) {
        WebImage webImage;
        CastMediaOptions castMediaOptions = this.b.g;
        if ((castMediaOptions == null ? null : castMediaOptions.i()) != null) {
            webImage = okw.a(mediaMetadata);
        } else {
            List list = mediaMetadata.b;
            webImage = (list == null || list.isEmpty()) ? null : (WebImage) mediaMetadata.b.get(0);
        }
        if (webImage == null) {
            return null;
        }
        return webImage.c;
    }

    public final void h() {
        al01 al01Var = this.j;
        if (al01Var != null) {
            v.a("Stopping media notification.", new Object[0]);
            al01Var.j.b();
            NotificationManager notificationManager = al01Var.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.b.h) {
            zzfk zzfkVar = this.k;
            pp6 pp6Var = this.l;
            if (pp6Var != null) {
                zzfkVar.removeCallbacks(pp6Var);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    zzfkVar.postDelayed(pp6Var, 1000L);
                }
            }
        }
    }

    public final void j() {
        if (this.b.h) {
            this.k.removeCallbacks(this.l);
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }
}
