package xsna;

import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InverseDonutPriceItemStyleProvider.kt */
/* loaded from: classes18.dex */
public final class xpx implements x1o {
    public final ylu0 a;
    public final boolean b;

    /* compiled from: InverseDonutPriceItemStyleProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutPriceTemplateItemStyle.values().length];
            try {
                iArr[DonutPriceTemplateItemStyle.SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xpx(ylu0 ylu0Var, boolean z) {
        this.a = ylu0Var;
        this.b = z;
    }

    @Override // xsna.x1o
    public final long a(DonutPriceTemplateItemStyle donutPriceTemplateItemStyle) {
        boolean z = this.b;
        ylu0 ylu0Var = this.a;
        if (z) {
            if (a.$EnumSwitchMapping$0[donutPriceTemplateItemStyle.ordinal()] == 1) {
                return ylu0Var.getText().s;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (a.$EnumSwitchMapping$0[donutPriceTemplateItemStyle.ordinal()] == 1) {
            return ylu0Var.j().b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpx)) {
            return false;
        }
        xpx xpxVar = (xpx) obj;
        return epx.f(this.a, xpxVar.a) && this.b == xpxVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InverseDonutPriceItemStyleProvider(colorScheme=");
        sb.append(this.a);
        sb.append(", isDarkTheme=");
        return n23.b(sb, this.b, ", isLego=false)");
    }
}
