package com.ybsdk.feature.divkit.internal.domain;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import com.ybsdk.feature.divkit.internal.domain.DownloadPayload;
import com.ybsdk.feature.divkit.internal.domain.hmac.HmacData;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayloadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAtRawJsonStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableMapOfStringStringAdapter", "Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload$IdempotencyData;", "nullableIdempotencyDataAdapter", "", "booleanAdapter", "nullableBooleanAdapter", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData;", "nullableHmacDataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadPayloadJsonAdapter extends JsonAdapter<DownloadPayload> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DownloadPayload> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<HmacData> nullableHmacDataAdapter;
    private final JsonAdapter<DownloadPayload.IdempotencyData> nullableIdempotencyDataAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAtRawJsonStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("body", "headers", "idempotency_data", "is_general_response", "is_polling_request", "hmac_data");

    public DownloadPayloadJsonAdapter(Moshi moshi) {
        this.nullableStringAtRawJsonStringAdapter = moshi.adapter(String.class, Collections.singleton(new RawJsonString() { // from class: com.ybsdk.feature.divkit.internal.domain.DownloadPayloadJsonAdapter.a
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
        }), "body");
        ParameterizedType newParameterizedType = Types.newParameterizedType(Map.class, String.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableMapOfStringStringAdapter = moshi.adapter(newParameterizedType, emptySet, "headers");
        this.nullableIdempotencyDataAdapter = moshi.adapter(DownloadPayload.IdempotencyData.class, emptySet, "idempotency");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isGeneralResponse");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isPollingRequest");
        this.nullableHmacDataAdapter = moshi.adapter(HmacData.class, emptySet, "hmacData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DownloadPayload fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        DownloadPayload.IdempotencyData idempotencyData = null;
        int i = -1;
        Boolean bool2 = bool;
        Map<String, String> map = null;
        String str = null;
        HmacData hmacData = null;
        Boolean bool3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAtRawJsonStringAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    map = this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    idempotencyData = this.nullableIdempotencyDataAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isGeneralResponse", "is_general_response", jsonReader);
                    }
                    i &= -9;
                    break;
                case 4:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    hmacData = this.nullableHmacDataAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -64) {
            return new DownloadPayload(str, map, idempotencyData, bool2.booleanValue(), bool3, hmacData);
        }
        String str2 = str;
        Boolean bool4 = bool3;
        Constructor<DownloadPayload> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DownloadPayload.class.getDeclaredConstructor(String.class, Map.class, DownloadPayload.IdempotencyData.class, Boolean.TYPE, Boolean.class, HmacData.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str2, map, idempotencyData, bool2, bool4, hmacData, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DownloadPayload downloadPayload) {
        DownloadPayload downloadPayload2 = downloadPayload;
        if (downloadPayload2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("body");
        this.nullableStringAtRawJsonStringAdapter.toJson(jsonWriter, (JsonWriter) downloadPayload2.getBody());
        jsonWriter.name("headers");
        this.nullableMapOfStringStringAdapter.toJson(jsonWriter, (JsonWriter) downloadPayload2.getHeaders());
        jsonWriter.name("idempotency_data");
        this.nullableIdempotencyDataAdapter.toJson(jsonWriter, (JsonWriter) downloadPayload2.getIdempotency());
        jsonWriter.name("is_general_response");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(downloadPayload2.isGeneralResponse()));
        jsonWriter.name("is_polling_request");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) downloadPayload2.isPollingRequest());
        jsonWriter.name("hmac_data");
        this.nullableHmacDataAdapter.toJson(jsonWriter, (JsonWriter) downloadPayload2.getHmacData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(DownloadPayload)");
    }
}
