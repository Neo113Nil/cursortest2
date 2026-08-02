package xsna;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.data.GroupType;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.io.File;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;
import xsna.dys0;
import xsna.l9r;

/* compiled from: VideoNotification.kt */
/* loaded from: classes5.dex */
public final class mys0 extends dys0 {
    public final String B;
    public final a C;
    public final Bitmap D;
    public final Bitmap E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public File J;
    public final Object K;

    /* compiled from: VideoNotification.kt */
    public static class a extends dys0.a {
        public final Integer o;
        public final Integer p;
        public final String q;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject();
            this.o = Integer.valueOf(jSONObject.optInt("duration"));
            this.p = Integer.valueOf(jSONObject.optInt("viewed"));
            this.q = jSONObject.optString("owner_id");
        }
    }

    /* compiled from: VideoNotification.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupType.values().length];
            try {
                iArr[GroupType.BY_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupType.BY_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupType.NO_GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mys0(Context context, String str, a aVar, Bitmap bitmap, Bitmap bitmap2) {
        super(context, aVar, bitmap, bitmap2, null, str);
        com.vk.toggle.data.c cVar;
        int i;
        GroupType groupType;
        this.B = str;
        this.C = aVar;
        this.D = bitmap;
        this.E = bitmap2;
        String str2 = aVar.c;
        this.F = str2 == null ? "VIDEO_NOTIFICATION_TAG_ID_DEFAULT" : str2;
        String str3 = "VIDEO_NOTIFICATION_GROUP";
        this.G = "VIDEO_NOTIFICATION_GROUP";
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NOTIFICATION_NEW_VIDEO;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(videoFeatures)) {
            eqy<com.vk.toggle.data.c> eqyVar = com.vk.toggle.d.O;
            if (eqyVar.b() != null) {
                cVar = eqyVar.b();
                i = b.$EnumSwitchMapping$0[((cVar != null || (groupType = cVar.a) == null) ? GroupType.DEFAULT : groupType).ordinal()];
                if (i != 1) {
                    str3 = aVar.d;
                } else if (i == 2) {
                    str3 = aVar.q;
                } else if (i == 3) {
                    str3 = UUID.randomUUID().toString();
                }
                this.H = str3;
                this.I = NotificationCompat.CATEGORY_SOCIAL;
                this.K = msy.a(LazyThreadSafetyMode.NONE, new ivs0(this, 1));
            }
        }
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NOTIFICATION_LIVE;
        videoFeatures2.getClass();
        if (bVar.a(videoFeatures2)) {
            eqy<com.vk.toggle.data.c> eqyVar2 = com.vk.toggle.d.P;
            if (eqyVar2.b() != null) {
                cVar = eqyVar2.b();
                i = b.$EnumSwitchMapping$0[((cVar != null || (groupType = cVar.a) == null) ? GroupType.DEFAULT : groupType).ordinal()];
                if (i != 1) {
                }
                this.H = str3;
                this.I = NotificationCompat.CATEGORY_SOCIAL;
                this.K = msy.a(LazyThreadSafetyMode.NONE, new ivs0(this, 1));
            }
        }
        VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_NOTIFICATION_CONTINUE;
        videoFeatures3.getClass();
        if (bVar.a(videoFeatures3)) {
            eqy<com.vk.toggle.data.c> eqyVar3 = com.vk.toggle.d.Q;
            if (eqyVar3.b() != null) {
                cVar = eqyVar3.b();
                i = b.$EnumSwitchMapping$0[((cVar != null || (groupType = cVar.a) == null) ? GroupType.DEFAULT : groupType).ordinal()];
                if (i != 1) {
                }
                this.H = str3;
                this.I = NotificationCompat.CATEGORY_SOCIAL;
                this.K = msy.a(LazyThreadSafetyMode.NONE, new ivs0(this, 1));
            }
        }
        cVar = null;
        i = b.$EnumSwitchMapping$0[((cVar != null || (groupType = cVar.a) == null) ? GroupType.DEFAULT : groupType).ordinal()];
        if (i != 1) {
        }
        this.H = str3;
        this.I = NotificationCompat.CATEGORY_SOCIAL;
        this.K = msy.a(LazyThreadSafetyMode.NONE, new ivs0(this, 1));
    }

    @Override // xsna.dfq0
    public final Intent C() {
        Intent C = super.C();
        C.putExtra("notification_group_id_key", 16);
        String str = this.H;
        C.putExtra("notification_group_tag_id_key", str);
        C.putExtra("notification_group_key", str);
        return C;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final Notification a() {
        String str = this.j;
        Context context = this.c;
        NotificationCompat.h hVar = new NotificationCompat.h(context, str);
        String str2 = this.C.h;
        int o = str2 != null ? fai.o(str2) : BuildInfo.q() ? R.drawable.vk_icon_logo_vk_video_24 : R.drawable.vk_icon_new_logo_vk_24;
        Notification notification = hVar.I;
        notification.icon = o;
        hVar.B(x());
        CharSequence charSequence = this.n;
        hVar.e = NotificationCompat.h.d(charSequence);
        hVar.f = NotificationCompat.h.d(this.p);
        String str3 = this.B;
        boolean f = epx.f(str3, "unifyvideo_continue_watch");
        zgj0 zgj0Var = null;
        Bitmap bitmap = this.D;
        hVar.q(((f || epx.f(str3, "unifyvideo_watch_later")) && (bitmap == null || this.E == null)) ? null : bitmap);
        hVar.D(charSequence);
        hVar.u = this.I;
        String str4 = this.H;
        if (str4 != null) {
            hVar.r = str4;
        }
        PendingIntent r = r();
        if (r != null) {
            hVar.g = r;
        }
        notification.deleteIntent = (PendingIntent) this.b.getValue();
        if (gz80.a(30)) {
            if (bitmap != null) {
                IconCompat c = IconCompat.c(bitmap);
                if (charSequence != null) {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.setPackage(null);
                        launchIntentForPackage.addFlags(268468224);
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        launchIntentForPackage = null;
                    }
                    zgj0 zgj0Var2 = new zgj0();
                    zgj0Var2.a = context;
                    String str5 = this.F;
                    zgj0Var2.b = str5;
                    zgj0Var2.h = c;
                    zgj0Var2.e = charSequence;
                    zgj0Var2.l = true;
                    zgj0Var2.k = new c000(str5);
                    j1a0 j1a0Var = new j1a0();
                    j1a0Var.a = charSequence;
                    j1a0Var.b = c;
                    j1a0Var.c = null;
                    j1a0Var.d = null;
                    j1a0Var.e = false;
                    j1a0Var.f = false;
                    zgj0Var2.i = new j1a0[]{j1a0Var};
                    zgj0Var2.c = new Intent[]{launchIntentForPackage};
                    if (TextUtils.isEmpty(zgj0Var2.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = zgj0Var2.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    zgj0Var = zgj0Var2;
                }
            }
            if (zgj0Var != null) {
                bhj0.g(context, zgj0Var);
                hVar.x(zgj0Var);
            }
        }
        Collection collection = (Collection) this.q.getValue();
        if ((collection instanceof List) && (collection instanceof RandomAccess)) {
            List list = (List) collection;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                hVar.b((NotificationCompat.a) list.get(i));
            }
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                hVar.b((NotificationCompat.a) it.next());
            }
        }
        return hVar.c();
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String f() {
        return this.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    @Override // xsna.ri6
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(NotificationManager notificationManager) {
        Float f;
        int b2;
        Drawable a2;
        a aVar = this.C;
        Context context = this.c;
        File file = null;
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            Integer num = aVar.o;
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = aVar.p;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (intValue > 0 && intValue2 > 0) {
                        f = Float.valueOf(intValue2 / intValue);
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        float width = ((displayMetrics.widthPixels * 3) / 4) / bitmap.getWidth();
                        b2 = an10.b((64 * displayMetrics.density) / width);
                        if (b2 < 1) {
                            b2 = 1;
                        }
                        a2 = m33.a(R.drawable.vk_icon_play_button_64, context);
                        if (a2 != null) {
                            throw new IllegalStateException("No drawable");
                        }
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap createBitmap = Bitmap.createBitmap(b2, b2, config);
                        Canvas canvas = new Canvas(createBitmap);
                        a2.setBounds(0, 0, b2, b2);
                        a2.draw(canvas);
                        Bitmap copy = bitmap.copy(config, true);
                        Canvas canvas2 = new Canvas(copy);
                        Paint paint = new Paint(1);
                        paint.setFilterBitmap(true);
                        canvas2.drawBitmap(createBitmap, (copy.getWidth() - createBitmap.getWidth()) / 2.0f, (copy.getHeight() - createBitmap.getHeight()) / 2.0f, paint);
                        if (f != null) {
                            int b3 = an10.b((4 * displayMetrics.density) / width);
                            if (b3 < 1) {
                                b3 = 1;
                            }
                            float f2 = b3;
                            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, copy.getHeight() - f2, copy.getWidth(), copy.getHeight());
                            Paint paint2 = new Paint(1);
                            paint2.setColor(context.getColor(R.color.vk_white_alpha12));
                            Paint.Style style = Paint.Style.FILL;
                            paint2.setStyle(style);
                            canvas2.drawRect(rectF, paint2);
                            RectF rectF2 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, copy.getHeight() - f2, f.floatValue() * copy.getWidth(), copy.getHeight());
                            Paint paint3 = new Paint(1);
                            paint3.setColor(context.getColor(R.color.vk_azure_A100));
                            paint3.setStyle(style);
                            canvas2.drawRect(rectF2, paint3);
                        }
                        y970 y970Var = y970.b;
                        try {
                            kbr a3 = ((l9r) y970.d.getValue()).a(aVar.m);
                            try {
                                OutputStream c = ((l9r.a) a3).e.c(0);
                                try {
                                    copy.compress(Bitmap.CompressFormat.PNG, 100, c);
                                    s3q0 s3q0Var = s3q0.a;
                                    ro.e(c, null);
                                    l9r.a aVar2 = (l9r.a) a3;
                                    File commit = aVar2.commit();
                                    aVar2.close();
                                    file = commit;
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            f = null;
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            float width2 = ((displayMetrics2.widthPixels * 3) / 4) / bitmap.getWidth();
            b2 = an10.b((64 * displayMetrics2.density) / width2);
            if (b2 < 1) {
            }
            a2 = m33.a(R.drawable.vk_icon_play_button_64, context);
            if (a2 != null) {
            }
        }
        this.J = file;
        super.g(notificationManager);
        String str = this.H;
        if (str != null) {
            ca70 ca70Var = ca70.a;
            if (ca70.d(context, str) > 1) {
                String str2 = aVar.h;
                new xns0(this.c, this.j, this.I, str2 != null ? fai.o(str2) : BuildInfo.q() ? R.drawable.vk_icon_logo_vk_video_24 : R.drawable.vk_icon_new_logo_vk_24, str).g(notificationManager);
            }
        }
        bhj0.h(context);
    }

    @Override // com.vk.pushes.notifications.base.a
    public final String q() {
        return this.I;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final String t() {
        return this.G;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final String u() {
        return this.H;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final NotificationCompat.m x() {
        return (NotificationCompat.m) this.K.getValue();
    }
}
