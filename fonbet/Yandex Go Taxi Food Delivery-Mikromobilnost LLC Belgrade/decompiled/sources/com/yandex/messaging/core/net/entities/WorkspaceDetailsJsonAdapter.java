package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR(\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/WorkspaceDetailsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/WorkspaceDetails;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "", "nullableMapOfStringLongAdapter", "Lcom/squareup/moshi/JsonAdapter;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WorkspaceDetailsJsonAdapter extends JsonAdapter<WorkspaceDetails> {
    private final JsonAdapter<Map<String, Long>> nullableMapOfStringLongAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Ns", "Bots");

    public WorkspaceDetailsJsonAdapter(Moshi moshi) {
        this.nullableMapOfStringLongAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Long.class), EmptySet.a, "ns");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WorkspaceDetails fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Map<String, Long> map = null;
        Map<String, Long> map2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                map = this.nullableMapOfStringLongAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                map2 = this.nullableMapOfStringLongAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new WorkspaceDetails(map, map2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WorkspaceDetails workspaceDetails) {
        WorkspaceDetails workspaceDetails2 = workspaceDetails;
        if (workspaceDetails2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Ns");
        this.nullableMapOfStringLongAdapter.toJson(jsonWriter, (JsonWriter) workspaceDetails2.getNs());
        jsonWriter.name("Bots");
        this.nullableMapOfStringLongAdapter.toJson(jsonWriter, (JsonWriter) workspaceDetails2.getBots());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(WorkspaceDetails)");
    }
}
