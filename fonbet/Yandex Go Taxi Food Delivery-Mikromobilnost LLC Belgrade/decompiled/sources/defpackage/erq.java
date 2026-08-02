package defpackage;

import com.ybsdk.feature.transactions.api.entities.TransactionsListShimmerType;
import com.ybsdk.rconfig.b;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes3.dex */
public final class erq {
    public final sf01 a;

    public erq(sf01 sf01Var) {
        this.a = sf01Var;
    }

    public final ListBuilder a(TransactionsListShimmerType transactionsListShimmerType) {
        int i;
        hyk hykVar;
        b bVar = ((ue01) this.a).b;
        if (jl40.l(bVar.r().isEnabledOnTransactionsFeedScreen(), Boolean.TRUE) && bVar.r().isEnabled()) {
            ListBuilder a = rcc.a();
            int i2 = drq.a[transactionsListShimmerType.ordinal()];
            if (i2 == 1) {
                hykVar = new hyk(new eal(ils0.b, false, null, 6));
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                hykVar = new hyk(new eal(kls0.b, false, null, 6));
            }
            a.add(hykVar);
            return a.j();
        }
        ListBuilder a2 = rcc.a();
        if (transactionsListShimmerType == TransactionsListShimmerType.FULL) {
            a2.add(new voq());
        }
        int i3 = drq.a[transactionsListShimmerType.ordinal()];
        if (i3 == 1) {
            i = 5;
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            i = 3;
        }
        for (int i4 = 0; i4 < i; i4++) {
            a2.add(new soq());
        }
        return a2.j();
    }
}
