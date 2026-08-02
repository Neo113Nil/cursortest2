package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.stat.scheme.SchemeStat$TypeVkWorkoutItem;
import com.vk.stat.scheme.SchemeStat$VkSyncWorkoutsItem;

/* compiled from: VkWorkoutAnalytics.kt */
/* loaded from: classes11.dex */
public final class x1w0 {
    public static String a(Context context, String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(str, of);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            }
        } catch (Throwable th) {
            xgx0.a.getClass();
            xgx0.c("VkWorkoutAnalytics.getPackageInfo() -> ", th);
            packageInfo = null;
        }
        if (packageInfo == null) {
            return str.concat(" not found");
        }
        return "Version Name: " + packageInfo.versionName;
    }

    public static void b(x1w0 x1w0Var, Context context, long j) {
        String a = a(context, "com.google.android.apps.fitness");
        String a2 = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0 ? a(context, "com.google.android.gms") : null;
        udx0 udx0Var = e370.i;
        udx0 udx0Var2 = udx0Var != null ? udx0Var : null;
        l3w0 l3w0Var = new l3w0((int) j, "", a, a2);
        udx0Var2.getClass();
        new e2w0(new SchemeStat$TypeVkWorkoutItem(new SchemeStat$VkSyncWorkoutsItem(l3w0Var.d(), l3w0Var.c(), l3w0Var.b(), l3w0Var.a()), vhk0.f())).q();
    }
}
