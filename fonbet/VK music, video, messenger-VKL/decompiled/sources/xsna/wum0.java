package xsna;

import android.content.Context;
import com.vk.vendor.pushes.FirebasePushService;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: SubprocessAnalyticsWriter.kt */
/* loaded from: classes6.dex */
public final class wum0 {
    public static final ExecutorService a;
    public static final a b;

    /* compiled from: SubprocessAnalyticsWriter.kt */
    public static final class a {
        public Boolean a;
    }

    static {
        ExecutorService b2;
        b2 = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "SubprocessAnalyticsWriter");
        a = b2;
        b = new a();
    }

    public static void a(Context context, String str, String str2) {
        boolean z;
        boolean z2;
        a aVar = b;
        Boolean bool = aVar.a;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            try {
                z = new File(new File(context.getFilesDir(), "push-analytics"), "notif_push_pipeline_analytic").exists();
            } catch (SecurityException unused) {
                z = false;
            }
            aVar.a = Boolean.valueOf(z);
            z2 = z;
        }
        if (z2) {
            a.execute(new vum0(0, context, str2, str));
        }
    }

    public static void b(FirebasePushService firebasePushService, String str) {
        a(firebasePushService, str, "push_init");
    }
}
