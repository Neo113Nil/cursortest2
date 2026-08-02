package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlinx.serialization.json.c;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetExperimentsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GetExperimentsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lkotlinx/serialization/json/c;", "jsonObjectAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/yandex/messaging/core/net/entities/TestIdData;", "listOfTestIdDataAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetExperimentsResponseJsonAdapter extends JsonAdapter<GetExperimentsResponse> {
    private final JsonAdapter<c> jsonObjectAdapter;
    private final JsonAdapter<List<TestIdData>> listOfTestIdDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("flags", "testIds");

    public GetExperimentsResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.jsonObjectAdapter = moshi.adapter(c.class, emptySet, "flags");
        this.listOfTestIdDataAdapter = moshi.adapter(Types.newParameterizedType(List.class, TestIdData.class), emptySet, "testIds");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetExperimentsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        c cVar = null;
        List<TestIdData> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                cVar = this.jsonObjectAdapter.fromJson(jsonReader);
                if (cVar == null) {
                    throw Util.unexpectedNull("flags", "flags", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfTestIdDataAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("testIds", "testIds", jsonReader);
            }
        }
        jsonReader.endObject();
        if (cVar == null) {
            throw Util.missingProperty("flags", "flags", jsonReader);
        }
        if (list != null) {
            return new GetExperimentsResponse(cVar, list);
        }
        throw Util.missingProperty("testIds", "testIds", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetExperimentsResponse getExperimentsResponse) {
        GetExperimentsResponse getExperimentsResponse2 = getExperimentsResponse;
        if (getExperimentsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("flags");
        this.jsonObjectAdapter.toJson(jsonWriter, (JsonWriter) getExperimentsResponse2.getFlags());
        jsonWriter.name("testIds");
        this.listOfTestIdDataAdapter.toJson(jsonWriter, (JsonWriter) getExperimentsResponse2.getTestIds());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(GetExperimentsResponse)");
    }
}
