package xsna;

import xsna.hn50;
import xsna.lm50;
import xsna.mn50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviStoreFactory.kt */
/* loaded from: classes3.dex */
public interface t5o0<State extends lm50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50, TaskExecutor extends mn50<State, TaskId, Task, Task, ?, Patch, Event>> extends izs<nn50<State, TaskId, Task, Patch, Event>, TaskExecutor> {
    TaskExecutor m(nn50<State, TaskId, Task, Patch, Event> nn50Var);
}
