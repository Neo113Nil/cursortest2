package defpackage;

import android.os.Looper;
import android.util.Log;
import kotlin.Pair;

/* loaded from: classes11.dex */
public abstract class q0b1 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-127012293);
        if (btsVar.V(i & 1, i != 0)) {
            long n = tje.n(new up2(iq2.a), btsVar);
            long f = rzo.f(4281153614L);
            Pair[] pairArr = {new Pair(Float.valueOf(0.0f), new ldc(tje.n(new vp2(ldc.b(n, 1.0f, 0.0f, 0.0f, 0.0f, 14), ldc.b(f, 0.8f, 0.0f, 0.0f, 0.0f, 14)), btsVar))), new Pair(Float.valueOf(0.75f), new ldc(tje.n(new vp2(ldc.b(n, 0.64f, 0.0f, 0.0f, 0.0f, 14), ldc.b(f, 0.4f, 0.0f, 0.0f, 0.0f, 14)), btsVar))), new Pair(Float.valueOf(1.0f), new ldc(tje.n(new vp2(ldc.b(n, 0.0f, 0.0f, 0.0f, 0.0f, 14), ldc.b(f, 0.0f, 0.0f, 0.0f, 0.0f, 14)), btsVar)))};
            f530 e = ljs0.e(ljs0.c(c530.a, 1.0f), 132.0f);
            boolean e2 = btsVar.e(pairArr);
            Object Q = btsVar.Q();
            if (e2 || Q == did.a) {
                Q = new gau(4, pairArr);
                btsVar.o0(Q);
            }
            pi6.a(bb1.g(e, (tls) Q), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new w9u(i, 5);
        }
    }

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 56 + 1);
        g8e.D(sb, "checkMainThread: current thread ", valueOf, " IS NOT the main thread ", valueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        ny61.r(str);
    }

    public static final pxm0 c() {
        return new pxm0("city_mode", "shortcuts");
    }
}
