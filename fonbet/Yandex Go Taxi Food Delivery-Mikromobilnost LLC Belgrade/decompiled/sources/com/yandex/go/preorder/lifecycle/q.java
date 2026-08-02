package com.yandex.go.preorder.lifecycle;

import com.yandex.go.preorder.lifecycle.q;
import com.yandex.go.preorder.mode.SourcePointMode;
import defpackage.dvw0;
import defpackage.hvd0;
import defpackage.i130;
import defpackage.lgt0;
import defpackage.pft0;
import defpackage.qtb1;
import defpackage.sls;
import defpackage.tse;
import defpackage.y9x0;
import defpackage.z9x0;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final class q implements pft0 {
    public final lgt0 a;
    public final hvd0 b;
    public final y9x0 c;
    public final i130 d;
    public final ru.yandex.taxi.preorder.source.mode.interactor.e e;

    public q(lgt0 lgt0Var, hvd0 hvd0Var, y9x0 y9x0Var, i130 i130Var, ru.yandex.taxi.preorder.source.mode.interactor.e eVar) {
        this.a = lgt0Var;
        this.b = hvd0Var;
        this.c = y9x0Var;
        this.d = i130Var;
        this.e = eVar;
    }

    @Override // defpackage.pft0
    public final void a(tse tseVar) {
        TappablePoiLifecycleListener$onAttach$delegate$1 tappablePoiLifecycleListener$onAttach$delegate$1 = new TappablePoiLifecycleListener$onAttach$delegate$1(1, this.a, lgt0.class, "moveToPoint", "moveToPoint(Lru/yandex/taxi/common_models/net/GeoPoint;Ljava/lang/String;)V", 0);
        TappablePoiLifecycleListener$onAttach$delegate$2 tappablePoiLifecycleListener$onAttach$delegate$2 = new TappablePoiLifecycleListener$onAttach$delegate$2(1, this.b, hvd0.class, "pointTapped", "pointTapped(Lru/yandex/taxi/common_models/net/GeoPoint;)Z", 8);
        dvw0 dvw0Var = new dvw0(24);
        final int i = 0;
        sls slsVar = new sls(this) { // from class: hax0
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                q qVar = this.b;
                switch (i2) {
                    case 0:
                        RouteSelectorModalView routeSelectorModalView = (RouteSelectorModalView) qVar.d.a().r(true, RouteSelectorModalView.class);
                        return Boolean.valueOf(routeSelectorModalView != null ? routeSelectorModalView.isClarifyMode() : false);
                    default:
                        return Boolean.valueOf(qVar.e.a.a() == SourcePointMode.POINT_WITH_ROUTE);
                }
            }
        };
        final int i2 = 1;
        ((z9x0) this.c).a(qtb1.j(tappablePoiLifecycleListener$onAttach$delegate$1, tappablePoiLifecycleListener$onAttach$delegate$2, dvw0Var, slsVar, new sls(this) { // from class: hax0
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                q qVar = this.b;
                switch (i22) {
                    case 0:
                        RouteSelectorModalView routeSelectorModalView = (RouteSelectorModalView) qVar.d.a().r(true, RouteSelectorModalView.class);
                        return Boolean.valueOf(routeSelectorModalView != null ? routeSelectorModalView.isClarifyMode() : false);
                    default:
                        return Boolean.valueOf(qVar.e.a.a() == SourcePointMode.POINT_WITH_ROUTE);
                }
            }
        }, null, null, 224));
    }

    @Override // defpackage.pft0
    public final void onDetach() {
        ((z9x0) this.c).b();
    }
}
