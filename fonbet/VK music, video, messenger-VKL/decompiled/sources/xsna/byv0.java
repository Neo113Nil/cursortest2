package xsna;

import com.vk.core.compose.component.defaults.UserStackSize;
import kotlin.NoWhenBranchMatchedException;
import xsna.xcc;

/* compiled from: VkUserStackDefaults.kt */
/* loaded from: classes17.dex */
public final class byv0 {
    public static final float a = 16;
    public static final float b = 24;
    public static final float c = 32;
    public static final float d = (float) 0.5d;

    /* compiled from: VkUserStackDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserStackSize.values().length];
            try {
                iArr[UserStackSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserStackSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserStackSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static float a(UserStackSize userStackSize, int i) {
        double d2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(719410966, i, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.border (VkUserStackDefaults.kt:53)");
        }
        int i2 = a.$EnumSwitchMapping$0[userStackSize.ordinal()];
        if (i2 == 1) {
            d2 = 1.5d;
        } else if (i2 == 2) {
            d2 = 1.8d;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d2 = 2.2d;
        }
        float f = (float) d2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static frv0 b(UserStackSize userStackSize, androidx.compose.runtime.a aVar, int i) {
        frv0 frv0Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1066857865, i, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.counterTextStyle (VkUserStackDefaults.kt:88)");
        }
        aVar.K(4848562);
        int i2 = a.$EnumSwitchMapping$0[userStackSize.ordinal()];
        if (i2 == 1) {
            aVar.K(-1246767491);
            frv0Var = wlb0.l(aVar).S0;
            aVar.j();
        } else if (i2 == 2) {
            aVar.K(-1246765387);
            frv0Var = wlb0.l(aVar).H0;
            aVar.j();
        } else {
            if (i2 != 3) {
                throw alb0.c(-1246769160, aVar);
            }
            aVar.K(-1246763563);
            frv0Var = wlb0.l(aVar).n0;
            aVar.j();
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return frv0Var;
    }

    public static xcc.a.g c() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-544564134, 6, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.defaultPosition (VkUserStackDefaults.kt:64)");
        }
        xcc.a.g gVar = xcc.a.g.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return gVar;
    }

    public static float d(UserStackSize userStackSize, int i) {
        float f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-544176195, i, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.offset (VkUserStackDefaults.kt:41)");
        }
        int i2 = a.$EnumSwitchMapping$0[userStackSize.ordinal()];
        if (i2 == 1 || i2 == 2) {
            f = 2;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = 3;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static r5j0 e(int i, int i2, float f, float f2, float f3, xcc.a aVar, androidx.compose.runtime.a aVar2, int i3) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-141608759, i3, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.shape (VkUserStackDefaults.kt:74)");
        }
        r5j0 e = f870.A().e(0, aVar2);
        if ((i != 0 || !(aVar instanceof xcc.a.g)) && ((i != 0 || !(aVar instanceof xcc.a.b)) && ((i != 0 || !(aVar instanceof xcc.a.c)) && ((i2 != i || !(aVar instanceof xcc.a.e)) && ((i2 != i || !(aVar instanceof xcc.a.h)) && (i2 != i || !(aVar instanceof xcc.a.i))))))) {
            e = new xcc(f, f2, aVar, e);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return e;
    }

    public static float f(UserStackSize userStackSize, int i) {
        float f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1892063445, i, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.size (VkUserStackDefaults.kt:29)");
        }
        int i2 = a.$EnumSwitchMapping$0[userStackSize.ordinal()];
        if (i2 == 1) {
            f = a;
        } else if (i2 == 2) {
            f = b;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = c;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }
}
