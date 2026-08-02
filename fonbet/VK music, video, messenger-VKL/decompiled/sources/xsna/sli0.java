package xsna;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: SequentialExecutor.java */
/* loaded from: classes.dex */
public final class sli0 implements Executor {
    public static final Logger g = Logger.getLogger(sli0.class.getName());
    public final Executor b;
    public final ArrayDeque c = new ArrayDeque();
    public c d = c.IDLE;
    public long e = 0;
    public final b f = new b();

    /* compiled from: SequentialExecutor.java */
    public class a implements Runnable {
        public final /* synthetic */ Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.run();
        }

        public final String toString() {
            return this.b.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    public final class b implements Runnable {
        public Runnable b;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        
            r9.b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        
            r9.b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            xsna.sli0.g.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.b, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    synchronized (sli0.this.c) {
                        if (!z) {
                            sli0 sli0Var = sli0.this;
                            c cVar = sli0Var.d;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                sli0Var.e++;
                                sli0Var.d = cVar2;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) sli0.this.c.poll();
                        this.b = runnable;
                        if (runnable == null) {
                            sli0.this.d = c.IDLE;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (sli0.this.c) {
                    sli0.this.d = c.IDLE;
                    throw e;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.b;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + sli0.this.d + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SequentialExecutor.java */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c IDLE;
        public static final c QUEUED;
        public static final c QUEUING;
        public static final c RUNNING;

        static {
            c cVar = new c("IDLE", 0);
            IDLE = cVar;
            c cVar2 = new c("QUEUING", 1);
            QUEUING = cVar2;
            c cVar3 = new c("QUEUED", 2);
            QUEUED = cVar3;
            c cVar4 = new c("RUNNING", 3);
            RUNNING = cVar4;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public sli0(Executor executor) {
        exc0.i(executor);
        this.b = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z;
        exc0.i(runnable);
        synchronized (this.c) {
            c cVar2 = this.d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j = this.e;
                a aVar = new a(runnable);
                this.c.add(aVar);
                c cVar3 = c.QUEUING;
                this.d = cVar3;
                try {
                    this.b.execute(this.f);
                    if (this.d != cVar3) {
                        return;
                    }
                    synchronized (this.c) {
                        try {
                            if (this.e == j && this.d == cVar3) {
                                this.d = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.c) {
                        try {
                            c cVar4 = this.d;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z = false;
                                if ((e instanceof RejectedExecutionException) || z) {
                                    throw e;
                                }
                            }
                            if (this.c.removeLastOccurrence(aVar)) {
                                z = true;
                                if (e instanceof RejectedExecutionException) {
                                }
                                throw e;
                            }
                            z = false;
                            if (e instanceof RejectedExecutionException) {
                            }
                            throw e;
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.c.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.b + "}";
    }
}
