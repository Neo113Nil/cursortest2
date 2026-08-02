package xsna;

import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.ActionButtonsStyle;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.LogoStyle;
import xsna.dyo;

/* compiled from: EcosystemProfileConfiguration.kt */
/* loaded from: classes6.dex */
public final class xxo {
    public static final int f = iah0.a(8);
    public final dyo a;
    public final LogoStyle b;
    public final boolean c;
    public final int d;
    public final ActionButtonsStyle e;

    static {
        new xxo(null, 31);
    }

    public xxo() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxo)) {
            return false;
        }
        xxo xxoVar = (xxo) obj;
        return epx.f(this.a, xxoVar.a) && this.b == xxoVar.b && this.c == xxoVar.c && this.d == xxoVar.d && this.e == xxoVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        return "EcosystemProfileConfiguration(viewConfigurationType=" + this.a + ", logoStyle=" + this.b + ", isTooltipEnabled=" + this.c + ", buttonsBorderCornerRadius=" + this.d + ", actionButtonsStyle=" + this.e + ')';
    }

    public xxo(dyo dyoVar, LogoStyle logoStyle, boolean z, int i, ActionButtonsStyle actionButtonsStyle) {
        this.a = dyoVar;
        this.b = logoStyle;
        this.c = z;
        this.d = i;
        this.e = actionButtonsStyle;
    }

    public /* synthetic */ xxo(dyo dyoVar, int i) {
        this((i & 1) != 0 ? dyo.a.a : dyoVar, LogoStyle.ECOSYSTEM, true, f, ActionButtonsStyle.DEFAULT);
    }
}
