package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.CreateAutoTopupRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/CreateAutoTopupResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupRepository$createAutoTopup$2", f = "AutoTopupRepository.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupRepository$createAutoTopup$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ CreateAutoTopupRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupRepository$createAutoTopup$2(a aVar, CreateAutoTopupRequest createAutoTopupRequest, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = createAutoTopupRequest;
        this.$idempotencyToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupRepository$createAutoTopup$2(this.this$0, this.$request, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupRepository$createAutoTopup$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AutoTopupApi autoTopupApi = this.this$0.a;
            CreateAutoTopupRequest createAutoTopupRequest = this.$request;
            String str = this.$idempotencyToken;
            this.label = 1;
            l = autoTopupApi.l(createAutoTopupRequest, str, this);
            if (l == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            l = ((Result) obj).getValue();
        }
        return new Result(l);
    }
}
