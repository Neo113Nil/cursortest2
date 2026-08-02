package xsna;

import android.graphics.Bitmap;

/* compiled from: VKImageLoader.java */
/* loaded from: classes2.dex */
public final class pcr0 extends ic6 {
    public final /* synthetic */ io.reactivex.rxjava3.core.y a;

    public pcr0(io.reactivex.rxjava3.core.y yVar) {
        this.a = yVar;
    }

    @Override // xsna.ic6, xsna.vvk
    public final void b(zuk<uvf<svf>> zukVar) {
        zukVar.getProgress();
    }

    @Override // xsna.ic6
    public final void e(zuk<uvf<svf>> zukVar) {
        Throwable b = zukVar.b();
        if (b != null) {
            io.reactivex.rxjava3.core.y yVar = this.a;
            if (yVar.h()) {
                return;
            }
            yVar.onError(b);
        }
    }

    @Override // xsna.ic6
    public final void f(zuk zukVar) {
        if (zukVar.c()) {
            uvf uvfVar = (uvf) zukVar.getResult();
            uvf<Bitmap> R = (uvfVar == null || !(uvfVar.r() instanceof xvf)) ? null : ((xvf) uvfVar.r()).R();
            try {
                io.reactivex.rxjava3.core.y yVar = this.a;
                if (R != null) {
                    try {
                        if (!yVar.h()) {
                            yVar.onSuccess(R.n());
                        }
                    } catch (Throwable th) {
                        if (!yVar.h()) {
                            yVar.onError(th);
                        }
                    }
                } else if (!yVar.h()) {
                    yVar.onError(new NullPointerException("result reference is null"));
                }
            } finally {
                uvf.q(R);
                uvf.q(uvfVar);
            }
        }
    }
}
