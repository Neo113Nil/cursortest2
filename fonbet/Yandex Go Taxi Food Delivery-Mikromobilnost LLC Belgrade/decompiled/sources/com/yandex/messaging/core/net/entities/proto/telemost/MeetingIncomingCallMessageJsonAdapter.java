package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingIncomingCallMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingIncomingCallMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoFanoutResponse;", "meetingInfoFanoutResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallSettings;", "nullableMeetingCallSettingsAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MeetingIncomingCallMessageJsonAdapter extends JsonAdapter<MeetingIncomingCallMessage> {
    private final JsonAdapter<MeetingInfoFanoutResponse> meetingInfoFanoutResponseAdapter;
    private final JsonAdapter<MeetingCallSettings> nullableMeetingCallSettingsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("MeetingInfo", "CallSettings");

    public MeetingIncomingCallMessageJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.meetingInfoFanoutResponseAdapter = moshi.adapter(MeetingInfoFanoutResponse.class, emptySet, "meetingInfo");
        this.nullableMeetingCallSettingsAdapter = moshi.adapter(MeetingCallSettings.class, emptySet, "callSettings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MeetingIncomingCallMessage fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        MeetingInfoFanoutResponse meetingInfoFanoutResponse = null;
        MeetingCallSettings meetingCallSettings = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                meetingInfoFanoutResponse = this.meetingInfoFanoutResponseAdapter.fromJson(jsonReader);
                if (meetingInfoFanoutResponse == null) {
                    throw Util.unexpectedNull("meetingInfo", "MeetingInfo", jsonReader);
                }
            } else if (selectName == 1) {
                meetingCallSettings = this.nullableMeetingCallSettingsAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (meetingInfoFanoutResponse != null) {
            return new MeetingIncomingCallMessage(meetingInfoFanoutResponse, meetingCallSettings);
        }
        throw Util.missingProperty("meetingInfo", "MeetingInfo", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MeetingIncomingCallMessage meetingIncomingCallMessage) {
        MeetingIncomingCallMessage meetingIncomingCallMessage2 = meetingIncomingCallMessage;
        if (meetingIncomingCallMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("MeetingInfo");
        this.meetingInfoFanoutResponseAdapter.toJson(jsonWriter, (JsonWriter) meetingIncomingCallMessage2.getMeetingInfo());
        jsonWriter.name("CallSettings");
        this.nullableMeetingCallSettingsAdapter.toJson(jsonWriter, (JsonWriter) meetingIncomingCallMessage2.getCallSettings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(MeetingIncomingCallMessage)");
    }
}
