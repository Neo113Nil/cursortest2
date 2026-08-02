package xsna;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* loaded from: classes12.dex */
public final class u3q {
    public static final a a = new a();
    public static final b b = new b();

    /* compiled from: Executors.java */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            s2r0.f().post(runnable);
        }
    }

    /* compiled from: Executors.java */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }
}
