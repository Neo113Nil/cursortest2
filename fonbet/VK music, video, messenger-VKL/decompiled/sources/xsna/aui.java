package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.hn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: CompositeMviTaskExecutor.kt */
/* loaded from: classes3.dex */
public final class aui<State extends lm50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> implements mn50<State, TaskId, Task, Task, jn50, Patch, Event> {
    public final List<f64<State, TaskId, ? extends Task, Task, ? extends jn50, Patch, Event>> b;
    public final wzs<qk50, Task, Object> c;
    public final nn50<State, TaskId, Task, Patch, Event> d;
    public final aui<State, TaskId, Task, Patch, Event>.a e = new a();
    public final bpn0 f = new bpn0(new ld(this, 29));

    /* compiled from: CompositeMviTaskExecutor.kt */
    public final class a implements qk50 {
        public a() {
        }

        @Override // xsna.qk50
        public final zti a(f64 f64Var, hn50 hn50Var) {
            dl50 dl50Var = f64Var.a;
            List<f64<State, TaskId, ? extends Task, Task, ? extends jn50, Patch, Event>> list = aui.this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((f64) it.next()) == f64Var) {
                        if (dl50Var.B(hn50Var)) {
                            jn50 a = dl50Var.F(hn50Var).a(dl50Var.n().e(), hn50Var);
                            if (a != null) {
                                dl50Var.n().g(hn50Var.getId(), a);
                            }
                        }
                        return zti.a;
                    }
                }
            }
            throw new IllegalArgumentException("You have forgotten to attach the executor in the composite actor");
        }

        @Override // xsna.qk50
        public final zti b(mjf mjfVar, f64 f64Var) {
            return a(f64Var, mjfVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aui(List<? extends f64<State, TaskId, ? extends Task, Task, ? extends jn50, Patch, Event>> list, wzs<? super qk50, ? super Task, Object> wzsVar, nn50<State, TaskId, Task, Patch, Event> nn50Var) {
        this.b = list;
        this.c = wzsVar;
        this.d = nn50Var;
    }

    @Override // xsna.mn50
    public final boolean B(Task task) {
        return true;
    }

    @Override // xsna.mn50
    public final ln50<TaskId> F(Task task) {
        return task.d();
    }

    @Override // xsna.uic
    public final void clear() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((f64) it.next()).a.clear();
        }
    }

    @Override // xsna.mn50
    public final jn50 d(Task task) {
        this.c.invoke(this.e, task);
        return null;
    }

    @Override // xsna.mn50
    public final void init() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((f64) it.next()).a.init();
        }
    }

    @Override // xsna.mn50
    public final pn50<TaskId, Task, jn50> n() {
        return (pn50) this.f.getValue();
    }
}
