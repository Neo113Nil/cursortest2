package ru.ok.android.externcalls.sdk.participant.state.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import xsna.bl90;
import xsna.j5g;
import xsna.zcl;

/* compiled from: ParticipantStatesListenerProxy.kt */
/* loaded from: classes9.dex */
public final class ParticipantStatesListenerProxy implements ParticipantStatesManager.Listener {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MSG_RAISE_CODE = 1;

    @Deprecated
    public static final long RAISE_DEBOUNCE = 500;
    private volatile long lastRaiseTime;
    private final Handler.Callback looperCallback;
    private final Handler mainThreadHandler;
    private final ParticipantStatesManager manager;
    private final CopyOnWriteArrayList<ParticipantStatesManager.Listener> listeners = new CopyOnWriteArrayList<>();
    private final HashMap<ParticipantId, ParticipantStatesManager.ParticipantStateChange> accumulator = new HashMap<>();

    /* compiled from: ParticipantStatesListenerProxy.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ParticipantStatesListenerProxy(ParticipantStatesManager participantStatesManager) {
        this.manager = participantStatesManager;
        bl90 bl90Var = new bl90(this, 0);
        this.looperCallback = bl90Var;
        this.mainThreadHandler = new Handler(Looper.getMainLooper(), bl90Var);
    }

    private final void accumulate(ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        for (ParticipantStatesManager.ParticipantStateChange participantStateChange : stateChangedEvent.getChanges()) {
            ParticipantStatesManager.ParticipantStateChange participantStateChange2 = this.accumulator.get(participantStateChange.getParticipantId());
            if (participantStateChange2 == null) {
                this.accumulator.put(participantStateChange.getParticipantId(), participantStateChange);
            } else if (participantStateChange2.isOn() == participantStateChange.isOn()) {
                this.accumulator.put(participantStateChange.getParticipantId(), participantStateChange);
            } else {
                this.accumulator.remove(participantStateChange.getParticipantId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean looperCallback$lambda$0(ParticipantStatesListenerProxy participantStatesListenerProxy, Message message) {
        if (message.what != 1) {
            return false;
        }
        participantStatesListenerProxy.raiseEvent();
        return true;
    }

    private final ParticipantStatesManager.StateChangedEvent merge() {
        ParticipantStatesManager.StateChangedEvent stateChangedEvent = new ParticipantStatesManager.StateChangedEvent(j5g.O0(this.accumulator.values()));
        this.accumulator.clear();
        return stateChangedEvent;
    }

    private final long now() {
        return SystemClock.elapsedRealtime();
    }

    private final Message obtainRaiseMessage() {
        Message obtainMessage = this.mainThreadHandler.obtainMessage();
        obtainMessage.what = 1;
        return obtainMessage;
    }

    private final void raise(ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ParticipantStatesManager.Listener) it.next()).onParticipantStateChanged(this.manager, stateChangedEvent);
        }
    }

    private final void raiseEvent() {
        ParticipantStatesManager.StateChangedEvent merge = merge();
        if (merge.getChanges().isEmpty()) {
            return;
        }
        raise(merge);
        this.lastRaiseTime = now();
    }

    public final void addListener(ParticipantStatesManager.Listener listener) {
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
    public void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        accumulate(stateChangedEvent);
        long now = now() - this.lastRaiseTime;
        this.mainThreadHandler.removeMessages(1);
        this.mainThreadHandler.sendMessageDelayed(obtainRaiseMessage(), 500 - now);
    }

    public final void release() {
        this.mainThreadHandler.removeMessages(1);
    }

    public final void removeListener(ParticipantStatesManager.Listener listener) {
        this.listeners.remove(listener);
    }
}
