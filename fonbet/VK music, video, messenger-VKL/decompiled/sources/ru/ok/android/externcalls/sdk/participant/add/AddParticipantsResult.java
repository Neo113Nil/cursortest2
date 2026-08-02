package ru.ok.android.externcalls.sdk.participant.add;

import java.util.Collection;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.epx;
import xsna.s3j0;

/* compiled from: AddParticipantsResult.kt */
/* loaded from: classes9.dex */
public final class AddParticipantsResult {
    private final Collection<ParticipantId> accepted;
    private final Collection<ParticipantId> addedIds;
    private final Collection<ParticipantId> bannedParticipantIds;
    private final Collection<ParticipantId> rejectedParticipantsIds;

    public AddParticipantsResult(Collection<ParticipantId> collection, Collection<ParticipantId> collection2, Collection<ParticipantId> collection3, Collection<ParticipantId> collection4) {
        this.addedIds = collection;
        this.accepted = collection2;
        this.rejectedParticipantsIds = collection3;
        this.bannedParticipantIds = collection4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddParticipantsResult copy$default(AddParticipantsResult addParticipantsResult, Collection collection, Collection collection2, Collection collection3, Collection collection4, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = addParticipantsResult.addedIds;
        }
        if ((i & 2) != 0) {
            collection2 = addParticipantsResult.accepted;
        }
        if ((i & 4) != 0) {
            collection3 = addParticipantsResult.rejectedParticipantsIds;
        }
        if ((i & 8) != 0) {
            collection4 = addParticipantsResult.bannedParticipantIds;
        }
        return addParticipantsResult.copy(collection, collection2, collection3, collection4);
    }

    public final Collection<ParticipantId> component1() {
        return this.addedIds;
    }

    public final Collection<ParticipantId> component2() {
        return this.accepted;
    }

    public final Collection<ParticipantId> component3() {
        return this.rejectedParticipantsIds;
    }

    public final Collection<ParticipantId> component4() {
        return this.bannedParticipantIds;
    }

    public final AddParticipantsResult copy(Collection<ParticipantId> collection, Collection<ParticipantId> collection2, Collection<ParticipantId> collection3, Collection<ParticipantId> collection4) {
        return new AddParticipantsResult(collection, collection2, collection3, collection4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddParticipantsResult)) {
            return false;
        }
        AddParticipantsResult addParticipantsResult = (AddParticipantsResult) obj;
        return epx.f(this.addedIds, addParticipantsResult.addedIds) && epx.f(this.accepted, addParticipantsResult.accepted) && epx.f(this.rejectedParticipantsIds, addParticipantsResult.rejectedParticipantsIds) && epx.f(this.bannedParticipantIds, addParticipantsResult.bannedParticipantIds);
    }

    public final Collection<ParticipantId> getAccepted() {
        return this.accepted;
    }

    public final Collection<ParticipantId> getAddedIds() {
        return this.addedIds;
    }

    public final Collection<ParticipantId> getBannedParticipantIds() {
        return this.bannedParticipantIds;
    }

    public final Collection<ParticipantId> getRejectedParticipantsIds() {
        return this.rejectedParticipantsIds;
    }

    public int hashCode() {
        return this.bannedParticipantIds.hashCode() + s3j0.a(s3j0.a(this.addedIds.hashCode() * 31, this.accepted, 31), this.rejectedParticipantsIds, 31);
    }

    public String toString() {
        return "AddParticipantsResult(addedIds=" + this.addedIds + ", accepted=" + this.accepted + ", rejectedParticipantsIds=" + this.rejectedParticipantsIds + ", bannedParticipantIds=" + this.bannedParticipantIds + ")";
    }
}
