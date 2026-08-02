package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import xsna.c5o0;
import xsna.i5s;
import xsna.lhg;
import xsna.o2r0;
import xsna.s3q0;
import xsna.x2r0;
import xsna.x6o0;
import xsna.z6o0;

/* compiled from: TaskRunner.kt */
/* loaded from: classes11.dex */
public final class TaskRunner {
    public static final a h = new a();
    public static final TaskRunner i = new TaskRunner(new b(new o2r0(i5s.a(new StringBuilder(), x2r0.h, " TaskRunner"), true)));
    public static final Logger j = Logger.getLogger(TaskRunner.class.getName());
    public final b a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final z6o0 g = new z6o0(this);

    /* compiled from: TaskRunner.kt */
    public static final class a {
    }

    /* compiled from: TaskRunner.kt */
    public static final class b {
        public final ThreadPoolExecutor a;

        public b(o2r0 o2r0Var) {
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), o2r0Var);
        }

        public final void a(z6o0 z6o0Var) {
            this.a.execute(z6o0Var);
        }
    }

    public TaskRunner(b bVar) {
        this.a = bVar;
    }

    public static final void a(TaskRunner taskRunner, c5o0 c5o0Var) {
        byte[] bArr = x2r0.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(c5o0Var.a);
        try {
            long a2 = c5o0Var.a();
            synchronized (taskRunner) {
                taskRunner.b(c5o0Var, a2);
                s3q0 s3q0Var = s3q0.a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (taskRunner) {
                taskRunner.b(c5o0Var, -1L);
                s3q0 s3q0Var2 = s3q0.a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(c5o0 c5o0Var, long j2) {
        byte[] bArr = x2r0.a;
        x6o0 x6o0Var = c5o0Var.c;
        if (x6o0Var.d != c5o0Var) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = x6o0Var.f;
        x6o0Var.f = false;
        x6o0Var.d = null;
        this.e.remove(x6o0Var);
        if (j2 != -1 && !z && !x6o0Var.c) {
            x6o0Var.e(c5o0Var, j2, true);
        }
        if (x6o0Var.e.isEmpty()) {
            return;
        }
        this.f.add(x6o0Var);
    }

    public final c5o0 c() {
        boolean z;
        byte[] bArr = x2r0.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                break;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j2 = Long.MAX_VALUE;
            c5o0 c5o0Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                c5o0 c5o0Var2 = (c5o0) ((x6o0) it.next()).e.get(0);
                long max = Math.max(0L, c5o0Var2.d - nanoTime);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (c5o0Var != null) {
                        z = true;
                        break;
                    }
                    c5o0Var = c5o0Var2;
                }
            }
            ArrayList arrayList2 = this.e;
            if (c5o0Var != null) {
                byte[] bArr2 = x2r0.a;
                c5o0Var.d = -1L;
                x6o0 x6o0Var = c5o0Var.c;
                x6o0Var.e.remove(c5o0Var);
                arrayList.remove(x6o0Var);
                x6o0Var.d = c5o0Var;
                arrayList2.add(x6o0Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    this.a.a(this.g);
                }
                return c5o0Var;
            }
            if (!this.c) {
                this.c = true;
                this.d = nanoTime + j2;
                try {
                    try {
                        long j3 = j2 / 1000000;
                        long j4 = j2 - (1000000 * j3);
                        if (j3 > 0 || j2 > 0) {
                            wait(j3, (int) j4);
                        }
                    } catch (InterruptedException unused) {
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((x6o0) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            x6o0 x6o0Var2 = (x6o0) arrayList.get(size2);
                            x6o0Var2.b();
                            if (x6o0Var2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.c = false;
                }
            } else if (j2 < this.d - nanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void d(x6o0 x6o0Var) {
        byte[] bArr = x2r0.a;
        if (x6o0Var.d == null) {
            boolean isEmpty = x6o0Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(x6o0Var);
            } else if (!arrayList.contains(x6o0Var)) {
                arrayList.add(x6o0Var);
            }
        }
        if (this.c) {
            notify();
        } else {
            this.a.a(this.g);
        }
    }

    public final x6o0 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new x6o0(this, lhg.a(i2, "Q"));
    }
}
