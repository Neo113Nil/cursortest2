package xsna;

import com.vk.ecomm.design.compose.property.config.MarketProperty$VariantState;

/* compiled from: MarketPropertyUtils.kt */
/* loaded from: classes18.dex */
public final class rd10 {

    /* compiled from: MarketPropertyUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketProperty$VariantState.values().length];
            try {
                iArr[MarketProperty$VariantState.SELECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketProperty$VariantState.RUN_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketProperty$VariantState.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float a(MarketProperty$VariantState marketProperty$VariantState) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-107017479, 0, -1, "com.vk.ecomm.design.compose.property.util.provideAlphaByState (MarketPropertyUtils.kt:23)");
        }
        float f = a.$EnumSwitchMapping$0[marketProperty$VariantState.ordinal()] == 3 ? 0.64f : 1.0f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static final y18 b(MarketProperty$VariantState marketProperty$VariantState, androidx.compose.runtime.a aVar) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1884921771, 0, -1, "com.vk.ecomm.design.compose.property.util.provideBorderByState (MarketPropertyUtils.kt:9)");
        }
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[marketProperty$VariantState.ordinal()];
        float f = (i == 1 || i == 2) ? 1.5f : 1;
        int i2 = iArr[marketProperty$VariantState.ordinal()];
        if (i2 == 1) {
            aVar.K(1066390661);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getIcon().b;
            aVar.j();
        } else if (i2 != 2) {
            aVar.K(1066394949);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.r().b;
            aVar.j();
        } else {
            aVar.K(1066393345);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var3.getIcon().h;
            aVar.j();
        }
        y18 a2 = aqw.a(f, j);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }
}
