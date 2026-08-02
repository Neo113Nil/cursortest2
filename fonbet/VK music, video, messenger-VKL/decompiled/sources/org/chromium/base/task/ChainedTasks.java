package org.chromium.base.task;

import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.base.TraceEvent;
import xsna.o1;

/* loaded from: classes8.dex */
public class ChainedTasks {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private volatile boolean mCanceled;
    private boolean mFinalized;
    private final LinkedList<Pair<Integer, Runnable>> mTasks = new LinkedList<>();
    private final int mIterationIdForTesting = PostTask.sTestIterationForTesting;
    private final Runnable mRunAndPost = new Runnable() { // from class: org.chromium.base.task.ChainedTasks.1
        @Override // java.lang.Runnable
        public void run() {
            if (ChainedTasks.this.mIterationIdForTesting != PostTask.sTestIterationForTesting) {
                ChainedTasks.this.cancel();
            }
            if (ChainedTasks.this.mCanceled) {
                return;
            }
            Pair pair = (Pair) ChainedTasks.this.mTasks.pop();
            TraceEvent scoped = TraceEvent.scoped("ChainedTask.run: ".concat(((Runnable) pair.second).getClass().getName()));
            try {
                ((Runnable) pair.second).run();
                if (scoped != null) {
                    scoped.close();
                }
                if (ChainedTasks.this.mTasks.isEmpty()) {
                    return;
                }
                PostTask.postTask(((Integer) ((Pair) ChainedTasks.this.mTasks.peek()).first).intValue(), this);
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
    };

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        Iterator<Pair<Integer, Runnable>> it = this.mTasks.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next().second).run();
            if (this.mCanceled) {
                return;
            }
        }
    }

    public void add(int i, Runnable runnable) {
        if (PostTask.ENABLE_TASK_ORIGINS) {
            runnable = PostTask.populateTaskOrigin(new TaskOriginException(), runnable);
        }
        synchronized (this.mTasks) {
            this.mTasks.add(new Pair<>(Integer.valueOf(i), runnable));
        }
    }

    public void cancel() {
        synchronized (this.mTasks) {
            this.mFinalized = true;
            this.mCanceled = true;
        }
    }

    public void start(boolean z) {
        synchronized (this.mTasks) {
            this.mFinalized = true;
        }
        if (this.mTasks.isEmpty()) {
            return;
        }
        if (z) {
            PostTask.runOrPostTask(((Integer) this.mTasks.peek().first).intValue(), new o1(this, 3));
        } else {
            PostTask.postTask(((Integer) this.mTasks.peek().first).intValue(), this.mRunAndPost);
        }
    }
}
