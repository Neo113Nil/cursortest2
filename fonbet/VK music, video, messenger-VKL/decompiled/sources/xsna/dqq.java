package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ipq;

/* compiled from: FaveFeedTagsReducer.kt */
/* loaded from: classes4.dex */
public final class dqq implements bm50<kpq, ipq.b> {
    @Override // xsna.bm50
    public final kpq a(kpq kpqVar, ipq.b bVar) {
        kpq kpqVar2 = kpqVar;
        ipq.b bVar2 = bVar;
        if (bVar2 instanceof ipq.b.a) {
            return kpq.a(kpqVar2, ((ipq.b.a) bVar2).a, null, null, 125);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ipq.b bVar) {
        return true;
    }
}
