package xsna;

import xsna.l80;

/* compiled from: ActiveResources.java */
/* loaded from: classes12.dex */
public final class k80 implements Runnable {
    public final /* synthetic */ l80 b;

    public k80(l80 l80Var) {
        this.b = l80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l80 l80Var = this.b;
        l80Var.getClass();
        while (true) {
            try {
                l80Var.b((l80.a) l80Var.c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
