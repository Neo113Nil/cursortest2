package xsna;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: AndroidExternalSurface.android.kt */
/* loaded from: classes11.dex */
public final class f82 extends y46 implements TextureView.SurfaceTextureListener {
    public Surface g;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!q9x.b(0L, 0L)) {
            i = (int) 0;
            i2 = (int) 0;
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        int i3 = i;
        int i4 = i2;
        Surface surface = new Surface(surfaceTexture);
        this.g = surface;
        if (this.c != null) {
            this.f = myc0.h(this.b, null, CoroutineStart.UNDISPATCHED, new x46(this, surface, i3, i4, null), 1);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.g;
        je2 je2Var = this.e;
        if (je2Var != null) {
            je2Var.invoke(surface);
        }
        yok0 yok0Var = this.f;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.g = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!q9x.b(0L, 0L)) {
            i = (int) 0;
            i2 = (int) 0;
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        Surface surface = this.g;
        zco zcoVar = this.d;
        if (zcoVar != null) {
            zcoVar.invoke(surface, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
