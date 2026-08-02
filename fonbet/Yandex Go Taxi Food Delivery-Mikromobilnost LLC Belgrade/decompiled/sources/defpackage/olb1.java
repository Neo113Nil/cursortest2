package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;
import com.yx360.design.compose.atoms.DsHeading$Align;
import com.yx360.design.compose.atoms.DsHeading$Size;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class olb1 {
    public static au2 a;

    public static final void a(int i, fid fidVar, sls slsVar, sls slsVar2, f530 f530Var) {
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1523722473);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(slsVar2) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            sic a2 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            uic uicVar = uic.a;
            c530 c530Var = c530.a;
            oeb1.c(btsVar, uicVar.b(c530Var, 1.0f, true));
            pa90 m = mt71.m(wwg0.msg_img_migration_team, 0, btsVar);
            qnm qnmVar = qnm.a;
            qnm.d.getClass();
            o4b1.b(m, null, an91.m(c530Var, 16.0f, 0.0f, 2), null, null, 0.0f, null, btsVar, 48, 120);
            hq91.a(ohb1.e(btsVar, oyh0.migration_team_title), an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 32.0f, 0.0f, 0.0f, 13), null, DsHeading$Size.Sm, DsHeading$Align.Center, 0L, 0, 0L, 0, 0, null, btsVar, 27648, 0, 2020);
            vqy0.c(ohb1.e(btsVar, oyh0.migration_team_description), an91.l(ljs0.c(c530Var, 1.0f), 16.0f, 8.0f), qnm.c(btsVar).g0(), uh6.E(16), null, 0L, new sjy0(3), 0L, 0, false, 0, 0, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 261096);
            btsVar = btsVar;
            oeb1.c(btsVar, uicVar.b(c530Var, 0.4f, true));
            String e = ohb1.e(btsVar, oyh0.google_play_download_telemost);
            DsButton$Style dsButton$Style = DsButton$Style.Neutral;
            DsButton$Size dsButton$Size = DsButton$Size.Lg;
            mgv mgvVar = mya1.a;
            if (mgvVar != null) {
                j = 4278190080L;
            } else {
                lgv lgvVar = new lgv("GooglePlaySolidMd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 g = tse0.g(12.43f, 12.792f, 16.413f, 15.88f);
                j = 4278190080L;
                g.h(5.285f, 21.813f);
                g.d(4.255f, 22.363f, 3.0f, 21.632f, 3.0f, 20.483f);
                g.o(20.102f);
                g.h(12.43f, 12.792f);
                g.c();
                g.j(3.0f, 5.48f);
                g.h(11.408f, 12.0f);
                g.h(3.0f, 18.518f);
                g.o(5.48f);
                g.c();
                g.j(17.623f, 8.766f);
                g.h(21.193f, 10.669f);
                g.d(22.269f, 11.243f, 22.269f, 12.757f, 21.193f, 13.331f);
                g.h(17.623f, 15.234f);
                tse0.u(g, 13.451f, 12.0f, 17.623f, 8.766f);
                g.j(3.0f, 3.516f);
                g.d(3.0f, 2.368f, 4.255f, 1.637f, 5.285f, 2.186f);
                g.h(16.412f, 8.12f);
                g.h(12.43f, 11.208f);
                g.h(3.0f, 3.896f);
                g.o(3.516f);
                g.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", g.a);
                mgvVar = lgvVar.d();
                mya1.a = mgvVar;
            }
            mo91.f(e, slsVar2, dsButton$Style, an91.l(c530Var, 16.0f, 8.0f), dsButton$Size, ba91.c(mgvVar, btsVar), false, btsVar, ((i2 >> 3) & 112) | 287104, 1984);
            oeb1.c(btsVar, uicVar.b(c530Var, 0.6f, true));
            String e2 = ohb1.e(btsVar, oyh0.migration_team_button);
            DsButton$Style dsButton$Style2 = DsButton$Style.Brand;
            mgv mgvVar2 = xcb1.a;
            if (mgvVar2 == null) {
                lgv lgvVar2 = new lgv("SignInOutlineMd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var2 = new a6t0(rzo.f(j));
                uq90 e3 = nnm.e(15.0f, 2.0f);
                e3.d(16.864f, 2.0f, 17.795f, 2.0f, 18.53f, 2.305f);
                e3.d(19.51f, 2.711f, 20.289f, 3.49f, 20.695f, 4.47f);
                e3.d(21.0f, 5.205f, 21.0f, 6.136f, 21.0f, 8.0f);
                e3.o(16.0f);
                e3.d(21.0f, 17.864f, 21.0f, 18.795f, 20.695f, 19.53f);
                e3.d(20.289f, 20.51f, 19.51f, 21.289f, 18.53f, 21.695f);
                e3.d(17.795f, 22.0f, 16.864f, 22.0f, 15.0f, 22.0f);
                e3.f(10.0f);
                e3.o(20.0f);
                e3.f(15.0f);
                e3.d(15.959f, 20.0f, 16.579f, 19.999f, 17.053f, 19.967f);
                e3.d(17.509f, 19.936f, 17.682f, 19.882f, 17.766f, 19.848f);
                e3.d(18.256f, 19.645f, 18.645f, 19.256f, 18.848f, 18.766f);
                e3.d(18.882f, 18.682f, 18.936f, 18.509f, 18.967f, 18.053f);
                e3.d(18.999f, 17.579f, 19.0f, 16.959f, 19.0f, 16.0f);
                e3.o(8.0f);
                e3.d(19.0f, 7.041f, 18.999f, 6.421f, 18.967f, 5.947f);
                e3.d(18.936f, 5.491f, 18.882f, 5.318f, 18.848f, 5.234f);
                e3.d(18.645f, 4.745f, 18.256f, 4.355f, 17.766f, 4.152f);
                e3.d(17.682f, 4.118f, 17.509f, 4.064f, 17.053f, 4.033f);
                e3.d(16.579f, 4.001f, 15.959f, 4.0f, 15.0f, 4.0f);
                e3.f(10.0f);
                e3.o(2.0f);
                e3.f(15.0f);
                e3.c();
                e3.j(15.03f, 12.0f);
                e3.h(10.323f, 16.707f);
                e3.h(8.909f, 15.293f);
                e3.h(11.202f, 13.0f);
                e3.f(2.0f);
                e3.o(11.0f);
                e3.f(11.202f);
                e3.h(8.909f, 8.707f);
                tse0.u(e3, 10.323f, 7.293f, 15.03f, 12.0f);
                lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", e3.a);
                mgvVar2 = lgvVar2.d();
                xcb1.a = mgvVar2;
            }
            mo91.f(e2, slsVar, dsButton$Style2, an91.l(ljs0.c(c530Var, 1.0f), 16.0f, 8.0f), dsButton$Size, ba91.c(mgvVar2, btsVar), false, btsVar, (i2 & 112) | 287104, 1984);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zm1(f530Var, slsVar, slsVar2, i, 3);
        }
    }

    public static void b(hoy0 hoy0Var, tly0 tly0Var, dry0 dry0Var, rzx rzxVar, xpy0 xpy0Var, boolean z, iv60 iv60Var) {
        long a2;
        zii0 zii0Var;
        if (z) {
            int r = iv60Var.r(asy0.e(hoy0Var.b));
            String str = pmy0.a;
            if (r < dry0Var.a.a.b.length()) {
                zii0Var = dry0Var.b(r);
            } else if (r != 0) {
                zii0Var = dry0Var.b(r - 1);
            } else {
                a2 = pmy0.a(tly0Var.b, tly0Var.g, tly0Var.h, pmy0.a, 1);
                zii0Var = new zii0(0.0f, 0.0f, 1.0f, (int) (a2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            float f = zii0Var.b;
            float f2 = zii0Var.a;
            long v = rzxVar.v((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            float intBitsToFloat = Float.intBitsToFloat((int) (v >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (v & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f3 = zii0Var.c - f2;
            float f4 = zii0Var.d - f;
            zii0 b = wwg.b(floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            if (jl40.l((xpy0) xpy0Var.a.b.get(), xpy0Var)) {
                xpy0Var.b.f(b);
            }
        }
    }
}
