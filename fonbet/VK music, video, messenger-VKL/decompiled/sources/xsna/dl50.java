package xsna;

import xsna.hn50;
import xsna.jn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviGatewayTaskExecutor.kt */
/* loaded from: classes3.dex */
public abstract class dl50<State extends lm50, TaskId extends on50, InTask extends hn50<TaskId>, OutTask extends hn50<TaskId>, TaskExecution extends jn50, Patch extends yl50, Event extends pk50> implements mn50<State, TaskId, InTask, OutTask, TaskExecution, Patch, Event>, nn50<State, TaskId, OutTask, Patch, Event> {
    public final nn50<State, TaskId, OutTask, Patch, Event> b;
    public final bpn0 c = new bpn0(new l1i(this, 17));

    public dl50(nn50<State, TaskId, OutTask, Patch, Event> nn50Var) {
        this.b = nn50Var;
    }

    @Override // xsna.mn50
    public boolean B(InTask intask) {
        return true;
    }

    @Override // xsna.mn50
    public ln50<TaskId> F(InTask intask) {
        return intask.d();
    }

    @Override // xsna.nn50
    public final void a(OutTask outtask) {
        this.b.a(outtask);
    }

    @Override // xsna.nn50
    public final void c(Event event) {
        this.b.c(event);
    }

    @Override // xsna.nn50
    public final State e(Patch patch) {
        return this.b.e(patch);
    }

    @Override // xsna.nn50
    public final State getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mn50
    public pn50<TaskId, InTask, TaskExecution> n() {
        return (pn50) this.c.getValue();
    }

    @Override // xsna.uic
    public void clear() {
    }

    @Override // xsna.mn50
    public void init() {
    }
}
