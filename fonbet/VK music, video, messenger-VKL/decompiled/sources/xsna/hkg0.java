package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.t2x;

/* compiled from: RightIconImpl.kt */
/* loaded from: classes17.dex */
public final class hkg0 extends t2x.b {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public hkg0() {
        throw null;
    }

    public hkg0(long j, SemanticsConfiguration semanticsConfiguration, String str, gzs gzsVar, lg90 lg90Var) {
        this.b = androidx.compose.runtime.k.b(lg90Var);
        this.c = androidx.compose.runtime.k.b(str);
        this.d = androidx.compose.runtime.k.b(gzsVar);
        this.e = zy60.d(j);
        this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.t2x
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-880819816);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-880819816, i2, -1, "com.vk.core.compose.component.input.RightIconImpl.Content (RightIconImpl.kt:33)");
            }
            wh50 wh50Var = this.d;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(1747153256);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new ap80(6);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(-359282555);
            }
            M.j();
            lg90 lg90Var = (lg90) ((zak0) this.b).getValue();
            String str = (String) ((zak0) this.c).getValue();
            float f = gzu0.a;
            aVar2 = M;
            nzu0.c(gzsVar, lg90Var, str, txj0.q(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.f).getValue()), f), f, ((l5g) ((zak0) this.e).getValue()).a, false, null, ((Boolean) ((zak0) this.a).getValue()).booleanValue() && ((gzs) ((zak0) wh50Var).getValue()) != null, null, null, aVar2, 24640, 1728);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new p9(this, q630Var, i, 8);
        }
    }
}
