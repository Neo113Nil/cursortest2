package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.h4n;

/* compiled from: DiscoverMediaAutoRetryReducer.kt */
/* loaded from: classes4.dex */
public final class q2n implements bm50<t4n, h4n.a> {
    @Override // xsna.bm50
    public final t4n a(t4n t4nVar, h4n.a aVar) {
        t4n t4nVar2 = t4nVar;
        h4n.a aVar2 = aVar;
        if (aVar2 instanceof h4n.a.b) {
            return t4n.a(t4nVar2, null, null, false, t4nVar2.e + 1, 7);
        }
        if (aVar2 instanceof h4n.a.C2971a) {
            return t4n.a(t4nVar2, null, null, false, 0, 7);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(h4n.a aVar) {
        return true;
    }
}
