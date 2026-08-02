package xsna;

import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;

/* compiled from: OnboardingPromoAnalyticsUtils.kt */
/* loaded from: classes4.dex */
public final class ve80 {
    public final CommonOnboardingStat$TypeOnboardingEvent.EventType a;
    public final CommonOnboardingStat$TypeOnboardingEvent.EventSubtype b;
    public final String c;
    public final OnboardingPromoState.CurrentSlide d;
    public final int e;
    public final long f;
    public final boolean g;

    public ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType eventType, CommonOnboardingStat$TypeOnboardingEvent.EventSubtype eventSubtype, String str, OnboardingPromoState.CurrentSlide currentSlide, int i, long j, int i2) {
        eventSubtype = (i2 & 2) != 0 ? null : eventSubtype;
        currentSlide = (i2 & 8) != 0 ? null : currentSlide;
        i = (i2 & 16) != 0 ? 0 : i;
        j = (i2 & 32) != 0 ? 0L : j;
        boolean z = (i2 & 64) == 0;
        this.a = eventType;
        this.b = eventSubtype;
        this.c = str;
        this.d = currentSlide;
        this.e = i;
        this.f = j;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve80)) {
            return false;
        }
        ve80 ve80Var = (ve80) obj;
        return this.a == ve80Var.a && this.b == ve80Var.b && epx.f(this.c, ve80Var.c) && epx.f(this.d, ve80Var.d) && this.e == ve80Var.e && this.f == ve80Var.f && this.g == ve80Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CommonOnboardingStat$TypeOnboardingEvent.EventSubtype eventSubtype = this.b;
        int hashCode2 = (hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        OnboardingPromoState.CurrentSlide currentSlide = this.d;
        return Boolean.hashCode(this.g) + bh10.a(shy.a(this.e, (hashCode3 + (currentSlide != null ? currentSlide.hashCode() : 0)) * 31, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPromoAnalyticsEvent(type=");
        sb.append(this.a);
        sb.append(", subtype=");
        sb.append(this.b);
        sb.append(", campaignName=");
        sb.append(this.c);
        sb.append(", currentSlide=");
        sb.append(this.d);
        sb.append(", currentSlideNumber=");
        sb.append(this.e);
        sb.append(", currentVideoPosition=");
        sb.append(this.f);
        sb.append(", isViewEvent=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
