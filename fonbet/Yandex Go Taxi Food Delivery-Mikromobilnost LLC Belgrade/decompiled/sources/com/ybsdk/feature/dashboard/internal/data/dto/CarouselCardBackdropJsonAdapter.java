package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdropJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdrop;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "coloredTextDtoAdapter", "nullableThemesOfStringAdapter", "nullableStringAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarouselCardBackdropJsonAdapter extends JsonAdapter<CarouselCardBackdrop> {
    private final JsonAdapter<ColoredTextDto> coloredTextDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("background_color", "amount", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "action_image", "action", "image", "analytics_id");
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public CarouselCardBackdropJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Themes.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themesOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.coloredTextDtoAdapter = moshi.adapter(ColoredTextDto.class, emptySet, "amount");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "actionImage");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "action");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CarouselCardBackdrop fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Themes<String> themes = null;
        ColoredTextDto coloredTextDto = null;
        ColoredTextDto coloredTextDto2 = null;
        Themes<String> themes2 = null;
        String str = null;
        Themes<String> themes3 = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    break;
                case 1:
                    coloredTextDto = this.coloredTextDtoAdapter.fromJson(jsonReader);
                    if (coloredTextDto == null) {
                        throw Util.unexpectedNull("amount", "amount", jsonReader);
                    }
                    break;
                case 2:
                    coloredTextDto2 = this.coloredTextDtoAdapter.fromJson(jsonReader);
                    if (coloredTextDto2 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    break;
                case 3:
                    themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    themes3 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (themes == null) {
            throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
        }
        if (coloredTextDto == null) {
            throw Util.missingProperty("amount", "amount", jsonReader);
        }
        if (coloredTextDto2 != null) {
            return new CarouselCardBackdrop(themes, coloredTextDto, coloredTextDto2, themes2, str, themes3, str2);
        }
        throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CarouselCardBackdrop carouselCardBackdrop) {
        CarouselCardBackdrop carouselCardBackdrop2 = carouselCardBackdrop;
        if (carouselCardBackdrop2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("background_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardBackdrop2.getBackgroundColor());
        jsonWriter.name("amount");
        this.coloredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) carouselCardBackdrop2.getAmount());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.coloredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) carouselCardBackdrop2.getDescription());
        jsonWriter.name("action_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardBackdrop2.getActionImage());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardBackdrop2.getAction());
        jsonWriter.name("image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardBackdrop2.getImage());
        jsonWriter.name("analytics_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardBackdrop2.getAnalyticsId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(CarouselCardBackdrop)");
    }
}
