package com.ybsdk.feature.autotopup.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$Payload;", "nullablePayloadAdapter", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$SwitchState;", "nullableSwitchStateAdapter", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$ButtonState;", "nullableButtonStateAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/feature/autotopup/api/dto/TopupWidgetTheme;", "nullableThemesOfTopupWidgetThemeAdapter", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupWidgetDtoJsonAdapter extends JsonAdapter<AutoTopupWidgetDto> {
    private final JsonAdapter<AutoTopupWidgetDto.ButtonState> nullableButtonStateAdapter;
    private final JsonAdapter<AutoTopupWidgetDto.Payload> nullablePayloadAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<AutoTopupWidgetDto.SwitchState> nullableSwitchStateAdapter;
    private final JsonAdapter<Themes<TopupWidgetTheme>> nullableThemesOfTopupWidgetThemeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "payload", "switch", "button", "themes");
    private final JsonAdapter<String> stringAdapter;

    public AutoTopupWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullablePayloadAdapter = moshi.adapter(AutoTopupWidgetDto.Payload.class, emptySet, "payload");
        this.nullableSwitchStateAdapter = moshi.adapter(AutoTopupWidgetDto.SwitchState.class, emptySet, "switchState");
        this.nullableButtonStateAdapter = moshi.adapter(AutoTopupWidgetDto.ButtonState.class, emptySet, "buttonState");
        this.nullableThemesOfTopupWidgetThemeAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, TopupWidgetTheme.class), emptySet, "themes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        AutoTopupWidgetDto.Payload payload = null;
        AutoTopupWidgetDto.SwitchState switchState = null;
        AutoTopupWidgetDto.ButtonState buttonState = null;
        Themes<TopupWidgetTheme> themes = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    payload = this.nullablePayloadAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    switchState = this.nullableSwitchStateAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    buttonState = this.nullableButtonStateAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    themes = this.nullableThemesOfTopupWidgetThemeAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new AutoTopupWidgetDto(str, str2, payload, switchState, buttonState, themes);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupWidgetDto autoTopupWidgetDto) {
        AutoTopupWidgetDto autoTopupWidgetDto2 = autoTopupWidgetDto;
        if (autoTopupWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupWidgetDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupWidgetDto2.getDescription());
        jsonWriter.name("payload");
        this.nullablePayloadAdapter.toJson(jsonWriter, (JsonWriter) autoTopupWidgetDto2.getPayload());
        jsonWriter.name("switch");
        this.nullableSwitchStateAdapter.toJson(jsonWriter, (JsonWriter) autoTopupWidgetDto2.getSwitchState());
        jsonWriter.name("button");
        this.nullableButtonStateAdapter.toJson(jsonWriter, (JsonWriter) autoTopupWidgetDto2.getButtonState());
        jsonWriter.name("themes");
        this.nullableThemesOfTopupWidgetThemeAdapter.toJson(jsonWriter, (JsonWriter) autoTopupWidgetDto2.getThemes());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(AutoTopupWidgetDto)");
    }
}
