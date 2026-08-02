package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.adapters.SkipFailingElements;
import com.ybsdk.core.common.data.network.dto.ProductSkinV4Dto;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsV4ResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsV4ResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/main/internal/data/network/dto/QuickActionsHeaderDto;", "nullableQuickActionsHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductScreenItemDto;", "listOfProductScreenItemDtoAtSkipFailingElementsAdapter", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "nullableListOfFullScreenDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "nullableListOfEducationsV2DtoAdapter", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipDto;", "nullableListOfServerTooltipDtoAdapter", "", "", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinV4Dto;", "nullableMapOfStringProductSkinV4DtoAdapter", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenProductsV4ResponseDtoJsonAdapter extends JsonAdapter<ScreenProductsV4ResponseDto> {
    private final JsonAdapter<List<ProductScreenItemDto>> listOfProductScreenItemDtoAtSkipFailingElementsAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<List<EducationsV2Dto>> nullableListOfEducationsV2DtoAdapter;
    private final JsonAdapter<List<FullScreenDto>> nullableListOfFullScreenDtoAdapter;
    private final JsonAdapter<List<ServerTooltipDto>> nullableListOfServerTooltipDtoAdapter;
    private final JsonAdapter<Map<String, ProductSkinV4Dto>> nullableMapOfStringProductSkinV4DtoAdapter;
    private final JsonAdapter<QuickActionsHeaderDto> nullableQuickActionsHeaderDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("quick_actions_header", "common_div_data", "screen_items", "fullscreens", "div_user_info_block", "educations_v2", "small_tooltips", "products_skins");

    public ScreenProductsV4ResponseDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableQuickActionsHeaderDtoAdapter = moshi.adapter(QuickActionsHeaderDto.class, emptySet, "quickActionsHeader");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonDivData");
        this.listOfProductScreenItemDtoAtSkipFailingElementsAdapter = moshi.adapter(Types.newParameterizedType(List.class, ProductScreenItemDto.class), Collections.singleton(new SkipFailingElements() { // from class: com.ybsdk.feature.main.internal.data.network.dto.ScreenProductsV4ResponseDtoJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return SkipFailingElements.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof SkipFailingElements;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.ybsdk.core.common.data.network.adapters.SkipFailingElements()";
            }
        }), "screenItems");
        this.nullableListOfFullScreenDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FullScreenDto.class), emptySet, "fullScreens");
        this.nullableListOfEducationsV2DtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, EducationsV2Dto.class), emptySet, "educationsV2");
        this.nullableListOfServerTooltipDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ServerTooltipDto.class), emptySet, "smallTooltips");
        this.nullableMapOfStringProductSkinV4DtoAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, ProductSkinV4Dto.class), emptySet, "productsSkins");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScreenProductsV4ResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        QuickActionsHeaderDto quickActionsHeaderDto = null;
        DivDataDto divDataDto = null;
        List<ProductScreenItemDto> list = null;
        List<FullScreenDto> list2 = null;
        DivDataDto divDataDto2 = null;
        List<EducationsV2Dto> list3 = null;
        List<ServerTooltipDto> list4 = null;
        Map<String, ProductSkinV4Dto> map = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    quickActionsHeaderDto = this.nullableQuickActionsHeaderDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    list = this.listOfProductScreenItemDtoAtSkipFailingElementsAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("screenItems", "screen_items", jsonReader);
                    }
                    break;
                case 3:
                    list2 = this.nullableListOfFullScreenDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    divDataDto2 = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list3 = this.nullableListOfEducationsV2DtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list4 = this.nullableListOfServerTooltipDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    map = this.nullableMapOfStringProductSkinV4DtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new ScreenProductsV4ResponseDto(quickActionsHeaderDto, divDataDto, list, list2, divDataDto2, list3, list4, map);
        }
        throw Util.missingProperty("screenItems", "screen_items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScreenProductsV4ResponseDto screenProductsV4ResponseDto) {
        ScreenProductsV4ResponseDto screenProductsV4ResponseDto2 = screenProductsV4ResponseDto;
        if (screenProductsV4ResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("quick_actions_header");
        this.nullableQuickActionsHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsV4ResponseDto2.getQuickActionsHeader());
        jsonWriter.name("common_div_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsV4ResponseDto2.getCommonDivData());
        jsonWriter.name("screen_items");
        this.listOfProductScreenItemDtoAtSkipFailingElementsAdapter.toJson(jsonWriter, (JsonWriter) screenProductsV4ResponseDto2.getScreenItems());
        jsonWriter.name("fullscreens");
        this.nullableListOfFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsV4ResponseDto2.getFullScreens());
        jsonWriter.name("div_user_info_block");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsV4ResponseDto2.getDivUserInfoBlock());
        jsonWriter.name("educations_v2");
        this.nullableListOfEducationsV2DtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsV4ResponseDto2.getEducationsV2());
        jsonWriter.name("small_tooltips");
        this.nullableListOfServerTooltipDtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsV4ResponseDto2.getSmallTooltips());
        jsonWriter.name("products_skins");
        this.nullableMapOfStringProductSkinV4DtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsV4ResponseDto2.getProductsSkins());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(ScreenProductsV4ResponseDto)");
    }
}
