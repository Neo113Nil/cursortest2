package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import xsna.n9z0;

/* loaded from: classes10.dex */
public final class pu1 {
    public final Executor a;
    public final Executor b;

    public /* synthetic */ pu1() {
        this(new n9z0(), Executors.newFixedThreadPool(2));
    }

    public static final void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public pu1(Executor executor, Executor executor2) {
        this.a = executor;
        this.b = executor2;
    }
}
