package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.b3v;

/* compiled from: HideAppContentReducer.kt */
/* loaded from: classes15.dex */
public final class g3v extends dm50<l3v, b3v, j3v> {
    @Override // xsna.dm50
    public final j3v c(j3v j3vVar, b3v b3vVar) {
        j3v j3vVar2 = j3vVar;
        b3v b3vVar2 = b3vVar;
        if (b3vVar2 instanceof b3v.b) {
            b3v.b bVar = (b3v.b) b3vVar2;
            return new j3v(bVar.b, bVar.c, false);
        }
        if (b3vVar2 instanceof b3v.c) {
            b3v.c cVar = (b3v.c) b3vVar2;
            return j3v.a(j3vVar2, false, cVar.b, cVar.c, 1);
        }
        if (b3vVar2 instanceof b3v.d) {
            return j3v.a(j3vVar2, ((b3v.d) b3vVar2).b, false, false, 6);
        }
        if (!(b3vVar2 instanceof b3v.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((b3v.a) b3vVar2).getClass();
        return j3v.a(j3vVar2, false, false, false, 3);
    }

    @Override // xsna.dm50
    public final l3v d() {
        return new l3v(e(new c3v(0)));
    }

    @Override // xsna.dm50
    public final void h(j3v j3vVar, l3v l3vVar) {
        f(l3vVar.a, j3vVar);
    }
}
