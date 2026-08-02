package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes.dex */
public final class px60 implements q, AutoCloseable {
    public final /* synthetic */ kx60 a;
    public final /* synthetic */ Lifecycle b;

    public px60(kx60 kx60Var, qx60 qx60Var, Lifecycle lifecycle) {
        this.a = kx60Var;
        this.b = lifecycle;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        Lifecycle.Event event2 = Lifecycle.Event.ON_START;
        kx60 kx60Var = this.a;
        if (event == event2) {
            kx60Var.h(true);
        } else if (event == Lifecycle.Event.ON_STOP) {
            kx60Var.h(false);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            kx60Var.f();
            this.b.d(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.d(this);
    }
}
