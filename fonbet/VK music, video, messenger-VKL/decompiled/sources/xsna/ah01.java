package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public abstract class ah01 implements Runnable {

    @Nullable
    public final TaskCompletionSource b;

    public ah01() {
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

    public ah01(@Nullable TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }
}
