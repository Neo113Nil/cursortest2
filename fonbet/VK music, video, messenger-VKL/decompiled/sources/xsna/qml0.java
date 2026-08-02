package xsna;

import com.vk.api.generated.market.dto.MarketCountersFilterDto;
import com.vk.api.generated.market.dto.MarketGetStorefrontFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: StorefrontRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class qml0 {
    public static final List<MarketGetStorefrontFieldsDto> d = e43.l(MarketGetStorefrontFieldsDto.GROUP, MarketGetStorefrontFieldsDto.ALBUMS, MarketGetStorefrontFieldsDto.FRIENDS, MarketGetStorefrontFieldsDto.FILTERS, MarketGetStorefrontFieldsDto.SORTING, MarketGetStorefrontFieldsDto.VIEWED_PRODUCTS, MarketGetStorefrontFieldsDto.ITEMS, MarketGetStorefrontFieldsDto.INTEGRATION_SETTINGS);
    public static final List<String> e = e43.l("thumbs", "buttons");
    public static final List<MarketCountersFilterDto> f;
    public static final List<MarketCountersFilterDto> g;
    public static final List<UsersFieldsDto> h;
    public static final String i;
    public final yd10 a;
    public final zqu b;
    public final u1r0 c;

    static {
        MarketCountersFilterDto marketCountersFilterDto = MarketCountersFilterDto.SINGLE_CART_ITEMS_COUNT;
        MarketCountersFilterDto marketCountersFilterDto2 = MarketCountersFilterDto.BOOKMARK_ITEMS_COUNT;
        f = e43.l(marketCountersFilterDto, marketCountersFilterDto2);
        g = Collections.singletonList(marketCountersFilterDto2);
        h = e43.l(UsersFieldsDto.FIRST_NAME_DAT, UsersFieldsDto.LAST_NAME_DAT, UsersFieldsDto.PHOTO_BASE);
        i = CommonMarketStat$TypeRefSource.COMMUNITY_GOODS.toString().toLowerCase(Locale.ROOT);
    }

    public qml0() {
        yd10 yd10Var = new yd10();
        zqu zquVar = new zqu();
        u1r0 u1r0Var = new u1r0();
        this.a = yd10Var;
        this.b = zquVar;
        this.c = u1r0Var;
    }
}
