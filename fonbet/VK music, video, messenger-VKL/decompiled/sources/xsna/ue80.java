package xsna;

import com.vk.onboardingpromo.impl.ui.view.OnboardingPromoCtaClickTypeVs;
import java.util.List;

/* compiled from: OnboardingPromoVs.kt */
/* loaded from: classes4.dex */
public final class ue80 {
    public final OnboardingPromoCtaClickTypeVs a;
    public final List<String> b;

    public ue80(OnboardingPromoCtaClickTypeVs onboardingPromoCtaClickTypeVs, List<String> list) {
        this.a = onboardingPromoCtaClickTypeVs;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue80)) {
            return false;
        }
        ue80 ue80Var = (ue80) obj;
        return this.a == ue80Var.a && epx.f(this.b, ue80Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<String> list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPromoActionVs(type=");
        sb.append(this.a);
        sb.append(", params=");
        return ms9.a(')', sb, this.b);
    }
}
