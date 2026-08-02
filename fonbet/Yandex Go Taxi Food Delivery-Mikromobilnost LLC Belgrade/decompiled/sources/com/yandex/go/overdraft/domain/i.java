package com.yandex.go.overdraft.domain;

import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtFlowHeader;
import com.yandex.go.overdraft.domain.model.DebtsState;
import defpackage.aug;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.mdh;
import defpackage.mug;
import defpackage.pl21;
import defpackage.ql21;
import defpackage.sjh;
import defpackage.sz80;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class i {
    public final tt2 a;
    public final hit b;
    public final aug c;
    public final sz80 d;
    public final ql21 e;

    public i(tt2 tt2Var, hit hitVar, aug augVar, sz80 sz80Var, ql21 ql21Var) {
        this.a = tt2Var;
        this.b = hitVar;
        this.c = augVar;
        this.d = sz80Var;
        this.e = ql21Var;
    }

    public final pl21 a() {
        return (pl21) kotlinx.coroutines.flow.e.d(this.e.a).a.getValue();
    }

    public final Object b(List list, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new OverdraftInteractor$hasActiveOrdersWithDebt$2(list, null), continuation);
    }

    public final void c() {
        e(new pl21(false, a().b));
    }

    public final void d() {
        pl21 pl21Var = pl21.c;
        e(new pl21(true, new mug((List) a().b.j.getValue(), a().b.b, a().b.c, EmptyList.a, null, a().b.f, a().b.g, a().b.h, a().b.i)));
    }

    public final void e(pl21 pl21Var) {
        hbp0 hbp0Var = this.b.a;
        this.a.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new OverdraftInteractor$saveUserDebtsState$1(this, pl21Var, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        DebtsState debtsState;
        DebtFlowHeader debtFlowHeader;
        ql21 ql21Var = this.e;
        r0 r0Var = ql21Var.b;
        DebtFlow debtFlow = ((pl21) kotlinx.coroutines.flow.e.d(ql21Var.a).a.getValue()).b.e;
        if (debtFlow != null && (debtFlowHeader = debtFlow.a) != null) {
            debtsState = debtFlowHeader.d ? DebtsState.PROGRESS : DebtsState.IDLE;
        }
        debtsState = DebtsState.GONE;
        r0Var.l(debtsState);
    }
}
