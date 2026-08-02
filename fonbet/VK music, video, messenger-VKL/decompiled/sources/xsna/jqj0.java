package xsna;

import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SimpleDonutPriceItemStyleProvider.kt */
/* loaded from: classes18.dex */
public final class jqj0 implements x1o {
    public final ylu0 a;
    public final boolean b;

    /* compiled from: SimpleDonutPriceItemStyleProvider.kt */
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

    public jqj0(ylu0 ylu0Var, boolean z) {
        this.a = ylu0Var;
        this.b = z;
    }

    @Override // xsna.x1o
    public final long a(DonutPriceTemplateItemStyle donutPriceTemplateItemStyle) {
        boolean z = this.b;
        ylu0 ylu0Var = this.a;
        if (z) {
            if (a.$EnumSwitchMapping$0[donutPriceTemplateItemStyle.ordinal()] == 1) {
                return ylu0Var.getText().r;
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
        if (!(obj instanceof jqj0)) {
            return false;
        }
        jqj0 jqj0Var = (jqj0) obj;
        return epx.f(this.a, jqj0Var.a) && this.b == jqj0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleDonutPriceItemStyleProvider(colorScheme=");
        sb.append(this.a);
        sb.append(", isDarkTheme=");
        return n23.b(sb, this.b, ", isLego=false)");
    }
}
