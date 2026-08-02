package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardIconsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardIconsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YbCardIconsResponseJsonAdapter extends JsonAdapter<YbCardIconsResponse> {
    private final JsonReader.Options options = JsonReader.Options.of(ClidProvider.APP_ACTIVE, "multi", BackendConfig.Restrictions.DISABLED);
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public YbCardIconsResponseJsonAdapter(Moshi moshi) {
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), EmptySet.a, "activeCardImage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbCardIconsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        Themes<String> themes3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themes = this.themesOfStringAdapter.fromJson(jsonReader);
                if (themes == null) {
                    throw Util.unexpectedNull("activeCardImage", ClidProvider.APP_ACTIVE, jsonReader);
                }
            } else if (selectName == 1) {
                themes2 = this.themesOfStringAdapter.fromJson(jsonReader);
                if (themes2 == null) {
                    throw Util.unexpectedNull("multiCardImage", "multi", jsonReader);
                }
            } else if (selectName == 2 && (themes3 = this.themesOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("disabledCardImage", BackendConfig.Restrictions.DISABLED, jsonReader);
            }
        }
        jsonReader.endObject();
        if (themes == null) {
            throw Util.missingProperty("activeCardImage", ClidProvider.APP_ACTIVE, jsonReader);
        }
        if (themes2 == null) {
            throw Util.missingProperty("multiCardImage", "multi", jsonReader);
        }
        if (themes3 != null) {
            return new YbCardIconsResponse(themes, themes2, themes3);
        }
        throw Util.missingProperty("disabledCardImage", BackendConfig.Restrictions.DISABLED, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbCardIconsResponse ybCardIconsResponse) {
        YbCardIconsResponse ybCardIconsResponse2 = ybCardIconsResponse;
        if (ybCardIconsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ClidProvider.APP_ACTIVE);
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) ybCardIconsResponse2.getActiveCardImage());
        jsonWriter.name("multi");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) ybCardIconsResponse2.getMultiCardImage());
        jsonWriter.name(BackendConfig.Restrictions.DISABLED);
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) ybCardIconsResponse2.getDisabledCardImage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(YbCardIconsResponse)");
    }
}
