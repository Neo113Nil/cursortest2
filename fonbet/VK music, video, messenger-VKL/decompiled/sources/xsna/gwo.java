package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: EasyPromoteRightContent.kt */
/* loaded from: classes17.dex */
public final class gwo {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public gwo() {
        throw null;
    }

    public gwo(String str, gzs gzsVar, izs izsVar, boolean z) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(izsVar);
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-590195389);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-590195389, i3, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.promote.EasyPromoteRightContent.Content (EasyPromoteRightContent.kt:26)");
            }
            String str = (String) ((zak0) this.a).getValue();
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new n1d(this, 16);
                M.R(x);
            }
            buv0 z2 = rdi.z(true, (izs) x, null, M, 6, 4);
            if (str != null) {
                M.K(1085558661);
                wh50 wh50Var = this.b;
                o9v0.a(str, z2, q630.a.a, null, VkTooltip$MarkerSize.Size72, null, null, null, (gzs) ((zak0) wh50Var).getValue(), (gzs) ((zak0) wh50Var).getValue(), null, null, null, false, null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, kai.c(-34515349, new qm7(2, this, q630Var), M), M, 24960, 805502976, 490728);
                M = M;
                M.j();
            } else {
                M.K(1085990615);
                b(q630Var, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yc2(this, q630Var, i, 1);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1350209510);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1350209510, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.promote.EasyPromoteRightContent.Switch (EasyPromoteRightContent.kt:50)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.d).getValue()).booleanValue();
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new wik(this, 3);
                M.R(x);
            }
            q630Var2 = q630Var;
            zov0.a(booleanValue, (izs) x, q630Var2, true, null, M, ((i2 << 6) & 896) | 3072, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fjj(this, q630Var2, i, 1);
        }
    }
}
