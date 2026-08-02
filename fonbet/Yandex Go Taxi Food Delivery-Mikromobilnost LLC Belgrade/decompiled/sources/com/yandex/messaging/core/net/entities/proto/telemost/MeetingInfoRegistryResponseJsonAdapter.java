package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoRegistryResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoRegistryResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "intAdapter", "", "nullableArrayOfStringAdapter", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MeetingInfoRegistryResponseJsonAdapter extends JsonAdapter<MeetingInfoRegistryResponse> {
    private volatile Constructor<MeetingInfoRegistryResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String[]> nullableArrayOfStringAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("meeting_id", "chat_id", "create_timestamp", "participants_count", ACSPConstants.STATUS, "version", "participant_guids", "max_participants_count");
    private final JsonAdapter<String> stringAdapter;

    public MeetingInfoRegistryResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "meetingId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "creationTimestampMs");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "participantsCount");
        this.nullableArrayOfStringAdapter = moshi.adapter(Types.arrayOf(String.class), emptySet, "participantGuids");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "maxParticipantsCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MeetingInfoRegistryResponse fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        String str2 = null;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        Long l2 = null;
        String[] strArr = null;
        Integer num3 = null;
        while (true) {
            String str3 = str;
            String str4 = str2;
            Long l3 = l;
            Integer num4 = num;
            Integer num5 = num2;
            if (!jsonReader.hasNext()) {
                Long l4 = l2;
                jsonReader.endObject();
                if (i2 == -129) {
                    if (str3 == null) {
                        throw Util.missingProperty("meetingId", "meeting_id", jsonReader);
                    }
                    if (str4 == null) {
                        throw Util.missingProperty("chatId", "chat_id", jsonReader);
                    }
                    if (l3 == null) {
                        throw Util.missingProperty("creationTimestampMs", "create_timestamp", jsonReader);
                    }
                    long longValue = l3.longValue();
                    if (num4 == null) {
                        throw Util.missingProperty("participantsCount", "participants_count", jsonReader);
                    }
                    int intValue = num4.intValue();
                    if (num5 == null) {
                        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    String[] strArr2 = strArr;
                    int intValue2 = num5.intValue();
                    if (l4 != null) {
                        return new MeetingInfoRegistryResponse(str3, str4, longValue, intValue, intValue2, l4.longValue(), strArr2, num3);
                    }
                    throw Util.missingProperty("version", "version", jsonReader);
                }
                Constructor<MeetingInfoRegistryResponse> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Long.TYPE;
                    Class cls3 = Integer.TYPE;
                    i = i2;
                    constructor = MeetingInfoRegistryResponse.class.getDeclaredConstructor(String.class, String.class, cls2, cls3, cls3, cls2, String[].class, Integer.class, cls3, cls);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<MeetingInfoRegistryResponse> constructor2 = constructor;
                if (str3 == null) {
                    throw Util.missingProperty("meetingId", "meeting_id", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("chatId", "chat_id", jsonReader);
                }
                if (l3 == null) {
                    throw Util.missingProperty("creationTimestampMs", "create_timestamp", jsonReader);
                }
                if (num4 == null) {
                    throw Util.missingProperty("participantsCount", "participants_count", jsonReader);
                }
                if (num5 == null) {
                    throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
                if (l4 == null) {
                    throw Util.missingProperty("version", "version", jsonReader);
                }
                return constructor2.newInstance(str3, str4, l3, num4, num5, l4, strArr, num3, Integer.valueOf(i), null);
            }
            Long l5 = l2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    l2 = l5;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("meetingId", "meeting_id", jsonReader);
                    }
                    l2 = l5;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("chatId", "chat_id", jsonReader);
                    }
                    l2 = l5;
                    str = str3;
                    l = l3;
                    num = num4;
                    num2 = num5;
                case 2:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("creationTimestampMs", "create_timestamp", jsonReader);
                    }
                    l2 = l5;
                    str = str3;
                    str2 = str4;
                    num = num4;
                    num2 = num5;
                case 3:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("participantsCount", "participants_count", jsonReader);
                    }
                    l2 = l5;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num2 = num5;
                case 4:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    l2 = l5;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                case 5:
                    l2 = this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        throw Util.unexpectedNull("version", "version", jsonReader);
                    }
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                case 6:
                    strArr = this.nullableArrayOfStringAdapter.fromJson(jsonReader);
                    l2 = l5;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader);
                    l2 = l5;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                    i2 = -129;
                default:
                    l2 = l5;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MeetingInfoRegistryResponse meetingInfoRegistryResponse) {
        MeetingInfoRegistryResponse meetingInfoRegistryResponse2 = meetingInfoRegistryResponse;
        if (meetingInfoRegistryResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("meeting_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) meetingInfoRegistryResponse2.getMeetingId());
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) meetingInfoRegistryResponse2.getChatId());
        jsonWriter.name("create_timestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(meetingInfoRegistryResponse2.getCreationTimestampMs()));
        jsonWriter.name("participants_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(meetingInfoRegistryResponse2.getParticipantsCount()));
        jsonWriter.name(ACSPConstants.STATUS);
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(meetingInfoRegistryResponse2.getStatus()));
        jsonWriter.name("version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(meetingInfoRegistryResponse2.getVersion()));
        jsonWriter.name("participant_guids");
        this.nullableArrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) meetingInfoRegistryResponse2.getParticipantGuids());
        jsonWriter.name("max_participants_count");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) meetingInfoRegistryResponse2.getMaxParticipantsCount());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(MeetingInfoRegistryResponse)");
    }
}
