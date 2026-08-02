package xsna;

import xsna.jn50;
import xsna.kn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;

/* compiled from: MviGatewayInlineTaskExecutor.kt */
/* loaded from: classes3.dex */
public abstract class cl50<State extends lm50, TaskId extends on50, TaskExecution extends jn50, TaskExecutionScope extends kn50, Event extends pk50> implements mn50, nn50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> {
    public final nn50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> b;

    public cl50(nn50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> nn50Var) {
        this.b = nn50Var;
        new bpn0(new x850(this, 1));
    }

    @Override // xsna.mn50
    public final /* bridge */ /* synthetic */ boolean B(hn50 hn50Var) {
        return true;
    }

    @Override // xsna.mn50
    public final ln50 F(hn50 hn50Var) {
        return ((ll50) hn50Var).d();
    }

    @Override // xsna.nn50
    public final void a(hn50 hn50Var) {
        this.b.a((ll50) hn50Var);
    }

    @Override // xsna.nn50
    public final void c(Event event) {
        this.b.c(event);
    }

    @Override // xsna.nn50
    public final lm50 e(yl50 yl50Var) {
        return this.b.e((jl50) yl50Var);
    }

    @Override // xsna.nn50
    public final State getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.uic
    public void clear() {
    }
}
