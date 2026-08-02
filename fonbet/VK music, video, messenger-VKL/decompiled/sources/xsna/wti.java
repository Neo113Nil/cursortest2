package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: CompositeMviActor.kt */
/* loaded from: classes3.dex */
public final class wti<State extends lm50, Action extends lj50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> implements qj50<State, Action, TaskId, Task, Patch, Event> {
    public final List<d64<State, ? extends Action, TaskId, Task, Patch, Event>> b;
    public final wzs<rj50, Action, Object> c;
    public final sj50<State, TaskId, Task, Patch, Event> d;
    public final wti<State, Action, TaskId, Task, Patch, Event>.a e = new a();

    /* compiled from: CompositeMviActor.kt */
    public final class a implements rj50 {
        public a() {
        }

        @Override // xsna.rj50
        public final vti a(d64 d64Var, lj50 lj50Var) {
            List<d64<State, ? extends Action, TaskId, Task, Patch, Event>> list = wti.this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((d64) it.next()) == d64Var) {
                        al50 al50Var = d64Var.a;
                        if (al50Var.i(lj50Var)) {
                            al50Var.p(lj50Var);
                        }
                        return vti.a;
                    }
                }
            }
            throw new IllegalArgumentException("You have forgotten to attach the actor in the composite actor");
        }

        @Override // xsna.rj50
        public final vti b(ejd0 ejd0Var, d64 d64Var) {
            return a(d64Var, ejd0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wti(List<? extends d64<State, ? extends Action, TaskId, Task, Patch, Event>> list, wzs<? super rj50, ? super Action, Object> wzsVar, sj50<State, TaskId, Task, Patch, Event> sj50Var) {
        this.b = list;
        this.c = wzsVar;
        this.d = sj50Var;
    }

    @Override // xsna.uic
    public final void clear() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((d64) it.next()).a.clear();
        }
    }

    @Override // xsna.qj50
    public final boolean i(Action action) {
        return true;
    }

    @Override // xsna.qj50
    public final void init() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((d64) it.next()).a.init();
        }
    }

    @Override // xsna.qj50
    public final void p(Action action) {
        this.c.invoke(this.e, action);
    }
}
