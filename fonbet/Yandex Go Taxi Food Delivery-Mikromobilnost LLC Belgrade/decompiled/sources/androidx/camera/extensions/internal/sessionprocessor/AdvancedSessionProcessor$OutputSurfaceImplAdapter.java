package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import defpackage.sy80;

/* loaded from: classes10.dex */
class AdvancedSessionProcessor$OutputSurfaceImplAdapter implements OutputSurfaceImpl {
    private final sy80 mOutputSurface;

    public AdvancedSessionProcessor$OutputSurfaceImplAdapter(sy80 sy80Var) {
        this.mOutputSurface = sy80Var;
    }

    public int getImageFormat() {
        return this.mOutputSurface.a();
    }

    public Size getSize() {
        return this.mOutputSurface.b();
    }

    public Surface getSurface() {
        return this.mOutputSurface.c();
    }
}
