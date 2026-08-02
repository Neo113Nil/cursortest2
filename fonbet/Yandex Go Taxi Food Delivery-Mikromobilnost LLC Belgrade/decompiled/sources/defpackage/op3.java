package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes15.dex */
public final class op3 implements xbi0 {
    public final AtomicReference a = new AtomicReference();

    public final x08 a() {
        return (x08) this.a.get();
    }

    public final void b(x08 x08Var) {
        x08 x08Var2 = (x08) this.a.getAndSet(x08Var);
        if (x08Var2 != null) {
            x08Var2.cancel();
        }
    }

    @Override // defpackage.vbi0
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, kgx kgxVar) {
        return a();
    }

    @Override // defpackage.xbi0
    public final /* bridge */ /* synthetic */ void setValue(Object obj, kgx kgxVar, Object obj2) {
        b((x08) obj2);
    }
}
