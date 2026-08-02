package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.k;
import kotlin.Pair;
import xsna.yk8;

/* compiled from: VkTopBarDefaults.kt */
/* loaded from: classes17.dex */
public abstract class m7p0 {
    public static final float a = kqu0.n;
    public static final float b = 12;
    public static final y7z c;
    public static final float d;

    /* compiled from: VkTopBarDefaults.kt */
    public static final class a {
        public static float a() {
            return m7p0.a;
        }
    }

    static {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        long j = l5g.b;
        c = yk8.a.h(new Pair[]{new Pair(valueOf, new l5g(l5g.c(14, j, 0.4f))), new Pair(Float.valueOf(0.15f), new l5g(l5g.c(14, j, 0.38f))), new Pair(Float.valueOf(0.3f), new l5g(l5g.c(14, j, 0.32f))), new Pair(Float.valueOf(0.7f), new l5g(l5g.c(14, j, 0.08f))), new Pair(Float.valueOf(0.85f), new l5g(l5g.c(14, j, 0.02f))), new Pair(Float.valueOf(1.0f), new l5g(l5g.c(14, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
        d = 48;
    }

    public static long a(com.vk.core.compose.component.topbar.k kVar, androidx.compose.runtime.a aVar, int i) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1339357114, i, -1, "com.vk.core.compose.component.defaults.TopBarDefaults.titleColor (VkTopBarDefaults.kt:103)");
        }
        if (kVar instanceof k.b) {
            aVar.K(1368005873);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getText().m;
            aVar.j();
        } else {
            if (!(kVar instanceof k.a)) {
                throw alb0.c(1368004048, aVar);
            }
            aVar.K(1368007762);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getText().d;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
