package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import com.ybsdk.network.dto.RemoteConfigResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/network/dto/RemoteConfigResponse_TypedExperimentsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/RemoteConfigResponse$TypedExperiments;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAtRawJsonStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RemoteConfigResponse_TypedExperimentsJsonAdapter extends JsonAdapter<RemoteConfigResponse.TypedExperiments> {
    private final JsonReader.Options options = JsonReader.Options.of("name", "cache_status", "version", "value");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<String> stringAtRawJsonStringAdapter;

    public RemoteConfigResponse_TypedExperimentsJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "name");
        this.stringAtRawJsonStringAdapter = moshi.adapter(String.class, Collections.singleton(new RawJsonString() { // from class: com.ybsdk.network.dto.RemoteConfigResponse_TypedExperimentsJsonAdapter.a
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
        }), "value");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RemoteConfigResponse.TypedExperiments fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("cacheStatus", "cache_status", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("version", "version", jsonReader);
                }
            } else if (selectName == 3 && (str4 = this.stringAtRawJsonStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("value__", "value", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("cacheStatus", "cache_status", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("version", "version", jsonReader);
        }
        if (str4 != null) {
            return new RemoteConfigResponse.TypedExperiments(str, str2, str3, str4);
        }
        throw Util.missingProperty("value__", "value", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RemoteConfigResponse.TypedExperiments typedExperiments) {
        RemoteConfigResponse.TypedExperiments typedExperiments2 = typedExperiments;
        if (typedExperiments2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) typedExperiments2.getName());
        jsonWriter.name("cache_status");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) typedExperiments2.getCacheStatus());
        jsonWriter.name("version");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) typedExperiments2.getVersion());
        jsonWriter.name("value");
        this.stringAtRawJsonStringAdapter.toJson(jsonWriter, (JsonWriter) typedExperiments2.getValue());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(RemoteConfigResponse.TypedExperiments)");
    }
}
