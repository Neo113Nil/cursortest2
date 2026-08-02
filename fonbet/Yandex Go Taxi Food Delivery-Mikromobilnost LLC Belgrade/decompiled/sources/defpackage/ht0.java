package defpackage;

import android.content.Context;
import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.passes.data.r0;
import com.yandex.go.chargers.passes.payment_settings.d;
import com.yandex.go.chargers.polling.k;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.map_interactions.parkings.h;
import com.yandex.go.pickup_from_photo.domain.i;
import com.yandex.go.summary.interactor.anchored.state.content.l;
import com.yandex.go.summary.interactor.common.action.a;
import com.yandex.go.summary.interactor.common.state.c;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.ybsdk.screens.registration.data.b;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;

/* loaded from: classes12.dex */
public final class ht0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final Object c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public ht0(n3w n3wVar, z9n z9nVar, c0j c0jVar, f9t f9tVar, zbg zbgVar, ybg ybgVar, acg acgVar) {
        this.a = 10;
        this.c = n3wVar;
        this.e = z9nVar;
        this.f = c0jVar;
        this.g = f9tVar;
        this.b = zbgVar;
        this.d = ybgVar;
        this.h = acgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.h;
        xvf0 xvf0Var5 = this.g;
        Object obj = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new gt0((y30) ((k2g) obj).get(), (e) xvf0Var6.get(), (hwy0) ((k2g) xvf0Var2).get(), (dci) ((k2g) xvf0Var).get(), (tgg) xvf0Var3.get(), (wt0) ((l2g) xvf0Var5).get(), (oy60) ((l2g) xvf0Var4).get());
            case 1:
                return new ie((c) ((k4) obj).get(), (nej0) ((cta0) xvf0Var3).get(), (l) ((pgi) xvf0Var2).get(), (ymu) ((oe3) xvf0Var).get(), (i4u) ((rut) xvf0Var5).get(), (aa1) ((p4) xvf0Var4).get(), (vev0) xvf0Var6.get());
            case 2:
                return new z62((gtz0) xvf0Var6.get(), (w81) xvf0Var3.get(), (a) ((qx4) obj).get(), (kdd0) ((hs30) xvf0Var2).get(), (bgj) xvf0Var.get(), (hdu) ((f9t) xvf0Var5).get(), (je3) xvf0Var4.get());
            case 3:
                return new com.ybsdk.screens.registration.domain.interactors.a((nbp0) ((k6g) obj).get(), (b) ((ie9) xvf0Var2).get(), (com.ybsdk.common.repositiories.agreements.a) ((c6g) xvf0Var).get(), (com.ybsdk.screens.registration.data.c) xvf0Var6.get(), (com.ybsdk.screens.registration.data.a) xvf0Var3.get(), (com.ybsdk.common.repositiories.onboarding.a) ((lq40) xvf0Var5).get(), (r6a0) ((k6g) xvf0Var4).get());
            case 4:
                return new ge3((Context) ((t0g) obj).get(), (tt2) xvf0Var6.get(), (pdc) ((a1g) xvf0Var2).get(), (xdf) xvf0Var3.get(), (uze0) ((w0g) xvf0Var).get(), (pd3) ((lk) xvf0Var5).get(), (yp2) ((g0g) xvf0Var4).get());
            case 5:
                return new com.yandex.go.navigator.domain.a((o) ((b2g) obj).get(), (t) ((b2g) xvf0Var6).get(), (oc50) ((b2g) xvf0Var3).b.a, (mf50) ((b2g) xvf0Var2).b.j, i5m.a((dx7) xvf0Var), i5m.a((b2g) xvf0Var5), (dne0) ((b2g) xvf0Var4).b.k);
            case 6:
                return new ao4((pav) xvf0Var6.get(), (ru.yandex.taxi.widget.c) xvf0Var3.get(), (dkx0) ((xvf0) obj).get(), (List) ((h0l0) xvf0Var2).get(), (tt2) xvf0Var.get(), (p370) ((ad) xvf0Var5).get(), (pwy0) xvf0Var4.get());
            case 7:
                w3i w3iVar = (w3i) obj;
                h2a0 h2a0Var = (h2a0) xvf0Var6.get();
                Payer payer = (Payer) xvf0Var3.get();
                Merchant merchant = (Merchant) xvf0Var2.get();
                px90 px90Var = (px90) xvf0Var.get();
                z45 z45Var = (z45) xvf0Var5.get();
                fx5 fx5Var = (fx5) xvf0Var4.get();
                tv90 tv90Var = new tv90(h2a0Var.d, h2a0Var.a, h2a0Var.b, h2a0Var.c);
                tv90Var.e = payer;
                tv90Var.f = merchant;
                AdditionalSettings additionalSettings = (AdditionalSettings) w3iVar.x;
                tv90Var.t = additionalSettings.getAppInfo();
                tv90Var.u = additionalSettings.getBrowserCards();
                tv90Var.p = additionalSettings.getEnableCashPayments();
                tv90Var.i = additionalSettings.getExchangeOauthToken();
                tv90Var.o = additionalSettings.getForceCVV();
                tv90Var.n = additionalSettings.getGooglePayData();
                tv90Var.h = (tw4) w3iVar.y;
                tv90Var.q = additionalSettings.getPassportToken();
                tv90Var.r = additionalSettings.getPartition();
                tv90Var.j = additionalSettings.getCurrency();
                tv90Var.m = additionalSettings.getRegionId();
                tv90Var.v = additionalSettings.getPaymentMethodsFilter();
                tv90Var.g = px90Var;
                tv90Var.l = additionalSettings.getPos();
                tv90Var.w = additionalSettings.getAllowedCardNetworks();
                tv90Var.s = additionalSettings.getUseVerificationStatusPolling();
                tv90Var.A = additionalSettings.getIntegrationProfileId();
                tv90Var.B = ofu.b;
                tv90Var.C = additionalSettings.getEnableDebranding();
                tv90Var.y = z45Var.a;
                tv90Var.x = z45Var.b;
                tv90Var.z = z45Var.c;
                tv90Var.D = new iwy0();
                tv90Var.E = fx5Var;
                tv90Var.k = additionalSettings.getPaymentTo();
                return tv90Var.a();
            case 8:
                return new com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.input.a((mp6) ((np6) obj).get(), (com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.b) ((p4) xvf0Var6).get(), (rm01) ((qbg) xvf0Var3).get(), (j3h) ((qbg) xvf0Var2).get(), (tfl0) ((qbg) xvf0Var).get(), (com.ybsdk.feature.transfer.version2.internal.screens.a) ((y501) xvf0Var5).get(), (m04) ((vs3) xvf0Var4).get());
            case 9:
                return new bv6((ah00) xvf0Var6.get(), (bz70) xvf0Var3.get(), (wor0) ((miv0) obj).get(), (y980) xvf0Var2.get(), (h080) xvf0Var.get(), (cz70) xvf0Var5.get(), (m180) ((zyf) xvf0Var4).get());
            case 10:
                return new com.yandex.messaging.ui.calllist.info.c((th7) ((n3w) obj).a, (tft) ((z9n) xvf0Var2).get(), (rbt) ((c0j) xvf0Var).get(), (hft) ((f9t) xvf0Var5).get(), (nft) xvf0Var6.get(), (j4t) xvf0Var3.get(), (w270) xvf0Var4.get());
            case 11:
                return new com.yandex.go.pickup_from_photo.domain.c((tse) ((n5g) obj).get(), (y50) xvf0Var6.get(), (epb0) xvf0Var3.get(), (com.yandex.go.pickup_from_photo.data.a) xvf0Var2.get(), (i) ((vm80) xvf0Var).get(), (bjb0) xvf0Var5.get(), (umb0) xvf0Var4.get());
            case 12:
                return new com.yandex.go.navigator.map_interactions.parkings.e((h) ((gc) obj).get(), (l68) ((s90) xvf0Var2).get(), (Context) xvf0Var6.get(), (w030) xvf0Var3.get(), (com.yandex.go.navigator.map_interactions.parkings.analytics.a) xvf0Var.get(), (ah00) xvf0Var5.get(), (eb50) xvf0Var4.get());
            case 13:
                return new jz8((wiq0) ((w0g) obj).get(), (vfx0) xvf0Var6.get(), (k0) ((ut) xvf0Var3).get(), (ru.yandex.taxi.summary.requirements.list.carousel.interactor.a) ((prq) xvf0Var2).get(), (qw11) ((kdv0) xvf0Var).get(), (wpy0) ((tw11) xvf0Var5).get(), (nw8) ((ig7) xvf0Var4).get());
            case 14:
                return new hh9((Context) xvf0Var6.get(), i5m.a(xvf0Var3), (gay0) ((xcg) obj).get(), (epz) ((tw11) xvf0Var2).get(), (fva0) ((xcg) xvf0Var).get(), (com.yandex.go.yb.data.i) ((xcg) xvf0Var5).get(), (rqo) xvf0Var4.get());
            case 15:
                return new com.yandex.go.chargers.offer.data.a((tt2) xvf0Var6.get(), i5m.a((uxf) obj), (f) ((fr3) xvf0Var3).get(), (lpa) ((uxf) xvf0Var2).get(), (com.yandex.go.chargers.payments.data.a) ((uxf) xvf0Var).get(), (n3a) ((ba9) xvf0Var5).get(), (n3a) ((lu9) xvf0Var4).get());
            case 16:
                return new pp9((em9) xvf0Var6.get(), (bq9) xvf0Var3.get(), (xvf0) obj, (zo0) xvf0Var2, this.f, (dq9) xvf0Var5.get(), (vp9) xvf0Var4.get());
            case 17:
                com.yandex.go.chargers.domain.e eVar = (com.yandex.go.chargers.domain.e) xvf0Var6.get();
                return new v2a(scc.g((k) xvf0Var3.get(), eVar, (com.yandex.go.chargers.debt.domain.c) xvf0Var2.get(), (com.yandex.go.chargers.order.domain.f) ((xvf0) obj).get(), (com.yandex.go.chargers.payments.domain.e) xvf0Var.get(), (dm9) xvf0Var5.get(), (com.yandex.go.chargers.domain.c) ((bo2) xvf0Var4).get()));
            case 18:
                return new f9a((d8a) ((e8a) obj).get(), (j6a) xvf0Var6.get(), (com.yandex.go.chargers.plus.a) ((yc) xvf0Var2).get(), this.d, (kj7) xvf0Var, (g6) xvf0Var5, (n3a) ((lu9) xvf0Var4).get());
            case 19:
                return new qda((uo21) xvf0Var6.get(), this.d, (xvf0) obj, this.e, this.f, (com.yandex.go.chargers.data.e) xvf0Var5.get(), (rx4) xvf0Var4);
            case 20:
                return new eha((tt2) ((lxf) obj).get(), (pwy0) xvf0Var6.get(), (r0) xvf0Var3.get(), (com.yandex.go.chargers.passes.ui.e) ((xea) xvf0Var2).get(), (com.yandex.go.chargers.domain.a) xvf0Var.get(), (com.yandex.go.chargers.payments.data.a) xvf0Var5.get(), (kka) xvf0Var4.get());
            case 21:
                return new oha((Context) xvf0Var6.get(), (w030) xvf0Var3.get(), (xvf0) obj, this.e, (fha) xvf0Var.get(), (zha) ((yc) xvf0Var5).get(), (d) ((zo0) xvf0Var4).get());
            case 22:
                return new com.yandex.go.chargers.station.data.mapper.a((k7x0) xvf0Var6.get(), (iya) xvf0Var3.get(), (ru.yandex.taxi.widget.utils.e) ((xvf0) obj).get(), (com.yandex.go.chargers.domain.mapper.b) ((mu7) xvf0Var2).get(), (com.yandex.go.chargers.surge.domain.a) ((mu7) xvf0Var).get(), (ru.yandex.taxi.widget.c) xvf0Var5.get(), (com.yandex.go.chargers.station.data.mapper.b) ((zfa) xvf0Var4).get());
            case 23:
                x9b x9bVar = (x9b) ((n3w) obj).a;
                u5t u5tVar = (u5t) ((z9n) xvf0Var2).get();
                com.yandex.messaging.domain.chatlist.c cVar = (com.yandex.messaging.domain.chatlist.c) xvf0Var6.get();
                com.yandex.messaging.domain.threads.c cVar2 = (com.yandex.messaging.domain.threads.c) xvf0Var3.get();
                return new com.yandex.messaging.ui.chatthreadscontainer.d(x9bVar, u5tVar, cVar, cVar2, (com.yandex.messaging.domain.folders.c) xvf0Var5.get(), (bj10) xvf0Var4.get());
            case 24:
                return new ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.d((trb) xvf0Var6.get(), (hwy0) ((wxf) obj).b.g, (flg) xvf0Var3.get(), (bc) ((qrb) xvf0Var2).get(), (ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a) xvf0Var.get(), (ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.a) ((srb) xvf0Var5).get(), (lw) xvf0Var4.get());
            case 25:
                return new ru.yandex.taxi.summary.requirements.list.interactors.a((roj0) xvf0Var6.get(), (dj3) ((peb) obj).get(), (ga0) ((zni0) xvf0Var2).get(), (tt2) xvf0Var3.get(), (amc) xvf0Var.get(), (yiy0) xvf0Var5.get(), (vfx0) xvf0Var4.get());
            case 26:
                return new cvc((ah00) ((i9g) obj).get(), (l390) xvf0Var6.get(), (com.yandex.go.taxi.order.search.ui.search_views.d) xvf0Var3.get(), (com.yandex.go.taxi.order.search.overlay.companions.b) xvf0Var2.get(), (ndl0) ((z1n0) xvf0Var).get(), (hf2) ((i9g) xvf0Var5).get(), (jzf0) xvf0Var4.get());
            case 27:
                return new ru.yandex.taxi.search.address.view.c((dsd) xvf0Var6.get(), (tjt0) xvf0Var3.get(), (y9y0) ((xvf0) obj).get(), (zuj0) xvf0Var2.get(), (xk2) ((c1) xvf0Var).get(), (com.yandex.go.navigation.screen.c) xvf0Var5.get(), (c8v0) xvf0Var4.get());
            case 28:
                return new j4n((hwy0) ((exf) obj).get(), (qcp0) ((exf) xvf0Var6).get(), (yuj0) ((exf) xvf0Var3).get(), (y30) ((exf) xvf0Var2).get(), (Context) ((exf) xvf0Var).get(), (com.yandex.delivery.utils.dialogmanager.impl.b) ((exf) xvf0Var5).get(), (fza0) ((exf) xvf0Var4).get());
            default:
                return new gxe((cda0) xvf0Var6.get(), (gwe) xvf0Var3.get(), (w030) ((xvf0) obj).get(), (Context) xvf0Var2.get(), (zuj0) xvf0Var.get(), (sk7) ((f2b) xvf0Var5).get(), (wwe) xvf0Var4.get());
        }
    }

    public /* synthetic */ ht0(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar2, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.c = v7pVar;
        this.e = v7pVar2;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
    }

    public /* synthetic */ ht0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.e = xvf0Var3;
        this.d = xvf0Var4;
        this.f = xvf0Var5;
        this.g = v7pVar;
        this.h = xvf0Var6;
    }

    public /* synthetic */ ht0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ ht0(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.c = obj;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
    }

    public ht0(k4 k4Var, cta0 cta0Var, pgi pgiVar, oe3 oe3Var, rut rutVar, p4 p4Var, n3w n3wVar) {
        this.a = 1;
        this.c = k4Var;
        this.d = cta0Var;
        this.e = pgiVar;
        this.f = oe3Var;
        this.g = rutVar;
        this.h = p4Var;
        this.b = n3wVar;
    }

    public ht0(k2g k2gVar, xvf0 xvf0Var, k2g k2gVar2, k2g k2gVar3, xvf0 xvf0Var2, l2g l2gVar, l2g l2gVar2) {
        this.a = 0;
        this.c = k2gVar;
        this.b = xvf0Var;
        this.e = k2gVar2;
        this.f = k2gVar3;
        this.d = xvf0Var2;
        this.g = l2gVar;
        this.h = l2gVar2;
    }

    public /* synthetic */ ht0(int i, v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = v7pVar;
        this.h = xvf0Var6;
    }

    public ht0(k6g k6gVar, ie9 ie9Var, c6g c6gVar, xvf0 xvf0Var, xvf0 xvf0Var2, lq40 lq40Var, k6g k6gVar2) {
        this.a = 3;
        this.c = k6gVar;
        this.e = ie9Var;
        this.f = c6gVar;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.g = lq40Var;
        this.h = k6gVar2;
    }

    public ht0(xvf0 xvf0Var, peb pebVar, zni0 zni0Var, t0g t0gVar, t0g t0gVar2, nwf nwfVar, xvf0 xvf0Var2) {
        this.a = 25;
        this.b = xvf0Var;
        this.c = pebVar;
        this.e = zni0Var;
        this.d = t0gVar;
        this.f = t0gVar2;
        this.g = nwfVar;
        this.h = xvf0Var2;
    }
}
