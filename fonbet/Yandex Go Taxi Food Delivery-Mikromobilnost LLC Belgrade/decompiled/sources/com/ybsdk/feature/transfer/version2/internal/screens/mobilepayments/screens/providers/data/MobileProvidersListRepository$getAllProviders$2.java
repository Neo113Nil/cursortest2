package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.data;

import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetAllMobileProvidersRequest;
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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetAllMobileProvidersResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.data.MobileProvidersListRepository$getAllProviders$2", f = "MobileProvidersListRepository.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MobileProvidersListRepository$getAllProviders$2 extends SuspendLambda implements tls {
    final /* synthetic */ GetAllMobileProvidersRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileProvidersListRepository$getAllProviders$2(a aVar, GetAllMobileProvidersRequest getAllMobileProvidersRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = getAllMobileProvidersRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MobileProvidersListRepository$getAllProviders$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MobileProvidersListRepository$getAllProviders$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object A;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Transfer2Api transfer2Api = this.this$0.a;
            GetAllMobileProvidersRequest getAllMobileProvidersRequest = this.$request;
            this.label = 1;
            A = transfer2Api.A(getAllMobileProvidersRequest, this);
            if (A == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            A = ((Result) obj).getValue();
        }
        return new Result(A);
    }
}
