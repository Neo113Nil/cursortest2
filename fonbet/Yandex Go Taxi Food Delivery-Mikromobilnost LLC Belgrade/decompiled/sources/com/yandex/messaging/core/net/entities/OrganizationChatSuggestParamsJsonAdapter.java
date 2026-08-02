package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/OrganizationChatSuggestParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/OrganizationChatSuggestParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "nullableArrayOfStringAdapter", "nullableStringAdapter", "", "booleanAdapter", "", "nullableArrayOfLongAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrganizationChatSuggestParamsJsonAdapter extends JsonAdapter<OrganizationChatSuggestParams> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long[]> nullableArrayOfLongAdapter;
    private final JsonAdapter<String[]> nullableArrayOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat_id", "limit", "roles", "guid_offset", "expand_groups", "groups_only", "group_filter", "department_filter");
    private final JsonAdapter<String> stringAdapter;

    public OrganizationChatSuggestParamsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "limit");
        this.nullableArrayOfStringAdapter = moshi.adapter(Types.arrayOf(String.class), emptySet, "roles");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "guidOffset");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "expandGroups");
        this.nullableArrayOfLongAdapter = moshi.adapter(Types.arrayOf(Long.class), emptySet, "groupFilter");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OrganizationChatSuggestParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        String[] strArr = null;
        String str2 = null;
        Long[] lArr = null;
        Long[] lArr2 = null;
        while (true) {
            Integer num2 = num;
            Boolean bool3 = bool;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str == null) {
                    throw Util.missingProperty("chatId", "chat_id", jsonReader);
                }
                if (num2 == null) {
                    throw Util.missingProperty("limit", "limit", jsonReader);
                }
                int intValue = num2.intValue();
                if (bool3 == null) {
                    throw Util.missingProperty("expandGroups", "expand_groups", jsonReader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (bool2 != null) {
                    return new OrganizationChatSuggestParams(str, intValue, strArr, str2, booleanValue, bool2.booleanValue(), lArr, lArr2);
                }
                throw Util.missingProperty("groupsOnly", "groups_only", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    num = num2;
                    bool = bool3;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("chatId", "chat_id", jsonReader);
                    }
                    num = num2;
                    bool = bool3;
                case 1:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("limit", "limit", jsonReader);
                    }
                    bool = bool3;
                case 2:
                    strArr = this.nullableArrayOfStringAdapter.fromJson(jsonReader);
                    num = num2;
                    bool = bool3;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    num = num2;
                    bool = bool3;
                case 4:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("expandGroups", "expand_groups", jsonReader);
                    }
                    num = num2;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("groupsOnly", "groups_only", jsonReader);
                    }
                    num = num2;
                    bool = bool3;
                case 6:
                    lArr = this.nullableArrayOfLongAdapter.fromJson(jsonReader);
                    num = num2;
                    bool = bool3;
                case 7:
                    lArr2 = this.nullableArrayOfLongAdapter.fromJson(jsonReader);
                    num = num2;
                    bool = bool3;
                default:
                    num = num2;
                    bool = bool3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OrganizationChatSuggestParams organizationChatSuggestParams) {
        OrganizationChatSuggestParams organizationChatSuggestParams2 = organizationChatSuggestParams;
        if (organizationChatSuggestParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) organizationChatSuggestParams2.getChatId());
        jsonWriter.name("limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(organizationChatSuggestParams2.getLimit()));
        jsonWriter.name("roles");
        this.nullableArrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) organizationChatSuggestParams2.getRoles());
        jsonWriter.name("guid_offset");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) organizationChatSuggestParams2.getGuidOffset());
        jsonWriter.name("expand_groups");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(organizationChatSuggestParams2.getExpandGroups()));
        jsonWriter.name("groups_only");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(organizationChatSuggestParams2.getGroupsOnly()));
        jsonWriter.name("group_filter");
        this.nullableArrayOfLongAdapter.toJson(jsonWriter, (JsonWriter) organizationChatSuggestParams2.getGroupFilter());
        jsonWriter.name("department_filter");
        this.nullableArrayOfLongAdapter.toJson(jsonWriter, (JsonWriter) organizationChatSuggestParams2.getDepartmentFilter());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(OrganizationChatSuggestParams)");
    }
}
