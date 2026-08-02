package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.SpoilerParamDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CardDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "productBackgroundDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "coloredTextDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV3Dto;", "balanceV3DtoAdapter", "nullableBalanceV3DtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "spoilerParamDtoAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdrop;", "nullableCarouselCardBackdropAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdrop;", "nullableCarouselCardDivkitBackdropAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardA11yDto;", "nullableCardA11yDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;", "nullableProductSkinDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardDtoJsonAdapter extends JsonAdapter<CardDto> {
    private final JsonAdapter<BalanceV3Dto> balanceV3DtoAdapter;
    private final JsonAdapter<ColoredTextDto> coloredTextDtoAdapter;
    private volatile Constructor<CardDto> constructorRef;
    private final JsonAdapter<BalanceV3Dto> nullableBalanceV3DtoAdapter;
    private final JsonAdapter<CardA11yDto> nullableCardA11yDtoAdapter;
    private final JsonAdapter<CarouselCardBackdrop> nullableCarouselCardBackdropAdapter;
    private final JsonAdapter<CarouselCardDivkitBackdrop> nullableCarouselCardDivkitBackdropAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<com.ybsdk.core.common.data.network.dto.ProductSkinDto> nullableProductSkinDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("view_id", C0553n3.g, "title", "title_icon", "icon_after_title", "balance", "additional_balance", "balance_spoiler_params", "backdrop", "divkit_backdrop", "divkit_overlay", "a11y", "skin");
    private final JsonAdapter<com.ybsdk.core.common.data.network.dto.ProductBackgroundDto> productBackgroundDtoAdapter;
    private final JsonAdapter<SpoilerParamDto> spoilerParamDtoAdapter;

    public CardDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "viewId");
        this.productBackgroundDtoAdapter = moshi.adapter(com.ybsdk.core.common.data.network.dto.ProductBackgroundDto.class, emptySet, C0553n3.g);
        this.coloredTextDtoAdapter = moshi.adapter(ColoredTextDto.class, emptySet, "title");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "titleIcon");
        this.balanceV3DtoAdapter = moshi.adapter(BalanceV3Dto.class, emptySet, "balance");
        this.nullableBalanceV3DtoAdapter = moshi.adapter(BalanceV3Dto.class, emptySet, "additionalBalance");
        this.spoilerParamDtoAdapter = moshi.adapter(SpoilerParamDto.class, emptySet, "balanceSpoilerParams");
        this.nullableCarouselCardBackdropAdapter = moshi.adapter(CarouselCardBackdrop.class, emptySet, "backdrop");
        this.nullableCarouselCardDivkitBackdropAdapter = moshi.adapter(CarouselCardDivkitBackdrop.class, emptySet, "divkitBackdrop");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitOverlay");
        this.nullableCardA11yDtoAdapter = moshi.adapter(CardA11yDto.class, emptySet, "a11y");
        this.nullableProductSkinDtoAdapter = moshi.adapter(com.ybsdk.core.common.data.network.dto.ProductSkinDto.class, emptySet, "skin");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CardDto fromJson(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        int i = -1;
        String str2 = null;
        com.ybsdk.core.common.data.network.dto.ProductBackgroundDto productBackgroundDto = null;
        ColoredTextDto coloredTextDto = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        BalanceV3Dto balanceV3Dto = null;
        BalanceV3Dto balanceV3Dto2 = null;
        SpoilerParamDto spoilerParamDto = null;
        CarouselCardBackdrop carouselCardBackdrop = null;
        CarouselCardDivkitBackdrop carouselCardDivkitBackdrop = null;
        DivDataDto divDataDto = null;
        CardA11yDto cardA11yDto = null;
        com.ybsdk.core.common.data.network.dto.ProductSkinDto productSkinDto = null;
        while (true) {
            String str3 = str2;
            com.ybsdk.core.common.data.network.dto.ProductBackgroundDto productBackgroundDto2 = productBackgroundDto;
            ColoredTextDto coloredTextDto2 = coloredTextDto;
            if (!jsonReader.hasNext()) {
                Themes<String> themes3 = themes;
                jsonReader.endObject();
                if (i == -17) {
                    if (productBackgroundDto2 == null) {
                        throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
                    }
                    if (coloredTextDto2 == null) {
                        throw Util.missingProperty("title", "title", jsonReader);
                    }
                    if (balanceV3Dto == null) {
                        throw Util.missingProperty("balance", "balance", jsonReader);
                    }
                    if (spoilerParamDto == null) {
                        throw Util.missingProperty("balanceSpoilerParams", "balance_spoiler_params", jsonReader);
                    }
                    CarouselCardBackdrop carouselCardBackdrop2 = carouselCardBackdrop;
                    SpoilerParamDto spoilerParamDto2 = spoilerParamDto;
                    return new CardDto(str3, productBackgroundDto2, coloredTextDto2, themes3, themes2, balanceV3Dto, balanceV3Dto2, spoilerParamDto2, carouselCardBackdrop2, carouselCardDivkitBackdrop, divDataDto, cardA11yDto, productSkinDto);
                }
                int i2 = i;
                Constructor<CardDto> constructor = this.constructorRef;
                if (constructor == null) {
                    str = str3;
                    constructor = CardDto.class.getDeclaredConstructor(String.class, com.ybsdk.core.common.data.network.dto.ProductBackgroundDto.class, ColoredTextDto.class, Themes.class, Themes.class, BalanceV3Dto.class, BalanceV3Dto.class, SpoilerParamDto.class, CarouselCardBackdrop.class, CarouselCardDivkitBackdrop.class, DivDataDto.class, CardA11yDto.class, com.ybsdk.core.common.data.network.dto.ProductSkinDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    str = str3;
                }
                if (productBackgroundDto2 == null) {
                    throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
                }
                if (coloredTextDto2 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (balanceV3Dto == null) {
                    throw Util.missingProperty("balance", "balance", jsonReader);
                }
                if (spoilerParamDto == null) {
                    throw Util.missingProperty("balanceSpoilerParams", "balance_spoiler_params", jsonReader);
                }
                return constructor.newInstance(str, productBackgroundDto2, coloredTextDto2, themes3, themes2, balanceV3Dto, balanceV3Dto2, spoilerParamDto, carouselCardBackdrop, carouselCardDivkitBackdrop, divDataDto, cardA11yDto, productSkinDto, Integer.valueOf(i2), null);
            }
            Themes<String> themes4 = themes;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 0:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    themes = themes4;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 1:
                    productBackgroundDto = this.productBackgroundDtoAdapter.fromJson(jsonReader);
                    if (productBackgroundDto == null) {
                        throw Util.unexpectedNull(C0553n3.g, C0553n3.g, jsonReader);
                    }
                    themes = themes4;
                    str2 = str3;
                    coloredTextDto = coloredTextDto2;
                case 2:
                    coloredTextDto = this.coloredTextDtoAdapter.fromJson(jsonReader);
                    if (coloredTextDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                case 3:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 4:
                    themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                    i = -17;
                case 5:
                    balanceV3Dto = this.balanceV3DtoAdapter.fromJson(jsonReader);
                    if (balanceV3Dto == null) {
                        throw Util.unexpectedNull("balance", "balance", jsonReader);
                    }
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 6:
                    balanceV3Dto2 = this.nullableBalanceV3DtoAdapter.fromJson(jsonReader);
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 7:
                    spoilerParamDto = this.spoilerParamDtoAdapter.fromJson(jsonReader);
                    if (spoilerParamDto == null) {
                        throw Util.unexpectedNull("balanceSpoilerParams", "balance_spoiler_params", jsonReader);
                    }
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 8:
                    carouselCardBackdrop = this.nullableCarouselCardBackdropAdapter.fromJson(jsonReader);
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 9:
                    carouselCardDivkitBackdrop = this.nullableCarouselCardDivkitBackdropAdapter.fromJson(jsonReader);
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 10:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 11:
                    cardA11yDto = this.nullableCardA11yDtoAdapter.fromJson(jsonReader);
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                case 12:
                    productSkinDto = this.nullableProductSkinDtoAdapter.fromJson(jsonReader);
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
                default:
                    themes = themes4;
                    str2 = str3;
                    productBackgroundDto = productBackgroundDto2;
                    coloredTextDto = coloredTextDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardDto cardDto) {
        CardDto cardDto2 = cardDto;
        if (cardDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("view_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getViewId());
        jsonWriter.name(C0553n3.g);
        this.productBackgroundDtoAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getBackground());
        jsonWriter.name("title");
        this.coloredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getTitle());
        jsonWriter.name("title_icon");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getTitleIcon());
        jsonWriter.name("icon_after_title");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getIconAfterTitle());
        jsonWriter.name("balance");
        this.balanceV3DtoAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getBalance());
        jsonWriter.name("additional_balance");
        this.nullableBalanceV3DtoAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getAdditionalBalance());
        jsonWriter.name("balance_spoiler_params");
        this.spoilerParamDtoAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getBalanceSpoilerParams());
        jsonWriter.name("backdrop");
        this.nullableCarouselCardBackdropAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getBackdrop());
        jsonWriter.name("divkit_backdrop");
        this.nullableCarouselCardDivkitBackdropAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getDivkitBackdrop());
        jsonWriter.name("divkit_overlay");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getDivkitOverlay());
        jsonWriter.name("a11y");
        this.nullableCardA11yDtoAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getA11y());
        jsonWriter.name("skin");
        this.nullableProductSkinDtoAdapter.toJson(jsonWriter, (JsonWriter) cardDto2.getSkin());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(29, "GeneratedJsonAdapter(CardDto)");
    }
}
