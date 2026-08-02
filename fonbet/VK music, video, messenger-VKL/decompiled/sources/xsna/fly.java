package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.i8s;

/* compiled from: LabelIconImpl.kt */
/* loaded from: classes17.dex */
public final class fly extends i8s.b {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public fly() {
        throw null;
    }

    public fly(long j, gzs gzsVar, lg90 lg90Var) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b("Help");
        this.c = androidx.compose.runtime.k.b(gzsVar);
        this.d = zy60.d(j);
        this.e = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.i8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(71297934);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(71297934, i2, -1, "com.vk.core.compose.component.form.LabelIconImpl.Content (LabelIconImpl.kt:30)");
            }
            wh50 wh50Var = this.c;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(-1971946574);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new cj4(23);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(-202158853);
            }
            M.j();
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            rdi.u();
            boolean z = true;
            float f = hn20.c;
            String str = (String) ((zak0) this.b).getValue();
            rdi.u();
            q630 b = com.vk.core.compose.component.semantics.b.b(s200.D(q630Var, hn20.h), (SemanticsConfiguration) ((zak0) this.e).getValue());
            long j = ((l5g) ((zak0) this.d).getValue()).a;
            if (((gzs) ((zak0) wh50Var).getValue()) == null) {
                z = false;
            }
            aVar2 = M;
            nzu0.c(gzsVar, lg90Var, str, b, f, j, false, null, z, null, null, aVar2, 64, 1728);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fdc(this, q630Var, i, 3);
        }
    }
}
