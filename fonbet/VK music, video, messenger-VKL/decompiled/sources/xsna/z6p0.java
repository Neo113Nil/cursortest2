package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import xsna.q630;

/* compiled from: TopAvatarImpl.kt */
/* loaded from: classes17.dex */
public final class z6p0 implements bsa0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e = androidx.compose.runtime.k.b(null);
    public final wh50 f;

    public z6p0(efj efjVar, float f, List list, k18 k18Var, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(efjVar);
        this.b = cq.f(f);
        this.c = androidx.compose.runtime.k.b(new wow(list));
        this.d = androidx.compose.runtime.k.b(k18Var);
        this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    @Override // xsna.bsa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, androidx.compose.runtime.a aVar) {
        q630 q630Var;
        aVar.K(-1762262985);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1762262985, i, -1, "com.vk.core.compose.component.placeholder.TopAvatarImpl.Content (TopAvatarImpl.kt:42)");
        }
        aVar.K(-1317607081);
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.f).getValue();
        q630.a aVar2 = q630.a.a;
        q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
        wh50 wh50Var = this.e;
        if (((gzs) ((zak0) wh50Var).getValue()) != null) {
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (gzsVar == null) {
                aVar.K(1585457476);
                Object x = aVar.x();
                if (x == c0012a) {
                    x = new ta50(12);
                    aVar.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                aVar.K(605332777);
            }
            aVar.j();
            gzs gzsVar2 = gzsVar;
            Object x2 = aVar.x();
            if (x2 == c0012a) {
                x2 = ir.h(aVar);
            }
            q630 g = b.g(ojc.b(aVar2, (sg50) x2, null, true, null, gzsVar2, 24));
            if (g != null) {
                q630Var = g;
                aVar.j();
                ldu0.a((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.b).getValue()).b, ((wow) ((zak0) this.c).getValue()).b, q630Var, (k18) ((zak0) this.d).getValue(), false, null, null, null, aVar, 0, 480);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
        }
        q630Var = b;
        aVar.j();
        ldu0.a((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.b).getValue()).b, ((wow) ((zak0) this.c).getValue()).b, q630Var, (k18) ((zak0) this.d).getValue(), false, null, null, null, aVar, 0, 480);
        if (androidx.compose.runtime.b.d()) {
        }
        aVar.j();
    }
}
