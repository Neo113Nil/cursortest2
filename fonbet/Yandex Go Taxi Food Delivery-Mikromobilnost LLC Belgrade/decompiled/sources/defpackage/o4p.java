package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class o4p {
    public static final p4p a;

    static {
        new p4p(31);
        a = new p4p(27);
    }

    public static final void a(f530 f530Var, Object obj, bms bmsVar, p4p p4pVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1866540219);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(obj) : btsVar.e(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(bmsVar) ? 256 : 128;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.k(p4pVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar.e(aVar) ? 131072 : 65536;
        }
        int i4 = i3;
        if (btsVar.V(i4 & 1, (74899 & i4) != 74898)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(obj);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(p4pVar.a);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            if (obj != null) {
                oz40Var.setValue(obj);
                oz40Var2.setValue(p4pVar.a);
            }
            float f = obj == null ? 0.0f : 1.0f;
            jj2 jj2Var = p4pVar.d;
            boolean z = p4pVar.c;
            m3u0 b = b.b(f, jj2Var, null, null, btsVar, 0, 28);
            Object value = oz40Var.getValue();
            btsVar.e0(-1551154487);
            float f2 = p4pVar.b;
            if (Float.isNaN(f2)) {
                ((nx2) btsVar.m(uy2.c)).getClass();
                f2 = 24.0f;
            }
            float f3 = f2;
            btsVar.t(false);
            byk0 c = z ? cyk0.c(f3) : cyk0.e(f3, f3, 0.0f, 0.0f, 12);
            byk0 e = !z ? c : cyk0.e(f3, f3, 0.0f, 0.0f, 12);
            boolean b2 = btsVar.b(f3) | btsVar.k(b) | ((i4 & 7168) == 2048);
            Object Q3 = btsVar.Q();
            if (b2 || Q3 == o430Var) {
                Q3 = new n4p(f3, b);
                btsVar.o0(Q3);
            }
            z910 z910Var = (z910) Q3;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            k4p k4pVar = p4pVar.a;
            k4p k4pVar2 = (k4p) oz40Var2.getValue();
            k2z.a(k4pVar2.c, k4pVar2.d, wwg.S(674593076, true, new xrl(f3, i4, 1, e, value, bmsVar), btsVar), btsVar, 384);
            k2z.a(k4pVar.a, k4pVar.b, wwg.S(327369821, true, new gxm(6, c, p4pVar, aVar), btsVar), btsVar, 384);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(f530Var, obj, (Object) bmsVar, (Object) p4pVar, (Object) aVar, i, 16);
        }
    }
}
