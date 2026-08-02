package ru.ok.android.externcalls.sdk.id;

import androidx.annotation.NonNull;
import io.reactivex.rxjava3.core.a;
import io.reactivex.rxjava3.internal.operators.completable.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public class ExternalIdsResolver {
    private final ExtraResolver extraResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final IdsMapper<CallParticipant.ParticipantId, ParticipantId> idsMapper;
    private final LocalIdMappings localIdMappings;
    private final ParticipantPrivateStateModifier participantPrivateStateModifier;
    private final ParticipantStore store;

    public interface ExtraResolver {
        ParticipantId onExternalByInternalResolution(@NonNull ConversationParticipant conversationParticipant);
    }

    public interface ParticipantPrivateStateModifier {
        void setExternalId(@NonNull ConversationParticipant conversationParticipant, @NonNull ParticipantId participantId);
    }

    public ExternalIdsResolver(@NonNull ParticipantStore participantStore, @NonNull IdMappingWrapper idMappingWrapper, @NonNull ExtraResolver extraResolver, @NonNull ParticipantPrivateStateModifier participantPrivateStateModifier, @NonNull LocalIdMappings localIdMappings, @NonNull IdsMapper<CallParticipant.ParticipantId, ParticipantId> idsMapper) {
        this.store = participantStore;
        this.idMappingWrapper = idMappingWrapper;
        this.extraResolver = extraResolver;
        this.participantPrivateStateModifier = participantPrivateStateModifier;
        this.localIdMappings = localIdMappings;
        this.idsMapper = idsMapper;
    }

    private void applyExternals(Map<CallParticipant.ParticipantId, ParticipantId> map) {
        for (Map.Entry<CallParticipant.ParticipantId, ParticipantId> entry : map.entrySet()) {
            CallParticipant.ParticipantId key = entry.getKey();
            ParticipantId value = entry.getValue();
            ConversationParticipant byInternal = this.store.getByInternal(key);
            this.idMappingWrapper.addMapping(value, key);
            if (byInternal != null) {
                this.localIdMappings.addMappings(byInternal);
                this.participantPrivateStateModifier.setExternalId(byInternal, value);
            }
        }
    }

    private void collectExternalIdResolutionCandidatesForSessionRoom(List<CallParticipant.ParticipantId> list, Map<LocalParticipantId, ConversationParticipant> map) {
        for (ConversationParticipant conversationParticipant : map.values()) {
            if (conversationParticipant.getExternalId() == null) {
                ParticipantId onExternalByInternalResolution = this.extraResolver.onExternalByInternalResolution(conversationParticipant);
                if (onExternalByInternalResolution == null) {
                    list.add(ConversationParticipantExtensionsKt.getInternalIdExt(conversationParticipant));
                } else {
                    this.participantPrivateStateModifier.setExternalId(conversationParticipant, onExternalByInternalResolution);
                    this.idMappingWrapper.addMapping(onExternalByInternalResolution, ConversationParticipantExtensionsKt.getInternalIdExt(conversationParticipant));
                    this.localIdMappings.addMappings(conversationParticipant);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveIds$0(List list, MappingContext mappingContext) throws Throwable {
        applyExternals(this.idsMapper.map(list, mappingContext));
    }

    @NonNull
    public List<CallParticipant.ParticipantId> collectExternalIdResolutionCandidates() {
        ArrayList arrayList = new ArrayList();
        Map<SessionRoomId, Map<LocalParticipantId, ConversationParticipant>> roomToParticipantsMap = this.store.getRoomToParticipantsMap();
        Iterator<SessionRoomId> it = roomToParticipantsMap.keySet().iterator();
        while (it.hasNext()) {
            Map<LocalParticipantId, ConversationParticipant> map = roomToParticipantsMap.get(it.next());
            if (map != null) {
                collectExternalIdResolutionCandidatesForSessionRoom(arrayList, map);
            }
        }
        return arrayList;
    }

    @NonNull
    public a resolveIds(final List<CallParticipant.ParticipantId> list, final MappingContext mappingContext) {
        return list.isEmpty() ? i.b : a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.teq
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                ExternalIdsResolver.this.lambda$resolveIds$0(list, mappingContext);
            }
        }).q(io.reactivex.rxjava3.schedulers.a.b());
    }
}
