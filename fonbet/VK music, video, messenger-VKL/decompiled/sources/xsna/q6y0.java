package xsna;

import android.graphics.RectF;

/* compiled from: ZoomImageAttacher.kt */
/* loaded from: classes18.dex */
public final class q6y0 extends h64 {
    public gzs<s3q0> v;
    public RectF w;

    @Override // xsna.h64, xsna.bb80
    public final void a(float f, float f2) {
        super.a(f, f2);
        gzs<s3q0> gzsVar = this.v;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.h64
    public final RectF e() {
        RectF e = super.e();
        if (e != null && !e.equals(this.w)) {
            this.w = e;
            gzs<s3q0> gzsVar = this.v;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
        return e;
    }

    @Override // xsna.h64, xsna.bb80
    public final void onScale(float f, float f2, float f3) {
        super.onScale(f, f2, f3);
        gzs<s3q0> gzsVar = this.v;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.h64, xsna.bb80
    public final void onFling(float f, float f2) {
    }
}
