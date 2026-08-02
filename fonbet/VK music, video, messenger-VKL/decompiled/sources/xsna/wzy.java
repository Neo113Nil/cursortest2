package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import xsna.poa;
import xsna.q630;

/* compiled from: LeftMainBlockImpl.kt */
/* loaded from: classes17.dex */
public final class wzy implements poa.c {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    public wzy(float f, float f2) {
        this.a = cq.f(f);
        this.b = cq.f(f2);
    }

    @Override // xsna.poa
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-2127598705);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2127598705, i2, -1, "com.vk.core.compose.component.cell.skeleton.LeftMainBlockImpl.Content (LeftMainBlockImpl.kt:28)");
            }
            SkeletonType skeletonType = SkeletonType.Block;
            fvr.n();
            com.vk.core.compose.component.defaults.c.a.d(M);
            akv0.a(skeletonType, txj0.s(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, 1, q630.a.a), ((pco) ((zak0) this.a).getValue()).b, ((pco) ((zak0) this.b).getValue()).b), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u70(this, i, 7);
        }
    }
}
