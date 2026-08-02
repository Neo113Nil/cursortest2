package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.IconBackgroundStyle;
import com.vk.core.view.components.cell.button.IconSize;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CellButton.kt */
/* loaded from: classes17.dex */
public final class dma {

    /* compiled from: CellButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[IconSize.values().length];
            try {
                iArr[IconSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconBackgroundStyle.values().length];
            try {
                iArr2[IconBackgroundStyle.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconBackgroundStyle.Circle.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IconBackgroundStyle.SquireSmallRadius.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IconBackgroundStyle.SquireMediumRadius.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IconBackgroundStyle.SquireLargeRadius.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Appearance.values().length];
            try {
                iArr3[Appearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Appearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Appearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static int a(Context context, IconSize iconSize, IconBackgroundStyle iconBackgroundStyle) {
        int i = a.$EnumSwitchMapping$1[iconBackgroundStyle.ordinal()];
        if (i == 1) {
            return b(context, iconSize, iconBackgroundStyle);
        }
        if (i != 2 && i != 3 && i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = a.$EnumSwitchMapping$0[iconSize.ordinal()];
        if (i2 == 1) {
            return hbh0.b(40, context);
        }
        if (i2 == 2) {
            return hbh0.b(48, context);
        }
        if (i2 == 3) {
            return hbh0.b(72, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int b(Context context, IconSize iconSize, IconBackgroundStyle iconBackgroundStyle) {
        int i = a.$EnumSwitchMapping$0[iconSize.ordinal()];
        if (i == 1) {
            return iconBackgroundStyle == IconBackgroundStyle.None ? hbh0.b(28, context) : hbh0.b(24, context);
        }
        if (i == 2) {
            return iconBackgroundStyle == IconBackgroundStyle.None ? hbh0.b(32, context) : hbh0.b(28, context);
        }
        if (i == 3) {
            return hbh0.b(36, context);
        }
        throw new NoWhenBranchMatchedException();
    }
}
