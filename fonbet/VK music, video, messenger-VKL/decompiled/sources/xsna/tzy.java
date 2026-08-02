package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: LeftIconImpl.kt */
/* loaded from: classes17.dex */
public final class tzy implements r2x {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    public tzy(long j, String str, lg90 lg90Var) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(str);
        this.c = zy60.d(j);
    }

    @Override // xsna.r2x
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-325086624);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-325086624, i2, -1, "com.vk.core.compose.component.input.LeftIconImpl.Content (LeftIconImpl.kt:30)");
            }
            uqv.b((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.b).getValue(), txj0.q(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue()), gzu0.a), ((l5g) ((zak0) this.c).getValue()).a, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uqc(this, q630Var, i, 5);
        }
    }
}
