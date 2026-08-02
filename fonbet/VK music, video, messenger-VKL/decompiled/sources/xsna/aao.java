package xsna;

import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class aao extends dao {
    public static final aao b = new aao(CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.LOW_BATTERY);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aao);
    }

    public final int hashCode() {
        return 529355977;
    }

    public final String toString() {
        return "BatteryLow";
    }
}
