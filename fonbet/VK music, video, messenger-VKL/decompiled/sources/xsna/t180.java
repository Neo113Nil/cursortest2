package xsna;

import com.vk.catalog2.common.dto.api.banner.Banner;

/* compiled from: CatalogAnalyticsEvent.kt */
/* loaded from: classes16.dex */
public final class t180 implements u0a {
    public final Banner a;

    public t180(Banner banner) {
        this.a = banner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t180) && epx.f(this.a, ((t180) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnBannerClickedEvent(banner=" + this.a + ')';
    }
}
