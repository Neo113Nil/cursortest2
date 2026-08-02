package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class qe01 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ bf01 c;

    public qe01(bf01 bf01Var, AtomicReference atomicReference) {
        this.c = bf01Var;
        this.b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                try {
                    AtomicReference atomicReference = this.b;
                    mb01 mb01Var = (mb01) this.c.b;
                    atomicReference.set(Boolean.valueOf(mb01Var.h.t(mb01Var.o().o(), s701.K)));
                } finally {
                    this.b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
