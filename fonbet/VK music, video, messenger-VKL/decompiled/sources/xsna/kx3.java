package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* compiled from: AssistanceRequestStateListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class kx3 implements ParticipantStatesManager.Listener {
    public final CopyOnWriteArraySet<ParticipantStatesManager.Listener> a = new CopyOnWriteArraySet<>();

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((ParticipantStatesManager.Listener) it.next()).onParticipantStateChanged(participantStatesManager, stateChangedEvent);
        }
    }
}
