package xsna;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.ipq;

/* compiled from: FaveFeedPagesReducer.kt */
/* loaded from: classes4.dex */
public final class bqq implements bm50<kpq, ipq.a> {
    @Override // xsna.bm50
    public final kpq a(kpq kpqVar, ipq.a aVar) {
        kpq kpqVar2 = kpqVar;
        ipq.a aVar2 = aVar;
        tqq tqqVar = kpqVar2.g;
        if (aVar2 instanceof ipq.a.c) {
            return kpq.a(kpqVar2, null, ((ipq.a.c) aVar2).a, null, 95);
        }
        if (aVar2 instanceof ipq.a.C3071a) {
            return kpq.a(kpqVar2, null, tqqVar != null ? tqq.a(tqqVar, j5g.u0(tqqVar.a, Collections.singletonList(((ipq.a.C3071a) aVar2).a))) : new tqq(Collections.singletonList(((ipq.a.C3071a) aVar2).a), 1, null), null, 95);
        }
        if (aVar2 instanceof ipq.a.b) {
            return kpq.a(kpqVar2, null, tqqVar != null ? tqq.a(tqqVar, j5g.s0(tqqVar.a, ((ipq.a.b) aVar2).a)) : null, null, 95);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ipq.a aVar) {
        return true;
    }
}
