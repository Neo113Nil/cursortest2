package com.ybsdk.feature.partnerselection.internal.screens.partners.domain;

import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
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

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lar51;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerselection.internal.screens.partners.domain.PartnerCheckInteractorImpl$checkPartner$1$1$1", f = "PartnerCheckInteractorImpl.kt", l = {357}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerCheckInteractorImpl$checkPartner$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ PartnerEntity $partner;
    final /* synthetic */ String $receiverPhone;
    final /* synthetic */ String $transferId;
    final /* synthetic */ String $transferType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerCheckInteractorImpl$checkPartner$1$1$1(a aVar, String str, PartnerEntity partnerEntity, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$agreementId = str;
        this.$partner = partnerEntity;
        this.$transferId = str2;
        this.$transferType = str3;
        this.$receiverPhone = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PartnerCheckInteractorImpl$checkPartner$1$1$1 partnerCheckInteractorImpl$checkPartner$1$1$1 = new PartnerCheckInteractorImpl$checkPartner$1$1$1(this.this$0, this.$agreementId, this.$partner, this.$transferId, this.$transferType, this.$receiverPhone, continuation);
        partnerCheckInteractorImpl$checkPartner$1$1$1.L$0 = obj;
        return partnerCheckInteractorImpl$checkPartner$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerCheckInteractorImpl$checkPartner$1$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            a aVar = this.this$0;
            String str2 = this.$agreementId;
            String partnerId = this.$partner.getPartnerId();
            String str3 = this.$transferId;
            String str4 = this.$transferType;
            String str5 = this.$receiverPhone;
            this.label = 1;
            a = a.a(aVar, str2, partnerId, str3, str4, str5, str, this);
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
