package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.v5v;

/* compiled from: CreationOnBoardingTasksScreen.kt */
/* loaded from: classes5.dex */
public final class i6v implements Cell$Middle.d {
    public final boolean a;
    public final v5v b;

    public i6v(String str, boolean z) {
        this.a = z;
        bpn0 bpn0Var = v5v.c;
        this.b = v5v.a.a(str);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1288407276);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1288407276, i2, -1, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.HighlightedTitle.Content (CreationOnBoardingTasksScreen.kt:334)");
            }
            d8v0.a(this.b.b, q630Var, null, null, false, false, this.a, null, kai.c(-567835224, new a6v(0, this, size), M), M, ((i2 << 3) & 112) | 805306368, 444);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lys(i, 2, this, q630Var, size);
        }
    }
}
