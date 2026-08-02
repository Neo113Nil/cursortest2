package com.ybsdk.core.transfer.utils.domain.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Type;", "typeAdapter", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme;", "themesOfThemeAdapter", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnconditionalLimitWidgetDtoJsonAdapter extends JsonAdapter<UnconditionalLimitWidgetDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "action", "widget_type", "themes");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<WidgetDto.Theme>> themesOfThemeAdapter;
    private final JsonAdapter<WidgetDto.Type> typeAdapter;

    public UnconditionalLimitWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.typeAdapter = moshi.adapter(WidgetDto.Type.class, emptySet, "widgetType");
        this.themesOfThemeAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, WidgetDto.Theme.class), emptySet, "themes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UnconditionalLimitWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Themes<String> themes = null;
        String str2 = null;
        WidgetDto.Type type = null;
        Themes<WidgetDto.Theme> themes2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
            } else if (selectName == 1) {
                themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                type = this.typeAdapter.fromJson(jsonReader);
                if (type == null) {
                    throw Util.unexpectedNull("widgetType", "widget_type", jsonReader);
                }
            } else if (selectName == 4 && (themes2 = this.themesOfThemeAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("themes", "themes", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
        }
        if (type == null) {
            throw Util.missingProperty("widgetType", "widget_type", jsonReader);
        }
        if (themes2 != null) {
            return new UnconditionalLimitWidgetDto(str, themes, str2, type, themes2);
        }
        throw Util.missingProperty("themes", "themes", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UnconditionalLimitWidgetDto unconditionalLimitWidgetDto) {
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto2 = unconditionalLimitWidgetDto;
        if (unconditionalLimitWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) unconditionalLimitWidgetDto2.getDescription());
        jsonWriter.name("image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) unconditionalLimitWidgetDto2.getImage());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) unconditionalLimitWidgetDto2.getAction());
        jsonWriter.name("widget_type");
        this.typeAdapter.toJson(jsonWriter, (JsonWriter) unconditionalLimitWidgetDto2.getWidgetType());
        jsonWriter.name("themes");
        this.themesOfThemeAdapter.toJson(jsonWriter, (JsonWriter) unconditionalLimitWidgetDto2.getThemes());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(UnconditionalLimitWidgetDto)");
    }
}
