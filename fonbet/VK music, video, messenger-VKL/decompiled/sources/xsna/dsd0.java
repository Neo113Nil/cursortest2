package xsna;

import com.vk.ecomm.market.api.search.filters.dto.MarketSortingOptions;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class dsd0 extends fsd0 {
    public Integer i;
    public final Integer j;

    public dsd0() {
        this(null, null);
    }

    @Override // xsna.fsd0, xsna.vcr
    public final Integer b() {
        return this.j;
    }

    @Override // xsna.fsd0, xsna.vcr
    public final Integer d() {
        return this.i;
    }

    @Override // xsna.fsd0, xsna.vcr
    public final void e(Integer num) {
        this.i = null;
    }

    @Override // xsna.fsd0
    /* renamed from: f */
    public final Integer b() {
        return this.j;
    }

    @Override // xsna.fsd0
    /* renamed from: g */
    public final Integer d() {
        return this.i;
    }

    @Override // xsna.fsd0
    public final void h(Integer num) {
        this.i = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dsd0(Integer num, Integer num2) {
        super(r0, num, num2, r2);
        int i;
        tlo0.f h = tq.h(tlo0.Companion, R.string.market_sorting_field_title);
        zrp<MarketSortingOptions> h2 = MarketSortingOptions.h();
        ArrayList arrayList = new ArrayList(c5g.u(h2, 10));
        Iterator<E> it = h2.iterator();
        while (it.hasNext()) {
            int i2 = sy00.$EnumSwitchMapping$1[((MarketSortingOptions) it.next()).ordinal()];
            if (i2 == 1) {
                i = R.string.market_sort_type_default;
            } else if (i2 == 2) {
                i = R.string.market_sort_type_price_asc;
            } else if (i2 == 3) {
                i = R.string.market_sort_type_price_desc;
            } else if (i2 == 4) {
                i = R.string.market_sort_type_new_first;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.market_sort_type_rating_desc;
            }
            arrayList.add(Integer.valueOf(i));
        }
        this.i = num;
        this.j = num2;
    }
}
