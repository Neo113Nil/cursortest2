package com.yandex.div.internal.viewpool;

import android.os.Process;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.util.Cancelable;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.AdvanceViewPool;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.epx;
import xsna.fpf0;
import xsna.jq;
import xsna.p7f0;
import xsna.qcy;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: ViewCreator.kt */
/* loaded from: classes7.dex */
public final class ViewCreator {
    private static final Companion Companion = new Companion(null);
    private final ViewCreatorThread creatorThread;

    /* compiled from: ViewCreator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: ViewCreator.kt */
    public static final class CreateViewTask implements Runnable, Comparable<CreateViewTask> {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        private final p7f0 channelRef$delegate;
        private final int priority;
        private final String viewName;

        static {
            PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CreateViewTask.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0);
            fpf0.a.getClass();
            $$delegatedProperties = new qcy[]{propertyReference1Impl};
        }

        public CreateViewTask(AdvanceViewPool.Channel<?> channel, int i) {
            this.priority = i;
            this.viewName = channel.getViewName();
            this.channelRef$delegate = UtilsKt.weak(channel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final AdvanceViewPool.Channel<?> getChannelRef() {
            return (AdvanceViewPool.Channel) this.channelRef$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!CreateViewTask.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            CreateViewTask createViewTask = (CreateViewTask) obj;
            return epx.f(this.viewName, createViewTask.viewName) && this.priority == createViewTask.priority;
        }

        public final String getViewName() {
            return this.viewName;
        }

        public int hashCode() {
            return this.viewName.hashCode() + ((6913 + this.priority) * 31);
        }

        @Override // java.lang.Runnable
        public void run() {
            AdvanceViewPool.Channel<?> channelRef = getChannelRef();
            if (channelRef != null) {
                channelRef.createAndEnqueueView();
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(CreateViewTask createViewTask) {
            int i = this.priority - createViewTask.priority;
            return i != 0 ? i : !epx.f(this.viewName, createViewTask.viewName) ? 1 : 0;
        }
    }

    /* compiled from: ViewCreator.kt */
    public static final class ViewCreatorThread extends Thread {
        private final CpuUsageHistogramReporter cpuUsageHistogramReporter;
        private volatile String currentViewName;
        private final BatchBlockingQueue<CreateViewTask> taskQueue;

        public ViewCreatorThread(String str, CpuUsageHistogramReporter cpuUsageHistogramReporter) {
            super(str);
            this.cpuUsageHistogramReporter = cpuUsageHistogramReporter;
            this.taskQueue = new BatchBlockingQueue<>(new PriorityQueue(32));
            setPriority(5);
        }

        private final void createView() throws InterruptedException {
            CreateViewTask poll = this.taskQueue.poll();
            if (poll == null) {
                try {
                    setPriority(3);
                    poll = this.taskQueue.take();
                } finally {
                    setPriority(5);
                }
            }
            this.currentViewName = poll.getViewName();
            poll.run();
            this.currentViewName = null;
        }

        public final String getCurrentViewName() {
            return this.currentViewName;
        }

        public final BatchBlockingQueue<CreateViewTask> getTaskQueue() {
            return this.taskQueue;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Cancelable startReporting = this.cpuUsageHistogramReporter.startReporting("Div.ViewPool.CPU", Process.myTid());
            while (true) {
                try {
                    try {
                        createView();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        ((jq) startReporting).getClass();
                        CpuUsageHistogramReporter.NoOp.startReporting$lambda$0();
                        return;
                    }
                } catch (Throwable th) {
                    ((jq) startReporting).getClass();
                    CpuUsageHistogramReporter.NoOp.startReporting$lambda$0();
                    throw th;
                }
            }
        }
    }

    public ViewCreator(CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        ViewCreatorThread viewCreatorThread = new ViewCreatorThread("ViewPoolThread", cpuUsageHistogramReporter);
        this.creatorThread = viewCreatorThread;
        viewCreatorThread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        r2.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void promote$div_release(AdvanceViewPool.Channel<?> channel) {
        Queue queue;
        if (epx.f(channel.getViewName(), this.creatorThread.getCurrentViewName()) || channel.getNotEmpty()) {
            return;
        }
        BatchBlockingQueue<CreateViewTask> taskQueue = this.creatorThread.getTaskQueue();
        ((BatchBlockingQueue) taskQueue).lock.lock();
        try {
            if (!epx.f(channel.getViewName(), this.creatorThread.getCurrentViewName()) && !channel.getNotEmpty()) {
                taskQueue = this.creatorThread.getTaskQueue();
                ((BatchBlockingQueue) taskQueue).lock.lock();
                queue = ((BatchBlockingQueue) taskQueue).queue;
                Iterator it = queue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (epx.f(((CreateViewTask) it.next()).getViewName(), channel.getViewName())) {
                        break;
                    }
                }
                ((BatchBlockingQueue) taskQueue).lock.unlock();
                this.creatorThread.getTaskQueue().offer(new CreateViewTask(channel, -1));
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            ((BatchBlockingQueue) taskQueue).lock.unlock();
        }
    }

    public final void request$div_release(AdvanceViewPool.Channel<?> channel, int i) {
        this.creatorThread.getTaskQueue().offer(new CreateViewTask(channel, i));
    }
}
