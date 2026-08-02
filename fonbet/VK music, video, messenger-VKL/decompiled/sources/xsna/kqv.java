package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.p2p0;
import xsna.q630;

/* compiled from: IconImpl.kt */
/* loaded from: classes17.dex */
public final class kqv extends p2p0.a {
    public final wh50 d;
    public final wh50 f;
    public final wh50 e = androidx.compose.runtime.k.b(null);
    public final wh50 g = androidx.compose.runtime.k.b(null);
    public final wh50 h = androidx.compose.runtime.k.b(null);

    public kqv(lg90 lg90Var, uco ucoVar) {
        this.d = androidx.compose.runtime.k.b(lg90Var);
        this.f = androidx.compose.runtime.k.b(ucoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(psv0 psv0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        long b;
        long j;
        androidx.compose.runtime.a M = aVar.M(1451871361);
        if ((i & 6) == 0) {
            i2 = (M.J(psv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1451871361, i2, -1, "com.vk.core.compose.component.button.tool.IconImpl.Content (IconImpl.kt:35)");
            }
            lg90 lg90Var = (lg90) ((zak0) this.d).getValue();
            String str = (String) ((zak0) this.g).getValue();
            q630 b2 = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.h).getValue());
            uco ucoVar = (uco) ((zak0) this.f).getValue();
            if (ucoVar != null) {
                b = ucoVar.a;
            } else {
                float f = 28;
                b = byc0.b(f, f);
            }
            q630 r = txj0.r(b, b2);
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new d9j(this, 16);
                M.R(x);
            }
            q630 a = rdu.a(r, (izs) x);
            l5g l5gVar = (l5g) ((zak0) this.e).getValue();
            if (l5gVar == null) {
                M.K(-615977146);
                boolean booleanValue = ((Boolean) ((zak0) this.c).getValue()).booleanValue();
                int i4 = (i2 << 3) & 112;
                psv0Var.getClass();
                M.K(-2105186986);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2105186986, i4, -1, "com.vk.core.compose.component.button.tool.VkToolButtonColorsImpl.iconColor (ToolButtonDefaults.kt:152)");
                }
                wh50 f2 = bo.f(0, booleanValue ? psv0Var.e : psv0Var.f, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                j = ((l5g) f2.getValue()).a;
                M.j();
            } else {
                M.K(-615978634);
                M.j();
                j = l5gVar.a;
            }
            vqv.a(lg90Var, str, a, j, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ft3(this, psv0Var, i);
        }
    }
}
