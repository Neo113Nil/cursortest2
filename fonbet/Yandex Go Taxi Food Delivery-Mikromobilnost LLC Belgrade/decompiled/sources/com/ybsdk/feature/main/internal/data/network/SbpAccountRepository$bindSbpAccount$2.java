package com.ybsdk.feature.main.internal.data.network;

import com.ybsdk.feature.main.internal.data.network.dto.BindSbpAccountRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/main/internal/data/network/dto/BindSbpAccountResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.main.internal.data.network.SbpAccountRepository$bindSbpAccount$2", f = "SbpAccountRepository.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpAccountRepository$bindSbpAccount$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $ybId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpAccountRepository$bindSbpAccount$2(c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$ybId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SbpAccountRepository$bindSbpAccount$2(this.this$0, this.$ybId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SbpAccountRepository$bindSbpAccount$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SbpAccountApi sbpAccountApi = this.this$0.a;
            BindSbpAccountRequest bindSbpAccountRequest = new BindSbpAccountRequest(this.$ybId);
            this.label = 1;
            a = sbpAccountApi.a(bindSbpAccountRequest, this);
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
