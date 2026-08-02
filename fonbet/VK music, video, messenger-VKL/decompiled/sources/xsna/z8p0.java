package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import xsna.q630;

/* compiled from: TopPictureImpl.kt */
/* loaded from: classes17.dex */
public final class z8p0 implements bsa0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);
    public final wh50 e;
    public final wh50 f;

    public z8p0(rco0 rco0Var, float f, List list, PictureRadius pictureRadius, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(rco0Var);
        this.b = cq.f(f);
        this.c = androidx.compose.runtime.k.b(new wow(list));
        this.e = androidx.compose.runtime.k.b(pictureRadius);
        this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    @Override // xsna.bsa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, androidx.compose.runtime.a aVar) {
        q630 q630Var;
        aVar.K(387149467);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(387149467, i, -1, "com.vk.core.compose.component.placeholder.TopPictureImpl.Content (TopPictureImpl.kt:41)");
        }
        aVar.K(-1611510053);
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.f).getValue();
        q630.a aVar2 = q630.a.a;
        q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
        wh50 wh50Var = this.d;
        if (((gzs) ((zak0) wh50Var).getValue()) != null) {
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (gzsVar == null) {
                aVar.K(1704213920);
                Object x = aVar.x();
                if (x == c0012a) {
                    x = new y8p0(0);
                    aVar.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                aVar.K(-499215027);
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
                gdv0.b((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.b).getValue()).b, ((wow) ((zak0) this.c).getValue()).b, q630Var, (PictureRadius) ((zak0) this.e).getValue(), null, null, aVar, 0, 96);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
        }
        q630Var = b;
        aVar.j();
        gdv0.b((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.b).getValue()).b, ((wow) ((zak0) this.c).getValue()).b, q630Var, (PictureRadius) ((zak0) this.e).getValue(), null, null, aVar, 0, 96);
        if (androidx.compose.runtime.b.d()) {
        }
        aVar.j();
    }
}
