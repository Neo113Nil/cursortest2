package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.skeleton.SkeletonType;
import xsna.poa;
import xsna.q630;

/* compiled from: CommonIconImpl.kt */
/* loaded from: classes17.dex */
public final class nkg implements poa.b, poa.c {
    public final wh50 a;
    public final wh50 b = androidx.compose.runtime.k.b(null);

    public nkg(float f) {
        this.a = cq.f(f);
    }

    @Override // xsna.poa.b, xsna.poa
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(12617809);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(12617809, i2, -1, "com.vk.core.compose.component.cell.skeleton.CommonIconImpl.Content (CommonIconImpl.kt:27)");
            }
            akv0.a(SkeletonType.Circle, txj0.q(com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.b).getValue()), ((pco) ((zak0) this.a).getValue()).b), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jkg(this, i, 0);
        }
    }
}
