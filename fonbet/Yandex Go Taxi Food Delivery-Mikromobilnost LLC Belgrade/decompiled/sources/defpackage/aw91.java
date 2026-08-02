package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes11.dex */
public abstract class aw91 {
    public static final s400 a = new s400();

    public static final void a(f530 f530Var, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(413170639);
        dmw0 dmw0Var = btsVar.a;
        if (((i | (btsVar.k(f530Var) ? 4 : 2)) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            qnm qnmVar = qnm.a;
            qnm.c.getClass();
            byk0 c = cyk0.c(24.0f);
            qnm.d.getClass();
            f530 l = an91.l(f530Var, 16.0f, 16.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 b = ljs0.b(c530.a, 0.0f, 40.0f, 1);
            qnm.f.getClass();
            f530 a2 = aab1.a(1.0f, qnm.c(btsVar).m(), b, c);
            qnm.g.getClass();
            btsVar.e0(939773219);
            long n = qnm.c(btsVar).n();
            btsVar.t(false);
            f530 l2 = an91.l(m4m0.b(a2.k(ibb1.c(a2, 6.0f, c, n, n, 4)), qnm.c(btsVar).b(), c), 8.0f, 4.0f);
            lhl0 a3 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, l2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            aVar.invoke(nhl0.a, btsVar, 54);
            btsVar.t(true);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zsm(f530Var, aVar, i, 0);
        }
    }

    public static fq60 b(String str) {
        HashMap hashMap = oj51.w;
        fq60 fq60Var = (fq60) hashMap.get(str);
        if (fq60Var != null) {
            return fq60Var;
        }
        fq60 fq60Var2 = new fq60();
        fq60Var2.a = oby.c;
        fq60Var2.b = new ArrayList();
        hashMap.put(str, fq60Var2);
        return fq60Var2;
    }

    public static final String c(uod0 uod0Var) {
        if (uod0Var instanceof sod0) {
            return "Waiting";
        }
        if (uod0Var instanceof rod0) {
            return "SyncWaiting";
        }
        if (uod0Var instanceof ood0) {
            return "CompleteWaiting";
        }
        if (uod0Var instanceof tod0) {
            StringBuilder sb = new StringBuilder("WebAction(url=");
            tod0 tod0Var = (tod0) uod0Var;
            sb.append(tod0Var.a);
            sb.append(", qrCodeParams=");
            sb.append(tod0Var.b);
            sb.append(')');
            return sb.toString();
        }
        if (uod0Var instanceof qod0) {
            return b64.p(new StringBuilder("Success(invoiceId="), ((qod0) uod0Var).a, ')');
        }
        if (uod0Var instanceof pod0) {
            return "Error(reason=" + ((pod0) uod0Var).b + ')';
        }
        if (uod0Var instanceof nod0) {
            return "Cancel";
        }
        w511.b();
        return null;
    }
}
