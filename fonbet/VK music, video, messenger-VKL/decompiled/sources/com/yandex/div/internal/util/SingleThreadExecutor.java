package com.yandex.div.internal.util;

import com.yandex.div.internal.Assert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.epx;
import xsna.s3q0;

/* compiled from: SingleThreadExecutor.kt */
/* loaded from: classes7.dex */
public abstract class SingleThreadExecutor {
    private Worker currentWorker;
    private final Executor executor;
    private final Object monitor = new Object();
    private List<Runnable> passedTasks;
    private final String threadNameSuffix;

    /* compiled from: SingleThreadExecutor.kt */
    public final class Worker extends NamedRunnable {
        public Worker() {
            super(SingleThreadExecutor.this.threadNameSuffix);
        }

        @Override // com.yandex.div.internal.util.NamedRunnable
        public void execute() {
            Object obj = SingleThreadExecutor.this.monitor;
            SingleThreadExecutor singleThreadExecutor = SingleThreadExecutor.this;
            synchronized (obj) {
                if (epx.f(singleThreadExecutor.currentWorker, this) && singleThreadExecutor.passedTasks != null) {
                    List list = singleThreadExecutor.passedTasks;
                    singleThreadExecutor.passedTasks = null;
                    s3q0 s3q0Var = s3q0.a;
                    boolean z = true;
                    while (z) {
                        if (list != null) {
                            try {
                                SingleThreadExecutor singleThreadExecutor2 = SingleThreadExecutor.this;
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((Runnable) it.next()).run();
                                    } catch (RuntimeException unused) {
                                        singleThreadExecutor2.getClass();
                                    }
                                }
                            } catch (Throwable th) {
                                Object obj2 = SingleThreadExecutor.this.monitor;
                                SingleThreadExecutor singleThreadExecutor3 = SingleThreadExecutor.this;
                                synchronized (obj2) {
                                    singleThreadExecutor3.currentWorker = null;
                                    s3q0 s3q0Var2 = s3q0.a;
                                    throw th;
                                }
                            }
                        }
                        Object obj3 = SingleThreadExecutor.this.monitor;
                        SingleThreadExecutor singleThreadExecutor4 = SingleThreadExecutor.this;
                        synchronized (obj3) {
                            try {
                                if (singleThreadExecutor4.passedTasks != null) {
                                    list = singleThreadExecutor4.passedTasks;
                                    singleThreadExecutor4.passedTasks = null;
                                } else {
                                    singleThreadExecutor4.currentWorker = null;
                                    z = false;
                                }
                                s3q0 s3q0Var3 = s3q0.a;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                Assert.fail("We shouldn't create excessive workers");
            }
        }
    }

    public SingleThreadExecutor(Executor executor, String str) {
        this.executor = executor;
        this.threadNameSuffix = str;
    }

    private final void addTaskLocked(Runnable runnable) {
        if (this.passedTasks == null) {
            this.passedTasks = new ArrayList(2);
        }
        List<Runnable> list = this.passedTasks;
        if (list != null) {
            list.add(runnable);
        }
    }

    public final void post(Runnable runnable) {
        Worker worker;
        synchronized (this.monitor) {
            try {
                addTaskLocked(runnable);
                if (this.currentWorker == null) {
                    worker = new Worker();
                    this.currentWorker = worker;
                } else {
                    worker = null;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (worker != null) {
            this.executor.execute(worker);
        }
    }
}
