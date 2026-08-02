package xsna;

import com.vk.ecomm.market.api.search.filters.dto.MarketDeliveryType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class xnd0 extends asd0 {
    public Integer h;
    public final Integer i;

    public xnd0() {
        this(null, null);
    }

    @Override // xsna.asd0, xsna.vcr
    public final Integer b() {
        return this.i;
    }

    @Override // xsna.asd0, xsna.vcr
    public final Integer d() {
        return this.h;
    }

    @Override // xsna.asd0, xsna.vcr
    public final void e(Integer num) {
        this.h = null;
    }

    @Override // xsna.asd0
    /* renamed from: f */
    public final Integer b() {
        return this.i;
    }

    @Override // xsna.asd0
    /* renamed from: g */
    public final Integer d() {
        return this.h;
    }

    @Override // xsna.asd0
    public final void h(Integer num) {
        this.h = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xnd0(Integer num, Integer num2) {
        super(num, num2, r1);
        int i;
        zrp<MarketDeliveryType> h = MarketDeliveryType.h();
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        Iterator<E> it = h.iterator();
        while (it.hasNext()) {
            int i2 = sy00.$EnumSwitchMapping$0[((MarketDeliveryType) it.next()).ordinal()];
            if (i2 == 1) {
                i = R.string.market_delivery_type_any;
            } else if (i2 == 2) {
                i = R.string.market_delivery_type_courier;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.market_delivery_type_pickup;
            }
            arrayList.add(Integer.valueOf(i));
        }
        this.h = num;
        this.i = num2;
    }
}
