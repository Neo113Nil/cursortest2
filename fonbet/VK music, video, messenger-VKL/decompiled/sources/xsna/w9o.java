package xsna;

import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class w9o extends dao {
    public static final w9o b = new w9o(CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.BAD_CONNECTION);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w9o);
    }

    public final int hashCode() {
        return -46500246;
    }

    public final String toString() {
        return "BadConnection";
    }
}
