package xsna;

import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: AngledLinearGradient.kt */
/* loaded from: classes17.dex */
public final class ue2 extends n4j0 {
    public final float d;
    public final List<l5g> e;
    public final List<Float> f;

    /* compiled from: AngledLinearGradient.kt */
    public static final class a {
        public static final long a(float f, long j) {
            float f2 = (f - 45.0f) % 360.0f;
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.signum(f2) != Math.signum(360.0f)) {
                f2 += 360.0f;
            }
            float f3 = (f2 + 360.0f) % 360.0f;
            if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.signum(f3) != Math.signum(360.0f)) {
                f3 += 360.0f;
            }
            float f4 = f3 + 45.0f;
            if (f4 >= 45.0f && f4 <= 135.0f) {
                return (Float.floatToRawIntBits(((135.0f - f4) * Float.intBitsToFloat((int) (j >> 32))) / 90.0f) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L);
            }
            if (f4 >= 135.0f && f4 <= 225.0f) {
                float intBitsToFloat = ((f4 - 135.0f) * Float.intBitsToFloat((int) (j & 4294967295L))) / 90.0f;
                return (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
            }
            if (f4 < 225.0f || f4 > 315.0f) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat3 = ((405.0f - f4) * Float.intBitsToFloat((int) (j & 4294967295L))) / 90.0f;
                return (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
            }
            float intBitsToFloat4 = ((f4 - 225.0f) * Float.intBitsToFloat((int) (j >> 32))) / 90.0f;
            float intBitsToFloat5 = Float.intBitsToFloat((int) (j & 4294967295L));
            return (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32);
        }
    }

    static {
        new awf(45.0f, 135.0f);
        new awf(135.0f, 225.0f);
        new awf(225.0f, 315.0f);
        new awf(315.0f, 405.0f);
    }

    public ue2(List list, List list2, float f) {
        this.d = f;
        this.e = list;
        this.f = list2;
    }

    @Override // xsna.n4j0
    public final Shader c(long j) {
        float f = this.d;
        long a2 = a.a(f, j);
        return jcr.a(a.a(f + 180.0f, j), a2, this.e, this.f, 0);
    }
}
