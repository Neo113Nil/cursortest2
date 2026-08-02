package ru.ok.android.webrtc.participant.update;

import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class ParticipantAddOrUpdateParamsList {
    public final List a;
    public final Set b;
    public final List c;

    public ParticipantAddOrUpdateParamsList(List<ParticipantAddOrUpdateParams> list, Set<CallParticipant.ParticipantId> set, List<? extends CallParticipant.ParticipantState> list2) {
        this.a = list;
        this.b = set;
        this.c = list2;
    }

    public final Set<CallParticipant.ParticipantId> getIdsToRemove() {
        return this.b;
    }

    public final List<CallParticipant.ParticipantState> getParticipantStates() {
        return this.c;
    }

    public final List<ParticipantAddOrUpdateParams> getParticipants() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ParticipantAddOrUpdateParamsList() {
        this(r0, EmptySet.b, r0);
        EmptyList emptyList = EmptyList.b;
    }
}
