package xsna;

import xsna.hn50;
import xsna.jn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviTaskExecutor.kt */
/* loaded from: classes3.dex */
public interface mn50<State extends lm50, TaskId extends on50, InTask extends hn50<TaskId>, OutTask extends hn50<TaskId>, TaskExecution extends jn50, Patch extends yl50, Event extends pk50> extends uic {
    boolean B(InTask intask);

    ln50<TaskId> F(InTask intask);

    TaskExecution d(InTask intask);

    void init();

    pn50<TaskId, InTask, TaskExecution> n();
}
