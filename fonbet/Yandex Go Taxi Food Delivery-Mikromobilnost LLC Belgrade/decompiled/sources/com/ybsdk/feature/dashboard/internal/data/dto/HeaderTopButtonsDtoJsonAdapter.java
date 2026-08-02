package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/HeaderTopButtonsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/HeaderTopButtonsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ToolbarHorizontalAlignment;", "nullableToolbarHorizontalAlignmentAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeaderTopButtonsDtoJsonAdapter extends JsonAdapter<HeaderTopButtonsDto> {
    private final JsonAdapter<ToolbarHorizontalAlignment> nullableToolbarHorizontalAlignmentAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("action", "image", "tag", "horizontal_alignment");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public HeaderTopButtonsDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
        this.nullableToolbarHorizontalAlignmentAdapter = moshi.adapter(ToolbarHorizontalAlignment.class, emptySet, "alignment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HeaderTopButtonsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Themes<String> themes = null;
        String str2 = null;
        ToolbarHorizontalAlignment toolbarHorizontalAlignment = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("action", "action", jsonReader);
                }
            } else if (selectName == 1) {
                themes = this.themesOfStringAdapter.fromJson(jsonReader);
                if (themes == null) {
                    throw Util.unexpectedNull("image", "image", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("tag", "tag", jsonReader);
                }
            } else if (selectName == 3) {
                toolbarHorizontalAlignment = this.nullableToolbarHorizontalAlignmentAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("action", "action", jsonReader);
        }
        if (themes == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (str2 != null) {
            return new HeaderTopButtonsDto(str, themes, str2, toolbarHorizontalAlignment);
        }
        throw Util.missingProperty("tag", "tag", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HeaderTopButtonsDto headerTopButtonsDto) {
        HeaderTopButtonsDto headerTopButtonsDto2 = headerTopButtonsDto;
        if (headerTopButtonsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) headerTopButtonsDto2.getAction());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) headerTopButtonsDto2.getImage());
        jsonWriter.name("tag");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) headerTopButtonsDto2.getTag());
        jsonWriter.name("horizontal_alignment");
        this.nullableToolbarHorizontalAlignmentAdapter.toJson(jsonWriter, (JsonWriter) headerTopButtonsDto2.getAlignment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(HeaderTopButtonsDto)");
    }
}
