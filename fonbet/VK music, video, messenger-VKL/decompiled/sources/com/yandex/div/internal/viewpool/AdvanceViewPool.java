package com.yandex.div.internal.viewpool;

import android.view.View;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.s3q0;
import xsna.zcl;
import xsna.zk3;

/* compiled from: AdvanceViewPool.kt */
/* loaded from: classes7.dex */
public final class AdvanceViewPool implements ViewPool {
    public static final Companion Companion = new Companion(null);
    private final ViewPoolProfiler profiler;
    private final PerformanceDependentSessionProfiler sessionProfiler;
    private final ViewCreator viewCreator;
    private final Map<String, Channel<? extends View>> viewFactories = new zk3();

    /* compiled from: AdvanceViewPool.kt */
    public static final class Channel<T extends View> implements ViewFactory<T> {
        public static final Companion Companion = new Companion(null);
        private volatile int capacity;
        private final boolean notEmpty;
        private final ViewPoolProfiler profiler;
        private AtomicInteger realQueueSize;
        private final PerformanceDependentSessionProfiler sessionProfiler;
        private final ViewCreator viewCreator;
        private final ViewFactory<T> viewFactory;
        private final String viewName;
        private final BlockingQueue<T> viewQueue = new LinkedBlockingQueue();
        private final AtomicBoolean stopped = new AtomicBoolean(false);

        /* compiled from: AdvanceViewPool.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            private Companion() {
            }
        }

        public Channel(String str, ViewPoolProfiler viewPoolProfiler, PerformanceDependentSessionProfiler performanceDependentSessionProfiler, ViewFactory<T> viewFactory, ViewCreator viewCreator, int i) {
            this.viewName = str;
            this.profiler = viewPoolProfiler;
            this.sessionProfiler = performanceDependentSessionProfiler;
            this.viewFactory = viewFactory;
            this.viewCreator = viewCreator;
            this.realQueueSize = new AtomicInteger(i);
            this.notEmpty = !r1.isEmpty();
            this.capacity = i;
            for (int i2 = 0; i2 < i; i2++) {
                this.viewCreator.request$div_release(this, 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final T extractViewBlocked() {
            try {
                this.viewCreator.promote$div_release(this);
                T poll = this.viewQueue.poll(16L, TimeUnit.MILLISECONDS);
                if (poll == null) {
                    return this.viewFactory.createView();
                }
                this.realQueueSize.decrementAndGet();
                return poll;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return this.viewFactory.createView();
            }
        }

        private final void requestViewCreation() {
            if (this.capacity <= this.realQueueSize.get()) {
                return;
            }
            Companion companion = AdvanceViewPool.Companion;
            long nanoTime = System.nanoTime();
            this.viewCreator.request$div_release(this, this.viewQueue.size());
            this.realQueueSize.incrementAndGet();
            long nanoTime2 = System.nanoTime() - nanoTime;
            ViewPoolProfiler viewPoolProfiler = this.profiler;
            if (viewPoolProfiler != null) {
                viewPoolProfiler.onViewRequested$div_release(nanoTime2);
            }
        }

        public final void createAndEnqueueView() {
            if (this.stopped.get()) {
                return;
            }
            try {
                this.viewQueue.offer(this.viewFactory.createView());
            } catch (Exception unused) {
            }
        }

        @Override // com.yandex.div.internal.viewpool.ViewFactory
        public T createView() {
            return extractView();
        }

        public final T extractView() {
            Companion companion = AdvanceViewPool.Companion;
            long nanoTime = System.nanoTime();
            Object poll = this.viewQueue.poll();
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (poll == null) {
                long nanoTime3 = System.nanoTime();
                poll = extractViewBlocked();
                long nanoTime4 = System.nanoTime() - nanoTime3;
                ViewPoolProfiler viewPoolProfiler = this.profiler;
                if (viewPoolProfiler != null) {
                    viewPoolProfiler.onViewObtainedWithBlock$div_release(this.viewName, nanoTime4);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler = this.sessionProfiler;
                this.viewQueue.size();
                PerformanceDependentSessionProfiler.access$getSession$p(performanceDependentSessionProfiler);
            } else {
                this.realQueueSize.decrementAndGet();
                ViewPoolProfiler viewPoolProfiler2 = this.profiler;
                if (viewPoolProfiler2 != null) {
                    viewPoolProfiler2.onViewObtainedWithoutBlock$div_release(nanoTime2);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler2 = this.sessionProfiler;
                this.viewQueue.size();
                PerformanceDependentSessionProfiler.access$getSession$p(performanceDependentSessionProfiler2);
            }
            requestViewCreation();
            return (T) poll;
        }

        public final boolean getNotEmpty() {
            return this.notEmpty;
        }

        public final String getViewName() {
            return this.viewName;
        }
    }

    /* compiled from: AdvanceViewPool.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AdvanceViewPool(ViewPoolProfiler viewPoolProfiler, PerformanceDependentSessionProfiler performanceDependentSessionProfiler, ViewCreator viewCreator) {
        this.profiler = viewPoolProfiler;
        this.sessionProfiler = performanceDependentSessionProfiler;
        this.viewCreator = viewCreator;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> T obtain(String str) {
        Channel channel;
        synchronized (this.viewFactories) {
            channel = (Channel) UtilsKt.getOrThrow(this.viewFactories, str, "Factory is not registered");
        }
        return (T) channel.createView();
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> void register(String str, ViewFactory<T> viewFactory, int i) {
        synchronized (this.viewFactories) {
            if (this.viewFactories.containsKey(str)) {
                Assert.fail("Factory is already registered");
            } else {
                this.viewFactories.put(str, new Channel<>(str, this.profiler, this.sessionProfiler, viewFactory, this.viewCreator, i));
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }
}
