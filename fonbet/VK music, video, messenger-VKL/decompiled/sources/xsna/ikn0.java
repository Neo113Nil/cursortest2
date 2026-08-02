package xsna;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Objects;
import java.util.concurrent.Executor;
import xsna.snw;

/* compiled from: SurfaceViewImplementation.java */
/* loaded from: classes11.dex */
public final class ikn0 extends z5d0 {
    public SurfaceView d;
    public final a e;

    @Nullable
    public w5d0 f;

    public ikn0(@NonNull FrameLayout frameLayout, @NonNull androidx.camera.view.c cVar) {
        super(frameLayout, cVar);
        this.e = new a();
    }

    @Override // xsna.z5d0
    @Nullable
    public final View a() {
        return this.d;
    }

    @Override // xsna.z5d0
    @Nullable
    @TargetApi(24)
    public final Bitmap b() {
        SurfaceView surfaceView = this.d;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.d.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.d.getWidth(), this.d.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.d;
        PixelCopy.request(surfaceView2, createBitmap, new gkn0(), surfaceView2.getHandler());
        return createBitmap;
    }

    @Override // xsna.z5d0
    public final void e(@NonNull zjn0 zjn0Var, @Nullable w5d0 w5d0Var) {
        Size size = zjn0Var.a;
        this.a = size;
        this.f = w5d0Var;
        size.getClass();
        FrameLayout frameLayout = this.b;
        SurfaceView surfaceView = new SurfaceView(frameLayout.getContext());
        this.d = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        frameLayout.removeAllViews();
        frameLayout.addView(this.d);
        this.d.getHolder().addCallback(this.e);
        Executor mainExecutor = this.d.getContext().getMainExecutor();
        zjn0Var.g.a(new iv1(this, 12), mainExecutor);
        this.d.post(new od6(5, this, zjn0Var));
    }

    @Override // xsna.z5d0
    @NonNull
    public final ugz<Void> g() {
        return snw.c.c;
    }

    @Override // xsna.z5d0
    public final void c() {
    }

    @Override // xsna.z5d0
    public final void d() {
    }

    /* compiled from: SurfaceViewImplementation.java */
    public class a implements SurfaceHolder.Callback {

        @Nullable
        public Size b;

        @Nullable
        public zjn0 c;

        @Nullable
        public Size d;
        public boolean e = false;

        public a() {
        }

        public final void a() {
            zjn0 zjn0Var = this.c;
            if (zjn0Var != null) {
                Objects.toString(zjn0Var);
                this.c.e.d(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
            }
        }

        public final boolean b() {
            Size size;
            ikn0 ikn0Var = ikn0.this;
            Surface surface = ikn0Var.d.getHolder().getSurface();
            if (this.e || this.c == null || (size = this.b) == null || !size.equals(this.d)) {
                return false;
            }
            this.c.a(surface, ikn0Var.d.getContext().getMainExecutor(), new o7j() { // from class: xsna.hkn0
                @Override // xsna.o7j
                public final void accept(Object obj) {
                    ikn0 ikn0Var2 = ikn0.this;
                    w5d0 w5d0Var = ikn0Var2.f;
                    if (w5d0Var != null) {
                        w5d0Var.a();
                        ikn0Var2.f = null;
                    }
                }
            });
            this.e = true;
            ikn0Var.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.d = new Size(i2, i3);
            b();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            if (this.e) {
                zjn0 zjn0Var = this.c;
                if (zjn0Var != null) {
                    Objects.toString(zjn0Var);
                    this.c.h.a();
                }
            } else {
                a();
            }
            this.e = false;
            this.c = null;
            this.d = null;
            this.b = null;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        }
    }
}
