package com.yandex.go.routestops.v2.interactor;

import com.yandex.go.routestops.v2.interactor.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ah00;
import defpackage.dib1;
import defpackage.ffl0;
import defpackage.i3y;
import defpackage.jf61;
import defpackage.mth;
import defpackage.nr41;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zuj0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class c {
    public final zuj0 a;
    public final ffl0 b;
    public final nr41 c;
    public final i3y d;
    public final i3y e;

    public c(tt2 tt2Var, zuj0 zuj0Var, ffl0 ffl0Var, nr41 nr41Var) {
        this.a = zuj0Var;
        this.b = ffl0Var;
        this.c = nr41Var;
        final int i = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: ael0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                c cVar = this.b;
                switch (i2) {
                    case 0:
                        return ((avj0) cVar.a).h(kyh0.intermediate_points_title);
                    default:
                        return ((avj0) cVar.a).h(kyh0.common_done);
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.a.a(new sls(this) { // from class: ael0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) cVar.a).h(kyh0.intermediate_points_title);
                    default:
                        return ((avj0) cVar.a).h(kyh0.common_done);
                }
            }
        });
    }

    public final tpr a() {
        ffl0 ffl0Var = this.b;
        com.yandex.go.taxi.summary.routestops.e eVar = ffl0Var.b;
        return kotlinx.coroutines.flow.e.F(new m0(new mth(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.n(eVar.d(), eVar.a(), new ru.yandex.taxi.tariffs.interactor.b(((k) ffl0Var.c.a).j.b()), new RouteUiStateInteractor$uiStateFlow$1(ffl0Var, null)), 100L), 6), com.yandex.go.coroutines.b.d(new e(dib1.c((ah00) this.c.b)), new ZoomRouteButtonStateInteractor$uiStateFlow$$inlined$start$1(new jf61(false), null)), new RouteStopsV2UiStateInteractor$uiStateFlow$1(this, null)), uyj.a);
    }
}
