package com.ybsdk.feature.qr.payments.internal.domain;

import com.ybsdk.core.utils.d;
import defpackage.d6v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lw1a0;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.domain.QrPaymentInteractor$getPaymentInfoFlow$3", f = "QrPaymentInteractor.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentInteractor$getPaymentInfoFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ d6v $idempotencyTokenProvider;
    final /* synthetic */ String $qrcLink;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Liyd0;", "Lw1a0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.qr.payments.internal.domain.QrPaymentInteractor$getPaymentInfoFlow$3$1", f = "QrPaymentInteractor.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.qr.payments.internal.domain.QrPaymentInteractor$getPaymentInfoFlow$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ int $attemptNumber;
        final /* synthetic */ String $qrcLink;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, String str, int i, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$qrcLink = str;
            this.$attemptNumber = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$qrcLink, this.$attemptNumber, continuation);
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
                com.ybsdk.feature.qr.payments.internal.data.a aVar = this.this$0.b;
                String str2 = this.$qrcLink;
                int i2 = this.$attemptNumber;
                this.label = 1;
                b = aVar.b(i2, str2, str, this);
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
    public QrPaymentInteractor$getPaymentInfoFlow$3(d6v d6vVar, b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$idempotencyTokenProvider = d6vVar;
        this.this$0 = bVar;
        this.$qrcLink = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentInteractor$getPaymentInfoFlow$3 qrPaymentInteractor$getPaymentInfoFlow$3 = new QrPaymentInteractor$getPaymentInfoFlow$3(this.$idempotencyTokenProvider, this.this$0, this.$qrcLink, continuation);
        qrPaymentInteractor$getPaymentInfoFlow$3.I$0 = ((tq11) obj).a;
        return qrPaymentInteractor$getPaymentInfoFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        QrPaymentInteractor$getPaymentInfoFlow$3 qrPaymentInteractor$getPaymentInfoFlow$3 = new QrPaymentInteractor$getPaymentInfoFlow$3(this.$idempotencyTokenProvider, this.this$0, this.$qrcLink, (Continuation) obj2);
        qrPaymentInteractor$getPaymentInfoFlow$3.I$0 = i;
        return qrPaymentInteractor$getPaymentInfoFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            d6v d6vVar = this.$idempotencyTokenProvider;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$qrcLink, i2, null);
            this.label = 1;
            a = d.a(d6vVar, anonymousClass1, this);
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
