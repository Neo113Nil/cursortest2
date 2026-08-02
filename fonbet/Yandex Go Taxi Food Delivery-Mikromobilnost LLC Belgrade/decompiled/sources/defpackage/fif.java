package defpackage;

import com.yandex.go.zone.model.ZoneMode;
import com.yandex.go.zone.model.h;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes10.dex */
public final class fif implements bre0 {
    public final dqe0 a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public boolean d = true;

    public fif(dqe0 dqe0Var) {
        this.a = dqe0Var;
    }

    public final String a() {
        Supplier supplier = (Supplier) this.b.get();
        if (supplier != null) {
            return (String) supplier.get();
        }
        Supplier supplier2 = (Supplier) this.c.get();
        h hVar = ZoneMode.Companion;
        String str = this.a.a.Q;
        hVar.getClass();
        return (!h.a(str) || supplier2 == null) ? this.a.a.Q : (String) supplier2.get();
    }

    @Override // defpackage.bre0
    public final void b() {
        this.d = true;
    }

    public final l30 c(Supplier supplier) {
        this.b.set(supplier);
        return new l30(3, this, supplier);
    }
}
