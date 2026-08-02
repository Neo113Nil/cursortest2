package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.c16;
import xsna.q630;
import xsna.wkj;

/* compiled from: FixedImageImpl.kt */
/* loaded from: classes17.dex */
public final class zmr extends c16.b {
    public final wh50 a;
    public final wh50 b = androidx.compose.runtime.k.b(null);
    public final wh50 c = androidx.compose.runtime.k.b(null);

    public zmr(ex5 ex5Var) {
        this.a = androidx.compose.runtime.k.b(ex5Var);
    }

    @Override // xsna.c16
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(270438804);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(270438804, i2, -1, "com.vk.core.compose.component.banner.FixedImageImpl.Content (FixedImageImpl.kt:28)");
            }
            vjw.a((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.b).getValue(), com.vk.core.compose.component.semantics.b.b(txj0.c(txj0.v(q630.a.a, 150), 1.0f), (SemanticsConfiguration) ((zak0) this.c).getValue()), null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24584, 104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vg3(this, i, 3);
        }
    }
}
