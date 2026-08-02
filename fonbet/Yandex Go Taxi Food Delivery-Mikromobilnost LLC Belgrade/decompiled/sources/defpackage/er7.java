package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;

/* loaded from: classes14.dex */
public final class er7 implements pey {
    public final t a;

    public er7() {
        t tVar = new t(this, true);
        this.a = tVar;
        tVar.i(Lifecycle.State.CREATED);
    }

    public final void a() {
        this.a.i(Lifecycle.State.DESTROYED);
    }

    public final void b() {
        this.a.i(Lifecycle.State.RESUMED);
    }

    public final void c() {
        this.a.i(Lifecycle.State.CREATED);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.a;
    }
}
