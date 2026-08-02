package com.ybsdk.feature.settings.internal.network.dto.card;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.adapters.SkipFailingElements;
import com.ybsdk.feature.settings.api.data.SettingDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/settings/internal/network/dto/card/CardSetSettingsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/settings/internal/network/dto/card/CardSetSettingsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/settings/api/data/SettingDto;", "listOfSettingDtoAtSkipFailingElementsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardSetSettingsResponseJsonAdapter extends JsonAdapter<CardSetSettingsResponse> {
    private final JsonAdapter<List<SettingDto>> listOfSettingDtoAtSkipFailingElementsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("settings");

    public CardSetSettingsResponseJsonAdapter(Moshi moshi) {
        this.listOfSettingDtoAtSkipFailingElementsAdapter = moshi.adapter(Types.newParameterizedType(List.class, SettingDto.class), Collections.singleton(new SkipFailingElements() { // from class: com.ybsdk.feature.settings.internal.network.dto.card.CardSetSettingsResponseJsonAdapter.a
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
    public final CardSetSettingsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<SettingDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = this.listOfSettingDtoAtSkipFailingElementsAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("settings", "settings", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new CardSetSettingsResponse(list);
        }
        throw Util.missingProperty("settings", "settings", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardSetSettingsResponse cardSetSettingsResponse) {
        CardSetSettingsResponse cardSetSettingsResponse2 = cardSetSettingsResponse;
        if (cardSetSettingsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("settings");
        this.listOfSettingDtoAtSkipFailingElementsAdapter.toJson(jsonWriter, (JsonWriter) cardSetSettingsResponse2.getSettings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(CardSetSettingsResponse)");
    }
}
