package xsna;

import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class x9o extends dao {
    public static final x9o b = new x9o(CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.NO_CONNECTION);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x9o);
    }

    public final int hashCode() {
        return -424642312;
    }

    public final String toString() {
        return "NoConnection";
    }
}
