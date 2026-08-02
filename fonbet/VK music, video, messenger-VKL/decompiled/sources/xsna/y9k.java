package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ReviewTextInputFieldModel.kt */
/* loaded from: classes18.dex */
public final class y9k {
    public final float a;
    public final String b;
    public final boolean c;
    public final float d;

    public y9k() {
        this(false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9k)) {
            return false;
        }
        y9k y9kVar = (y9k) obj;
        return Float.compare(this.a, y9kVar.a) == 0 && epx.f(this.b, y9kVar.b) && this.c == y9kVar.c && Float.compare(this.d, y9kVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + qoy.b(urd0.a(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateReviewInputFieldProgressHintModel(progressValue=");
        sb.append(this.a);
        sb.append(", progressHintText=");
        sb.append(this.b);
        sb.append(", isVisible=");
        sb.append(this.c);
        sb.append(", alfa=");
        return xq.c(')', this.d, sb);
    }

    public y9k(float f, String str, boolean z, float f2) {
        this.a = f;
        this.b = str;
        this.c = z;
        this.d = f2;
    }

    public /* synthetic */ y9k(boolean z, int i) {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "", (i & 4) != 0 ? false : z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
