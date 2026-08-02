package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes5.dex */
public abstract class ckb1 {
    public static Boolean a;

    public static final void a(twa twaVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        tls tlsVar3;
        f530 f530Var;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(633844798);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(twaVar) : btsVar.e(twaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.e0(-760498703);
            uwa uwaVar = twaVar.a;
            f530 f530Var2 = c530.a;
            if (uwaVar != null) {
                btsVar.e0(1691847064);
                f530Var = aab1.a(1.0f, ((ry2) btsVar.m(uy2.a)).h, f530Var2, cyk0.c(20.0f));
                btsVar.t(false);
            } else {
                btsVar.e0(1691933337);
                btsVar.t(false);
                f530Var = f530Var2;
            }
            btsVar.t(false);
            byk0 c = cyk0.c(uwaVar != null ? 19.0f : 20.0f);
            if (uwaVar != null) {
                f530Var2 = an91.k(f530Var2, 1.0f);
            }
            qwd qwdVar = uy2.a;
            f530 a2 = aab1.a(1.0f, ((ry2) btsVar.m(qwdVar)).d, m4m0.b(f530Var2, ((ry2) btsVar.m(qwdVar)).d, c), c);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, wlsVar, a3);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar4 = d.h;
            qje.M(btsVar, tlsVar4);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            if (uwaVar == null) {
                btsVar.e0(1163023049);
                i3 = 0;
                btsVar.t(false);
            } else {
                i3 = 0;
                btsVar.e0(1163023050);
                b(uwaVar, btsVar, 0);
                btsVar.t(false);
            }
            f530 m = an91.m(a2, 0.0f, 12.0f, 1);
            sic a4 = qic.a(g43Var, so5Var, btsVar, i3);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a4);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar4);
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(-1700079476);
            Iterator it = twaVar.b.iterator();
            while (it.hasNext()) {
                akb1.a((wwa) it.next(), tlsVar, tlsVar2, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
            }
            tlsVar3 = tlsVar2;
            tse0.t(btsVar, false, true, true);
        } else {
            tlsVar3 = tlsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) twaVar, (Object) tlsVar, (Object) tlsVar3, i, 12);
        }
    }

    public static final void b(uwa uwaVar, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2111208440);
        int i2 = i | (btsVar.k(uwaVar) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 l = an91.l(c530.a, 16.0f, 13.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            CharSequence charSequence = uwaVar.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            qgy.b(charSequence, null, null, appColor$Palette, 0L, 0L, null, 0L, 0, 1, 0, null, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6, 15350);
            btsVar = btsVar;
            oeb1.c(btsVar, new x2y(1.0f, true));
            CharSequence charSequence2 = uwaVar.b;
            if (charSequence2 == null) {
                btsVar.e0(-1864992553);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(-1864992552);
                qgy.b(charSequence2, null, null, appColor$Palette, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 16374);
                btsVar = btsVar;
                btsVar.t(false);
                z = true;
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(uwaVar, i, 27);
        }
    }

    public static final void c(d6z0 d6z0Var, fid fidVar, int i) {
        d6z0 d6z0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1745813320);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(d6z0Var) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new s5w0(9, d6z0Var);
                btsVar.o0(Q);
            }
            f530 a2 = fnq0.a(c, (tls) Q);
            to5 to5Var = x4c.D;
            f43 f43Var = lr20.a;
            lhl0 a3 = khl0.a(f43Var, to5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a2);
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
            qje.W(btsVar, wlsVar, a3);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            lhl0 a4 = khl0.a(f43Var, to5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, x2yVar);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a4);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            String str = d6z0Var.b;
            a7u0 a7u0Var = gl51.a;
            ymb1.f(str, null, ((el51) btsVar.m(a7u0Var)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 0, 0, 65530);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            koy0.a(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, 0L, ((el51) btsVar.m(a7u0Var)).o(), null, 0L, 0L, null, btsVar, 0, 1014);
            btsVar.t(true);
            d6z0Var2 = d6z0Var;
            ymb1.f(d6z0Var.a, null, ((el51) btsVar.m(a7u0Var)).n(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 0, 0, 65530);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            d6z0Var2 = d6z0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new but0(d6z0Var2, i, 11);
        }
    }

    public static final void d(f6z0 f6z0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1470104674);
        int i2 = (btsVar.k(f6z0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            rcb1.c(null, f6z0Var.b, 0, null, wwg.S(-2042995952, true, new j4x0(f6z0Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 13);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j4x0(f6z0Var, i);
        }
    }
}
