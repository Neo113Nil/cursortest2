package xsna;

import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class tdc0 {
    public final String a;
    public final String b;
    public final ActionsAvailabilityState.Availability c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public tdc0(String str, String str2, ActionsAvailabilityState.Availability availability, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = availability;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str3;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdc0)) {
            return false;
        }
        tdc0 tdc0Var = (tdc0) obj;
        return epx.f(this.a, tdc0Var.a) && epx.f(this.b, tdc0Var.b) && epx.f(this.c, tdc0Var.c) && this.d == tdc0Var.d && this.e == tdc0Var.e && this.f == tdc0Var.f && epx.f(this.g, tdc0Var.g) && this.h == tdc0Var.h;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return Boolean.hashCode(this.h) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingCreatePostButtonViewState(primaryButtonTitle=");
        sb.append(this.a);
        sb.append(", draftButtonTitle=");
        sb.append(this.b);
        sb.append(", availability=");
        sb.append(this.c);
        sb.append(", hasPrivacyPolicy=");
        sb.append(this.d);
        sb.append(", showDraftButton=");
        sb.append(this.e);
        sb.append(", isDraftButtonDisabled=");
        sb.append(this.f);
        sb.append(", draftButtonHint=");
        sb.append(this.g);
        sb.append(", isDraftOnboardingAvailable=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
