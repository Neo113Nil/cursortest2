package xsna;

import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ZoomStateImpl.java */
/* loaded from: classes11.dex */
public final class f7y0 implements e7y0 {
    public float a;
    public final float b;
    public final float c;
    public float d;

    public f7y0(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // xsna.e7y0
    public final float a() {
        return this.d;
    }

    @Override // xsna.e7y0
    public final float b() {
        return this.a;
    }

    @Override // xsna.e7y0
    public final float c() {
        return this.b;
    }

    @Override // xsna.e7y0
    public final float d() {
        return this.c;
    }

    public final void e(float f) throws IllegalArgumentException {
        float f2 = this.b;
        float f3 = this.c;
        if (f > f2 || f < f3) {
            throw new IllegalArgumentException(shy.c(f2, X3.j.e, bxj0.a("Requested zoomRatio ", f, " is not within valid range [", f3, " , ")));
        }
        this.a = f;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f2 != f3) {
            if (f == f2) {
                f4 = 1.0f;
            } else if (f != f3) {
                float f5 = 1.0f / f3;
                f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
            }
        }
        this.d = f4;
    }
}
