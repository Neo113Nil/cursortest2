package com.ybsdk.feature.partnerselection.internal.screens.partners.domain;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.utils.d;
import com.ybsdk.feature.partnerselection.api.PartnerWithAction$Status;
import com.ybsdk.feature.partnerselection.api.SelectedPartnerCrossBorderData;
import defpackage.ar51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uc5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerselection.internal.screens.partners.domain.PartnerCheckInteractorImpl$checkCrossBorderPartner$1", f = "PartnerCheckInteractorImpl.kt", l = {316, 331}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerCheckInteractorImpl$checkCrossBorderPartner$1 extends SuspendLambda implements wls {
    final /* synthetic */ PartnerEntity $partner;
    final /* synthetic */ String $receiverFullName;
    final /* synthetic */ String $receiverPhone;
    final /* synthetic */ String $transferId;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lkotlin/Pair;", "Lar51;", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartnerCrossBorderData;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.partnerselection.internal.screens.partners.domain.PartnerCheckInteractorImpl$checkCrossBorderPartner$1$1", f = "PartnerCheckInteractorImpl.kt", l = {317}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.partnerselection.internal.screens.partners.domain.PartnerCheckInteractorImpl$checkCrossBorderPartner$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ PartnerEntity $partner;
        final /* synthetic */ String $receiverFullName;
        final /* synthetic */ String $receiverPhone;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, PartnerEntity partnerEntity, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$receiverPhone = str;
            this.$partner = partnerEntity;
            this.$receiverFullName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$receiverPhone, this.$partner, this.$receiverFullName, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str = (String) this.L$0;
                a aVar = this.this$0;
                com.ybsdk.feature.partnerselection.internal.data.helpers.a aVar2 = aVar.v;
                String str2 = aVar.h;
                String str3 = this.$receiverPhone;
                String partnerId = this.$partner.getPartnerId();
                String str4 = this.this$0.p;
                if (str4 == null) {
                    str4 = "UZ";
                }
                String str5 = this.$receiverFullName;
                this.label = 1;
                b = aVar2.b(str2, str3, partnerId, str4, str, str5, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerCheckInteractorImpl$checkCrossBorderPartner$1(a aVar, PartnerEntity partnerEntity, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$partner = partnerEntity;
        this.$receiverPhone = str;
        this.$receiverFullName = str2;
        this.$transferId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PartnerCheckInteractorImpl$checkCrossBorderPartner$1(this.this$0, this.$partner, this.$receiverPhone, this.$receiverFullName, this.$transferId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerCheckInteractorImpl$checkCrossBorderPartner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r0 == r7) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            if (aVar.h != null) {
                aVar.c(this.$partner.getTitle(), PartnerWithAction$Status.CHECKING, null);
                a aVar2 = this.this$0;
                uc5 uc5Var = aVar2.l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar2, this.$receiverPhone, this.$partner, this.$receiverFullName, null);
                this.label = 1;
                a = d.a(uc5Var, anonymousClass1, this);
            }
            return zy11Var;
        }
        if (i != 1) {
            if (i == 2) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a = ((Result) obj).getValue();
        a aVar3 = this.this$0;
        PartnerEntity partnerEntity = this.$partner;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            aVar3.c(partnerEntity.getTitle(), PartnerWithAction$Status.DEFAULT, null);
            aVar3.s.invoke(partnerEntity, a2, null, null, null);
        }
        a aVar4 = this.this$0;
        PartnerEntity partnerEntity2 = this.$partner;
        String str = this.$receiverPhone;
        String str2 = this.$transferId;
        if (!(a instanceof Result.Failure)) {
            Pair pair = (Pair) a;
            ar51 ar51Var = (ar51) pair.getFirst();
            SelectedPartnerCrossBorderData selectedPartnerCrossBorderData = (SelectedPartnerCrossBorderData) pair.getSecond();
            this.L$0 = a;
            this.label = 2;
            if (aVar4.h(ar51Var, partnerEntity2, str, str2, selectedPartnerCrossBorderData, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
