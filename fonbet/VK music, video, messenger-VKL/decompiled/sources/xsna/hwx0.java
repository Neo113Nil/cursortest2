package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public final class hwx0 implements r5o0 {
    public final emi0 a;
    public final ovj b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final a d = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            hwx0.this.c.post(runnable);
        }
    }

    public hwx0(@NonNull Executor executor) {
        emi0 emi0Var = new emi0(executor);
        this.a = emi0Var;
        this.b = qu5.b(emi0Var);
    }

    @Override // xsna.r5o0
    @NonNull
    public final ovj a() {
        return this.b;
    }

    @Override // xsna.r5o0
    @NonNull
    public final a c() {
        return this.d;
    }

    @Override // xsna.r5o0
    @NonNull
    public final emi0 d() {
        return this.a;
    }
}
