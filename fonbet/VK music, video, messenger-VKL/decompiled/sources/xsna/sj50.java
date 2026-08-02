package xsna;

import xsna.hn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviActorStoreGateway.kt */
/* loaded from: classes3.dex */
public interface sj50<State extends lm50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> {
    void a(Task task);

    void c(Event event);

    State e(Patch patch);

    jn50 g(TaskId taskid);

    State getCurrentState();

    boolean h(f730 f730Var);
}
