package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GroupDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GroupData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "", "intAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GroupDataJsonAdapter extends JsonAdapter<GroupData> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("group_id", "name", "organization_id", "organization_name", "version", "members_count");
    private final JsonAdapter<String> stringAdapter;

    public GroupDataJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "id");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "organizationName");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "membersCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GroupData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (true) {
            Long l4 = l;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                Long l5 = l2;
                if (l4 == null) {
                    throw Util.missingProperty("id", "group_id", jsonReader);
                }
                long longValue = l4.longValue();
                if (str == null) {
                    throw Util.missingProperty("name", "name", jsonReader);
                }
                if (l5 == null) {
                    throw Util.missingProperty("organizationId", "organization_id", jsonReader);
                }
                long longValue2 = l5.longValue();
                if (l3 == null) {
                    throw Util.missingProperty("version", "version", jsonReader);
                }
                long longValue3 = l3.longValue();
                if (num != null) {
                    return new GroupData(longValue, str, longValue2, str2, longValue3, num.intValue());
                }
                throw Util.missingProperty("membersCount", "members_count", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("id", "group_id", jsonReader);
                    }
                    continue;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                    break;
                case 2:
                    l2 = this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        throw Util.unexpectedNull("organizationId", "organization_id", jsonReader);
                    }
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    l3 = this.longAdapter.fromJson(jsonReader);
                    if (l3 == null) {
                        throw Util.unexpectedNull("version", "version", jsonReader);
                    }
                    break;
                case 5:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("membersCount", "members_count", jsonReader);
                    }
                    break;
            }
            l = l4;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GroupData groupData) {
        GroupData groupData2 = groupData;
        if (groupData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("group_id");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(groupData2.getId()));
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) groupData2.getName());
        jsonWriter.name("organization_id");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(groupData2.getOrganizationId()));
        jsonWriter.name("organization_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) groupData2.getOrganizationName());
        jsonWriter.name("version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(groupData2.getVersion()));
        jsonWriter.name("members_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(groupData2.getMembersCount()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(GroupData)");
    }
}
