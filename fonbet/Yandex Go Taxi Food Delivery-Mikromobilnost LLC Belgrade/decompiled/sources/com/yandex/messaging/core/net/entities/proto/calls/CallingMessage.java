package com.yandex.messaging.core.net.entities.proto.calls;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public class CallingMessage {

    @Json(name = "AcceptCall")
    @xuf0(tag = 102)
    public AcceptCall acceptCall;

    @Json(name = "CallAccepted")
    @xuf0(tag = 103)
    public CallAccepted callAccepted;

    @Json(name = "CallDeclined")
    @xuf0(tag = 104)
    public CallDeclined callDeclined;

    @Json(name = "CallEnded")
    @xuf0(tag = HProv.PP_SET_PIN)
    public CallEnded callEnded;

    @cex
    @Json(name = "CallGuid")
    @xuf0(tag = 2)
    public String callGuid;

    @cex
    @Json(name = "ChatId")
    @xuf0(tag = 1)
    public String chatId;

    @Json(name = "DeclineCall")
    @xuf0(tag = 110)
    public DeclineCall declineCall;

    @Json(name = "DeviceId")
    @xuf0(tag = 4)
    public String deviceId;

    @Json(name = "EndCall")
    @xuf0(tag = 105)
    public EndCall endCall;

    @Json(name = "IncomingCall")
    @xuf0(tag = 106)
    public IncomingCall incomingCall;

    @Json(name = "MakeCall")
    @xuf0(tag = 101)
    public MakeCall makeCall;

    @Json(name = "NotifyRinging")
    @xuf0(tag = 111)
    public NotifyRinging notifyRinging;

    @Json(name = "Ringing")
    @xuf0(tag = 112)
    public Ringing ringing;

    @Json(name = "SeqNo")
    @xuf0(tag = 3)
    public long sequenceNumber;

    @Json(name = "ReceiverDeviceId")
    @xuf0(tag = 6)
    public String targetDeviceId;

    @Json(name = "TransportMessage")
    @xuf0(tag = 100)
    public TransportMessage transportMessage;

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallingMessage{chatId='");
        sb.append(this.chatId);
        sb.append("', callGuid='");
        sb.append(this.callGuid);
        sb.append("', sequenceNumber=");
        sb.append(this.sequenceNumber);
        sb.append(", deviceId='");
        sb.append(this.deviceId);
        sb.append('\'');
        if (this.transportMessage != null) {
            sb.append(", transportMessage=");
            sb.append(this.transportMessage);
        }
        if (this.makeCall != null) {
            sb.append(", makeCall=");
            sb.append(this.makeCall);
        }
        if (this.acceptCall != null) {
            sb.append(", acceptCall=");
            sb.append(this.acceptCall);
        }
        if (this.declineCall != null) {
            sb.append(", declineCall=");
            sb.append(this.declineCall);
        }
        if (this.callAccepted != null) {
            sb.append(", callAccepted=");
            sb.append(this.callAccepted);
        }
        if (this.callDeclined != null) {
            sb.append(", callDeclined=");
            sb.append(this.callDeclined);
        }
        if (this.endCall != null) {
            sb.append(", endCall=");
            sb.append(this.endCall);
        }
        if (this.incomingCall != null) {
            sb.append(", incomingCall=");
            sb.append(this.incomingCall);
        }
        if (this.callEnded != null) {
            sb.append(", callEnded=");
            sb.append(this.callEnded);
        }
        if (this.notifyRinging != null) {
            sb.append(", notifyRinging=");
            sb.append(this.notifyRinging);
        }
        if (this.ringing != null) {
            sb.append(", ringing=");
            sb.append(this.ringing);
        }
        sb.append('}');
        return sb.toString();
    }
}
