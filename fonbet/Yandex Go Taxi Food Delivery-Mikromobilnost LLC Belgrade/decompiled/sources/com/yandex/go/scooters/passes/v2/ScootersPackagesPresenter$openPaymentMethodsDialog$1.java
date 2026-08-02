package com.yandex.go.scooters.passes.v2;

import defpackage.cao0;
import defpackage.dao0;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.n7o0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.sgo0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.v2.ScootersPackagesPresenter$openPaymentMethodsDialog$1", f = "ScootersPackagesPresenter.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPresenter$openPaymentMethodsDialog$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ n7o0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.passes.v2.ScootersPackagesPresenter$openPaymentMethodsDialog$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((com.yandex.go.scooters.payments.domain.a) this.receiver).b((m6a0) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPresenter$openPaymentMethodsDialog$1(n7o0 n7o0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = n7o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPresenter$openPaymentMethodsDialog$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPresenter$openPaymentMethodsDialog$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cao0 cao0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n7o0 n7o0Var = this.this$0;
            cao0 cao0Var2 = n7o0Var.I;
            po21 po21Var = n7o0Var.y;
            this.L$0 = cao0Var2;
            this.label = 1;
            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            cao0Var = cao0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cao0Var = (cao0) this.L$0;
            kotlin.b.b(obj);
        }
        zzs a = ((mo21) obj).a();
        m6a0 d = this.this$0.B.c().d();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, this.this$0.B, com.yandex.go.scooters.payments.domain.a.class, "changeSelectedPaymentReference", "changeSelectedPaymentReference(Lru/yandex/taxi/payments/model/PaymentMethodReference;)V", 0);
        cao0Var.getClass();
        sgo0 sgo0Var = new sgo0(a, true, d);
        dao0 dao0Var = cao0Var.a;
        dao0Var.A((m950) dao0Var.G.get(), sgo0Var, new d(dao0Var, anonymousClass1));
        return zy11.a;
    }
}
