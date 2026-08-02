package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class m690 extends e530 implements v0y {
    public j690 a;

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        float b = this.a.b(kVar.getLayoutDirection());
        float d = this.a.d();
        float c = this.a.c(kVar.getLayoutDirection());
        float a = this.a.a();
        if (!((y7m.a(b, 0.0f) >= 0) & (y7m.a(d, 0.0f) >= 0) & (y7m.a(c, 0.0f) >= 0) & (y7m.a(a, 0.0f) >= 0))) {
            gxv.a("Padding must be non-negative");
        }
        int f0 = kVar.f0(b);
        int f02 = kVar.f0(c) + f0;
        int f03 = kVar.f0(d);
        int f04 = kVar.f0(a) + f03;
        o l0 = x910Var.l0(p8e.i(-f02, -f04, j));
        return kVar.w(p8e.g(l0.a + f02, j), p8e.f(l0.b + f04, j), b.f(), new h2w(l0, f0, f03, 3));
    }
}
