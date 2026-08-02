package com.ybsdk.feature.main.internal.data.network;

import com.ybsdk.feature.main.internal.data.network.dto.BindSbpAccountResponse;
import defpackage.kpc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/BindSbpAccountResponse;", "response", "Lqv5;", "<anonymous>", "(Lcom/ybsdk/feature/main/internal/data/network/dto/BindSbpAccountResponse;)Lqv5;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.data.network.SbpAccountRepository$bindSbpAccount$3$1", f = "SbpAccountRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpAccountRepository$bindSbpAccount$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpAccountRepository$bindSbpAccount$3$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SbpAccountRepository$bindSbpAccount$3$1 sbpAccountRepository$bindSbpAccount$3$1 = new SbpAccountRepository$bindSbpAccount$3$1(this.this$0, continuation);
        sbpAccountRepository$bindSbpAccount$3$1.L$0 = obj;
        return sbpAccountRepository$bindSbpAccount$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpAccountRepository$bindSbpAccount$3$1) create((BindSbpAccountResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        BindSbpAccountResponse bindSbpAccountResponse = (BindSbpAccountResponse) this.L$0;
        this.this$0.getClass();
        return new qv5(bindSbpAccountResponse.getDeeplink(), kpc.a(bindSbpAccountResponse.getAppNotFoundSheet()));
    }
}
