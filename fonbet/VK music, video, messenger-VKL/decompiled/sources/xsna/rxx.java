package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: JavaFloatBitsFromCharSequence.java */
/* loaded from: classes12.dex */
public final class rxx extends ze {
    @Override // xsna.ze
    public final long c() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // xsna.ze
    public final long d() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // xsna.ze
    public final long f() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // xsna.ze
    public final long h(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3) {
        float a;
        if (j == 0) {
            a = z ? -0.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (z2) {
            if (-45 <= i3 && i3 <= 38) {
                float a2 = xkq.a(i3, j, z);
                float a3 = xkq.a(i3, j + 1, z);
                if (!Float.isNaN(a2) && a3 == a2) {
                    a = a2;
                }
            }
            a = Float.NaN;
        } else {
            if (-45 <= i2 && i2 <= 38) {
                a = xkq.a(i2, j, z);
            }
            a = Float.NaN;
        }
        if (Float.isNaN(a)) {
            a = Float.parseFloat(charSequence.subSequence(0, i).toString());
        }
        return Float.floatToRawIntBits(a);
    }

    @Override // xsna.ze
    public final long i(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3) {
        float f;
        if (z2) {
            i2 = i3;
        }
        if (-126 > i2 || i2 > 127) {
            f = Float.NaN;
        } else {
            f = Math.scalb(1.0f, i2) * Math.abs(j);
            if (z) {
                f = -f;
            }
        }
        if (Float.isNaN(f)) {
            f = Float.parseFloat(charSequence.subSequence(0, i).toString());
        }
        return Float.floatToRawIntBits(f);
    }
}
