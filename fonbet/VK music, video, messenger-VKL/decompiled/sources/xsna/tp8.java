package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.view.components.button.VkButton;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ButtonExt.kt */
/* loaded from: classes17.dex */
public final class tp8 {

    /* compiled from: ButtonExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VkButton.Mode.values().length];
            try {
                iArr[VkButton.Mode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkButton.Mode.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkButton.Mode.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkButton.Mode.Outline.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkButton.Mode.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkButton.Appearance.values().length];
            try {
                iArr2[VkButton.Appearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VkButton.Appearance.Positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VkButton.Appearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VkButton.Appearance.Neutral.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VkButton.Appearance.Overlay.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VkButton.Size.values().length];
            try {
                iArr3[VkButton.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[VkButton.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[VkButton.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final ButtonAppearance a(VkButton.Appearance appearance) {
        int i = a.$EnumSwitchMapping$1[appearance.ordinal()];
        if (i == 1) {
            return ButtonAppearance.Accent;
        }
        if (i == 2) {
            return ButtonAppearance.Positive;
        }
        if (i == 3) {
            return ButtonAppearance.Negative;
        }
        if (i == 4) {
            return ButtonAppearance.Neutral;
        }
        if (i == 5) {
            return ButtonAppearance.Overlay;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ButtonSize b(VkButton.Size size) {
        int i = a.$EnumSwitchMapping$2[size.ordinal()];
        if (i == 1) {
            return ButtonSize.Small;
        }
        if (i == 2) {
            return ButtonSize.Medium;
        }
        if (i == 3) {
            return ButtonSize.Large;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ButtonStyle c(VkButton.Mode mode) {
        int i = a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            return ButtonStyle.Primary;
        }
        if (i == 2) {
            return ButtonStyle.Secondary;
        }
        if (i == 3) {
            return ButtonStyle.Tertiary;
        }
        if (i == 4) {
            return ButtonStyle.Outline;
        }
        if (i == 5) {
            return ButtonStyle.Link;
        }
        throw new NoWhenBranchMatchedException();
    }
}
