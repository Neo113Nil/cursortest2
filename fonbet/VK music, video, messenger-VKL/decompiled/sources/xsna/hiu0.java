package xsna;

import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.core.compose.component.defaults.CellButton$IconBackgroundStyle;
import com.vk.core.compose.component.defaults.CellButton$IconSize;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkCellButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class hiu0 {

    /* compiled from: VkCellButtonDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CellButton$IconSize.values().length];
            try {
                iArr[CellButton$IconSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CellButton$IconSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CellButton$IconSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CellButton$IconBackgroundStyle.values().length];
            try {
                iArr2[CellButton$IconBackgroundStyle.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CellButton$IconBackgroundStyle.Circle.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CellButton$IconBackgroundStyle.SquireSmallRadius.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CellButton$IconBackgroundStyle.SquireMediumRadius.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CellButton$IconBackgroundStyle.SquireLargeRadius.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CellButton$Appearance.values().length];
            try {
                iArr3[CellButton$Appearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CellButton$Appearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CellButton$Appearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static float a(CellButton$IconSize cellButton$IconSize, CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle) {
        int i;
        int i2 = a.$EnumSwitchMapping$0[cellButton$IconSize.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 36;
            } else {
                if (cellButton$IconBackgroundStyle != CellButton$IconBackgroundStyle.None) {
                    return 28;
                }
                i = 32;
            }
        } else {
            if (cellButton$IconBackgroundStyle == CellButton$IconBackgroundStyle.None) {
                return 28;
            }
            i = 24;
        }
        return i;
    }
}
