package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PrivateChatInfoFromTransportJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/PrivateChatInfoFromTransport;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableLongArrayAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "booleanAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PrivateChatInfoFromTransportJsonAdapter extends JsonAdapter<PrivateChatInfoFromTransport> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<long[]> nullableLongArrayAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("OrganizationIds", "Version", "Federative", "HasGuests");

    public PrivateChatInfoFromTransportJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableLongArrayAdapter = moshi.adapter(long[].class, emptySet, "organizationIds");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "version");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "federative");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PrivateChatInfoFromTransport fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Boolean bool = null;
        long[] jArr = null;
        Boolean bool2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                jArr = this.nullableLongArrayAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("version", "Version", jsonReader);
                }
            } else if (selectName == 2) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("federative", "Federative", jsonReader);
                }
            } else if (selectName == 3 && (bool2 = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("hasGuests", "HasGuests", jsonReader);
            }
        }
        jsonReader.endObject();
        Boolean bool3 = bool;
        if (l == null) {
            throw Util.missingProperty("version", "Version", jsonReader);
        }
        long longValue = l.longValue();
        if (bool3 == null) {
            throw Util.missingProperty("federative", "Federative", jsonReader);
        }
        boolean booleanValue = bool3.booleanValue();
        if (bool2 != null) {
            return new PrivateChatInfoFromTransport(jArr, longValue, booleanValue, bool2.booleanValue());
        }
        throw Util.missingProperty("hasGuests", "HasGuests", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PrivateChatInfoFromTransport privateChatInfoFromTransport) {
        PrivateChatInfoFromTransport privateChatInfoFromTransport2 = privateChatInfoFromTransport;
        if (privateChatInfoFromTransport2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("OrganizationIds");
        this.nullableLongArrayAdapter.toJson(jsonWriter, (JsonWriter) privateChatInfoFromTransport2.getOrganizationIds());
        jsonWriter.name("Version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(privateChatInfoFromTransport2.getVersion()));
        jsonWriter.name("Federative");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(privateChatInfoFromTransport2.getFederative()));
        jsonWriter.name("HasGuests");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(privateChatInfoFromTransport2.getHasGuests()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(PrivateChatInfoFromTransport)");
    }
}
