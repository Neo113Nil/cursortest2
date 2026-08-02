package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/stories/dto/BackgroundJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/Background;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "nullableThemesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfThemesOfStringAdapter", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenImage;", "nullableCommunicationFullScreenImageAdapter", "Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "nullableImageScaleTypeDtoAdapter", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackgroundJsonAdapter extends JsonAdapter<Background> {
    private final JsonAdapter<CommunicationFullScreenImage> nullableCommunicationFullScreenImageAdapter;
    private final JsonAdapter<ImageScaleTypeDto> nullableImageScaleTypeDtoAdapter;
    private final JsonAdapter<List<Themes<String>>> nullableListOfThemesOfStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("color", "gradient_colors", "image", "scale_type");

    public BackgroundJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Themes.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableThemesOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "themedColor");
        this.nullableListOfThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, Types.newParameterizedType(Themes.class, String.class)), emptySet, "gradientColors");
        this.nullableCommunicationFullScreenImageAdapter = moshi.adapter(CommunicationFullScreenImage.class, emptySet, "image");
        this.nullableImageScaleTypeDtoAdapter = moshi.adapter(ImageScaleTypeDto.class, emptySet, "imageScaleType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Background fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Themes<String> themes = null;
        List<Themes<String>> list = null;
        CommunicationFullScreenImage communicationFullScreenImage = null;
        ImageScaleTypeDto imageScaleTypeDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                list = this.nullableListOfThemesOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                communicationFullScreenImage = this.nullableCommunicationFullScreenImageAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                imageScaleTypeDto = this.nullableImageScaleTypeDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new Background(themes, list, communicationFullScreenImage, imageScaleTypeDto);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Background background) {
        Background background2 = background;
        if (background2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) background2.getThemedColor());
        jsonWriter.name("gradient_colors");
        this.nullableListOfThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) background2.getGradientColors());
        jsonWriter.name("image");
        this.nullableCommunicationFullScreenImageAdapter.toJson(jsonWriter, (JsonWriter) background2.getImage());
        jsonWriter.name("scale_type");
        this.nullableImageScaleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) background2.getImageScaleType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(Background)");
    }
}
