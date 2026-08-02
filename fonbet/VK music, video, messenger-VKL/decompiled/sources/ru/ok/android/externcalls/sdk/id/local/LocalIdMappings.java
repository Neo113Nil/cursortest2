package ru.ok.android.externcalls.sdk.id.local;

import android.util.LongSparseArray;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.j5g;

/* compiled from: LocalIdMappings.kt */
/* loaded from: classes9.dex */
public final class LocalIdMappings {
    private final HashMap<CallParticipant.ParticipantId, LocalParticipantId> internalToLocalIdMap = new HashMap<>();
    private final HashMap<ParticipantId, LocalParticipantId> externalToLocalIdMap = new HashMap<>();
    private final LongSparseArray<Set<LocalParticipantId>> internalIdToLocalIdsMap = new LongSparseArray<>();
    private final HashMap<String, Set<LocalParticipantId>> externalIdToLocalIdsMap = new HashMap<>();

    public final void addMappings(ConversationParticipant conversationParticipant) {
        CallParticipant.ParticipantId participantId;
        LocalParticipantId localParticipantIdExt = ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant);
        CallParticipant callParticipant = conversationParticipant.getCallParticipant();
        if (callParticipant != null && (participantId = callParticipant.getParticipantId()) != null) {
            this.internalToLocalIdMap.put(participantId, localParticipantIdExt);
            long j = participantId.id;
            Set<LocalParticipantId> set = this.internalIdToLocalIdsMap.get(j);
            if (set == null) {
                set = new LinkedHashSet<>();
                this.internalIdToLocalIdsMap.put(j, set);
            }
            set.add(localParticipantIdExt);
        }
        ParticipantId externalId = conversationParticipant.getExternalId();
        if (externalId != null) {
            this.externalToLocalIdMap.put(externalId, localParticipantIdExt);
            HashMap<String, Set<LocalParticipantId>> hashMap = this.externalIdToLocalIdsMap;
            String str = externalId.id;
            Set<LocalParticipantId> set2 = hashMap.get(str);
            if (set2 == null) {
                set2 = new LinkedHashSet<>();
                hashMap.put(str, set2);
            }
            set2.add(localParticipantIdExt);
        }
    }

    public final void clearMapping() {
        this.internalToLocalIdMap.clear();
        this.externalIdToLocalIdsMap.clear();
    }

    public final void deAnonymizeMapping(ParticipantId participantId, ConversationParticipant conversationParticipant) {
        this.externalToLocalIdMap.remove(participantId);
        this.externalIdToLocalIdsMap.remove(participantId.id);
        addMappings(conversationParticipant);
    }

    public final Set<LocalParticipantId> getAllLocalIds(CallParticipant.ParticipantId participantId) {
        Set<LocalParticipantId> set = this.internalIdToLocalIdsMap.get(participantId.id);
        return set == null ? EmptySet.b : set;
    }

    public final LocalParticipantId getAnyLocalId(CallParticipant.ParticipantId participantId) {
        Set<LocalParticipantId> set = this.internalIdToLocalIdsMap.get(participantId.id);
        if (set != null) {
            return (LocalParticipantId) j5g.Z(set);
        }
        return null;
    }

    public final LocalParticipantId getLocalId(CallParticipant.ParticipantId participantId) {
        return this.internalToLocalIdMap.get(participantId);
    }

    public final void removedMappings(ConversationParticipant conversationParticipant) {
        CallParticipant.ParticipantId participantId;
        LocalParticipantId localParticipantIdExt = ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant);
        CallParticipant callParticipant = conversationParticipant.getCallParticipant();
        if (callParticipant != null && (participantId = callParticipant.getParticipantId()) != null) {
            this.internalToLocalIdMap.remove(participantId);
            long j = participantId.id;
            Set<LocalParticipantId> set = this.internalIdToLocalIdsMap.get(j);
            if (set != null) {
                set.remove(localParticipantIdExt);
                if (set.isEmpty()) {
                    this.internalIdToLocalIdsMap.remove(j);
                }
            }
        }
        ParticipantId externalId = conversationParticipant.getExternalId();
        if (externalId != null) {
            this.externalToLocalIdMap.remove(externalId);
            String str = externalId.id;
            Set<LocalParticipantId> set2 = this.externalIdToLocalIdsMap.get(str);
            if (set2 != null) {
                set2.remove(localParticipantIdExt);
                if (set2.isEmpty()) {
                    this.externalIdToLocalIdsMap.remove(str);
                }
            }
        }
    }

    public final LocalParticipantId getAnyLocalId(ParticipantId participantId) {
        Set<LocalParticipantId> set = this.externalIdToLocalIdsMap.get(participantId.id);
        if (set != null) {
            return (LocalParticipantId) j5g.Z(set);
        }
        return null;
    }

    public final LocalParticipantId getLocalId(ParticipantId participantId) {
        return this.externalToLocalIdMap.get(participantId);
    }

    public final Set<LocalParticipantId> getAllLocalIds(ParticipantId participantId) {
        Set<LocalParticipantId> set = this.externalIdToLocalIdsMap.get(participantId.id);
        return set == null ? EmptySet.b : set;
    }
}
