package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: CtaCell.kt */
/* loaded from: classes17.dex */
public final class hna implements Cell$Left.Main {
    public final String a;
    public final com.vk.core.compose.component.cell.content.x b;
    public final gzs<s3q0> c;
    public final gzs<s3q0> d;

    public hna(String str, com.vk.core.compose.component.cell.content.x xVar, gzs gzsVar, gzs gzsVar2) {
        this.a = str;
        this.b = xVar;
        this.c = gzsVar;
        this.d = gzsVar2;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(566285092);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(566285092, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.cta.CellLeftIconWithTooltip.Content (CtaCell.kt:190)");
            }
            if (this.a == null) {
                M.K(-432265481);
                this.b.a(spg0Var, q630Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new bw9(this, spg0Var, q630Var, i, 1);
                    return;
                }
                return;
            }
            M.K(-439744386);
            M.j();
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new wl0(this, 11);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = i3 == 256;
            Object x2 = M.x();
            if (z2 || x2 == obj) {
                x2 = new op1(this, 15);
                M.R(x2);
            }
            buv0 z3 = rdi.z(true, izsVar, (izs) x2, M, 6, 0);
            VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.TopRight;
            boolean y = (i3 == 256) | M.y(z3);
            Object x3 = M.x();
            if (y || x3 == obj) {
                x3 = new fk(2, this, z3);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            boolean y2 = M.y(z3) | (i3 == 256);
            Object x4 = M.x();
            if (y2 || x4 == obj) {
                x4 = new com.vk.catalog2.common.ui.holders.a(5, this, z3);
                M.R(x4);
            }
            o9v0.a(this.a, z3, null, null, null, null, vkTooltip$BalloonPosition, null, gzsVar, (gzs) x4, null, null, null, false, null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, kai.c(-1680319113, new fx(this, spg0Var, q630Var, 1), M), M, 1572864, 805502976, 490684);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new pha(this, spg0Var, q630Var, i, 1);
        }
    }
}
