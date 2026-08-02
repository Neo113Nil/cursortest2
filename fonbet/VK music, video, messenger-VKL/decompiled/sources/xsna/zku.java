package xsna;

import xsna.q630;

/* compiled from: GroupHeaderTitleImpl.kt */
/* loaded from: classes17.dex */
public final class zku implements wku {
    public final wh50 a;

    public zku(float f) {
        this.a = cq.f(f);
    }

    @Override // xsna.wku
    public final void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1562613889);
        int i2 = (M.J(bVar) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1562613889, i2, -1, "com.vk.core.compose.component.group.header.skeleton.middle.GroupHeaderTitleImpl.Content (GroupHeaderTitleImpl.kt:21)");
            }
            erv0.a(1, jgz.s().b(bVar, M, (i2 >> 3) & 14), q630.a.a, ((pco) ((zak0) this.a).getValue()).b, M, 390, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yku(this, bVar, i, 0);
        }
    }
}
