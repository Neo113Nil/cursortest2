package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public class i2w extends d2w implements v0y {
    public p651 c;

    public i2w(p651 p651Var) {
        this.c = p651Var;
    }

    @Override // defpackage.d2w
    public final p651 E0(p651 p651Var) {
        return new sy11(p651Var, this.c);
    }

    @Override // defpackage.d2w
    public final void F0() {
        super.F0();
        qje.P(this).C();
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        int d = this.b.d(kVar, kVar.getLayoutDirection()) - this.a.d(kVar, kVar.getLayoutDirection());
        int c = this.b.c(kVar) - this.a.c(kVar);
        int b = (this.b.b(kVar, kVar.getLayoutDirection()) - this.a.b(kVar, kVar.getLayoutDirection())) + d;
        int a = (this.b.a(kVar) - this.a.a(kVar)) + c;
        o l0 = x910Var.l0(p8e.i(-b, -a, j));
        return kVar.w(p8e.g(l0.a + b, j), p8e.f(l0.b + a, j), b.f(), new h2w(l0, d, c, 0));
    }
}
