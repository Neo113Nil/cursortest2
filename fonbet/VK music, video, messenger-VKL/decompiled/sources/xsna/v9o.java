package xsna;

import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class v9o extends dao {
    public static final v9o b = new v9o(CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.DEVICE_IS_TABLET);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v9o);
    }

    public final int hashCode() {
        return -743423579;
    }

    public final String toString() {
        return "Tablet";
    }
}
