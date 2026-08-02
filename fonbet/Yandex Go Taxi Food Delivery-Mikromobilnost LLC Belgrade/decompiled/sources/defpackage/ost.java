package defpackage;

import android.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class ost implements RejectedExecutionHandler {
    public final /* synthetic */ qst a;

    public ost(qst qstVar) {
        this.a = qstVar;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (this.a.b.isShutdown()) {
            Log.e("FA-W", "Data loss. Executor service is shut down.");
        } else {
            Log.e("FA-W", "Data loss. Max task queueOnWorker size exceeded.");
        }
    }
}
