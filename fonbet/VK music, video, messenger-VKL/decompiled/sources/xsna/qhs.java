package xsna;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import xsna.irk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qhs implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qhs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference<m0q> atomicReference;
        AtomicReference<m0q> atomicReference2;
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                ReentrantLock reentrantLock = rhs.a;
                reentrantLock.lock();
                ReentrantLock reentrantLock2 = rhs.a;
                rhs.d(context);
                reentrantLock.unlock();
                break;
            case 1:
                n3w n3wVar = (n3w) this.c;
                n3wVar.s = new zpk(n3wVar, new zxc0());
                break;
            default:
                fsk0 fsk0Var = (fsk0) this.c;
                irk0.a aVar = fsk0Var.d;
                if (aVar != null) {
                    try {
                        wwk wwkVar = fsk0Var.g;
                        atomicReference = new AtomicReference<>(wwkVar != null ? wwkVar.i(aVar.b, true) : new m0q());
                    } catch (Throwable unused) {
                        atomicReference = new AtomicReference<>(new m0q());
                    }
                    fsk0Var.e = atomicReference;
                    try {
                        wwk wwkVar2 = fsk0Var.g;
                        atomicReference2 = new AtomicReference<>(wwkVar2 != null ? wwkVar2.i(aVar.b, false) : new m0q());
                    } catch (Throwable unused2) {
                        atomicReference2 = new AtomicReference<>(new m0q());
                    }
                    fsk0Var.f = atomicReference2;
                    break;
                }
                break;
        }
    }
}
