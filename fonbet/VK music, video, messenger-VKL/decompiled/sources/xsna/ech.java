package xsna;

import com.vk.dto.profile.CatchUpBanner;

/* compiled from: CommunityPartnerBannerItemModel.kt */
/* loaded from: classes5.dex */
public final class ech extends s4h {
    public final CatchUpBanner b;

    public ech(CatchUpBanner catchUpBanner) {
        this.b = catchUpBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ech) && epx.f(this.b, ((ech) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CommunityPartnerBannerItemModel(bannerData=" + this.b + ')';
    }
}
