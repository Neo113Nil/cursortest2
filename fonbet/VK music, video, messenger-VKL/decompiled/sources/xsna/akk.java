package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: CtaButtonContent.kt */
/* loaded from: classes18.dex */
public final class akk {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public akk(String str, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, lg90 lg90Var, boolean z, gzs<s3q0> gzsVar) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(buttonStyle);
        this.c = androidx.compose.runtime.k.b(buttonAppearance);
        this.d = androidx.compose.runtime.k.b(lg90Var);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.f = androidx.compose.runtime.k.b(gzsVar);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1761620942);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1761620942, i2, -1, "com.vk.ecomm.design.compose.tile.impl.ctabuttons.CtaButtonContent.Content (CtaButtonContent.kt:35)");
            }
            gzs gzsVar = (gzs) ((zak0) this.f).getValue();
            boolean booleanValue = ((Boolean) ((zak0) this.e).getValue()).booleanValue();
            String str = (String) ((zak0) this.a).getValue();
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = (ButtonStyle) ((zak0) this.b).getValue();
            ButtonAppearance buttonAppearance = (ButtonAppearance) ((zak0) this.c).getValue();
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.q, 5);
            lg90 lg90Var = (lg90) ((zak0) this.d).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, H, null, false, false, lg90Var, new l5g(ylu0Var.getIcon().c), null, str, null, null, null, null, booleanValue, null, null, null, aVar2, 1073741872, 0, 0, 4057568);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new dsg(this, q630Var, i, 3);
        }
    }
}
