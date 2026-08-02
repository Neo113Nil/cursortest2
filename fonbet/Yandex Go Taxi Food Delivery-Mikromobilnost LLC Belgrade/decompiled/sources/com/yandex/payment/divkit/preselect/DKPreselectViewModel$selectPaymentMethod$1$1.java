package com.yandex.payment.divkit.preselect;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xve0;
import defpackage.yve0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.preselect.DKPreselectViewModel$selectPaymentMethod$1$1", f = "DKPreselectViewModel.kt", l = {504, 506}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKPreselectViewModel$selectPaymentMethod$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $byTap;
    final /* synthetic */ PaymentMethod $method;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKPreselectViewModel$selectPaymentMethod$1$1(PaymentMethod paymentMethod, f fVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$method = paymentMethod;
        this.this$0 = fVar;
        this.$byTap = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKPreselectViewModel$selectPaymentMethod$1$1(this.$method, this.this$0, this.$byTap, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKPreselectViewModel$selectPaymentMethod$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L17;
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
            boolean l = jl40.l(this.$method, PaymentMethod.NewCard.INSTANCE);
            f fVar = this.this$0;
            if (l) {
                n0 n0Var = fVar.F;
                yve0 yve0Var = new yve0(this.$byTap);
                this.label = 1;
            } else {
                n0 n0Var2 = fVar.F;
                xve0 xve0Var = new xve0(this.$method);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
