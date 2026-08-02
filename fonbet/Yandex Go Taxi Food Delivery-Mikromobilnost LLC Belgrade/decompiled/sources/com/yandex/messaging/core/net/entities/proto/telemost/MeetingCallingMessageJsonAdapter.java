package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallingMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallingMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingIncomingCallMessage;", "nullableMeetingIncomingCallMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingRingingEndedMessage;", "nullableMeetingRingingEndedMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingRingingMessage;", "nullableMeetingRingingMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/telemost/OutgoingRingingEndedMessage;", "nullableOutgoingRingingEndedMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingEndRingingMessage;", "nullableMeetingEndRingingMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingNotifyRingingMessage;", "nullableMeetingNotifyRingingMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/telemost/EndOutgoingRingingMessage;", "nullableEndOutgoingRingingMessageAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MeetingCallingMessageJsonAdapter extends JsonAdapter<MeetingCallingMessage> {
    private volatile Constructor<MeetingCallingMessage> constructorRef;
    private final JsonAdapter<EndOutgoingRingingMessage> nullableEndOutgoingRingingMessageAdapter;
    private final JsonAdapter<MeetingEndRingingMessage> nullableMeetingEndRingingMessageAdapter;
    private final JsonAdapter<MeetingIncomingCallMessage> nullableMeetingIncomingCallMessageAdapter;
    private final JsonAdapter<MeetingNotifyRingingMessage> nullableMeetingNotifyRingingMessageAdapter;
    private final JsonAdapter<MeetingRingingEndedMessage> nullableMeetingRingingEndedMessageAdapter;
    private final JsonAdapter<MeetingRingingMessage> nullableMeetingRingingMessageAdapter;
    private final JsonAdapter<OutgoingRingingEndedMessage> nullableOutgoingRingingEndedMessageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("RingingId", "IncomingCall", "RingingEnded", "Ringing", "OutgoingRingingEnded", "EndRinging", "NotifyRinging", "EndOutgoingRinging");
    private final JsonAdapter<String> stringAdapter;

    public MeetingCallingMessageJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "ringingId");
        this.nullableMeetingIncomingCallMessageAdapter = moshi.adapter(MeetingIncomingCallMessage.class, emptySet, "incomingCall");
        this.nullableMeetingRingingEndedMessageAdapter = moshi.adapter(MeetingRingingEndedMessage.class, emptySet, "ringingEnded");
        this.nullableMeetingRingingMessageAdapter = moshi.adapter(MeetingRingingMessage.class, emptySet, "ringing");
        this.nullableOutgoingRingingEndedMessageAdapter = moshi.adapter(OutgoingRingingEndedMessage.class, emptySet, "outgoingRingingEnded");
        this.nullableMeetingEndRingingMessageAdapter = moshi.adapter(MeetingEndRingingMessage.class, emptySet, "endRinging");
        this.nullableMeetingNotifyRingingMessageAdapter = moshi.adapter(MeetingNotifyRingingMessage.class, emptySet, "notifyRinging");
        this.nullableEndOutgoingRingingMessageAdapter = moshi.adapter(EndOutgoingRingingMessage.class, emptySet, "endOutgoingRinging");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MeetingCallingMessage fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        MeetingIncomingCallMessage meetingIncomingCallMessage = null;
        MeetingRingingEndedMessage meetingRingingEndedMessage = null;
        MeetingRingingMessage meetingRingingMessage = null;
        OutgoingRingingEndedMessage outgoingRingingEndedMessage = null;
        MeetingEndRingingMessage meetingEndRingingMessage = null;
        MeetingNotifyRingingMessage meetingNotifyRingingMessage = null;
        EndOutgoingRingingMessage endOutgoingRingingMessage = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("ringingId", "RingingId", jsonReader);
                    }
                    break;
                case 1:
                    meetingIncomingCallMessage = this.nullableMeetingIncomingCallMessageAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    meetingRingingEndedMessage = this.nullableMeetingRingingEndedMessageAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    meetingRingingMessage = this.nullableMeetingRingingMessageAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    outgoingRingingEndedMessage = this.nullableOutgoingRingingEndedMessageAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    meetingEndRingingMessage = this.nullableMeetingEndRingingMessageAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    meetingNotifyRingingMessage = this.nullableMeetingNotifyRingingMessageAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    endOutgoingRingingMessage = this.nullableEndOutgoingRingingMessageAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -255) {
            EndOutgoingRingingMessage endOutgoingRingingMessage2 = endOutgoingRingingMessage;
            MeetingNotifyRingingMessage meetingNotifyRingingMessage2 = meetingNotifyRingingMessage;
            MeetingEndRingingMessage meetingEndRingingMessage2 = meetingEndRingingMessage;
            OutgoingRingingEndedMessage outgoingRingingEndedMessage2 = outgoingRingingEndedMessage;
            MeetingRingingMessage meetingRingingMessage2 = meetingRingingMessage;
            MeetingRingingEndedMessage meetingRingingEndedMessage2 = meetingRingingEndedMessage;
            MeetingIncomingCallMessage meetingIncomingCallMessage2 = meetingIncomingCallMessage;
            String str2 = str;
            if (str2 != null) {
                return new MeetingCallingMessage(str2, meetingIncomingCallMessage2, meetingRingingEndedMessage2, meetingRingingMessage2, outgoingRingingEndedMessage2, meetingEndRingingMessage2, meetingNotifyRingingMessage2, endOutgoingRingingMessage2);
            }
            throw Util.missingProperty("ringingId", "RingingId", jsonReader);
        }
        EndOutgoingRingingMessage endOutgoingRingingMessage3 = endOutgoingRingingMessage;
        MeetingNotifyRingingMessage meetingNotifyRingingMessage3 = meetingNotifyRingingMessage;
        MeetingEndRingingMessage meetingEndRingingMessage3 = meetingEndRingingMessage;
        OutgoingRingingEndedMessage outgoingRingingEndedMessage3 = outgoingRingingEndedMessage;
        MeetingRingingMessage meetingRingingMessage3 = meetingRingingMessage;
        MeetingRingingEndedMessage meetingRingingEndedMessage3 = meetingRingingEndedMessage;
        MeetingIncomingCallMessage meetingIncomingCallMessage3 = meetingIncomingCallMessage;
        String str3 = str;
        Constructor<MeetingCallingMessage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MeetingCallingMessage.class.getDeclaredConstructor(String.class, MeetingIncomingCallMessage.class, MeetingRingingEndedMessage.class, MeetingRingingMessage.class, OutgoingRingingEndedMessage.class, MeetingEndRingingMessage.class, MeetingNotifyRingingMessage.class, EndOutgoingRingingMessage.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str3 != null) {
            return constructor.newInstance(str3, meetingIncomingCallMessage3, meetingRingingEndedMessage3, meetingRingingMessage3, outgoingRingingEndedMessage3, meetingEndRingingMessage3, meetingNotifyRingingMessage3, endOutgoingRingingMessage3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("ringingId", "RingingId", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MeetingCallingMessage meetingCallingMessage) {
        MeetingCallingMessage meetingCallingMessage2 = meetingCallingMessage;
        if (meetingCallingMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("RingingId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) meetingCallingMessage2.getRingingId());
        jsonWriter.name("IncomingCall");
        this.nullableMeetingIncomingCallMessageAdapter.toJson(jsonWriter, (JsonWriter) meetingCallingMessage2.getIncomingCall());
        jsonWriter.name("RingingEnded");
        this.nullableMeetingRingingEndedMessageAdapter.toJson(jsonWriter, (JsonWriter) meetingCallingMessage2.getRingingEnded());
        jsonWriter.name("Ringing");
        this.nullableMeetingRingingMessageAdapter.toJson(jsonWriter, (JsonWriter) meetingCallingMessage2.getRinging());
        jsonWriter.name("OutgoingRingingEnded");
        this.nullableOutgoingRingingEndedMessageAdapter.toJson(jsonWriter, (JsonWriter) meetingCallingMessage2.getOutgoingRingingEnded());
        jsonWriter.name("EndRinging");
        this.nullableMeetingEndRingingMessageAdapter.toJson(jsonWriter, (JsonWriter) meetingCallingMessage2.getEndRinging());
        jsonWriter.name("NotifyRinging");
        this.nullableMeetingNotifyRingingMessageAdapter.toJson(jsonWriter, (JsonWriter) meetingCallingMessage2.getNotifyRinging());
        jsonWriter.name("EndOutgoingRinging");
        this.nullableEndOutgoingRingingMessageAdapter.toJson(jsonWriter, (JsonWriter) meetingCallingMessage2.getEndOutgoingRinging());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(MeetingCallingMessage)");
    }
}
