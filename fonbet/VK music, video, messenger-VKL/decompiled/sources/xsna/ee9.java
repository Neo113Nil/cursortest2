package xsna;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.concurrent.Callable;

/* compiled from: Camera1View.java */
/* loaded from: classes13.dex */
public final class ee9 implements Runnable {
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ xn9 d;

    public ee9(xn9 xn9Var, Bitmap bitmap, byte[] bArr) {
        this.d = xn9Var;
        this.b = bitmap;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xn9 xn9Var = this.d;
        jhu0 jhu0Var = xn9Var.m;
        if (jhu0Var == null || xn9Var.T == null) {
            return;
        }
        final boolean d = jhu0Var.d();
        final Bitmap bitmap = this.b;
        final byte[] bArr = this.c;
        new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.be9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    String str = kd7.a;
                    try {
                        Matrix matrix = new Matrix();
                        matrix.preScale(d ? -1.0f : 1.0f, 1.0f);
                        return Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, false);
                    } catch (Throwable unused) {
                        return bitmap2;
                    }
                }
                byte[] bArr2 = bArr;
                if (bArr2 == null) {
                    return null;
                }
                try {
                    return ho9.f(bArr2);
                } catch (Throwable unused2) {
                    lht.a.a();
                    return ho9.f(bArr2);
                }
            }
        }).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ce9(0, this, bArr), new de9(0));
    }
}
