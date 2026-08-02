package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class mxi extends d2w implements v0y {
    public p651 c;
    public dy31 w;
    public p651 x;

    @Override // defpackage.d2w
    public final p651 E0(p651 p651Var) {
        return p651Var;
    }

    @Override // defpackage.d2w
    public final void F0() {
        this.x = new ako(this.c, this.a);
        super.F0();
        qje.P(this).C();
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        int c;
        dy31 dy31Var = this.w;
        p651 p651Var = this.x;
        switch (dy31Var.a) {
            case 7:
                c = p651Var.c(kVar);
                break;
            default:
                c = p651Var.a(kVar);
                break;
        }
        int i = c;
        if (i == 0) {
            return kVar.w(0, 0, b.f(), new p0u(5));
        }
        o l0 = x910Var.l0(n8e.b(0, j, 0, i, i, 3));
        return kVar.w(l0.a, i, b.f(), new q83(l0, 1));
    }
}
