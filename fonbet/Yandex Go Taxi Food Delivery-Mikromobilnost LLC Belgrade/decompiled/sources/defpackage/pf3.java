package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public class pf3 implements Executor {
    public static volatile pf3 b;
    public final ExecutorService a = Executors.newFixedThreadPool(2, new of3(0));

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
