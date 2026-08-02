package com.yandex.go.shortcuts.impl.repository;

import android.content.Context;
import com.yandex.go.shortcuts.impl.experiments.OrderNotificationsSettingsExperiment;
import defpackage.d60;
import defpackage.gpq;
import defpackage.gsv0;
import defpackage.h980;
import defpackage.hbp0;
import defpackage.jqr;
import defpackage.n3a;
import defpackage.tj60;
import defpackage.tje;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public final class i implements gpq {
    public final d60 a;
    public final Context b;
    public final com.yandex.go.superapp.tracking.data.e c;
    public final tj60 d;
    public final j e;
    public final gsv0 f;
    public final com.yandex.go.navigation.screen.c g;
    public final n3a h;
    public final com.yandex.go.taxi.order.titles.f i;
    public final hbp0 j;
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public i(d60 d60Var, Context context, com.yandex.go.superapp.tracking.data.e eVar, tj60 tj60Var, j jVar, gsv0 gsv0Var, com.yandex.go.navigation.screen.c cVar, n3a n3aVar, h980 h980Var) {
        this.a = d60Var;
        this.b = context;
        this.c = eVar;
        this.d = tj60Var;
        this.e = jVar;
        this.f = gsv0Var;
        this.g = cVar;
        this.h = n3aVar;
        this.i = h980Var.a();
        this.j = new hbp0(new FeedOrderStatusNotificationRepositoryImpl$scope$1(0, d60Var, d60.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    public final void a() {
        if (((OrderNotificationsSettingsExperiment) this.h.b.b()).b) {
            hbp0 hbp0Var = this.j;
            hbp0Var.f();
            tje.N(hbp0Var, null, null, new FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new jqr(new e(new c(new g(kotlinx.coroutines.flow.e.C(this.c.v, new FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$flatMapMerge$1(2, null))), this), this), new FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$4(2, this, i.class, "savePreviousOrderState", "savePreviousOrderState(Lcom/yandex/go/superapp/tracking/api/domain/models/TaxiOrderTracking;)V", 4), 3)), null, this), 3);
        }
    }
}
