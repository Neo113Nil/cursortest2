package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: TopIconImpl.kt */
/* loaded from: classes17.dex */
public final class t8p0 implements bsa0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public t8p0(lg90 lg90Var, long j, long j2, String str, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = androidx.compose.runtime.k.b(new uco(j2));
        this.d = androidx.compose.runtime.k.b(str);
        this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.bsa0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-1549660553);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1549660553, i, -1, "com.vk.core.compose.component.placeholder.TopIconImpl.Content (TopIconImpl.kt:36)");
        }
        aVar.K(666148089);
        b(q630.a.a, aVar, ((i >> 3) & 112) | (i & 14));
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1319949746);
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
                androidx.compose.runtime.b.f(1319949746, i2, -1, "com.vk.core.compose.component.placeholder.TopIconImpl.MilkshakeContent (TopIconImpl.kt:45)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.e).getValue());
            wh50 wh50Var = this.c;
            if (!uco.a(((uco) ((zak0) wh50Var).getValue()).a, 9205357640488583168L)) {
                b = b.g(txj0.r(((uco) ((zak0) wh50Var).getValue()).a, q630.a.a));
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
            s.d = new a8d(this, q630Var, i, 4);
        }
    }
}
