package xsna;

import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class u9o extends dao {
    public static final u9o b = new u9o(CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.DEVICE_IS_FOLDABLE);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u9o);
    }

    public final int hashCode() {
        return -276109222;
    }

    public final String toString() {
        return "Foldable";
    }
}
