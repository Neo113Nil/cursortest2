package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingIncomingCallMessage;", "", "meetingInfo", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoFanoutResponse;", "callSettings", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallSettings;", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoFanoutResponse;Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallSettings;)V", "getMeetingInfo", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoFanoutResponse;", "getCallSettings", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MeetingIncomingCallMessage {

    @xuf0(tag = 2)
    private final MeetingCallSettings callSettings;

    @xuf0(tag = 1)
    private final MeetingInfoFanoutResponse meetingInfo;

    public MeetingIncomingCallMessage(@Json(name = "MeetingInfo") MeetingInfoFanoutResponse meetingInfoFanoutResponse, @Json(name = "CallSettings") MeetingCallSettings meetingCallSettings) {
        this.meetingInfo = meetingInfoFanoutResponse;
        this.callSettings = meetingCallSettings;
    }

    public static /* synthetic */ MeetingIncomingCallMessage copy$default(MeetingIncomingCallMessage meetingIncomingCallMessage, MeetingInfoFanoutResponse meetingInfoFanoutResponse, MeetingCallSettings meetingCallSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            meetingInfoFanoutResponse = meetingIncomingCallMessage.meetingInfo;
        }
        if ((i & 2) != 0) {
            meetingCallSettings = meetingIncomingCallMessage.callSettings;
        }
        return meetingIncomingCallMessage.copy(meetingInfoFanoutResponse, meetingCallSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final MeetingInfoFanoutResponse getMeetingInfo() {
        return this.meetingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final MeetingCallSettings getCallSettings() {
        return this.callSettings;
    }

    public final MeetingIncomingCallMessage copy(@Json(name = "MeetingInfo") MeetingInfoFanoutResponse meetingInfo, @Json(name = "CallSettings") MeetingCallSettings callSettings) {
        return new MeetingIncomingCallMessage(meetingInfo, callSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeetingIncomingCallMessage)) {
            return false;
        }
        MeetingIncomingCallMessage meetingIncomingCallMessage = (MeetingIncomingCallMessage) other;
        return jl40.l(this.meetingInfo, meetingIncomingCallMessage.meetingInfo) && jl40.l(this.callSettings, meetingIncomingCallMessage.callSettings);
    }

    public final MeetingCallSettings getCallSettings() {
        return this.callSettings;
    }

    public final MeetingInfoFanoutResponse getMeetingInfo() {
        return this.meetingInfo;
    }

    public int hashCode() {
        int hashCode = this.meetingInfo.hashCode() * 31;
        MeetingCallSettings meetingCallSettings = this.callSettings;
        return hashCode + (meetingCallSettings == null ? 0 : meetingCallSettings.hashCode());
    }

    public String toString() {
        return "MeetingIncomingCallMessage(meetingInfo=" + this.meetingInfo + ", callSettings=" + this.callSettings + Extension.C_BRAKE;
    }
}
