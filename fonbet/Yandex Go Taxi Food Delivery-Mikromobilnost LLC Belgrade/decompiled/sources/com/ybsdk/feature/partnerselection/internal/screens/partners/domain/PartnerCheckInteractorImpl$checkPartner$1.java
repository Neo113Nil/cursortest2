package com.ybsdk.feature.partnerselection.internal.screens.partners.domain;

import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.di.modules.features.l;
import com.ybsdk.feature.partnerselection.api.PartnerWithAction$Status;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uc5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerselection.internal.screens.partners.domain.PartnerCheckInteractorImpl$checkPartner$1", f = "PartnerCheckInteractorImpl.kt", l = {352, 356, 372}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerCheckInteractorImpl$checkPartner$1 extends SuspendLambda implements wls {
    final /* synthetic */ PartnerEntity $partner;
    final /* synthetic */ String $receiverPhone;
    final /* synthetic */ String $transferId;
    final /* synthetic */ String $transferType;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerCheckInteractorImpl$checkPartner$1(a aVar, PartnerEntity partnerEntity, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$partner = partnerEntity;
        this.$transferId = str;
        this.$transferType = str2;
        this.$receiverPhone = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PartnerCheckInteractorImpl$checkPartner$1(this.this$0, this.$partner, this.$transferId, this.$transferType, this.$receiverPhone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerCheckInteractorImpl$checkPartner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        if (r1.h((defpackage.ar51) r0, r3, r3, r4, null, r16) == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r0 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r0 == r7) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object failure;
        Throwable a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.c(this.$partner.getTitle(), PartnerWithAction$Status.CHECKING, null);
            a aVar = this.this$0;
            String str = aVar.h;
            if (str != null) {
                a = str;
            } else {
                l lVar = aVar.a;
                this.label = 1;
                a = lVar.a(this);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                a aVar2 = this.this$0;
                PartnerEntity partnerEntity = this.$partner;
                a2 = Result.a(failure);
                if (a2 != null) {
                    aVar2.c(partnerEntity.getTitle(), PartnerWithAction$Status.DEFAULT, null);
                    aVar2.s.invoke(partnerEntity, a2, null, null, null);
                }
                a aVar3 = this.this$0;
                PartnerEntity partnerEntity2 = this.$partner;
                String str2 = this.$receiverPhone;
                String str3 = this.$transferId;
                if (!(failure instanceof Result.Failure)) {
                    this.L$0 = failure;
                    this.label = 3;
                }
                return zy11.a;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar4 = this.this$0;
        PartnerEntity partnerEntity3 = this.$partner;
        String str4 = this.$transferId;
        String str5 = this.$transferType;
        String str6 = this.$receiverPhone;
        Throwable a3 = Result.a(a);
        if (a3 == null) {
            String str7 = (String) a;
            uc5 uc5Var = aVar4.l;
            String partnerId = partnerEntity3.getPartnerId();
            PartnerCheckInteractorImpl$checkPartner$1$1$1 partnerCheckInteractorImpl$checkPartner$1$1$1 = new PartnerCheckInteractorImpl$checkPartner$1$1$1(aVar4, str7, partnerEntity3, str4, str5, str6, null);
            this.label = 2;
            failure = uc5Var.O(partnerCheckInteractorImpl$checkPartner$1$1$1, partnerId, this);
        } else {
            failure = new Result.Failure(a3);
        }
        a aVar22 = this.this$0;
        PartnerEntity partnerEntity4 = this.$partner;
        a2 = Result.a(failure);
        if (a2 != null) {
        }
        a aVar32 = this.this$0;
        PartnerEntity partnerEntity22 = this.$partner;
        String str22 = this.$receiverPhone;
        String str32 = this.$transferId;
        if (!(failure instanceof Result.Failure)) {
        }
        return zy11.a;
    }
}
