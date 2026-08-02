package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import xsna.lhg;

/* loaded from: classes10.dex */
public final class kg {
    public final Context a;
    public final jg0 b;

    public kg(Context context, jg0 jg0Var) {
        this.a = context;
        this.b = jg0Var;
    }

    public final m50 a() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        PackageManager packageManager = this.a.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            String packageName = this.a.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(this.a.getPackageName(), 0);
        }
        this.b.getClass();
        String b = jg0.b();
        if (b == null) {
            b = "Undefined";
        }
        String concat = "Android ".concat(b);
        String a = lhg.a(i, "API ");
        String str = packageInfo.packageName;
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = "";
        }
        return new m50(str, str2, concat, a);
    }
}
