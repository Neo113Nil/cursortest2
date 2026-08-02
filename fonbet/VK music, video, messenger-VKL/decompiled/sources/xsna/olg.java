package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.skeleton.SkeletonType;
import xsna.poa;
import xsna.q630;

/* compiled from: CommonPictureImpl.kt */
/* loaded from: classes17.dex */
public final class olg implements poa.c {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public olg(float f, PictureRadius pictureRadius) {
        float f2 = kqu0.s;
        this.a = androidx.compose.runtime.k.b(null);
        this.b = cq.f(f);
        this.c = cq.f(f2);
        this.d = androidx.compose.runtime.k.b(pictureRadius);
    }

    @Override // xsna.poa
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-475883953);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-475883953, i2, -1, "com.vk.core.compose.component.cell.skeleton.CommonPictureImpl.Content (CommonPictureImpl.kt:34)");
            }
            akv0.a(SkeletonType.Block, txj0.q(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((pco) ((zak0) this.c).getValue()).b, 1, com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.a).getValue())), ((pco) ((zak0) this.b).getValue()).b), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.r(this, i, 2);
        }
    }
}
