package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ProductBackgroundDto;
import com.ybsdk.core.common.data.network.dto.ProductSkinDto;
import com.ybsdk.core.common.data.network.dto.SpoilerParamDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR(\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ProductDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductTypeDto;", "productTypeDtoAdapter", "", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableListOfThemesOfStringAdapter", "themesOfStringAdapter", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductRightPartDto;", "nullableProductRightPartDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "spoilerParamDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "productBackgroundDtoAdapter", "nullableThemesOfStringAdapter", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductA11yDto;", "nullableProductA11yDtoAdapter", "", "nullableIntAdapter", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;", "nullableProductSkinDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductDtoJsonAdapter extends JsonAdapter<ProductDto> {
    private volatile Constructor<ProductDto> constructorRef;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<Themes<String>>> nullableListOfThemesOfStringAdapter;
    private final JsonAdapter<ProductA11yDto> nullableProductA11yDtoAdapter;
    private final JsonAdapter<ProductRightPartDto> nullableProductRightPartDtoAdapter;
    private final JsonAdapter<ProductSkinDto> nullableProductSkinDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "view_id", "type", "action", "icons", "title", "title_color", "product_right_part", "spoiler_params", C0553n3.g, "icon_after_title", "a11y", "icon_corner_radius", "skin", "product_caption");
    private final JsonAdapter<ProductBackgroundDto> productBackgroundDtoAdapter;
    private final JsonAdapter<ProductTypeDto> productTypeDtoAdapter;
    private final JsonAdapter<SpoilerParamDto> spoilerParamDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public ProductDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "viewId");
        this.productTypeDtoAdapter = moshi.adapter(ProductTypeDto.class, emptySet, "type");
        this.nullableListOfThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, Types.newParameterizedType(Themes.class, String.class)), emptySet, "icons");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "titleColor");
        this.nullableProductRightPartDtoAdapter = moshi.adapter(ProductRightPartDto.class, emptySet, "productRightPart");
        this.spoilerParamDtoAdapter = moshi.adapter(SpoilerParamDto.class, emptySet, "spoilerParam");
        this.productBackgroundDtoAdapter = moshi.adapter(ProductBackgroundDto.class, emptySet, C0553n3.g);
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "iconAfterTitle");
        this.nullableProductA11yDtoAdapter = moshi.adapter(ProductA11yDto.class, emptySet, "a11y");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "iconCornerRadius");
        this.nullableProductSkinDtoAdapter = moshi.adapter(ProductSkinDto.class, emptySet, "skin");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "productCaption");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductDto fromJson(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        int i = -1;
        String str2 = null;
        String str3 = null;
        ProductTypeDto productTypeDto = null;
        String str4 = null;
        List<Themes<String>> list = null;
        String str5 = null;
        Themes<String> themes = null;
        ProductRightPartDto productRightPartDto = null;
        SpoilerParamDto spoilerParamDto = null;
        ProductBackgroundDto productBackgroundDto = null;
        Themes<String> themes2 = null;
        ProductA11yDto productA11yDto = null;
        Integer num = null;
        ProductSkinDto productSkinDto = null;
        DivDataDto divDataDto = null;
        while (true) {
            String str6 = str2;
            String str7 = str3;
            ProductTypeDto productTypeDto2 = productTypeDto;
            String str8 = str4;
            List<Themes<String>> list2 = list;
            String str9 = str5;
            Themes<String> themes3 = themes;
            if (!jsonReader.hasNext()) {
                ProductRightPartDto productRightPartDto2 = productRightPartDto;
                jsonReader.endObject();
                if (i == -1025) {
                    if (str6 == null) {
                        throw Util.missingProperty("id", "id", jsonReader);
                    }
                    if (productTypeDto2 == null) {
                        throw Util.missingProperty("type", "type", jsonReader);
                    }
                    if (str8 == null) {
                        throw Util.missingProperty("action", "action", jsonReader);
                    }
                    if (str9 == null) {
                        throw Util.missingProperty("title", "title", jsonReader);
                    }
                    if (themes3 == null) {
                        throw Util.missingProperty("titleColor", "title_color", jsonReader);
                    }
                    if (spoilerParamDto == null) {
                        throw Util.missingProperty("spoilerParam", "spoiler_params", jsonReader);
                    }
                    if (productBackgroundDto != null) {
                        return new ProductDto(str6, str7, productTypeDto2, str8, list2, str9, themes3, productRightPartDto2, spoilerParamDto, productBackgroundDto, themes2, productA11yDto, num, productSkinDto, divDataDto);
                    }
                    throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
                }
                int i2 = i;
                Constructor<ProductDto> constructor = this.constructorRef;
                if (constructor == null) {
                    str = str9;
                    constructor = ProductDto.class.getDeclaredConstructor(String.class, String.class, ProductTypeDto.class, String.class, List.class, String.class, Themes.class, ProductRightPartDto.class, SpoilerParamDto.class, ProductBackgroundDto.class, Themes.class, ProductA11yDto.class, Integer.class, ProductSkinDto.class, DivDataDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    str = str9;
                }
                Constructor<ProductDto> constructor2 = constructor;
                if (str6 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (productTypeDto2 == null) {
                    throw Util.missingProperty("type", "type", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("action", "action", jsonReader);
                }
                if (str == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (themes3 == null) {
                    throw Util.missingProperty("titleColor", "title_color", jsonReader);
                }
                if (spoilerParamDto == null) {
                    throw Util.missingProperty("spoilerParam", "spoiler_params", jsonReader);
                }
                if (productBackgroundDto == null) {
                    throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
                }
                return constructor2.newInstance(str6, str7, productTypeDto2, str8, list2, str, themes3, productRightPartDto2, spoilerParamDto, productBackgroundDto, themes2, productA11yDto, num, productSkinDto, divDataDto, Integer.valueOf(i2), null);
            }
            ProductRightPartDto productRightPartDto3 = productRightPartDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    productRightPartDto = productRightPartDto3;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 1:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 2:
                    productTypeDto = this.productTypeDtoAdapter.fromJson(jsonReader);
                    if (productTypeDto == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 4:
                    list = this.nullableListOfThemesOfStringAdapter.fromJson(jsonReader);
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    str5 = str9;
                    themes = themes3;
                case 5:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str5 = fromJson;
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    themes = themes3;
                case 6:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("titleColor", "title_color", jsonReader);
                    }
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                case 7:
                    productRightPartDto = this.nullableProductRightPartDtoAdapter.fromJson(jsonReader);
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 8:
                    spoilerParamDto = this.spoilerParamDtoAdapter.fromJson(jsonReader);
                    if (spoilerParamDto == null) {
                        throw Util.unexpectedNull("spoilerParam", "spoiler_params", jsonReader);
                    }
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 9:
                    productBackgroundDto = this.productBackgroundDtoAdapter.fromJson(jsonReader);
                    if (productBackgroundDto == null) {
                        throw Util.unexpectedNull(C0553n3.g, C0553n3.g, jsonReader);
                    }
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 10:
                    themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                    i = -1025;
                case 11:
                    productA11yDto = this.nullableProductA11yDtoAdapter.fromJson(jsonReader);
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 12:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 13:
                    productSkinDto = this.nullableProductSkinDtoAdapter.fromJson(jsonReader);
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                case 14:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
                default:
                    productRightPartDto = productRightPartDto3;
                    str2 = str6;
                    str3 = str7;
                    productTypeDto = productTypeDto2;
                    str4 = str8;
                    list = list2;
                    str5 = str9;
                    themes = themes3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductDto productDto) {
        ProductDto productDto2 = productDto;
        if (productDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getId());
        jsonWriter.name("view_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getViewId());
        jsonWriter.name("type");
        this.productTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getType());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getAction());
        jsonWriter.name("icons");
        this.nullableListOfThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getIcons());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getTitle());
        jsonWriter.name("title_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getTitleColor());
        jsonWriter.name("product_right_part");
        this.nullableProductRightPartDtoAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getProductRightPart());
        jsonWriter.name("spoiler_params");
        this.spoilerParamDtoAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getSpoilerParam());
        jsonWriter.name(C0553n3.g);
        this.productBackgroundDtoAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getBackground());
        jsonWriter.name("icon_after_title");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getIconAfterTitle());
        jsonWriter.name("a11y");
        this.nullableProductA11yDtoAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getA11y());
        jsonWriter.name("icon_corner_radius");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getIconCornerRadius());
        jsonWriter.name("skin");
        this.nullableProductSkinDtoAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getSkin());
        jsonWriter.name("product_caption");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) productDto2.getProductCaption());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(ProductDto)");
    }
}
