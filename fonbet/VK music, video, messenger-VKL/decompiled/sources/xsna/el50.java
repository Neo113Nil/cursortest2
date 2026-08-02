package xsna;

import xsna.jn50;
import xsna.kn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;

/* compiled from: MviInlineActor.kt */
/* loaded from: classes3.dex */
public interface el50<State extends lm50, Action extends lj50, TaskId extends on50, TaskExecution extends jn50, TaskExecutionScope extends kn50, Event extends pk50> extends qj50<State, Action, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event>, hl50<State, TaskId, TaskExecution, TaskExecutionScope, Event> {

    /* compiled from: MviInlineActor.kt */
    public static final class a {
        public static void a(el50 el50Var, on50 on50Var, ln50 ln50Var, izs izsVar) {
            el50Var.W().a(new fl50(on50Var, ln50Var, izsVar));
        }

        public static lm50 b(el50 el50Var, izs izsVar) {
            return el50Var.W().e(new gl50(izsVar));
        }
    }

    State D(hl50<State, TaskId, TaskExecution, TaskExecutionScope, Event> hl50Var, izs<? super State, ? extends State> izsVar);

    void f(hl50<State, TaskId, TaskExecution, TaskExecutionScope, Event> hl50Var, TaskId taskid, ln50<TaskId> ln50Var, izs<? super TaskExecutionScope, ? extends TaskExecution> izsVar);
}
