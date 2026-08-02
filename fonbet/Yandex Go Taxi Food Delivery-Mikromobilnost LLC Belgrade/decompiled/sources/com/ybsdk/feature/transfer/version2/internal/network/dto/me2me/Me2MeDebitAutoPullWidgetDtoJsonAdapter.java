package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme;", "themesOfThemeAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitAutoPullWidgetDtoJsonAdapter extends JsonAdapter<Me2MeDebitAutoPullWidgetDto> {
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "themes");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<WidgetDto.Theme>> themesOfThemeAdapter;

    public Me2MeDebitAutoPullWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.themesOfThemeAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, WidgetDto.Theme.class), emptySet, "themes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeDebitAutoPullWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Themes<WidgetDto.Theme> themes = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
            } else if (selectName == 2 && (themes = this.themesOfThemeAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("themes", "themes", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
        }
        if (themes != null) {
            return new Me2MeDebitAutoPullWidgetDto(str, str2, themes);
        }
        throw Util.missingProperty("themes", "themes", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeDebitAutoPullWidgetDto me2MeDebitAutoPullWidgetDto) {
        Me2MeDebitAutoPullWidgetDto me2MeDebitAutoPullWidgetDto2 = me2MeDebitAutoPullWidgetDto;
        if (me2MeDebitAutoPullWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullWidgetDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullWidgetDto2.getDescription());
        jsonWriter.name("themes");
        this.themesOfThemeAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullWidgetDto2.getThemes());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(Me2MeDebitAutoPullWidgetDto)");
    }
}
