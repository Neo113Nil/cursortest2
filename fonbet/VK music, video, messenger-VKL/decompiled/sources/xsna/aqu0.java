package xsna;

import com.vk.core.compose.component.defaults.DiagonalUserStackSize;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkDiagonalUserStackDefaults.kt */
/* loaded from: classes17.dex */
public final class aqu0 {
    public static final float a = 16;
    public static final float b = 20;
    public static final float c = 24;
    public static final float d = 32;

    /* compiled from: VkDiagonalUserStackDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiagonalUserStackSize.values().length];
            try {
                iArr[DiagonalUserStackSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiagonalUserStackSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiagonalUserStackSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DiagonalUserStackSize.ExtraLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static float a(DiagonalUserStackSize diagonalUserStackSize, int i) {
        float f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-354048352, i, -1, "com.vk.core.compose.component.defaults.VkDiagonalUserStackDefaults.size (VkDiagonalUserStackDefaults.kt:15)");
        }
        int i2 = a.$EnumSwitchMapping$0[diagonalUserStackSize.ordinal()];
        if (i2 == 1) {
            f = a;
        } else if (i2 == 2) {
            f = b;
        } else if (i2 == 3) {
            f = c;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f = d;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }
}
