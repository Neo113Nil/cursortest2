package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitPhotoRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitPhotoRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/kyc/internal/network/dto/LocationDto;", "nullableLocationDtoAdapter", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubmitPhotoRequestJsonAdapter extends JsonAdapter<SubmitPhotoRequest> {
    private final JsonAdapter<LocationDto> nullableLocationDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("application_id", "geo");
    private final JsonAdapter<String> stringAdapter;

    public SubmitPhotoRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "applicationId");
        this.nullableLocationDtoAdapter = moshi.adapter(LocationDto.class, emptySet, "location");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SubmitPhotoRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        LocationDto locationDto = null;
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
                locationDto = this.nullableLocationDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new SubmitPhotoRequest(str, locationDto);
        }
        throw Util.missingProperty("applicationId", "application_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SubmitPhotoRequest submitPhotoRequest) {
        SubmitPhotoRequest submitPhotoRequest2 = submitPhotoRequest;
        if (submitPhotoRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("application_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) submitPhotoRequest2.getApplicationId());
        jsonWriter.name("geo");
        this.nullableLocationDtoAdapter.toJson(jsonWriter, (JsonWriter) submitPhotoRequest2.getLocation());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(SubmitPhotoRequest)");
    }
}
