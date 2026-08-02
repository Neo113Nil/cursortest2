package com.ybsdk.feature.transfer.version2.internal.screens.requisites.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckAccountBicDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckAccountBicDto;", "dto", "Lyj;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckAccountBicDto;)Lyj;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.requisites.data.Transfer2RequisitesRepository$checkAccountBic$3$1", f = "Transfer2RequisitesRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2RequisitesRepository$checkAccountBic$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transfer2RequisitesRepository$checkAccountBic$3$1 transfer2RequisitesRepository$checkAccountBic$3$1 = new Transfer2RequisitesRepository$checkAccountBic$3$1(2, continuation);
        transfer2RequisitesRepository$checkAccountBic$3$1.L$0 = obj;
        return transfer2RequisitesRepository$checkAccountBic$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Transfer2RequisitesRepository$checkAccountBic$3$1) create((CheckAccountBicDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        CheckAccountBicDto checkAccountBicDto = (CheckAccountBicDto) this.L$0;
        return new yj(checkAccountBicDto.getAccountNumberError(), checkAccountBicDto.getBicError());
    }
}
