package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public abstract class xq01 implements Runnable {

    @Nullable
    public final TaskCompletionSource b;

    public xq01() {
        this.b = null;
    }

    @Nullable
    public final TaskCompletionSource a() {
        return this.b;
    }

    public final void b(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.b;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c();
        } catch (Exception e) {
            b(e);
        }
    }

    public xq01(@Nullable TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }
}
