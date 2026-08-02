package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import com.yandex.go.agreement.domain.b;
import com.yandex.go.agreement.router.d;
import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.domain.p0;
import com.yandex.go.payments.domain.v;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.payments.yape.navigation.c;
import ru.yandex.taxi.analytics.g;
import ru.yandex.taxi.layers.domain.u;
import ru.yandex.taxi.layers.source.o;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.logistics.sdk.management.localstate.e;
import ru.yandex.taxi.logistics.sdk.management.storage.f;
import ru.yandex.taxi.sdc.a;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.startup.launch.j;

/* loaded from: classes8.dex */
public final class jk0 implements v7p {
    public final /* synthetic */ int a;
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

    public jk0(xvf0 xvf0Var, xvf0 xvf0Var2, awp0 awp0Var, n3w n3wVar, xvf0 xvf0Var3, wjr0 wjr0Var, jc60 jc60Var, tj70 tj70Var, bt2 bt2Var, qzb qzbVar, kxl0 kxl0Var) {
        this.a = 8;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = awp0Var;
        this.e = n3wVar;
        this.f = xvf0Var3;
        this.j = wjr0Var;
        this.g = jc60Var;
        this.h = tj70Var;
        this.i = bt2Var;
        this.k = qzbVar;
        this.l = kxl0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.j;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.k;
        xvf0 xvf0Var7 = this.f;
        xvf0 xvf0Var8 = this.b;
        xvf0 xvf0Var9 = this.l;
        xvf0 xvf0Var10 = this.d;
        xvf0 xvf0Var11 = this.c;
        switch (i) {
            case 0:
                return new c((y50) xvf0Var8.get(), (zuj0) xvf0Var11.get(), (po21) xvf0Var10.get(), (gf41) xvf0Var5.get(), this.f, (i) xvf0Var4.get(), (g9a0) xvf0Var3.get(), (wi0) xvf0Var2.get(), (BindUniversalPaymentMethodApi) xvf0Var.get(), (raa0) xvf0Var6.get(), (hg0) ((n3w) xvf0Var9).a);
            case 1:
                return new d((tse) xvf0Var8.get(), i5m.a(xvf0Var11), (bae0) xvf0Var10.get(), (b) xvf0Var5.get(), (a) xvf0Var7.get(), this.g, this.h, this.i, this.j, (tc) xvf0Var9, this.k);
            case 2:
                return new g((h) xvf0Var8.get(), i5m.a(xvf0Var11), i5m.a(xvf0Var10), (x2p) xvf0Var5.get(), (dqe0) xvf0Var7.get(), i5m.a(xvf0Var4), (k42) xvf0Var3.get(), (rqd0) xvf0Var2.get(), (o22) xvf0Var.get(), (wnt) xvf0Var6.get(), (w9w0) ((kxl0) xvf0Var9).get());
            case 3:
                return new duh((nth) xvf0Var8.get(), (st2) xvf0Var11.get(), (hwh) xvf0Var10.get(), (ru.yandex.taxi.logistics.sdk.management.storage.b) ((xv2) xvf0Var).get(), (f) ((jqz0) xvf0Var6).get(), (aci) xvf0Var5.get(), (lsi) xvf0Var7.get(), (ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d) xvf0Var4.get(), (e) xvf0Var3.get(), (jwh) xvf0Var2.get(), (gp50) ((w8g) xvf0Var9).get());
            case 4:
                return new gai((Context) xvf0Var8.get(), (w030) xvf0Var11.get(), (zu8) xvf0Var10.get(), (zuj0) xvf0Var5.get(), (fif) xvf0Var7.get(), (hwe0) xvf0Var4.get(), (c4r0) xvf0Var3.get(), (k) ((qii) xvf0Var9).get(), (wiq0) xvf0Var2.get(), this.j, (dyh) xvf0Var6.get());
            case 5:
                Activity activity = (Activity) xvf0Var8.get();
                pav pavVar = (pav) xvf0Var11.get();
                ah00 ah00Var = (ah00) xvf0Var10.get();
                k7x0 k7x0Var = (k7x0) xvf0Var5.get();
                a3v a3vVar = (a3v) xvf0Var7.get();
                ney neyVar = (ney) xvf0Var4.get();
                return new msj(activity, pavVar, ah00Var, k7x0Var, a3vVar, neyVar, (jyx) xvf0Var2.get(), (ru.yandex.taxi.multiorder.e) xvf0Var.get(), (wwj) xvf0Var6.get(), (ywj) ((lyh) xvf0Var9).get());
            case 6:
                return new j((kb20) xvf0Var8.get(), (WifiManager) xvf0Var11.get(), (oxn) xvf0Var10.get(), (y810) xvf0Var5.get(), (im51) xvf0Var7.get(), (e3g0) xvf0Var4.get(), (com.yandex.go.superapp.orders.known.b) xvf0Var3.get(), (g5g0) xvf0Var2.get(), (ecr) xvf0Var.get(), (po21) xvf0Var6.get(), (com.yandex.go.ads.prefetch.impl.a) ((aj0) xvf0Var9).get());
            case 7:
                return new gn10(i5m.a(xvf0Var8), i5m.a(xvf0Var11), (as21) xvf0Var10.get(), i5m.a((jv21) xvf0Var9), i5m.a(xvf0Var5), (ru.yandex.taxi.settings.email.a) xvf0Var7.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var3), i5m.a(xvf0Var2), (com.yandex.go.drive.sdkintegration.domain.session.e) xvf0Var.get(), (zuj0) xvf0Var6.get());
            case 8:
                return new v((zuj0) xvf0Var8.get(), (fga0) xvf0Var11.get(), (xku0) xvf0Var10.get(), (Context) xvf0Var5.get(), (eq51) xvf0Var7.get(), (ahv0) ((wjr0) xvf0Var).get(), (u0a0) xvf0Var4.get(), (tma0) xvf0Var3.get(), (drd) xvf0Var2.get(), (vit) ((qzb) xvf0Var6).get(), (p0) ((kxl0) xvf0Var9).get());
            case 9:
                return new com.yandex.go.places.impl.navigation.summary.a((y9y0) xvf0Var8.get(), (ru.yandex.taxi.masstransit.deeplink.g) xvf0Var11.get(), (oep0) xvf0Var10.get(), this.e, (dqe0) xvf0Var7.get(), (kpi0) xvf0Var4.get(), (paq0) xvf0Var3.get(), (lgv0) ((dk) xvf0Var9).get(), (icv0) xvf0Var2.get(), (com.yandex.go.taxi.tariffs.interactor.b) xvf0Var.get(), (ck31) xvf0Var6.get());
            case 10:
                return new u((com.yandex.go.lifecycle.a) ((m2g) xvf0Var10).get(), (e2t) ((m2g) xvf0Var5).get(), (oo2) ((ove) xvf0Var7).get(), (cyx) ((m2g) xvf0Var4).get(), (ru.yandex.taxi.layers.source.requesttrigger.g) ((gd) xvf0Var3).get(), (com.yandex.go.navigation.screen.c) ((m2g) xvf0Var2).get(), (tt2) ((m2g) xvf0Var).get(), (ru.yandex.taxi.layers.source.factory.e) ((xyd0) xvf0Var6).get(), (o) xvf0Var8.get(), (e5e0) xvf0Var11.get(), (e5d0) ((n2g) xvf0Var9).get());
            case 11:
                return new com.yandex.go.payments.porttech.navigation.d((tt2) xvf0Var8.get(), (zuj0) xvf0Var11.get(), (gf41) xvf0Var10.get(), this.e, (ace0) ((n3w) xvf0Var9).a, (wi0) xvf0Var7.get(), (rea0) ((jc60) xvf0Var2).get(), (com.yandex.go.payments.porttech.data.a) ((dld0) xvf0Var).get(), (com.yandex.go.payments.superapp.payment.b) xvf0Var4.get(), (aq80) ((xyd0) xvf0Var6).get(), (Context) xvf0Var3.get());
            case 12:
                return new com.yandex.go.preorder.tariffs.b((com.yandex.go.taxi.tariffs.interactor.h) xvf0Var8.get(), (m60) xvf0Var11.get(), (w3r0) xvf0Var10.get(), (c4r0) xvf0Var5.get(), (jjx0) ((rmv0) xvf0Var6).get(), (t8i) xvf0Var7.get(), (y5i) xvf0Var4.get(), (i2s) ((cer) xvf0Var9).get(), (jaq0) xvf0Var3.get(), (ru.yandex.taxi.orderforanother.repository.a) xvf0Var2.get(), (com.yandex.go.taxi.tariffs.repository.g) xvf0Var.get());
            case 13:
                return new com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c(i5m.a(xvf0Var8), (ru.yandex.taxi.am.g) xvf0Var11.get(), (tt2) xvf0Var10.get(), (lmf0) xvf0Var5.get(), i5m.a(xvf0Var7), i5m.a(xvf0Var4), i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var), (va90) ((edf0) xvf0Var9).get(), (hit) xvf0Var6.get());
            case 14:
                return new com.yandex.go.due.data.repository.a((on2) xvf0Var8.get(), (tt2) xvf0Var11.get(), (dqe0) xvf0Var10.get(), (com.yandex.go.zone.repository.o) xvf0Var5.get(), (fn21) xvf0Var7.get(), (qbl0) xvf0Var4.get(), (wiq0) xvf0Var3.get(), this.i, (xjg) ((lyh) xvf0Var9).get(), (pp40) xvf0Var.get(), (rqo) xvf0Var6.get());
            case 15:
                return new rrj(this.b, (w030) xvf0Var11.get(), (jj3) xvf0Var10.get(), (bbr0) xvf0Var5.get(), (zbr0) xvf0Var7.get(), this.g, this.h, (oc60) xvf0Var2.get(), this.j, (gbr0) xvf0Var6.get(), (cjm0) ((ji3) xvf0Var9).get());
            case 16:
                return new t300(i5m.a(xvf0Var8), i5m.a(xvf0Var11), (sxr0) xvf0Var10.get(), (pzr0) xvf0Var5.get(), (v3w0) xvf0Var7.get(), (dz70) ((b900) xvf0Var).get(), (zzr0) ((tj70) xvf0Var6).get(), (h1s0) ((e6v0) xvf0Var9).get(), (p1s0) xvf0Var4.get(), (s1s0) xvf0Var3.get(), (com.yandex.go.superapp.tracking.data.e) xvf0Var2.get());
            default:
                return new com.yandex.go.superapp.web.view.a((Context) xvf0Var8.get(), (tse) xvf0Var11.get(), (ru.yandex.taxi.fragment.common.b) xvf0Var10.get(), (o3h) xvf0Var5.get(), (bv41) xvf0Var7.get(), (ru.yandex.taxi.deeplinks.f) xvf0Var4.get(), (j5z) xvf0Var3.get(), (lg21) xvf0Var2.get(), (exu0) xvf0Var.get(), (v7j0) xvf0Var6.get(), (o7w0) ((p7w0) xvf0Var9).get());
        }
    }

    public /* synthetic */ jk0(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar2, v7p v7pVar3, v7p v7pVar4, xvf0 xvf0Var5, v7p v7pVar5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = v7pVar2;
        this.h = v7pVar3;
        this.l = v7pVar4;
        this.i = xvf0Var5;
        this.j = v7pVar5;
        this.k = xvf0Var6;
    }

    public /* synthetic */ jk0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, v7p v7pVar, int i) {
        this.a = i;
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
        this.l = v7pVar;
    }

    public /* synthetic */ jk0(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = v7pVar;
        this.h = v7pVar2;
        this.i = xvf0Var6;
        this.j = xvf0Var7;
        this.l = v7pVar3;
        this.k = xvf0Var8;
    }

    public jk0(swb swbVar, xvf0 xvf0Var, xvf0 xvf0Var2, xv2 xv2Var, jqz0 jqz0Var, xvf0 xvf0Var3, gw7 gw7Var, xvf0 xvf0Var4, xvf0 xvf0Var5, w8g w8gVar, w8g w8gVar2) {
        this.a = 3;
        this.b = swbVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.j = xv2Var;
        this.k = jqz0Var;
        this.e = xvf0Var3;
        this.f = gw7Var;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.i = w8gVar;
        this.l = w8gVar2;
    }

    public jk0(m2g m2gVar, m2g m2gVar2, ove oveVar, m2g m2gVar3, gd gdVar, m2g m2gVar4, m2g m2gVar5, xyd0 xyd0Var, xvf0 xvf0Var, xvf0 xvf0Var2, n2g n2gVar) {
        this.a = 10;
        this.d = m2gVar;
        this.e = m2gVar2;
        this.f = oveVar;
        this.g = m2gVar3;
        this.h = gdVar;
        this.i = m2gVar4;
        this.j = m2gVar5;
        this.k = xyd0Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.l = n2gVar;
    }

    public jk0(eqh eqhVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, dqx0 dqx0Var, lyh lyhVar, s730 s730Var, xvf0 xvf0Var7) {
        this.a = 14;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = dqx0Var;
        this.l = lyhVar;
        this.j = s730Var;
        this.k = xvf0Var7;
    }

    public jk0(xvf0 xvf0Var, xvf0 xvf0Var2, d441 d441Var, aj0 aj0Var, n3w n3wVar, xvf0 xvf0Var3, jc60 jc60Var, dld0 dld0Var, le30 le30Var, xyd0 xyd0Var, xvf0 xvf0Var4) {
        this.a = 11;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = d441Var;
        this.e = aj0Var;
        this.l = n3wVar;
        this.f = xvf0Var3;
        this.i = jc60Var;
        this.j = dld0Var;
        this.g = le30Var;
        this.k = xyd0Var;
        this.h = xvf0Var4;
    }

    public jk0(mwq mwqVar, xvf0 xvf0Var, uwn0 uwn0Var, swo0 swo0Var, rmv0 rmv0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, cer cerVar, kpp0 kpp0Var, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 12;
        this.b = mwqVar;
        this.c = xvf0Var;
        this.d = uwn0Var;
        this.e = swo0Var;
        this.k = rmv0Var;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.l = cerVar;
        this.h = kpp0Var;
        this.i = xvf0Var4;
        this.j = xvf0Var5;
    }

    public jk0(o10 o10Var, xvf0 xvf0Var, xvf0 xvf0Var2, jv21 jv21Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, edf0 edf0Var, eqh eqhVar, xvf0 xvf0Var6, xvf0 xvf0Var7) {
        this.a = 7;
        this.b = o10Var;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.l = jv21Var;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = edf0Var;
        this.i = eqhVar;
        this.j = xvf0Var6;
        this.k = xvf0Var7;
    }

    public jk0(n3w n3wVar, ur3 ur3Var, xvf0 xvf0Var, eqh eqhVar, xvf0 xvf0Var2, b900 b900Var, tj70 tj70Var, e6v0 e6v0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 16;
        this.b = n3wVar;
        this.c = ur3Var;
        this.d = xvf0Var;
        this.e = eqhVar;
        this.f = xvf0Var2;
        this.j = b900Var;
        this.k = tj70Var;
        this.l = e6v0Var;
        this.g = xvf0Var3;
        this.h = xvf0Var4;
        this.i = xvf0Var5;
    }
}
