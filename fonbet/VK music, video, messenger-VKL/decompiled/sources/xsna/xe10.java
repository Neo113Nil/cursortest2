package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MarketStackedListSpanStrategy.kt */
/* loaded from: classes18.dex */
public final class xe10 implements sok0 {
    public final int b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketStackedListSpanStrategy.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a COMMUNITIES_IN_MARKET;
        public static final a DEFAULT;
        public static final a MARKET_ITEM;
        private final int value;

        static {
            a aVar = new a("MARKET_ITEM", 0, 2);
            MARKET_ITEM = aVar;
            a aVar2 = new a("COMMUNITIES_IN_MARKET", 1, 2);
            COMMUNITIES_IN_MARKET = aVar2;
            a aVar3 = new a("DEFAULT", 2, 1);
            DEFAULT = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2) {
            this.value = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }
    }

    public xe10() {
        int i;
        Integer valueOf;
        a[] values = a.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (a aVar : values) {
            arrayList.add(Integer.valueOf(aVar.h()));
        }
        Integer num = null;
        if (!arrayList.isEmpty() && !arrayList.contains(0)) {
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(Math.abs(((Number) it.next()).intValue())));
            }
            Iterator it2 = arrayList2.iterator();
            int i2 = 1;
            while (it2.hasNext()) {
                int intValue = ((Number) it2.next()).intValue();
                int abs = Math.abs(i2);
                int abs2 = Math.abs(intValue);
                if (abs == 0 && abs2 == 0) {
                    valueOf = null;
                } else if (abs == 0) {
                    valueOf = Integer.valueOf(abs2);
                } else if (abs2 == 0) {
                    valueOf = Integer.valueOf(abs);
                } else {
                    while (true) {
                        int i3 = abs2;
                        i = abs;
                        abs = i3;
                        if (abs <= 0) {
                            break;
                        } else {
                            abs2 = i % abs;
                        }
                    }
                    valueOf = Integer.valueOf(i);
                }
                if (valueOf != null) {
                    i2 = (i2 * intValue) / valueOf.intValue();
                }
            }
            num = Integer.valueOf(i2);
        }
        this.b = num != null ? num.intValue() : 1;
    }

    @Override // xsna.sok0
    public final boolean S(UIBlockList uIBlockList) {
        return false;
    }

    @Override // xsna.sok0
    public final int getSpanCount() {
        return this.b;
    }

    @Override // xsna.sok0
    public final int q(UIBlock uIBlock) {
        boolean z = uIBlock instanceof UIBlockMarketItem;
        int i = this.b;
        return z ? i / a.MARKET_ITEM.h() : uIBlock instanceof UIBlockGroup ? uIBlock.d == CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD ? i / a.COMMUNITIES_IN_MARKET.h() : i / a.DEFAULT.h() : i / a.DEFAULT.h();
    }
}
