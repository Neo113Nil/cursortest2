package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.vk.rlottie.RLottieDrawable;

/* compiled from: SyncRLottieRenderDelegate.kt */
/* loaded from: classes5.dex */
public final class hon0 extends fyf0 {
    @Override // xsna.fyf0
    public final void a(Canvas canvas, float f, float f2) {
        ez3 ez3Var = this.a;
        ez3Var.e.set((ez3Var.u / ez3Var.B) % (ez3Var.b[1] - 1));
        e();
        b(canvas, this.a.f, f, f2);
        ez3 ez3Var2 = this.a;
        ez3Var2.m = true;
        ez3Var2.l = true;
    }

    @Override // xsna.fyf0
    public final void c() {
        e();
    }

    @Override // xsna.fyf0
    public final void d(int i) {
        e();
    }

    public final void e() {
        RLottieDrawable rLottieDrawable = this.b;
        ez3 ez3Var = this.a;
        if (ez3Var.a == 0 || ez3Var.k.get() || ez3Var.j.get() || !ez3Var.m || ez3Var.h.getAndSet(true)) {
            return;
        }
        Bitmap bitmap = this.a.f;
        if (bitmap == null) {
            try {
                bitmap = this.b.c();
                this.a.f = bitmap;
            } catch (Exception unused) {
                bitmap = null;
            }
        }
        if (bitmap != null) {
            rLottieDrawable.f(ez3Var.e.get(), bitmap);
            ez3Var.m = false;
            if (ez3Var.e.incrementAndGet() >= ez3Var.b[1]) {
                ez3Var.e.set(0);
            }
            ez3Var.h.set(false);
            rLottieDrawable.m();
            if (!ez3Var.p.get() && ez3Var.c) {
                rLottieDrawable.l();
            }
        } else {
            ez3Var.h.set(false);
        }
        rLottieDrawable.h();
    }
}
