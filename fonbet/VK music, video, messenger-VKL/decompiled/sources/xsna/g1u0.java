package xsna;

import android.view.SurfaceHolder;

/* compiled from: ViewSurfaceHolder.kt */
/* loaded from: classes8.dex */
public final class g1u0 implements SurfaceHolder.Callback {
    public final /* synthetic */ h1u0 b;

    public g1u0(h1u0 h1u0Var) {
        this.b = h1u0Var;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        h1u0.b(this.b, surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        h1u0.b(this.b, surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        h1u0.b(this.b, null);
    }
}
