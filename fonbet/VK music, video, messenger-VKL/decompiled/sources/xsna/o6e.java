package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: ClipsFeedEngineLifeCycleOwner.kt */
/* loaded from: classes17.dex */
public final class o6e implements f5z {
    public final yxc b;
    public final androidx.lifecycle.m c;

    public o6e(f5z f5zVar, yxc yxcVar) {
        this.b = yxcVar;
        androidx.lifecycle.m mVar = new androidx.lifecycle.m(this, true);
        this.c = mVar;
        mVar.e(f5zVar.getLifecycle().getCurrentState());
        f5zVar.getLifecycle().addObserver(new n6e(this));
    }

    public final void a() {
        c(Lifecycle.Event.ON_PAUSE, Lifecycle.State.STARTED);
    }

    public final void b() {
        c(Lifecycle.Event.ON_RESUME, Lifecycle.State.RESUMED);
    }

    public final void c(Lifecycle.Event event, Lifecycle.State state) {
        if (event != Lifecycle.Event.ON_RESUME || ((Boolean) this.b.invoke()).booleanValue()) {
            this.c.e(state);
        }
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.c;
    }
}
