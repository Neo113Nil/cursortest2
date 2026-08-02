package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.g8s;

/* compiled from: CheckBoxImpl.kt */
/* loaded from: classes17.dex */
public final class e0c extends g8s.d.a {
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 c = androidx.compose.runtime.k.b("Title");
    public final wh50 g = androidx.compose.runtime.k.b(Boolean.TRUE);
    public final wh50 h = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final wh50 i = androidx.compose.runtime.k.b(null);

    public e0c(String str, gzs gzsVar, boolean z) {
        this.d = androidx.compose.runtime.k.b(gzsVar);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.f = androidx.compose.runtime.k.b(str);
    }

    @Override // xsna.g8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1980706884);
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
                androidx.compose.runtime.b.f(-1980706884, i2, -1, "com.vk.core.compose.component.form.CheckBoxImpl.Content (CheckBoxImpl.kt:32)");
            }
            eku0.d((String) ((zak0) this.c).getValue(), (gzs) ((zak0) this.d).getValue(), txj0.f(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.i).getValue()), 1.0f), ((Boolean) ((zak0) this.e).getValue()).booleanValue(), (String) ((zak0) this.f).getValue(), ((Boolean) ((zak0) this.g).getValue()).booleanValue(), ((Boolean) ((zak0) this.h).getValue()).booleanValue(), M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ema(this, q630Var, i, 1);
        }
    }
}
