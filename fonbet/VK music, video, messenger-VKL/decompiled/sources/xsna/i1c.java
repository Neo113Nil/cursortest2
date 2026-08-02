package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.h1c;
import xsna.k1c;

/* compiled from: CheckSignInReducer.kt */
/* loaded from: classes6.dex */
public final class i1c extends dm50<l1c, h1c, k1c> {
    public final b1c d;

    public i1c(b1c b1cVar, k1c k1cVar) {
        super(k1cVar);
        this.d = b1cVar;
    }

    @Override // xsna.dm50
    public final k1c c(k1c k1cVar, h1c h1cVar) {
        h1c h1cVar2 = h1cVar;
        if (h1cVar2 instanceof h1c.a) {
            return new k1c.a.C3158a(((h1c.a) h1cVar2).b);
        }
        if (h1cVar2.equals(h1c.b.b) || h1cVar2.equals(h1c.c.b)) {
            return k1c.b.b;
        }
        if (h1cVar2.equals(h1c.d.b)) {
            return k1c.a.b.c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final l1c d() {
        return new l1c(e(new oa(9)), e(new fm0(this, 18)));
    }

    @Override // xsna.dm50
    public final void h(k1c k1cVar, l1c l1cVar) {
        k1c k1cVar2 = k1cVar;
        l1c l1cVar2 = l1cVar;
        if (k1cVar2 instanceof k1c.b) {
            f(l1cVar2.a, k1cVar2);
        } else {
            if (!(k1cVar2 instanceof k1c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(l1cVar2.b, k1cVar2);
        }
    }
}
