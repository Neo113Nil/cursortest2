package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import ru.ok.android.commons.http.Http;
import xsna.q630;

/* compiled from: BeforeAvatarImpl.kt */
/* loaded from: classes17.dex */
public final class lw6 implements b16 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    public lw6(efj efjVar, float f, List list, k18 k18Var, z190 z190Var, gzs gzsVar, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(efjVar);
        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.c = cq.f(f);
        this.d = androidx.compose.runtime.k.b(new wow(list));
        this.e = androidx.compose.runtime.k.b(k18Var);
        this.f = androidx.compose.runtime.k.b(z190Var);
        this.g = androidx.compose.runtime.k.b(gzsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    @Override // xsna.b16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, androidx.compose.runtime.a aVar) {
        q630 q630Var;
        androidx.compose.runtime.a M = aVar.M(1326125044);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1326125044, i2, -1, "com.vk.core.compose.component.banner.BeforeAvatarImpl.Content (BeforeAvatarImpl.kt:45)");
            }
            M.K(-1199113484);
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.b).getValue();
            q630.a aVar2 = q630.a.a;
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
            wh50 wh50Var = this.g;
            if (((gzs) ((zak0) wh50Var).getValue()) != null) {
                gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (gzsVar == null) {
                    M.K(1403528401);
                    Object x = M.x();
                    if (x == c0012a) {
                        x = new w9(2);
                        M.R(x);
                    }
                    gzsVar = (gzs) x;
                } else {
                    M.K(-647461892);
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
                    ldu0.a((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.c).getValue()).b, ((wow) ((zak0) this.d).getValue()).b, q630Var, (k18) ((zak0) this.e).getValue(), false, (z190) ((zak0) this.f).getValue(), null, null, M, 0, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            q630Var = b;
            M.j();
            ldu0.a((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.c).getValue()).b, ((wow) ((zak0) this.d).getValue()).b, q630Var, (k18) ((zak0) this.e).getValue(), false, (z190) ((zak0) this.f).getValue(), null, null, M, 0, Http.StatusCode.RANGE_NOT_SATISFIABLE);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v95(this, i, 1);
        }
    }
}
