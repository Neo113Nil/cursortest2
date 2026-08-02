package xsna;

import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class y9o extends dao {
    public static final y9o b = new y9o(CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.DEVICE_IN_ROAMING);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y9o);
    }

    public final int hashCode() {
        return 22578944;
    }

    public final String toString() {
        return "Roaming";
    }
}
