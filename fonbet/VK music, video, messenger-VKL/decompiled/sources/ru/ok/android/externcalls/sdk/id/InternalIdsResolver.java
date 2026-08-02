package ru.ok.android.externcalls.sdk.id;

import androidx.annotation.NonNull;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.schedulers.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.uhc;

/* loaded from: classes9.dex */
public class InternalIdsResolver {
    private final IdMappingWrapper idMappingWrapper;
    private final LocalIdMappings localIdMappings;
    private final IdsMapper<ParticipantId, CallParticipant.ParticipantId> mapper;
    private final ParticipantPrivateStateModifier stateModifier;
    private final ParticipantStore store;

    public interface ParticipantPrivateStateModifier {
        void setInternalId(@NonNull ConversationParticipant conversationParticipant, CallParticipant.ParticipantId participantId);
    }

    public InternalIdsResolver(@NonNull ParticipantStore participantStore, @NonNull IdMappingWrapper idMappingWrapper, @NonNull ParticipantPrivateStateModifier participantPrivateStateModifier, @NonNull LocalIdMappings localIdMappings, @NonNull IdsMapper<ParticipantId, CallParticipant.ParticipantId> idsMapper) {
        this.idMappingWrapper = idMappingWrapper;
        this.store = participantStore;
        this.stateModifier = participantPrivateStateModifier;
        this.localIdMappings = localIdMappings;
        this.mapper = idsMapper;
    }

    private void applyInternalIds(Map<ParticipantId, CallParticipant.ParticipantId> map) {
        for (Map.Entry<ParticipantId, CallParticipant.ParticipantId> entry : map.entrySet()) {
            CallParticipant.ParticipantId value = entry.getValue();
            ParticipantId key = entry.getKey();
            ConversationParticipant byExternal = this.store.getByExternal(key);
            this.idMappingWrapper.addMapping(key, value);
            if (byExternal != null) {
                this.stateModifier.setInternalId(byExternal, value);
                this.localIdMappings.addMappings(byExternal);
            }
        }
    }

    private List<ParticipantId> getResolutionCandidates() {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (ConversationParticipantExtensionsKt.getInternalIdExt(next) == null) {
                arrayList.add(next.getExternalId());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Set lambda$resolveIdsAndGetFailed$0(MappingContext mappingContext) throws Exception {
        List<ParticipantId> resolutionCandidates = getResolutionCandidates();
        if (resolutionCandidates.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        applyInternalIds(this.mapper.map(resolutionCandidates, mappingContext));
        HashSet hashSet = new HashSet(getResolutionCandidates());
        HashSet hashSet2 = new HashSet(resolutionCandidates);
        hashSet2.retainAll(hashSet);
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            this.store.removeByExternal((ParticipantId) it.next());
        }
        return hashSet2;
    }

    @NonNull
    public x<Set<ParticipantId>> resolveIdsAndGetFailed(MappingContext mappingContext) {
        return new v(new uhc(2, this, mappingContext)).q(a.b());
    }
}
