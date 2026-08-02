package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: RightIconImpl.kt */
/* loaded from: classes17.dex */
public final class gkg0 implements tlh0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50<zhf0> f;
    public final wh50 g;

    public gkg0() {
        throw null;
    }

    public gkg0(long j, SemanticsConfiguration semanticsConfiguration, String str, gzs gzsVar, lg90 lg90Var) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = androidx.compose.runtime.k.b(str);
        this.d = androidx.compose.runtime.k.b(gzsVar);
        this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
        wh50<zhf0> b = androidx.compose.runtime.k.b(zhf0.e);
        this.f = b;
        this.g = b;
    }

    @Override // xsna.tlh0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(219461288);
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(219461288, i2, -1, "com.vk.core.compose.component.search.right.RightIconImpl.Content (RightIconImpl.kt:35)");
            }
            q630 H = cdi.H(aVar2, this.f);
            gzs gzsVar = (gzs) ((zak0) this.d).getValue();
            if (gzsVar == null) {
                M.K(1031207736);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new zo80(4);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(448906421);
            }
            M.j();
            div0.a((lg90) ((zak0) this.a).getValue(), gzsVar, H, ((l5g) ((zak0) this.b).getValue()).a, (String) ((zak0) this.c).getValue(), (SemanticsConfiguration) ((zak0) this.e).getValue(), M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bmp(this, i);
        }
    }

    @Override // xsna.rzb0
    public final zhf0 d() {
        return (zhf0) ((zak0) this.g).getValue();
    }
}
