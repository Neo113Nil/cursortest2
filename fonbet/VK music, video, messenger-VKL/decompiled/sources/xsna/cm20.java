package xsna;

import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.rl50;
import xsna.yl50;

/* compiled from: MviStoreFactory.kt */
/* loaded from: classes3.dex */
public interface cm20<State extends lm50, Action extends lj50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50, Middleware extends rl50<State>> extends izs<sl50<State, Action, TaskId, Task, Patch, Event>, Middleware> {
    Middleware i(sl50<State, Action, TaskId, Task, Patch, Event> sl50Var);
}
