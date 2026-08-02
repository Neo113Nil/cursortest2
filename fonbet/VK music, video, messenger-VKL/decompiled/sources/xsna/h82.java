package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: AndroidExecutors.java */
/* loaded from: classes12.dex */
public final class h82 {
    public static final h82 b = new h82();
    public static final int c;
    public static final int d;
    public final a a = new a();

    /* compiled from: AndroidExecutors.java */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        c = availableProcessors + 1;
        d = (availableProcessors * 2) + 1;
    }
}
