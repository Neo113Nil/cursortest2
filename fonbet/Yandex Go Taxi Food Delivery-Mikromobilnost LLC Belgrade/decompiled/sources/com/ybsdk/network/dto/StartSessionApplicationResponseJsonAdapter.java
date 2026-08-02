package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.dto.common.ApplicationType;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/network/dto/StartSessionApplicationResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/StartSessionApplicationResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/dto/common/ApplicationType;", "applicationTypeAdapter", "", "booleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StartSessionApplicationResponseJsonAdapter extends JsonAdapter<StartSessionApplicationResponse> {
    private final JsonAdapter<ApplicationType> applicationTypeAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("application_id", "type", "required");
    private final JsonAdapter<String> stringAdapter;

    public StartSessionApplicationResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "applicationId");
        this.applicationTypeAdapter = moshi.adapter(ApplicationType.class, emptySet, "type");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "required");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StartSessionApplicationResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ApplicationType applicationType = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("applicationId", "application_id", jsonReader);
                }
            } else if (selectName == 1) {
                applicationType = this.applicationTypeAdapter.fromJson(jsonReader);
                if (applicationType == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 2 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("required", "required", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("applicationId", "application_id", jsonReader);
        }
        if (applicationType == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (bool != null) {
            return new StartSessionApplicationResponse(str, applicationType, bool.booleanValue());
        }
        throw Util.missingProperty("required", "required", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StartSessionApplicationResponse startSessionApplicationResponse) {
        StartSessionApplicationResponse startSessionApplicationResponse2 = startSessionApplicationResponse;
        if (startSessionApplicationResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("application_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) startSessionApplicationResponse2.getApplicationId());
        jsonWriter.name("type");
        this.applicationTypeAdapter.toJson(jsonWriter, (JsonWriter) startSessionApplicationResponse2.getType());
        jsonWriter.name("required");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(startSessionApplicationResponse2.getRequired()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(StartSessionApplicationResponse)");
    }
}
