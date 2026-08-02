package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.MarketItemRating;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class a9u {
    public final ArrayList a;

    public a9u(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        a9u a9uVar = obj instanceof a9u ? (a9u) obj : null;
        if (a9uVar == null) {
            return false;
        }
        ArrayList arrayList = a9uVar.a;
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() != arrayList.size()) {
            return false;
        }
        ArrayList X0 = j5g.X0(arrayList2, arrayList);
        if (X0.isEmpty()) {
            return true;
        }
        Iterator it = X0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            f5u f5uVar = (f5u) pair.d();
            f5u f5uVar2 = (f5u) pair.g();
            if (!epx.f(f5uVar, f5uVar2)) {
                return false;
            }
            Good good = f5uVar.b;
            boolean z = good.J;
            Good good2 = f5uVar2.b;
            if (z != good2.J || !epx.f(good.n, good2.n)) {
                return false;
            }
            MarketItemRating marketItemRating = good.t;
            Float f = marketItemRating != null ? marketItemRating.b : null;
            MarketItemRating marketItemRating2 = good2.t;
            if (!epx.e(f, marketItemRating2 != null ? marketItemRating2.b : null) || !epx.f(good.d, good2.d)) {
                return false;
            }
            MarketItemRating marketItemRating3 = good.t;
            Integer num = marketItemRating3 != null ? marketItemRating3.c : null;
            MarketItemRating marketItemRating4 = good2.t;
            if (!epx.f(num, marketItemRating4 != null ? marketItemRating4.c : null) || !epx.f(good.h, good2.h) || !epx.f(good.n0, good2.n0)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            int i = hashCode * 31;
            Good good = ((f5u) it.next()).b;
            Integer valueOf = Integer.valueOf(good.hashCode());
            Boolean valueOf2 = Boolean.valueOf(good.J);
            Image image = good.n;
            MarketItemRating marketItemRating = good.t;
            Integer num = null;
            Float f = marketItemRating != null ? marketItemRating.b : null;
            String str = good.d;
            if (marketItemRating != null) {
                num = marketItemRating.c;
            }
            hashCode = i + Arrays.hashCode(new Object[]{valueOf, valueOf2, image, f, str, num, good.h});
        }
        return hashCode;
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("GoodsWrapper(goodsItems="), this.a);
    }
}
