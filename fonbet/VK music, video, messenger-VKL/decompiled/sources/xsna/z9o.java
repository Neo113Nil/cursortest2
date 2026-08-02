package xsna;

import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class z9o extends dao {
    public static final z9o b = new z9o(CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.TRAFFIC_SAVING_MODE);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z9o);
    }

    public final int hashCode() {
        return 1484550081;
    }

    public final String toString() {
        return "TrafficSavingMode";
    }
}
