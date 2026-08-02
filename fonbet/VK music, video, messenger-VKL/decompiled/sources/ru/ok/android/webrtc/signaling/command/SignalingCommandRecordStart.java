package ru.ok.android.webrtc.signaling.command;

import org.json.JSONObject;
import ru.ok.android.webrtc.CallState;
import ru.ok.android.webrtc.record.CallRecordDescription;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;

/* loaded from: classes9.dex */
public final class SignalingCommandRecordStart implements SignalingCommand, SignalingCommandAutoRecover {
    public final Long a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;
    public final Long e;
    public final String f;
    public final boolean g;
    public final SessionRoomId h;
    public final boolean i;

    public SignalingCommandRecordStart(Long l, CharSequence charSequence, CharSequence charSequence2, String str, Long l2, String str2, boolean z, SessionRoomId sessionRoomId, boolean z2) {
        this.a = l;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = str;
        this.e = l2;
        this.f = str2;
        this.g = z;
        this.h = sessionRoomId;
        this.i = z2;
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommand
    public JSONObject extractParams() {
        JSONObject put = new JSONObject().put("command", SignalingProtocol.COMMAND_RECORD_START).put(SignalingProtocol.KEY_MOVIE_ID, this.a).put("name", this.b).put("description", this.c).put("privacy", this.d).put("groupId", this.e).put("albumId", this.f).put("streamMovie", this.g);
        SessionRoomId sessionRoomId = this.h;
        if (sessionRoomId instanceof SessionRoomId.Room) {
            put.put(SignalingProtocol.KEY_ROOM_ID, ((SessionRoomId.Room) sessionRoomId).getId());
        }
        return put;
    }

    public final String getAlbumId() {
        return this.f;
    }

    public final CharSequence getDescription() {
        return this.c;
    }

    public final Long getGroupId() {
        return this.e;
    }

    public final Long getMovieId() {
        return this.a;
    }

    public final CharSequence getName() {
        return this.b;
    }

    public final String getPrivacy() {
        return this.d;
    }

    public final SessionRoomId getSessionRoomId() {
        return this.h;
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommand
    public boolean isSmart() {
        return this.i;
    }

    public final boolean isStream() {
        return this.g;
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommandAutoRecover
    public JSONObject recoverResponse(long j, CallState callState) {
        CallRecordDescription activeRecording = callState.getActiveRecording(this.h);
        return (activeRecording == null || !epx.f(activeRecording.getInitiator(), callState.getCurrentUserCallParticipant().getParticipantId())) ? new JSONObject().put(SignalingProtocol.KEY_SEQUENCE, j).put("type", "error").put("error", SignalingProtocol.ERROR_COMMAND_NOT_DELIVERED) : new JSONObject().put("type", "response").put(SignalingProtocol.KEY_SEQUENCE, j).put("response", SignalingProtocol.COMMAND_RECORD_START).put(SignalingProtocol.KEY_RECORD_MOVIE_ID, activeRecording.getRecordMovieId());
    }
}
