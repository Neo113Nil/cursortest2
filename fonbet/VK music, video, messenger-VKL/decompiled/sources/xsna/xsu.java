package xsna;

import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* compiled from: HandStateListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class xsu implements ParticipantStatesManager.Listener {
    public final ParticipantStatesManager.Listener a;

    public xsu(ysu ysuVar) {
        this.a = ysuVar;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        this.a.onParticipantStateChanged(participantStatesManager, stateChangedEvent);
    }
}
