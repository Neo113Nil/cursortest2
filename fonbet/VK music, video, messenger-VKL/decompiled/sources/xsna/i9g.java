package xsna;

import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: ProfileFabView.kt */
/* loaded from: classes5.dex */
public final class i9g extends cp8 {
    public final wh50 e;
    public final wh50 f;
    public final wh50 g = androidx.compose.runtime.k.b(null);

    public i9g(int i, long j) {
        this.e = androidx.compose.runtime.k.b(Integer.valueOf(i));
        this.f = zy60.d(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.cp8
    public final void a(lgu0 lgu0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1412980691);
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
            i2 |= (i & 4096) == 0 ? M.J(this) : M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1412980691, i2, -1, "com.vk.profile.design.view.fab.ColoredCounterImpl.Content (ProfileFabView.kt:435)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.g).getValue());
            int intValue = ((Number) ((zak0) this.e).getValue()).intValue();
            CounterSize u = hr80.z().u(ButtonSize.Small);
            float f = com.vk.core.compose.component.defaults.f.a;
            nou0.b(intValue, u, b, null, com.vk.core.compose.component.defaults.f.b(((l5g) ((zak0) this.f).getValue()).a, ((l5g) lgu0Var.e(d(), M, i2 & 112).getValue()).a, M, com.vk.core.compose.component.defaults.f.h << 6), false, M, 0, 40);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h9g(this, lgu0Var, i);
        }
    }
}
