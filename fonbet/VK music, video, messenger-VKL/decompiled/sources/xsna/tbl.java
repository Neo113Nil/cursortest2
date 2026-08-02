package xsna;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import java.util.concurrent.ExecutorService;

/* compiled from: DefaultBitmapFramePreparer.kt */
/* loaded from: classes12.dex */
public final class tbl implements fc7 {
    public final hta0 a;
    public final cj2 b;
    public final Bitmap.Config c;
    public final ExecutorService d;
    public final SparseArray<Runnable> e = new SparseArray<>();

    /* compiled from: DefaultBitmapFramePreparer.kt */
    public final class a implements Runnable {
        public final BitmapAnimationBackend b;
        public final dc7 c;
        public final int d;
        public final int e;

        public a(BitmapAnimationBackend bitmapAnimationBackend, dc7 dc7Var, int i, int i2) {
            this.b = bitmapAnimationBackend;
            this.c = dc7Var;
            this.d = i;
            this.e = i2;
        }

        public final boolean a(int i, int i2) {
            uvf d;
            tbl tblVar = tbl.this;
            int i3 = 2;
            BitmapAnimationBackend bitmapAnimationBackend = this.b;
            try {
                if (i2 == 1) {
                    dc7 dc7Var = this.c;
                    bitmapAnimationBackend.getIntrinsicWidth();
                    bitmapAnimationBackend.getIntrinsicHeight();
                    d = dc7Var.d();
                } else {
                    if (i2 != 2) {
                        return false;
                    }
                    try {
                        d = tblVar.a.c(bitmapAnimationBackend.getIntrinsicWidth(), bitmapAnimationBackend.getIntrinsicHeight(), tblVar.c);
                        i3 = -1;
                    } catch (RuntimeException e) {
                        tblVar.getClass();
                        ahq.i(tbl.class, "Failed to create frame bitmap", e);
                        return false;
                    }
                }
                uvf uvfVar = d;
                boolean b = b(i, uvfVar, i2);
                uvf.q(uvfVar);
                return (b || i3 == -1) ? b : a(i, i3);
            } catch (Throwable th) {
                uvf.q(null);
                throw th;
            }
        }

        public final boolean b(int i, uvf<Bitmap> uvfVar, int i2) {
            if (!uvf.t(uvfVar) || uvfVar == null || !tbl.this.b.a(i, uvfVar.r())) {
                return false;
            }
            tbl.this.getClass();
            ahq.f(tbl.class, Integer.valueOf(i), "Frame %d ready.");
            synchronized (tbl.this.e) {
                this.c.a(i, uvfVar);
                s3q0 s3q0Var = s3q0.a;
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (this.c.e(this.d)) {
                    tbl.this.getClass();
                    ahq.f(tbl.class, Integer.valueOf(this.d), "Frame %d is cached already.");
                    tbl tblVar = tbl.this;
                    synchronized (tblVar.e) {
                        tblVar.e.remove(this.e);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    return;
                }
                if (a(this.d, 1)) {
                    tbl.this.getClass();
                    ahq.f(tbl.class, Integer.valueOf(this.d), "Prepared frame %d.");
                } else {
                    tbl.this.getClass();
                    ahq.c(tbl.class, "Could not prepare frame %d.", Integer.valueOf(this.d));
                }
                tbl tblVar2 = tbl.this;
                synchronized (tblVar2.e) {
                    tblVar2.e.remove(this.e);
                    s3q0 s3q0Var2 = s3q0.a;
                }
            } catch (Throwable th) {
                tbl tblVar3 = tbl.this;
                synchronized (tblVar3.e) {
                    tblVar3.e.remove(this.e);
                    s3q0 s3q0Var3 = s3q0.a;
                    throw th;
                }
            }
        }
    }

    public tbl(hta0 hta0Var, cj2 cj2Var, Bitmap.Config config, ExecutorService executorService) {
        this.a = hta0Var;
        this.b = cj2Var;
        this.c = config;
        this.d = executorService;
    }
}
