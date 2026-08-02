package xsna;

import com.vk.core.compose.component.defaults.SeparatorAppearance;

/* compiled from: SeparatorDefaults.kt */
/* loaded from: classes17.dex */
public final class kki0 {
    public static final float a = (float) 0.5d;
    public static final float b = 1;

    /* compiled from: SeparatorDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SeparatorAppearance.values().length];
            try {
                iArr[SeparatorAppearance.PrimaryAlpha.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SeparatorAppearance.Primary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SeparatorAppearance.Secondary.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static long a(SeparatorAppearance separatorAppearance, androidx.compose.runtime.a aVar, int i) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(844071088, i, -1, "com.vk.core.compose.component.defaults.SeparatorDefaults.separatorColor (SeparatorDefaults.kt:31)");
        }
        aVar.K(-1311467661);
        int i2 = ((i >> 3) & 112) | (i & 14);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1024574811, i2, -1, "com.vk.core.compose.component.defaults.SeparatorDefaults.getMilkshakeSeparatorColor (SeparatorDefaults.kt:41)");
        }
        int i3 = a.$EnumSwitchMapping$0[separatorAppearance.ordinal()];
        if (i3 == 1) {
            aVar.K(-1068875014);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.p().d;
            aVar.j();
        } else if (i3 == 2) {
            aVar.K(-1068872265);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.p().b;
            aVar.j();
        } else {
            if (i3 != 3) {
                throw alb0.c(-1068877878, aVar);
            }
            aVar.K(-1068869545);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var3.p().c;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
