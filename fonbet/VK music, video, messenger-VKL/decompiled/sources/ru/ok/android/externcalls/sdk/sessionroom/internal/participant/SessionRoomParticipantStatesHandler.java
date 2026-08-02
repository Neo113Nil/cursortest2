package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;
import xsna.gzs;
import xsna.pn00;

/* compiled from: SessionRoomParticipantStatesHandler.kt */
/* loaded from: classes9.dex */
public final class SessionRoomParticipantStatesHandler implements CallSessionRoomsListener, CallActiveSessionRoomParticipantsListener {
    private final gzs<Boolean> isMeCreatorOrAdmin;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private SessionRoomId roomId = SessionRoomId.MainCall.INSTANCE;

    public SessionRoomParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl, gzs<Boolean> gzsVar) {
        this.participantStatesManager = participantStatesManagerImpl;
        this.isMeCreatorOrAdmin = gzsVar;
    }

    private final void dismissAssistanceRequestIfAdminAppearedInRoom(Collection<CallParticipant> collection) {
        if (this.roomId instanceof SessionRoomId.MainCall) {
            return;
        }
        Iterator<CallParticipant> it = collection.iterator();
        while (it.hasNext()) {
            List<CallParticipant.Role> roles = it.next().getRoles();
            if (roles.contains(CallParticipant.Role.ADMIN) || roles.contains(CallParticipant.Role.CREATOR)) {
                dismissAssistanceRequestIfNecessary();
                return;
            }
        }
    }

    private final void dismissAssistanceRequestIfNecessary() {
        if (this.participantStatesManager.isAssistanceRequested()) {
            this.participantStatesManager.setAssistanceRequested(false);
        }
    }

    private final void lowerMyHandAndDismissAssistanceRequestIfNecessary() {
        ParticipantStatesManagerImpl participantStatesManagerImpl = this.participantStatesManager;
        ParticipantStatesManagerImpl.State state = ParticipantStatesManagerImpl.State.HAND_RAISED;
        ParticipantStatesManagerImpl.Companion companion = ParticipantStatesManagerImpl.Companion;
        ParticipantStatesManagerImpl.updateMyStates$default(participantStatesManagerImpl, pn00.k(new Pair(state, companion.getSTATE_OFF()), new Pair(ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, companion.getSTATE_OFF())), null, null, 6, null);
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantUpdated(CallActiveSessionRoomParticipantsListener.UpdatedParams updatedParams) {
        dismissAssistanceRequestIfAdminAppearedInRoom(updatedParams.getNewParticipants());
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsAdded(CallActiveSessionRoomParticipantsListener.AddedParams addedParams) {
        dismissAssistanceRequestIfAdminAppearedInRoom(addedParams.getAddedParticipants());
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsChanged(CallActiveSessionRoomParticipantsListener.ChangedParams changedParams) {
        dismissAssistanceRequestIfAdminAppearedInRoom(changedParams.getChangedParticipants());
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsDeAnonimized(CallActiveSessionRoomParticipantsListener.DeAnonParams deAnonParams) {
        dismissAssistanceRequestIfAdminAppearedInRoom(deAnonParams.getDeAnonParticipants());
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantActiveRoomChanged(CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        if (epx.f(this.roomId, activeRoomChangedParams.getRoomId())) {
            return;
        }
        lowerMyHandAndDismissAssistanceRequestIfNecessary();
        SessionRoomId roomId = activeRoomChangedParams.getRoomId();
        if (this.isMeCreatorOrAdmin.invoke().booleanValue() && (roomId instanceof SessionRoomId.Room)) {
            ParticipantStatesManagerImpl.resetStates$default(this.participantStatesManager, ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, (SessionRoomId.Room) roomId, null, null, 12, null);
        }
        this.roomId = roomId;
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsRemoved(CallActiveSessionRoomParticipantsListener.RemovedParams removedParams) {
    }
}
