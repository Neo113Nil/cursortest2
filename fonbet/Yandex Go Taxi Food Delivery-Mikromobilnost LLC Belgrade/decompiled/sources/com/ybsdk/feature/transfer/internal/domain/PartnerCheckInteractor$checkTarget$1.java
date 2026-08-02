package com.ybsdk.feature.transfer.internal.domain;

import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import com.ybsdk.feature.transfer.internal.screens.phone.adapter.ListContentData$Partner$Status;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wlp;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.domain.PartnerCheckInteractor$checkTarget$1", f = "PartnerCheckInteractor.kt", l = {69, 72, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerCheckInteractor$checkTarget$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $transferId;
    final /* synthetic */ TransferType $transferType;
    final /* synthetic */ PartnerEntity $yb;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lar51;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.transfer.internal.domain.PartnerCheckInteractor$checkTarget$1$1", f = "PartnerCheckInteractor.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.transfer.internal.domain.PartnerCheckInteractor$checkTarget$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $transferId;
        final /* synthetic */ PartnerEntity $yb;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, PartnerEntity partnerEntity, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$yb = partnerEntity;
            this.$transferId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$yb, this.$transferId, continuation);
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
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                a aVar = this.this$0;
                String partnerId = this.$yb.getPartnerId();
                String str2 = this.$transferId;
                this.label = 1;
                b = a.b(aVar, partnerId, str, str2, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
            }
            return new Result(b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerCheckInteractor$checkTarget$1(a aVar, TransferType transferType, PartnerEntity partnerEntity, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$transferType = transferType;
        this.$yb = partnerEntity;
        this.$transferId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PartnerCheckInteractor$checkTarget$1(this.this$0, this.$transferType, this.$yb, this.$transferId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerCheckInteractor$checkTarget$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
    
        if (com.ybsdk.feature.transfer.internal.domain.a.a(r1, (defpackage.ar51) r10, r2, r4, r9) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (com.ybsdk.feature.transfer.internal.domain.a.c(r10, r1, r9) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r10 == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object O;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    O = ((Result) obj).getValue();
                    a aVar = this.this$0;
                    PartnerEntity partnerEntity = this.$yb;
                    Throwable a = Result.a(O);
                    if (a != null) {
                        aVar.d(partnerEntity, ListContentData$Partner$Status.DEFAULT, null);
                        aVar.h.invoke(partnerEntity, a, null);
                    }
                    a aVar2 = this.this$0;
                    PartnerEntity partnerEntity2 = this.$yb;
                    String str = this.$transferId;
                    if (!(O instanceof Result.Failure)) {
                        this.L$0 = O;
                        this.label = 3;
                    }
                    return zy11.a;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        kotlin.b.b(obj);
        if (((CommonFeatureFlag) this.this$0.b.a.d(wlp.b).getData()).isEnabled() && this.$transferType == TransferType.ME2ME) {
            a aVar3 = this.this$0;
            PartnerEntity partnerEntity3 = this.$yb;
            this.label = 1;
        } else {
            this.this$0.d(this.$yb, ListContentData$Partner$Status.CHECKING, null);
            com.ybsdk.feature.transfer.internal.screens.targets.presentation.b bVar = this.this$0.f;
            String partnerId = this.$yb.getPartnerId();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$yb, this.$transferId, null);
            this.label = 2;
            O = bVar.O(anonymousClass1, partnerId, this);
        }
        return coroutineSingletons;
    }
}
