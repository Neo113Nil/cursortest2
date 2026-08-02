package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/OrganizationDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/OrganizationData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "booleanAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrganizationDataJsonAdapter extends JsonAdapter<OrganizationData> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("organization_id", "name", "version", "public");
    private final JsonAdapter<String> stringAdapter;

    public OrganizationDataJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "id");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "public");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OrganizationData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("id", "organization_id", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (selectName == 2) {
                l2 = this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    throw Util.unexpectedNull("version", "version", jsonReader);
                }
            } else if (selectName == 3 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("public_", "public", jsonReader);
            }
        }
        jsonReader.endObject();
        Long l3 = l2;
        if (l == null) {
            throw Util.missingProperty("id", "organization_id", jsonReader);
        }
        long longValue = l.longValue();
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (l3 == null) {
            throw Util.missingProperty("version", "version", jsonReader);
        }
        long longValue2 = l3.longValue();
        if (bool != null) {
            return new OrganizationData(longValue, str, longValue2, bool.booleanValue());
        }
        throw Util.missingProperty("public_", "public", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OrganizationData organizationData) {
        OrganizationData organizationData2 = organizationData;
        if (organizationData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("organization_id");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(organizationData2.getId()));
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) organizationData2.getName());
        jsonWriter.name("version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(organizationData2.getVersion()));
        jsonWriter.name("public");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(organizationData2.getPublic()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(OrganizationData)");
    }
}
