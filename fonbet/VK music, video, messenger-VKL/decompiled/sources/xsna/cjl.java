package xsna;

import xsna.el50;
import xsna.jn50;
import xsna.kn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;

/* compiled from: DefaultMviInlineActor.kt */
/* loaded from: classes3.dex */
public final class cjl<State extends lm50, Action extends lj50, TaskId extends on50, TaskExecution extends jn50, TaskExecutionScope extends kn50, Event extends pk50> implements el50<State, Action, TaskId, TaskExecution, TaskExecutionScope, Event> {
    public final izs<el50<State, Action, TaskId, TaskExecution, TaskExecutionScope, Event>, s3q0> b;
    public final wzs<el50<State, Action, TaskId, TaskExecution, TaskExecutionScope, Event>, Action, s3q0> c;
    public final sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> d;

    public cjl(izs izsVar, f07 f07Var, wzs wzsVar, sj50 sj50Var) {
        this.b = izsVar;
        this.c = wzsVar;
        this.d = sj50Var;
    }

    @Override // xsna.el50
    public final State D(hl50<State, TaskId, TaskExecution, TaskExecutionScope, Event> hl50Var, izs<? super State, ? extends State> izsVar) {
        return (State) el50.a.b(this, izsVar);
    }

    @Override // xsna.qj50
    public final sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> W() {
        return this.d;
    }

    @Override // xsna.el50, xsna.hl50
    public final void f(hl50<State, TaskId, TaskExecution, TaskExecutionScope, Event> hl50Var, TaskId taskid, ln50<TaskId> ln50Var, izs<? super TaskExecutionScope, ? extends TaskExecution> izsVar) {
        el50.a.a(this, taskid, ln50Var, izsVar);
    }

    @Override // xsna.qj50
    public final boolean i(Action action) {
        return Boolean.TRUE.booleanValue();
    }

    @Override // xsna.qj50
    public final void init() {
        izs<el50<State, Action, TaskId, TaskExecution, TaskExecutionScope, Event>, s3q0> izsVar = this.b;
        if (izsVar != null) {
            izsVar.invoke(this);
        }
    }

    @Override // xsna.qj50
    public final void p(Action action) {
        this.c.invoke(this, action);
    }

    @Override // xsna.uic
    public final void clear() {
    }
}
