package xsna;

import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DonutBannerItemStyleProvider.kt */
/* loaded from: classes18.dex */
public final class gxn implements x1o {
    public final ylu0 a;
    public final boolean b;

    /* compiled from: DonutBannerItemStyleProvider.kt */
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

    public gxn(ylu0 ylu0Var, boolean z) {
        this.a = ylu0Var;
        this.b = z;
    }

    @Override // xsna.x1o
    public final long a(DonutPriceTemplateItemStyle donutPriceTemplateItemStyle) {
        boolean z = this.b;
        ylu0 ylu0Var = this.a;
        if (z) {
            if (a.$EnumSwitchMapping$0[donutPriceTemplateItemStyle.ordinal()] == 1) {
                return ylu0Var.getText().p;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (a.$EnumSwitchMapping$0[donutPriceTemplateItemStyle.ordinal()] == 1) {
            return ylu0Var.getText().s;
        }
        throw new NoWhenBranchMatchedException();
    }
}
