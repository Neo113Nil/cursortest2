package com.ybsdk.feature.qr.payments.internal.domain.v2;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.core.utils.d;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Ll8g0;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.domain.v2.QrPaymentsV2Interactor$getInfo$3", f = "QrPaymentsV2Interactor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsV2Interactor$getInfo$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ String $autopaymentId;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Liyd0;", "Ll8g0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.qr.payments.internal.domain.v2.QrPaymentsV2Interactor$getInfo$3$1", f = "QrPaymentsV2Interactor.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.qr.payments.internal.domain.v2.QrPaymentsV2Interactor$getInfo$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $agreementId;
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ int $attemptNumber;
        final /* synthetic */ String $autopaymentId;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, String str, BigDecimal bigDecimal, String str2, int i, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$agreementId = str;
            this.$amount = bigDecimal;
            this.$autopaymentId = str2;
            this.$attemptNumber = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$agreementId, this.$amount, this.$autopaymentId, this.$attemptNumber, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                com.ybsdk.feature.qr.payments.internal.data.b bVar = this.this$0.f;
                String str2 = this.$agreementId;
                BigDecimal bigDecimal = this.$amount;
                String str3 = this.$autopaymentId;
                int i2 = this.$attemptNumber;
                this.label = 1;
                f = bVar.f(str, str2, bigDecimal, str3, i2, this);
                if (f == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                f = ((Result) obj).getValue();
            }
            return new Result(f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsV2Interactor$getInfo$3(b bVar, String str, BigDecimal bigDecimal, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$agreementId = str;
        this.$amount = bigDecimal;
        this.$autopaymentId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentsV2Interactor$getInfo$3 qrPaymentsV2Interactor$getInfo$3 = new QrPaymentsV2Interactor$getInfo$3(this.this$0, this.$agreementId, this.$amount, this.$autopaymentId, continuation);
        qrPaymentsV2Interactor$getInfo$3.I$0 = ((tq11) obj).a;
        return qrPaymentsV2Interactor$getInfo$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        QrPaymentsV2Interactor$getInfo$3 qrPaymentsV2Interactor$getInfo$3 = new QrPaymentsV2Interactor$getInfo$3(this.this$0, this.$agreementId, this.$amount, this.$autopaymentId, (Continuation) obj2);
        qrPaymentsV2Interactor$getInfo$3.I$0 = i;
        return qrPaymentsV2Interactor$getInfo$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            b bVar = this.this$0;
            com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar2 = bVar.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, this.$agreementId, this.$amount, this.$autopaymentId, i2, null);
            this.label = 1;
            a = d.a(bVar2, anonymousClass1, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
