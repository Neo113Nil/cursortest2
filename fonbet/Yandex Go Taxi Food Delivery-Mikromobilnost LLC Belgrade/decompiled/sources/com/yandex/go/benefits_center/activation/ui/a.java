package com.yandex.go.benefits_center.activation.ui;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.a91;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b0;
import defpackage.bj0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cms;
import defpackage.d17;
import defpackage.did;
import defpackage.dr5;
import defpackage.em5;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fhy;
import defpackage.fid;
import defpackage.fj91;
import defpackage.fm5;
import defpackage.ghy;
import defpackage.h3d;
import defpackage.heb1;
import defpackage.hk91;
import defpackage.i6b1;
import defpackage.jeb1;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ljs0;
import defpackage.lkx;
import defpackage.lr20;
import defpackage.n;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.qk30;
import defpackage.qm5;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(f530 f530Var, qm5 qm5Var, String str, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        String str2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-395205736);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(qm5Var) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024) | (btsVar.e(tlsVar2) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            boolean z2 = qm5Var.e.length() > 0 && jl40.l(qm5Var.e, str);
            jeb1.f(qm5Var.a, null, qm5Var.c ? AppColor$Palette.Error : AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 0, 0, 16378);
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, 28.0f));
            f530 m = an91.m(fj91.d(i6b1.b(c530Var), IntrinsicSize.Min), 16.0f, 0.0f, 2);
            int i3 = 0;
            lkx lkxVar = new lkx(i3, i3, i3, 119);
            fhy fhyVar = ghy.b;
            ety0 ety0Var = xya1.e(btsVar).d.d;
            AppColor$Palette appColor$Palette = z2 ? AppColor$Palette.Error : AppColor$Palette.Text;
            String e = ohb1.e(btsVar, kyh0.benefits_center_promo_input_hint);
            h3d.a.getClass();
            int i4 = i2 >> 6;
            boolean z3 = false;
            heb1.b(str, tlsVar, m, false, ety0Var, appColor$Palette, null, null, e, null, null, null, null, null, null, false, hk91.b, 0.0f, fhyVar, null, lkxVar, null, true, 0, 0, null, null, null, h3d.d, null, h3d.e, btsVar, (i4 & 14) | 384 | (i4 & 112), 0, 805309488, 48, 1599471000, 0);
            str2 = str;
            btsVar = btsVar;
            f530 k = an91.k(n.e(c530Var, 16.0f, btsVar, c530Var, 1.0f), 8.0f);
            boolean z4 = (str2.length() <= 0 || z2 || qm5Var.f) ? false : true;
            boolean z5 = (i2 & HProv.ALG_CLASS_ALL) == 16384;
            if ((i2 & 896) == 256) {
                z3 = true;
            }
            boolean z6 = z5 | z3;
            Object Q = btsVar.Q();
            if (z6 || Q == did.a) {
                z = true;
                Q = new a91(tlsVar2, str2, 1);
                btsVar.o0(Q);
            } else {
                z = true;
            }
            d17.d(k, z4, null, null, null, (sls) Q, wwg.S(610921627, z, new bj0(15, qm5Var), btsVar), btsVar, 1572870, 28);
            btsVar.t(z);
        } else {
            str2 = str;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) f530Var, (Object) qm5Var, (Object) str2, tlsVar, (cms) tlsVar2, i, 3);
        }
    }

    public static final void b(qm5 qm5Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1685500963);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(qm5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.j(qm5Var.b);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            oz40 n = f.n((String) oz40Var.getValue(), btsVar);
            int i4 = i2 & 112;
            boolean k = (i4 == 32) | btsVar.k(n);
            Object Q3 = btsVar.Q();
            if (k || Q3 == obj) {
                Q3 = new BenefitActivationScreenKt$ActivationModalBottomSheet$1$1(tlsVar, n, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, zy11.a);
            Boolean valueOf = Boolean.valueOf(qm5Var.c);
            boolean z = (i2 & 14) == 4;
            Object Q4 = btsVar.Q();
            if (z || Q4 == obj) {
                Q4 = new BenefitActivationScreenKt$ActivationModalBottomSheet$2$1(qm5Var, oz40Var2, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, valueOf);
            boolean k2 = (i4 == 32) | btsVar.k(n);
            Object Q5 = btsVar.Q();
            if (k2 || Q5 == obj) {
                Q5 = new fm5(tlsVar, n, oz40Var2, 0);
                btsVar.o0(Q5);
            }
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, (sls) Q5, btsVar, 0, 0, 4095);
            androidx.compose.runtime.internal.a S = wwg.S(-193896335, true, new qk30(tlsVar, oz40Var2, oz40Var, 7), btsVar);
            h3d.a.getClass();
            i3 = 1;
            c.a(null, a, null, false, false, null, null, S, null, h3d.b, h3d.c, wwg.S(-1775144061, true, new dr5(tlsVar, qm5Var, oz40Var, oz40Var2, 3), btsVar), btsVar, 817889280, 54, 381);
            btsVar = btsVar;
        } else {
            i3 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new em5(qm5Var, tlsVar, i, i3);
        }
    }

    public static final void c(qm5 qm5Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1411001821);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(qm5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new BenefitActivationScreenKt$BenefitActivationScreen$1$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            b(qm5Var, tlsVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new em5(qm5Var, tlsVar, i, 0);
        }
    }
}
