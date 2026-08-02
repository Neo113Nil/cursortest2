package xsna;

import com.vk.core.compose.component.defaults.TabMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkTabsDefault.kt */
/* loaded from: classes17.dex */
public final class npv0 {
    public static final bpn0 a = new bpn0(new vqf0(16));

    /* compiled from: VkTabsDefault.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TabMode.values().length];
            try {
                iArr[TabMode.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TabMode.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TabMode.Accent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static long a(TabMode tabMode, androidx.compose.runtime.a aVar, int i) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(792654504, i, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.selectedIconColor (VkTabsDefault.kt:167)");
        }
        aVar.K(240287933);
        int i2 = a.$EnumSwitchMapping$0[tabMode.ordinal()];
        if (i2 == 1) {
            j = vcl0.a(aVar, 1531773843, aVar).j;
            aVar.j();
        } else if (i2 == 2) {
            j = vcl0.a(aVar, 1531775923, aVar).j;
            aVar.j();
        } else {
            if (i2 != 3) {
                throw alb0.c(1531771877, aVar);
            }
            j = vcl0.a(aVar, 1531777912, aVar).b;
            aVar.j();
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }

    public static float b(TabMode tabMode) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1103730692, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabHeight (VkTabsDefault.kt:128)");
        }
        float f = a.$EnumSwitchMapping$0[tabMode.ordinal()] == 1 ? 48 : 32;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static float c(TabMode tabMode) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-934411693, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabIndicatorHorizontalPadding (VkTabsDefault.kt:75)");
        }
        float f = a.$EnumSwitchMapping$0[tabMode.ordinal()] == 1 ? kqu0.v : 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static float d(TabMode tabMode) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2070344897, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabIndicatorVerticalPadding (VkTabsDefault.kt:87)");
        }
        float f = a.$EnumSwitchMapping$0[tabMode.ordinal()] == 1 ? (float) 5.5d : 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static float e() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-316012631, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabMinWidth (VkTabsDefault.kt:120)");
        }
        float f = 48;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static float f(TabMode tabMode) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(561349416, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabRowHorizontalPadding (VkTabsDefault.kt:40)");
        }
        float f = a.$EnumSwitchMapping$0[tabMode.ordinal()] == 1 ? kqu0.b - kqu0.v : kqu0.t;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static float g(TabMode tabMode) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-122509610, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabRowVerticalPadding (VkTabsDefault.kt:59)");
        }
        float f = a.$EnumSwitchMapping$0[tabMode.ordinal()] == 1 ? 0 : kqu0.t;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static r5j0 h(TabMode tabMode) {
        r5j0 r5j0Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(241101361, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabShape (VkTabsDefault.kt:25)");
        }
        int i = a.$EnumSwitchMapping$0[tabMode.ordinal()];
        if (i != 1) {
            bpn0 bpn0Var = a;
            if (i == 2) {
                r5j0Var = (uog0) bpn0Var.getValue();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                r5j0Var = (uog0) bpn0Var.getValue();
            }
        } else {
            r5j0Var = androidx.compose.ui.graphics.e.a;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return r5j0Var;
    }

    public static float i(TabMode tabMode) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1337142698, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabSpacing (VkTabsDefault.kt:47)");
        }
        float f = a.$EnumSwitchMapping$0[tabMode.ordinal()] == 1 ? 0 : kqu0.s;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static float j() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1693679089, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabWrapperHorizontalPadding (VkTabsDefault.kt:66)");
        }
        float f = 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static float k() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1510329475, 6, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.tabWrapperVerticalPadding (VkTabsDefault.kt:70)");
        }
        float f = 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static long l(TabMode tabMode, androidx.compose.runtime.a aVar, int i) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(783229761, i, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.unselectedIconColor (VkTabsDefault.kt:158)");
        }
        aVar.K(-1359355796);
        int i2 = a.$EnumSwitchMapping$0[tabMode.ordinal()];
        if (i2 == 1) {
            j = vcl0.a(aVar, 1064530443, aVar).f;
            aVar.j();
        } else if (i2 == 2) {
            j = vcl0.a(aVar, 1064532491, aVar).f;
            aVar.j();
        } else {
            if (i2 != 3) {
                throw alb0.c(1064528470, aVar);
            }
            j = vcl0.a(aVar, 1064534443, aVar).f;
            aVar.j();
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
