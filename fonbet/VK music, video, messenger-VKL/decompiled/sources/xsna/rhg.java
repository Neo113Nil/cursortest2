package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.skeleton.SkeletonType;
import xsna.poa;
import xsna.q630;

/* compiled from: CommonAvatarImpl.kt */
/* loaded from: classes17.dex */
public final class rhg implements poa.c {
    public final wh50 a = androidx.compose.runtime.k.b(null);
    public final wh50 b;

    public rhg(float f) {
        this.b = cq.f(f);
    }

    @Override // xsna.poa
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1314133679);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1314133679, i2, -1, "com.vk.core.compose.component.cell.skeleton.CommonAvatarImpl.Content (CommonAvatarImpl.kt:27)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.a).getValue());
            fvr.n();
            com.vk.core.compose.component.defaults.c.a.d(M);
            akv0.a(SkeletonType.Circle, txj0.q(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, 1, b), ((pco) ((zak0) this.b).getValue()).b), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new phg(this, i, 0);
        }
    }
}
