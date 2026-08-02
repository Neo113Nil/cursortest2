package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkCheckboxDefaults.kt */
/* loaded from: classes17.dex */
public abstract class v1c {
    public final u890 a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public v1c() {
        float f = kqu0.b;
        float f2 = kqu0.u;
        this.a = new u890(f, f2, f, f2);
        this.b = kqu0.q;
        this.c = 2;
        this.d = 60;
        this.e = 44;
    }

    public static long d(boolean z, androidx.compose.runtime.a aVar) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(290268131, 6, -1, "com.vk.core.compose.component.defaults.CheckboxDefaults.itemTextColor (VkCheckboxDefaults.kt:44)");
        }
        if (z) {
            aVar.K(-225196272);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getText().p;
        } else {
            aVar.K(-225195026);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getText().m;
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }

    public static frv0 e(boolean z, androidx.compose.runtime.a aVar) {
        frv0 frv0Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-13100567, 6, -1, "com.vk.core.compose.component.defaults.CheckboxDefaults.itemTextStyle (VkCheckboxDefaults.kt:40)");
        }
        if (z) {
            aVar.K(295261239);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var = wuv0Var.m0;
        } else {
            aVar.K(295262483);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var2 = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var = wuv0Var2.X;
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return frv0Var;
    }

    public final hcl a(long j, long j2, androidx.compose.runtime.a aVar, int i) {
        long j3 = (i & 1) != 0 ? b(0, aVar).a : j;
        long j4 = (i & 2) != 0 ? b(0, aVar).b : j2;
        long j5 = b(0, aVar).c;
        long j6 = b(0, aVar).d;
        long j7 = b(0, aVar).e;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1350012491, 0, -1, "com.vk.core.compose.component.defaults.CheckboxDefaults.colors (VkCheckboxDefaults.kt:59)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(469524104, 0, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:225)");
        }
        boolean p = aVar.p(j3) | aVar.p(j4) | aVar.p(j5) | aVar.p(j6) | aVar.p(j7);
        Object x = aVar.x();
        if (p || x == a.C0011a.a) {
            l5g.c(14, j5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            l5g.c(14, j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            l5g.c(14, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            hcl hclVar = new hcl(j3, j4, j6, j7);
            aVar.R(hclVar);
            x = hclVar;
        }
        hcl hclVar2 = (hcl) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return hclVar2;
    }

    public abstract zju0 b(int i, androidx.compose.runtime.a aVar);

    public final wh50 c(boolean z, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(973665538, 0, -1, "com.vk.core.compose.component.defaults.CheckboxDefaults.itemHeight (VkCheckboxDefaults.kt:50)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(740838557, 0, -1, "com.vk.core.compose.component.defaults.CheckboxDefaults.defaultItemHeight (VkCheckboxDefaults.kt:31)");
        }
        wh50 c = androidx.compose.runtime.k.c(new pco(z ? this.d : this.e), aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return c;
    }
}
