package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.record.CallRecordDescription;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public interface CallRecordListener {

    public static final class RecordErrorInfo {
        public final String a;

        public RecordErrorInfo(String str) {
            this.a = str;
        }

        public final String getError() {
            return this.a;
        }
    }

    public static final class RecordStartInfo {
        public final SessionRoomId a;
        public final CallRecordDescription b;

        public RecordStartInfo(SessionRoomId sessionRoomId, CallRecordDescription callRecordDescription) {
            this.a = sessionRoomId;
            this.b = callRecordDescription;
        }

        public final CallRecordDescription getRecordDescription() {
            return this.b;
        }

        public final SessionRoomId getSessionRoomId() {
            return this.a;
        }
    }

    public static final class RecordStopInfo {
        public final SessionRoomId a;
        public final CallParticipant.ParticipantId b;

        public RecordStopInfo(SessionRoomId sessionRoomId, CallParticipant.ParticipantId participantId) {
            this.a = sessionRoomId;
            this.b = participantId;
        }

        public final SessionRoomId getSessionRoomId() {
            return this.a;
        }

        public final CallParticipant.ParticipantId getStoppedBy() {
            return this.b;
        }
    }

    void onRecordError(RecordErrorInfo recordErrorInfo);

    void onRecordStarted(RecordStartInfo recordStartInfo);

    void onRecordStopped(RecordStopInfo recordStopInfo);
}
