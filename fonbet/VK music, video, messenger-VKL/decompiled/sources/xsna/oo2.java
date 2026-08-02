package xsna;

import android.graphics.Rect;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: AnimationDialogCallbackProxy.kt */
/* loaded from: classes17.dex */
public final class oo2 implements io2 {
    public final io2 b;
    public final r490 c;

    public oo2(io2 io2Var, r490 r490Var) {
        this.b = io2Var;
        this.c = r490Var;
    }

    @Override // xsna.io2
    public final void C() {
        this.b.C();
    }

    @Override // xsna.io2
    public final void D0() {
        this.b.D0();
        r490 r490Var = this.c;
        if (r490Var != null) {
            r490Var.getClass();
        }
    }

    @Override // xsna.io2
    public final boolean G() {
        return this.b.G();
    }

    @Override // xsna.io2
    public final void J() {
        this.b.J();
    }

    @Override // xsna.io2
    public final boolean M() {
        return this.b.M();
    }

    @Override // xsna.io2
    public final void e0() {
        this.b.e0();
    }

    @Override // xsna.io2
    public final boolean f0() {
        return this.b.f0();
    }

    @Override // xsna.io2
    public final Rect g0() {
        return this.b.g0();
    }

    @Override // xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        return this.b.getContentScaleType();
    }

    @Override // xsna.io2
    public final float i0() {
        return this.b.i0();
    }

    @Override // xsna.io2
    public final Rect t0() {
        return this.b.t0();
    }
}
