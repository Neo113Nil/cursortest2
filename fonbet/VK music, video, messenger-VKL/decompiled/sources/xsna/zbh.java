package xsna;

import xsna.tlo0;

/* compiled from: CommunityPartnerBannerHeaderItem.kt */
/* loaded from: classes18.dex */
public final class zbh implements hfz {
    public final tlo0.f b;

    public zbh(tlo0.f fVar) {
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbh) && this.b.equals(((zbh) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a);
    }

    public final String toString() {
        return pr.b(new StringBuilder("CommunityPartnerBannerHeaderItem(title="), this.b, ')');
    }
}
