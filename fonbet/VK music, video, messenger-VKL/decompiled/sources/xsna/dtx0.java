package xsna;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WithLifecycleState.kt */
/* loaded from: classes12.dex */
public final class dtx0 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public dtx0(Lifecycle lifecycle, androidx.lifecycle.h0 h0Var) {
        this.c = lifecycle;
        this.d = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((Lifecycle) this.c).removeObserver((androidx.lifecycle.h0) this.d);
                return;
            default:
                synchronized (((AtomicReference) this.c)) {
                    try {
                        try {
                            AtomicReference atomicReference = (AtomicReference) this.c;
                            mb01 mb01Var = (mb01) ((bf01) this.d).b;
                            atomicReference.set(Double.valueOf(mb01Var.h.m(mb01Var.o().o(), s701.O)));
                        } finally {
                            ((AtomicReference) this.c).notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public dtx0(bf01 bf01Var, AtomicReference atomicReference) {
        this.d = bf01Var;
        this.c = atomicReference;
    }
}
