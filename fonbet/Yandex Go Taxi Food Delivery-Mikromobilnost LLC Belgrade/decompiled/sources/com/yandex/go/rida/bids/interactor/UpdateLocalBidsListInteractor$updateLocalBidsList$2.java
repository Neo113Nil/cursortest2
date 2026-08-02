package com.yandex.go.rida.bids.interactor;

import defpackage.e721;
import defpackage.f721;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.UpdateLocalBidsListInteractor$updateLocalBidsList$2", f = "UpdateLocalBidsListInteractor.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class UpdateLocalBidsListInteractor$updateLocalBidsList$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f721 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateLocalBidsListInteractor$updateLocalBidsList$2(f721 f721Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f721Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateLocalBidsListInteractor$updateLocalBidsList$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateLocalBidsListInteractor$updateLocalBidsList$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h0 h0Var = new h0(this.this$0.b.a());
            e721 e721Var = new e721(this.this$0);
            this.label = 1;
            if (h0Var.collect(e721Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
