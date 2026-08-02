package xsna;

import java.util.List;
import xsna.hn50;
import xsna.lm50;
import xsna.on50;
import xsna.yl50;

/* compiled from: DefaultMviBootstrapper.kt */
/* loaded from: classes3.dex */
public final class bjl<State extends lm50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50> implements vj50<State, TaskId, Task, Patch> {
    public final izs<vj50<State, TaskId, Task, Patch>, State> a;
    public final izs<vj50<State, TaskId, Task, Patch>, Patch> b;
    public final wzs<vj50<State, TaskId, Task, Patch>, State, List<Task>> c;

    /* JADX WARN: Multi-variable type inference failed */
    public bjl(izs<? super vj50<State, TaskId, Task, Patch>, ? extends State> izsVar, izs<? super vj50<State, TaskId, Task, Patch>, ? extends Patch> izsVar2, wzs<? super vj50<State, TaskId, Task, Patch>, ? super State, ? extends List<? extends Task>> wzsVar) {
        this.a = izsVar;
        this.b = izsVar2;
        this.c = wzsVar;
    }

    @Override // xsna.vj50
    public final State a() {
        return this.a.invoke(this);
    }

    @Override // xsna.vj50
    public final Patch b() {
        izs<vj50<State, TaskId, Task, Patch>, Patch> izsVar = this.b;
        if (izsVar != null) {
            return izsVar.invoke(this);
        }
        return null;
    }

    @Override // xsna.vj50
    public final List<Task> c(State state) {
        wzs<vj50<State, TaskId, Task, Patch>, State, List<Task>> wzsVar = this.c;
        if (wzsVar != null) {
            return wzsVar.invoke(this, state);
        }
        return null;
    }
}
