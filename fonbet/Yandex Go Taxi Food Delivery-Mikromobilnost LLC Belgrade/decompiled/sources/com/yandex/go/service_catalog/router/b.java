package com.yandex.go.service_catalog.router;

import com.yandex.go.flex.main_screen.api.query.DocumentQueryFactory$prepareDocumentQuery$1;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.service_catalog.analytics.ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState;
import com.yandex.go.service_catalog.router.a;
import com.yandex.go.service_catalog.router.b;
import defpackage.aks0;
import defpackage.c1m0;
import defpackage.cnr0;
import defpackage.g0p;
import defpackage.kjr;
import defpackage.kr;
import defpackage.ljr;
import defpackage.m950;
import defpackage.mjr;
import defpackage.mqg0;
import defpackage.nao;
import defpackage.nhr;
import defpackage.ny61;
import defpackage.o3l0;
import defpackage.pgk0;
import defpackage.puq0;
import defpackage.pwy;
import defpackage.qu;
import defpackage.rol0;
import defpackage.smp;
import defpackage.u1m;
import defpackage.ute0;
import defpackage.uwl;
import defpackage.vlr;
import defpackage.w97;
import defpackage.wgr;
import defpackage.wuq0;
import defpackage.yio0;
import defpackage.ykn0;
import defpackage.yvf0;
import defpackage.ywl;
import defpackage.zm5;
import defpackage.zuj0;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes13.dex */
public final class b extends BaseRootNavigationRouter implements o3l0 {
    public final wgr D;
    public final yvf0 E;
    public final c1m0 F;
    public final pgk0 G;
    public final w97 H;
    public final com.yandex.go.flex.main_screen.api.query.a I;
    public final zuj0 J;
    public final puq0 K;
    public final smp L;
    public final mjr M;
    public final BaseRootNavigationRouter.a N = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.NONE, null, 13);

    public b(wgr wgrVar, yvf0 yvf0Var, c1m0 c1m0Var, pgk0 pgk0Var, w97 w97Var, com.yandex.go.flex.main_screen.api.query.a aVar, zuj0 zuj0Var, puq0 puq0Var, smp smpVar, mjr mjrVar) {
        this.D = wgrVar;
        this.E = yvf0Var;
        this.F = c1m0Var;
        this.G = pgk0Var;
        this.H = w97Var;
        this.I = aVar;
        this.J = zuj0Var;
        this.K = puq0Var;
        this.L = smpVar;
        this.M = mjrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(b bVar, ContinuationImpl continuationImpl) {
        ServiceCatalogRootRouterImpl$createLoadDocumentAction$1 serviceCatalogRootRouterImpl$createLoadDocumentAction$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof ServiceCatalogRootRouterImpl$createLoadDocumentAction$1) {
            serviceCatalogRootRouterImpl$createLoadDocumentAction$1 = (ServiceCatalogRootRouterImpl$createLoadDocumentAction$1) continuationImpl;
            int i2 = serviceCatalogRootRouterImpl$createLoadDocumentAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                serviceCatalogRootRouterImpl$createLoadDocumentAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = serviceCatalogRootRouterImpl$createLoadDocumentAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = serviceCatalogRootRouterImpl$createLoadDocumentAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.flex.main_screen.api.query.a aVar = bVar.I;
                    serviceCatalogRootRouterImpl$createLoadDocumentAction$1.label = 1;
                    obj = ((com.yandex.go.flex.main_screen.interactors.b) aVar).b("bdui/v1/superapp/service-catalog", null, EmptyList.a, DocumentQueryFactory$prepareDocumentQuery$1.b, false, false, serviceCatalogRootRouterImpl$createLoadDocumentAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new pwy(((ute0) obj).a, new ywl(new aks0("(theme bgMinor 0.0p (padded 120p 38p (col 100% (repeat 2 (col (row 100% sb (repeat 4 (bone 48p 48p 16p))) (space 36p))) (space 52p) (col 100% (row 100% sb (repeat 4 (bone 48p 48p 16p))) (space 36p) (row 100% sb (repeat 2 (bone 48p 48p 16p)) (space 48p) (space 48p)) (space 36p)) (space 52p) (row 100% sb (repeat 2 (bone 48p 48p 16p)) (space 48p) (space 48p)))))", null), wuq0.INSTANCE, cnr0.b, new uwl(null, null, null, null, null, null), null, null), false, 4);
            }
        }
        serviceCatalogRootRouterImpl$createLoadDocumentAction$1 = new ServiceCatalogRootRouterImpl$createLoadDocumentAction$1(bVar, continuationImpl);
        Object obj2 = serviceCatalogRootRouterImpl$createLoadDocumentAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = serviceCatalogRootRouterImpl$createLoadDocumentAction$1.label;
        if (i != 0) {
        }
        return new pwy(((ute0) obj2).a, new ywl(new aks0("(theme bgMinor 0.0p (padded 120p 38p (col 100% (repeat 2 (col (row 100% sb (repeat 4 (bone 48p 48p 16p))) (space 36p))) (space 52p) (col 100% (row 100% sb (repeat 4 (bone 48p 48p 16p))) (space 36p) (row 100% sb (repeat 2 (bone 48p 48p 16p)) (space 48p) (space 48p)) (space 36p)) (space 52p) (row 100% sb (repeat 2 (bone 48p 48p 16p)) (space 48p) (space 48p)))))", null), wuq0.INSTANCE, cnr0.b, new uwl(null, null, null, null, null, null), null, null), false, 4);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        m950 m950Var = (m950) this.E.get();
        com.yandex.div.core.expression.variables.a a = this.L.a();
        final ljr a2 = this.M.a(kjr.c, a);
        final a aVar = new a(this);
        ywl ywlVar = (ywl) this.G.b;
        rol0 rol0Var = ywlVar == null ? new rol0(new ServiceCatalogRootRouterImpl$createPreviewAndLoadActions$1(this, null)) : new rol0(new ServiceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1(ywlVar, null));
        g X = e.X(aVar.b, new ServiceCatalogRootRouterImpl$createFlexConfig$$inlined$flatMapLatest$1(this, null));
        D(m950Var, new nhr(new vlr("ServiceCatalog", new zm5(a, 5), new nao() { // from class: yuq0
            @Override // defpackage.nao
            public final mao a(l1o l1oVar) {
                b bVar = this;
                return new suq0(a.this, bVar.J, bVar.K, a2.a.a);
            }
        }, new g0p(this.H.b, null, null, null, null, null, null, null, 1022), new ykn0(7, this), null, null, this.F, null, null, null, null, null, null, null, null, null, null, null, 1048258), null, e.K(rol0Var, X, this.D.b()), null, null, Integer.valueOf(mqg0.transparent), new ServiceCatalogRootRouterImpl$createFlexConfig$1(1, this, b.class, "handleAction", "handleAction(Lflex/core/model/Action;)Z", 0), a2, null, null, 7770), new yio0(1, this));
        puq0 puq0Var = this.K;
        puq0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("endpoint", "bdui/v1/superapp/service-catalog");
        puq0Var.a.a("ServiceCatalog.LoadingStarted", hashMap, 1, new HashMap());
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G.b = null;
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.N;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean backward(boolean z, Map map) {
        this.K.a(ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState.Loaded);
        r(new qu(9));
        return true;
    }

    @Override // defpackage.o3l0
    public final boolean dismiss(boolean z, kr krVar, Map map) {
        r(new qu(9));
        return true;
    }

    @Override // defpackage.o3l0
    public final boolean forward(u1m u1mVar, ywl ywlVar, boolean z, Map map) {
        return false;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean hideOverlay(String str, boolean z, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean overlay(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean showOverlay(String str, ywl ywlVar, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean showPopup(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map, kr krVar) {
        return false;
    }
}
