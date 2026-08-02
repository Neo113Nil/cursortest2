package xsna;

import com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionItemIconAppearance;
import com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionItemTextAppearance;

/* compiled from: ActionItem.kt */
/* loaded from: classes18.dex */
public final class t10 {
    public final u60 a;
    public final Integer b;
    public final int c;
    public final ActionItemTextAppearance d;
    public final ActionItemIconAppearance e;
    public final boolean f;

    public t10(u60 u60Var, Integer num, int i, ActionItemTextAppearance actionItemTextAppearance, ActionItemIconAppearance actionItemIconAppearance, boolean z) {
        this.a = u60Var;
        this.b = num;
        this.c = i;
        this.d = actionItemTextAppearance;
        this.e = actionItemIconAppearance;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t10)) {
            return false;
        }
        t10 t10Var = (t10) obj;
        return epx.f(this.a, t10Var.a) && epx.f(this.b, t10Var.b) && this.c == t10Var.c && this.d == t10Var.d && this.e == t10Var.e && this.f == t10Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionItem(type=");
        sb.append(this.a);
        sb.append(", iconResId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", textAppearance=");
        sb.append(this.d);
        sb.append(", iconAppearance=");
        sb.append(this.e);
        sb.append(", isOnboardingHighlighted=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public /* synthetic */ t10(u60 u60Var, Integer num, int i, ActionItemTextAppearance actionItemTextAppearance, ActionItemIconAppearance actionItemIconAppearance, int i2) {
        this(u60Var, num, i, (i2 & 8) != 0 ? ActionItemTextAppearance.Primary : actionItemTextAppearance, (i2 & 16) != 0 ? ActionItemIconAppearance.Accent : actionItemIconAppearance, false);
    }
}
