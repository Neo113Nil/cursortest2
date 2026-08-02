package xsna;

import com.vk.core.compose.component.input.InputSelect$State;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MilkshakeInputSelectDefaults.kt */
/* loaded from: classes17.dex */
public final class on20 {
    public static final on20 a = new on20();
    public static final float b = (float) 0.5d;
    public static final float c = kqu0.e;
    public static final float d = 44;
    public static final float e = 184;
    public static final u890 f;
    public static final u890 g;

    /* compiled from: MilkshakeInputSelectDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputSelect$State.values().length];
            try {
                iArr[InputSelect$State.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputSelect$State.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputSelect$State.Hover.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputSelect$State.Valid.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InputSelect$State.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InputSelect$State.NoBorder.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f2 = kqu0.v;
        float f3 = kqu0.t;
        f = new u890(f2, f3, f2, f3);
        float f4 = kqu0.u;
        g = new u890(f2, f4, f2, f4);
    }

    public final long a(androidx.compose.runtime.a aVar) {
        aVar.K(1572695934);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1572695934, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeInputSelectDefaults.chevronColor (MilkshakeInputSelectDefaults.kt:30)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().l;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    public final long b(androidx.compose.runtime.a aVar) {
        aVar.K(674189799);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(674189799, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeInputSelectDefaults.cursorColor (MilkshakeInputSelectDefaults.kt:70)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    public final long c(InputSelect$State inputSelect$State, boolean z, androidx.compose.runtime.a aVar) {
        long j;
        aVar.K(-1866964142);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1866964142, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeInputSelectDefaults.inputBackgroundColor (MilkshakeInputSelectDefaults.kt:79)");
        }
        if (inputSelect$State == InputSelect$State.Error) {
            aVar.K(1143795176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getBackground().u;
            aVar.j();
        } else {
            aVar.K(1143797217);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.r().a;
            aVar.j();
        }
        long c2 = l5g.c(14, j, l5g.e(j) * (z ? 1.0f : 0.64f));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return c2;
    }

    public final long d(InputSelect$State inputSelect$State, boolean z, boolean z2, androidx.compose.runtime.a aVar) {
        long j;
        aVar.K(-542534156);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-542534156, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeInputSelectDefaults.inputBorderColor (MilkshakeInputSelectDefaults.kt:41)");
        }
        if (z) {
            switch (a.$EnumSwitchMapping$0[inputSelect$State.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    inputSelect$State = InputSelect$State.Active;
                    break;
                case 5:
                case 6:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        switch (a.$EnumSwitchMapping$0[inputSelect$State.ordinal()]) {
            case 1:
                aVar.K(-1684251612);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.r().b;
                aVar.j();
                break;
            case 2:
                aVar.K(-1684262016);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.m().a;
                aVar.j();
                break;
            case 3:
                aVar.K(-1684253787);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getIcon().o;
                aVar.j();
                break;
            case 4:
                aVar.K(-1684257982);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var4.m().f;
                aVar.j();
                break;
            case 5:
                aVar.K(-1684260030);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var5.m().e;
                aVar.j();
                break;
            case 6:
                aVar.K(-1684255681);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var6 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var6.d().a;
                aVar.j();
                break;
            default:
                throw alb0.c(-1684263909, aVar);
        }
        long c2 = l5g.c(14, j, l5g.e(j) * (z2 ? 1.0f : 0.64f));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return c2;
    }

    public final long e(androidx.compose.runtime.a aVar) {
        aVar.K(-114602275);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-114602275, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeInputSelectDefaults.leftIconColor (MilkshakeInputSelectDefaults.kt:73)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    public final frv0 f(androidx.compose.runtime.a aVar) {
        aVar.K(939462162);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(939462162, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeInputSelectDefaults.textStyle (MilkshakeInputSelectDefaults.kt:67)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
        }
        wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        frv0 frv0Var = wuv0Var.X;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return frv0Var;
    }
}
