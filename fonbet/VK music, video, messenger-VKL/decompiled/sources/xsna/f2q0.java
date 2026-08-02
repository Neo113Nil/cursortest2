package xsna;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class f2q0 {
    public static boolean a(int i, @NonNull Context context) {
        if (b(context, i, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                jau a = jau.a(context);
                a.getClass();
                if (packageInfo != null && (jau.c(packageInfo, false) || (jau.c(packageInfo, true) && fau.a(a.a)))) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean b(@NonNull Context context, int i, @NonNull String str) {
        a890 a = xzx0.a(context);
        a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
