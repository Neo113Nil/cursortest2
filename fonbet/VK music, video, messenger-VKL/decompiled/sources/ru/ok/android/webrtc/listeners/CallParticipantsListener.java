package ru.ok.android.webrtc.listeners;

import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public interface CallParticipantsListener {

    public static final class AddedParams {
        public final SessionRoomId a;
        public final List b;

        public AddedParams(SessionRoomId sessionRoomId, List<CallParticipant> list) {
            this.a = sessionRoomId;
            this.b = list;
        }

        public final List<CallParticipant> getAddedParticipants() {
            return this.b;
        }

        public final SessionRoomId getRoomId() {
            return this.a;
        }
    }

    public static final class ChangedParams {
        public final SessionRoomId a;
        public final List b;

        public ChangedParams(SessionRoomId sessionRoomId, List<CallParticipant> list) {
            this.a = sessionRoomId;
            this.b = list;
        }

        public final List<CallParticipant> getChangedParticipants() {
            return this.b;
        }

        public final SessionRoomId getRoomId() {
            return this.a;
        }
    }

    public static final class DeAnonParams {
        public final SessionRoomId a;
        public final List b;

        public DeAnonParams(SessionRoomId sessionRoomId, List<CallParticipant> list) {
            this.a = sessionRoomId;
            this.b = list;
        }

        public final List<CallParticipant> getChangedParticipants() {
            return this.b;
        }

        public final SessionRoomId getRoomId() {
            return this.a;
        }
    }

    public static final class RemovedParams {
        public final SessionRoomId a;
        public final List b;

        public RemovedParams(SessionRoomId sessionRoomId, List<CallParticipant> list) {
            this.a = sessionRoomId;
            this.b = list;
        }

        public final List<CallParticipant> getRemovedParticipants() {
            return this.b;
        }

        public final SessionRoomId getRoomId() {
            return this.a;
        }
    }

    void onCallParticipantsAdded(AddedParams addedParams);

    void onCallParticipantsChanged(ChangedParams changedParams);

    void onCallParticipantsDeAnonimized(DeAnonParams deAnonParams);

    void onCallParticipantsRemoved(RemovedParams removedParams);
}
