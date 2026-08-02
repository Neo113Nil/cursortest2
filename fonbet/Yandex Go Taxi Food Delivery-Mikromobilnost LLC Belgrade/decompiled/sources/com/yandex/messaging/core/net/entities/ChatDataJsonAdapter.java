package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.proto.ChatEventTypes;
import defpackage.kju0;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\fR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChatDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ChatData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableStringAdapter", "", "booleanAdapter", "", "doubleAdapter", "", "nullableArrayOfStringAdapter", "Lcom/yandex/messaging/core/net/entities/ChatData$Roles;", "nullableRolesAdapter", "nullableLongAdapter", "arrayOfStringAdapter", "nullableBooleanAdapter", "nullableDoubleAdapter", "Lcom/yandex/messaging/core/net/entities/UserData;", "nullableUserDataAdapter", "Lcom/yandex/messaging/core/net/entities/Metadata;", "nullableMetadataAdapter", "", "nullableLongArrayAdapter", "Lcom/yandex/messaging/core/net/entities/proto/ChatEventTypes;", "nullableChatEventTypesAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatDataJsonAdapter extends JsonAdapter<ChatData> {
    private final JsonAdapter<String[]> arrayOfStringAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ChatData> constructorRef;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String[]> nullableArrayOfStringAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ChatEventTypes> nullableChatEventTypesAdapter;
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<long[]> nullableLongArrayAdapter;
    private final JsonAdapter<Metadata> nullableMetadataAdapter;
    private final JsonAdapter<ChatData.Roles> nullableRolesAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UserData> nullableUserDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat_id", "version", "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "avatar_id", "private", "create_timestamp", "members", "roles", "role", "role_version", "rights", "public", "is_public", "invite_hash", "latitude", "longitude", "user", kju0.j, "alias", "current_profile_id", "is_transient", "organization_ids", "supported_events", "has_guests", "federative");
    private final JsonAdapter<String> stringAdapter;

    public ChatDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "version");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isPrivate");
        this.doubleAdapter = moshi.adapter(Double.TYPE, emptySet, "createTimestamp");
        this.nullableArrayOfStringAdapter = moshi.adapter(Types.arrayOf(String.class), emptySet, "members");
        this.nullableRolesAdapter = moshi.adapter(ChatData.Roles.class, emptySet, "roles");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "roleVersion");
        this.arrayOfStringAdapter = moshi.adapter(Types.arrayOf(String.class), emptySet, "rights");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isPublic");
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, "latitude");
        this.nullableUserDataAdapter = moshi.adapter(UserData.class, emptySet, "interlocutor");
        this.nullableMetadataAdapter = moshi.adapter(Metadata.class, emptySet, kju0.j);
        this.nullableLongArrayAdapter = moshi.adapter(long[].class, emptySet, "organizationIds");
        this.nullableChatEventTypesAdapter = moshi.adapter(ChatEventTypes.class, emptySet, "supportedEvents");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChatData fromJson(JsonReader jsonReader) {
        int i;
        Boolean bool = Boolean.FALSE;
        Double valueOf = Double.valueOf(0.0d);
        jsonReader.beginObject();
        int i2 = -1;
        Long l = 0L;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Double d = valueOf;
        String[] strArr = null;
        ChatData.Roles roles = null;
        String str = null;
        Long l2 = null;
        ChatEventTypes chatEventTypes = null;
        Boolean bool4 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String[] strArr2 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str6 = null;
        Double d2 = null;
        Double d3 = null;
        UserData userData = null;
        Metadata metadata = null;
        String str7 = null;
        String str8 = null;
        Boolean bool7 = null;
        long[] jArr = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("chatId", "chat_id", jsonReader);
                    }
                    continue;
                case 1:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("version", "version", jsonReader);
                    }
                    i2 &= -3;
                    continue;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    continue;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    continue;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    continue;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isPrivate", "private", jsonReader);
                    }
                    i2 &= -33;
                    continue;
                case 6:
                    d = this.doubleAdapter.fromJson(jsonReader);
                    if (d == null) {
                        throw Util.unexpectedNull("createTimestamp", "create_timestamp", jsonReader);
                    }
                    i2 &= -65;
                    continue;
                case 7:
                    strArr = this.nullableArrayOfStringAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    continue;
                case 8:
                    roles = this.nullableRolesAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    continue;
                case 9:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    continue;
                case 10:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader);
                    i2 &= -1025;
                    continue;
                case 11:
                    strArr2 = this.arrayOfStringAdapter.fromJson(jsonReader);
                    if (strArr2 == null) {
                        throw Util.unexpectedNull("rights", "rights", jsonReader);
                    }
                    i2 &= -2049;
                    continue;
                case 12:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -4097;
                    continue;
                case 13:
                    bool6 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -8193;
                    continue;
                case 14:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -16385;
                    continue;
                case 15:
                    d2 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    i = -32769;
                    break;
                case 16:
                    d3 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    i = -65537;
                    break;
                case 17:
                    userData = this.nullableUserDataAdapter.fromJson(jsonReader);
                    i = -131073;
                    break;
                case 18:
                    metadata = this.nullableMetadataAdapter.fromJson(jsonReader);
                    i = -262145;
                    break;
                case 19:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    i = -524289;
                    break;
                case 20:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    i = -1048577;
                    break;
                case 21:
                    bool7 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    i = -2097153;
                    break;
                case 22:
                    jArr = this.nullableLongArrayAdapter.fromJson(jsonReader);
                    i = -4194305;
                    break;
                case 23:
                    chatEventTypes = this.nullableChatEventTypesAdapter.fromJson(jsonReader);
                    i = -8388609;
                    break;
                case 24:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("hasGuests", "has_guests", jsonReader);
                    }
                    i = -16777217;
                    break;
                case 25:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    i = -33554433;
                    break;
            }
            i2 &= i;
        }
        jsonReader.endObject();
        if (i2 == -67108863) {
            Boolean bool8 = bool4;
            if (str2 == null) {
                throw Util.missingProperty("chatId", "chat_id", jsonReader);
            }
            return new ChatData(str2, l.longValue(), str3, str4, str5, bool2.booleanValue(), d.doubleValue(), strArr, roles, str, l2, strArr2, bool5, bool6, str6, d2, d3, userData, metadata, str7, str8, bool7, jArr, chatEventTypes, bool3.booleanValue(), bool8);
        }
        Boolean bool9 = bool4;
        Constructor<ChatData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            Class cls4 = Boolean.TYPE;
            constructor = ChatData.class.getDeclaredConstructor(String.class, cls3, String.class, String.class, String.class, cls4, Double.TYPE, String[].class, ChatData.Roles.class, String.class, Long.class, String[].class, Boolean.class, Boolean.class, String.class, Double.class, Double.class, UserData.class, Metadata.class, String.class, String.class, Boolean.class, long[].class, ChatEventTypes.class, cls4, Boolean.class, cls, cls2);
            this.constructorRef = constructor;
        }
        if (str2 == null) {
            throw Util.missingProperty("chatId", "chat_id", jsonReader);
        }
        return constructor.newInstance(str2, l, str3, str4, str5, bool2, d, strArr, roles, str, l2, strArr2, bool5, bool6, str6, d2, d3, userData, metadata, str7, str8, bool7, jArr, chatEventTypes, bool3, bool9, Integer.valueOf(i2), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChatData chatData) {
        ChatData chatData2 = chatData;
        if (chatData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getChatId());
        jsonWriter.name("version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(chatData2.getVersion()));
        jsonWriter.name("name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getName());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getDescription());
        jsonWriter.name("avatar_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getAvatarId());
        jsonWriter.name("private");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(chatData2.isPrivate()));
        jsonWriter.name("create_timestamp");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(chatData2.getCreateTimestamp()));
        jsonWriter.name("members");
        this.nullableArrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getMembers());
        jsonWriter.name("roles");
        this.nullableRolesAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getRoles());
        jsonWriter.name("role");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getRole());
        jsonWriter.name("role_version");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getRoleVersion());
        jsonWriter.name("rights");
        this.arrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getRights());
        jsonWriter.name("public");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) chatData2.isPublic());
        jsonWriter.name("is_public");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getChannelPublicity());
        jsonWriter.name("invite_hash");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getInviteHash());
        jsonWriter.name("latitude");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getLatitude());
        jsonWriter.name("longitude");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getLongitude());
        jsonWriter.name("user");
        this.nullableUserDataAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getInterlocutor());
        jsonWriter.name(kju0.j);
        this.nullableMetadataAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getMetadata());
        jsonWriter.name("alias");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getAlias());
        jsonWriter.name("current_profile_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getCurrentProfileId());
        jsonWriter.name("is_transient");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) chatData2.isTransient());
        jsonWriter.name("organization_ids");
        this.nullableLongArrayAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getOrganizationIds());
        jsonWriter.name("supported_events");
        this.nullableChatEventTypesAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getSupportedEvents());
        jsonWriter.name("has_guests");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(chatData2.getHasGuests()));
        jsonWriter.name("federative");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) chatData2.getFederative());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(30, "GeneratedJsonAdapter(ChatData)");
    }
}
