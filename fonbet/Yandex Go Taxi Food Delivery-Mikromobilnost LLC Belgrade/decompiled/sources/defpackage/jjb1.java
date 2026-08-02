package defpackage;

import android.opengl.Matrix;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.messaging.ui.switchMeeting.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class jjb1 {
    public static final void a(pna pnaVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1988655491);
        int i3 = i | (btsVar.e(pnaVar) ? 4 : 2) | 48;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = bzk0.c(an91.o(bzk0.c(ljs0.c(c530Var, 1.0f), AppColor$Palette.CardDivider, zr9.a), 0.0f, 0.0f, 0.0f, 6.0f, 7), AppColor$Palette.Background, zr9.b);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            CharSequence charSequence = pnaVar.c;
            ona onaVar = pnaVar.e;
            qgy.b(charSequence, null, an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 62.0f, 0.0f, 0.0f, 13), AppColor$Palette.Text, uh6.E(24), 0L, new sjy0(3), 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, 28032, 0, 12130);
            f530Var2 = c530Var;
            qgy.b(pnaVar.d, null, an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 8.0f, 16.0f, 16.0f), AppColor$Palette.TextMinor, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12146);
            btsVar = btsVar;
            if (onaVar == null) {
                btsVar.e0(1516969978);
                btsVar.t(false);
            } else {
                btsVar.e0(1516969979);
                ijb1.a(onaVar.b, onaVar.a, onaVar.c, ljs0.c(f530Var2, 1.0f), btsVar, HProv.ALG_TYPE_SECURECHANNEL);
                btsVar.t(false);
            }
            i2 = 1;
            btsVar.t(true);
        } else {
            i2 = 1;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qna(pnaVar, f530Var2, i, i2);
        }
    }

    public static final void b(pna pnaVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(105099025);
        int i2 = (btsVar.e(pnaVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            int i3 = (i2 & 14) | 8;
            a(pnaVar, null, btsVar, i3);
            c(pnaVar, sm91.f(cj6.a.a(c530Var, x4c.c), 0.0f, -42.0f, 1), btsVar, i3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(pnaVar, i, 21);
        }
    }

    public static final void c(pna pnaVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1621516324);
        int i3 = (btsVar.e(pnaVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            String str = pnaVar.b;
            if (str == null) {
                btsVar.e0(-1095509643);
                btsVar.t(false);
                i2 = 0;
            } else {
                btsVar.e0(-1095509642);
                i2 = 0;
                v0b1.a(mja1.a(str, null, 6), an91.o(ljs0.j(f530Var, 175.0f, 100.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7), null, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1020);
                btsVar.t(false);
            }
        } else {
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qna(pnaVar, f530Var, i, i2);
        }
    }

    public static final void d(int i, fid fidVar, sls slsVar, f530 f530Var) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1153699105);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new ve6(slsVar, f530Var, i, 6);
                return;
            }
            return;
        }
        btsVar.a0();
        if ((i & 1) == 0 || btsVar.C()) {
            btsVar.e0(-897180073);
            rs31 b = jjo.b(btsVar);
            hs31 a = jjo.a(btsVar);
            btsVar.e0(544794079);
            boolean e = btsVar.e(a);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new w4(a, 26);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            yr31 G = ooc.G(qoi0.a(a.class), b, null, vfc.h(a.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        btsVar.u();
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }

    public static void e(float[] fArr, float f) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void f(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }
}
