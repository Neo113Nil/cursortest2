package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cp8;
import xsna.q630;

/* compiled from: IconImpl.kt */
/* loaded from: classes17.dex */
public final class pqv extends cp8.b {
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;

    public pqv(lg90 lg90Var, l5g l5gVar, uco ucoVar, String str, SemanticsConfiguration semanticsConfiguration) {
        this.e = androidx.compose.runtime.k.b(lg90Var);
        this.f = androidx.compose.runtime.k.b(l5gVar);
        this.g = androidx.compose.runtime.k.b(ucoVar);
        this.h = androidx.compose.runtime.k.b(str);
        this.i = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.cp8
    public final void a(lgu0 lgu0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        long j;
        long j2;
        androidx.compose.runtime.a M = aVar.M(405799153);
        if ((i & 48) == 0) {
            i2 = (M.J(lgu0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 384;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(405799153, i2, -1, "com.vk.core.compose.component.button.IconImpl.Content (IconImpl.kt:37)");
            }
            lg90 lg90Var = (lg90) ((zak0) this.e).getValue();
            String str = (String) ((zak0) this.h).getValue();
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.i).getValue());
            uco ucoVar = (uco) ((zak0) this.g).getValue();
            if (ucoVar == null) {
                M.K(-869026885);
                float v = hr80.z().v(c(), M, 0);
                j = byc0.b(v, v);
                M.j();
            } else {
                M.K(-869028435);
                M.j();
                j = ucoVar.a;
            }
            q630 r = txj0.r(j, b);
            boolean z = (i2 & 7168) == 2048;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new cvh(this, 16);
                M.R(x);
            }
            q630 a = rdu.a(r, (izs) x);
            l5g l5gVar = (l5g) ((zak0) this.f).getValue();
            if (l5gVar == null) {
                M.K(-869020586);
                j2 = ((l5g) lgu0Var.d(d(), M, i2 & 112).getValue()).a;
                M.j();
            } else {
                M.K(-869022074);
                M.j();
                j2 = l5gVar.a;
            }
            vqv.a(lg90Var, str, a, j2, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wi1(this, lgu0Var, i);
        }
    }
}
