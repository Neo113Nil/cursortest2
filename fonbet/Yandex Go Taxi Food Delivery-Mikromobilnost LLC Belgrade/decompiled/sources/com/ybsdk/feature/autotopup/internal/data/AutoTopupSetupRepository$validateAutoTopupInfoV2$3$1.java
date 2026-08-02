package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.ValidateAutoTopupV2SuccessData;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.uy21;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/ValidateAutoTopupV2SuccessData;", "validateAutoTopupV2SuccessData", "Luy21;", "<anonymous>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/ValidateAutoTopupV2SuccessData;)Luy21;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$validateAutoTopupInfoV2$3$1", f = "AutoTopupSetupRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$validateAutoTopupInfoV2$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$validateAutoTopupInfoV2$3$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupRepository$validateAutoTopupInfoV2$3$1 autoTopupSetupRepository$validateAutoTopupInfoV2$3$1 = new AutoTopupSetupRepository$validateAutoTopupInfoV2$3$1(this.this$0, continuation);
        autoTopupSetupRepository$validateAutoTopupInfoV2$3$1.L$0 = obj;
        return autoTopupSetupRepository$validateAutoTopupInfoV2$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupRepository$validateAutoTopupInfoV2$3$1) create((ValidateAutoTopupV2SuccessData) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ValidateAutoTopupV2SuccessData validateAutoTopupV2SuccessData = (ValidateAutoTopupV2SuccessData) this.L$0;
        this.this$0.getClass();
        return new uy21(validateAutoTopupV2SuccessData.getSnackbar() != null ? new n0t0(d.f(validateAutoTopupV2SuccessData.getSnackbar().getTitle()), d.f(validateAutoTopupV2SuccessData.getSnackbar().getSubtitle())) : null, validateAutoTopupV2SuccessData.getErrors());
    }
}
