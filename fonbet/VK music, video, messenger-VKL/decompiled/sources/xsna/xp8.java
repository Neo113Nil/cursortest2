package xsna;

import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: ButtonImpl.kt */
/* loaded from: classes17.dex */
public final class xp8 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public xp8(String str, gzs<s3q0> gzsVar, boolean z, float f, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.d = androidx.compose.runtime.k.b(Float.valueOf(f));
        this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-236727806);
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
                androidx.compose.runtime.b.f(-236727806, i2, -1, "com.vk.core.compose.component.topbar.ButtonImpl.Content (ButtonImpl.kt:39)");
            }
            M.K(-21185681);
            aVar2 = M;
            bhu0.e((gzs) ((zak0) this.b).getValue(), ButtonSize.Medium, ButtonStyle.Link, ButtonAppearance.Accent, o19.a(com.vk.core.compose.component.semantics.b.b(s200.F(kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.B(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 44, 1, q630Var), null, 3)), (SemanticsConfiguration) ((zak0) this.e).getValue()), ((Number) ((zak0) this.d).getValue()).floatValue()), null, false, false, null, null, null, (String) ((zak0) this.a).getValue(), null, null, null, null, ((Boolean) ((zak0) this.c).getValue()).booleanValue(), null, null, null, aVar2, X2.b.f, 0, 0, 4059104);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wp8(this, q630Var, i, 0);
        }
    }
}
