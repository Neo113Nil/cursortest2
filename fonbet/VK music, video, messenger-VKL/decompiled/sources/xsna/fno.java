package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.dto.common.Image;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;
import java.util.List;

/* compiled from: DtoToMultipickerProductMapExt.kt */
/* loaded from: classes18.dex */
public final class fno {
    public static final MultipickerProduct a(MarketMarketItemDto marketMarketItemDto, boolean z, MultipickerProduct.Owner owner) {
        MultipickerProductId multipickerProductId = new MultipickerProductId(marketMarketItemDto.getId(), marketMarketItemDto.q());
        String title = marketMarketItemDto.getTitle();
        String n = marketMarketItemDto.F().n();
        String l = marketMarketItemDto.F().l();
        String j = marketMarketItemDto.F().j();
        Integer f = marketMarketItemDto.F().f();
        MultipickerProduct.Price price = new MultipickerProduct.Price(n, l, j, f != null ? f.intValue() : 0);
        Boolean v0 = marketMarketItemDto.v0();
        Boolean bool = Boolean.TRUE;
        boolean f2 = epx.f(v0, bool);
        boolean f3 = epx.f(marketMarketItemDto.D0(), bool);
        boolean f4 = epx.f(marketMarketItemDto.y0(), bool);
        MarketItemRejectInfoDto K = marketMarketItemDto.K();
        MultipickerProduct.Moderation.Reject reject = K != null ? new MultipickerProduct.Moderation.Reject(K.getDescription(), K.f(), K.i(), K.e()) : null;
        List<BaseImageDto> W = marketMarketItemDto.W();
        MultipickerProduct.Moderation moderation = new MultipickerProduct.Moderation(f2, f3, f4, null, W != null ? bu00.t(W) : null, reject);
        List<BaseImageDto> W2 = marketMarketItemDto.W();
        Image t = W2 != null ? bu00.t(W2) : null;
        boolean f5 = epx.f(marketMarketItemDto.w0(), bool);
        boolean z2 = marketMarketItemDto.d().i() == MarketMarketItemAvailabilityDto.AVAILABLE.i();
        String url = marketMarketItemDto.getUrl();
        if (url == null) {
            url = "";
        }
        String r = marketMarketItemDto.r();
        MultipickerProduct.Owner owner2 = z ? owner : null;
        MarketMarketItemRatingDto u = marketMarketItemDto.u();
        if (!z) {
            u = null;
        }
        return new MultipickerProduct(multipickerProductId, title, price, moderation, t, f5, z2, url, r, owner2, u != null ? new MultipickerProduct.Rating(Float.valueOf(u.d()), Integer.valueOf(u.e()), u.f()) : null);
    }
}
