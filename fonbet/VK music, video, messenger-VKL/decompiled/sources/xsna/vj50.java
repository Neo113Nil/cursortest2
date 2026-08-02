package xsna;

import java.util.List;
import xsna.hn50;
import xsna.lm50;
import xsna.on50;
import xsna.yl50;

/* compiled from: MviBootstrapper.kt */
/* loaded from: classes3.dex */
public interface vj50<State extends lm50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50> {
    State a();

    Patch b();

    List<Task> c(State state);
}
