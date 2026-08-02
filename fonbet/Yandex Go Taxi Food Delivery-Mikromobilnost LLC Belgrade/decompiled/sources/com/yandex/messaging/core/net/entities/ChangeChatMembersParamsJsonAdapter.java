package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.ChangeChatMembersParams;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemove;", "addRemoveAdapter", "Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveLong;", "nullableAddRemoveLongAdapter", "Lcom/yandex/messaging/core/net/entities/ChangeChatMembersParams$AddRemoveGroupDepartmentRef;", "nullableAddRemoveGroupDepartmentRefAdapter", "", "longAdapter", "nullableStringAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChangeChatMembersParamsJsonAdapter extends JsonAdapter<ChangeChatMembersParams> {
    private final JsonAdapter<ChangeChatMembersParams.AddRemove> addRemoveAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ChangeChatMembersParams> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<ChangeChatMembersParams.AddRemoveGroupDepartmentRef> nullableAddRemoveGroupDepartmentRefAdapter;
    private final JsonAdapter<ChangeChatMembersParams.AddRemoveLong> nullableAddRemoveLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat_id", CSPDirectoryConstants.SUBDIRECTORY_USERS, "groups", "departments", "group_refs", "department_refs", "version", "role", "force_update_role");
    private final JsonAdapter<String> stringAdapter;

    public ChangeChatMembersParamsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.addRemoveAdapter = moshi.adapter(ChangeChatMembersParams.AddRemove.class, emptySet, CSPDirectoryConstants.SUBDIRECTORY_USERS);
        this.nullableAddRemoveLongAdapter = moshi.adapter(ChangeChatMembersParams.AddRemoveLong.class, emptySet, "groups");
        this.nullableAddRemoveGroupDepartmentRefAdapter = moshi.adapter(ChangeChatMembersParams.AddRemoveGroupDepartmentRef.class, emptySet, "groupsRef");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "version");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "role");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "forceUpdateRole");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChangeChatMembersParams fromJson(JsonReader jsonReader) {
        ChangeChatMembersParams.AddRemoveLong addRemoveLong;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        ChangeChatMembersParams.AddRemoveLong addRemoveLong2 = null;
        Boolean bool2 = bool;
        ChangeChatMembersParams.AddRemove addRemove = null;
        String str = null;
        ChangeChatMembersParams.AddRemoveGroupDepartmentRef addRemoveGroupDepartmentRef = null;
        ChangeChatMembersParams.AddRemoveGroupDepartmentRef addRemoveGroupDepartmentRef2 = null;
        Long l = null;
        String str2 = null;
        int i = -1;
        ChangeChatMembersParams.AddRemoveLong addRemoveLong3 = null;
        while (true) {
            ChangeChatMembersParams.AddRemove addRemove2 = addRemove;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i == -269) {
                    if (str == null) {
                        throw Util.missingProperty("chatId", "chat_id", jsonReader);
                    }
                    if (addRemove2 == null) {
                        throw Util.missingProperty(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
                    }
                    if (l == null) {
                        throw Util.missingProperty("version", "version", jsonReader);
                    }
                    return new ChangeChatMembersParams(str, addRemove2, addRemoveLong2, addRemoveLong3, addRemoveGroupDepartmentRef2, addRemoveGroupDepartmentRef, l.longValue(), str2, bool2.booleanValue());
                }
                Constructor<ChangeChatMembersParams> constructor = this.constructorRef;
                if (constructor == null) {
                    addRemoveLong = addRemoveLong2;
                    constructor = ChangeChatMembersParams.class.getDeclaredConstructor(String.class, ChangeChatMembersParams.AddRemove.class, ChangeChatMembersParams.AddRemoveLong.class, ChangeChatMembersParams.AddRemoveLong.class, ChangeChatMembersParams.AddRemoveGroupDepartmentRef.class, ChangeChatMembersParams.AddRemoveGroupDepartmentRef.class, Long.TYPE, String.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    addRemoveLong = addRemoveLong2;
                }
                Constructor<ChangeChatMembersParams> constructor2 = constructor;
                if (str == null) {
                    throw Util.missingProperty("chatId", "chat_id", jsonReader);
                }
                if (addRemove2 == null) {
                    throw Util.missingProperty(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
                }
                if (l == null) {
                    throw Util.missingProperty("version", "version", jsonReader);
                }
                return constructor2.newInstance(str, addRemove2, addRemoveLong, addRemoveLong3, addRemoveGroupDepartmentRef2, addRemoveGroupDepartmentRef, l, str2, bool2, Integer.valueOf(i), null);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("chatId", "chat_id", jsonReader);
                    }
                    break;
                case 1:
                    addRemove = this.addRemoveAdapter.fromJson(jsonReader);
                    if (addRemove == null) {
                        throw Util.unexpectedNull(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
                    }
                    continue;
                case 2:
                    addRemoveLong2 = this.nullableAddRemoveLongAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    addRemoveLong3 = this.nullableAddRemoveLongAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    addRemoveGroupDepartmentRef2 = this.nullableAddRemoveGroupDepartmentRefAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    addRemoveGroupDepartmentRef = this.nullableAddRemoveGroupDepartmentRefAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("version", "version", jsonReader);
                    }
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("forceUpdateRole", "force_update_role", jsonReader);
                    }
                    i &= -257;
                    break;
            }
            addRemove = addRemove2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChangeChatMembersParams changeChatMembersParams) {
        ChangeChatMembersParams changeChatMembersParams2 = changeChatMembersParams;
        if (changeChatMembersParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) changeChatMembersParams2.getChatId());
        jsonWriter.name(CSPDirectoryConstants.SUBDIRECTORY_USERS);
        this.addRemoveAdapter.toJson(jsonWriter, (JsonWriter) changeChatMembersParams2.getUsers());
        jsonWriter.name("groups");
        this.nullableAddRemoveLongAdapter.toJson(jsonWriter, (JsonWriter) changeChatMembersParams2.getGroups());
        jsonWriter.name("departments");
        this.nullableAddRemoveLongAdapter.toJson(jsonWriter, (JsonWriter) changeChatMembersParams2.getDepartments());
        jsonWriter.name("group_refs");
        this.nullableAddRemoveGroupDepartmentRefAdapter.toJson(jsonWriter, (JsonWriter) changeChatMembersParams2.getGroupsRef());
        jsonWriter.name("department_refs");
        this.nullableAddRemoveGroupDepartmentRefAdapter.toJson(jsonWriter, (JsonWriter) changeChatMembersParams2.getDepartmentsRef());
        jsonWriter.name("version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(changeChatMembersParams2.getVersion()));
        jsonWriter.name("role");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) changeChatMembersParams2.getRole());
        jsonWriter.name("force_update_role");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(changeChatMembersParams2.getForceUpdateRole()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(ChangeChatMembersParams)");
    }
}
