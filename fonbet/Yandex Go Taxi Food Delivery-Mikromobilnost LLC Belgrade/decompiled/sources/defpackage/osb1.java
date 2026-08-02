package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class osb1 {
    public static final void a(ekj ekjVar, hoy0 hoy0Var, yur yurVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(910466205);
        int i2 = i | (btsVar2.k(ekjVar) ? 4 : 2) | (btsVar2.k(hoy0Var) ? 32 : 16) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        int i3 = 0;
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new qye(ekjVar.a, ekjVar.b);
                btsVar2.o0(Q);
            }
            qye qyeVar = (qye) Q;
            f530 b = gi91.b(ljs0.c(c530.a, 1.0f), yurVar);
            ety0 ety0Var = ((zm51) btsVar2.m(an51.a)).a;
            lzr lzrVar = lzr.D;
            a7u0 a7u0Var = gl51.a;
            btsVar = btsVar2;
            ne5.a(hoy0Var, tlsVar, b, false, false, ety0.a(ety0Var, ((el51) btsVar2.m(a7u0Var)).n(), 0L, lzrVar, null, null, 0L, null, null, null, 3, 0L, null, null, 16744442), new lkx(i3, 3, i3, HProv.PP_PASSWD_TERM), null, true, 0, 0, qyeVar, null, null, new a6t0(((el51) btsVar2.m(a7u0Var)).n()), null, btsVar, ((i2 >> 3) & 14) | 102236160 | ((i2 >> 6) & 112), 0, 46744);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) ekjVar, (Object) hoy0Var, (Object) yurVar, tlsVar, i, 21);
        }
    }

    public static final boolean b(Context context) {
        NetworkCapabilities networkCapabilities;
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    public static bbt c(se01 se01Var) {
        return (bbt) se01Var.b.get();
    }

    public static uet d(se01 se01Var) {
        return (uet) se01Var.a.get();
    }

    public static se01 e(dnp0 dnp0Var) {
        return (se01) new obg(dnp0Var).l.get();
    }
}
