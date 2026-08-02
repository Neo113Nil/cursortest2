package com.yandex.go.taxi.order.communications.analytics.realtime;

import com.yandex.go.taxi.order.view.i;
import com.yandex.go.taxi.order.view.l;
import defpackage.hbp0;
import defpackage.n20;
import defpackage.o2y0;
import defpackage.tt2;
import defpackage.wpf0;
import defpackage.ypf0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class a {
    public final wpf0 a;
    public final ypf0 b;
    public final n20 c;
    public final l d;
    public final hbp0 e;
    public final boolean f;

    public a(wpf0 wpf0Var, ypf0 ypf0Var, n20 n20Var, l lVar, tt2 tt2Var) {
        this.a = wpf0Var;
        this.b = ypf0Var;
        this.c = n20Var;
        this.d = lVar;
        this.e = new hbp0(new PromoPlaquesRealtimeAnalyticsInteractor$scope$1(0, tt2Var, tt2.class, "main", "main()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
        this.f = wpf0Var.d;
    }

    public final void a() {
        hbp0 hbp0Var = this.e;
        hbp0Var.f();
        if (this.f) {
            e.H(hbp0Var, new m0(e.X(((com.yandex.go.taxi.order.provider.a) this.c).a(), new PromoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$$inlined$flatMapLatest$1(3, null)), e.t(new i(this.d.j)), new PromoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1(this, null)));
            hbp0.e(hbp0Var, null, null, new PromoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$2(this, null), 3);
            this.b.b();
        }
    }

    public final void b(o2y0 o2y0Var) {
        if (this.f) {
            hbp0.e(this.e, null, null, new PromoPlaquesRealtimeAnalyticsInteractor$onActiveOrderChanged$1(this, o2y0Var, null), 3);
        }
    }
}
