package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: LifecycleRegistryOwner.kt */
/* loaded from: classes3.dex */
public final class h5z implements f5z {
    public final androidx.lifecycle.m b;

    public h5z() {
        androidx.lifecycle.m mVar = new androidx.lifecycle.m(this, true);
        this.b = mVar;
        mVar.c(Lifecycle.Event.ON_CREATE);
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.b;
    }
}
