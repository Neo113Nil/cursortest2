package com.ybsdk.feature.partnerpayments.internal.domain;

import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s9u0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldqg;", "Ls9u0;", "Lcom/ybsdk/feature/partnerpayments/internal/domain/StatusWithAction;", "", "<anonymous>", "(Ldqg;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerpayments.internal.domain.PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$2", f = "PartnerPaymentsInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$2 partnerPaymentsInteractor$getPartnerPaymentSaveStatus$2 = new PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$2(2, continuation);
        partnerPaymentsInteractor$getPartnerPaymentSaveStatus$2.L$0 = obj;
        return partnerPaymentsInteractor$getPartnerPaymentSaveStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$2) create((dqg) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        dqg dqgVar = (dqg) this.L$0;
        boolean z = true;
        if (dqgVar instanceof cqg) {
            if (jl40.l(((s9u0) ((cqg) dqgVar).a).a, "IN_PROGRESS")) {
                z = false;
            }
        } else if (!(dqgVar instanceof bqg)) {
            w511.b();
            return null;
        }
        return Boolean.valueOf(z);
    }
}
