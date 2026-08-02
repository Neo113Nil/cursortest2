package xsna;

import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;

/* compiled from: VkSubnavigationButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class knv0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final uog0 e;
    public static final float f;

    /* compiled from: VkSubnavigationButtonDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SubnavigationButtonMode.values().length];
            try {
                iArr[SubnavigationButtonMode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubnavigationButtonMode.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubnavigationButtonMode.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubnavigationButtonMode.Outline.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SubnavigationBarAppearance.values().length];
            try {
                iArr2[SubnavigationBarAppearance.Neutral.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SubnavigationBarAppearance.Accent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SubnavigationButtonSize.values().length];
            try {
                iArr3[SubnavigationButtonSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[SubnavigationButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[SubnavigationButtonSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        float f2 = kqu0.r;
        a = f2;
        b = kqu0.t;
        c = f2;
        d = 1;
        e = wpu0.a;
        f = 48;
    }

    public static long a(boolean z, SubnavigationButtonMode subnavigationButtonMode, SubnavigationBarAppearance subnavigationBarAppearance, androidx.compose.runtime.a aVar) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1804540691, 3072, -1, "com.vk.core.compose.component.subnavigation.VkSubnavigationButtonDefaults.getRightIconTint (VkSubnavigationButtonDefaults.kt:189)");
        }
        int i = a.$EnumSwitchMapping$1[subnavigationBarAppearance.ordinal()];
        if (i == 1) {
            aVar.K(1003192536);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getIcon().j;
            aVar.j();
        } else {
            if (i != 2) {
                throw alb0.c(1003190327, aVar);
            }
            aVar.K(1003194754);
            if (z) {
                aVar.K(1034277805);
                int i2 = a.$EnumSwitchMapping$0[subnavigationButtonMode.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        aVar.K(1003204122);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getIcon().l;
                        aVar.j();
                        aVar.j();
                    } else if (i2 != 4) {
                        throw alb0.c(1003195549, aVar);
                    }
                }
                aVar.K(1003201183);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getIcon().e;
                aVar.j();
                aVar.j();
            } else {
                aVar.K(1034600732);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var4.getIcon().l;
                aVar.j();
            }
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
