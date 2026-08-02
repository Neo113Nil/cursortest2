package xsna;

import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.external.miniapp.net.ad.AdvertisementType;

/* compiled from: AdSlotSkipInfo.kt */
/* loaded from: classes18.dex */
public final class hi0 {
    public final AdvertisementType a;
    public final AdSlotSkipReason b;

    public hi0(AdvertisementType advertisementType, AdSlotSkipReason adSlotSkipReason) {
        this.a = advertisementType;
        this.b = adSlotSkipReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return this.a == hi0Var.a && this.b == hi0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdSlotSkipInfo(adType=" + this.a + ", reason=" + this.b + ')';
    }
}
