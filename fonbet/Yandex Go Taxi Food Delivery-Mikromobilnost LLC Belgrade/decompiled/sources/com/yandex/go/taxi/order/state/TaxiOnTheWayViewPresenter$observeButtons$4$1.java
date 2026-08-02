package com.yandex.go.taxi.order.state;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.v4j;
import defpackage.x4j;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx4j;", "topState", "bottomState", "", "<anonymous>", "(Lx4j;Lx4j;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.TaxiOnTheWayViewPresenter$observeButtons$4$1", f = "TaxiOnTheWayViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOnTheWayViewPresenter$observeButtons$4$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TaxiOnTheWayViewPresenter$observeButtons$4$1 taxiOnTheWayViewPresenter$observeButtons$4$1 = new TaxiOnTheWayViewPresenter$observeButtons$4$1(3, (Continuation) obj3);
        taxiOnTheWayViewPresenter$observeButtons$4$1.L$0 = (x4j) obj;
        taxiOnTheWayViewPresenter$observeButtons$4$1.L$1 = (x4j) obj2;
        return taxiOnTheWayViewPresenter$observeButtons$4$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x4j x4jVar = (x4j) this.L$0;
        x4j x4jVar2 = (x4j) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(((x4jVar instanceof v4j) || (x4jVar2 instanceof v4j)) ? false : true);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
