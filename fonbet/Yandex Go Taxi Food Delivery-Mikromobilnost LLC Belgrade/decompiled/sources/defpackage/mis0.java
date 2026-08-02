package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class mis0 implements t1j0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.t1j0
    public final void a(kn2 kn2Var) {
        Object obj = this.a.get();
        if (obj != null) {
            kn2Var.invoke(obj);
        }
    }

    @Override // defpackage.t1j0
    public final void clear() {
        this.a.updateAndGet(new vp7(7));
    }

    @Override // defpackage.t1j0
    public final void save(Object obj) {
        this.a.updateAndGet(new saj(6, obj));
    }
}
