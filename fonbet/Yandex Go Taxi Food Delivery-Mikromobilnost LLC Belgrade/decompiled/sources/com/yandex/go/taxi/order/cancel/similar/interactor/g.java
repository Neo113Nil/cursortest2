package com.yandex.go.taxi.order.cancel.similar.interactor;

import defpackage.f6j;
import defpackage.o2y0;
import defpackage.pz7;
import defpackage.uz7;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements vpr {
    public final /* synthetic */ com.yandex.go.taxi.order.titles.f a;
    public final /* synthetic */ h b;

    public g(com.yandex.go.taxi.order.titles.f fVar, h hVar) {
        this.a = fVar;
        this.b = hVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        o2y0 o2y0Var = (o2y0) obj;
        h hVar = this.b;
        this.a.c(o2y0Var, false, false, false, new uz7(hVar));
        pz7 pz7Var = hVar.d;
        Object k = kotlinx.coroutines.flow.e.k(pz7Var.b.a(o2y0Var.b(), (f6j) pz7Var.c.a.getValue()), new CancelSimilarOrdersDriverCardInteractor$onOrderUpdated$2(pz7Var, null), continuation);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : zy11.a;
    }
}
