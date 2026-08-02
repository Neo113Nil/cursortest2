package xsna;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Pair;
import xsna.hn50;
import xsna.jn50;
import xsna.on50;

/* compiled from: DefaultMviTaskManager.kt */
/* loaded from: classes3.dex */
public final class gjl<TaskId extends on50, Task extends hn50<TaskId>, TaskExecution extends jn50> extends pn50<TaskId, Task, TaskExecution> {
    public final mn50<?, TaskId, Task, ?, TaskExecution, ?, ?> b;
    public final b c = new b();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final gjl<TaskId, Task, TaskExecution>.a h = new a(this);

    /* compiled from: DefaultMviTaskManager.kt */
    public final class a {
        public final ConcurrentHashMap a;
        public final ConcurrentHashMap b;
        public final ConcurrentHashMap c;

        public a(gjl gjlVar) {
            this.a = gjlVar.e;
            this.b = gjlVar.f;
            this.c = gjlVar.d;
        }
    }

    /* compiled from: DefaultMviTaskManager.kt */
    public final class b implements nom0<TaskId, Task, TaskExecution> {
        public b() {
        }

        @Override // xsna.nom0
        public final jn50 a(on50 on50Var) {
            return gjl.this.a(on50Var);
        }

        @Override // xsna.nom0
        public final jn50 b(on50 on50Var) {
            return (jn50) gjl.this.h.c.get(on50Var);
        }

        @Override // xsna.nom0
        public final void c(on50 on50Var) {
            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) gjl.this.g.get(on50Var);
            if (linkedBlockingDeque != null) {
                linkedBlockingDeque.clear();
            }
        }

        @Override // xsna.nom0
        public final jn50 d(hn50 hn50Var) {
            return gjl.this.b.d(hn50Var);
        }
    }

    public gjl(mn50<?, TaskId, Task, ?, TaskExecution, ?, ?> mn50Var) {
        this.b = mn50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pn50
    public final TaskExecution a(TaskId taskid) {
        jn50 d;
        gjl<TaskId, Task, TaskExecution>.a aVar = this.h;
        TaskExecution taskexecution = (TaskExecution) aVar.c.get(taskid);
        if (taskexecution != null && !taskexecution.c()) {
            return taskexecution;
        }
        if (taskexecution != null && taskexecution.d()) {
            taskexecution.a();
        }
        if (taskexecution != null) {
            long b2 = taskexecution.b();
            aVar.b.remove(Long.valueOf(b2));
        }
        hn50 h = h(taskid);
        if (h != null && (d = this.b.d(h)) != null) {
            g(taskid, d);
        }
        return taskexecution;
    }

    @Override // xsna.pn50
    public final void b() {
        this.g.clear();
        gjl<TaskId, Task, TaskExecution>.a aVar = this.h;
        ConcurrentHashMap concurrentHashMap = aVar.b;
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((jn50) it.next()).a();
        }
        concurrentHashMap.clear();
        aVar.c.clear();
        aVar.a.clear();
        s3q0 s3q0Var = s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pn50
    public final void c(long j) {
        jn50 d;
        gjl<TaskId, Task, TaskExecution>.a aVar = this.h;
        Pair pair = new Pair(aVar.b.remove(Long.valueOf(j)), aVar.a.remove(Long.valueOf(j)));
        jn50 jn50Var = (jn50) pair.d();
        on50 on50Var = (on50) pair.g();
        if (jn50Var != null && jn50Var.d()) {
            jn50Var.a();
        }
        if (on50Var == null) {
            return;
        }
        hn50 h = h(on50Var);
        if (h == null || (d = this.b.d(h)) == null) {
            return;
        }
        g(on50Var, d);
    }

    @Override // xsna.pn50
    public final nom0<TaskId, Task, TaskExecution> e() {
        return this.c;
    }

    @Override // xsna.pn50
    public final boolean f(f730 f730Var) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.g.get(f730Var);
        return linkedBlockingDeque != null && (linkedBlockingDeque.isEmpty() ^ true);
    }

    @Override // xsna.pn50
    public final void g(TaskId taskid, TaskExecution taskexecution) {
        gjl<TaskId, Task, TaskExecution>.a aVar = this.h;
        aVar.a.put(Long.valueOf(taskexecution.b()), taskid);
        aVar.b.put(Long.valueOf(taskexecution.b()), taskexecution);
        aVar.c.put(taskid, taskexecution);
        s3q0 s3q0Var = s3q0.a;
    }

    public final Task h(TaskId taskid) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.g.get(taskid);
        if (linkedBlockingDeque != null) {
            return (Task) linkedBlockingDeque.pollFirst();
        }
        return null;
    }
}
