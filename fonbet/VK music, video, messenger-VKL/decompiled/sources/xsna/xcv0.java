package xsna;

import com.vk.core.compose.component.defaults.PictureRadius;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkPictureDefault.kt */
/* loaded from: classes17.dex */
public final class xcv0 {
    public static final float a = 48;

    /* compiled from: VkPictureDefault.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PictureRadius.values().length];
            try {
                iArr[PictureRadius.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PictureRadius.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PictureRadius.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static long a(float f) {
        if (pco.a(f, 40) < 0) {
            float f2 = 12;
            return byc0.b(f2, f2);
        }
        if (pco.a(f, 56) < 0) {
            float f3 = 16;
            return byc0.b(f3, f3);
        }
        if (pco.a(f, 72) < 0) {
            float f4 = 20;
            return byc0.b(f4, f4);
        }
        float f5 = 24;
        return byc0.b(f5, f5);
    }

    public static uog0 b(float f, PictureRadius pictureRadius, int i, int i2) {
        uog0 b;
        if ((i2 & 2) != 0) {
            pictureRadius = PictureRadius.Small;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-436011443, i, -1, "com.vk.core.compose.component.defaults.VkPictureDefault.contentShape (VkPictureDefault.kt:19)");
        }
        int i3 = a.$EnumSwitchMapping$0[pictureRadius.ordinal()];
        if (i3 == 1) {
            b = pco.a(f, (float) 36) < 0 ? vog0.b(2) : pco.a(f, (float) 64) < 0 ? vog0.b(3) : vog0.b(4);
        } else if (i3 == 2) {
            b = pco.a(f, (float) 36) < 0 ? vog0.b(3) : pco.a(f, (float) 64) < 0 ? vog0.b(4) : pco.a(f, (float) 80) < 0 ? vog0.b(6) : pco.a(f, (float) 88) < 0 ? vog0.b(8) : vog0.b(10);
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            b = pco.a(f, (float) 20) < 0 ? vog0.b(4) : pco.a(f, (float) 24) < 0 ? vog0.b(5) : pco.a(f, (float) 36) < 0 ? vog0.b(6) : pco.a(f, (float) 44) < 0 ? vog0.b(8) : pco.a(f, (float) 56) < 0 ? vog0.b(10) : pco.a(f, (float) 64) < 0 ? vog0.b(12) : pco.a(f, (float) 72) < 0 ? vog0.b(14) : vog0.b(16);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b;
    }

    public static long c(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1444213787, i, -1, "com.vk.core.compose.component.defaults.VkPictureDefault.iconContentBackground (VkPictureDefault.kt:116)");
        }
        aVar.K(-1885360896);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getBackground().x;
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }

    public static long d(int i, long j) {
        long b;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1431797843, i, -1, "com.vk.core.compose.component.defaults.VkPictureDefault.iconContentSize (VkPictureDefault.kt:88)");
        }
        float e = e(j);
        float f = 24;
        if (pco.a(e, f) < 0) {
            float f2 = 12;
            b = byc0.b(f2, f2);
        } else {
            float f3 = 32;
            if (pco.a(e, f3) < 0) {
                float f4 = 16;
                b = byc0.b(f4, f4);
            } else {
                float f5 = 36;
                if (pco.a(e, f5) < 0) {
                    float f6 = 20;
                    b = byc0.b(f6, f6);
                } else if (pco.a(e, 48) < 0) {
                    b = byc0.b(f, f);
                } else if (pco.a(e, 64) < 0) {
                    float f7 = 28;
                    b = byc0.b(f7, f7);
                } else {
                    b = pco.a(e, (float) 72) < 0 ? byc0.b(f3, f3) : byc0.b(f5, f5);
                }
            }
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b;
    }

    public static float e(long j) {
        return ((pco) jw5.w(new pco(uco.c(j)), new pco(uco.b(j)))).b;
    }

    public static long f(boolean z, androidx.compose.runtime.a aVar) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(447447159, 54, -1, "com.vk.core.compose.component.defaults.VkPictureDefault.overlayIconTint (VkPictureDefault.kt:124)");
        }
        aVar.K(-1679997212);
        if (z) {
            aVar.K(499997347);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getIcon().c;
        } else {
            aVar.K(499998561);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getIcon().a;
        }
        aVar.j();
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
