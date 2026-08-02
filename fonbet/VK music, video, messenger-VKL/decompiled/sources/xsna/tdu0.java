package xsna;

import com.vk.core.compose.component.banner.Banner$BackgroundContentScale;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.banner.Banner$Notification$Appearance;

/* compiled from: VkBannerDefaults.kt */
/* loaded from: classes17.dex */
public final class tdu0 {

    /* compiled from: VkBannerDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Banner$BackgroundMode.values().length];
            try {
                iArr[Banner$BackgroundMode.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Banner$BackgroundMode.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Banner$Notification$Appearance.values().length];
            try {
                iArr2[Banner$Notification$Appearance.Neutral.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Banner$Notification$Appearance.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Banner$Notification$Appearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Banner$Notification$Appearance.Positive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Banner$BackgroundContentScale.values().length];
            try {
                iArr3[Banner$BackgroundContentScale.Fit.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Banner$BackgroundContentScale.Crop.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static long a(Banner$Notification$Appearance banner$Notification$Appearance, androidx.compose.runtime.a aVar, int i) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-790687416, i, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.backgroundColor (VkBannerDefaults.kt:87)");
        }
        aVar.K(-1767946409);
        int i2 = a.$EnumSwitchMapping$1[banner$Notification$Appearance.ordinal()];
        if (i2 == 1) {
            aVar.K(358614555);
            j = wlb0.h(aVar).getBackground().x;
            aVar.j();
        } else if (i2 == 2) {
            aVar.K(358617753);
            j = wlb0.h(aVar).getBackground().D;
            aVar.j();
        } else if (i2 == 3) {
            aVar.K(358620926);
            j = wlb0.h(aVar).getBackground().u;
            aVar.j();
        } else {
            if (i2 != 4) {
                throw alb0.c(358611771, aVar);
            }
            aVar.K(358624254);
            j = wlb0.h(aVar).getBackground().w;
            aVar.j();
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }

    public static long b(Banner$Notification$Appearance banner$Notification$Appearance, androidx.compose.runtime.a aVar, int i) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1038917386, i, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.borderColor (VkBannerDefaults.kt:100)");
        }
        aVar.K(853710806);
        int i2 = a.$EnumSwitchMapping$1[banner$Notification$Appearance.ordinal()];
        if (i2 == 1) {
            aVar.K(1967204666);
            j = wlb0.h(aVar).getImage().a;
            aVar.j();
        } else if (i2 == 2) {
            aVar.K(1967207797);
            j = wlb0.h(aVar).d().a;
            aVar.j();
        } else if (i2 == 3) {
            aVar.K(1967210805);
            j = wlb0.h(aVar).d().a;
            aVar.j();
        } else {
            if (i2 != 4) {
                throw alb0.c(1967202012, aVar);
            }
            aVar.K(1967213813);
            j = wlb0.h(aVar).d().a;
            aVar.j();
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }

    public static long c(Banner$BackgroundMode banner$BackgroundMode, androidx.compose.runtime.a aVar) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1462787241, 48, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.descriptionColor (VkBannerDefaults.kt:255)");
        }
        aVar.K(1156916153);
        if ((banner$BackgroundMode == null ? -1 : a.$EnumSwitchMapping$0[banner$BackgroundMode.ordinal()]) == 1) {
            aVar.K(1284248629);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getText().d;
            aVar.j();
        } else {
            aVar.K(1284250324);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getText().m;
            aVar.j();
        }
        long c = l5g.c(14, j, 0.72f);
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return c;
    }

    public static frv0 d(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(684106684, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.descriptionStyle (VkBannerDefaults.kt:217)");
        }
        aVar.K(602537818);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
        }
        wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        frv0 frv0Var = wuv0Var.Y;
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return frv0Var;
    }

    public static void e() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-772310221, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.padding (VkBannerDefaults.kt:116)");
        }
        float f = kqu0.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static void f() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1378099656, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.paddingToAfter (VkBannerDefaults.kt:132)");
        }
        float f = kqu0.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static uog0 g(int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-484701964, i, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.shape (VkBannerDefaults.kt:19)");
        }
        uog0 b = vog0.b(8);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b;
    }
}
