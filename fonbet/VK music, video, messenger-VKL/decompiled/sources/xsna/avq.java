package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: FeatureSearchTabFragmentAdapterLifecycleOwner.kt */
/* loaded from: classes5.dex */
public final class avq implements f5z {
    public final androidx.lifecycle.m b;
    public final androidx.lifecycle.m c;

    public avq() {
        androidx.lifecycle.m mVar = new androidx.lifecycle.m(this, true);
        this.b = mVar;
        this.c = mVar;
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.c;
    }
}
