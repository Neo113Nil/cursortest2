package ru.ok.android.externcalls.sdk.participant.state;

import java.util.Collection;
import java.util.Set;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.efz;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.qoy;
import xsna.s3q0;

/* compiled from: ParticipantStatesManager.kt */
/* loaded from: classes9.dex */
public interface ParticipantStatesManager {

    /* compiled from: ParticipantStatesManager.kt */
    /* loaded from: classes11.dex */
    public interface Listener {
        void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, StateChangedEvent stateChangedEvent);
    }

    /* compiled from: ParticipantStatesManager.kt */
    public static final class ParticipantStateChange {
        private final boolean isOn;
        private final ParticipantId participantId;
        private final long updateTs;

        public ParticipantStateChange(ParticipantId participantId, boolean z, long j) {
            this.participantId = participantId;
            this.isOn = z;
            this.updateTs = j;
        }

        public static /* synthetic */ ParticipantStateChange copy$default(ParticipantStateChange participantStateChange, ParticipantId participantId, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                participantId = participantStateChange.participantId;
            }
            if ((i & 2) != 0) {
                z = participantStateChange.isOn;
            }
            if ((i & 4) != 0) {
                j = participantStateChange.updateTs;
            }
            return participantStateChange.copy(participantId, z, j);
        }

        public final ParticipantId component1() {
            return this.participantId;
        }

        public final boolean component2() {
            return this.isOn;
        }

        public final long component3() {
            return this.updateTs;
        }

        public final ParticipantStateChange copy(ParticipantId participantId, boolean z, long j) {
            return new ParticipantStateChange(participantId, z, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParticipantStateChange)) {
                return false;
            }
            ParticipantStateChange participantStateChange = (ParticipantStateChange) obj;
            return epx.f(this.participantId, participantStateChange.participantId) && this.isOn == participantStateChange.isOn && this.updateTs == participantStateChange.updateTs;
        }

        public final ParticipantId getParticipantId() {
            return this.participantId;
        }

        public final long getUpdateTs() {
            return this.updateTs;
        }

        public int hashCode() {
            return Long.hashCode(this.updateTs) + qoy.b(this.participantId.hashCode() * 31, 31, this.isOn);
        }

        public final boolean isOn() {
            return this.isOn;
        }

        public String toString() {
            ParticipantId participantId = this.participantId;
            boolean z = this.isOn;
            long j = this.updateTs;
            StringBuilder sb = new StringBuilder("ParticipantStateChange(participantId=");
            sb.append(participantId);
            sb.append(", isOn=");
            sb.append(z);
            sb.append(", updateTs=");
            return efz.b(j, ")", sb);
        }
    }

    /* compiled from: ParticipantStatesManager.kt */
    public static final class StateChangedEvent {
        private final Collection<ParticipantStateChange> changes;

        public StateChangedEvent(Collection<ParticipantStateChange> collection) {
            this.changes = collection;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateChangedEvent copy$default(StateChangedEvent stateChangedEvent, Collection collection, int i, Object obj) {
            if ((i & 1) != 0) {
                collection = stateChangedEvent.changes;
            }
            return stateChangedEvent.copy(collection);
        }

        public final Collection<ParticipantStateChange> component1() {
            return this.changes;
        }

        public final StateChangedEvent copy(Collection<ParticipantStateChange> collection) {
            return new StateChangedEvent(collection);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateChangedEvent) && epx.f(this.changes, ((StateChangedEvent) obj).changes);
        }

        public final Collection<ParticipantStateChange> getChanges() {
            return this.changes;
        }

        public int hashCode() {
            return this.changes.hashCode();
        }

        public String toString() {
            return "StateChangedEvent(changes=" + this.changes + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void lowerHandForAll$default(ParticipantStatesManager participantStatesManager, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lowerHandForAll");
        }
        if ((i & 1) != 0) {
            gzsVar = null;
        }
        if ((i & 2) != 0) {
            izsVar = null;
        }
        participantStatesManager.lowerHandForAll(gzsVar, izsVar);
    }

    void addAssistanceRequestListener(Listener listener);

    void addHandListener(Listener listener);

    Set<ParticipantId> getAssistanceRequestIds();

    long getAssistanceRequestTime();

    long getAssistanceRequestTime(ParticipantId participantId);

    long getHandRaiseTime(ParticipantId participantId);

    long getOwnHandRaiseTime();

    Set<ParticipantId> getRaisedHandIds();

    boolean isAssistanceRequested();

    boolean isAssistanceRequested(ParticipantId participantId);

    boolean isHandRaised(ParticipantId participantId);

    boolean isOwnHandRaised();

    void lowerHandForAll(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void lowerHandParticipant(ParticipantId participantId);

    void removeAssistanceRequestListener(Listener listener);

    void removeHandListener(Listener listener);

    void resetAssistanceRequests(SessionRoomId.Room room);

    void setAssistanceRequested(boolean z);

    void setOwnHandRaised(boolean z);
}
