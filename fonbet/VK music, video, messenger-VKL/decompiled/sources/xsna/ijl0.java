package xsna;

import com.vk.stat.scheme.CommonMarketStat$TypeCtaButtonPositionType;
import xsna.hjl0;

/* compiled from: StorefrontAction.kt */
/* loaded from: classes18.dex */
public final class ijl0 implements hjl0.a {
    public final CommonMarketStat$TypeCtaButtonPositionType b;

    public ijl0(CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType) {
        this.b = commonMarketStat$TypeCtaButtonPositionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijl0) && this.b == ((ijl0) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CallToAction(posType=" + this.b + ')';
    }
}
