package xsna;

import com.vk.core.compose.component.skeleton.SkeletonType;
import xsna.q630;

/* compiled from: GroupHeaderIconImpl.kt */
/* loaded from: classes17.dex */
public final class iku {
    public final wh50 a;

    public iku(float f) {
        this.a = cq.f(f);
    }

    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1653142640);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1653142640, i2, -1, "com.vk.core.compose.component.group.header.skeleton.left.GroupHeaderIconImpl.Content (GroupHeaderIconImpl.kt:22)");
            }
            akv0.a(SkeletonType.Circle, txj0.q(q630.a.a, ((pco) ((zak0) this.a).getValue()).b), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jkg(this, i, 6);
        }
    }
}
