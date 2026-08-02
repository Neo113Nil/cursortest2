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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoFanoutResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoFanoutResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "intAdapter", "", "nullableArrayOfStringAdapter", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MeetingInfoFanoutResponseJsonAdapter extends JsonAdapter<MeetingInfoFanoutResponse> {
    private volatile Constructor<MeetingInfoFanoutResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String[]> nullableArrayOfStringAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("MeetingId", "ChatId", "CreateTimestamp", "ParticipantsCount", "Status", "Version", "ParticipantGuids", "MaxParticipantsCount");
    private final JsonAdapter<String> stringAdapter;

    public MeetingInfoFanoutResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "meetingId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "creationTimestampMs");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "participantsCount");
        this.nullableArrayOfStringAdapter = moshi.adapter(Types.arrayOf(String.class), emptySet, "participantGuids");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "maxParticipantsCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MeetingInfoFanoutResponse fromJson(JsonReader jsonReader) {
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
            Long l4 = l2;
            String[] strArr2 = strArr;
            if (!jsonReader.hasNext()) {
                Integer num6 = num3;
                jsonReader.endObject();
                if (i2 == -129) {
                    if (str3 == null) {
                        throw Util.missingProperty("meetingId", "MeetingId", jsonReader);
                    }
                    if (str4 == null) {
                        throw Util.missingProperty("chatId", "ChatId", jsonReader);
                    }
                    if (l3 == null) {
                        throw Util.missingProperty("creationTimestampMs", "CreateTimestamp", jsonReader);
                    }
                    long longValue = l3.longValue();
                    if (num4 == null) {
                        throw Util.missingProperty("participantsCount", "ParticipantsCount", jsonReader);
                    }
                    int intValue = num4.intValue();
                    if (num5 == null) {
                        throw Util.missingProperty(ACSPConstants.STATUS, "Status", jsonReader);
                    }
                    int intValue2 = num5.intValue();
                    if (l4 != null) {
                        return new MeetingInfoFanoutResponse(str3, str4, longValue, intValue, intValue2, l4.longValue(), strArr2, num6);
                    }
                    throw Util.missingProperty("version", "Version", jsonReader);
                }
                Constructor<MeetingInfoFanoutResponse> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Long.TYPE;
                    Class cls3 = Integer.TYPE;
                    i = i2;
                    constructor = MeetingInfoFanoutResponse.class.getDeclaredConstructor(String.class, String.class, cls2, cls3, cls3, cls2, String[].class, Integer.class, cls3, cls);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<MeetingInfoFanoutResponse> constructor2 = constructor;
                if (str3 == null) {
                    throw Util.missingProperty("meetingId", "MeetingId", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("chatId", "ChatId", jsonReader);
                }
                if (l3 == null) {
                    throw Util.missingProperty("creationTimestampMs", "CreateTimestamp", jsonReader);
                }
                if (num4 == null) {
                    throw Util.missingProperty("participantsCount", "ParticipantsCount", jsonReader);
                }
                if (num5 == null) {
                    throw Util.missingProperty(ACSPConstants.STATUS, "Status", jsonReader);
                }
                if (l4 != null) {
                    return constructor2.newInstance(str3, str4, l3, num4, num5, l4, strArr2, num6, Integer.valueOf(i), null);
                }
                throw Util.missingProperty("version", "Version", jsonReader);
            }
            Integer num7 = num3;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    num3 = num7;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                    l2 = l4;
                    strArr = strArr2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("meetingId", "MeetingId", jsonReader);
                    }
                    num3 = num7;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                    l2 = l4;
                    strArr = strArr2;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("chatId", "ChatId", jsonReader);
                    }
                    num3 = num7;
                    str = str3;
                    l = l3;
                    num = num4;
                    num2 = num5;
                    l2 = l4;
                    strArr = strArr2;
                case 2:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("creationTimestampMs", "CreateTimestamp", jsonReader);
                    }
                    num3 = num7;
                    str = str3;
                    str2 = str4;
                    num = num4;
                    num2 = num5;
                    l2 = l4;
                    strArr = strArr2;
                case 3:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("participantsCount", "ParticipantsCount", jsonReader);
                    }
                    num3 = num7;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num2 = num5;
                    l2 = l4;
                    strArr = strArr2;
                case 4:
                    Integer fromJson = this.intAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, "Status", jsonReader);
                    }
                    num2 = fromJson;
                    num3 = num7;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    l2 = l4;
                    strArr = strArr2;
                case 5:
                    Long fromJson2 = this.longAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("version", "Version", jsonReader);
                    }
                    l2 = fromJson2;
                    num3 = num7;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                    strArr = strArr2;
                case 6:
                    strArr = this.nullableArrayOfStringAdapter.fromJson(jsonReader);
                    num3 = num7;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                    l2 = l4;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader);
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                    l2 = l4;
                    strArr = strArr2;
                    i2 = -129;
                default:
                    num3 = num7;
                    str = str3;
                    str2 = str4;
                    l = l3;
                    num = num4;
                    num2 = num5;
                    l2 = l4;
                    strArr = strArr2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MeetingInfoFanoutResponse meetingInfoFanoutResponse) {
        MeetingInfoFanoutResponse meetingInfoFanoutResponse2 = meetingInfoFanoutResponse;
        if (meetingInfoFanoutResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("MeetingId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) meetingInfoFanoutResponse2.getMeetingId());
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) meetingInfoFanoutResponse2.getChatId());
        jsonWriter.name("CreateTimestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(meetingInfoFanoutResponse2.getCreationTimestampMs()));
        jsonWriter.name("ParticipantsCount");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(meetingInfoFanoutResponse2.getParticipantsCount()));
        jsonWriter.name("Status");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(meetingInfoFanoutResponse2.getStatus()));
        jsonWriter.name("Version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(meetingInfoFanoutResponse2.getVersion()));
        jsonWriter.name("ParticipantGuids");
        this.nullableArrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) meetingInfoFanoutResponse2.getParticipantGuids());
        jsonWriter.name("MaxParticipantsCount");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) meetingInfoFanoutResponse2.getMaxParticipantsCount());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(MeetingInfoFanoutResponse)");
    }
}
