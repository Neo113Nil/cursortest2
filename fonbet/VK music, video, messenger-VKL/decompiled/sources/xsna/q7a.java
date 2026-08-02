package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.p7a;
import xsna.r7a;

/* compiled from: CatalogInternalNpsReducer.kt */
/* loaded from: classes16.dex */
public final class q7a extends dm50<w7a, p7a, r7a> {
    @Override // xsna.dm50
    public final r7a c(r7a r7aVar, p7a p7aVar) {
        p7a p7aVar2 = p7aVar;
        if (p7aVar2 instanceof p7a.a) {
            return r7a.b.b;
        }
        if (!(p7aVar2 instanceof p7a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        p7a.b bVar = (p7a.b) p7aVar2;
        return new r7a.a(bVar.b, bVar.c);
    }

    @Override // xsna.dm50
    public final w7a d() {
        return new w7a(e(new g54(5)), e(new com.vk.movika.sdk.base.observable.s(10)));
    }

    @Override // xsna.dm50
    public final void h(r7a r7aVar, w7a w7aVar) {
        r7a r7aVar2 = r7aVar;
        w7a w7aVar2 = w7aVar;
        if (r7aVar2 instanceof r7a.a) {
            f(w7aVar2.a, r7aVar2);
        } else if (r7aVar2 instanceof r7a.b) {
            f(w7aVar2.b, r7aVar2);
        } else if (!(r7aVar2 instanceof r7a.c)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
