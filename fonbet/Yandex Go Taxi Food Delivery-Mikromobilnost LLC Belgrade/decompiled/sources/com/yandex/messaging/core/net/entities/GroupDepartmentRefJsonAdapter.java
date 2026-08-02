package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GroupDepartmentRefJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GroupDepartmentRefJsonAdapter extends JsonAdapter<GroupDepartmentRef> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "organization_id");

    public GroupDepartmentRefJsonAdapter(Moshi moshi) {
        this.longAdapter = moshi.adapter(Long.TYPE, EmptySet.a, "id");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GroupDepartmentRef fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1 && (l2 = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("organizationId", "organization_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (l == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        long longValue = l.longValue();
        if (l2 != null) {
            return new GroupDepartmentRef(longValue, l2.longValue());
        }
        throw Util.missingProperty("organizationId", "organization_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GroupDepartmentRef groupDepartmentRef) {
        GroupDepartmentRef groupDepartmentRef2 = groupDepartmentRef;
        if (groupDepartmentRef2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(groupDepartmentRef2.getId()));
        jsonWriter.name("organization_id");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(groupDepartmentRef2.getOrganizationId()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(GroupDepartmentRef)");
    }
}
