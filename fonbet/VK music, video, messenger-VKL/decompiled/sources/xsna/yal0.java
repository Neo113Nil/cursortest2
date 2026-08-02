package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.stickers.dto.StickersPopupSettingsAutoplayDto;
import com.vk.api.generated.stickers.dto.StickersSuggestionsPredictiveSearchConfigDto;
import com.vk.api.generated.stickers.dto.StickersSuggestionsSpecialItemsConfigDto;
import com.vk.api.generated.stickers.dto.StickersSuggestionsSpecialItemsGiftConfigDto;
import com.vk.api.generated.store.dto.StoreGetProductsResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersKeywordsResponseDto;
import com.vk.api.generated.store.dto.StoreProductDto;
import com.vk.api.generated.store.dto.StoreStickersKeywordDto;
import com.vk.api.generated.store.dto.StoreStickersKeywordStickerDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stickers.GiftSuggestionConfig;
import com.vk.dto.stickers.KeywordsDictionaryChunk;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.dto.stickers.PredictiveSearchConfig;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.dto.stickers.StickersProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StickersMappers.kt */
/* loaded from: classes3.dex */
public final class yal0 {
    public static final List<StickersProduct> a(StoreGetProductsResponseDto storeGetProductsResponseDto) {
        List<StoreProductDto> d;
        if (storeGetProductsResponseDto == null || (d = storeGetProductsResponseDto.d()) == null) {
            return EmptyList.b;
        }
        List<StoreProductDto> list = d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (StoreProductDto storeProductDto : list) {
            int id = storeProductDto.getId();
            Integer e = storeProductDto.e();
            List<Integer> p = storeProductDto.p();
            if (p == null) {
                p = EmptyList.b;
            }
            BaseBoolIntDto n = storeProductDto.n();
            boolean z = false;
            boolean z2 = n != null && n.i() == 1;
            BaseBoolIntDto d2 = storeProductDto.d();
            if (d2 != null && d2.i() == 1) {
                z = true;
            }
            arrayList.add(new StickersProduct(id, e, p, z2, z));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    public static final KeywordsDictionaryChunk b(StoreGetStickersKeywordsResponseDto storeGetStickersKeywordsResponseDto) {
        GiftSuggestionConfig giftSuggestionConfig;
        List<BaseImageDto> e;
        List<BaseImageDto> d;
        ?? r7;
        List<StoreStickersKeywordDto> f = storeGetStickersKeywordsResponseDto.f();
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        Iterator it = f.iterator();
        while (true) {
            r4 = false;
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            StoreStickersKeywordDto storeStickersKeywordDto = (StoreStickersKeywordDto) it.next();
            List<String> g = storeStickersKeywordDto.g();
            List<StoreStickersKeywordStickerDto> e2 = storeStickersKeywordDto.e();
            if (e2 != null) {
                List<StoreStickersKeywordStickerDto> list = e2;
                r7 = new ArrayList(c5g.u(list, 10));
                for (StoreStickersKeywordStickerDto storeStickersKeywordStickerDto : list) {
                    r7.add(new StickersDictionaryItemLight.DictionaryStickerModel(storeStickersKeywordStickerDto.d(), storeStickersKeywordStickerDto.e()));
                }
            } else {
                r7 = EmptyList.b;
            }
            if (storeStickersKeywordDto.d() != null && (!r3.isEmpty())) {
                z = true;
            }
            arrayList.add(new StickersDictionaryItemLight(g, r7, z));
        }
        Integer d2 = storeGetStickersKeywordsResponseDto.d();
        int intValue = d2 != null ? d2.intValue() : 0;
        String e3 = storeGetStickersKeywordsResponseDto.e();
        if (e3 == null) {
            e3 = "";
        }
        String str = e3;
        StickersSuggestionsPredictiveSearchConfigDto g2 = storeGetStickersKeywordsResponseDto.g();
        PredictiveSearchConfig predictiveSearchConfig = g2 != null ? new PredictiveSearchConfig(g2.g(), g2.f(), g2.e(), g2.d(), g2.i()) : new PredictiveSearchConfig(0, 0, 0, 0, null, 31, null);
        StickersSuggestionsSpecialItemsConfigDto i = storeGetStickersKeywordsResponseDto.i();
        if (i != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            StickersSuggestionsSpecialItemsGiftConfigDto d3 = i.d();
            if (d3 != null && (d = d3.d()) != null) {
                for (BaseImageDto baseImageDto : d) {
                    ImageSize imageSize = new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null);
                    if (baseImageDto.d() == BaseImageDto.ThemeDto.DARK) {
                        arrayList3.add(imageSize);
                    } else {
                        arrayList2.add(imageSize);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            StickersSuggestionsSpecialItemsGiftConfigDto d4 = i.d();
            if (d4 != null && (e = d4.e()) != null) {
                for (BaseImageDto baseImageDto2 : e) {
                    ImageSize imageSize2 = new ImageSize(baseImageDto2.getUrl(), baseImageDto2.getWidth(), baseImageDto2.getHeight(), baseImageDto2.e(), (char) 0, false, 48, null);
                    if (baseImageDto2.d() == BaseImageDto.ThemeDto.DARK) {
                        arrayList5.add(imageSize2);
                    } else {
                        arrayList4.add(imageSize2);
                    }
                }
            }
            giftSuggestionConfig = new GiftSuggestionConfig(new Image(arrayList2), new Image(arrayList3), new Image(arrayList4), new Image(arrayList5));
        } else {
            giftSuggestionConfig = null;
        }
        return new KeywordsDictionaryChunk(arrayList, intValue, str, predictiveSearchConfig, giftSuggestionConfig);
    }

    public static final PopupStickersChatSettingsModel c(StickersPopupSettingsAutoplayDto stickersPopupSettingsAutoplayDto) {
        boolean f = stickersPopupSettingsAutoplayDto.f();
        boolean e = stickersPopupSettingsAutoplayDto.e();
        List<Integer> d = stickersPopupSettingsAutoplayDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) it.next()).intValue()));
        }
        return new PopupStickersChatSettingsModel(f, e, arrayList);
    }
}
