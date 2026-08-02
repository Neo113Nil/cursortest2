package xsna;

import xsna.el50;
import xsna.jn50;
import xsna.kn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;

/* compiled from: MviGatewayInlineActor.kt */
/* loaded from: classes3.dex */
public abstract class bl50<State extends lm50, Action extends lj50, TaskId extends on50, TaskExecution extends jn50, TaskExecutionScope extends kn50, Event extends pk50> implements el50<State, Action, TaskId, TaskExecution, TaskExecutionScope, Event>, sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> {
    public final sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> b;

    public bl50(sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var) {
        this.b = sj50Var;
    }

    @Override // xsna.el50
    public final State D(hl50<State, TaskId, TaskExecution, TaskExecutionScope, Event> hl50Var, izs<? super State, ? extends State> izsVar) {
        return (State) el50.a.b(this, izsVar);
    }

    @Override // xsna.qj50
    public sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> W() {
        return this.b;
    }

    @Override // xsna.sj50
    public final void a(hn50 hn50Var) {
        this.b.a((ll50) hn50Var);
    }

    @Override // xsna.sj50
    public final void c(Event event) {
        this.b.c(event);
    }

    @Override // xsna.sj50
    public final lm50 e(yl50 yl50Var) {
        return this.b.e((jl50) yl50Var);
    }

    @Override // xsna.el50, xsna.hl50
    public final void f(hl50<State, TaskId, TaskExecution, TaskExecutionScope, Event> hl50Var, TaskId taskid, ln50<TaskId> ln50Var, izs<? super TaskExecutionScope, ? extends TaskExecution> izsVar) {
        el50.a.a(this, taskid, ln50Var, izsVar);
    }

    @Override // xsna.sj50
    public final jn50 g(TaskId taskid) {
        return this.b.g(taskid);
    }

    @Override // xsna.sj50
    public final State getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.sj50
    public final boolean h(f730 f730Var) {
        return this.b.h(f730Var);
    }

    @Override // xsna.qj50
    public final boolean i(Action action) {
        return true;
    }

    @Override // xsna.uic
    public void clear() {
    }

    @Override // xsna.qj50
    public void init() {
    }
}
