package xsna;

import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviGatewayActor.kt */
/* loaded from: classes3.dex */
public abstract class al50<State extends lm50, Action extends lj50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> implements qj50<State, Action, TaskId, Task, Patch, Event>, sj50<State, TaskId, Task, Patch, Event> {
    public final sj50<State, TaskId, Task, Patch, Event> b;

    public al50(sj50<State, TaskId, Task, Patch, Event> sj50Var) {
        this.b = sj50Var;
    }

    @Override // xsna.sj50
    public final void a(Task task) {
        this.b.a(task);
    }

    @Override // xsna.sj50
    public final void c(Event event) {
        this.b.c(event);
    }

    @Override // xsna.sj50
    public final State e(Patch patch) {
        return this.b.e(patch);
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
    public boolean i(Action action) {
        return true;
    }

    @Override // xsna.uic
    public void clear() {
    }

    @Override // xsna.qj50
    public void init() {
    }
}
