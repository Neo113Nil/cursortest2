package com.ybsdk.feature.settings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.adapters.SkipFailingElements;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/settings/internal/network/dto/TransferSettingsResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/settings/internal/network/dto/TransferSettingsResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/settings/internal/network/dto/SettingsCategoryDto;", "listOfSettingsCategoryDtoAtSkipFailingElementsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferSettingsResponseDtoJsonAdapter extends JsonAdapter<TransferSettingsResponseDto> {
    private final JsonAdapter<List<SettingsCategoryDto>> listOfSettingsCategoryDtoAtSkipFailingElementsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("settings");

    public TransferSettingsResponseDtoJsonAdapter(Moshi moshi) {
        this.listOfSettingsCategoryDtoAtSkipFailingElementsAdapter = moshi.adapter(Types.newParameterizedType(List.class, SettingsCategoryDto.class), Collections.singleton(new SkipFailingElements() { // from class: com.ybsdk.feature.settings.internal.network.dto.TransferSettingsResponseDtoJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return SkipFailingElements.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof SkipFailingElements;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.ybsdk.core.common.data.network.adapters.SkipFailingElements()";
            }
        }), "settings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferSettingsResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<SettingsCategoryDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = this.listOfSettingsCategoryDtoAtSkipFailingElementsAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("settings", "settings", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new TransferSettingsResponseDto(list);
        }
        throw Util.missingProperty("settings", "settings", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferSettingsResponseDto transferSettingsResponseDto) {
        TransferSettingsResponseDto transferSettingsResponseDto2 = transferSettingsResponseDto;
        if (transferSettingsResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("settings");
        this.listOfSettingsCategoryDtoAtSkipFailingElementsAdapter.toJson(jsonWriter, (JsonWriter) transferSettingsResponseDto2.getSettings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(TransferSettingsResponseDto)");
    }
}
