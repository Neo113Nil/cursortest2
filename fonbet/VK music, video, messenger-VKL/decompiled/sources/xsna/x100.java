package xsna;

import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: LoggerMviMiddleware.kt */
/* loaded from: classes3.dex */
public final class x100<State extends lm50, Action extends lj50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> implements h7f0<State, Action, TaskId, Task, Patch, Event> {
    public final pl50 b;
    public final sl50<State, Action, TaskId, Task, Patch, Event> c;

    public x100(String str, pl50 pl50Var, sl50<State, Action, TaskId, Task, Patch, Event> sl50Var) {
        this.b = pl50Var;
        this.c = sl50Var;
    }

    public static String a(rl50 rl50Var) {
        String str;
        if (rl50Var != null) {
            str = "by middleware: " + fpf0.a(rl50Var.getClass()).l();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        this.b.b(new cvs(lj50Var, this));
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        this.b.b(new w100(pk50Var, this));
    }

    @Override // xsna.rl50
    public final State getCurrentState() {
        return this.c.getCurrentState();
    }

    @Override // xsna.h7f0
    public final void l(hn50 hn50Var) {
        this.b.b(new k6k(hn50Var, this));
    }

    @Override // xsna.h7f0
    public final void o(yl50 yl50Var) {
        this.b.b(new odm(yl50Var, this));
    }

    @Override // xsna.h7f0
    public final void u(lm50 lm50Var) {
        this.b.b(new v100(lm50Var, this));
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
