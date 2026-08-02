package xsna;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Supervisor.kt */
/* loaded from: classes11.dex */
public final class whn0 {
    public static vhn0 a() {
        return new vhn0(null);
    }

    public static final Object b(Task task, i6x i6xVar) {
        if (!task.isComplete()) {
            lq9 lq9Var = new lq9(1, s7s0.c(i6xVar));
            lq9Var.o();
            task.addOnCompleteListener(lzm.b, new j7o0(lq9Var));
            Object n = lq9Var.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return n;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final Object c(wzs wzsVar, ContinuationImpl continuationImpl) {
        uhn0 uhn0Var = new uhn0(continuationImpl.getContext(), continuationImpl);
        Object c = e2l.c(uhn0Var, true, uhn0Var, wzsVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return c;
    }
}
