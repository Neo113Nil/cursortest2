package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yx360.design.compose.atoms.DsButton$Style;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.ui.stopsline.LineState;

/* loaded from: classes11.dex */
public abstract class keb1 {
    public static au2 a;

    public static final void a(int i, fid fidVar, sls slsVar, sls slsVar2, f530 f530Var) {
        sls slsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1284003485);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | (btsVar.e(slsVar2) ? 32 : 16) | 384;
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            slsVar3 = slsVar2;
        } else {
            String e = ohb1.e(btsVar, oyh0.folder_add_chat_dismiss_dialog_title);
            vnm vnmVar = new vnm(slsVar2, DsButton$Style.Neutral, ohb1.e(btsVar, oyh0.button_no));
            vnm vnmVar2 = new vnm(slsVar, DsButton$Style.Brand, ohb1.e(btsVar, oyh0.button_yes));
            int i3 = ((i2 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL;
            c530 c530Var = c530.a;
            slsVar3 = slsVar2;
            qn91.a(slsVar3, e, vnmVar, c530Var, null, null, vnmVar2, btsVar, i3, 176);
            f530Var = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zm1(slsVar, slsVar3, f530Var, i);
        }
    }

    public static final void b(LineState lineState, long j, f530 f530Var, float f, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2050837843);
        int i2 = i | (btsVar.c(lineState.ordinal()) ? 4 : 2) | (btsVar.d(j) ? 32 : 16) | 384;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            long j2 = ((ry2) btsVar.m(uy2.a)).p;
            long n = tje.n(AppColor$Palette.Background, btsVar);
            c530 c530Var = c530.a;
            f530 m = ljs0.m(c530Var, f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m);
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
            f530 m2 = ljs0.m(c530Var, f);
            boolean d3 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | btsVar.d(j2) | btsVar.d(n);
            Object Q = btsVar.Q();
            if (d3 || Q == did.a) {
                why whyVar = new why(lineState, j2, j, n);
                btsVar.o0(whyVar);
                Q = whyVar;
            }
            qeb1.a(0, btsVar, (tls) Q, m2);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apr(lineState, j, f530Var2, f, i);
        }
    }

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Sound1", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        long j = iq2.g;
        a6t0 a6t0Var = new a6t0(j);
        uq90 e = nnm.e(13.0f, 2.0f);
        e.e(2.2f, 0.0f, 4.0f, 4.48f, 4.0f, 10.0f);
        e.n(-1.8f, 10.0f, -4.0f, 10.0f);
        e.m(-0.95f, -0.02f, -1.75f, -1.0f);
        e.d(9.92f, 19.36f, 9.0f, 15.94f, 9.0f, 12.0f);
        e.e(0.0f, -3.97f, 0.93f, -7.4f, 2.27f, -9.01f);
        e.l(12.05f, 2.02f, 13.0f, 2.0f);
        e.k(-1.8f, 7.0f);
        e.b(22.0f, 22.0f, false, false, 0.0f, 6.0f);
        e.g(0.4f);
        e.e(0.66f, 0.0f, 1.2f, -1.34f, 1.2f, -3.0f);
        e.n(-0.54f, -3.0f, -1.2f, -3.0f);
        e.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
        a6t0 a6t0Var2 = new a6t0(j);
        uq90 e2 = nnm.e(8.52f, 5.08f);
        e2.a(22.0f, 22.0f, false, false, 7.5f, 12.0f);
        e2.e(0.0f, 2.58f, 0.37f, 5.0f, 1.02f, 6.92f);
        e2.h(6.0f, 17.0f);
        e2.h(5.0f, 17.0f);
        e2.e(-1.1f, 0.0f, -2.0f, -2.24f, -2.0f, -5.0f);
        e2.n(0.9f, -5.0f, 2.0f, -5.0f);
        e2.g(1.0f);
        e2.c();
        e2.j(19.62f, 7.88f);
        e2.b(7.0f, 7.0f, false, true, 0.01f, 8.22f);
        e2.i(-1.62f, -1.17f);
        e2.a(5.0f, 5.0f, false, false, 18.0f, 9.06f);
        e2.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", e2.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }
}
