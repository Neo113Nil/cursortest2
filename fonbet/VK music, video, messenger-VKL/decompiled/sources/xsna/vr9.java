package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: CaptionImpl.kt */
/* loaded from: classes17.dex */
public final class vr9 implements f8s {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public vr9(String str, FormField$Style formField$Style, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(formField$Style);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.f8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-561851044);
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
                androidx.compose.runtime.b.f(-561851044, i2, -1, "com.vk.core.compose.component.form.CaptionImpl.Content (CaptionImpl.kt:26)");
            }
            String str = (String) ((zak0) this.a).getValue();
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.c).getValue());
            rdi.u();
            hn20 hn20Var = hn20.a;
            q630 b2 = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hn20.e, 1, b);
            rdi.u();
            long b3 = hn20Var.b((FormField$Style) ((zak0) this.b).getValue(), M);
            rdi.u();
            aVar2 = M;
            yqv0.c(str, b2, b3, null, null, 0, 0, null, 0, false, 0, 0, null, hn20Var.c(M), aVar2, 0, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new zf0(this, q630Var, i, 1);
        }
    }
}
