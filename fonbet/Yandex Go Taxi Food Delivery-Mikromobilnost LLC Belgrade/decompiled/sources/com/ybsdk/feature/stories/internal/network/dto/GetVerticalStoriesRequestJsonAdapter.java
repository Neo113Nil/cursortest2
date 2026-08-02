package com.ybsdk.feature.stories.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/stories/internal/network/dto/GetVerticalStoriesRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/stories/internal/network/dto/GetVerticalStoriesRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;", "nfcInfoDtoAdapter", "", "", "mapOfStringAnyAdapter", "feature-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetVerticalStoriesRequestJsonAdapter extends JsonAdapter<GetVerticalStoriesRequest> {
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<NfcInfoDto> nfcInfoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("start_story_id", "nfc_info", "additional_data");
    private final JsonAdapter<String> stringAdapter;

    public GetVerticalStoriesRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "startStoryId");
        this.nfcInfoDtoAdapter = moshi.adapter(NfcInfoDto.class, emptySet, "nfcInfo");
        this.mapOfStringAnyAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), emptySet, "additionalData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetVerticalStoriesRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        NfcInfoDto nfcInfoDto = null;
        Map<String, Object> map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("startStoryId", "start_story_id", jsonReader);
                }
            } else if (selectName == 1) {
                nfcInfoDto = this.nfcInfoDtoAdapter.fromJson(jsonReader);
                if (nfcInfoDto == null) {
                    throw Util.unexpectedNull("nfcInfo", "nfc_info", jsonReader);
                }
            } else if (selectName == 2 && (map = this.mapOfStringAnyAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("additionalData", "additional_data", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("startStoryId", "start_story_id", jsonReader);
        }
        if (nfcInfoDto == null) {
            throw Util.missingProperty("nfcInfo", "nfc_info", jsonReader);
        }
        if (map != null) {
            return new GetVerticalStoriesRequest(str, nfcInfoDto, map);
        }
        throw Util.missingProperty("additionalData", "additional_data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetVerticalStoriesRequest getVerticalStoriesRequest) {
        GetVerticalStoriesRequest getVerticalStoriesRequest2 = getVerticalStoriesRequest;
        if (getVerticalStoriesRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("start_story_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) getVerticalStoriesRequest2.getStartStoryId());
        jsonWriter.name("nfc_info");
        this.nfcInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) getVerticalStoriesRequest2.getNfcInfo());
        jsonWriter.name("additional_data");
        this.mapOfStringAnyAdapter.toJson(jsonWriter, (JsonWriter) getVerticalStoriesRequest2.getAdditionalData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(GetVerticalStoriesRequest)");
    }
}
