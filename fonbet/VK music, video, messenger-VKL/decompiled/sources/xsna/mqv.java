package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: IconImpl.kt */
/* loaded from: classes17.dex */
public final class mqv implements e7k0, g7k0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public mqv() {
        throw null;
    }

    public mqv(lg90 lg90Var, long j, long j2, int i) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(null);
        this.c = zy60.d(j);
        this.d = androidx.compose.runtime.k.b(new uco(j2));
        this.e = androidx.compose.runtime.k.b(null);
        this.f = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.e7k0, xsna.g7k0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1674306725);
        int i3 = i & 6;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1674306725, i2, -1, "com.vk.core.compose.component.snackbar.IconImpl.Content (IconImpl.kt:38)");
            }
            M.K(-1816266393);
            M.j();
            long j = ((l5g) ((zak0) this.c).getValue()).a;
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.f).getValue());
            long j2 = ((uco) ((zak0) this.d).getValue()).a;
            gzs gzsVar = (gzs) ((zak0) this.b).getValue();
            if (gzsVar == null) {
                M.K(-1816073883);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new i9(27);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(1603984616);
            }
            M.j();
            aVar2 = M;
            nzu0.b(gzsVar, (lg90) ((zak0) this.a).getValue(), j2, (String) ((zak0) this.e).getValue(), b, j, false, null, false, null, null, aVar2, 64, 0, 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new v26(this, i);
        }
    }

    public final void b(long j) {
        ((zak0) this.c).setValue(new l5g(j));
    }
}
