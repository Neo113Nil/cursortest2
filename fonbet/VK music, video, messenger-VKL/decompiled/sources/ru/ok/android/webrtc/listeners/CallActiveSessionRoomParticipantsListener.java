package ru.ok.android.webrtc.listeners;

import java.util.Collection;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoom;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public interface CallActiveSessionRoomParticipantsListener {

    public static final class AddedParams {
        public final Collection a;
        public final Collection b;
        public final CallParticipant c;

        public AddedParams(Collection<CallParticipant> collection, Collection<CallParticipant> collection2, CallParticipant callParticipant) {
            this.a = collection;
            this.b = collection2;
            this.c = callParticipant;
        }

        public final Collection<CallParticipant> getAddedParticipants() {
            return this.a;
        }

        public final Collection<CallParticipant> getAllParticipants() {
            return this.b;
        }

        public final CallParticipant getMe() {
            return this.c;
        }
    }

    public static final class ChangedParams {
        public final Collection a;
        public final Collection b;
        public final CallParticipant c;

        public ChangedParams(Collection<CallParticipant> collection, Collection<CallParticipant> collection2, CallParticipant callParticipant) {
            this.a = collection;
            this.b = collection2;
            this.c = callParticipant;
        }

        public final Collection<CallParticipant> getAllParticipants() {
            return this.b;
        }

        public final Collection<CallParticipant> getChangedParticipants() {
            return this.a;
        }

        public final CallParticipant getMe() {
            return this.c;
        }
    }

    public static final class DeAnonParams {
        public final Collection a;
        public final Collection b;
        public final CallParticipant c;

        public DeAnonParams(Collection<CallParticipant> collection, Collection<CallParticipant> collection2, CallParticipant callParticipant) {
            this.a = collection;
            this.b = collection2;
            this.c = callParticipant;
        }

        public final Collection<CallParticipant> getAllParticipants() {
            return this.b;
        }

        public final Collection<CallParticipant> getDeAnonParticipants() {
            return this.a;
        }

        public final CallParticipant getMe() {
            return this.c;
        }
    }

    public static final class RemovedParams {
        public final Collection a;
        public final Collection b;
        public final CallParticipant c;

        public RemovedParams(Collection<CallParticipant> collection, Collection<CallParticipant> collection2, CallParticipant callParticipant) {
            this.a = collection;
            this.b = collection2;
            this.c = callParticipant;
        }

        public final Collection<CallParticipant> getAllParticipants() {
            return this.b;
        }

        public final CallParticipant getMe() {
            return this.c;
        }

        public final Collection<CallParticipant> getRemovedParticipants() {
            return this.a;
        }
    }

    public static final class UpdatedParams {
        public final Collection a;
        public final SessionRoomId b;
        public final Collection c;
        public final SessionRoomId d;
        public final SessionRoom e;
        public final CallParticipant f;

        public UpdatedParams(Collection<CallParticipant> collection, SessionRoomId sessionRoomId, Collection<CallParticipant> collection2, SessionRoomId sessionRoomId2, SessionRoom sessionRoom, CallParticipant callParticipant) {
            this.a = collection;
            this.b = sessionRoomId;
            this.c = collection2;
            this.d = sessionRoomId2;
            this.e = sessionRoom;
            this.f = callParticipant;
        }

        public final CallParticipant getMe() {
            return this.f;
        }

        public final Collection<CallParticipant> getNewParticipants() {
            return this.c;
        }

        public final SessionRoom getNewRoom() {
            return this.e;
        }

        public final SessionRoomId getNewRoomId() {
            return this.d;
        }

        public final Collection<CallParticipant> getOldParticipants() {
            return this.a;
        }

        public final SessionRoomId getOldRoomId() {
            return this.b;
        }
    }

    void onActiveParticipantUpdated(UpdatedParams updatedParams);

    void onActiveParticipantsAdded(AddedParams addedParams);

    void onActiveParticipantsChanged(ChangedParams changedParams);

    void onActiveParticipantsDeAnonimized(DeAnonParams deAnonParams);

    void onActiveParticipantsRemoved(RemovedParams removedParams);
}
