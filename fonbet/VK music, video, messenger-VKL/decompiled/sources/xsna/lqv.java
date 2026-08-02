package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: IconImpl.kt */
/* loaded from: classes17.dex */
public final class lqv implements snj, unj {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);
    public final wh50 e = androidx.compose.runtime.k.b(null);

    public lqv(lg90 lg90Var, long j, long j2) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = androidx.compose.runtime.k.b(new uco(j2));
    }

    @Override // xsna.snj, xsna.unj
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-208297318);
        q630.a aVar2 = q630.a.a;
        int i2 = (M.J(aVar2) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-208297318, i2, -1, "com.vk.core.compose.component.context.menu.IconImpl.Content (IconImpl.kt:35)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.e).getValue());
            wh50 wh50Var = this.c;
            M.K(uco.a(((uco) ((zak0) wh50Var).getValue()).a, 9205357640488583168L) ? 1689747872 : 842577717);
            M.j();
            if (!uco.a(((uco) ((zak0) wh50Var).getValue()).a, 9205357640488583168L)) {
                b = b.g(txj0.r(((uco) ((zak0) wh50Var).getValue()).a, aVar2));
            }
            vqv.a((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.d).getValue(), b, ((l5g) ((zak0) this.b).getValue()).a, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b47(this, i, 4);
        }
    }
}
