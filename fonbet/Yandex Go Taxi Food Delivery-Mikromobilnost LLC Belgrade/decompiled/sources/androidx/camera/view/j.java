package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.e3c0;
import defpackage.euy;
import defpackage.eye0;
import defpackage.hiv;
import defpackage.lnv0;
import defpackage.sgb1;
import defpackage.znw0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class j extends eye0 {
    public SurfaceView e;
    public final SurfaceViewImplementation$SurfaceRequestCallback f;

    public j(FrameLayout frameLayout, c cVar) {
        super(frameLayout, cVar);
        this.f = new SurfaceViewImplementation$SurfaceRequestCallback(this);
    }

    @Override // defpackage.eye0
    public final View a() {
        return this.e;
    }

    @Override // defpackage.eye0
    public final Bitmap b() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        Semaphore semaphore = new Semaphore(0);
        Bitmap createBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, createBitmap, new e3c0(1, semaphore), new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                sgb1.d("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return createBitmap;
        } catch (InterruptedException e) {
            sgb1.e("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return createBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // defpackage.eye0
    public final void c() {
    }

    @Override // defpackage.eye0
    public final void d() {
    }

    @Override // defpackage.eye0
    public final void e(final znw0 znw0Var, final e eVar) {
        SurfaceView surfaceView = this.e;
        boolean equals = Objects.equals(this.a, znw0Var.b);
        if (surfaceView == null || !equals) {
            Size size = znw0Var.b;
            this.a = size;
            size.getClass();
            FrameLayout frameLayout = this.b;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor mainExecutor = this.e.getContext().getMainExecutor();
        znw0Var.l.a(new lnv0(16, eVar), mainExecutor);
        this.e.post(new Runnable() { // from class: androidx.camera.view.h
            @Override // java.lang.Runnable
            public final void run() {
                j.this.f.setSurfaceRequest(znw0Var, eVar);
            }
        });
    }

    @Override // defpackage.eye0
    public final void g(Executor executor) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    @Override // defpackage.eye0
    public final euy h() {
        return hiv.c;
    }
}
