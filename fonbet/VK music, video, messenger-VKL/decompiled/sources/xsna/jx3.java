package xsna;

import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* compiled from: AssistanceRequestStateListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class jx3 implements ParticipantStatesManager.Listener {
    public final ParticipantStatesManager.Listener a;

    public jx3(kx3 kx3Var) {
        this.a = kx3Var;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        this.a.onParticipantStateChanged(participantStatesManager, stateChangedEvent);
    }
}
