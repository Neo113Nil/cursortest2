package ru.ok.android.externcalls.sdk.participant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener;
import ru.ok.android.webrtc.listeners.CallParticipantsListener;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.e43;
import xsna.epx;
import xsna.ttp0;

/* compiled from: ParticipantsUpdater.kt */
/* loaded from: classes9.dex */
public final class ParticipantsUpdater implements CallActiveSessionRoomParticipantsListener, CallParticipantsListener, CallSessionRoomsListener {
    private final IdMappingWrapper idMappingWrapper;
    private final ConversationEventsListener listener;
    private final LocalIdMappings localIdMappings;
    private final MappingUpdater mappingUpdater;
    private final MeChanger meChanger;
    private final ParticipantStatesManagerImpl statesManager;
    private final ParticipantStore store;

    /* compiled from: ParticipantsUpdater.kt */
    public interface MappingUpdater {
        void reportIfApplicable();

        void triggerMapUpdate();
    }

    /* compiled from: ParticipantsUpdater.kt */
    public interface MeChanger {
        void updateMyExternalId(ParticipantId participantId);
    }

    public ParticipantsUpdater(ConversationEventsListener conversationEventsListener, ParticipantStore participantStore, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingWrapper idMappingWrapper, LocalIdMappings localIdMappings, MappingUpdater mappingUpdater, MeChanger meChanger) {
        this.listener = conversationEventsListener;
        this.store = participantStore;
        this.statesManager = participantStatesManagerImpl;
        this.idMappingWrapper = idMappingWrapper;
        this.localIdMappings = localIdMappings;
        this.mappingUpdater = mappingUpdater;
        this.meChanger = meChanger;
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantUpdated(CallActiveSessionRoomParticipantsListener.UpdatedParams updatedParams) {
        this.store.setActiveSessionRoom(updatedParams.getNewRoomId(), updatedParams.getNewRoom());
        this.listener.onParticipantsUpdated(ttp0.a(updatedParams.getNewParticipants()));
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsAdded(CallParticipantsListener.AddedParams addedParams) {
        List<CallParticipant> addedParticipants = addedParams.getAddedParticipants();
        ArrayList arrayList = new ArrayList(addedParticipants.size());
        for (CallParticipant callParticipant : addedParticipants) {
            ParticipantStore participantStore = this.store;
            CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
            if (participantId != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(participantId);
                ParticipantId convert = CallExternalIdConverter.convert(callParticipant.getExternalId());
                if (convert != null) {
                    this.idMappingWrapper.addMapping(convert, callParticipant.getParticipantId());
                    if (byInternal == null) {
                        byInternal = this.store.getParticipantById(convert);
                    }
                }
                arrayList.add(byInternal);
            }
        }
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (Object obj : addedParticipants) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            CallParticipant callParticipant2 = (CallParticipant) obj;
            ConversationParticipant conversationParticipant = (ConversationParticipant) arrayList.get(i);
            if (conversationParticipant == null) {
                CallParticipant.ParticipantId participantId2 = callParticipant2.getParticipantId();
                if (participantId2 != null) {
                    ConversationParticipant createConversationParticipantFromInternal = ConversationParticipantExtensionsKt.createConversationParticipantFromInternal(participantId2, this.idMappingWrapper);
                    ConversationParticipantExtensionsKt.setCallParticipantExt(createConversationParticipantFromInternal, callParticipant2, this.localIdMappings);
                    this.store.add(createConversationParticipantFromInternal, addedParams.getRoomId());
                    z = true;
                }
            } else {
                if (conversationParticipant.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(conversationParticipant, callParticipant2, this.localIdMappings);
                }
                z2 = true;
            }
            i = i2;
        }
        if (z) {
            this.mappingUpdater.triggerMapUpdate();
        }
        if (z2) {
            this.mappingUpdater.reportIfApplicable();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsChanged(CallParticipantsListener.ChangedParams changedParams) {
        ConversationParticipant participantById;
        ArrayList arrayList = new ArrayList();
        for (CallParticipant callParticipant : changedParams.getChangedParticipants()) {
            ParticipantStore participantStore = this.store;
            CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
            if (participantId != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(participantId);
                if (byInternal != null) {
                    if (byInternal.getCallParticipant() == null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, callParticipant, this.localIdMappings);
                    }
                    if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                        arrayList.add(byInternal);
                    }
                } else {
                    ParticipantId convert = CallExternalIdConverter.convert(callParticipant.getExternalId());
                    if (convert != null && (participantById = this.store.getParticipantById(convert)) != null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(participantById, callParticipant, this.localIdMappings);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.listener.onParticipantsChanged(arrayList);
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsDeAnonimized(CallParticipantsListener.DeAnonParams deAnonParams) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CallParticipant callParticipant : deAnonParams.getChangedParticipants()) {
            ParticipantStore participantStore = this.store;
            CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
            if (participantId != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(participantId);
                CallExternalId externalId = callParticipant.getExternalId();
                if (byInternal != null && externalId != null && !epx.f(externalId.getId(), byInternal.getExternalId().id)) {
                    ParticipantId externalId2 = byInternal.getExternalId();
                    ParticipantId convert = CallExternalIdConverter.convert(externalId);
                    if (convert != null) {
                        ConversationParticipantExtensionsKt.deAnonymizeExt(byInternal, callParticipant, externalId2, convert, this.localIdMappings);
                        CallParticipant.ParticipantId participantId2 = callParticipant.getParticipantId();
                        ConversationParticipant me2 = this.store.getMe();
                        if (epx.f(participantId2, me2 != null ? me2.getInternalId() : null)) {
                            this.meChanger.updateMyExternalId(convert);
                        }
                        if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                            arrayList.add(byInternal);
                            linkedHashMap.put(convert, externalId2);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.listener.onParticipantsDeAnonymized(arrayList, linkedHashMap);
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsRemoved(CallParticipantsListener.RemovedParams removedParams) {
        ConversationParticipant byInternal;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (CallParticipant callParticipant : removedParams.getRemovedParticipants()) {
            CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
            if (participantId != null && (byInternal = this.store.getByInternal(participantId)) != null) {
                if (byInternal.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, callParticipant, this.localIdMappings);
                }
                hashSet.add(participantId);
                if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                    arrayList.add(byInternal);
                }
            }
        }
        this.store.removeByInternal(hashSet);
        if (arrayList.isEmpty()) {
            return;
        }
        this.statesManager.onParticipantsRemoved(arrayList);
        this.listener.onParticipantsRemoved(arrayList);
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantActiveRoomChanged(CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        this.store.setActiveSessionRoom(activeRoomChangedParams.getRoomId(), activeRoomChangedParams.getRoom());
        this.mappingUpdater.reportIfApplicable();
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantInvitedToRoom(CallSessionRoomsListener.InvitedParams invitedParams) {
        this.store.setProposedSessionRoom(invitedParams.getRoomId(), invitedParams.getRoom());
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onRoomRemoved(CallSessionRoomsListener.RemovedParams removedParams) {
        if (epx.f(this.store.getProposedRoomId(), removedParams.getRoomId())) {
            this.store.setProposedSessionRoom(SessionRoomId.MainCall.INSTANCE, null);
        }
        if (epx.f(this.store.getActiveRoomId(), removedParams.getRoomId())) {
            this.store.setActiveSessionRoom(SessionRoomId.MainCall.INSTANCE, null);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onRoomUpdated(CallSessionRoomsListener.UpdatedParams updatedParams) {
        this.store.maybeUpdateRoom(updatedParams.getRoom());
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsAdded(CallActiveSessionRoomParticipantsListener.AddedParams addedParams) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsChanged(CallActiveSessionRoomParticipantsListener.ChangedParams changedParams) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsDeAnonimized(CallActiveSessionRoomParticipantsListener.DeAnonParams deAnonParams) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsRemoved(CallActiveSessionRoomParticipantsListener.RemovedParams removedParams) {
    }
}
