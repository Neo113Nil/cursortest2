package xsna;

import com.vk.api.generated.base.dto.BaseLinkProductCategoryDto;
import com.vk.dto.attachments.ProductCategory;

/* compiled from: BaseLinkProductToProduct.kt */
/* loaded from: classes3.dex */
public final class eg6 {
    public static ProductCategory a(BaseLinkProductCategoryDto baseLinkProductCategoryDto) {
        BaseLinkProductCategoryDto.MarketMarketCategoryNestedDto marketMarketCategoryNestedDto = baseLinkProductCategoryDto instanceof BaseLinkProductCategoryDto.MarketMarketCategoryNestedDto ? (BaseLinkProductCategoryDto.MarketMarketCategoryNestedDto) baseLinkProductCategoryDto : null;
        if (marketMarketCategoryNestedDto == null) {
            return null;
        }
        ProductCategory a = a(marketMarketCategoryNestedDto);
        int id = marketMarketCategoryNestedDto.getId();
        String d = marketMarketCategoryNestedDto.d();
        boolean z = true;
        if (marketMarketCategoryNestedDto.getId() != 12 && (a == null || !a.d)) {
            z = false;
        }
        return new ProductCategory(id, d, z);
    }
}
