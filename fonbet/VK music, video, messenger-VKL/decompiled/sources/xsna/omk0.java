package xsna;

import com.vk.dto.ads.PixelStats;

/* compiled from: AdvertBannerState.kt */
/* loaded from: classes2.dex */
public final class omk0 {
    public final PixelStats a;
    public final PixelStats b;

    public omk0(PixelStats pixelStats, PixelStats pixelStats2) {
        this.a = pixelStats;
        this.b = pixelStats2;
    }

    public final PixelStats a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omk0)) {
            return false;
        }
        omk0 omk0Var = (omk0) obj;
        return epx.f(this.a, omk0Var.a) && epx.f(this.b, omk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportPixels(clickPixel=" + this.a + ", showPixel=" + this.b + ')';
    }
}
