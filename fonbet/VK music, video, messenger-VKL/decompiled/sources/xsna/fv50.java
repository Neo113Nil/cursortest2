package xsna;

import com.vk.ads.analytics.NativeAdType;

/* compiled from: NativeAdAnalyticsData.kt */
/* loaded from: classes14.dex */
public final class fv50 {
    public final NativeAdType a;
    public final int b;
    public final String c;
    public final int d;

    public fv50(NativeAdType nativeAdType, int i, String str, int i2) {
        this.a = nativeAdType;
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv50)) {
            return false;
        }
        fv50 fv50Var = (fv50) obj;
        return this.a == fv50Var.a && this.b == fv50Var.b && epx.f(this.c, fv50Var.c) && this.d == fv50Var.d;
    }

    public final int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Integer.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeAdFeedItemAnalyticsData(adType=");
        sb.append(this.a);
        sb.append(", adRequestId=");
        sb.append(this.b);
        sb.append(", trackCode=");
        sb.append(this.c);
        sb.append(", position=");
        return vu5.b(sb, this.d, ')');
    }
}
