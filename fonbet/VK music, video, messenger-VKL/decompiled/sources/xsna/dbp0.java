package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class dbp0 {
    public final ButtonSize a;
    public final ButtonStyle b;
    public final ButtonAppearance c;

    public dbp0(ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance) {
        this.a = buttonSize;
        this.b = buttonStyle;
        this.c = buttonAppearance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbp0)) {
            return false;
        }
        dbp0 dbp0Var = (dbp0) obj;
        return this.a == dbp0Var.a && this.b == dbp0Var.b && this.c == dbp0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TopshelfCardPrimaryButtonAppearance(size=" + this.a + ", style=" + this.b + ", appearance=" + this.c + ')';
    }
}
