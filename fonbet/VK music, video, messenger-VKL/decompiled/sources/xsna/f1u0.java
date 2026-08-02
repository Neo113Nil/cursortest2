package xsna;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* compiled from: ViewSurfaceHolder.kt */
/* loaded from: classes8.dex */
public final class f1u0 implements TextureView.SurfaceTextureListener {
    public Surface b;
    public final /* synthetic */ h1u0 c;

    public f1u0(h1u0 h1u0Var) {
        this.c = h1u0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        this.b = surface;
        h1u0.b(this.c, surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
        }
        h1u0.b(this.c, null);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        h1u0.b(this.c, this.b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
