package xsna;

import com.vk.core.compose.component.cell.content.Cell$Left;
import xsna.q630;

/* compiled from: PostingStep2LeftImageContent.kt */
/* loaded from: classes4.dex */
public final class soc0 implements Cell$Left {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public soc0(phw phwVar, float f, float f2) {
        this.a = androidx.compose.runtime.k.b(phwVar);
        this.b = cq.f(f);
        this.c = cq.f(f2);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(566659584);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(566659584, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.step2.PostingStep2LeftImageContent.Content (PostingStep2LeftImageContent.kt:42)");
            }
            efj efjVar = (efj) ((zak0) this.a).getValue();
            wh50 wh50Var = this.b;
            float f = ((pco) ((zak0) wh50Var).getValue()).b;
            long b = byc0.b(f, f);
            q630 d = rte0.d(txj0.q(q630.a.a, ((pco) ((zak0) wh50Var).getValue()).b), vog0.b(((pco) ((zak0) this.c).getValue()).b));
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            efjVar.a(0, b, M, ahn.E(r18.a(f2, ylu0Var.getImage().a, d, androidx.compose.ui.graphics.e.a), "MusicPickerPreviewCellImage"));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mhf(i, 2, this, spg0Var, q630Var);
        }
    }
}
