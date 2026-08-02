package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.au00;
import xsna.q630;

/* compiled from: IconImpl.kt */
/* loaded from: classes18.dex */
public final class oqv extends au00.a {
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);
    public final wh50 e = androidx.compose.runtime.k.b(null);
    public final wh50 f = androidx.compose.runtime.k.b(null);
    public final wh50 g = androidx.compose.runtime.k.b(null);

    public oqv(lg90 lg90Var) {
        this.c = androidx.compose.runtime.k.b(lg90Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.au00
    public final void a(lgu0 lgu0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        long j;
        long j2;
        androidx.compose.runtime.a M = aVar.M(621401314);
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
                androidx.compose.runtime.b.f(621401314, i2, -1, "com.vk.ecomm.design.compose.marketbutton.IconImpl.Content (IconImpl.kt:36)");
            }
            lg90 lg90Var = (lg90) ((zak0) this.c).getValue();
            String str = (String) ((zak0) this.f).getValue();
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.g).getValue());
            uco ucoVar = (uco) ((zak0) this.e).getValue();
            if (ucoVar == null) {
                M.K(166219692);
                float v = hr80.z().v((ButtonSize) ((zak0) this.a).getValue(), M, 0);
                j = byc0.b(v, v);
                M.j();
            } else {
                M.K(166218142);
                M.j();
                j = ucoVar.a;
            }
            q630 r = txj0.r(j, b);
            boolean z = (i2 & 7168) == 2048;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new rlh(this, 14);
                M.R(x);
            }
            q630 a = rdu.a(r, (izs) x);
            l5g l5gVar = (l5g) ((zak0) this.d).getValue();
            if (l5gVar == null) {
                M.K(166225991);
                j2 = ((l5g) lgu0Var.d(c(), M, i2 & 112).getValue()).a;
                M.j();
            } else {
                M.K(166224503);
                M.j();
                j2 = l5gVar.a;
            }
            pzu0.b(lg90Var, str, a, j2, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new edh(this, lgu0Var, i);
        }
    }
}
