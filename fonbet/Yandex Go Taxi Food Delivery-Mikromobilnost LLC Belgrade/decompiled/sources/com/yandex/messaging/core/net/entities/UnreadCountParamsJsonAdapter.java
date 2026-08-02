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

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UnreadCountParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UnreadCountParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "listOfLongAdapter", "", "booleanAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UnreadCountParamsJsonAdapter extends JsonAdapter<UnreadCountParams> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<Long>> listOfLongAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Client", "Namespaces", "DetailedWorkspace");
    private final JsonAdapter<String> stringAdapter;

    public UnreadCountParamsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "workspaceId");
        this.listOfLongAdapter = moshi.adapter(Types.newParameterizedType(List.class, Long.class), emptySet, "namespaces");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "detailedWorkspace");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UnreadCountParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<Long> list = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("workspaceId", "Client", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfLongAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("namespaces", "Namespaces", jsonReader);
                }
            } else if (selectName == 2 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("detailedWorkspace", "DetailedWorkspace", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("workspaceId", "Client", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("namespaces", "Namespaces", jsonReader);
        }
        if (bool != null) {
            return new UnreadCountParams(str, list, bool.booleanValue());
        }
        throw Util.missingProperty("detailedWorkspace", "DetailedWorkspace", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UnreadCountParams unreadCountParams) {
        UnreadCountParams unreadCountParams2 = unreadCountParams;
        if (unreadCountParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Client");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) unreadCountParams2.getWorkspaceId());
        jsonWriter.name("Namespaces");
        this.listOfLongAdapter.toJson(jsonWriter, (JsonWriter) unreadCountParams2.getNamespaces());
        jsonWriter.name("DetailedWorkspace");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(unreadCountParams2.getDetailedWorkspace()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(UnreadCountParams)");
    }
}
