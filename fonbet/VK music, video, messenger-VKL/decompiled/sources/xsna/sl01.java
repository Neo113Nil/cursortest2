package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public abstract class sl01 implements Runnable {

    @Nullable
    public final TaskCompletionSource b;

    public sl01() {
        this.b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.b;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public sl01(@Nullable TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }
}
