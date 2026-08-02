package xsna;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.xhl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class whl0 implements OnSuccessListener {
    public final /* synthetic */ SuccessContinuation a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ CancellationTokenSource c;

    public /* synthetic */ whl0(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.a = successContinuation;
        this.b = taskCompletionSource;
        this.c = cancellationTokenSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        SuccessContinuation successContinuation = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        try {
            Task then = successContinuation.then((xhl0.a) obj);
            then.addOnSuccessListener(new qhl0(taskCompletionSource));
            then.addOnFailureListener(new rhl0(taskCompletionSource));
            then.addOnCanceledListener(new shl0(this.c));
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
