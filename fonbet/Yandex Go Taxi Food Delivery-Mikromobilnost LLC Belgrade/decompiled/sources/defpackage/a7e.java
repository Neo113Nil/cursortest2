package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class a7e implements qrq0 {
    public final AtomicReference a;

    public a7e(qrq0 qrq0Var) {
        this.a = new AtomicReference(qrq0Var);
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        qrq0 qrq0Var = (qrq0) this.a.getAndSet(null);
        if (qrq0Var != null) {
            return qrq0Var.iterator();
        }
        ny61.r("This sequence can be consumed only once.");
        return null;
    }
}
