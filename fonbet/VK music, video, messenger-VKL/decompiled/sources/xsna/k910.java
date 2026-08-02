package xsna;

import com.vk.dto.market.GoodBadge;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MarketOtherGoodsItemConfig.kt */
/* loaded from: classes18.dex */
public final class k910 {
    public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new i13(17));

    /* compiled from: MarketOtherGoodsItemConfig.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoodBadge.BadgeType.values().length];
            try {
                iArr[GoodBadge.BadgeType.OZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoodBadge.BadgeType.PARTNER_INTEGRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoodBadge.BadgeType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
