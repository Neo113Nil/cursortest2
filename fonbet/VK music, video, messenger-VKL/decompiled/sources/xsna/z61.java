package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.e8s;

/* compiled from: AfterIconImpl.kt */
/* loaded from: classes17.dex */
public final class z61 extends e8s.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public z61() {
        throw null;
    }

    public z61(lg90 lg90Var, String str, gzs gzsVar, long j) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(gzsVar);
        this.d = zy60.d(j);
        this.e = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.e8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1659522494);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1659522494, i2, -1, "com.vk.core.compose.component.form.AfterIconImpl.Content (AfterIconImpl.kt:31)");
            }
            wh50 wh50Var = this.c;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(-533812350);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new com.vk.movika.sdk.base.logic.interactor.g(1);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(1368253227);
            }
            M.j();
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            rdi.u();
            boolean z = false;
            float f = hn20.g;
            String str = (String) ((zak0) this.b).getValue();
            q630 E = s200.E(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.e).getValue()), 8, 12);
            long j = ((l5g) ((zak0) this.d).getValue()).a;
            if (((gzs) ((zak0) wh50Var).getValue()) != null) {
                z = true;
            }
            aVar2 = M;
            nzu0.c(gzsVar, lg90Var, str, E, f, j, false, null, z, null, null, aVar2, 64, 1728);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new y61(this, q630Var, i, 0);
        }
    }
}
