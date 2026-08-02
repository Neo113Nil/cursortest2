package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public abstract class nsb1 {
    public static final void a(wxe wxeVar, long j, fid fidVar, int i) {
        long j2;
        long o;
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1831855845);
        int i3 = i | (btsVar.k(wxeVar) ? 4 : 2) | 16;
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                o = ((el51) btsVar.m(gl51.a)).o();
                i2 = i3 & (-113);
            } else {
                btsVar.Y();
                i2 = i3 & (-113);
                o = j;
            }
            btsVar.u();
            f530 c = ljs0.c(c530.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new dye(i4, wxeVar);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(c, (tls) Q);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            long j3 = o;
            ymb1.f(wxeVar.a, null, j3, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 0, 0, 65530);
            koy0.a(new x2y(1.0f, true), null, 0L, j3, null, 0L, 0L, null, btsVar, 0, 1014);
            ymb1.f(wxeVar.b, null, j3, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 0, 0, 65530);
            btsVar = btsVar;
            btsVar.t(true);
            j2 = j3;
        } else {
            btsVar.Y();
            j2 = j;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new eye(wxeVar, j2, i, 0);
        }
    }

    public static final void b(iye iyeVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2129916140);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(iyeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 l = an91.l(ljs0.c(c530.a, 1.0f), 40.0f, 16.0f);
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            btsVar.e0(813679338);
            Iterator it = iyeVar.c.iterator();
            while (it.hasNext()) {
                a((wxe) it.next(), 0L, btsVar, 0);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(iyeVar, i, 12);
        }
    }

    public static final void c(sq50 sq50Var, nz50 nz50Var) {
        g0c a = qoi0.a(nz50.class);
        LinkedHashMap linkedHashMap = sq50Var.a;
        if (nz50Var != null) {
            linkedHashMap.put(a, nz50Var);
        } else {
            linkedHashMap.remove(a);
        }
    }

    public static final lum d() {
        return new lum(new jiz0(4), me01.a, new mtw(26), ne01.a);
    }
}
