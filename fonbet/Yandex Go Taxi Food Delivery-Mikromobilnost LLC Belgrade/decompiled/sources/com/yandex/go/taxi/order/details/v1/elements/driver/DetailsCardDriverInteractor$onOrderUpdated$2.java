package com.yandex.go.taxi.order.details.v1.elements.driver;

import defpackage.f6j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf6j;", "it", "Lzy11;", "<anonymous>", "(Lf6j;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.driver.DetailsCardDriverInteractor$onOrderUpdated$2", f = "DetailsCardDriverInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardDriverInteractor$onOrderUpdated$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardDriverInteractor$onOrderUpdated$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DetailsCardDriverInteractor$onOrderUpdated$2 detailsCardDriverInteractor$onOrderUpdated$2 = new DetailsCardDriverInteractor$onOrderUpdated$2(this.this$0, continuation);
        detailsCardDriverInteractor$onOrderUpdated$2.L$0 = obj;
        return detailsCardDriverInteractor$onOrderUpdated$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DetailsCardDriverInteractor$onOrderUpdated$2 detailsCardDriverInteractor$onOrderUpdated$2 = (DetailsCardDriverInteractor$onOrderUpdated$2) create((f6j) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        detailsCardDriverInteractor$onOrderUpdated$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f6j f6jVar = (f6j) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.a.a.l(f6jVar);
        return zy11.a;
    }
}
