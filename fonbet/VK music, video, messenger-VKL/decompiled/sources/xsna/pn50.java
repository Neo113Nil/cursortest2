package xsna;

import java.util.concurrent.atomic.AtomicLong;
import xsna.hn50;
import xsna.jn50;
import xsna.on50;

/* compiled from: MviTaskManager.kt */
/* loaded from: classes3.dex */
public abstract class pn50<TaskId extends on50, Task extends hn50<TaskId>, TaskExecution extends jn50> {
    public static final AtomicLong a = new AtomicLong();

    public static long d() {
        AtomicLong atomicLong = a;
        atomicLong.compareAndSet(Long.MAX_VALUE, 0L);
        return atomicLong.incrementAndGet();
    }

    public abstract TaskExecution a(TaskId taskid);

    public abstract void b();

    public abstract void c(long j);

    public abstract nom0<TaskId, Task, TaskExecution> e();

    public abstract boolean f(f730 f730Var);

    public abstract void g(TaskId taskid, TaskExecution taskexecution);
}
