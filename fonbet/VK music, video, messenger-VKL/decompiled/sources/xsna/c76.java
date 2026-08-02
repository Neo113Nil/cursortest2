package xsna;

import android.graphics.Bitmap;

/* compiled from: BaseBitmapDataSubscriber.java */
/* loaded from: classes12.dex */
public abstract class c76 extends ic6<uvf<svf>> {
    @Override // xsna.ic6
    public final void f(zuk<uvf<svf>> zukVar) {
        if (zukVar.c()) {
            uvf<svf> result = zukVar.getResult();
            try {
                g((result == null || !(result.r() instanceof qvf)) ? null : ((qvf) result.r()).W3());
            } finally {
                uvf.q(result);
            }
        }
    }

    public abstract void g(Bitmap bitmap);
}
