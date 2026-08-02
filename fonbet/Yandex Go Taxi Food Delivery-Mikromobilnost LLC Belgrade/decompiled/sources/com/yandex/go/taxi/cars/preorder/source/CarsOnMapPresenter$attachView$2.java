package com.yandex.go.taxi.cars.preorder.source;

import defpackage.c09;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.ylc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lylc;", "commands", "Lzy11;", "<anonymous>", "(Lylc;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.cars.preorder.source.CarsOnMapPresenter$attachView$2", f = "CarsOnMapPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CarsOnMapPresenter$attachView$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c09 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarsOnMapPresenter$attachView$2(c09 c09Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c09Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CarsOnMapPresenter$attachView$2 carsOnMapPresenter$attachView$2 = new CarsOnMapPresenter$attachView$2(this.this$0, continuation);
        carsOnMapPresenter$attachView$2.L$0 = obj;
        return carsOnMapPresenter$attachView$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CarsOnMapPresenter$attachView$2 carsOnMapPresenter$attachView$2 = (CarsOnMapPresenter$attachView$2) create((ylc) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        carsOnMapPresenter$attachView$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ylc ylcVar = (ylc) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.y.b(ylcVar);
        return zy11.a;
    }
}
