package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class hbp0 {
    public final ButtonSize a;
    public final ButtonStyle b;
    public final ButtonAppearance c;
    public final hap0 d;
    public final float e;

    public hbp0(ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, hap0 hap0Var, float f) {
        this.a = buttonSize;
        this.b = buttonStyle;
        this.c = buttonAppearance;
        this.d = hap0Var;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbp0)) {
            return false;
        }
        hbp0 hbp0Var = (hbp0) obj;
        return this.a == hbp0Var.a && this.b == hbp0Var.b && this.c == hbp0Var.c && epx.f(this.d, hbp0Var.d) && pco.b(this.e, hbp0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        hap0 hap0Var = this.d;
        return Float.hashCode(this.e) + ((hashCode + (hap0Var == null ? 0 : hap0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardSecondaryButtonAppearance(size=");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", appearance=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", cornerRadius=");
        return ir.f(')', this.e, sb);
    }
}
