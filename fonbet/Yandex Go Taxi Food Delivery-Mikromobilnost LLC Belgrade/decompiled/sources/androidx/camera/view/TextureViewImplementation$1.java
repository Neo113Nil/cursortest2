package androidx.camera.view;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import defpackage.cye0;
import defpackage.gl7;
import defpackage.ni91;
import defpackage.sgb1;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
class TextureViewImplementation$1 implements TextureView.SurfaceTextureListener {
    final /* synthetic */ l this$0;

    public TextureViewImplementation$1(l lVar) {
        this.this$0 = lVar;
    }

    private static /* synthetic */ void lambda$onSurfaceTextureUpdated$0(cye0 cye0Var, SurfaceTexture surfaceTexture) {
        surfaceTexture.getTimestamp();
        cye0Var.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        sgb1.g(3, "TextureViewImpl");
        l lVar = this.this$0;
        lVar.f = surfaceTexture;
        if (lVar.g == null) {
            lVar.i();
            return;
        }
        lVar.h.getClass();
        Objects.toString(this.this$0.h);
        sgb1.g(3, "TextureViewImpl");
        this.this$0.h.m.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l lVar = this.this$0;
        lVar.f = null;
        gl7 gl7Var = lVar.g;
        if (gl7Var == null) {
            sgb1.g(3, "TextureViewImpl");
            return true;
        }
        ni91.a(gl7Var, new k(this, surfaceTexture), lVar.e.getContext().getMainExecutor());
        this.this$0.j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        sgb1.g(3, "TextureViewImpl");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        androidx.concurrent.futures.b bVar = (androidx.concurrent.futures.b) this.this$0.k.getAndSet(null);
        if (bVar != null) {
            bVar.b(null);
        }
        this.this$0.getClass();
        Executor executor = this.this$0.m;
    }
}
