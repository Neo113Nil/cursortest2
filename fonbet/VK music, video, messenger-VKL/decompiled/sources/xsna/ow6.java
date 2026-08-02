package xsna;

import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import xsna.q630;

/* compiled from: BeforeIconImpl.kt */
/* loaded from: classes17.dex */
public final class ow6 implements jfj {
    public final wh50 a;
    public final wh50 b;

    public ow6(lg90 lg90Var, l5g l5gVar) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(l5gVar);
    }

    @Override // xsna.jfj
    public final void a(int i, androidx.compose.runtime.a aVar, ContentBadgeAppearance contentBadgeAppearance, ContentBadgeMode contentBadgeMode, ContentBadgeSize contentBadgeSize, boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(317457704);
        if ((i & 48) == 0) {
            i2 = (M.l(z) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(contentBadgeSize.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(contentBadgeAppearance) : M.y(contentBadgeAppearance) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.o(contentBadgeMode.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74897 & i2) != 74896)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(317457704, i2, -1, "com.vk.core.compose.component.contentbadge.BeforeIconImpl.Content (BeforeIconImpl.kt:33)");
            }
            int i3 = i2 >> 9;
            long a = com.vk.core.compose.component.defaults.e.a(contentBadgeAppearance, contentBadgeMode, M, (i3 & 112) | (i3 & 14) | 384);
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            q630 q = txj0.q(q630.a.a, com.vk.core.compose.component.defaults.e.b(contentBadgeSize, !z, M, ((i2 >> 6) & 14) | 384));
            l5g l5gVar = (l5g) ((zak0) this.b).getValue();
            if (l5gVar != null) {
                a = l5gVar.a;
            }
            pzu0.b(lg90Var, null, q, a, M, 56, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mw6(this, z, contentBadgeSize, contentBadgeAppearance, contentBadgeMode, i);
        }
    }
}
