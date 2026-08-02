package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.math.BigDecimal;

/* compiled from: ScreenConfig.kt */
/* loaded from: classes5.dex */
public final class wah0 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;

    public wah0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wah0)) {
            return false;
        }
        wah0 wah0Var = (wah0) obj;
        return this.a == wah0Var.a && this.b == wah0Var.b && Float.compare(this.c, wah0Var.c) == 0 && Float.compare(this.d, wah0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ScreenConfig(width=" + this.a + ", height=" + this.b + ", xCenter=" + new BigDecimal(String.valueOf(this.c)).toPlainString() + ", yCenter=" + new BigDecimal(String.valueOf(this.d)).toPlainString() + ')';
    }

    public wah0(float f, float f2, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
    }

    public /* synthetic */ wah0(int i) {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
    }
}
