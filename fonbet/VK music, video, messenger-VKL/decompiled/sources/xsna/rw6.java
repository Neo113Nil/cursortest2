package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import xsna.q630;

/* compiled from: BeforePictureImpl.kt */
/* loaded from: classes17.dex */
public final class rw6 implements b16 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g = androidx.compose.runtime.k.b(null);

    public rw6(efj efjVar, float f, List list, z190 z190Var, PictureRadius pictureRadius, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(efjVar);
        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.c = cq.f(f);
        this.d = androidx.compose.runtime.k.b(new wow(list));
        this.e = androidx.compose.runtime.k.b(z190Var);
        this.f = androidx.compose.runtime.k.b(pictureRadius);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    @Override // xsna.b16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, androidx.compose.runtime.a aVar) {
        q630 q630Var;
        androidx.compose.runtime.a M = aVar.M(1872424594);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1872424594, i2, -1, "com.vk.core.compose.component.banner.BeforePictureImpl.Content (BeforePictureImpl.kt:44)");
            }
            M.K(-191256014);
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.b).getValue();
            q630.a aVar2 = q630.a.a;
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
            wh50 wh50Var = this.g;
            if (((gzs) ((zak0) wh50Var).getValue()) != null) {
                gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (gzsVar == null) {
                    M.K(145732659);
                    Object x = M.x();
                    if (x == c0012a) {
                        x = new d2(5);
                        M.R(x);
                    }
                    gzsVar = (gzs) x;
                } else {
                    M.K(1667268698);
                }
                M.j();
                gzs gzsVar2 = gzsVar;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = ir.h(M);
                }
                q630 g = b.g(ojc.b(aVar2, (sg50) x2, null, true, null, gzsVar2, 24));
                if (g != null) {
                    q630Var = g;
                    M.j();
                    gdv0.b((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.c).getValue()).b, ((wow) ((zak0) this.d).getValue()).b, q630Var, (PictureRadius) ((zak0) this.f).getValue(), (z190) ((zak0) this.e).getValue(), null, M, 0, 64);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            q630Var = b;
            M.j();
            gdv0.b((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.c).getValue()).b, ((wow) ((zak0) this.d).getValue()).b, q630Var, (PictureRadius) ((zak0) this.f).getValue(), (z190) ((zak0) this.e).getValue(), null, M, 0, 64);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qw6(this, i, 0);
        }
    }
}
