package com.ybsdk.feature.partnerpayments.internal.domain;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.partnerpayments.api.PartnerPaymentsFeature$BindingStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Ldqg;", "Ld7j0;", "Lcom/ybsdk/feature/partnerpayments/internal/domain/RequestId;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerpayments.internal.domain.PartnerPaymentsInteractor$savePartnerId$2", f = "PartnerPaymentsInteractor.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerPaymentsInteractor$savePartnerId$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $partnerId;
    final /* synthetic */ PartnerPaymentsFeature$BindingStatus $status;
    final /* synthetic */ String $ybCardAgreementId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerPaymentsInteractor$savePartnerId$2(a aVar, String str, String str2, PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$partnerId = str;
        this.$ybCardAgreementId = str2;
        this.$status = partnerPaymentsFeature$BindingStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PartnerPaymentsInteractor$savePartnerId$2 partnerPaymentsInteractor$savePartnerId$2 = new PartnerPaymentsInteractor$savePartnerId$2(this.this$0, this.$partnerId, this.$ybCardAgreementId, this.$status, continuation);
        partnerPaymentsInteractor$savePartnerId$2.L$0 = obj;
        return partnerPaymentsInteractor$savePartnerId$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerPaymentsInteractor$savePartnerId$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.partnerpayments.internal.data.a aVar = this.this$0.a;
            String str2 = this.$partnerId;
            String str3 = this.$ybCardAgreementId;
            PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus = this.$status;
            this.label = 1;
            b = aVar.b(str2, str3, str, partnerPaymentsFeature$BindingStatus, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
