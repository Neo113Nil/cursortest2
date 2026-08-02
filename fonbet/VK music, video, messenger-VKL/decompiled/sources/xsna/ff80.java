package xsna;

import com.vk.onboardingpromo.impl.ui.view.OnboardingPromoSlideShowTypeVs;

/* compiled from: OnboardingPromoVs.kt */
/* loaded from: classes4.dex */
public final class ff80 {
    public final long a;
    public final String b;
    public final OnboardingPromoSlideShowTypeVs c;
    public final aqo0<String> d;
    public final aqo0<String> e;
    public final ue80 f;

    public ff80(long j, String str, OnboardingPromoSlideShowTypeVs onboardingPromoSlideShowTypeVs, aqo0<String> aqo0Var, aqo0<String> aqo0Var2, ue80 ue80Var) {
        this.a = j;
        this.b = str;
        this.c = onboardingPromoSlideShowTypeVs;
        this.d = aqo0Var;
        this.e = aqo0Var2;
        this.f = ue80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff80)) {
            return false;
        }
        ff80 ff80Var = (ff80) obj;
        return this.a == ff80Var.a && epx.f(this.b, ff80Var.b) && this.c == ff80Var.c && epx.f(this.d, ff80Var.d) && epx.f(this.e, ff80Var.e) && epx.f(this.f, ff80Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + urd0.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        aqo0<String> aqo0Var = this.d;
        int hashCode2 = (hashCode + (aqo0Var == null ? 0 : aqo0Var.hashCode())) * 31;
        aqo0<String> aqo0Var2 = this.e;
        return this.f.hashCode() + ((hashCode2 + (aqo0Var2 != null ? aqo0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OnboardingPromoCtaButtonVs(visibilityDelay=" + this.a + ", text=" + this.b + ", slideShowType=" + this.c + ", buttonColor=" + this.d + ", textColor=" + this.e + ", action=" + this.f + ')';
    }
}
