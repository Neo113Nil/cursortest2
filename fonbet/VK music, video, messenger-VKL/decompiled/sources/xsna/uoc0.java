package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PostingStep2LeftProgressContent.kt */
/* loaded from: classes4.dex */
public final class uoc0 implements Cell$Left {
    public final wh50 a;
    public final kg50 b;

    public uoc0(float f, float f2) {
        this.a = cq.f(f);
        this.b = androidx.compose.runtime.d.a(f2);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1881206326);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1881206326, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.step2.PostingStep2LeftProgressContent.Content (PostingStep2LeftProgressContent.kt:31)");
            }
            q630 H = s200.H(txj0.q(q630.a.a, ((pco) ((zak0) this.a).getValue()).b), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            vak0 vak0Var = (vak0) this.b;
            if (Math.abs(vak0Var.getFloatValue()) <= Float.MAX_VALUE) {
                M.K(-1324562050);
                float floatValue = vak0Var.getFloatValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                x2e0.a(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 58, ylu0Var.getIcon().l, 0L, M, null);
                M.j();
            } else {
                M.K(-1324378809);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                x2e0.b(null, ylu0Var2.getIcon().l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 0, M, 0, 29);
                M = M;
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mhp(this, spg0Var, q630Var, i);
        }
    }
}
