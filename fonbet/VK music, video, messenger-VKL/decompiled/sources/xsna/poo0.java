package xsna;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.annotation.NonNull;
import java.util.Objects;
import xsna.ub9;
import xsna.zjn0;

/* compiled from: TextureViewImplementation.java */
/* loaded from: classes11.dex */
public final class poo0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ qoo0 b;

    /* compiled from: TextureViewImplementation.java */
    public class a implements o0t<zjn0.f> {
        public final /* synthetic */ SurfaceTexture b;

        public a(SurfaceTexture surfaceTexture) {
            this.b = surfaceTexture;
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }

        @Override // xsna.o0t
        public final void onSuccess(zjn0.f fVar) {
            obr.f("Unexpected result from SurfaceRequest. Surface was provided twice.", fVar.a() != 3);
            this.b.release();
            qoo0 qoo0Var = poo0.this.b;
            if (qoo0Var.i != null) {
                qoo0Var.i = null;
            }
        }
    }

    public poo0(qoo0 qoo0Var) {
        this.b = qoo0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
        qoo0 qoo0Var = this.b;
        qoo0Var.e = surfaceTexture;
        if (qoo0Var.f == null) {
            qoo0Var.h();
            return;
        }
        qoo0Var.g.getClass();
        Objects.toString(qoo0Var.g);
        qoo0Var.g.h.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
        qoo0 qoo0Var = this.b;
        qoo0Var.e = null;
        ub9.d dVar = qoo0Var.f;
        if (dVar == null) {
            return true;
        }
        r0t.a(dVar, new a(surfaceTexture), qoo0Var.d.getContext().getMainExecutor());
        qoo0Var.i = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        ub9.a<Void> andSet = this.b.j.getAndSet(null);
        if (andSet != null) {
            andSet.b(null);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
