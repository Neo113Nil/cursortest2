package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public abstract class i6u {
    private static volatile Choreographer choreographer;

    static {
        Object failure;
        try {
            failure = new g6u(b(Looper.getMainLooper()));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
    }

    public static final void a(j18 j18Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new h6u(0, j18Var));
    }

    public static final Handler b(Looper looper) {
        return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
    }

    public static final Object c(Continuation continuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            j18 j18Var = new j18(1, dvw.b(continuation));
            j18Var.u();
            choreographer2.postFrameCallback(new h6u(0, j18Var));
            Object s = j18Var.s();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s;
        }
        j18 j18Var2 = new j18(1, dvw.b(continuation));
        j18Var2.u();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(j18Var2);
        } else {
            sjh sjhVar = uyj.a;
            o400.a.o(j18Var2.x, new r6b(j18Var2, 2));
        }
        Object s2 = j18Var2.s();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s2;
    }

    public static final g6u d(Handler handler, String str) {
        return new g6u(handler, str, false);
    }
}
