package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.data.j;
import com.yandex.go.chargers.order.active.f;
import com.yandex.go.eboks.objects.domain.n;
import com.yandex.go.payments.domain.m0;
import com.yandex.go.summary.interactor.anchored.state.t;
import com.yandex.go.summary.interactor.expanded.state.r;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.order.a0;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactView;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.e0;
import com.yandex.go.taxi.order.z;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.miniapps.js.MiniAppJsInterface;
import java.util.List;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.c;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a;
import ru.yandex.taxi.logistics.sdk.promotions.impl.ui.b;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.d;
import ru.yandex.taxi.masstransit.domain.v;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.orderbutton.summary.base.interactors.i;
import ru.yandex.taxi.summary.solid.interactor.p;
import ru.yandex.taxi.summary.solid.interactor.s;

/* loaded from: classes14.dex */
public final class nt0 implements v7p {
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

    public nt0(gbg gbgVar, c1 c1Var, gbg gbgVar2, xvf0 xvf0Var, gbg gbgVar3, mzf mzfVar, gbg gbgVar4, gbg gbgVar5, n3w n3wVar, gbg gbgVar6) {
        this.a = 16;
        this.f = gbgVar;
        this.g = c1Var;
        this.c = gbgVar2;
        this.b = xvf0Var;
        this.d = gbgVar3;
        this.e = mzfVar;
        this.h = gbgVar4;
        this.i = gbgVar5;
        this.j = n3wVar;
        this.k = gbgVar6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.i;
        xvf0 xvf0Var2 = this.h;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.f;
        xvf0 xvf0Var6 = this.k;
        xvf0 xvf0Var7 = this.j;
        xvf0 xvf0Var8 = this.e;
        xvf0 xvf0Var9 = this.d;
        xvf0 xvf0Var10 = this.b;
        switch (i) {
            case 0:
                return new c((bu0) ((gc) xvf0Var5).get(), (ct0) ((c1) xvf0Var4).get(), (l7x0) xvf0Var10.get(), (a) ((v7p) xvf0Var2).get(), (ru.yandex.taxi.logistics.sdk.photocomments.domain.a) xvf0Var3.get(), (u1n) ((k0n) xvf0Var).get(), (u6u0) xvf0Var9.get(), (yj70) ((l180) xvf0Var7).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo.a) ((kze) xvf0Var6).get(), (q8s) xvf0Var8.get());
            case 1:
                return new xr4((Context) xvf0Var10.get(), (b) xvf0Var3.get(), (hwy0) ((w5g) xvf0Var5).get(), (h0w) ((p4) xvf0Var4).get(), (dci) ((w5g) xvf0Var2).get(), (b) xvf0Var9.get(), (or4) xvf0Var8.get(), (nr4) ((ywf) xvf0Var).get(), (yfa) ((peb) xvf0Var7).get(), (oh4) ((qh4) xvf0Var6).get());
            case 2:
                return new g25((Context) xvf0Var10.get(), (AdditionalSettings) xvf0Var3.get(), (vh5) ((ze) xvf0Var5).get(), (xzd) xvf0Var9.get(), (m6v) xvf0Var8.get(), (Merchant) xvf0Var4.get(), (Payer) xvf0Var2.get(), (yxf0) ((jpf0) xvf0Var).get(), (s3a0) xvf0Var7.get(), (fp51) xvf0Var6.get());
            case 3:
                return new ru.yandex.taxi.orderpopup.a((i130) xvf0Var10.get(), (hu6) ((n3w) xvf0Var5).a, (dld0) xvf0Var4, (ru.yandex.taxi.modal.popup.ui.model.a) ((pqd0) xvf0Var9).get(), (au6) ((fn5) xvf0Var8).get(), (iu6) xvf0Var3.get(), (u380) ((tj70) xvf0Var2).get(), (uos0) ((w0g) xvf0Var).get(), (wiq0) ((w0g) xvf0Var7).get(), (tse) ((y0g) xvf0Var6).get());
            case 4:
                return new kl7((o1b0) xvf0Var10.get(), (MessengerEnvironment) xvf0Var3.get(), (ml21) xvf0Var9.get(), (bbj) xvf0Var8.get(), (q6v) xvf0Var5.get(), (k020) xvf0Var4.get(), (m2v) ((s90) xvf0Var2).get(), (Looper) xvf0Var.get(), (w3i) ((wj0) xvf0Var7).get(), (jl21) xvf0Var6.get());
            case 5:
                return new il9((tt2) ((lxf) xvf0Var5).get(), (em9) xvf0Var10.get(), (pwy0) xvf0Var3.get(), (f) xvf0Var9.get(), (com.yandex.go.chargers.order.domain.a) xvf0Var8.get(), (lca) xvf0Var4.get(), (e) xvf0Var2.get(), (rda) xvf0Var.get(), (j) xvf0Var7.get(), (com.yandex.go.chargers.data.b) ((ig7) xvf0Var6).get());
            case 6:
                return new com.yandex.messaging.input.b((Activity) xvf0Var10.get(), (ChatRequest) xvf0Var3.get(), (SharedPreferences) xvf0Var9.get(), (cdu0) xvf0Var8.get(), i5m.a((u6o0) xvf0Var5), this.g, (mp11) xvf0Var2.get(), (x22) xvf0Var.get(), (y4t) xvf0Var7.get(), (vse) xvf0Var6.get());
            case 7:
                return new wdb((Context) xvf0Var10.get(), (at2) xvf0Var3.get(), (el21) xvf0Var9.get(), (x22) xvf0Var8.get(), (ouf0) xvf0Var5.get(), (Moshi) xvf0Var4.get(), (ogu) ((mwq) xvf0Var2).get(), (at20) ((uc50) xvf0Var).get(), (ch60) xvf0Var7.get(), (rz10) xvf0Var6.get());
            case 8:
                ck31 ck31Var = (ck31) xvf0Var10.get();
                q qVar = (q) ((dby0) xvf0Var5).get();
                aqv0 aqv0Var = (aqv0) xvf0Var3.get();
                h3y a = i5m.a((sk21) xvf0Var4);
                h3y a2 = i5m.a((mg11) xvf0Var2);
                pb31 pb31Var = (pb31) xvf0Var9.get();
                pwy0 pwy0Var = (pwy0) xvf0Var8.get();
                return new c6m(ck31Var, qVar, aqv0Var, a, a2, pb31Var, pwy0Var, (cu1) ((faj) xvf0Var7).get(), (bgx0) xvf0Var6.get());
            case 9:
                return new n((ah00) ((kzf) xvf0Var5).get(), (tt2) ((kzf) xvf0Var4).get(), (ky2) ((kzf) xvf0Var8).get(), (pwy0) ((kzf) xvf0Var2).get(), (com.yandex.go.eboks.objects.data.mapper.a) ((bo2) xvf0Var).get(), (bin) ((f2i) xvf0Var7).get(), (com.yandex.go.eboks.objects.data.c) ((z9n) xvf0Var6).get(), (com.yandex.go.eboks.objects.data.a) xvf0Var10.get(), (hin) xvf0Var3.get(), (ghn) xvf0Var9.get());
            case 10:
                return new ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.c((List) xvf0Var10.get(), (List) xvf0Var3.get(), (zch) ((kyf) xvf0Var5).b.a, (ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a) xvf0Var9.get(), (c5i) ((jyf) xvf0Var4).get(), (ru.yandex.taxi.logistics.sdk.dashboard.storage.c) ((jyf) xvf0Var2).get(), (ru.yandex.taxi.logistics.payment.a) ((kyf) xvf0Var).get(), (q4i) xvf0Var8.get(), (st2) ((jyf) xvf0Var7).get(), (flg) xvf0Var6.get());
            case 11:
                return new v0s((z880) xvf0Var10.get(), (pev0) xvf0Var3.get(), (xb80) xvf0Var9.get(), (biv0) ((b1g) xvf0Var5).get(), (wiq0) ((w0g) xvf0Var4).get(), (wjm) ((z9n) xvf0Var2).get(), (e6t0) ((wun0) xvf0Var).get(), (rf5) xvf0Var8.get(), (tbx0) xvf0Var7.get(), (nex0) xvf0Var6.get());
            case 12:
                return new r((dcx0) xvf0Var10.get(), (wiq0) ((w0g) xvf0Var5).get(), (m0) xvf0Var3.get(), (i) xvf0Var9.get(), (jcx0) xvf0Var8.get(), (z0a0) xvf0Var4.get(), (akv0) xvf0Var2.get(), (zuj0) xvf0Var.get(), (p) xvf0Var7.get(), (xqf0) xvf0Var6.get());
            case 13:
                return new t((wiq0) ((w0g) xvf0Var5).get(), (m0) xvf0Var10.get(), (i) ((zs0) xvf0Var4).get(), (p) ((so4) xvf0Var2).get(), (mrj) ((c4) xvf0Var).get(), (z0a0) xvf0Var3.get(), (akv0) ((fat0) xvf0Var7).get(), (zuj0) xvf0Var9.get(), (xqf0) xvf0Var8.get(), (s) ((s3f0) xvf0Var6).get());
            case 14:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.repository.b((st2) xvf0Var10.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.repository.c) xvf0Var3.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.data.a) xvf0Var9.get(), (z4s) xvf0Var8.get(), (com.yandex.delivery.utils.dialogmanager.a) ((can) xvf0Var5).get(), (zrm) ((k0n) xvf0Var4).get(), (sr4) ((n1g) xvf0Var2).b.b, (jwh) xvf0Var.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c) xvf0Var7.get(), (mv8) ((n1g) xvf0Var6).get());
            case 15:
                return new com.yandex.go.intercity.flex.dashboard.router.a((w030) xvf0Var10.get(), this.c, (odw) xvf0Var9.get(), (oew) xvf0Var8.get(), this.f, (mlw) xvf0Var4.get(), (hnw) ((qx5) xvf0Var2).get(), (cir) ((n3w) xvf0Var).a, (kdw) ((rut) xvf0Var7).get(), (oep0) xvf0Var6.get());
            case 16:
                return new d((st2) ((gbg) xvf0Var5).get(), (j00) ((c1) xvf0Var4).get(), (com.yandex.delivery.live.location.impl.repository.b) ((gbg) xvf0Var3).get(), (jvy) xvf0Var10.get(), (jwh) ((gbg) xvf0Var9).get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var8).get(), (fza0) ((gbg) xvf0Var2).get(), (com.yandex.delivery.utils.dialogmanager.impl.b) ((gbg) xvf0Var).get(), (Context) ((n3w) xvf0Var7).a, (yuj0) ((gbg) xvf0Var6).get());
            case 17:
                return new com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c((o2y0) ((n3w) xvf0Var5).a, (jtq0) ((j9g) xvf0Var4).get(), (cv00) ((i9g) xvf0Var3).get(), (wrr) ((x0z) xvf0Var9).get(), (tmz) xvf0Var10.get(), (wz8) ((i9g) xvf0Var8).get(), (eco) ((kgn) xvf0Var2).get(), (ru.yandex.taxi.order.map.controller.a) ((i9g) xvf0Var).get(), (yz8) ((i9g) xvf0Var7).get(), (tt2) ((i9g) xvf0Var6).get());
            case 18:
                return new com.yandex.messaging.miniapps.view.a((Activity) xvf0Var10.get(), (MiniAppJsInterface) xvf0Var3.get(), (sh20) xvf0Var9.get(), (nh20) xvf0Var8.get(), (s8g) xvf0Var5.get(), (wh20) xvf0Var4.get(), (lh20) xvf0Var2.get(), (x22) xvf0Var.get(), (com.yandex.messaging.internal.net.a) xvf0Var7.get(), (oh20) ((n3w) xvf0Var6).a);
            case 19:
                return new ru.yandex.taxi.masstransit.main.router.b((zgf) ((e3g) xvf0Var5).get(), (m010) ((f3g) xvf0Var4).get(), (di20) xvf0Var10, i5m.a((f3g) xvf0Var3), (jl00) xvf0Var9, (di20) xvf0Var8, i5m.a((f3g) xvf0Var2), (dz00) ((f3g) xvf0Var).get(), (wr30) ((bhx) xvf0Var7).get(), (xl10) ((g3g) xvf0Var6).get());
            case 20:
                return new ay30((a3v) xvf0Var10.get(), (xj30) xvf0Var3.get(), (tt2) ((u3g) xvf0Var5).get(), (v) xvf0Var9.get(), (dz00) xvf0Var8.get(), (ak30) xvf0Var4.get(), (d0) ((d701) xvf0Var2).get(), (ru.yandex.taxi.masstransit.datasource.routing.f) xvf0Var.get(), (ru.yandex.taxi.masstransit.overlay.e) ((egx0) xvf0Var7).get(), (l5r) xvf0Var6.get());
            case 21:
                return new ki70((Context) xvf0Var8.get(), (ah00) xvf0Var10.get(), (xm00) xvf0Var3.get(), i5m.a(xvf0Var9), (p080) xvf0Var5.get(), (yxu0) xvf0Var4.get(), (jf2) ((n3w) xvf0Var2).a, (com.yandex.go.taxi.order.bubble.interactor.b) ((jc50) xvf0Var).get(), (com.yandex.go.taxi.order.bubble.interactor.a) ((jc50) xvf0Var7).get(), (ru.yandex.taxi.map_common.map.process.b) xvf0Var6.get());
            case 22:
                return new e0((tse) ((f4g) xvf0Var5).get(), (tt2) ((f4g) xvf0Var4).get(), (String) xvf0Var10.get(), (z) xvf0Var3.get(), (com.yandex.go.taxi.order.analytics.a) xvf0Var9.get(), (h780) xvf0Var8.get(), (ysg) xvf0Var2.get(), (ru.yandex.taxi.launch.c) xvf0Var.get(), (a880) xvf0Var7.get(), (a0) ((ut) xvf0Var6).get());
            case 23:
                return new lma0((Context) ((x4g) xvf0Var5).get(), (hma0) xvf0Var10.get(), (qma0) xvf0Var3.get(), (w030) ((x4g) xvf0Var4).get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) xvf0Var9.get(), (qcc0) xvf0Var8.get(), this.h, this.i, (mg80) xvf0Var7.get(), (wbc0) xvf0Var6.get());
            case 24:
                return new ru.yandex.taxi.summary.personalaction.notification.b((tse) xvf0Var10.get(), (tj60) xvf0Var3.get(), (ru.yandex.taxi.summary.personalaction.notification.a) ((cta0) xvf0Var5).get(), (pav) xvf0Var9.get(), (k7x0) xvf0Var8.get(), (ru.yandex.taxi.personalstate.data.remote.a) xvf0Var4.get(), (as21) xvf0Var2.get(), (p2y0) xvf0Var.get(), (r8h) xvf0Var7.get(), (aq80) ((vqa0) xvf0Var6).get());
            case 25:
                return new com.yandex.go.places.impl.domain.interactors.common.a((ah00) xvf0Var10.get(), (po21) xvf0Var3.get(), (jio) xvf0Var9.get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) xvf0Var8.get(), (k0b0) xvf0Var5.get(), (tbc0) xvf0Var4.get(), (e2t) xvf0Var2.get(), (atd0) ((y4g) xvf0Var).get(), (uo21) ((z4g) xvf0Var7).get(), (hfc0) ((y4g) xvf0Var6).get());
            case 26:
                return new ru.yandex.taxi.summary.deeplink.requirement.a((c4r0) ((a1g) xvf0Var5).get(), (ck31) xvf0Var10.get(), (arv0) ((x0g) xvf0Var4).get(), (b8r) ((u0g) xvf0Var2).get(), (wiq0) ((w0g) xvf0Var).get(), (vqv0) xvf0Var3.get(), (g580) xvf0Var9.get(), (w15) xvf0Var8.get(), (kdr) xvf0Var7.get(), (tse) ((y0g) xvf0Var6).get());
            case 27:
                return new hnj0((k7x0) xvf0Var10.get(), (bqj0) xvf0Var3.get(), (q6c0) ((jc50) xvf0Var5).get(), (yj70) ((t160) xvf0Var4).get(), (yli) xvf0Var9.get(), (k3i) xvf0Var8.get(), (chi) xvf0Var2.get(), (ibn) xvf0Var.get(), (uih) xvf0Var7.get(), (a9w) xvf0Var6.get());
            case 28:
                return new com.yandex.go.taxi.order.details.v2.state.elements.buttons.f((o2y0) xvf0Var10.get(), (uw40) xvf0Var3.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var9.get(), (com.yandex.go.taxi.order.util.slot.a) xvf0Var8.get(), (irs0) xvf0Var5.get(), (lbk0) xvf0Var4.get(), (zuj0) xvf0Var2.get(), (ndk0) xvf0Var.get(), (ddk0) xvf0Var7.get(), (spl0) ((u6g) xvf0Var6).get());
            default:
                return new RideCardCompactView((Context) ((r6g) xvf0Var5).get(), (eek0) ((xv8) xvf0Var4).get(), (z0a0) xvf0Var10.get(), (ydk0) xvf0Var3.get(), (ckk0) xvf0Var9.get(), (gu11) xvf0Var8.get(), (f0) xvf0Var2.get(), (o2y0) xvf0Var.get(), (com.yandex.go.taxi.order.details.v2.analytics.perf.a) xvf0Var7.get(), (g6y0) xvf0Var6.get());
        }
    }

    public /* synthetic */ nt0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, int i, byte b) {
        this.a = i;
        this.f = xvf0Var;
        this.g = xvf0Var2;
        this.b = xvf0Var3;
        this.c = xvf0Var4;
        this.d = xvf0Var5;
        this.e = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
    }

    public /* synthetic */ nt0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, int i, boolean z) {
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
    }

    public nt0(xvf0 xvf0Var, xvf0 xvf0Var2, w5g w5gVar, p4 p4Var, w5g w5gVar2, xvf0 xvf0Var3, xvf0 xvf0Var4, ywf ywfVar, peb pebVar, qh4 qh4Var) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = w5gVar;
        this.g = p4Var;
        this.h = w5gVar2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.i = ywfVar;
        this.j = pebVar;
        this.k = qh4Var;
    }

    public /* synthetic */ nt0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
    }

    public nt0(gc gcVar, c1 c1Var, xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, k0n k0nVar, xvf0 xvf0Var3, l180 l180Var, kze kzeVar, xvf0 xvf0Var4) {
        this.a = 0;
        this.f = gcVar;
        this.g = c1Var;
        this.b = xvf0Var;
        this.h = v7pVar;
        this.c = xvf0Var2;
        this.i = k0nVar;
        this.d = xvf0Var3;
        this.j = l180Var;
        this.k = kzeVar;
        this.e = xvf0Var4;
    }

    public nt0(v0g v0gVar, n3w n3wVar, dld0 dld0Var, pqd0 pqd0Var, fn5 fn5Var, t0g t0gVar, tj70 tj70Var, w0g w0gVar, w0g w0gVar2, y0g y0gVar) {
        this.a = 3;
        this.b = v0gVar;
        this.f = n3wVar;
        this.g = dld0Var;
        this.d = pqd0Var;
        this.e = fn5Var;
        this.c = t0gVar;
        this.h = tj70Var;
        this.i = w0gVar;
        this.j = w0gVar2;
        this.k = y0gVar;
    }

    public nt0(lxf lxfVar, lxf lxfVar2, qxf qxfVar, rs0 rs0Var, pw pwVar, xvf0 xvf0Var, lxf lxfVar3, xvf0 xvf0Var2, xvf0 xvf0Var3, ig7 ig7Var) {
        this.a = 5;
        this.f = lxfVar;
        this.b = lxfVar2;
        this.c = qxfVar;
        this.d = rs0Var;
        this.e = pwVar;
        this.g = xvf0Var;
        this.h = lxfVar3;
        this.i = xvf0Var2;
        this.j = xvf0Var3;
        this.k = ig7Var;
    }

    public nt0(eqh eqhVar, xvf0 xvf0Var, z0g z0gVar, b1g b1gVar, w0g w0gVar, z9n z9nVar, wun0 wun0Var, g0g g0gVar, fat0 fat0Var, x0g x0gVar) {
        this.a = 11;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = z0gVar;
        this.f = b1gVar;
        this.g = w0gVar;
        this.h = z9nVar;
        this.i = wun0Var;
        this.e = g0gVar;
        this.j = fat0Var;
        this.k = x0gVar;
    }

    public nt0(n3w n3wVar, j9g j9gVar, i9g i9gVar, x0z x0zVar, xvf0 xvf0Var, i9g i9gVar2, kgn kgnVar, i9g i9gVar3, i9g i9gVar4, i9g i9gVar5) {
        this.a = 17;
        this.f = n3wVar;
        this.g = j9gVar;
        this.c = i9gVar;
        this.d = x0zVar;
        this.b = xvf0Var;
        this.e = i9gVar2;
        this.h = kgnVar;
        this.i = i9gVar3;
        this.j = i9gVar4;
        this.k = i9gVar5;
    }

    public nt0(xvf0 xvf0Var, xvf0 xvf0Var2, jc50 jc50Var, t160 t160Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        this.a = 27;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = jc50Var;
        this.g = t160Var;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
        this.j = xvf0Var7;
        this.k = xvf0Var8;
    }

    public nt0(kzf kzfVar, kzf kzfVar2, kzf kzfVar3, kzf kzfVar4, bo2 bo2Var, f2i f2iVar, z9n z9nVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 9;
        this.f = kzfVar;
        this.g = kzfVar2;
        this.e = kzfVar3;
        this.h = kzfVar4;
        this.i = bo2Var;
        this.j = f2iVar;
        this.k = z9nVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public nt0(w0g w0gVar, z0g z0gVar, zs0 zs0Var, so4 so4Var, c4 c4Var, z0g z0gVar2, fat0 fat0Var, w0g w0gVar2, xvf0 xvf0Var, s3f0 s3f0Var) {
        this.a = 13;
        this.f = w0gVar;
        this.b = z0gVar;
        this.g = zs0Var;
        this.h = so4Var;
        this.i = c4Var;
        this.c = z0gVar2;
        this.j = fat0Var;
        this.d = w0gVar2;
        this.e = xvf0Var;
        this.k = s3f0Var;
    }

    public nt0(a1g a1gVar, y0g y0gVar, x0g x0gVar, u0g u0gVar, w0g w0gVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, prq prqVar, y0g y0gVar2) {
        this.a = 26;
        this.f = a1gVar;
        this.b = y0gVar;
        this.g = x0gVar;
        this.h = u0gVar;
        this.i = w0gVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.j = prqVar;
        this.k = y0gVar2;
    }

    public nt0(xvf0 xvf0Var, w0g w0gVar, z0g z0gVar, zs0 zs0Var, xvf0 xvf0Var2, z0g z0gVar2, fat0 fat0Var, w0g w0gVar2, so4 so4Var, xvf0 xvf0Var3) {
        this.a = 12;
        this.b = xvf0Var;
        this.f = w0gVar;
        this.c = z0gVar;
        this.d = zs0Var;
        this.e = xvf0Var2;
        this.g = z0gVar2;
        this.h = fat0Var;
        this.i = w0gVar2;
        this.j = so4Var;
        this.k = xvf0Var3;
    }

    public nt0(xvf0 xvf0Var, xvf0 xvf0Var2, kyf kyfVar, xvf0 xvf0Var3, jyf jyfVar, jyf jyfVar2, kyf kyfVar2, xvf0 xvf0Var4, jyf jyfVar3, xvf0 xvf0Var5) {
        this.a = 10;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = kyfVar;
        this.d = xvf0Var3;
        this.g = jyfVar;
        this.h = jyfVar2;
        this.i = kyfVar2;
        this.e = xvf0Var4;
        this.j = jyfVar3;
        this.k = xvf0Var5;
    }

    public nt0(xvf0 xvf0Var, dby0 dby0Var, xvf0 xvf0Var2, sk21 sk21Var, mg11 mg11Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, faj fajVar, xvf0 xvf0Var6) {
        this.a = 8;
        this.b = xvf0Var;
        this.f = dby0Var;
        this.c = xvf0Var2;
        this.g = sk21Var;
        this.h = mg11Var;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.i = xvf0Var5;
        this.j = fajVar;
        this.k = xvf0Var6;
    }

    public nt0(x4g x4gVar, n3w n3wVar, n3w n3wVar2, x4g x4gVar2, n3w n3wVar3, y4g y4gVar, maz mazVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 23;
        this.f = x4gVar;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.g = x4gVar2;
        this.d = n3wVar3;
        this.e = y4gVar;
        this.h = mazVar;
        this.i = xvf0Var;
        this.j = xvf0Var2;
        this.k = xvf0Var3;
    }
}
