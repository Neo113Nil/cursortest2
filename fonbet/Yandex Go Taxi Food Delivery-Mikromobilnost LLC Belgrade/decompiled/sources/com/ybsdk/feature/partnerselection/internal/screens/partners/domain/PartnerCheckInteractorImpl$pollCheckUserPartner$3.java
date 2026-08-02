package com.ybsdk.feature.partnerselection.internal.screens.partners.domain;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lar51;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerselection.internal.screens.partners.domain.PartnerCheckInteractorImpl$pollCheckUserPartner$3", f = "PartnerCheckInteractorImpl.kt", l = {394}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerCheckInteractorImpl$pollCheckUserPartner$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $partnerId;
    final /* synthetic */ String $receiverPhone;
    final /* synthetic */ String $transferId;
    final /* synthetic */ String $transferType;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerCheckInteractorImpl$pollCheckUserPartner$3(a aVar, String str, String str2, String str3, String str4, String str5, String str6, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$agreementId = str;
        this.$receiverPhone = str2;
        this.$partnerId = str3;
        this.$idempotencyToken = str4;
        this.$transferId = str5;
        this.$transferType = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PartnerCheckInteractorImpl$pollCheckUserPartner$3 partnerCheckInteractorImpl$pollCheckUserPartner$3 = new PartnerCheckInteractorImpl$pollCheckUserPartner$3(this.this$0, this.$agreementId, this.$receiverPhone, this.$partnerId, this.$idempotencyToken, this.$transferId, this.$transferType, continuation);
        partnerCheckInteractorImpl$pollCheckUserPartner$3.I$0 = ((tq11) obj).a;
        return partnerCheckInteractorImpl$pollCheckUserPartner$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        PartnerCheckInteractorImpl$pollCheckUserPartner$3 partnerCheckInteractorImpl$pollCheckUserPartner$3 = new PartnerCheckInteractorImpl$pollCheckUserPartner$3(this.this$0, this.$agreementId, this.$receiverPhone, this.$partnerId, this.$idempotencyToken, this.$transferId, this.$transferType, (Continuation) obj2);
        partnerCheckInteractorImpl$pollCheckUserPartner$3.I$0 = i;
        return partnerCheckInteractorImpl$pollCheckUserPartner$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = this.I$0;
            a aVar = this.this$0;
            com.ybsdk.feature.partnerselection.internal.data.helpers.a aVar2 = aVar.v;
            String str = this.$agreementId;
            String str2 = this.$receiverPhone;
            String str3 = this.$partnerId;
            String str4 = this.$idempotencyToken;
            MoneyEntity moneyEntity = aVar.i;
            Money money = moneyEntity != null ? new Money(moneyEntity.getAmount(), moneyEntity.getCurrency()) : null;
            String str5 = this.this$0.j;
            String str6 = this.$transferId;
            String str7 = this.$transferType;
            this.label = 1;
            a = aVar2.a(str, str2, str3, str4, money, str5, str6, str7, i2, this);
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
