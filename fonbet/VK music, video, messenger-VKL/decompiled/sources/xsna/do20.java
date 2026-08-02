package xsna;

import com.vk.core.compose.component.button.tool.ToolButton$Appearance;
import com.vk.core.compose.component.button.tool.ToolButton$Mode;
import com.vk.core.compose.component.button.tool.ToolButton$TextPosition;

/* compiled from: MilkshakeToolButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class do20 extends wg6 {
    public static final do20 d = new do20();

    /* compiled from: MilkshakeToolButtonDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ToolButton$TextPosition.values().length];
            try {
                iArr[ToolButton$TextPosition.Right.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToolButton$TextPosition.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToolButton$TextPosition.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ToolButton$Mode.values().length];
            try {
                iArr2[ToolButton$Mode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ToolButton$Mode.Outline.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ToolButton$Mode.Secondary.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ToolButton$Mode.Tertiary.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ToolButton$Appearance.values().length];
            try {
                iArr3[ToolButton$Appearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ToolButton$Appearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ToolButton$Appearance.Overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public final psv0 h(ToolButton$Mode toolButton$Mode, ToolButton$Appearance toolButton$Appearance, androidx.compose.runtime.a aVar, int i) {
        psv0 d2;
        long j;
        long j2;
        androidx.compose.runtime.a aVar2 = aVar;
        aVar2.K(612281481);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(612281481, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeToolButtonDefaults.colors (MilkshakeToolButtonDefaults.kt:101)");
        }
        int i2 = a.$EnumSwitchMapping$1[toolButton$Mode.ordinal()];
        if (i2 == 1) {
            aVar2.K(-248235040);
            int i3 = a.$EnumSwitchMapping$2[toolButton$Appearance.ordinal()];
            if (i3 == 1) {
                aVar2.K(-8006044);
                int i4 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1166943118, i4, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeToolButtonDefaults.primaryAccentButtonColors (MilkshakeToolButtonDefaults.kt:153)");
                }
                d2 = wg6.d(wlb0.h(aVar2).getBackground().d, l5g.c(14, wlb0.h(aVar2).getBackground().d, 0.64f), wlb0.h(aVar2).getText().e, l5g.c(14, wlb0.h(aVar2).getText().e, 0.64f), wlb0.h(aVar2).getIcon().e, l5g.c(14, wlb0.h(aVar2).getIcon().e, 0.64f), aVar2, (i4 << 18) & 3670016, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw alb0.c(-8007582, aVar2);
                }
                aVar2.K(-8003035);
                int i5 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-565134183, i5, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeToolButtonDefaults.primaryNeutralButtonColors (MilkshakeToolButtonDefaults.kt:163)");
                }
                d2 = wg6.d(wlb0.h(aVar2).getBackground().i, l5g.c(14, wlb0.h(aVar2).getBackground().i, 0.64f), wlb0.h(aVar2).getText().e, l5g.c(14, wlb0.h(aVar2).getText().e, 0.64f), wlb0.h(aVar2).getIcon().e, l5g.c(14, wlb0.h(aVar2).getIcon().e, 0.64f), aVar, (i5 << 18) & 3670016, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
            aVar.j();
        } else {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                throw alb0.c(-8007684, aVar2);
            }
            aVar2.K(-247953932);
            if (toolButton$Mode == ToolButton$Mode.Secondary) {
                aVar2.K(-247851415);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getBackground().x;
                j2 = l5g.c(14, j, l5g.e(j) * 0.64f);
                aVar2.j();
            } else {
                aVar2.K(-247641049);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.d().a;
                aVar2.j();
                j2 = j;
            }
            int i6 = a.$EnumSwitchMapping$2[toolButton$Appearance.ordinal()];
            if (i6 == 1) {
                long j3 = j;
                aVar2.K(-7981486);
                int i7 = i & 896;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1744082054, i7, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeToolButtonDefaults.inverseAccentButtonColors (MilkshakeToolButtonDefaults.kt:176)");
                }
                long j4 = j2;
                d2 = wg6.d(j3, j4, wlb0.h(aVar2).getText().c, l5g.c(14, wlb0.h(aVar2).getText().c, 0.64f), wlb0.h(aVar2).getIcon().b, l5g.c(14, wlb0.h(aVar2).getIcon().b, 0.64f), aVar2, (i7 << 12) & 3670016, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
            } else {
                if (i6 != 2 && i6 != 3) {
                    throw alb0.c(-7982993, aVar2);
                }
                aVar2.K(-7973645);
                int i8 = i & 896;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(642235391, i8, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeToolButtonDefaults.inverseNeutralButtonColors (MilkshakeToolButtonDefaults.kt:189)");
                }
                long j5 = wlb0.h(aVar2).getIcon().j;
                long c = l5g.c(14, wlb0.h(aVar2).getIcon().j, 0.64f);
                aVar2 = aVar;
                d2 = wg6.d(j, j2, wlb0.h(aVar2).getText().m, l5g.c(14, wlb0.h(aVar2).getText().m, 0.64f), j5, c, aVar2, (i8 << 12) & 3670016, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
            }
            aVar2.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return d2;
    }
}
