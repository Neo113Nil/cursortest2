package xsna;

import java.util.concurrent.CancellationException;

/* compiled from: Task.java */
/* loaded from: classes12.dex */
public final class p4o0 implements Runnable {
    public final /* synthetic */ vou b;
    public final /* synthetic */ tpj c;
    public final /* synthetic */ e5o0 d;

    public p4o0(vou vouVar, tpj tpjVar, e5o0 e5o0Var) {
        this.b = vouVar;
        this.c = tpjVar;
        this.d = e5o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vou vouVar = this.b;
        e5o0 e5o0Var = (e5o0) vouVar.b;
        try {
            this.c.a(this.d);
            if (e5o0Var.h(null)) {
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
