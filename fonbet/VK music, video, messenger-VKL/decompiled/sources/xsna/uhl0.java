package xsna;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class uhl0 implements OnCompleteListener {
    public final /* synthetic */ xhl0 b;
    public final /* synthetic */ Continuation c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ uhl0(xhl0 xhl0Var, Continuation continuation, TaskCompletionSource taskCompletionSource) {
        this.b = xhl0Var;
        this.c = continuation;
        this.d = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Continuation continuation = this.c;
        TaskCompletionSource taskCompletionSource = this.d;
        xhl0 xhl0Var = this.b;
        xhl0Var.getClass();
        try {
            Object then = continuation.then(xhl0Var);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setResult(then);
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
