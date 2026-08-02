package ru.ok.android.webrtc.signaling.command;

import org.json.JSONObject;
import ru.ok.android.webrtc.CallState;
import ru.ok.android.webrtc.record.CallRecordDescription;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;

/* loaded from: classes9.dex */
public final class SignalingCommandRecordStop implements SignalingCommand, SignalingCommandAutoRecover {
    public final SessionRoomId a;
    public final boolean b;
    public final boolean c;

    public SignalingCommandRecordStop(SessionRoomId sessionRoomId, boolean z, boolean z2) {
        this.a = sessionRoomId;
        this.b = z;
        this.c = z2;
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommand
    public JSONObject extractParams() {
        JSONObject put = new JSONObject().put("command", SignalingProtocol.COMMAND_RECORD_STOP);
        SessionRoomId sessionRoomId = this.a;
        if (sessionRoomId instanceof SessionRoomId.Room) {
            put.put(SignalingProtocol.KEY_ROOM_ID, ((SessionRoomId.Room) sessionRoomId).getId());
        }
        boolean z = this.b;
        if (z) {
            put.put(SignalingProtocol.KEY_REMOVE, z);
        }
        return put;
    }

    public final boolean getRemoveRecord() {
        return this.b;
    }

    public final SessionRoomId getSessionRoomId() {
        return this.a;
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommand
    public boolean isSmart() {
        return this.c;
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommandAutoRecover
    public JSONObject recoverResponse(long j, CallState callState) {
        CallRecordDescription activeRecording = callState.getActiveRecording(this.a);
        return (activeRecording == null || !epx.f(activeRecording.getInitiator(), callState.getCurrentUserCallParticipant().getParticipantId())) ? new JSONObject().put("type", "response").put(SignalingProtocol.KEY_SEQUENCE, j).put("response", SignalingProtocol.COMMAND_RECORD_STOP) : new JSONObject().put(SignalingProtocol.KEY_SEQUENCE, j).put("type", "error").put("error", SignalingProtocol.ERROR_COMMAND_NOT_DELIVERED);
    }
}
