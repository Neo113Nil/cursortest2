package yads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class qx3 implements bx3 {
    public final ArrayDeque b = new ArrayDeque();
    public kx3 c = null;
    public final ThreadPoolExecutor a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        kx3 kx3Var = (kx3) this.b.poll();
        this.c = kx3Var;
        if (kx3Var != null) {
            kx3Var.a(this.a);
        }
    }

    public final void a(kx3 kx3Var) {
        kx3Var.a = this;
        this.b.add(kx3Var);
        if (this.c == null) {
            a();
        }
    }
}
