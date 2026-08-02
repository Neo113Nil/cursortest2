package xsna;

import xsna.hn50;
import xsna.jn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviInternalTaskExecutor.kt */
/* loaded from: classes3.dex */
public final class nl50<State extends lm50, TaskId extends on50, InTask extends hn50<TaskId>, OutTask extends hn50<TaskId>, TaskExecution extends jn50, Patch extends yl50, Event extends pk50> implements uic {
    public final mn50<State, TaskId, InTask, OutTask, TaskExecution, Patch, Event> b;

    public nl50(mn50<State, TaskId, InTask, OutTask, TaskExecution, Patch, Event> mn50Var) {
        this.b = mn50Var;
    }

    @Override // xsna.uic
    public final void clear() {
        mn50<State, TaskId, InTask, OutTask, TaskExecution, Patch, Event> mn50Var = this.b;
        mn50Var.n().b();
        mn50Var.clear();
    }
}
