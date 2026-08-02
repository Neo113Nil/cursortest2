package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: MutableRect.kt */
/* loaded from: classes11.dex */
public final class oh50 {
    public float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final boolean b() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final void c(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.a += intBitsToFloat;
        this.b += intBitsToFloat2;
        this.c += intBitsToFloat;
        this.d += intBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + bu00.u(this.a) + ", " + bu00.u(this.b) + ", " + bu00.u(this.c) + ", " + bu00.u(this.d) + ')';
    }
}
