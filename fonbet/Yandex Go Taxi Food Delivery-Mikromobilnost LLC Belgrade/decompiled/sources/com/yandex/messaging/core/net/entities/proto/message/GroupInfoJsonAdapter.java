package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/GroupInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/GroupInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GroupInfoJsonAdapter extends JsonAdapter<GroupInfo> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("OrganizationId", "GroupId", PlusAcquisitionSmartOffer.Texts.NAME, "Version");
    private final JsonAdapter<String> stringAdapter;

    public GroupInfoJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "organizationId");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GroupInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("organizationId", "OrganizationId", jsonReader);
                }
            } else if (selectName == 1) {
                l2 = this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    throw Util.unexpectedNull("id", "GroupId", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("name", PlusAcquisitionSmartOffer.Texts.NAME, jsonReader);
                }
            } else if (selectName == 3 && (l3 = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("version", "Version", jsonReader);
            }
        }
        jsonReader.endObject();
        Long l4 = l3;
        if (l == null) {
            throw Util.missingProperty("organizationId", "OrganizationId", jsonReader);
        }
        long longValue = l.longValue();
        if (l2 == null) {
            throw Util.missingProperty("id", "GroupId", jsonReader);
        }
        long longValue2 = l2.longValue();
        if (str == null) {
            throw Util.missingProperty("name", PlusAcquisitionSmartOffer.Texts.NAME, jsonReader);
        }
        if (l4 != null) {
            return new GroupInfo(longValue, longValue2, str, l4.longValue());
        }
        throw Util.missingProperty("version", "Version", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GroupInfo groupInfo) {
        GroupInfo groupInfo2 = groupInfo;
        if (groupInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("OrganizationId");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(groupInfo2.getOrganizationId()));
        jsonWriter.name("GroupId");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(groupInfo2.getId()));
        jsonWriter.name(PlusAcquisitionSmartOffer.Texts.NAME);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) groupInfo2.getName());
        jsonWriter.name("Version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(groupInfo2.getVersion()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(GroupInfo)");
    }
}
