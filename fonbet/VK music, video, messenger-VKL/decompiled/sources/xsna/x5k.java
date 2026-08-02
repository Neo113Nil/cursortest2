package xsna;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsTasks.java */
/* loaded from: classes.dex */
public final class x5k {
    public static final ddk a = new ddk();

    public static <T> Task<T> a(Task<T> task, Task<T> task2) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Continuation<T, Task<TContinuationResult>> continuation = new Continuation() { // from class: xsna.w5k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                boolean isSuccessful = task3.isSuccessful();
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (isSuccessful) {
                    taskCompletionSource2.trySetResult(task3.getResult());
                } else if (task3.getException() != null) {
                    taskCompletionSource2.trySetException(task3.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
            }
        };
        ddk ddkVar = a;
        task.continueWithTask(ddkVar, continuation);
        task2.continueWithTask(ddkVar, continuation);
        return taskCompletionSource.getTask();
    }
}
