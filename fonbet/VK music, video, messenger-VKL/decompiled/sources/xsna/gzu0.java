package xsna;

import com.vk.core.compose.component.defaults.IconButtonAppearance;
import com.vk.core.compose.component.defaults.IconButtonSize;

/* compiled from: VkIconButtonDefault.kt */
/* loaded from: classes17.dex */
public final class gzu0 {
    public static final float a = 24;
    public static final uog0 b = vog0.b(10);

    /* compiled from: VkIconButtonDefault.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconButtonAppearance.values().length];
            try {
                iArr[IconButtonAppearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconButtonAppearance.Positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconButtonAppearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconButtonAppearance.Neutral.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IconButtonAppearance.Overlay.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconButtonSize.values().length];
            try {
                iArr2[IconButtonSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IconButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IconButtonSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
