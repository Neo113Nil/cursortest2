package xsna;

import com.vk.core.compose.generated.VkColorToken;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class hap0 {
    public final VkColorToken a;
    public final float b;

    public hap0(VkColorToken vkColorToken, float f) {
        this.a = vkColorToken;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hap0)) {
            return false;
        }
        hap0 hap0Var = (hap0) obj;
        return this.a == hap0Var.a && Float.compare(0.24f, 0.24f) == 0 && pco.b(this.b, hap0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + io.reactivex.rxjava3.subjects.b.a(0.24f, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardButtonBackgroundAppearance(color=");
        sb.append(this.a);
        sb.append(", alpha=0.24, blurRadius=");
        return ir.f(')', this.b, sb);
    }
}
