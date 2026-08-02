package xsna;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;

/* compiled from: ImmediateSurface.java */
/* loaded from: classes11.dex */
public final class unw extends DeferrableSurface {
    public final Surface h;

    public unw(@NonNull Surface surface) {
        this.h = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public final ugz<Surface> e() {
        return r0t.d(this.h);
    }
}
