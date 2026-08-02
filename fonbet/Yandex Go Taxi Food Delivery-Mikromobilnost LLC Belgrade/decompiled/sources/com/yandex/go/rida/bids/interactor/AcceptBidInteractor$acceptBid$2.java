package com.yandex.go.rida.bids.interactor;

import com.yandex.go.rida.bids.controller.BidsControllerAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.AcceptBidInteractor$acceptBid$2", f = "AcceptBidInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AcceptBidInteractor$acceptBid$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $bidId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptBidInteractor$acceptBid$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$bidId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AcceptBidInteractor$acceptBid$2(this.this$0, this.$bidId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AcceptBidInteractor$acceptBid$2 acceptBidInteractor$acceptBid$2 = (AcceptBidInteractor$acceptBid$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        acceptBidInteractor$acceptBid$2.invokeSuspend(zy11Var);
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
        this.this$0.a.b(this.$bidId, BidsControllerAction.OnAcceptFailed);
        return zy11.a;
    }
}
