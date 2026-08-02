package xsna;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import xsna.ub9;

/* compiled from: TextureViewImplementation.java */
/* loaded from: classes11.dex */
public final class qoo0 extends z5d0 {
    public TextureView d;
    public SurfaceTexture e;
    public ub9.d f;
    public zjn0 g;
    public boolean h;
    public SurfaceTexture i;
    public AtomicReference<ub9.a<Void>> j;

    @Nullable
    public w5d0 k;

    @Override // xsna.z5d0
    @Nullable
    public final View a() {
        return this.d;
    }

    @Override // xsna.z5d0
    @Nullable
    public final Bitmap b() {
        TextureView textureView = this.d;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.d.getBitmap();
    }

    @Override // xsna.z5d0
    public final void c() {
        if (!this.h || this.i == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.d.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.i;
        if (surfaceTexture != surfaceTexture2) {
            this.d.setSurfaceTexture(surfaceTexture2);
            this.i = null;
            this.h = false;
        }
    }

    @Override // xsna.z5d0
    public final void d() {
        this.h = true;
    }

    @Override // xsna.z5d0
    public final void e(@NonNull zjn0 zjn0Var, @Nullable w5d0 w5d0Var) {
        Size size = zjn0Var.a;
        this.a = size;
        this.k = w5d0Var;
        size.getClass();
        FrameLayout frameLayout = this.b;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.d = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.d.setSurfaceTextureListener(new poo0(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.d);
        zjn0 zjn0Var2 = this.g;
        if (zjn0Var2 != null) {
            zjn0Var2.e.d(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
        }
        this.g = zjn0Var;
        Executor mainExecutor = this.d.getContext().getMainExecutor();
        zjn0Var.g.a(new zq5(6, this, zjn0Var), mainExecutor);
        h();
    }

    @Override // xsna.z5d0
    @NonNull
    public final ugz<Void> g() {
        return ub9.a(new sqk0(this, 2));
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.a;
        if (size == null || (surfaceTexture = this.e) == null || this.g == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.a.getHeight());
        final Surface surface = new Surface(this.e);
        final zjn0 zjn0Var = this.g;
        final ub9.d a = ub9.a(new cod0(this, surface));
        this.f = a;
        a.c.addListener(new Runnable() { // from class: xsna.noo0
            @Override // java.lang.Runnable
            public final void run() {
                qoo0 qoo0Var = qoo0.this;
                w5d0 w5d0Var = qoo0Var.k;
                if (w5d0Var != null) {
                    w5d0Var.a();
                    qoo0Var.k = null;
                }
                surface.release();
                if (qoo0Var.f == a) {
                    qoo0Var.f = null;
                }
                if (qoo0Var.g == zjn0Var) {
                    qoo0Var.g = null;
                }
            }
        }, this.d.getContext().getMainExecutor());
        f();
    }
}
