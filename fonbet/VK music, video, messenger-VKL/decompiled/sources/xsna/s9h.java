package xsna;

import com.vk.dto.market.GoodBadge;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityMarketTileConfig.kt */
/* loaded from: classes5.dex */
public final class s9h {
    public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new dv2(7));

    /* compiled from: CommunityMarketTileConfig.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[MarketProductTileConfig.DisplayCtaButtonType.values().length];
            try {
                iArr2[MarketProductTileConfig.DisplayCtaButtonType.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MarketProductTileConfig.DisplayCtaButtonType.ABOVE_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
