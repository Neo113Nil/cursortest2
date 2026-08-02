package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.d;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public abstract class pi6 {
    public static final hz40 a = c(true);
    public static final hz40 b = c(false);
    public static final si6 c = new si6(x4c.b, false);
    public static final oi6 d = oi6.a;

    public static final void a(f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-211209833);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            int hashCode = Long.hashCode(btsVar.T);
            f530 d2 = b.d(btsVar, f530Var);
            r1b0 o = btsVar.o();
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(f530Var, i, i3);
        }
    }

    public static final void b(o.a aVar, o oVar, x910 x910Var, LayoutDirection layoutDirection, int i, int i2, jt1 jt1Var) {
        jt1 jt1Var2;
        Object a2 = x910Var.a();
        ni6 ni6Var = a2 instanceof ni6 ? (ni6) a2 : null;
        o.a.m(aVar, oVar, ((ni6Var == null || (jt1Var2 = ni6Var.a) == null) ? jt1Var : jt1Var2).a((oVar.a << 32) | (oVar.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (i << 32) | (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), layoutDirection));
    }

    public static final hz40 c(boolean z) {
        hz40 hz40Var = new hz40(9);
        uo5 uo5Var = x4c.b;
        hz40Var.o(uo5Var, new si6(uo5Var, z));
        uo5 uo5Var2 = x4c.c;
        hz40Var.o(uo5Var2, new si6(uo5Var2, z));
        uo5 uo5Var3 = x4c.w;
        hz40Var.o(uo5Var3, new si6(uo5Var3, z));
        uo5 uo5Var4 = x4c.x;
        hz40Var.o(uo5Var4, new si6(uo5Var4, z));
        uo5 uo5Var5 = x4c.y;
        hz40Var.o(uo5Var5, new si6(uo5Var5, z));
        uo5 uo5Var6 = x4c.z;
        hz40Var.o(uo5Var6, new si6(uo5Var6, z));
        uo5 uo5Var7 = x4c.A;
        hz40Var.o(uo5Var7, new si6(uo5Var7, z));
        uo5 uo5Var8 = x4c.B;
        hz40Var.o(uo5Var8, new si6(uo5Var8, z));
        uo5 uo5Var9 = x4c.C;
        hz40Var.o(uo5Var9, new si6(uo5Var9, z));
        return hz40Var;
    }

    public static final z910 d(jt1 jt1Var, boolean z) {
        z910 z910Var = (z910) (z ? a : b).d(jt1Var);
        return z910Var == null ? new si6(jt1Var, z) : z910Var;
    }

    public static final si6 e(uo5 uo5Var, bts btsVar, int i) {
        if (uo5Var.equals(x4c.b)) {
            btsVar.e0(244332343);
            btsVar.t(false);
            return c;
        }
        btsVar.e0(244380021);
        boolean a2 = ((((i & 14) ^ 6) > 4 && btsVar.k(uo5Var)) || (i & 6) == 4) | btsVar.a(false);
        Object Q = btsVar.Q();
        if (a2 || Q == did.a) {
            Q = new si6(uo5Var, false);
            btsVar.o0(Q);
        }
        si6 si6Var = (si6) Q;
        btsVar.t(false);
        return si6Var;
    }
}
