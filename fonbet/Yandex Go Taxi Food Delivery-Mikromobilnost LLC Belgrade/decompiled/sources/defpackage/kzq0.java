package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.a;
import com.google.firebase.sessions.LogEnvironment;

/* loaded from: classes.dex */
public final class kzq0 {
    public static final kzq0 a = new kzq0();
    public static final vit b;

    static {
        mcx mcxVar = new mcx();
        mcxVar.a(jzq0.class, vt3.a);
        mcxVar.a(uzq0.class, wt3.a);
        mcxVar.a(wng.class, tt3.a);
        mcxVar.a(d03.class, st3.a);
        mcxVar.a(n72.class, rt3.a);
        mcxVar.a(s5f0.class, ut3.a);
        mcxVar.d = true;
        b = new vit(24, mcxVar);
    }

    public static d03 a(a aVar) {
        aVar.a();
        Context context = aVar.a;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = String.valueOf(packageInfo.getLongVersionCode());
        aVar.a();
        String str = aVar.c.b;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = valueOf;
        }
        String str5 = Build.MANUFACTURER;
        aVar.a();
        s5f0 w = udq0.w(context);
        aVar.a();
        return new d03(str, logEnvironment, new n72(packageName, str4, valueOf, w, udq0.r(context)));
    }
}
