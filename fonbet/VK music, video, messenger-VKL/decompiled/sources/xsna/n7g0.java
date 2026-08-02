package xsna;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: RequestDeduplicator.java */
/* loaded from: classes.dex */
public final class n7g0 {
    public final Executor a;
    public final zk3 b = new zk3();

    public n7g0(ExecutorService executorService) {
        this.a = executorService;
    }
}
