package xsna;

import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cp8;
import xsna.q630;

/* compiled from: CounterImpl.kt */
/* loaded from: classes17.dex */
public final class qxj extends cp8.a {
    public final wh50 e;
    public final wh50 f = androidx.compose.runtime.k.b(null);
    public final wh50 g = androidx.compose.runtime.k.b(null);

    public qxj(int i) {
        this.e = androidx.compose.runtime.k.b(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.cp8
    public final void a(lgu0 lgu0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        fou0 a;
        androidx.compose.runtime.a M = aVar.M(-1465107903);
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
                androidx.compose.runtime.b.f(-1465107903, i2, -1, "com.vk.core.compose.component.button.CounterImpl.Content (CounterImpl.kt:28)");
            }
            com.vk.core.compose.component.defaults.a aVar3 = (com.vk.core.compose.component.defaults.a) ((zak0) this.f).getValue();
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.g).getValue());
            int intValue = ((Number) ((zak0) this.e).getValue()).intValue();
            CounterSize u = hr80.z().u(c());
            if (aVar3 == null) {
                M.K(-1571488633);
                float f = com.vk.core.compose.component.defaults.f.a;
                int i4 = i2 & 112;
                a = com.vk.core.compose.component.defaults.f.b(((l5g) lgu0Var.c(d(), M, i4).getValue()).a, ((l5g) lgu0Var.e(d(), M, i4).getValue()).a, M, 0);
                M.j();
            } else {
                M.K(-1571236541);
                a = com.vk.core.compose.component.defaults.f.a(null, null, M, 0);
                M.j();
            }
            nou0.b(intValue, u, b, null, a, false, M, 0, 40);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xyc(this, lgu0Var, i);
        }
    }
}
