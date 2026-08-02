package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.feature.autotopup.internal.network.dto.v2.SaveAutoTopupV2SuccessResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ozl0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2SuccessResponse;", "response", "Lozl0;", "<anonymous>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2SuccessResponse;)Lozl0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$saveAutoTopupV2$3$1", f = "AutoTopupSetupRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$saveAutoTopupV2$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupRepository$saveAutoTopupV2$3$1 autoTopupSetupRepository$saveAutoTopupV2$3$1 = new AutoTopupSetupRepository$saveAutoTopupV2$3$1(2, continuation);
        autoTopupSetupRepository$saveAutoTopupV2$3$1.L$0 = obj;
        return autoTopupSetupRepository$saveAutoTopupV2$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupRepository$saveAutoTopupV2$3$1) create((SaveAutoTopupV2SuccessResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SaveAutoTopupV2SuccessResponse saveAutoTopupV2SuccessResponse = (SaveAutoTopupV2SuccessResponse) this.L$0;
        return new ozl0(saveAutoTopupV2SuccessResponse.getRequestId(), saveAutoTopupV2SuccessResponse.getAction());
    }
}
