package xsna;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import xsna.ym2;

/* compiled from: AnimationBackendDelegateWithInactivityCheck.java */
/* loaded from: classes12.dex */
public final class an2<T extends ym2> extends zm2<T> {
    public final e830 c;
    public final ScheduledExecutorService d;
    public boolean e;
    public long f;
    public final BitmapAnimationBackend g;
    public final a h;

    /* compiled from: AnimationBackendDelegateWithInactivityCheck.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (an2.this) {
                try {
                    an2 an2Var = an2.this;
                    an2Var.e = false;
                    if (an2Var.c.now() - an2Var.f > 2000) {
                        an2.this.g.onInactive();
                    } else {
                        an2.this.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: AnimationBackendDelegateWithInactivityCheck.java */
    public interface b {
        void onInactive();
    }

    public an2(BitmapAnimationBackend bitmapAnimationBackend, BitmapAnimationBackend bitmapAnimationBackend2, e830 e830Var, ScheduledExecutorService scheduledExecutorService) {
        this.b = bitmapAnimationBackend;
        this.e = false;
        this.h = new a();
        this.g = bitmapAnimationBackend2;
        this.c = e830Var;
        this.d = scheduledExecutorService;
    }

    public static an2 a(BitmapAnimationBackend bitmapAnimationBackend, e830 e830Var, ScheduledExecutorService scheduledExecutorService) {
        return new an2(bitmapAnimationBackend, bitmapAnimationBackend, e830Var, scheduledExecutorService);
    }

    public final synchronized void b() {
        if (!this.e) {
            this.e = true;
            this.d.schedule(this.h, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // xsna.ym2
    public final boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        this.f = this.c.now();
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        boolean z = false;
        if (bitmapAnimationBackend != null && bitmapAnimationBackend.drawFrame(drawable, canvas, i)) {
            z = true;
        }
        b();
        return z;
    }
}
