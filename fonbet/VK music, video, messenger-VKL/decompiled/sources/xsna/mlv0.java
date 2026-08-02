package xsna;

import com.vk.core.compose.component.defaults.SpinnerMode;
import com.vk.core.compose.component.defaults.SpinnerSize;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkSpinnerDefault.kt */
/* loaded from: classes17.dex */
public final class mlv0 {
    public static final float a = 160;

    /* compiled from: VkSpinnerDefault.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SpinnerSize.values().length];
            try {
                iArr[SpinnerSize.Size16.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpinnerSize.Size24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpinnerSize.Size28.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SpinnerSize.Size36.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SpinnerSize.Size56.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SpinnerMode.values().length];
            try {
                iArr2[SpinnerMode.Shadow.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SpinnerMode.Overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static float a(SpinnerSize spinnerSize, int i) {
        int i2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-559657862, i, -1, "com.vk.core.compose.component.defaults.VkSpinnerDefault.sizeToDp (VkSpinnerDefault.kt:14)");
        }
        int i3 = a.$EnumSwitchMapping$0[spinnerSize.ordinal()];
        if (i3 == 1) {
            i2 = 16;
        } else if (i3 == 2) {
            i2 = 24;
        } else if (i3 == 3) {
            i2 = 28;
        } else if (i3 == 4) {
            i2 = 36;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 56;
        }
        float f = i2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }
}
