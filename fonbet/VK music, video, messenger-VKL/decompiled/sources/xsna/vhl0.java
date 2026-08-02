package xsna;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class vhl0 implements OnCompleteListener {
    public final /* synthetic */ xhl0 b;
    public final /* synthetic */ Continuation c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ CancellationTokenSource e;

    public /* synthetic */ vhl0(xhl0 xhl0Var, Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.b = xhl0Var;
        this.c = continuation;
        this.d = taskCompletionSource;
        this.e = cancellationTokenSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        xhl0 xhl0Var = this.b;
        Continuation continuation = this.c;
        TaskCompletionSource taskCompletionSource = this.d;
        try {
            Task task2 = (Task) continuation.then(xhl0Var);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new qhl0(taskCompletionSource));
            task2.addOnFailureListener(new rhl0(taskCompletionSource));
            task2.addOnCanceledListener(new shl0(this.e));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e.getCause());
            } else {
                taskCompletionSource.setException(e);
            }
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }
}
