package com.yandex.payment.divkit.select;

import com.yandex.payment.divkit.usecases.p;
import defpackage.ds31;
import defpackage.k5c;
import defpackage.kq60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ybf;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModelRefactor$observePaymentMethodsInner$1", f = "DKSelectViewModelRefactor.kt", l = {455, 460}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModelRefactor$observePaymentMethodsInner$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModelRefactor$observePaymentMethodsInner$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSelectViewModelRefactor$observePaymentMethodsInner$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectViewModelRefactor$observePaymentMethodsInner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        if (((defpackage.tpr) r2).collect(r5, r19) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
    
        if (r2 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            String str = nVar.i0;
            boolean z = nVar.a0;
            boolean z2 = nVar.h0;
            DKSelectViewModelRefactor$observePaymentMethodsInner$1$params$1 dKSelectViewModelRefactor$observePaymentMethodsInner$1$params$1 = new DKSelectViewModelRefactor$observePaymentMethodsInner$1$params$1(1, this.this$0, n.class, "setMethods", "setMethods(Ljava/util/List;)V", 0);
            DKSelectViewModelRefactor$observePaymentMethodsInner$1$params$2 dKSelectViewModelRefactor$observePaymentMethodsInner$1$params$2 = new DKSelectViewModelRefactor$observePaymentMethodsInner$1$params$2(1, this.this$0, n.class, "selectPaymentMethod", "selectPaymentMethod(I)V", 0);
            n nVar2 = this.this$0;
            kq60 kq60Var = new kq60(str, z, z2, dKSelectViewModelRefactor$observePaymentMethodsInner$1$params$1, dKSelectViewModelRefactor$observePaymentMethodsInner$1$params$2, new DKSelectViewModelRefactor$observePaymentMethodsInner$1$params$3(0, nVar2, n.class, "getSelectedIndex", "getSelectedIndex()Ljava/lang/Integer;", 0), new j(nVar2, i2), new ybf(7, nVar2));
            p pVar = nVar2.F;
            k5c a = ds31.a(nVar2);
            n0 n0Var = this.this$0.W;
            this.L$0 = null;
            this.label = 1;
            b = pVar.b(a, n0Var, kq60Var, this);
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
            b = obj;
        }
        m mVar = new m(this.this$0);
        this.L$0 = null;
        this.label = 2;
    }
}
