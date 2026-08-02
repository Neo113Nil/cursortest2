package xsna;

import com.vk.core.compose.component.form.FormField$Style;

/* compiled from: MilkshakeFormFieldDefaults.kt */
/* loaded from: classes17.dex */
public final class hn20 {
    public static final hn20 a = new hn20();
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;

    /* compiled from: MilkshakeFormFieldDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormField$Style.values().length];
            try {
                iArr[FormField$Style.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormField$Style.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormField$Style.Valid.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f2 = 28;
        b = f2;
        float f3 = 16;
        c = f3;
        float f4 = kqu0.a;
        d = kqu0.q;
        e = f3;
        f = 20;
        g = f2;
        h = 0;
    }

    public final float a(int i, androidx.compose.runtime.a aVar) {
        aVar.K(524400006);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(524400006, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeFormFieldDefaults.afterLabelSpace (MilkshakeFormFieldDefaults.kt:22)");
        }
        float f2 = kqu0.t;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f2;
    }

    public final long b(FormField$Style formField$Style, androidx.compose.runtime.a aVar) {
        long j;
        aVar.K(1504282601);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1504282601, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeFormFieldDefaults.captionTextColor (MilkshakeFormFieldDefaults.kt:31)");
        }
        int i = a.$EnumSwitchMapping$0[formField$Style.ordinal()];
        if (i == 1) {
            aVar.K(-1788394410);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getText().p;
            aVar.j();
        } else if (i == 2) {
            aVar.K(-1788392267);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getText().k;
            aVar.j();
        } else {
            if (i != 3) {
                throw alb0.c(-1788396442, aVar);
            }
            aVar.K(-1788390155);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var3.getText().l;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    public final frv0 c(androidx.compose.runtime.a aVar) {
        aVar.K(1550882472);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1550882472, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeFormFieldDefaults.captionTextStyle (MilkshakeFormFieldDefaults.kt:44)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
        }
        wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        frv0 frv0Var = wuv0Var.i0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return frv0Var;
    }
}
