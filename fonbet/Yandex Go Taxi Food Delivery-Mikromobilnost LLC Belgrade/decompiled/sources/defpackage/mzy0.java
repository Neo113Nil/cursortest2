package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class mzy0 implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        q5z.i(executor);
        return executor;
    }
}
