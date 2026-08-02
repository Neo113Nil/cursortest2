package xsna;

import com.vk.core.view.components.placeholder.ButtonArrangement;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;

/* compiled from: Placeholder.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class dsa0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[VkPlaceholder.Size.values().length];
        try {
            iArr[VkPlaceholder.Size.Large.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VkPlaceholder.Size.Medium.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VkPlaceholder.Size.Small.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[VkPlaceholder.Mode.values().length];
        try {
            iArr2[VkPlaceholder.Mode.Primary.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[VkPlaceholder.Mode.Overlay.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[VkPlaceholder.Mode.Neutral.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[ButtonArrangement.values().length];
        try {
            iArr3[ButtonArrangement.HorizontalFilled.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ButtonArrangement.HorizontalHugged.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
