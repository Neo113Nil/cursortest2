package xsna;

import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: CaptionImpl.kt */
/* loaded from: classes17.dex */
public final class ljc implements f8s {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public ljc(us2 us2Var, FormField$Style formField$Style, izs<? super Integer, s3q0> izsVar, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(us2Var);
        this.b = androidx.compose.runtime.k.b(formField$Style);
        this.c = androidx.compose.runtime.k.b(izsVar);
        this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.f8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1400456408);
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
                androidx.compose.runtime.b.f(-1400456408, i2, -1, "com.vk.core.compose.component.form.ClickableCaptionImpl.Content (CaptionImpl.kt:50)");
            }
            us2 us2Var = (us2) ((zak0) this.a).getValue();
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue());
            rdi.u();
            hn20 hn20Var = hn20.a;
            long b2 = hn20Var.b((FormField$Style) ((zak0) this.b).getValue(), M);
            rdi.u();
            aVar2 = M;
            vku0.a(us2Var, b, b2, 0L, 0L, null, 0L, null, 0, false, 0, null, null, (izs) ((zak0) this.c).getValue(), null, hn20Var.c(M), aVar2, 0, 0, 786424);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new kjc(this, q630Var, i, 0);
        }
    }
}
