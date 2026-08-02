package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ExtraSubtitleExpandableText.kt */
/* loaded from: classes18.dex */
public final class kgq implements Cell$Middle.b {
    public final wh50 a = androidx.compose.runtime.k.b("");
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public kgq(us2 us2Var, boolean z, com.vk.core.compose.component.semantics.a aVar) {
        wh50 b = androidx.compose.runtime.k.b(null);
        this.b = b;
        this.c = androidx.compose.runtime.k.b(2);
        this.d = androidx.compose.runtime.k.b(aVar);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        ((zak0) b).setValue(us2Var);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-724758276);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-724758276, i2, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.ExtraSubtitleExpandableText.Content (ExtraSubtitleExpandableText.kt:45)");
            }
            us2 us2Var = (us2) ((zak0) this.b).getValue();
            if (us2Var == null) {
                us2Var = ws2.e((String) ((zak0) this.a).getValue());
            }
            us2 us2Var2 = us2Var;
            boolean booleanValue = ((Boolean) ((zak0) this.e).getValue()).booleanValue();
            wh50 wh50Var = this.d;
            if (booleanValue) {
                M.K(-472973550);
                psu0.c(us2Var2, com.vk.core.compose.component.semantics.b.b(hr80.m(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a), (SemanticsConfiguration) ((zak0) wh50Var).getValue()), wlb0.h(M).getText().a, null, wlb0.l(M).m0, wlb0.h(M).getText().p, ((Number) ((zak0) this.c).getValue()).intValue(), null, null, wlb0.h(M).getText().a, null, true, M, 0, 48, 1416);
                aVar2 = M;
                aVar2.j();
            } else {
                aVar2 = M;
                aVar2.K(-472323108);
                q630 b = com.vk.core.compose.component.semantics.b.b(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), (SemanticsConfiguration) ((zak0) wh50Var).getValue());
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.m0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.d(us2Var2, b, ylu0Var.getText().p, 0, null, 0, false, 0, null, null, frv0Var, aVar2, 0, 0, 8184);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new hj(i, 4, this, q630Var, size);
        }
    }
}
