package xsna;

import xsna.xrh;

/* compiled from: CommunityProfileOnboardingItemModel.kt */
/* loaded from: classes5.dex */
public final class ash extends s4h {
    public final xrh.b b;

    public ash(xrh.b bVar) {
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ash) && epx.f(this.b, ((ash) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CommunityProfileOnboardingItemModel(onboarding=" + this.b + ')';
    }
}
