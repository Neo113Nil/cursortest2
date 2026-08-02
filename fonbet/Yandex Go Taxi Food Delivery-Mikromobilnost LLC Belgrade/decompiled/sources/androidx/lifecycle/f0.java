package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.g2m0;
import defpackage.ny61;
import defpackage.pey;
import defpackage.v1m0;

/* loaded from: classes10.dex */
public final class f0 implements q, AutoCloseable {
    public final String a;
    public final v1m0 b;
    public boolean c;

    public f0(String str, v1m0 v1m0Var) {
        this.a = str;
        this.b = v1m0Var;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.c = false;
            peyVar.getLifecycle().d(this);
        }
    }

    public final void a(g2m0 g2m0Var, Lifecycle lifecycle) {
        if (this.c) {
            ny61.r("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        lifecycle.a(this);
        g2m0Var.c(this.a, this.b.b.e);
    }

    public final v1m0 c() {
        return this.b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
