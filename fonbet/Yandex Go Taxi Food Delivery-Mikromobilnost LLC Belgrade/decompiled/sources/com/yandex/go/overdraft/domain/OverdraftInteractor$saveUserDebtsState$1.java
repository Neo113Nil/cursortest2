package com.yandex.go.overdraft.domain;

import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.TopNotification;
import defpackage.aug;
import defpackage.cne0;
import defpackage.mug;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pl21;
import defpackage.ql21;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.OverdraftInteractor$saveUserDebtsState$1", f = "OverdraftInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class OverdraftInteractor$saveUserDebtsState$1 extends SuspendLambda implements wls {
    final /* synthetic */ pl21 $userDebtsState;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftInteractor$saveUserDebtsState$1(i iVar, pl21 pl21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$userDebtsState = pl21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverdraftInteractor$saveUserDebtsState$1(this.this$0, this.$userDebtsState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OverdraftInteractor$saveUserDebtsState$1 overdraftInteractor$saveUserDebtsState$1 = (OverdraftInteractor$saveUserDebtsState$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        overdraftInteractor$saveUserDebtsState$1.invokeSuspend(zy11Var);
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
        ql21 ql21Var = this.this$0.e;
        ql21Var.a.l(this.$userDebtsState);
        i iVar = this.this$0;
        mug mugVar = this.$userDebtsState.b;
        aug augVar = iVar.c;
        DebtFlow debtFlow = mugVar.e;
        if (debtFlow != null) {
            List list = debtFlow.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!augVar.a.n("NOTIFICATIONS").contains(((TopNotification) obj2).getA())) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TopNotification) it.next()).getA());
            }
            cne0 cne0Var = augVar.a;
            cne0Var.t("NOTIFICATIONS", kotlin.collections.a.U(cne0Var.n("NOTIFICATIONS"), kotlin.collections.a.N0(arrayList2)));
            augVar.b.g(arrayList);
        }
        this.this$0.f();
        return zy11.a;
    }
}
