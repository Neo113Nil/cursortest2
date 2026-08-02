package com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pc70;
import defpackage.qc70;
import defpackage.qjl;
import defpackage.tse;
import defpackage.w661;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit.DivTransactionInfoFragment$render$1$2", f = "DivTransactionInfoFragment.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DivTransactionInfoFragment$render$1$2 extends SuspendLambda implements wls {
    final /* synthetic */ w661 $this_run;
    final /* synthetic */ qjl $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivTransactionInfoFragment$render$1$2(qjl qjlVar, w661 w661Var, Continuation continuation) {
        super(2, continuation);
        this.$viewState = qjlVar;
        this.$this_run = w661Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivTransactionInfoFragment$render$1$2(this.$viewState, this.$this_run, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivTransactionInfoFragment$render$1$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (this.$viewState.c instanceof pc70) {
                o430 o430Var = e3n.b;
                long U = kp50.U(1, DurationUnit.SECONDS);
                this.label = 1;
                if (kotlinx.coroutines.a.j(U, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.$this_run.d.setVisibility(this.$viewState.c != null ? 0 : 8);
        qc70 qc70Var = this.$viewState.c;
        if (qc70Var != null) {
            this.$this_run.d.render(qc70Var);
        }
        return zy11.a;
    }
}
