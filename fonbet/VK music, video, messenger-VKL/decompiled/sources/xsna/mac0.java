package xsna;

import android.graphics.Bitmap;

/* compiled from: PosterParallaxImageLayer.kt */
/* loaded from: classes15.dex */
public final class mac0 implements izs<Bitmap, s3q0> {
    public final /* synthetic */ kac0 b;

    public mac0(kac0 kac0Var) {
        this.b = kac0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            kac0 kac0Var = this.b;
            io.reactivex.rxjava3.disposables.c cVar = kac0Var.i;
            if (cVar != null) {
                cVar.dispose();
            }
            kac0Var.f = bitmap2;
            kac0Var.b();
            kac0Var.a.invalidate();
        }
        return s3q0.a;
    }
}
