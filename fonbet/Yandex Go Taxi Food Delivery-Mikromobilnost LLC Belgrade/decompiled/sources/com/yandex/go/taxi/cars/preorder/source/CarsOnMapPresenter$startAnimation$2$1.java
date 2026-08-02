package com.yandex.go.taxi.cars.preorder.source;

import defpackage.a09;
import defpackage.c09;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "", "Lpb30;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.cars.preorder.source.CarsOnMapPresenter$startAnimation$2$1", f = "CarsOnMapPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CarsOnMapPresenter$startAnimation$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $tick;
    int label;
    final /* synthetic */ c09 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarsOnMapPresenter$startAnimation$2$1(c09 c09Var, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c09Var;
        this.$tick = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CarsOnMapPresenter$startAnimation$2$1(this.this$0, this.$tick, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarsOnMapPresenter$startAnimation$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a09 a09Var = this.this$0.y;
        new Long(this.$tick);
        return a09Var.a();
    }
}
