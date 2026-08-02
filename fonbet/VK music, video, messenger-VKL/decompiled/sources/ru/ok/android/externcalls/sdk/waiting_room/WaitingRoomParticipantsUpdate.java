package ru.ok.android.externcalls.sdk.waiting_room;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes9.dex */
public class WaitingRoomParticipantsUpdate {
    static final WaitingRoomParticipantsUpdate EMPTY = new WaitingRoomParticipantsUpdate(Collections.EMPTY_LIST, false, false);
    public final boolean hasAdded;
    public final boolean hasRemoved;

    @NonNull
    public final List<ParticipantId> participantsIds;

    public WaitingRoomParticipantsUpdate(@NonNull List<ParticipantId> list, boolean z, boolean z2) {
        this.hasAdded = z;
        this.hasRemoved = z2;
        this.participantsIds = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaitingRoomParticipantsUpdate)) {
            return false;
        }
        WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = (WaitingRoomParticipantsUpdate) obj;
        if (this.hasAdded == waitingRoomParticipantsUpdate.hasAdded && this.hasRemoved == waitingRoomParticipantsUpdate.hasRemoved) {
            return this.participantsIds.equals(waitingRoomParticipantsUpdate.participantsIds);
        }
        return false;
    }

    public int hashCode() {
        return (((this.participantsIds.hashCode() * 31) + (this.hasAdded ? 1 : 0)) * 31) + (this.hasRemoved ? 1 : 0);
    }
}
