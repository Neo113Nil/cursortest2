package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Currency;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;

/* compiled from: MultipickerProductMapExt.kt */
/* loaded from: classes18.dex */
public final class i740 {
    public static final Good a(MultipickerProduct multipickerProduct) {
        MarketRejectInfo marketRejectInfo;
        MultipickerProduct.Moderation moderation = multipickerProduct.e;
        MultipickerProductId multipickerProductId = multipickerProduct.b;
        long j = multipickerProductId.b;
        UserId userId = multipickerProductId.c;
        String str = multipickerProduct.c;
        Currency currency = new Currency(0, "", "");
        MultipickerProduct.Price price = multipickerProduct.d;
        Price price2 = new Price(0L, 0L, currency, price.b, price.c, price.e, "", price.d, null, 256, null);
        Image image = multipickerProduct.f;
        int i = multipickerProduct.h ? 0 : 2;
        MultipickerProduct.Rating rating = multipickerProduct.l;
        MarketItemRating marketItemRating = rating != null ? new MarketItemRating(rating.b, rating.c, rating.d) : null;
        boolean z = multipickerProduct.g;
        String str2 = multipickerProduct.i;
        MultipickerProduct.Owner owner = multipickerProduct.k;
        Owner owner2 = owner != null ? new Owner(owner.b, owner.c, null, null, new VerifyInfo(owner.d, false, false, false, false, false, 62, null), null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194284, null) : null;
        MultipickerProduct.Moderation.Reject reject = moderation.g;
        if (reject != null) {
            String str3 = reject.b;
            String str4 = str3 == null ? "" : str3;
            String str5 = str3 == null ? "" : str3;
            String str6 = reject.c;
            String str7 = str6 == null ? "" : str6;
            String str8 = reject.d;
            marketRejectInfo = new MarketRejectInfo(str4, str5, str7, str8 == null ? "" : str8, 0, reject.e, null);
        } else {
            marketRejectInfo = null;
        }
        return new Good(j, userId, str, "", null, price2, 0, null, 0, null, false, image, 0, i, null, null, marketItemRating, null, null, null, null, 0, 0, null, null, false, false, false, 0, 0, null, 0, 0, z, str2, null, owner2, null, null, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, false, null, null, 0, 0, null, null, null, null, marketRejectInfo, null, moderation.c, moderation.b, moderation.d, null, null, null, null, null, null, null);
    }
}
