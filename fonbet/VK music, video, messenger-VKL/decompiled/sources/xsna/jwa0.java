package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* compiled from: PlaybackParameters.java */
/* loaded from: classes12.dex */
public final class jwa0 {
    public static final jwa0 d = new jwa0(1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        y2r0.L(0);
        y2r0.L(1);
    }

    public jwa0(float f) {
        this(f, 1.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jwa0.class == obj.getClass()) {
            jwa0 jwa0Var = (jwa0) obj;
            if (this.a == jwa0Var.a && this.b == jwa0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = y2r0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public jwa0(float f, float f2) {
        fxc0.p(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fxc0.p(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }
}
