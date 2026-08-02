package xsna;

import android.content.Context;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: MarketUtils.kt */
/* loaded from: classes18.dex */
public final class ef10 {
    public static void a(GoodAlbum goodAlbum, Context context, com.vk.ecomm.storefrontservices.api.a aVar, dhc dhcVar) {
        UserId userId = goodAlbum.c;
        int i = goodAlbum.b;
        if (goodAlbum.h == 1) {
            com.vk.ecomm.storefrontservices.api.a.a(aVar, context, userId, Integer.valueOf(i), null, null, false, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            return;
        }
        qr00.a(Integer.valueOf(i), userId.b, null, null, 60);
        dhcVar.d(context, new ngc(null, "album", goodAlbum.c, null, null, null, null, null, null, null, new MarketAnalyticsParams(null, MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM_ALBUM, CommonMarketStat$TypeRefSource.COMMUNITY_GROUP_GOODS, null, null, null, null, false, null, false, false, null, false, 8057, null), Integer.valueOf(i), false, goodAlbum.d, 3211235));
    }
}
