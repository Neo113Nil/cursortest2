package defpackage;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;

/* loaded from: classes10.dex */
public final class q0r0 extends DeferrableSurface {
    public final Surface o;
    public final int p;

    public q0r0(int i, Surface surface) {
        this.o = surface;
        this.p = i;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final euy f() {
        return ni91.f(this.o);
    }
}
