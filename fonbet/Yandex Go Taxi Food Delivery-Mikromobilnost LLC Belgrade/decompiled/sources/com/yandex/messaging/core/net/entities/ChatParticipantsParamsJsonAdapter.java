package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChatParticipantsParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ChatParticipantsParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "intAdapter", "", "nullableArrayOfStringAdapter", "", "booleanAdapter", "", "nullableArrayOfLongAdapter", "Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "nullableArrayOfGroupDepartmentRefAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatParticipantsParamsJsonAdapter extends JsonAdapter<ChatParticipantsParams> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ChatParticipantsParams> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<GroupDepartmentRef[]> nullableArrayOfGroupDepartmentRefAdapter;
    private final JsonAdapter<Long[]> nullableArrayOfLongAdapter;
    private final JsonAdapter<String[]> nullableArrayOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat_id", "invite_hash", "limit", "roles", "guid_offset", "expand_groups", "groups_only", "group_filter", "department_filter", "group_ref_filter", "department_ref_filter");
    private final JsonAdapter<String> stringAdapter;

    public ChatParticipantsParamsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "inviteHash");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "limit");
        this.nullableArrayOfStringAdapter = moshi.adapter(Types.arrayOf(String.class), emptySet, "roles");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "expandGroups");
        this.nullableArrayOfLongAdapter = moshi.adapter(Types.arrayOf(Long.class), emptySet, "groupFilter");
        this.nullableArrayOfGroupDepartmentRefAdapter = moshi.adapter(Types.arrayOf(GroupDepartmentRef.class), emptySet, "groupRefFilter");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChatParticipantsParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        Integer num = null;
        String[] strArr = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Long[] lArr = null;
        Long[] lArr2 = null;
        GroupDepartmentRef[] groupDepartmentRefArr = null;
        GroupDepartmentRef[] groupDepartmentRefArr2 = null;
        while (true) {
            String str4 = str;
            String str5 = str2;
            Integer num2 = num;
            String[] strArr2 = strArr;
            String str6 = str3;
            if (!jsonReader.hasNext()) {
                Boolean bool3 = bool;
                jsonReader.endObject();
                if (i == -1921) {
                    if (str4 == null) {
                        throw Util.missingProperty("chatId", "chat_id", jsonReader);
                    }
                    if (num2 == null) {
                        throw Util.missingProperty("limit", "limit", jsonReader);
                    }
                    int intValue = num2.intValue();
                    if (bool3 == null) {
                        throw Util.missingProperty("expandGroups", "expand_groups", jsonReader);
                    }
                    Boolean bool4 = bool2;
                    boolean booleanValue = bool3.booleanValue();
                    if (bool4 == null) {
                        throw Util.missingProperty("groupsOnly", "groups_only", jsonReader);
                    }
                    return new ChatParticipantsParams(str4, str5, intValue, strArr2, str6, booleanValue, bool4.booleanValue(), lArr, lArr2, groupDepartmentRefArr, groupDepartmentRefArr2);
                }
                Boolean bool5 = bool2;
                Long[] lArr3 = lArr2;
                Long[] lArr4 = lArr;
                Constructor<ChatParticipantsParams> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Integer.TYPE;
                    Class cls3 = Boolean.TYPE;
                    constructor = ChatParticipantsParams.class.getDeclaredConstructor(String.class, String.class, cls2, String[].class, String.class, cls3, cls3, Long[].class, Long[].class, GroupDepartmentRef[].class, GroupDepartmentRef[].class, cls2, cls);
                    this.constructorRef = constructor;
                }
                Constructor<ChatParticipantsParams> constructor2 = constructor;
                if (str4 == null) {
                    throw Util.missingProperty("chatId", "chat_id", jsonReader);
                }
                if (num2 == null) {
                    throw Util.missingProperty("limit", "limit", jsonReader);
                }
                if (bool3 == null) {
                    throw Util.missingProperty("expandGroups", "expand_groups", jsonReader);
                }
                if (bool5 == null) {
                    throw Util.missingProperty("groupsOnly", "groups_only", jsonReader);
                }
                return constructor2.newInstance(str4, str5, num2, strArr2, str6, bool3, bool5, lArr4, lArr3, groupDepartmentRefArr, groupDepartmentRefArr2, Integer.valueOf(i), null);
            }
            Boolean bool6 = bool;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("chatId", "chat_id", jsonReader);
                    }
                    bool = bool6;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool6;
                    str = str4;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
                case 2:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("limit", "limit", jsonReader);
                    }
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    strArr = strArr2;
                    str3 = str6;
                case 3:
                    strArr = this.nullableArrayOfStringAdapter.fromJson(jsonReader);
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    num = num2;
                    str3 = str6;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                case 5:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("expandGroups", "expand_groups", jsonReader);
                    }
                    str = str4;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("groupsOnly", "groups_only", jsonReader);
                    }
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
                case 7:
                    lArr = this.nullableArrayOfLongAdapter.fromJson(jsonReader);
                    i &= -129;
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
                case 8:
                    lArr2 = this.nullableArrayOfLongAdapter.fromJson(jsonReader);
                    i &= -257;
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
                case 9:
                    groupDepartmentRefArr = this.nullableArrayOfGroupDepartmentRefAdapter.fromJson(jsonReader);
                    i &= -513;
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
                case 10:
                    groupDepartmentRefArr2 = this.nullableArrayOfGroupDepartmentRefAdapter.fromJson(jsonReader);
                    i &= -1025;
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
                default:
                    bool = bool6;
                    str = str4;
                    str2 = str5;
                    num = num2;
                    strArr = strArr2;
                    str3 = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChatParticipantsParams chatParticipantsParams) {
        ChatParticipantsParams chatParticipantsParams2 = chatParticipantsParams;
        if (chatParticipantsParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsParams2.getChatId());
        jsonWriter.name("invite_hash");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsParams2.getInviteHash());
        jsonWriter.name("limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(chatParticipantsParams2.getLimit()));
        jsonWriter.name("roles");
        this.nullableArrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsParams2.getRoles());
        jsonWriter.name("guid_offset");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsParams2.getGuidOffset());
        jsonWriter.name("expand_groups");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(chatParticipantsParams2.getExpandGroups()));
        jsonWriter.name("groups_only");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(chatParticipantsParams2.getGroupsOnly()));
        jsonWriter.name("group_filter");
        this.nullableArrayOfLongAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsParams2.getGroupFilter());
        jsonWriter.name("department_filter");
        this.nullableArrayOfLongAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsParams2.getDepartmentFilter());
        jsonWriter.name("group_ref_filter");
        this.nullableArrayOfGroupDepartmentRefAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsParams2.getGroupRefFilter());
        jsonWriter.name("department_ref_filter");
        this.nullableArrayOfGroupDepartmentRefAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsParams2.getDepartmentRefFilter());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(ChatParticipantsParams)");
    }
}
