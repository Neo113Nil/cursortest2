package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yx360.design.compose.atoms.DsButton$Style;
import com.yx360.design.compose.atoms.DsHeading$Align;
import com.yx360.design.compose.atoms.DsHeading$Size;
import skeletor.render.SkeletonContentView;

/* loaded from: classes15.dex */
public final class om50 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ sls w;

    public om50(int i, int i2, sls slsVar, sls slsVar2) {
        this.a = i;
        this.b = i2;
        this.c = slsVar;
        this.w = slsVar2;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float f;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        fid fidVar = (fid) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= fidVar.a(booleanValue) ? 32 : 16;
        }
        if ((intValue & 145) == 144) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        if (!booleanValue) {
            so5 so5Var = x4c.H;
            c530 c530Var = c530.a;
            f530 u = pw91.u(ljs0.u(c530Var, null, 3), pw91.o(fidVar), 14);
            sic a = qic.a(lr20.e, so5Var, fidVar, 54);
            bts btsVar2 = (bts) fidVar;
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(fidVar, u);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(fidVar, d.f, a);
            qje.W(fidVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(fidVar, d.d, d);
            qnm.d.getClass();
            oeb1.c(fidVar, ljs0.e(c530Var, 12.0f));
            o4b1.b(mt71.m(this.a, 0, fidVar), null, an91.k(ljs0.e(ljs0.c(c530Var, 1.0f), 200.0f), 12.0f), null, null, 0.0f, null, fidVar, 48, 120);
            oeb1.c(fidVar, ljs0.e(c530Var, 8.0f));
            hq91.a(ohb1.e(fidVar, this.b), ljs0.c(c530Var, 1.0f), null, DsHeading$Size.Xs, DsHeading$Align.Center, 0L, 0, 0L, 0, 0, null, fidVar, 28080, 0, 2016);
            oeb1.c(fidVar, ljs0.e(c530Var, 32.0f));
            int i = oyh0.neophonish_upgrade_dialog_button;
            DsButton$Style dsButton$Style = DsButton$Style.Brand;
            mgv mgvVar = kx91.a;
            if (mgvVar == null) {
                lgv lgvVar = new lgv("YaIdOutlineMd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e = nnm.e(12.0f, 2.0f);
                e.d(19.995f, 2.0f, 22.0f, 4.033f, 22.0f, 12.0f);
                e.d(22.0f, 19.967f, 19.995f, 22.0f, 12.0f, 22.0f);
                e.d(4.005f, 22.0f, 2.0f, 20.009f, 2.0f, 12.0f);
                e.d(2.0f, 3.991f, 4.005f, 2.0f, 12.0f, 2.0f);
                e.c();
                e.j(12.0f, 4.0f);
                e.d(7.987f, 4.0f, 6.279f, 4.549f, 5.415f, 5.412f);
                e.d(4.551f, 6.275f, 4.0f, 7.982f, 4.0f, 12.0f);
                e.d(4.0f, 16.018f, 4.551f, 17.725f, 5.415f, 18.588f);
                e.d(6.279f, 19.451f, 7.987f, 20.0f, 12.0f, 20.0f);
                e.d(16.006f, 20.0f, 17.716f, 19.443f, 18.582f, 18.575f);
                e.d(19.449f, 17.706f, 20.0f, 15.994f, 20.0f, 12.0f);
                e.d(20.0f, 8.006f, 19.449f, 6.294f, 18.582f, 5.425f);
                e.d(17.716f, 4.557f, 16.006f, 4.0f, 12.0f, 4.0f);
                e.c();
                e.j(11.971f, 7.021f);
                e.d(12.507f, 7.005f, 13.163f, 7.014f, 13.775f, 7.064f);
                e.d(14.345f, 7.112f, 15.02f, 7.204f, 15.5f, 7.424f);
                e.d(15.858f, 7.588f, 16.521f, 7.916f, 17.073f, 8.657f);
                e.d(17.63f, 9.404f, 18.0f, 10.465f, 18.0f, 11.968f);
                e.d(18.0f, 13.471f, 17.628f, 14.517f, 17.063f, 15.251f);
                e.d(16.508f, 15.97f, 15.836f, 16.288f, 15.549f, 16.438f);
                e.d(15.089f, 16.68f, 14.44f, 16.827f, 13.847f, 16.912f);
                e.d(13.227f, 17.001f, 12.537f, 17.038f, 11.933f, 16.997f);
                e.h(11.0f, 16.934f);
                e.o(7.049f);
                e.h(11.971f, 7.021f);
                e.c();
                e.j(9.5f, 17.0f);
                e.f(7.5f);
                e.o(7.0f);
                e.f(9.5f);
                e.o(17.0f);
                e.c();
                e.j(13.0f, 14.99f);
                e.d(13.188f, 14.976f, 13.379f, 14.959f, 13.564f, 14.933f);
                e.d(14.099f, 14.856f, 14.47f, 14.745f, 14.619f, 14.667f);
                e.d(14.941f, 14.498f, 15.227f, 14.357f, 15.479f, 14.03f);
                e.d(15.719f, 13.719f, 16.0f, 13.131f, 16.0f, 11.968f);
                e.d(16.0f, 10.803f, 15.718f, 10.186f, 15.47f, 9.853f);
                e.d(15.217f, 9.514f, 14.921f, 9.359f, 14.668f, 9.243f);
                e.d(14.537f, 9.183f, 14.177f, 9.104f, 13.61f, 9.058f);
                e.d(13.412f, 9.041f, 13.206f, 9.03f, 13.0f, 9.023f);
                e.o(14.99f);
                e.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                mgvVar = lgvVar.d();
                kx91.a = mgvVar;
            }
            com.yandex.messaging.ui.neophonish.b.a(i, this.c, dsButton$Style, new zom(7, ba91.c(mgvVar, fidVar)), fidVar, 4480, 0);
            btsVar2.e0(1237480211);
            sls slsVar2 = this.w;
            if (slsVar2 == null) {
                f = 8.0f;
            } else {
                f = 8.0f;
                oeb1.c(fidVar, ljs0.e(c530Var, 8.0f));
                com.yandex.messaging.ui.neophonish.b.a(oyh0.neophonish_upgrade_dialog_cancel, slsVar2, DsButton$Style.Neutral, null, fidVar, 384, 8);
            }
            btsVar2.t(false);
            oeb1.c(fidVar, ljs0.e(c530Var, f));
            btsVar2.t(true);
        }
        return zy11.a;
    }
}
