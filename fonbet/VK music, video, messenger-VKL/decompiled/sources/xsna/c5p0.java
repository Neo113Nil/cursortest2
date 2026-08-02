package xsna;

import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;

/* compiled from: VkOnboardingTooltipWrapper.kt */
/* loaded from: classes17.dex */
public final class c5p0 {
    public final zhf0 a;
    public final float b;
    public final VkTooltip$MarkerStyle c;
    public final VkTooltip$MarkerSize d;

    public c5p0(zhf0 zhf0Var, float f, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize) {
        this.a = zhf0Var;
        this.b = f;
        this.c = vkTooltip$MarkerStyle;
        this.d = vkTooltip$MarkerSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5p0)) {
            return false;
        }
        c5p0 c5p0Var = (c5p0) obj;
        return epx.f(this.a, c5p0Var.a) && Float.compare(this.b, c5p0Var.b) == 0 && this.c == c5p0Var.c && this.d == c5p0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "TooltipContextParams(childRect=" + this.a + ", density=" + this.b + ", markerStyle=" + this.c + ", markerSize=" + this.d + ')';
    }
}
