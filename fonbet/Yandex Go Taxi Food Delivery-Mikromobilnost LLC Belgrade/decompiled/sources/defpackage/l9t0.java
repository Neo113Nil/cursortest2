package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.order.tariffs_suggest.api.ChangeTariffsApi;
import com.yandex.go.quark.soul.router.a;
import com.yandex.go.summary.interactor.common.state.h;
import com.yandex.go.superapp_carts.domain.loading.SuperappCartLoadingInteractor$getActionsFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.summary.interactor.g;
import com.yandex.go.taxi.summary.interactor.p;
import com.ybsdk.feature.stories.internal.network.StoriesApi;
import com.ybsdk.feature.stories.internal.screens.stories.StoriesFragment;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.masstransit.datasource.schedule.b;
import ru.yandex.taxi.preorder.source.data.c;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.summary.solid.interactor.u;

/* loaded from: classes12.dex */
public final class l9t0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public l9t0(n3w n3wVar, xvf0 xvf0Var, miv0 miv0Var, n3w n3wVar2) {
        this.a = 29;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.e = miv0Var;
        this.d = n3wVar2;
    }

    public static l9t0 a(nf nfVar, gaq0 gaq0Var, xvf0 xvf0Var, z0s0 z0s0Var) {
        return new l9t0((xvf0) nfVar, (xvf0) gaq0Var, xvf0Var, (xvf0) z0s0Var, 0);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new a(xvf0Var4, (com.yandex.go.quark.soul.domain.a) ((gaq0) xvf0Var2).get(), (h9t0) xvf0Var3.get(), (g9t0) xvf0Var.get());
            case 1:
                return new com.yandex.go.address_confirmation.analytics.a((i) ((aag) xvf0Var4).get(), (po21) ((aag) xvf0Var3).get(), (ru.yandex.taxi.preorder.source.userposition.a) ((aag) xvf0Var).get(), (pj) ((lk) xvf0Var2).get());
            case 2:
                return new c((dft0) ((ju9) xvf0Var2).get(), (tt2) xvf0Var4.get(), (e) xvf0Var3.get(), (com.yandex.go.route.interactor.c) xvf0Var.get());
            case 3:
                return new com.yandex.go.taxi.summary.routestops.e((y9y0) xvf0Var4.get(), (wiq0) ((w0g) xvf0Var).get(), (uze0) xvf0Var3.get(), (tct0) ((oye0) xvf0Var2).get());
            case 4:
                return new yjt0((jdj) ((pgi) xvf0Var3).get(), (wiq0) ((w0g) xvf0Var).get(), (cwb) xvf0Var4.get(), (wwf) ((oe3) xvf0Var2).get());
            case 5:
                return new com.yandex.messaging.internal.view.input.e(i5m.a((p8k0) xvf0Var2), (x22) xvf0Var4.get(), (com.yandex.messaging.internal.view.input.c) xvf0Var3.get(), (kse) xvf0Var.get());
            case 6:
                return new c2u0(xvf0Var4, xvf0Var3, (pso0) xvf0Var, (z8n0) xvf0Var2);
            case 7:
                return new ru.yandex.taxi.communications.stepsinstructions.interactor.c((ru.yandex.taxi.widget.utils.e) ((gag) xvf0Var4).get(), (pdc) ((gag) xvf0Var3).get(), (pwy0) ((gag) xvf0Var).get(), (oxu0) ((gag) xvf0Var2).get());
            case 8:
                return new ru.yandex.taxi.masstransit.stopbubble.interactor.a((b) ((i020) xvf0Var).get(), (yy30) ((s730) xvf0Var2).get(), (jtq0) xvf0Var4.get(), (tyx) xvf0Var3.get());
            case 9:
                return new StoriesFragment((rm31) ((hag) xvf0Var4).get(), (rnu0) ((n3w) xvf0Var3).a, (anp0) ((hag) xvf0Var).get(), (qg6) ((o9g) xvf0Var2).get());
            case 10:
                return new com.ybsdk.feature.stories.internal.data.a((StoriesApi) xvf0Var4.get(), (n860) ((hag) xvf0Var3).get(), (f5j0) ((hag) xvf0Var).get(), (fdr) ((hag) xvf0Var2).get());
            case 11:
                return new com.yandex.go.order.tariffs_suggest.repository.a((n20) xvf0Var4.get(), (com.yandex.go.order.tariffs_suggest.mapper.a) ((jc50) xvf0Var).get(), (ChangeTariffsApi) ((l180) xvf0Var2).get(), (pwy0) xvf0Var3.get());
            case 12:
                return new nbv0((wiq0) xvf0Var4.get(), (k) ((qii) xvf0Var).get(), (fif) xvf0Var3.get(), (dy6) ((c660) xvf0Var2).get());
            case 13:
                return new wev0((brv0) ((x0g) xvf0Var4).get(), (dmq0) ((kpp0) xvf0Var3).get(), (ucv0) ((b1g) xvf0Var).get(), (rqo) ((u0g) xvf0Var2).get());
            case 14:
                return new ngv0((g) ((so4) xvf0Var).get(), (wiq0) ((w0g) xvf0Var2).get(), (ip11) xvf0Var4.get(), (pav) xvf0Var3.get());
            case 15:
                return new h((com.yandex.go.summary.interactor.anchored.state.a) xvf0Var4.get(), (com.yandex.go.summary.interactor.expanded.state.a) ((oti) xvf0Var2).get(), (ldv0) xvf0Var3.get(), (com.yandex.go.taxi.summary.shared.lifecycle.a) xvf0Var.get());
            case 16:
                return new u((ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.a) ((l9t0) xvf0Var).get(), (ru.yandex.taxi.summary.promotions.repository.e) xvf0Var4.get(), (pwy0) xvf0Var3.get(), (wiq0) ((w0g) xvf0Var2).get());
            case 17:
                return new llv0((qlv0) xvf0Var4.get(), (tlv0) ((n3w) xvf0Var).a, (i130) xvf0Var3.get(), i5m.a((y0g) xvf0Var2));
            case 18:
                return new qlv0((Context) ((t0g) xvf0Var3).get(), (pdc) xvf0Var4.get(), (bts0) ((a1g) xvf0Var).get(), (yhr) ((s0g) xvf0Var2).get());
            case 19:
                return new ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.a((tt2) xvf0Var4.get(), (irs0) ((a1g) xvf0Var2).get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (qbl0) xvf0Var.get());
            case 20:
                return new cov0((com.yandex.go.taxi.summary.shared.sourcedestination.c) ((mz70) xvf0Var4).get(), (wiq0) ((w0g) xvf0Var3).get(), (p) ((xv8) xvf0Var).get(), (amp0) ((sit0) xvf0Var2).get());
            case 21:
                return new kov0((y4k0) xvf0Var4.get(), (wiq0) ((w0g) xvf0Var3).get(), (hhd) ((dx9) xvf0Var).get(), (cg31) ((dby0) xvf0Var2).get());
            case 22:
                return new mov0((xcv0) xvf0Var4.get(), (ru.yandex.taxi.perf.b) ((t0g) xvf0Var3).get(), (dqe0) ((w0g) xvf0Var).get(), (e) ((a1g) xvf0Var2).get());
            case 23:
                return new crv0((vex0) ((x0g) xvf0Var3).get(), (e1g) ((r0g) xvf0Var).get(), (fva0) xvf0Var4.get(), (wev0) ((l9t0) xvf0Var2).get());
            case 24:
                return new com.yandex.go.superapp.discovery.map.impl.navigation.taxi.a((g09) ((iag) xvf0Var4).get(), (f09) ((iag) xvf0Var3).get(), (ayv0) ((miv0) xvf0Var).get(), (y2s0) xvf0Var2);
            case 25:
                return new h9w0((q9w0) ((n3w) xvf0Var4).a, (zuj0) ((nag) xvf0Var3).get(), (p9w0) ((n3w) xvf0Var).a, i5m.a((p7w0) xvf0Var2));
            case 26:
                vlr vlrVar = (vlr) ((eqh) xvf0Var).get();
                com.yandex.go.superapp_carts.domain.loading.a aVar = (com.yandex.go.superapp_carts.domain.loading.a) ((rct0) xvf0Var2).get();
                wgr wgrVar = (wgr) xvf0Var4.get();
                return new nhr(vlrVar, null, kotlinx.coroutines.flow.e.K(kotlinx.coroutines.flow.e.K(aVar.b(true), kotlinx.coroutines.flow.e.X(aVar.a.b, new SuperappCartLoadingInteractor$getActionsFlow$$inlined$flatMapLatest$1(null, aVar))), wgrVar.b()), null, null, Integer.valueOf(mqg0.transparent), null, (ljr) xvf0Var3.get(), null, null, 7898);
            case 27:
                return new sts((i130) xvf0Var4.get(), (abe) ((xat) xvf0Var).get(), (zxs0) ((fat0) xvf0Var2).get(), (rqw0) xvf0Var3.get(), 3);
            case 28:
                return new r0x0((ld60) ((t160) xvf0Var2).get(), (com.yandex.messaging.domain.statuses.b) xvf0Var4.get(), (k020) xvf0Var3.get(), i5m.a(xvf0Var));
            default:
                return new com.yandex.messaging.attachments.e((Activity) xvf0Var4.get(), (vse) xvf0Var3.get(), (miv0) xvf0Var2, (com.yandex.alicekit.core.permissions.b) xvf0Var.get());
        }
    }

    public /* synthetic */ l9t0(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.d = v7pVar;
        this.e = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ l9t0(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, v7p v7pVar2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = v7pVar;
        this.e = v7pVar2;
        this.c = xvf0Var2;
    }

    public /* synthetic */ l9t0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
        this.e = v7pVar;
    }

    public /* synthetic */ l9t0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
    }

    public /* synthetic */ l9t0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ l9t0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ l9t0(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.e = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public l9t0(t0g t0gVar, a1g a1gVar, a1g a1gVar2, s0g s0gVar) {
        this.a = 18;
        this.c = t0gVar;
        this.b = a1gVar;
        this.d = a1gVar2;
        this.e = s0gVar;
    }

    public l9t0(l9t0 l9t0Var, x0g x0gVar, x0g x0gVar2, w0g w0gVar) {
        this.a = 16;
        this.d = l9t0Var;
        this.b = x0gVar;
        this.c = x0gVar2;
        this.e = w0gVar;
    }
}
