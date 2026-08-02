package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.RemoteConfigResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/network/dto/RemoteConfigResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/RemoteConfigResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/network/dto/RemoteConfigResponse$TypedExperiments;", "listOfTypedExperimentsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RemoteConfigResponseJsonAdapter extends JsonAdapter<RemoteConfigResponse> {
    private final JsonAdapter<List<RemoteConfigResponse.TypedExperiments>> listOfTypedExperimentsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("typed_experiments", "version");
    private final JsonAdapter<String> stringAdapter;

    public RemoteConfigResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, RemoteConfigResponse.TypedExperiments.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfTypedExperimentsAdapter = moshi.adapter(newParameterizedType, emptySet, "typedExperiments");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "version");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RemoteConfigResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<RemoteConfigResponse.TypedExperiments> list = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfTypedExperimentsAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("typedExperiments", "typed_experiments", jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("version", "version", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("typedExperiments", "typed_experiments", jsonReader);
        }
        if (str != null) {
            return new RemoteConfigResponse(list, str);
        }
        throw Util.missingProperty("version", "version", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RemoteConfigResponse remoteConfigResponse) {
        RemoteConfigResponse remoteConfigResponse2 = remoteConfigResponse;
        if (remoteConfigResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("typed_experiments");
        this.listOfTypedExperimentsAdapter.toJson(jsonWriter, (JsonWriter) remoteConfigResponse2.getTypedExperiments());
        jsonWriter.name("version");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) remoteConfigResponse2.getVersion());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(RemoteConfigResponse)");
    }
}
