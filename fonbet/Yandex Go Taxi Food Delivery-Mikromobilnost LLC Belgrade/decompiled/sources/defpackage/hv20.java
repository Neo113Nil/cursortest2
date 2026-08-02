package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public abstract class hv20 implements Closeable, oey {
    public static final ga0 x = new ga0("MobileVisionBase", "");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final c000 b;
    public final x18 c;
    public final Executor w;

    public hv20(c000 c000Var, Executor executor) {
        this.b = c000Var;
        x18 x18Var = new x18();
        this.c = x18Var;
        this.w = executor;
        c000Var.b.incrementAndGet();
        c000Var.a(executor, f891.b, x18Var.a).d(wbz0.x);
    }

    public final synchronized zzw c(xzv xzvVar) {
        cvw.m(xzvVar, "InputImage can not be null");
        if (this.a.get()) {
            return udq0.o(new MlKitException("This detector is already closed!", 14));
        }
        if (xzvVar.d < 32 || xzvVar.e < 32) {
            return udq0.o(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.b.a(this.w, new hhe0(1, this, xzvVar), this.c.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @w(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.a.getAndSet(true)) {
            return;
        }
        this.c.a();
        c000 c000Var = this.b;
        Executor executor = this.w;
        if (c000Var.b.get() <= 0) {
            z = false;
        }
        cvw.o(z);
        c000Var.a.a(new uqs(25, c000Var, new atx0()), executor);
    }
}
