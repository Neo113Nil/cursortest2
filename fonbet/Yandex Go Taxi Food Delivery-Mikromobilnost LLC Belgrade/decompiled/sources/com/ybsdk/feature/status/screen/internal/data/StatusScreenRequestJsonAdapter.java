package com.ybsdk.feature.status.screen.internal.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/data/StatusScreenRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/status/screen/internal/data/StatusScreenRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableMapOfStringStringAdapter", "feature-status-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatusScreenRequestJsonAdapter extends JsonAdapter<StatusScreenRequest> {
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("target", "additional_data");
    private final JsonAdapter<String> stringAdapter;

    public StatusScreenRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "target");
        this.nullableMapOfStringStringAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), emptySet, "additionalParams");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StatusScreenRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Map<String, String> map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("target", "target", jsonReader);
                }
            } else if (selectName == 1) {
                map = this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new StatusScreenRequest(str, map);
        }
        throw Util.missingProperty("target", "target", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StatusScreenRequest statusScreenRequest) {
        StatusScreenRequest statusScreenRequest2 = statusScreenRequest;
        if (statusScreenRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("target");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) statusScreenRequest2.getTarget());
        jsonWriter.name("additional_data");
        this.nullableMapOfStringStringAdapter.toJson(jsonWriter, (JsonWriter) statusScreenRequest2.getAdditionalParams());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(StatusScreenRequest)");
    }
}
