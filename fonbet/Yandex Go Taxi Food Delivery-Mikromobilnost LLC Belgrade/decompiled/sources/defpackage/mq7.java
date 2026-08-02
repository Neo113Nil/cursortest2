package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes10.dex */
public final /* synthetic */ class mq7 implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        of3 of3Var = nq7.c;
        sgb1.d("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
