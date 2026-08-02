package com.yandex.go.payments.paymentlist.experiments.change_payment_modal;

import defpackage.auu0;
import defpackage.cne0;
import defpackage.g6u;
import defpackage.h6w;
import defpackage.hxx;
import defpackage.k8u;
import defpackage.m950;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pd9;
import defpackage.pep0;
import defpackage.qd9;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.experiments.change_payment_modal.ChangePaymentOnSummaryInteractor$onLargestContentfulPaint$1", f = "ChangePaymentOnSummaryInteractor.kt", l = {35, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ChangePaymentOnSummaryInteractor$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.paymentlist.experiments.change_payment_modal.ChangePaymentOnSummaryInteractor$onLargestContentfulPaint$1$1", f = "ChangePaymentOnSummaryInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.paymentlist.experiments.change_payment_modal.ChangePaymentOnSummaryInteractor$onLargestContentfulPaint$1$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ pd9 $data;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, pd9 pd9Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$data = pd9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$data, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a aVar = this.this$0;
            pd9 pd9Var = this.$data;
            aVar.getClass();
            ((pep0) aVar.e).f((m950) aVar.d.get(), new qd9(pd9Var.a, pd9Var.b, pd9Var.c, pd9Var.d, pd9Var.e), hxx.a);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePaymentOnSummaryInteractor$onLargestContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangePaymentOnSummaryInteractor$onLargestContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePaymentOnSummaryInteractor$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        if (defpackage.tje.k0(r1, r4, r10) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r11 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(this.this$0.c.c, 6);
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(mthVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        pd9 pd9Var = (pd9) obj;
        if (this.this$0.f.compareAndSet(false, true)) {
            f fVar = this.this$0.c;
            String a = pd9Var.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(fVar.a());
            Integer num = (Integer) linkedHashMap.get(a);
            linkedHashMap.put(a, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            cne0 cne0Var = fVar.b;
            rbx rbxVar = sbx.d;
            rbxVar.getClass();
            cne0Var.r("change_payment_on_summary_show_counts", rbxVar.c(linkedHashMap, new k8u(auu0.a, h6w.a, 1)));
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, pd9Var, null);
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
