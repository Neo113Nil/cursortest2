package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.bvy;
import defpackage.pey;
import defpackage.pq60;

/* loaded from: classes10.dex */
public final class u extends bvy implements q {
    public final pey x;
    public final /* synthetic */ v y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, pey peyVar, pq60 pq60Var) {
        super(vVar, pq60Var);
        this.y = vVar;
        this.x = peyVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        pey peyVar2 = this.x;
        Lifecycle.State b = peyVar2.getLifecycle().b();
        if (b == Lifecycle.State.DESTROYED) {
            this.y.j(this.a);
            return;
        }
        Lifecycle.State state = null;
        while (state != b) {
            a(d());
            state = b;
            b = peyVar2.getLifecycle().b();
        }
    }

    @Override // defpackage.bvy
    public final void b() {
        this.x.getLifecycle().d(this);
    }

    @Override // defpackage.bvy
    public final boolean c(pey peyVar) {
        return this.x == peyVar;
    }

    @Override // defpackage.bvy
    public final boolean d() {
        return this.x.getLifecycle().b().a(Lifecycle.State.STARTED);
    }
}
