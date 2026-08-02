package defpackage;

import com.bumptech.glide.load.engine.c;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class k30 {
    public final ExecutorService a;
    public final HashMap b;
    public final ReferenceQueue c;
    public c d;
    public volatile boolean e;

    public k30() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new i30(0));
        this.b = new HashMap();
        this.c = new ReferenceQueue();
        this.a = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new uz(2, this));
    }

    public final synchronized void a(khx khxVar, b2o b2oVar) {
        j30 j30Var = (j30) this.b.put(khxVar, new j30(khxVar, b2oVar, this.c));
        if (j30Var != null) {
            j30Var.c = null;
            j30Var.clear();
        }
    }

    public final void b(j30 j30Var) {
        otj0 otj0Var;
        synchronized (this) {
            this.b.remove(j30Var.a);
            if (j30Var.b && (otj0Var = j30Var.c) != null) {
                this.d.d(j30Var.a, new b2o(otj0Var, true, false, j30Var.a, this.d));
            }
        }
    }
}
