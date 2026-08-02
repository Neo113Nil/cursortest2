package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.store.dto.StoreStockItemDiscountDto;
import com.vk.api.generated.store.dto.StoreStockItemDiscountsDto;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.bonus.StickerStockItemDiscount;
import com.vk.dto.stickers.bonus.StickerStockItemDiscounts;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StickersBonusDtoMapper.kt */
/* loaded from: classes5.dex */
public final class u8l0 {
    public static ImageList a(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        List<BaseImageDto> list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        for (BaseImageDto baseImageDto : list3) {
            arrayList.add(new Image(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl(), epx.f(baseImageDto.e(), Boolean.TRUE)));
        }
        return new ImageList(new ArrayList(arrayList));
    }

    public static StickerStockItemDiscounts b(StoreStockItemDiscountsDto storeStockItemDiscountsDto) {
        if (storeStockItemDiscountsDto == null) {
            return new StickerStockItemDiscounts(EmptyList.b, null);
        }
        List<StoreStockItemDiscountDto> d = storeStockItemDiscountsDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (StoreStockItemDiscountDto storeStockItemDiscountDto : d) {
            arrayList.add(new StickerStockItemDiscount(storeStockItemDiscountDto.e(), a(storeStockItemDiscountDto.d()), storeStockItemDiscountDto.f()));
        }
        return new StickerStockItemDiscounts(arrayList, storeStockItemDiscountsDto.e());
    }
}
