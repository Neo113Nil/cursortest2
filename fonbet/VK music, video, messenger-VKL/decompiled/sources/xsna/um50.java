package xsna;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviStore.kt */
/* loaded from: classes3.dex */
public final class um50<State extends lm50, Action extends lj50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> implements mm50<State, Action, Event> {
    public static final Set<dcy<? extends xuk0<?>>> j = rl3.y0(new dcy[]{fpf0.a(h2y0.class), fpf0.a(xuk0.class)});
    public static final Set<dcy<? extends xuk0<?>>> k = rl3.y0(new dcy[]{fpf0.a(h2y0.class), fpf0.a(xuk0.class)});
    public static final Set<dcy<h2y0<?, ?, ?, ?, ?, ?>>> l = Collections.singleton(fpf0.a(h2y0.class));
    public final vj50<State, TaskId, Task, Patch> b;
    public final nm50 c;
    public final faj0 d;
    public final xtk0 e;
    public final ml50 f;
    public final dv3 g;
    public final nl50<State, TaskId, Task, Task, ? extends jn50, Patch, Event> h;
    public final rl50<State> i;

    /* compiled from: MviStore.kt */
    public final class a implements sj50<State, TaskId, Task, Patch, Event> {
        public a() {
        }

        @Override // xsna.sj50
        public final void a(Task task) {
            um50.this.g(task);
        }

        @Override // xsna.sj50
        public final void c(Event event) {
            um50<State, Action, TaskId, Task, Patch, Event> um50Var = um50.this;
            um50Var.e(new ml1(14, um50Var, event));
            um50Var.c(new k4(13, um50Var, event));
        }

        @Override // xsna.sj50
        public final State e(Patch patch) {
            return (State) um50.this.a(patch);
        }

        @Override // xsna.sj50
        public final jn50 g(TaskId taskid) {
            return um50.this.h.b.n().a(taskid);
        }

        @Override // xsna.sj50
        public final State getCurrentState() {
            return (State) um50.this.e.b();
        }

        @Override // xsna.sj50
        public final boolean h(f730 f730Var) {
            return um50.this.h.b.n().f(f730Var);
        }
    }

    /* compiled from: MviStore.kt */
    public final class b implements sl50<State, Action, TaskId, Task, Patch, Event> {
        public b() {
        }

        @Override // xsna.sl50
        public final State getCurrentState() {
            return (State) um50.this.e.b();
        }
    }

    /* compiled from: MviStore.kt */
    public final class c implements nn50<State, TaskId, Task, Patch, Event> {
        public c() {
        }

        @Override // xsna.nn50
        public final void a(Task task) {
            um50.this.g(task);
        }

        @Override // xsna.nn50
        public final void c(Event event) {
            um50<State, Action, TaskId, Task, Patch, Event> um50Var = um50.this;
            um50Var.e(new ml1(14, um50Var, event));
            um50Var.c(new k4(13, um50Var, event));
        }

        @Override // xsna.nn50
        public final State e(Patch patch) {
            return (State) um50.this.a(patch);
        }

        @Override // xsna.nn50
        public final State getCurrentState() {
            return (State) um50.this.e.b();
        }
    }

    public um50(j18<? extends vj50<State, TaskId, Task, Patch>> j18Var, wb0<State, Action, TaskId, Task, Patch, Event, ? extends qj50<State, Action, TaskId, Task, Patch, Event>> wb0Var, omf0<? extends bm50<State, Patch>> omf0Var, t5o0<State, TaskId, Task, Patch, Event, ? extends mn50<State, TaskId, Task, Task, ?, Patch, Event>> t5o0Var, cm20<State, Action, TaskId, Task, Patch, Event, ? extends rl50<State>> cm20Var, uk50 uk50Var) {
        vj50<State, TaskId, Task, Patch> vj50Var = (vj50) j18Var.invoke();
        this.b = vj50Var;
        ytj0 a2 = uk50Var.a();
        this.c = a2;
        bpn0 bpn0Var = a2.d;
        this.d = new faj0((yvj) bpn0Var.getValue());
        this.e = new xtk0(vj50Var.a(), (yvj) bpn0Var.getValue());
        this.f = new ml50(wb0Var.invoke(new a()));
        this.g = new dv3((bm50) omf0Var.invoke());
        this.h = new nl50<>(t5o0Var.invoke(new c()));
        this.i = cm20Var.invoke(new b());
        c(new x3i(this, 28));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super State, s3q0> izsVar) {
        return this.e.a(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super Event, s3q0> izsVar) {
        return this.d.a(izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lm50 a(yl50 yl50Var) {
        e(new a5(14, this, yl50Var));
        xtk0 xtk0Var = this.e;
        lm50 b2 = xtk0Var.b();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dv3 dv3Var = this.g;
        bm50 bm50Var = (bm50) dv3Var.b;
        T a2 = bm50Var.b(yl50Var) ? bm50Var.a(b2, yl50Var) : 0;
        if (a2 != 0) {
            ref$ObjectRef.element = a2;
            while (true) {
                if (xtk0Var.b.compareAndSet(b2, (lm50) ref$ObjectRef.element)) {
                    e(new ll1(17, this, ref$ObjectRef));
                    xtk0Var.b();
                    break;
                }
                b2 = xtk0Var.b();
                bm50 bm50Var2 = (bm50) dv3Var.b;
                T a3 = bm50Var2.b(yl50Var) ? bm50Var2.a(b2, yl50Var) : 0;
                if (a3 == 0) {
                    xtk0Var.b();
                    break;
                }
                ref$ObjectRef.element = a3;
            }
        } else {
            xtk0Var.b();
        }
        return xtk0Var.b();
    }

    @Override // xsna.mm50
    public final void b(Action action) {
        e(new nv2(27, this, action));
        if (!(action instanceof uj50)) {
            c(new ag1(10, this, action));
            return;
        }
        qj50 qj50Var = (qj50) this.f.c;
        if (qj50Var.i(action)) {
            qj50Var.p(action);
        }
    }

    public final void c(gzs gzsVar) {
        this.c.C(new tm50(0, gzsVar));
    }

    @Override // xsna.uic
    public final void clear() {
        this.c.C(new zf20(this, 4));
    }

    public final void e(izs<? super h7f0<State, Action, TaskId, Task, Patch, Event>, s3q0> izsVar) {
        rl50<State> rl50Var = this.i;
        if (rl50Var != null && fdi.A(rl50Var)) {
            fdi.G(rl50Var, izsVar);
        }
    }

    public final void g(hn50 hn50Var) {
        e(new cq3(23, this, hn50Var));
        c(new mh3(15, this, hn50Var));
    }

    @Override // xsna.mm50
    public final State getCurrentState() {
        return (State) this.e.b();
    }
}
