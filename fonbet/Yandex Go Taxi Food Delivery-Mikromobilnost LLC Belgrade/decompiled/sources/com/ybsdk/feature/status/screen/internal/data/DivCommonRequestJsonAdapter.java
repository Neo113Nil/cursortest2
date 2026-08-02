package com.ybsdk.feature.status.screen.internal.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/data/DivCommonRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/status/screen/internal/data/DivCommonRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAtRawJsonStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "nullableCommunicationsShownInfoDtoAdapter", "nullableStringAdapter", "", "intAdapter", "feature-divkit-common-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivCommonRequestJsonAdapter extends JsonAdapter<DivCommonRequest> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<CommunicationsShownInfoDto> nullableCommunicationsShownInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<String> nullableStringAtRawJsonStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("div_common_request_payload", "communications_shown_info", "initial_deeplink", "sessions_count_without_fullscreen");

    public DivCommonRequestJsonAdapter(Moshi moshi) {
        this.nullableStringAtRawJsonStringAdapter = moshi.adapter(String.class, Collections.singleton(new RawJsonString() { // from class: com.ybsdk.feature.status.screen.internal.data.DivCommonRequestJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return RawJsonString.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof RawJsonString;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.ybsdk.core.common.data.network.adapters.RawJsonString()";
            }
        }), "divCommonRequestPayload");
        EmptySet emptySet = EmptySet.a;
        this.nullableCommunicationsShownInfoDtoAdapter = moshi.adapter(CommunicationsShownInfoDto.class, emptySet, "communicationShownInfo");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "initialDeeplink");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "sessionsCountWithoutFullscreen");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DivCommonRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        CommunicationsShownInfoDto communicationsShownInfoDto = null;
        String str2 = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAtRawJsonStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                communicationsShownInfoDto = this.nullableCommunicationsShownInfoDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num != null) {
            return new DivCommonRequest(str, communicationsShownInfoDto, str2, num.intValue());
        }
        throw Util.missingProperty("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DivCommonRequest divCommonRequest) {
        DivCommonRequest divCommonRequest2 = divCommonRequest;
        if (divCommonRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("div_common_request_payload");
        this.nullableStringAtRawJsonStringAdapter.toJson(jsonWriter, (JsonWriter) divCommonRequest2.getDivCommonRequestPayload());
        jsonWriter.name("communications_shown_info");
        this.nullableCommunicationsShownInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) divCommonRequest2.getCommunicationShownInfo());
        jsonWriter.name("initial_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) divCommonRequest2.getInitialDeeplink());
        jsonWriter.name("sessions_count_without_fullscreen");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(divCommonRequest2.getSessionsCountWithoutFullscreen()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(DivCommonRequest)");
    }
}
