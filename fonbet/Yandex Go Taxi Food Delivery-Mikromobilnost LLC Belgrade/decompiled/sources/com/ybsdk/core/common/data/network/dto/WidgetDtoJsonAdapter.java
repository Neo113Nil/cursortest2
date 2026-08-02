package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Condition;", "conditionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Button;", "nullableButtonAdapter", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Type;", "typeAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme;", "themesOfThemeAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WidgetDtoJsonAdapter extends JsonAdapter<WidgetDto> {
    private final JsonAdapter<WidgetDto.Condition> conditionAdapter;
    private final JsonAdapter<WidgetDto.Button> nullableButtonAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("condition", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "button", "action", "widget_type", "themes");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<WidgetDto.Theme>> themesOfThemeAdapter;
    private final JsonAdapter<WidgetDto.Type> typeAdapter;

    public WidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.conditionAdapter = moshi.adapter(WidgetDto.Condition.class, emptySet, "condition");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableButtonAdapter = moshi.adapter(WidgetDto.Button.class, emptySet, "button");
        this.typeAdapter = moshi.adapter(WidgetDto.Type.class, emptySet, "type");
        this.themesOfThemeAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, WidgetDto.Theme.class), emptySet, "themes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        WidgetDto.Condition condition = null;
        String str = null;
        String str2 = null;
        WidgetDto.Button button = null;
        String str3 = null;
        WidgetDto.Type type = null;
        Themes<WidgetDto.Theme> themes = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    condition = this.conditionAdapter.fromJson(jsonReader);
                    if (condition == null) {
                        throw Util.unexpectedNull("condition", "condition", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    button = this.nullableButtonAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    type = this.typeAdapter.fromJson(jsonReader);
                    if (type == null) {
                        throw Util.unexpectedNull("type", "widget_type", jsonReader);
                    }
                    break;
                case 6:
                    themes = this.themesOfThemeAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("themes", "themes", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (condition == null) {
            throw Util.missingProperty("condition", "condition", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (type == null) {
            throw Util.missingProperty("type", "widget_type", jsonReader);
        }
        if (themes != null) {
            return new WidgetDto(condition, str, str2, button, str3, type, themes);
        }
        throw Util.missingProperty("themes", "themes", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WidgetDto widgetDto) {
        WidgetDto widgetDto2 = widgetDto;
        if (widgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("condition");
        this.conditionAdapter.toJson(jsonWriter, (JsonWriter) widgetDto2.getCondition());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) widgetDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) widgetDto2.getDescription());
        jsonWriter.name("button");
        this.nullableButtonAdapter.toJson(jsonWriter, (JsonWriter) widgetDto2.getButton());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) widgetDto2.getAction());
        jsonWriter.name("widget_type");
        this.typeAdapter.toJson(jsonWriter, (JsonWriter) widgetDto2.getType());
        jsonWriter.name("themes");
        this.themesOfThemeAdapter.toJson(jsonWriter, (JsonWriter) widgetDto2.getThemes());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(WidgetDto)");
    }
}
