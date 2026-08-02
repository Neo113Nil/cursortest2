package com.ybsdk.feature.split.deposit.internal.ui.payment.status;

import com.ybsdk.feature.split.deposit.internal.domain.payment.status.model.PaymentStatus;
import defpackage.cut0;
import defpackage.dka0;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owv;
import defpackage.pz40;
import defpackage.qit0;
import defpackage.s2e0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusViewModel$collectPaymentStatus$1", f = "SplitDepositPaymentStatusViewModel.kt", l = {100, 130}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPaymentStatusViewModel$collectPaymentStatus$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls2e0;", "Ldka0;", "paymentStatusState", "Lzy11;", "<anonymous>", "(Ls2e0;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusViewModel$collectPaymentStatus$1$1", f = "SplitDepositPaymentStatusViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusViewModel$collectPaymentStatus$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Ref$ObjectRef<PaymentStatus> $prevPaymentStatus;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, c cVar, Continuation continuation) {
            super(2, continuation);
            this.$prevPaymentStatus = ref$ObjectRef;
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$prevPaymentStatus, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((s2e0) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            r0 r0Var;
            Object value;
            PaymentStatus paymentStatus;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            s2e0 s2e0Var = (s2e0) this.L$0;
            dka0 dka0Var = (dka0) s2e0Var.a();
            T t = dka0Var != null ? dka0Var.a : 0;
            PaymentStatus paymentStatus2 = PaymentStatus.CHALLENGE;
            boolean z = t == paymentStatus2;
            boolean z2 = this.$prevPaymentStatus.element == paymentStatus2;
            if (!z || !z2) {
                pz40 Y = this.this$0.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, cut0.a((cut0) value, s2e0Var, null, 62)));
            }
            if (t != 0 && t != (paymentStatus = this.$prevPaymentStatus.element) && paymentStatus == paymentStatus2) {
                this.this$0.H.b.k0.a.a("split_deposit.transaction_status.challenge.completed", null);
            }
            this.$prevPaymentStatus.element = t;
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositPaymentStatusViewModel$collectPaymentStatus$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplitDepositPaymentStatusViewModel$collectPaymentStatus$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositPaymentStatusViewModel$collectPaymentStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            com.ybsdk.feature.split.deposit.internal.domain.payment.status.interactor.a aVar = cVar.D;
            String transactionParameters = cVar.B.getTransactionParameters();
            this.label = 1;
            obj = aVar.a(transactionParameters, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        tpr t = e.t(new owv(new jqr((tpr) obj, new AnonymousClass1(new Ref$ObjectRef(), this.this$0, null), 3), 2));
        qit0 qit0Var = new qit0(4, this.this$0);
        this.label = 2;
        Object collect = t.collect(new a(qit0Var), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
