package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data;

import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetSuggestedMobileProviderRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetSuggestedMobileProviderResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data.MobilePaymentSelectContactRepository$getProviderByPhone$2", f = "MobilePaymentSelectContactRepository.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MobilePaymentSelectContactRepository$getProviderByPhone$2 extends SuspendLambda implements tls {
    final /* synthetic */ GetSuggestedMobileProviderRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilePaymentSelectContactRepository$getProviderByPhone$2(a aVar, GetSuggestedMobileProviderRequest getSuggestedMobileProviderRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = getSuggestedMobileProviderRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MobilePaymentSelectContactRepository$getProviderByPhone$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MobilePaymentSelectContactRepository$getProviderByPhone$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Transfer2Api transfer2Api = this.this$0.a;
            GetSuggestedMobileProviderRequest getSuggestedMobileProviderRequest = this.$request;
            this.label = 1;
            j = transfer2Api.j(getSuggestedMobileProviderRequest, this);
            if (j == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            j = ((Result) obj).getValue();
        }
        return new Result(j);
    }
}
