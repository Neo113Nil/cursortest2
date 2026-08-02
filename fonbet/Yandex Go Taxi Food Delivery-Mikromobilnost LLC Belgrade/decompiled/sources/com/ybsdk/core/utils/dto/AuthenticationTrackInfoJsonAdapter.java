package com.ybsdk.core.utils.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/utils/dto/AuthenticationTrackInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/dto/AuthenticationTrackInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationTrackInfoJsonAdapter extends JsonAdapter<AuthenticationTrackInfo> {
    private final JsonReader.Options options = JsonReader.Options.of("track_id", "operation_id");
    private final JsonAdapter<String> stringAdapter;

    public AuthenticationTrackInfoJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "trackId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AuthenticationTrackInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("trackId", "track_id", jsonReader);
                }
            } else if (selectName == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("operationId", "operation_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("trackId", "track_id", jsonReader);
        }
        if (str2 != null) {
            return new AuthenticationTrackInfo(str, str2);
        }
        throw Util.missingProperty("operationId", "operation_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AuthenticationTrackInfo authenticationTrackInfo) {
        AuthenticationTrackInfo authenticationTrackInfo2 = authenticationTrackInfo;
        if (authenticationTrackInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("track_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) authenticationTrackInfo2.getTrackId());
        jsonWriter.name("operation_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) authenticationTrackInfo2.getOperationId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(AuthenticationTrackInfo)");
    }
}
