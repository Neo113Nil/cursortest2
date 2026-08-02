package com.yandex.go.routestops.v2.interactor;

import defpackage.bvf0;
import defpackage.fcj0;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class a {
    public final fcj0 a;
    public final com.yandex.go.taxi.summary.routestops.e b;

    public a(fcj0 fcj0Var, com.yandex.go.taxi.summary.routestops.e eVar) {
        this.a = fcj0Var;
        this.b = eVar;
    }

    public final Object a(Continuation continuation) {
        return bvf0.n(new RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2(this, null), continuation);
    }
}
