package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMap.kt */
/* loaded from: classes9.dex */
public final class duj0 implements wuj0<Object> {
    public final /* synthetic */ euj0<Object, Object>.a b;
    public final /* synthetic */ wuj0<Object> c;

    public duj0(euj0<Object, Object>.a aVar, wuj0<Object> wuj0Var) {
        this.b = aVar;
        this.c = wuj0Var;
    }

    @Override // xsna.wuj0
    public final void a(hgn hgnVar) {
        hgn andSet;
        euj0<Object, Object>.a aVar = this.b;
        AtomicReference<hgn> atomicReference = aVar.c;
        while (!atomicReference.compareAndSet(null, hgnVar) && atomicReference.get() == null) {
        }
        if (!aVar.b.get() || (andSet = atomicReference.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // xsna.wuj0
    public final void onError(Throwable th) {
        if (this.b.b.compareAndSet(false, true)) {
            this.c.onError(th);
        }
    }

    @Override // xsna.wuj0
    public final void onSuccess(Object obj) {
        if (this.b.b.compareAndSet(false, true)) {
            this.c.onSuccess(obj);
        }
    }
}
