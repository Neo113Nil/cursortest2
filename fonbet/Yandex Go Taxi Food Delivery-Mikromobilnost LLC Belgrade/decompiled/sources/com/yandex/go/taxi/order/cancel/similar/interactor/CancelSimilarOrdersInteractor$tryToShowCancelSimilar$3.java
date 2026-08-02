package com.yandex.go.taxi.order.cancel.similar.interactor;

import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import defpackage.hxx;
import defpackage.m08;
import defpackage.mvg;
import defpackage.n08;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xh60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.similar.interactor.CancelSimilarOrdersInteractor$tryToShowCancelSimilar$3", f = "CancelSimilarOrdersInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelSimilarOrdersInteractor$tryToShowCancelSimilar$3 extends SuspendLambda implements wls {
    final /* synthetic */ xh60 $notification;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelSimilarOrdersInteractor$tryToShowCancelSimilar$3(i iVar, xh60 xh60Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$notification = xh60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelSimilarOrdersInteractor$tryToShowCancelSimilar$3(this.this$0, this.$notification, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CancelSimilarOrdersInteractor$tryToShowCancelSimilar$3 cancelSimilarOrdersInteractor$tryToShowCancelSimilar$3 = (CancelSimilarOrdersInteractor$tryToShowCancelSimilar$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cancelSimilarOrdersInteractor$tryToShowCancelSimilar$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        n08 n08Var = (n08) this.this$0.a.get();
        i iVar = this.this$0;
        iVar.g = n08Var;
        ((pep0) iVar.e).f(n08Var, new m08((CancelSimilarOrdersNotification) this.$notification.b), hxx.a);
        return zy11.a;
    }
}
