package xsna;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* compiled from: Task.java */
/* loaded from: classes12.dex */
public final class q4o0 implements Runnable {
    public final /* synthetic */ vou b;
    public final /* synthetic */ Callable c;

    public q4o0(vou vouVar, Callable callable) {
        this.b = vouVar;
        this.c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vou vouVar = this.b;
        e5o0 e5o0Var = (e5o0) vouVar.b;
        try {
            if (e5o0Var.h(this.c.call())) {
            } else {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            }
        } catch (CancellationException unused) {
            if (!e5o0Var.g()) {
                throw new IllegalStateException("Cannot cancel a completed task.");
            }
        } catch (Exception e) {
            vouVar.i(e);
        }
    }
}
