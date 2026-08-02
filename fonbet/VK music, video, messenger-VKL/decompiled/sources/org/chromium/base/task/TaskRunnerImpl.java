package org.chromium.base.task;

import android.util.Pair;
import internal.org.jni_zero.CalledByNative;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.chromium.base.TraceEvent;
import xsna.fo8;
import xsna.nx3;

/* loaded from: classes8.dex */
public class TaskRunnerImpl implements TaskRunner {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static int sPendingTaskMapNextIndex;
    private static final Runnable[] sPendingTaskTable;
    private boolean mDidOneTimeInitialization;
    private volatile long mNativeTaskRunnerAndroid;
    private List<Pair<Runnable, Long>> mPreNativeDelayedTasks;
    private final Object mPreNativeTaskLock;
    private Queue<Runnable> mPreNativeTasks;
    protected final Runnable mRunPreNativeTaskClosure;
    private final int mTaskRunnerType;
    protected final int mTaskTraits;
    private final String mTraceEvent;
    private static final ReferenceQueue<Object> sQueue = new ReferenceQueue<>();
    private static final Object sPendingTaskLock = new Object();
    private static final Map<Integer, Runnable> sPendingTaskMap = new HashMap();
    private static final Set<TaskRunnerCleaner> sCleaners = new HashSet();

    public interface Natives {
        void destroy(long j);

        long init(int i, int i2);

        void postDelayedTask(long j, long j2, int i);
    }

    public static class TaskRunnerCleaner extends WeakReference<TaskRunnerImpl> {
        final long mNativePtr;

        public TaskRunnerCleaner(TaskRunnerImpl taskRunnerImpl) {
            super(taskRunnerImpl, TaskRunnerImpl.sQueue);
            this.mNativePtr = taskRunnerImpl.mNativeTaskRunnerAndroid;
        }

        public void destroy() {
            TaskRunnerImplJni.get().destroy(this.mNativePtr);
        }
    }

    static {
        Runnable[] runnableArr = new Runnable[50];
        sPendingTaskTable = runnableArr;
        sPendingTaskMapNextIndex = runnableArr.length;
    }

    public TaskRunnerImpl(int i) {
        this(i, "TaskRunnerImpl", 0);
        destroyGarbageCollectedTaskRunners();
    }

    private static Runnable dequeueTask(int i) {
        Runnable remove;
        synchronized (sPendingTaskLock) {
            try {
                Runnable[] runnableArr = sPendingTaskTable;
                if (i < runnableArr.length) {
                    remove = runnableArr[i];
                    runnableArr[i] = null;
                } else {
                    remove = sPendingTaskMap.remove(Integer.valueOf(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    private static void destroyGarbageCollectedTaskRunners() {
        while (true) {
            TaskRunnerCleaner taskRunnerCleaner = (TaskRunnerCleaner) sQueue.poll();
            if (taskRunnerCleaner == null) {
                return;
            }
            taskRunnerCleaner.destroy();
            Set<TaskRunnerCleaner> set = sCleaners;
            synchronized (set) {
                set.remove(taskRunnerCleaner);
            }
        }
    }

    private void oneTimeInitialization() {
        if (this.mDidOneTimeInitialization) {
            return;
        }
        this.mDidOneTimeInitialization = true;
        if (!PostTask.registerPreNativeTaskRunner(this)) {
            initNativeTaskRunner();
        } else {
            this.mPreNativeTasks = new ArrayDeque();
            this.mPreNativeDelayedTasks = new ArrayList();
        }
    }

    private static void queueDelayedTaskToNative(long j, Runnable runnable, long j2) {
        TaskRunnerImplJni.get().postDelayedTask(j, j2, queueTask(runnable, j2 == 0));
    }

    private static int queueTask(Runnable runnable, boolean z) {
        synchronized (sPendingTaskLock) {
            int i = 0;
            while (z) {
                try {
                    Runnable[] runnableArr = sPendingTaskTable;
                    if (i >= runnableArr.length) {
                        break;
                    }
                    if (runnableArr[i] == null) {
                        runnableArr[i] = runnable;
                        return i;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i2 = sPendingTaskMapNextIndex;
            sPendingTaskMapNextIndex = i2 + 1;
            sPendingTaskMap.put(Integer.valueOf(i2), runnable);
            return i2;
        }
    }

    @CalledByNative
    public static void runTask(int i) {
        dequeueTask(i).run();
    }

    public int clearTaskQueueForTesting() {
        int i;
        synchronized (this.mPreNativeTaskLock) {
            try {
                Queue<Runnable> queue = this.mPreNativeTasks;
                if (queue != null) {
                    List<Pair<Runnable, Long>> list = this.mPreNativeDelayedTasks;
                    i = queue.size() + list.size();
                    this.mPreNativeTasks.clear();
                    list.clear();
                } else {
                    i = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        postDelayedTask(runnable, 0L);
    }

    public void initNativeTaskRunner() {
        long init = TaskRunnerImplJni.get().init(this.mTaskRunnerType, this.mTaskTraits);
        synchronized (this.mPreNativeTaskLock) {
            try {
                Queue<Runnable> queue = this.mPreNativeTasks;
                if (queue != null) {
                    Iterator<Runnable> it = queue.iterator();
                    while (it.hasNext()) {
                        queueDelayedTaskToNative(init, it.next(), 0L);
                    }
                    this.mPreNativeTasks = null;
                }
                List<Pair<Runnable, Long>> list = this.mPreNativeDelayedTasks;
                if (list != null) {
                    for (Pair<Runnable, Long> pair : list) {
                        queueDelayedTaskToNative(init, (Runnable) pair.first, ((Long) pair.second).longValue());
                    }
                    this.mPreNativeDelayedTasks = null;
                }
                this.mNativeTaskRunnerAndroid = init;
            } catch (Throwable th) {
                throw th;
            }
        }
        Set<TaskRunnerCleaner> set = sCleaners;
        synchronized (set) {
            set.add(new TaskRunnerCleaner(this));
        }
        destroyGarbageCollectedTaskRunners();
    }

    @Override // org.chromium.base.task.TaskRunner
    public final void postDelayedTask(Runnable runnable, long j) {
        if (PostTask.ENABLE_TASK_ORIGINS) {
            runnable = PostTask.populateTaskOrigin(new TaskOriginException(), runnable);
        }
        if (this.mNativeTaskRunnerAndroid != 0) {
            queueDelayedTaskToNative(this.mNativeTaskRunnerAndroid, runnable, j);
            return;
        }
        synchronized (this.mPreNativeTaskLock) {
            try {
                oneTimeInitialization();
                if (this.mNativeTaskRunnerAndroid != 0) {
                    queueDelayedTaskToNative(this.mNativeTaskRunnerAndroid, runnable, j);
                    return;
                }
                if (j == 0) {
                    this.mPreNativeTasks.add(runnable);
                    schedulePreNativeTask();
                } else if (!schedulePreNativeDelayedTask(runnable, j)) {
                    this.mPreNativeDelayedTasks.add(new Pair<>(runnable, Long.valueOf(j)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void runPreNativeTask() {
        TraceEvent scoped = TraceEvent.scoped(this.mTraceEvent);
        try {
            synchronized (this.mPreNativeTaskLock) {
                Queue<Runnable> queue = this.mPreNativeTasks;
                if (queue == null) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    queue.poll().run();
                    if (scoped != null) {
                        scoped.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean schedulePreNativeDelayedTask(Runnable runnable, long j) {
        return false;
    }

    public void schedulePreNativeTask() {
        PostTask.getPrenativeThreadPoolExecutor().execute(this.mRunPreNativeTaskClosure);
    }

    public TaskRunnerImpl(int i, String str, int i2) {
        this.mRunPreNativeTaskClosure = new nx3(this, 17);
        this.mPreNativeTaskLock = new Object();
        this.mTaskTraits = i;
        this.mTraceEvent = fo8.a(str, ".PreNativeTask.run");
        this.mTaskRunnerType = i2;
    }
}
