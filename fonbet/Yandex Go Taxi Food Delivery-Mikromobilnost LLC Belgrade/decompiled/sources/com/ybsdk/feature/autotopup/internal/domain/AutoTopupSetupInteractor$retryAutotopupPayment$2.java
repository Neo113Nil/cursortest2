package com.ybsdk.feature.autotopup.internal.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Ldqg;", "Lda4;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.domain.AutoTopupSetupInteractor$retryAutotopupPayment$2", f = "AutoTopupSetupInteractor.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupInteractor$retryAutotopupPayment$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $failedPaymentId;
    final /* synthetic */ boolean $isV2Enabled;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupInteractor$retryAutotopupPayment$2(e eVar, String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$agreementId = str;
        this.$failedPaymentId = str2;
        this.$isV2Enabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupInteractor$retryAutotopupPayment$2 autoTopupSetupInteractor$retryAutotopupPayment$2 = new AutoTopupSetupInteractor$retryAutotopupPayment$2(this.this$0, this.$agreementId, this.$failedPaymentId, this.$isV2Enabled, continuation);
        autoTopupSetupInteractor$retryAutotopupPayment$2.L$0 = obj;
        return autoTopupSetupInteractor$retryAutotopupPayment$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupInteractor$retryAutotopupPayment$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.autotopup.internal.data.b bVar = this.this$0.a;
            String str2 = this.$agreementId;
            String str3 = this.$failedPaymentId;
            boolean z = this.$isV2Enabled;
            this.label = 1;
            j = bVar.j(str2, str3, str, z, this);
            if (j == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            j = ((Result) obj).getValue();
        }
        return new Result(j);
    }
}
