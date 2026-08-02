package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.vk.superapp.vksteps.utils.enums.HealthConnectInstallType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.czu;

/* compiled from: PackagesInfoLoggerUtils.kt */
/* loaded from: classes6.dex */
public final class f890 {
    public static HealthConnectInstallType a(Context context) {
        String installerPackageName;
        InstallSourceInfo installSourceInfo;
        boolean z = false;
        try {
            PackageManager packageManager = context.getPackageManager();
            czu.a.getClass();
            if (packageManager.resolveActivity(new Intent(czu.b.b), 131072) != null) {
                z = true;
            }
        } catch (Exception unused) {
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo("com.google.android.apps.healthdata");
                installerPackageName = installSourceInfo.getInstallingPackageName();
            } else {
                installerPackageName = context.getPackageManager().getInstallerPackageName("com.google.android.apps.healthdata");
            }
            return installerPackageName == null ? HealthConnectInstallType.SYSTEM_PREINSTALLED : !z ? HealthConnectInstallType.NOT_INSTALLED : installerPackageName.equals("com.android.vending") ? HealthConnectInstallType.PLAY_STORE : HealthConnectInstallType.UNKNOWN_SOURCE;
        } catch (Exception unused2) {
            return z ? HealthConnectInstallType.SYSTEM_PREINSTALLED : HealthConnectInstallType.NOT_INSTALLED;
        }
    }

    public static PackageInfo b(Context context, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(str, of);
            return packageInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean c(Context context) {
        List l = e43.l("com.sec.android.app.shealth", "com.samsung.health", "com.samsung.shealth");
        if ((l instanceof Collection) && l.isEmpty()) {
            return false;
        }
        Iterator it = l.iterator();
        while (it.hasNext()) {
            if (b(context, (String) it.next()) != null) {
                return true;
            }
        }
        return false;
    }
}
