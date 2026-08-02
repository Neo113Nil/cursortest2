package xsna;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import com.google.firebase.sessions.LogEnvironment;
import java.util.Iterator;

/* compiled from: SessionEvents.kt */
/* loaded from: classes.dex */
public final class lti0 {
    public static final lti0 a = new lti0();
    public static final u8y b;

    static {
        v8y v8yVar = new v8y();
        v8yVar.registerEncoder(kti0.class, qj5.a);
        v8yVar.registerEncoder(wti0.class, rj5.a);
        v8yVar.registerEncoder(ztk.class, oj5.a);
        v8yVar.registerEncoder(ad3.class, nj5.a);
        v8yVar.registerEncoder(a22.class, mj5.a);
        v8yVar.registerEncoder(ngd0.class, pj5.a);
        v8yVar.d = true;
        b = new u8y(v8yVar);
    }

    public static ad3 a(vhr vhrVar) {
        Object obj;
        String processName;
        vhrVar.a();
        Context context = vhrVar.a;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = String.valueOf(packageInfo.getLongVersionCode());
        vhrVar.a();
        String str = vhrVar.c.b;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = valueOf;
        }
        String str5 = Build.MANUFACTURER;
        vhrVar.a();
        int myPid = Process.myPid();
        Iterator it = pgd0.a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ngd0) obj).b == myPid) {
                break;
            }
        }
        ngd0 ngd0Var = (ngd0) obj;
        if (ngd0Var == null) {
            if (Build.VERSION.SDK_INT > 33) {
                processName = Process.myProcessName();
            } else {
                processName = Application.getProcessName();
                if (processName == null && (processName = ahd0.a()) == null) {
                    processName = "";
                }
            }
            ngd0Var = new ngd0(processName, myPid, 0, false);
        }
        vhrVar.a();
        return new ad3(str, logEnvironment, new a22(packageName, str4, valueOf, ngd0Var, pgd0.a(context)));
    }
}
