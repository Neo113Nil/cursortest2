package com.ybsdk.feature.main.internal.data.network;

import com.ybsdk.feature.main.internal.data.network.dto.SbpAccountDetailsResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountDetailsResponse;", Constants.KEY_DATA, "Lkotlin/Result;", "Lwdm0;", "<anonymous>", "(Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountDetailsResponse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.data.network.SbpAccountRepository$getSbpAccountInfo$3$1", f = "SbpAccountRepository.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpAccountRepository$getSbpAccountInfo$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpAccountRepository$getSbpAccountInfo$3$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SbpAccountRepository$getSbpAccountInfo$3$1 sbpAccountRepository$getSbpAccountInfo$3$1 = new SbpAccountRepository$getSbpAccountInfo$3$1(this.this$0, continuation);
        sbpAccountRepository$getSbpAccountInfo$3$1.L$0 = obj;
        return sbpAccountRepository$getSbpAccountInfo$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpAccountRepository$getSbpAccountInfo$3$1) create((SbpAccountDetailsResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SbpAccountDetailsResponse sbpAccountDetailsResponse = (SbpAccountDetailsResponse) this.L$0;
            c cVar = this.this$0;
            this.label = 1;
            a = c.a(cVar, sbpAccountDetailsResponse, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
