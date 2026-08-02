package xsna;

import java.util.ArrayList;
import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: CompositeActorBuilder.kt */
/* loaded from: classes3.dex */
public final class isi<State extends lm50, Action extends lj50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> {
    public final sj50<State, TaskId, Task, Patch, Event> a;
    public final ArrayList b = new ArrayList();
    public wzs<? super rj50, ? super Action, Object> c;

    public isi(sj50<State, TaskId, Task, Patch, Event> sj50Var) {
        this.a = sj50Var;
    }

    public final d64 a(al50 al50Var) {
        d64 d64Var = new d64(al50Var);
        this.b.add(d64Var);
        return d64Var;
    }
}
