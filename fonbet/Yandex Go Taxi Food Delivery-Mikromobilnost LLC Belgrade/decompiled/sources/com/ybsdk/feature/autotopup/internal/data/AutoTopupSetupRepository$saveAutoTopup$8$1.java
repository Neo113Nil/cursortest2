package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupSuccessResponse;
import defpackage.i04;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse;", "response", "Lty3;", "<anonymous>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse;)Lty3;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$saveAutoTopup$8$1", f = "AutoTopupSetupRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$saveAutoTopup$8$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isV2RequestStatusEnabled;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$saveAutoTopup$8$1(boolean z, Continuation continuation) {
        super(2, continuation);
        this.$isV2RequestStatusEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupRepository$saveAutoTopup$8$1 autoTopupSetupRepository$saveAutoTopup$8$1 = new AutoTopupSetupRepository$saveAutoTopup$8$1(this.$isV2RequestStatusEnabled, continuation);
        autoTopupSetupRepository$saveAutoTopup$8$1.L$0 = obj;
        return autoTopupSetupRepository$saveAutoTopup$8$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupRepository$saveAutoTopup$8$1) create((SaveAutoTopupSuccessResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return i04.c((SaveAutoTopupSuccessResponse) this.L$0, this.$isV2RequestStatusEnabled);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
