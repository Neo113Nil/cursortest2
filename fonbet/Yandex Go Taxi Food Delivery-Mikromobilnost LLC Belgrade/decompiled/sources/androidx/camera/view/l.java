package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.euy;
import defpackage.eye0;
import defpackage.gl7;
import defpackage.hek0;
import defpackage.hsj0;
import defpackage.jx81;
import defpackage.r3k0;
import defpackage.x4e;
import defpackage.y7x0;
import defpackage.znw0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class l extends eye0 {
    public TextureView e;
    public SurfaceTexture f;
    public gl7 g;
    public znw0 h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public e l;
    public Executor m;

    @Override // defpackage.eye0
    public final View a() {
        return this.e;
    }

    @Override // defpackage.eye0
    public final Bitmap b() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // defpackage.eye0
    public final void c() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // defpackage.eye0
    public final void d() {
        this.i = true;
    }

    @Override // defpackage.eye0
    public final void e(znw0 znw0Var, e eVar) {
        e eVar2;
        Size size = znw0Var.b;
        this.a = size;
        size.getClass();
        FrameLayout frameLayout = this.b;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.e.setSurfaceTextureListener(new TextureViewImplementation$1(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        znw0 znw0Var2 = this.h;
        if (znw0Var2 != null && znw0Var2.d() && (eVar2 = this.l) != null) {
            eVar2.a();
            this.l = null;
        }
        this.h = znw0Var;
        this.l = eVar;
        znw0Var.l.a(new y7x0(21, this, znw0Var), this.e.getContext().getMainExecutor());
        i();
    }

    @Override // defpackage.eye0
    public final void g(Executor executor) {
        this.m = executor;
    }

    @Override // defpackage.eye0
    public final euy h() {
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.k.set(bVar);
            bVar.a = "textureViewImpl_waitForNextFrame";
            return gl7Var;
        } catch (Exception e) {
            gl7Var.a(e);
            return gl7Var;
        }
    }

    public final void i() {
        SurfaceTexture surfaceTexture;
        Size size = this.a;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.a.getHeight());
        Surface surface = new Surface(this.f);
        znw0 znw0Var = this.h;
        gl7 r = jx81.r(new r3k0(20, this, surface));
        this.g = r;
        r.b.c(new hek0(this, surface, r, znw0Var, 5), this.e.getContext().getMainExecutor());
        this.d = true;
        f();
    }
}
