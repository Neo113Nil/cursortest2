package xsna;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;

/* compiled from: Tasks.kt */
/* loaded from: classes11.dex */
public final class j7o0<TResult> implements OnCompleteListener {
    public final /* synthetic */ lq9 b;

    public j7o0(lq9 lq9Var) {
        this.b = lq9Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Object> task) {
        Exception exception = task.getException();
        lq9 lq9Var = this.b;
        if (exception != null) {
            lq9Var.resumeWith(new Result.Failure(exception));
        } else if (task.isCanceled()) {
            lq9Var.z(null);
        } else {
            lq9Var.resumeWith(task.getResult());
        }
    }
}
