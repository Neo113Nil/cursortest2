package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ProductSubtitleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductSubtitle;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "", "nullableBooleanAdapter", "nullableThemesOfStringAdapter", "Lcom/ybsdk/feature/main/internal/data/network/dto/RadialGradientDto;", "nullableRadialGradientDtoAdapter", "Lcom/ybsdk/feature/main/internal/data/network/dto/SubtitleTypeDto;", "nullableSubtitleTypeDtoAdapter", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductSubtitleJsonAdapter extends JsonAdapter<ProductSubtitle> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<RadialGradientDto> nullableRadialGradientDtoAdapter;
    private final JsonAdapter<SubtitleTypeDto> nullableSubtitleTypeDtoAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("money", "subtitle_color", "should_animate_subtitle", "shimmer_animate_color", "icon", "radial_gradient", "type");
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public ProductSubtitleJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "subtitleColor");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "shouldAnimateSubtitle");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "shimmerAnimateColor");
        this.nullableRadialGradientDtoAdapter = moshi.adapter(RadialGradientDto.class, emptySet, "radialGradient");
        this.nullableSubtitleTypeDtoAdapter = moshi.adapter(SubtitleTypeDto.class, emptySet, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductSubtitle fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        Themes<String> themes = null;
        Boolean bool = null;
        Themes<String> themes2 = null;
        Themes<String> themes3 = null;
        RadialGradientDto radialGradientDto = null;
        SubtitleTypeDto subtitleTypeDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("money", "money", jsonReader);
                    }
                    break;
                case 1:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("subtitleColor", "subtitle_color", jsonReader);
                    }
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    themes3 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    radialGradientDto = this.nullableRadialGradientDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    subtitleTypeDto = this.nullableSubtitleTypeDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (money == null) {
            throw Util.missingProperty("money", "money", jsonReader);
        }
        if (themes != null) {
            return new ProductSubtitle(money, themes, bool, themes2, themes3, radialGradientDto, subtitleTypeDto);
        }
        throw Util.missingProperty("subtitleColor", "subtitle_color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductSubtitle productSubtitle) {
        ProductSubtitle productSubtitle2 = productSubtitle;
        if (productSubtitle2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) productSubtitle2.getMoney());
        jsonWriter.name("subtitle_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSubtitle2.getSubtitleColor());
        jsonWriter.name("should_animate_subtitle");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) productSubtitle2.getShouldAnimateSubtitle());
        jsonWriter.name("shimmer_animate_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSubtitle2.getShimmerAnimateColor());
        jsonWriter.name("icon");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSubtitle2.getIcon());
        jsonWriter.name("radial_gradient");
        this.nullableRadialGradientDtoAdapter.toJson(jsonWriter, (JsonWriter) productSubtitle2.getRadialGradient());
        jsonWriter.name("type");
        this.nullableSubtitleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) productSubtitle2.getType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(ProductSubtitle)");
    }
}
