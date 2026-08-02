package xsna;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: SequentialExecutor.java */
/* loaded from: classes11.dex */
public final class tli0 implements Executor {
    public final Executor c;
    public final ArrayDeque b = new ArrayDeque();
    public final b d = new b();
    public c e = c.IDLE;
    public long f = 0;

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
    }

    /* compiled from: SequentialExecutor.java */
    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            xsna.s100.a("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
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
                    synchronized (tli0.this.b) {
                        if (!z) {
                            tli0 tli0Var = tli0.this;
                            c cVar = tli0Var.e;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                tli0Var.f++;
                                tli0Var.e = cVar2;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) tli0.this.b.poll();
                        if (runnable == null) {
                            tli0.this.e = c.IDLE;
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
                synchronized (tli0.this.b) {
                    tli0.this.e = c.IDLE;
                    throw e;
                }
            }
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

    public tli0(Executor executor) {
        executor.getClass();
        this.c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z;
        runnable.getClass();
        synchronized (this.b) {
            c cVar2 = this.e;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j = this.f;
                a aVar = new a(runnable);
                this.b.add(aVar);
                c cVar3 = c.QUEUING;
                this.e = cVar3;
                try {
                    this.c.execute(this.d);
                    if (this.e != cVar3) {
                        return;
                    }
                    synchronized (this.b) {
                        try {
                            if (this.f == j && this.e == cVar3) {
                                this.e = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.b) {
                        try {
                            c cVar4 = this.e;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z = false;
                                if ((e instanceof RejectedExecutionException) || z) {
                                    throw e;
                                }
                            }
                            if (this.b.removeLastOccurrence(aVar)) {
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
            this.b.add(runnable);
        }
    }
}
