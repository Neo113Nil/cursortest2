package xsna;

import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class bao extends dao {
    public static final bao b = new bao(CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.DOZE_MODE);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bao);
    }

    public final int hashCode() {
        return 1610342139;
    }

    public final String toString() {
        return "DozeMode";
    }
}
