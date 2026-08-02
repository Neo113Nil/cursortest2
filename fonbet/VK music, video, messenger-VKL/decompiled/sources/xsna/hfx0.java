package xsna;

import com.vk.superapp.bridges.SuperappUiDesignBridge;
import com.vk.typography.FontFamily;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WebAppUiBuilderBridge.kt */
/* loaded from: classes7.dex */
public final class hfx0 {

    /* compiled from: WebAppUiBuilderBridge.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuperappUiDesignBridge.FontFamily.values().length];
            try {
                iArr[SuperappUiDesignBridge.FontFamily.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperappUiDesignBridge.FontFamily.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperappUiDesignBridge.FontFamily.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuperappUiDesignBridge.FontFamily.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SuperappUiDesignBridge.FontFamily.BLACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FontFamily a(SuperappUiDesignBridge.FontFamily fontFamily) {
        int i = a.$EnumSwitchMapping$0[fontFamily.ordinal()];
        if (i == 1) {
            return FontFamily.LIGHT;
        }
        if (i == 2) {
            return FontFamily.REGULAR;
        }
        if (i == 3) {
            return FontFamily.MEDIUM;
        }
        if (i == 4) {
            return FontFamily.BOLD;
        }
        if (i == 5) {
            return FontFamily.BLACK;
        }
        throw new NoWhenBranchMatchedException();
    }
}
