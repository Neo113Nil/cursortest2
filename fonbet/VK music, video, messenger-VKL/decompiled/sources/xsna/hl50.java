package xsna;

import xsna.jn50;
import xsna.kn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;

/* compiled from: MviInlineActorScope.kt */
/* loaded from: classes3.dex */
public interface hl50<State extends lm50, TaskId extends on50, TaskExecution extends jn50, TaskExecutionScope extends kn50, Event extends pk50> {

    /* compiled from: MviInlineActorScope.kt */
    public static final class a {
    }

    void f(hl50<State, TaskId, TaskExecution, TaskExecutionScope, Event> hl50Var, TaskId taskid, ln50<TaskId> ln50Var, izs<? super TaskExecutionScope, ? extends TaskExecution> izsVar);
}
