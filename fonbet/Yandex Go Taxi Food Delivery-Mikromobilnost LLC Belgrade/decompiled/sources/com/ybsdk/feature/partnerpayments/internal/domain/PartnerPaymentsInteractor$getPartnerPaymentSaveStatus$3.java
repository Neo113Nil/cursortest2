package com.ybsdk.feature.partnerpayments.internal.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Ldqg;", "Ls9u0;", "Lcom/ybsdk/feature/partnerpayments/internal/domain/StatusWithAction;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerpayments.internal.domain.PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$3", f = "PartnerPaymentsInteractor.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $requestId;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$3(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$3 partnerPaymentsInteractor$getPartnerPaymentSaveStatus$3 = new PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$3(this.this$0, this.$requestId, continuation);
        partnerPaymentsInteractor$getPartnerPaymentSaveStatus$3.I$0 = ((tq11) obj).a;
        return partnerPaymentsInteractor$getPartnerPaymentSaveStatus$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$3 partnerPaymentsInteractor$getPartnerPaymentSaveStatus$3 = new PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$3(this.this$0, this.$requestId, (Continuation) obj2);
        partnerPaymentsInteractor$getPartnerPaymentSaveStatus$3.I$0 = i;
        return partnerPaymentsInteractor$getPartnerPaymentSaveStatus$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.partnerpayments.internal.data.a aVar = this.this$0.a;
            String str = this.$requestId;
            this.label = 1;
            a = aVar.a(i2, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
