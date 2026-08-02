package com.yandex.payment.divkit.select;

import defpackage.beq0;
import defpackage.jcv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModel$startTopUp$1", f = "DKSelectViewModel.kt", l = {780}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModel$startTopUp$1 extends SuspendLambda implements wls {
    final /* synthetic */ jcv0 $sumToTopUp;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModel$startTopUp$1(h hVar, jcv0 jcv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$sumToTopUp = jcv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSelectViewModel$startTopUp$1(this.this$0, this.$sumToTopUp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectViewModel$startTopUp$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            hVar.I = null;
            n0 n0Var = hVar.S;
            BigDecimal bigDecimal = this.$sumToTopUp.a;
            beq0 beq0Var = new beq0();
            this.label = 1;
            if (n0Var.emit(beq0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.c0();
        return zy11.a;
    }
}
