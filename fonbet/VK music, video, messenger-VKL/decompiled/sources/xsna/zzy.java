package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import xsna.q630;

/* compiled from: LeftPictureImpl.kt */
/* loaded from: classes17.dex */
public final class zzy implements e7k0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f = androidx.compose.runtime.k.b(null);
    public final wh50 g = androidx.compose.runtime.k.b(null);

    public zzy(phw phwVar, List list, k18 k18Var, z190 z190Var, PictureRadius pictureRadius) {
        this.a = androidx.compose.runtime.k.b(phwVar);
        this.b = androidx.compose.runtime.k.b(new wow(list));
        this.c = androidx.compose.runtime.k.b(k18Var);
        this.d = androidx.compose.runtime.k.b(z190Var);
        this.e = androidx.compose.runtime.k.b(pictureRadius);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    @Override // xsna.e7k0, xsna.g7k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        q630 q630Var;
        androidx.compose.runtime.a M = aVar.M(179801275);
        int i3 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(179801275, i2, -1, "com.vk.core.compose.component.snackbar.LeftPictureImpl.Content (LeftPictureImpl.kt:45)");
            }
            M.K(990339611);
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.g).getValue());
            wh50 wh50Var = this.f;
            if (((gzs) ((zak0) wh50Var).getValue()) != null) {
                gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                Object obj = a.C0011a.a;
                if (gzsVar == null) {
                    M.K(557096618);
                    Object x = M.x();
                    if (x == obj) {
                        x = new re0(20);
                        M.R(x);
                    }
                    gzsVar = (gzs) x;
                } else {
                    M.K(1541991171);
                }
                M.j();
                gzs gzsVar2 = gzsVar;
                Object x2 = M.x();
                if (x2 == obj) {
                    x2 = ir.h(M);
                }
                q630 g = b.g(ojc.b(aVar2, (sg50) x2, null, true, null, gzsVar2, 24));
                if (g != null) {
                    q630Var = g;
                    M.j();
                    gdv0.b((efj) ((zak0) this.a).getValue(), 40, ((wow) ((zak0) this.b).getValue()).b, q630Var, (PictureRadius) ((zak0) this.e).getValue(), (z190) ((zak0) this.d).getValue(), null, M, 48, 64);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            q630Var = b;
            M.j();
            gdv0.b((efj) ((zak0) this.a).getValue(), 40, ((wow) ((zak0) this.b).getValue()).b, q630Var, (PictureRadius) ((zak0) this.e).getValue(), (z190) ((zak0) this.d).getValue(), null, M, 48, 64);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a0l(this, i);
        }
    }
}
