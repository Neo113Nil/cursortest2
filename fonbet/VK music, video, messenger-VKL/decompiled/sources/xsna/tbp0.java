package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class tbp0 {
    public final float a;
    public final float b;
    public final ButtonSize c;
    public final ButtonStyle d;
    public final ButtonAppearance e;

    public tbp0(float f, float f2, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance) {
        this.a = f;
        this.b = f2;
        this.c = buttonSize;
        this.d = buttonStyle;
        this.e = buttonAppearance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbp0)) {
            return false;
        }
        tbp0 tbp0Var = (tbp0) obj;
        return pco.b(this.a, tbp0Var.a) && pco.b(this.b, tbp0Var.b) && this.c == tbp0Var.c && this.d == tbp0Var.d && this.e == tbp0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardTopEndButtonAppearance(containerSize=");
        oq.f(this.a, ", iconSize=", sb);
        oq.f(this.b, ", size=", sb);
        sb.append(this.c);
        sb.append(", style=");
        sb.append(this.d);
        sb.append(", appearance=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
