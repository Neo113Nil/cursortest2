package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.t2x;

/* compiled from: AnimatedChevronIconImpl.kt */
/* loaded from: classes17.dex */
public final class mh2 extends t2x.a {
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    public mh2(boolean z) {
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.t2x
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1881414232);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1881414232, i2, -1, "com.vk.core.compose.component.input.AnimatedChevronIconImpl.Content (AnimatedChevronIconImpl.kt:26)");
            }
            float f = ((Boolean) ((zak0) this.b).getValue()).booleanValue() ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            s1v.k();
            on20 on20Var = on20.a;
            mtk0 b = hg2.b(f, jq2.d(300, 0, null, 6), "SelectChevronRotation", null, M, 3072, 20);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-141445858, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronDown24> (VkSdkIcons.kt:420)");
            }
            lg90 b2 = or.b(M, -450463739, R.drawable.vk_icon_chevron_down_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 b3 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.c).getValue());
            s1v.k();
            M.K(128114831);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(128114831, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeInputSelectDefaults.chevronSize (MilkshakeInputSelectDefaults.kt:33)");
            }
            float f2 = 24;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            q630 q = txj0.q(b3, f2);
            boolean J = M.J(b);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new lh2(b, 0);
                M.R(x);
            }
            q630 a = rdu.a(q, (izs) x);
            s1v.k();
            uqv.b(b2, null, a, on20Var.a(M), M, 56, 0);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gx(this, q630Var, i, 1);
        }
    }
}
