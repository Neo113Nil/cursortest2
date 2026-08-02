package xsna;

import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviStoreRecipe.kt */
/* loaded from: classes3.dex */
public final class an50<State extends lm50, Action extends lj50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> {
    public final j18<vj50<State, TaskId, Task, Patch>> a;
    public final wb0<State, Action, TaskId, Task, Patch, Event, qj50<State, Action, TaskId, Task, Patch, Event>> b;
    public final omf0<bm50<State, Patch>> c;
    public final t5o0<State, TaskId, Task, Patch, Event, mn50<State, TaskId, Task, Task, ?, Patch, Event>> d;
    public final cm20<State, Action, TaskId, Task, Patch, Event, rl50<State>> e;

    /* compiled from: MviStoreRecipe.kt */
    public static final class a {
        public static an50 a(j18 j18Var, wb0 wb0Var, omf0 omf0Var, t5o0 t5o0Var) {
            return new an50(j18Var, wb0Var, omf0Var, t5o0Var, xm50.b);
        }

        public static an50 b(j18 j18Var, wb0 wb0Var, un8 un8Var) {
            return new an50(j18Var, wb0Var, new wm50(), un8Var, zm50.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public an50(j18<? extends vj50<State, TaskId, Task, Patch>> j18Var, wb0<State, Action, TaskId, Task, Patch, Event, ? extends qj50<State, Action, TaskId, Task, Patch, Event>> wb0Var, omf0<? extends bm50<State, Patch>> omf0Var, t5o0<State, TaskId, Task, Patch, Event, ? extends mn50<State, TaskId, Task, Task, ?, Patch, Event>> t5o0Var, cm20<State, Action, TaskId, Task, Patch, Event, ? extends rl50<State>> cm20Var) {
        this.a = j18Var;
        this.b = wb0Var;
        this.c = omf0Var;
        this.d = t5o0Var;
        this.e = cm20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an50)) {
            return false;
        }
        an50 an50Var = (an50) obj;
        return epx.f(this.a, an50Var.a) && epx.f(this.b, an50Var.b) && epx.f(this.c, an50Var.c) && epx.f(this.d, an50Var.d) && epx.f(this.e, an50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MviStoreRecipe(bootstrapperFactory=" + this.a + ", actorFactory=" + this.b + ", reducerFactory=" + this.c + ", taskExecutorFactory=" + this.d + ", middlewareFactory=" + this.e + ')';
    }
}
