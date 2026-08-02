package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.auth.passport.b;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final class ap90 implements Runnable, x08 {
    public static final Object B = new Object();
    public boolean A;
    public final Handler a;
    public final b b;
    public final qti0 c;
    public final x22 w;
    public final zo90 x;
    public final Executor y;
    public boolean z;

    public ap90(b bVar, qti0 qti0Var, x22 x22Var, zo90 zo90Var) {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.a = new Handler();
        this.b = bVar;
        this.c = qti0Var;
        this.w = x22Var;
        this.x = zo90Var;
        this.y = executor;
        a();
    }

    public final void a() {
        Handler handler = this.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        if (this.z) {
            return;
        }
        this.z = true;
        handler.removeCallbacksAndMessages(B);
        this.y.execute(new xo90(this, 0));
    }

    @Override // defpackage.x08
    public final void cancel() {
        Handler handler = this.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        this.A = true;
        handler.removeCallbacksAndMessages(B);
    }

    @Override // java.lang.Runnable
    public final void run() {
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        if (this.A) {
            return;
        }
        a();
    }
}
