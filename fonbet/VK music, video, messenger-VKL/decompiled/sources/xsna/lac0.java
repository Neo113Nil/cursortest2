package xsna;

import android.graphics.Bitmap;

/* compiled from: PosterParallaxImageLayer.kt */
/* loaded from: classes4.dex */
public final class lac0<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ pac0 b;

    public lac0(pac0 pac0Var) {
        this.b = pac0Var;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            pac0 pac0Var = this.b;
            pac0Var.i = bitmap;
            pac0Var.b();
            pac0Var.a.invalidate();
        }
    }
}
