package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public final class ht81 {
    public final jnh a;
    public final ExecutorService b;

    public ht81() {
        jnh jnhVar = new jnh(1);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        this.a = jnhVar;
        this.b = newFixedThreadPool;
    }
}
