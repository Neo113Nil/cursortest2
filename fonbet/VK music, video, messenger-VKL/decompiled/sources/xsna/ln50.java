package xsna;

import xsna.on50;

/* compiled from: MviTaskExecutionStrategy.kt */
/* loaded from: classes3.dex */
public interface ln50<TaskId extends on50> {

    /* compiled from: MviTaskExecutionStrategy.kt */
    public static final class a {
        public static final b a = new b();
        public static final C3276a b = new C3276a();
        public static final c c = new c();

        /* compiled from: MviTaskExecutionStrategy.kt */
        /* renamed from: xsna.ln50$a$a, reason: collision with other inner class name */
        public static final class C3276a implements ln50<on50> {
            @Override // xsna.ln50
            public final <TaskExecution extends jn50, Task extends hn50<on50>> TaskExecution a(nom0<on50, Task, TaskExecution> nom0Var, Task task) {
                jn50 b = nom0Var.b(task.getId());
                if (b == null || !b.d()) {
                    return (TaskExecution) nom0Var.d(task);
                }
                return null;
            }
        }

        /* compiled from: MviTaskExecutionStrategy.kt */
        public static final class b implements ln50<on50> {
            @Override // xsna.ln50
            public final <TaskExecution extends jn50, Task extends hn50<on50>> TaskExecution a(nom0<on50, Task, TaskExecution> nom0Var, Task task) {
                return (TaskExecution) nom0Var.d(task);
            }
        }

        /* compiled from: MviTaskExecutionStrategy.kt */
        public static final class c implements ln50<on50> {
            @Override // xsna.ln50
            public final <TaskExecution extends jn50, Task extends hn50<on50>> TaskExecution a(nom0<on50, Task, TaskExecution> nom0Var, Task task) {
                jn50 b = nom0Var.b(task.getId());
                if (b == null || !b.d()) {
                    return (TaskExecution) nom0Var.d(task);
                }
                nom0Var.c(task.getId());
                nom0Var.a(task.getId());
                return (TaskExecution) nom0Var.d(task);
            }
        }
    }

    <TaskExecution extends jn50, Task extends hn50<TaskId>> TaskExecution a(nom0<TaskId, Task, TaskExecution> nom0Var, Task task);
}
