package xsna;

import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.qj50;
import xsna.yl50;

/* compiled from: MviStoreFactory.kt */
/* loaded from: classes3.dex */
public interface wb0<State extends lm50, Action extends lj50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50, Actor extends qj50<State, Action, TaskId, Task, Patch, Event>> extends izs<sj50<State, TaskId, Task, Patch, Event>, Actor> {
    Actor j(sj50<State, TaskId, Task, Patch, Event> sj50Var);
}
