package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes11.dex */
public final class ktu {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object failure;
        try {
            failure = new htu(b(Looper.getMainLooper()));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
    }

    public static final void a(lq9 lq9Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new jtu(lq9Var));
    }

    public static final Handler b(Looper looper) {
        return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
    }

    public static final Object c(SuspendLambda suspendLambda) {
        Choreographer choreographer2 = choreographer;
        int i = 1;
        if (choreographer2 != null) {
            lq9 lq9Var = new lq9(1, s7s0.c(suspendLambda));
            lq9Var.o();
            choreographer2.postFrameCallback(new jtu(lq9Var));
            Object n = lq9Var.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return n;
        }
        lq9 lq9Var2 = new lq9(1, s7s0.c(suspendLambda));
        lq9Var2.o();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(lq9Var2);
        } else {
            bdn bdnVar = bdn.a;
            ie00.a.P(lq9Var2.f, new fy4(lq9Var2, i));
        }
        Object n2 = lq9Var2.n();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n2;
    }
}
