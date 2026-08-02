package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes10.dex */
public final class c95 implements u5j0 {
    public final Lifecycle a;
    public final l8x b;

    public c95(Lifecycle lifecycle, l8x l8xVar) {
        this.a = lifecycle;
        this.b = l8xVar;
    }

    @Override // defpackage.u5j0
    public final void e() {
        this.a.d(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        this.b.a(null);
    }

    @Override // defpackage.u5j0
    public final void start() {
        this.a.a(this);
    }
}
