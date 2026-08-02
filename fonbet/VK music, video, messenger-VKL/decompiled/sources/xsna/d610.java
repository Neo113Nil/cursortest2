package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c610;

/* compiled from: MarketItemsForReviewReducer.kt */
/* loaded from: classes18.dex */
public final class d610 extends dm50<n610, c610, g610> {
    @Override // xsna.dm50
    public final g610 c(g610 g610Var, c610 c610Var) {
        g610 g610Var2 = g610Var;
        c610 c610Var2 = c610Var;
        if (c610Var2 instanceof c610.c) {
            return g610.a(g610Var2, 0, ((c610.c) c610Var2).b, false, null, 3);
        }
        if (c610Var2 instanceof c610.a) {
            return g610.a(g610Var2, 0, EmptyList.b, false, ((c610.a) c610Var2).b, 3);
        }
        if (c610Var2 instanceof c610.d) {
            return g610.a(g610Var2, 0, ((c610.d) c610Var2).b, false, null, 3);
        }
        if (c610Var2 instanceof c610.b) {
            return g610.a(g610Var2, 0, null, true, null, 23);
        }
        if (c610Var2 instanceof c610.e) {
            return g610.a(g610Var2, ((c610.e) c610Var2).b, null, false, null, 29);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final n610 d() {
        return new n610(e(new b40(23)), e(new com.vk.movika.sdk.base.observable.e0(25)), e(new tr0(26)), e(new p2u(5)));
    }

    @Override // xsna.dm50
    public final void h(g610 g610Var, n610 n610Var) {
        g610 g610Var2 = g610Var;
        n610 n610Var2 = n610Var;
        if (g610Var2.e) {
            f(n610Var2.b, g610Var2);
            return;
        }
        if (g610Var2.f != null) {
            f(n610Var2.d, g610Var2);
            return;
        }
        List<a610> list = g610Var2.d;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((a610) obj).g) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                f(n610Var2.a, g610Var2);
                return;
            }
        }
        f(n610Var2.c, g610Var2);
    }
}
