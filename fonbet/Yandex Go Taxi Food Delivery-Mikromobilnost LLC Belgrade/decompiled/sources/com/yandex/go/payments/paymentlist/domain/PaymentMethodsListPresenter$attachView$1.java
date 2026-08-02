package com.yandex.go.payments.paymentlist.domain;

import defpackage.bms;
import defpackage.h73;
import defpackage.idn;
import defpackage.jca0;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k4m;
import defpackage.kw;
import defpackage.lea0;
import defpackage.lv90;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.s5r;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wba0;
import defpackage.wls;
import defpackage.yw01;
import defpackage.z5a0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsListPresenter$attachView$1", f = "PaymentMethodsListPresenter.kt", l = {551}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsListPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ jca0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.payments.paymentlist.domain.PaymentMethodsListPresenter$attachView$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        public final Object b(jfa0 jfa0Var) {
            Object obj;
            k kVar = (k) this.receiver;
            lv90 lv90Var = kVar.x.f;
            if (lv90Var != null && !kVar.Z) {
                s5r s5rVar = new s5r(kotlin.sequences.b.g(new yw01(new h73(1, jfa0Var.a), PaymentMethodsListPresenter$trySelectDeferredPayment$1.b), wba0.a));
                while (true) {
                    if (!s5rVar.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = s5rVar.next();
                    lea0 lea0Var = (lea0) obj;
                    if (lea0Var.c() == lv90Var.a() && jl40.l(lea0Var.getId(), lv90Var.b)) {
                        break;
                    }
                }
                lea0 lea0Var2 = (lea0) obj;
                if (lea0Var2 != null) {
                    kVar.Pg(new z5a0(lea0Var2), null);
                }
            }
            return zy11.a;
        }

        @Override // defpackage.wls
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((jfa0) obj);
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljfa0;", "paymentOptions", "Lk4m;", "doneButtonState", "", "isPlusSdkAvailable", "Lgca0;", "<anonymous>", "(Ljfa0;Lk4m;Z)Lgca0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsListPresenter$attachView$1$2", f = "PaymentMethodsListPresenter.kt", l = {139}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.paymentlist.domain.PaymentMethodsListPresenter$attachView$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, Continuation continuation) {
            super(4, continuation);
            this.this$0 = kVar;
        }

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, (Continuation) obj4);
            anonymousClass2.L$0 = (jfa0) obj;
            anonymousClass2.L$1 = (k4m) obj2;
            anonymousClass2.Z$0 = booleanValue;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            jfa0 jfa0Var = (jfa0) this.L$0;
            k4m k4mVar = (k4m) this.L$1;
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            k kVar = this.this$0;
            com.yandex.go.payments.paymentlist.domain.converter.i iVar = kVar.M.a;
            kw kwVar = kVar.x.b.d;
            String c = kwVar != null ? kwVar.c() : null;
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = z;
            this.label = 1;
            Object n = iVar.n(jfa0Var, c, k4mVar, z, this);
            return n == coroutineSingletons ? coroutineSingletons : n;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrsn;", "Lgca0;", "it", "Lzy11;", "<anonymous>", "(Lrsn;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsListPresenter$attachView$1$3", f = "PaymentMethodsListPresenter.kt", l = {147}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.paymentlist.domain.PaymentMethodsListPresenter$attachView$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(k kVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((rsn) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            rsn rsnVar = (rsn) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                k kVar = this.this$0;
                this.L$0 = null;
                this.label = 1;
                if (k.Kg(kVar, rsnVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsListPresenter$attachView$1(k kVar, jca0 jca0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$mvpView = jca0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsListPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsListPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k kVar = this.this$0;
            jqr jqrVar = new jqr(new m0(kVar.B.b(), kVar.N.a.a, new PaymentMethodsListPresenter$paymentOptionsFlow$1(3, null)), new PaymentMethodsListPresenter$paymentOptionsFlow$2(kVar, null), 3);
            k kVar2 = this.this$0;
            jqr jqrVar2 = new jqr(new mth(new j0(null, kotlinx.coroutines.flow.e.n(new jqr(jqrVar, new AnonymousClass1(2, kVar2, k.class, "trySelectDeferredPayment", "trySelectDeferredPayment(Lcom/yandex/go/payments/navigation/list/router/PaymentOptionsForPmlScreen;)V", 4), 3), kotlinx.coroutines.flow.e.t(kVar2.C), kotlinx.coroutines.flow.e.t(this.this$0.T.a.a.b()), new AnonymousClass2(this.this$0, null)), new PaymentMethodsListPresenter$attachView$1$invokeSuspend$$inlined$withPreviousEmit$1(3, null)), 6), new AnonymousClass3(this.this$0, null), 3);
            this.this$0.L.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(jqrVar2, uyj.a);
            jca0 jca0Var = this.$mvpView;
            k kVar3 = this.this$0;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(F, new PaymentMethodsListPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            idn idnVar = new idn(7, jca0Var, kVar3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(idnVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
