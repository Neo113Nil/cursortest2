package com.yandex.go.overdraft.domain;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.domain.model.DebtsState;
import defpackage.g6u;
import defpackage.kv90;
import defpackage.lv90;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ql21;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.ycq0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.OverdraftPayInteractor$payDebt$2", f = "OverdraftPayInteractor.kt", l = {147, 152}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftPayInteractor$payDebt$2 extends SuspendLambda implements wls {
    final /* synthetic */ Object $debtPayResult;
    final /* synthetic */ m6a0 $selectedPaymentMethod;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftPayInteractor$payDebt$2(k kVar, Object obj, m6a0 m6a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$debtPayResult = obj;
        this.$selectedPaymentMethod = m6a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverdraftPayInteractor$payDebt$2(this.this$0, this.$debtPayResult, this.$selectedPaymentMethod, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OverdraftPayInteractor$payDebt$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b1, code lost:
    
        if (defpackage.tje.k0(r3, r5, r9) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (defpackage.tje.k0(r5, r6, r9) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.overdraft.ui.g gVar = this.this$0.e;
            gVar.C.onClose();
            gVar.C = com.yandex.go.overdraft.ui.g.E;
            obj2 = this.$debtPayResult;
            k kVar = this.this$0;
            m6a0 m6a0Var = this.$selectedPaymentMethod;
            if (!(obj2 instanceof Result.Failure)) {
                ql21 ql21Var = ((i) kVar.d.get()).e;
                ql21Var.b.l(DebtsState.PROGRESS);
                ((l) kVar.c.get()).a.f();
                if (kVar.h != OverdraftContext.ORDER_WITH_DEBT) {
                    ycq0 ycq0Var = kVar.f;
                    kv90 kv90Var = lv90.Companion;
                    PaymentMethod$Type paymentMethod$Type = m6a0Var.a;
                    String str = m6a0Var.b;
                    kv90Var.getClass();
                    ycq0Var.b(kv90.b(str, paymentMethod$Type));
                }
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                OverdraftPayInteractor$payDebt$2$1$1 overdraftPayInteractor$payDebt$2$1$1 = new OverdraftPayInteractor$payDebt$2$1$1(kVar, null);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$0;
            kotlin.b.b(obj);
        }
        k kVar2 = this.this$0;
        if (Result.a(obj2) != null) {
            ((i) kVar2.d.get()).f();
            sjh sjhVar2 = uyj.a;
            g6u g6uVar2 = o400.a;
            OverdraftPayInteractor$payDebt$2$2$1 overdraftPayInteractor$payDebt$2$2$1 = new OverdraftPayInteractor$payDebt$2$2$1(kVar2, null);
            this.L$0 = obj2;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
