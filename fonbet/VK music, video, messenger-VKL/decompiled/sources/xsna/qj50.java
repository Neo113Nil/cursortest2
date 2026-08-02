package xsna;

import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviActor.kt */
/* loaded from: classes3.dex */
public interface qj50<State extends lm50, Action extends lj50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> extends uic {
    sj50<State, TaskId, Task, Patch, Event> W();

    boolean i(Action action);

    void init();

    void p(Action action);
}
