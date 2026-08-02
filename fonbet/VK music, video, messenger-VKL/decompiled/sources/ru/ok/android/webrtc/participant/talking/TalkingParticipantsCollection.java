package ru.ok.android.webrtc.participant.talking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipantModifierKt;

/* loaded from: classes9.dex */
public final class TalkingParticipantsCollection {
    public Set a = EmptySet.b;

    public static final class Diff {
        public final List a;

        public Diff(List<CallParticipant> list) {
            this.a = list;
        }

        public final List<CallParticipant> getChangedParticipants() {
            return this.a;
        }
    }

    public final void clear() {
        this.a = EmptySet.b;
    }

    public final Diff setTalkingParticipants(List<CallParticipant.ParticipantId> list, Map<CallParticipant.ParticipantId, CallParticipant> map) {
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            CallParticipant callParticipant = map.get((CallParticipant.ParticipantId) it.next());
            if (callParticipant != null) {
                boolean isTalkingWithAudioCheck = callParticipant.isTalkingWithAudioCheck();
                CallParticipantModifierKt.invokeSetTalking(callParticipant, true);
                if (isTalkingWithAudioCheck != callParticipant.isTalkingWithAudioCheck()) {
                    arrayList.add(callParticipant);
                }
            }
        }
        for (CallParticipant.ParticipantId participantId : this.a) {
            CallParticipant callParticipant2 = map.get(participantId);
            if (callParticipant2 != null && !hashSet.contains(participantId)) {
                boolean isTalkingWithAudioCheck2 = callParticipant2.isTalkingWithAudioCheck();
                CallParticipantModifierKt.invokeSetTalking(callParticipant2, false);
                if (isTalkingWithAudioCheck2 != callParticipant2.isTalkingWithAudioCheck()) {
                    arrayList.add(callParticipant2);
                }
            }
        }
        this.a = hashSet;
        return new Diff(arrayList);
    }
}
