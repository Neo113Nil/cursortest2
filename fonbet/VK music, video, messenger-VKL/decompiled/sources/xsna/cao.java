package xsna;

import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class cao extends dao {
    public static final cao b = new cao(CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.POWER_SAVING_MODE);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cao);
    }

    public final int hashCode() {
        return -1288376032;
    }

    public final String toString() {
        return "PowerSavingMode";
    }
}
