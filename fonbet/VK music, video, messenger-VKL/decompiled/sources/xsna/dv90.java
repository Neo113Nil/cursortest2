package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class dv90 {

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public interface a<R extends qdg0, T> {
        @Nullable
        T a(@NonNull R r);
    }

    @NonNull
    public static <R extends qdg0, T> Task<T> a(@NonNull cv90<R> cv90Var, @NonNull a<R, T> aVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        cv90Var.addStatusListener(new xpz0(cv90Var, taskCompletionSource, aVar));
        return taskCompletionSource.getTask();
    }
}
