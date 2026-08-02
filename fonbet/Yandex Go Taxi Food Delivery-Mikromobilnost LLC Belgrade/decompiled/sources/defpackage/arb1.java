package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.view.ContextThemeWrapper;
import kotlin.Result;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class arb1 {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(42266096);
        int i2 = i | 22;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                slsVar = (sls) btsVar.m(c3z.a);
                f530Var = c530.a;
            } else {
                btsVar.Y();
            }
            sls slsVar2 = slsVar;
            f530 f530Var2 = f530Var;
            btsVar.u();
            brb1.a(xtb1.c(), slsVar2, ohb1.e(btsVar, xxh0.common_close), f530Var2, false, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 16);
            slsVar = slsVar2;
            f530Var = f530Var2;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(f530Var, slsVar, i, 15);
        }
    }

    public static void b(String str, StringBuilder sb) {
        sb.append(OpenList.CHAR_QUOTE);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append(OpenList.CHAR_QUOTE);
    }

    public static final String c(Context context) {
        Object failure;
        InstallSourceInfo installSourceInfo;
        try {
            if (jx81.d()) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                failure = installSourceInfo.getInstallingPackageName();
            } else {
                failure = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static final Activity d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return (Activity) ((ContextThemeWrapper) context).getBaseContext();
        }
        ny61.r("Context cannot be cast to activity");
        return null;
    }
}
