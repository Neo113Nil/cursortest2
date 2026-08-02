package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: StateFlow.kt */
/* loaded from: classes11.dex */
public final class ytk0 extends vh<utk0<?>> {
    public final AtomicReference<Object> a = new AtomicReference<>(null);

    @Override // xsna.vh
    public final boolean a(th thVar) {
        AtomicReference<Object> atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(vtk0.a);
        return true;
    }

    @Override // xsna.vh
    public final spj[] b(th thVar) {
        this.a.set(null);
        return uh.a;
    }
}
