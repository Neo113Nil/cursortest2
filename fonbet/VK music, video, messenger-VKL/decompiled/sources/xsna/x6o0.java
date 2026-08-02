package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import okhttp3.internal.concurrent.TaskRunner;

/* compiled from: TaskQueue.kt */
/* loaded from: classes11.dex */
public final class x6o0 {
    public final TaskRunner a;
    public final String b;
    public boolean c;
    public c5o0 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public x6o0(TaskRunner taskRunner, String str) {
        this.a = taskRunner;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = x2r0.a;
        synchronized (this.a) {
            try {
                if (b()) {
                    this.a.d(this);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        c5o0 c5o0Var = this.d;
        if (c5o0Var != null && c5o0Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((c5o0) arrayList.get(size)).b) {
                c5o0 c5o0Var2 = (c5o0) arrayList.get(size);
                TaskRunner.a aVar = TaskRunner.h;
                if (TaskRunner.j.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.a.a(c5o0Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(c5o0 c5o0Var, long j) {
        synchronized (this.a) {
            if (!this.c) {
                if (e(c5o0Var, j, false)) {
                    this.a.d(this);
                }
                s3q0 s3q0Var = s3q0.a;
            } else if (c5o0Var.b) {
                TaskRunner.a aVar = TaskRunner.h;
                if (TaskRunner.j.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.a.a(c5o0Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                TaskRunner.a aVar2 = TaskRunner.h;
                if (TaskRunner.j.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.a.a(c5o0Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(c5o0 c5o0Var, long j, boolean z) {
        x6o0 x6o0Var = c5o0Var.c;
        if (x6o0Var != this) {
            if (x6o0Var != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            c5o0Var.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(c5o0Var);
        if (indexOf != -1) {
            if (c5o0Var.d <= j2) {
                TaskRunner.a aVar = TaskRunner.h;
                if (TaskRunner.j.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.a.a(c5o0Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        c5o0Var.d = j2;
        TaskRunner.a aVar2 = TaskRunner.h;
        if (TaskRunner.j.isLoggable(Level.FINE)) {
            okhttp3.internal.concurrent.a.a(c5o0Var, this, z ? "run again after ".concat(okhttp3.internal.concurrent.a.b(j2 - nanoTime)) : "scheduled after ".concat(okhttp3.internal.concurrent.a.b(j2 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((c5o0) it.next()).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, c5o0Var);
        return i == 0;
    }

    public final void f() {
        byte[] bArr = x2r0.a;
        synchronized (this.a) {
            try {
                this.c = true;
                if (b()) {
                    this.a.d(this);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
