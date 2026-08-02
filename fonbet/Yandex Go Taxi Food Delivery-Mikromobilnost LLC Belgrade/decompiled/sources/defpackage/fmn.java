package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.payments.domain.k;
import com.yandex.go.payments.experiments.g;
import com.yandex.go.payments.order.domain.e;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.payments.superapp.payment.b;
import com.yandex.messaging.input.MessageSelectionActionModeCallback;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.edit.a;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.scooters.domain.r;
import ru.yandex.taxi.summary.requirements.list.interactors.h0;
import ru.yandex.taxi.superapp.orders.multi.tracking.c;

/* loaded from: classes14.dex */
public final class fmn implements v7p {
    public final /* synthetic */ int a = 5;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;

    public fmn(n3w n3wVar, xvf0 xvf0Var, vm80 vm80Var, ze zeVar, njp njpVar, umt0 umt0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, wrh wrhVar, nb11 nb11Var, wrh wrhVar2, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, js0 js0Var, x0z x0zVar, h420 h420Var, xvf0 xvf0Var8) {
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = vm80Var;
        this.e = zeVar;
        this.f = njpVar;
        this.g = umt0Var;
        this.h = xvf0Var2;
        this.i = xvf0Var3;
        this.j = wrhVar;
        this.k = nb11Var;
        this.l = wrhVar2;
        this.m = xvf0Var4;
        this.n = xvf0Var5;
        this.o = xvf0Var6;
        this.p = xvf0Var7;
        this.q = js0Var;
        this.r = x0zVar;
        this.s = h420Var;
        this.t = xvf0Var8;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.l;
        xvf0 xvf0Var2 = this.k;
        xvf0 xvf0Var3 = this.j;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.t;
        xvf0 xvf0Var6 = this.p;
        xvf0 xvf0Var7 = this.s;
        xvf0 xvf0Var8 = this.r;
        xvf0 xvf0Var9 = this.o;
        xvf0 xvf0Var10 = this.n;
        xvf0 xvf0Var11 = this.m;
        xvf0 xvf0Var12 = this.i;
        xvf0 xvf0Var13 = this.h;
        xvf0 xvf0Var14 = this.f;
        xvf0 xvf0Var15 = this.e;
        xvf0 xvf0Var16 = this.d;
        xvf0 xvf0Var17 = this.q;
        xvf0 xvf0Var18 = this.c;
        xvf0 xvf0Var19 = this.b;
        switch (i) {
            case 0:
                return new a((Activity) xvf0Var19.get(), (ChatInputHeightState) xvf0Var18.get(), (wq80) xvf0Var16.get(), (en2) xvf0Var15.get(), (noy0) xvf0Var14.get(), (tmt0) xvf0Var4.get(), (q0w) xvf0Var13.get(), (SharedPreferences) xvf0Var12.get(), this.j, (pu31) xvf0Var2.get(), (nmn) xvf0Var.get(), (xav) xvf0Var11.get(), (com.yandex.messaging.internal.view.chat.input.a) xvf0Var10.get(), (x22) xvf0Var9.get(), (x4k0) xvf0Var6.get(), (e3c) xvf0Var17.get(), (MessageSelectionActionModeCallback) xvf0Var8.get(), (lqo) xvf0Var7.get(), (com.yandex.messaging.formatting.a) xvf0Var5.get());
            case 1:
                return new yy70((Context) xvf0Var19.get(), (ah00) xvf0Var18.get(), (ry70) xvf0Var16.get(), (c) xvf0Var15.get(), (bz70) xvf0Var14.get(), (ktp0) xvf0Var4.get(), (cz70) xvf0Var13.get(), (bx70) ((n3w) xvf0Var2).a, (mly) ((wvq) xvf0Var).get(), (h760) ((zyf) xvf0Var11).get(), (y980) ((t4g) xvf0Var10).get(), (f09) ((zyf) xvf0Var9).get(), (hf2) ((zyf) xvf0Var6).get(), (x6o0) ((t4g) xvf0Var17).get(), (h080) xvf0Var12.get(), (com.yandex.go.taxi.order.provider.a) xvf0Var3.get(), (zyf) xvf0Var8, (oep0) ((t4g) xvf0Var7).get(), (com.yandex.go.delivery.tracking.map_overlay.a) ((zyf) xvf0Var5).get());
            case 2:
                return new e((tse) xvf0Var19.get(), (com.yandex.go.taxi.order.repositories.c) xvf0Var18.get(), (k) xvf0Var16.get(), (i) xvf0Var15.get(), (lov) xvf0Var14.get(), this.g, (com.yandex.go.payments.order.domain.a) xvf0Var13.get(), (vj4) xvf0Var12.get(), (f9y0) xvf0Var3.get(), this.k, this.l, (nov) ((n3w) xvf0Var5).a, (xhq0) xvf0Var11.get(), (com.yandex.go.payments.common.a) xvf0Var10.get(), (g) xvf0Var9.get(), (b) xvf0Var6.get(), (po21) xvf0Var17.get(), (raa0) xvf0Var8.get(), (hga0) xvf0Var7.get());
            case 3:
                return new com.yandex.go.taxi.order.map.overlay.recenter.b((tse) xvf0Var19.get(), (ah00) xvf0Var18.get(), (o2y0) xvf0Var16.get(), (y980) xvf0Var15.get(), (wt1) xvf0Var14.get(), (i641) xvf0Var4.get(), (gjm) xvf0Var13.get(), (he61) xvf0Var12.get(), (hgi0) xvf0Var3.get(), (dgi0) xvf0Var2.get(), (mvd0) xvf0Var.get(), (zch) ((faj) xvf0Var9).get(), (igi0) xvf0Var11.get(), (nz2) xvf0Var10.get(), (h0w) ((ze) xvf0Var6).get(), (ljf) ((zfa) xvf0Var17).get(), (xjg) ((fwc) xvf0Var8).get(), (o8g0) ((upk0) xvf0Var7).get(), (el00) ((u4g) xvf0Var5).get());
            case 4:
                return new com.yandex.go.summary.interactor.expanded.action.c((h0) xvf0Var19.get(), (s421) ((n00) xvf0Var6).get(), (w3i) ((bo2) xvf0Var17).get(), (uio0) ((uw11) xvf0Var8).get(), (c4r0) xvf0Var18.get(), (b8r) xvf0Var16.get(), (maj0) xvf0Var15.get(), (caj0) xvf0Var14.get(), (wiq0) ((w0g) xvf0Var7).get(), (lci) xvf0Var4.get(), (oci) xvf0Var13.get(), (wt90) xvf0Var12.get(), (gde) xvf0Var3.get(), (d) xvf0Var2.get(), (ngi) xvf0Var.get(), (o3i) xvf0Var11.get(), (pj) ((rwh) xvf0Var5).get(), (czi0) xvf0Var10.get(), (gmi) xvf0Var9.get());
            default:
                Context context = (Context) xvf0Var18.get();
                tt2 tt2Var = (tt2) ((e7g) xvf0Var17).get();
                tse tseVar = (tse) xvf0Var16.get();
                com.yandex.go.scooters.misc.web.a aVar = (com.yandex.go.scooters.misc.web.a) xvf0Var14.get();
                com.yandex.go.scooters.payments.navigation.a aVar2 = (com.yandex.go.scooters.payments.navigation.a) xvf0Var13.get();
                po21 po21Var = (po21) xvf0Var12.get();
                bia0 bia0Var = (bia0) xvf0Var3.get();
                yfo0 yfo0Var = (yfo0) xvf0Var2.get();
                kkn0 kkn0Var = (kkn0) xvf0Var.get();
                r rVar = (r) xvf0Var10.get();
                return new bdo0(context, tt2Var, tseVar, aVar, aVar2, po21Var, bia0Var, yfo0Var, kkn0Var, rVar, (v0n0) ((rx4) xvf0Var8).get(), (com.yandex.go.scooters.passes.domain.i) ((wun0) xvf0Var7).get(), (com.yandex.go.scooters.payments.domain.a) xvf0Var6.get(), (com.yandex.go.scooters.passes.domain.g) ((mbo0) xvf0Var5).get());
        }
    }

    public fmn(xvf0 xvf0Var, xvf0 xvf0Var2, js0 js0Var, c7c0 c7c0Var, n3w n3wVar, tc tcVar, f9t f9tVar, sx2 sx2Var, n3w n3wVar2, xvf0 xvf0Var3, rqt rqtVar, n3w n3wVar3, xvf0 xvf0Var4, jc60 jc60Var, ec80 ec80Var, le30 le30Var, eqh eqhVar, ec80 ec80Var2, xvf0 xvf0Var5) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = js0Var;
        this.e = c7c0Var;
        this.f = n3wVar;
        this.g = tcVar;
        this.h = f9tVar;
        this.i = sx2Var;
        this.j = n3wVar2;
        this.k = xvf0Var3;
        this.l = rqtVar;
        this.t = n3wVar3;
        this.m = xvf0Var4;
        this.n = jc60Var;
        this.o = ec80Var;
        this.p = le30Var;
        this.q = eqhVar;
        this.r = ec80Var2;
        this.s = xvf0Var5;
    }

    public fmn(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, n3w n3wVar, wvq wvqVar, zyf zyfVar, t4g t4gVar, zyf zyfVar2, zyf zyfVar3, t4g t4gVar2, xvf0 xvf0Var8, xvf0 xvf0Var9, zyf zyfVar4, t4g t4gVar3, zyf zyfVar5) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.k = n3wVar;
        this.l = wvqVar;
        this.m = zyfVar;
        this.n = t4gVar;
        this.o = zyfVar2;
        this.p = zyfVar3;
        this.q = t4gVar2;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.r = zyfVar4;
        this.s = t4gVar3;
        this.t = zyfVar5;
    }

    public fmn(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, faj fajVar, xvf0 xvf0Var12, xvf0 xvf0Var13, ze zeVar, zfa zfaVar, fwc fwcVar, upk0 upk0Var, u4g u4gVar) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.o = fajVar;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.p = zeVar;
        this.q = zfaVar;
        this.r = fwcVar;
        this.s = upk0Var;
        this.t = u4gVar;
    }

    public fmn(xvf0 xvf0Var, n00 n00Var, bo2 bo2Var, uw11 uw11Var, a1g a1gVar, u0g u0gVar, z0g z0gVar, n7i0 n7i0Var, w0g w0gVar, u0g u0gVar2, u0g u0gVar3, nwf nwfVar, miv0 miv0Var, z0g z0gVar2, rwh rwhVar, s0g s0gVar, rwh rwhVar2, nwf nwfVar2, wif wifVar) {
        this.b = xvf0Var;
        this.p = n00Var;
        this.q = bo2Var;
        this.r = uw11Var;
        this.c = a1gVar;
        this.d = u0gVar;
        this.e = z0gVar;
        this.f = n7i0Var;
        this.s = w0gVar;
        this.g = u0gVar2;
        this.h = u0gVar3;
        this.i = nwfVar;
        this.j = miv0Var;
        this.k = z0gVar2;
        this.l = rwhVar;
        this.m = s0gVar;
        this.t = rwhVar2;
        this.n = nwfVar2;
        this.o = wifVar;
    }

    public fmn(j7g j7gVar, e7g e7gVar, e7g e7gVar2, j7g j7gVar2, mbo0 mbo0Var, gzn0 gzn0Var, k7g k7gVar, n7g n7gVar, n7g n7gVar2, k7g k7gVar2, z8n0 z8n0Var, m7g m7gVar, j7g j7gVar3, n7g n7gVar3, l7g l7gVar, rx4 rx4Var, wun0 wun0Var, l7g l7gVar2, mbo0 mbo0Var2) {
        this.b = j7gVar;
        this.c = e7gVar;
        this.q = e7gVar2;
        this.d = j7gVar2;
        this.e = mbo0Var;
        this.f = gzn0Var;
        this.g = k7gVar;
        this.h = n7gVar;
        this.i = n7gVar2;
        this.j = k7gVar2;
        this.k = z8n0Var;
        this.l = m7gVar;
        this.m = j7gVar3;
        this.n = n7gVar3;
        this.o = l7gVar;
        this.r = rx4Var;
        this.s = wun0Var;
        this.p = l7gVar2;
        this.t = mbo0Var2;
    }
}
