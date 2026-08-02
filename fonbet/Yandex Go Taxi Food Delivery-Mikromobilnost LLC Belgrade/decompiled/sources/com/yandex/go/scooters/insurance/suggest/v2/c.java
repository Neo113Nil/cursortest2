package com.yandex.go.scooters.insurance.suggest.v2;

import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.n2b1;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oip0;
import defpackage.pi6;
import defpackage.pw91;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.sun0;
import defpackage.tls;
import defpackage.vfc;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class c implements zls {
    public final /* synthetic */ tls a;
    public final /* synthetic */ sun0 b;

    public c(tls tlsVar, sun0 sun0Var) {
        this.a = tlsVar;
        this.b = sun0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
        dmw0 dmw0Var = btsVar.a;
        zy11 zy11Var = zy11.a;
        if (!V) {
            btsVar.Y();
            return zy11Var;
        }
        z910 d = pi6.d(x4c.b, false);
        int hashCode = Long.hashCode(btsVar.T);
        r1b0 o = btsVar.o();
        c530 c530Var = c530.a;
        f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
        ohd.G1.getClass();
        sls slsVar = androidx.compose.ui.node.d.b;
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
        wls wlsVar = androidx.compose.ui.node.d.f;
        qje.W(btsVar, wlsVar, d);
        wls wlsVar2 = androidx.compose.ui.node.d.e;
        qje.W(btsVar, wlsVar2, o);
        Integer valueOf = Integer.valueOf(hashCode);
        wls wlsVar3 = androidx.compose.ui.node.d.g;
        qje.W(btsVar, wlsVar3, valueOf);
        tls tlsVar = androidx.compose.ui.node.d.h;
        qje.M(btsVar, tlsVar);
        wls wlsVar4 = androidx.compose.ui.node.d.d;
        qje.W(btsVar, wlsVar4, d2);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = androidx.compose.runtime.f.g(0);
            btsVar.o0(Q);
        }
        yx40 yx40Var = (yx40) Q;
        oip0 o2 = pw91.o(btsVar);
        f530 o3 = an91.o(an91.o(pw91.u(c530Var, o2, 14), 16.0f, 8.0f, 16.0f, 0.0f, 8), 0.0f, 0.0f, 0.0f, ((fwi) btsVar.m(j.h)).H(yx40Var.getIntValue()), 7);
        sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
        int hashCode2 = Long.hashCode(btsVar.T);
        r1b0 o4 = btsVar.o();
        f530 d3 = androidx.compose.ui.b.d(btsVar, o3);
        btsVar.i0();
        if (btsVar.S) {
            btsVar.n(slsVar);
        } else {
            btsVar.r0();
        }
        qje.W(btsVar, wlsVar, a);
        qje.W(btsVar, wlsVar2, o4);
        vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
        qje.W(btsVar, wlsVar4, d3);
        sun0 sun0Var = this.b;
        n2b1.i(sun0Var, btsVar, 0);
        oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
        qgy.b(sun0Var.c, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, 0, 0, 12286);
        bts btsVar2 = btsVar;
        if (sun0Var.d.length() > 0) {
            btsVar2.e0(1645081093);
            qgy.b(sun0Var.d, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).g.b, null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
            btsVar2 = btsVar2;
            i = 0;
            btsVar2.t(false);
        } else {
            i = 0;
            btsVar2.e0(1645198335);
            btsVar2.t(false);
        }
        tls tlsVar2 = this.a;
        n2b1.c(sun0Var, tlsVar2, btsVar2, i);
        ly3.B(c530Var, 8.0f, btsVar2, true);
        n2b1.a(sun0Var, tlsVar2, yx40Var, o2, btsVar2, 3078);
        btsVar2.t(true);
        tls tlsVar3 = this.a;
        boolean k = btsVar2.k(tlsVar3);
        Object Q2 = btsVar2.Q();
        if (k || Q2 == o430Var) {
            Q2 = new ScootersInsuranceSuggestV2ScreenKt$ScootersInsuranceSuggestV2Screen$1$1$2$1(tlsVar3, null);
            btsVar2.o0(Q2);
        }
        zpn.e(btsVar2, (wls) Q2, zy11Var);
        return zy11Var;
    }
}
