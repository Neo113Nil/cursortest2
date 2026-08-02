package com.ybsdk.feature.transfer.version2.internal.screens.requisites.data;

import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckAccountBicRequest;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckAccountBicDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckAccountBicResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.requisites.data.Transfer2RequisitesRepository$checkAccountBic$2", f = "Transfer2RequisitesRepository.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2RequisitesRepository$checkAccountBic$2 extends SuspendLambda implements tls {
    final /* synthetic */ CheckAccountBicRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2RequisitesRepository$checkAccountBic$2(a aVar, CheckAccountBicRequest checkAccountBicRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = checkAccountBicRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Transfer2RequisitesRepository$checkAccountBic$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Transfer2RequisitesRepository$checkAccountBic$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Transfer2Api transfer2Api = this.this$0.a;
            CheckAccountBicRequest checkAccountBicRequest = this.$request;
            this.label = 1;
            l = transfer2Api.l(checkAccountBicRequest, this);
            if (l == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            l = ((Result) obj).getValue();
        }
        return new Result(l);
    }
}
