package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.efu;
import xsna.q630;
import xsna.tok0;

/* compiled from: SimpleGrid.kt */
/* loaded from: classes18.dex */
public final class qqj0 {
    public static final void a(q630 q630Var, u890 u890Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1560803414);
        int i2 = i | 6 | (M.J(u890Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1560803414, i2, -1, "com.vk.design.demo.presentation.components.SimpleGrid (SimpleGrid.kt:20)");
            }
            q630.a aVar2 = q630.a.a;
            uqy.b(new efu.a(160), txj0.d(aVar2, 1.0f), null, u890Var, null, null, null, false, null, izsVar, M, (i2 << 6) & 7168, (i2 >> 6) & 14, 1012);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new be0(i, 5, q630Var2, u890Var, izsVar);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(754343165);
        int i2 = i | 6 | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(754343165, i2, -1, "com.vk.design.demo.presentation.components.SimpleStaggeredGrid (SimpleGrid.kt:31)");
            }
            q630Var2 = q630.a.a;
            float f = 8;
            qwy.a(new tok0.a(160), txj0.d(q630Var2, 1.0f), null, new u890(f, f, f, f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, izsVar, M, 3072, (i2 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rig(q630Var2, izsVar, i, 8);
        }
    }
}
