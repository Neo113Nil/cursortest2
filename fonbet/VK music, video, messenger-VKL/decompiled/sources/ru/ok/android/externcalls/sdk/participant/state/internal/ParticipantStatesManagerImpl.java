package ru.ok.android.externcalls.sdk.participant.state.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.c5g;
import xsna.dt;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.on00;
import xsna.pn00;
import xsna.s3q0;
import xsna.xui0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ParticipantStatesManagerImpl.kt */
/* loaded from: classes9.dex */
public final class ParticipantStatesManagerImpl implements ParticipantStatesManager {
    private static final String INTERNAL_STATE_OFF = "0";
    private static final String INTERNAL_STATE_ON = "1";
    private final ParticipantStateChanger participantStateChanger;
    private final ConversationEventsListener stateListener;
    private final ParticipantStore store;
    public static final Companion Companion = new Companion(null);
    private static final StateValue STATE_ON = StateValue.ON;
    private static final StateValue STATE_OFF = StateValue.OFF;
    private final Map<State, Map<CallParticipant.ParticipantId, Long>> statesMap = new LinkedHashMap();
    private final Map<State, ParticipantStatesListenerProxy> listenersMap = new LinkedHashMap();

    /* compiled from: ParticipantStatesManagerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final StateValue getSTATE_OFF() {
            return ParticipantStatesManagerImpl.STATE_OFF;
        }

        public final StateValue getSTATE_ON() {
            return ParticipantStatesManagerImpl.STATE_ON;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ParticipantStatesManagerImpl.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        private final String key;
        public static final State HAND_RAISED = new State("HAND_RAISED", 0, SignalingProtocol.KEY_HAND);
        public static final State ASSISTANCE_REQUESTED = new State("ASSISTANCE_REQUESTED", 1, SignalingProtocol.KEY_DRAW_ATTENTION);

        private static final /* synthetic */ State[] $values() {
            return new State[]{HAND_RAISED, ASSISTANCE_REQUESTED};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private State(String str, int i, String str2) {
            this.key = str2;
        }

        public static zrp<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ParticipantStatesManagerImpl.kt */
    public static final class StateValue {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateValue[] $VALUES;
        private final String value;
        public static final StateValue ON = new StateValue("ON", 0, "1");
        public static final StateValue OFF = new StateValue("OFF", 1, "0");

        private static final /* synthetic */ StateValue[] $values() {
            return new StateValue[]{ON, OFF};
        }

        static {
            StateValue[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private StateValue(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<StateValue> getEntries() {
            return $ENTRIES;
        }

        public static StateValue valueOf(String str) {
            return (StateValue) Enum.valueOf(StateValue.class, str);
        }

        public static StateValue[] values() {
            return (StateValue[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public ParticipantStatesManagerImpl(ParticipantStore participantStore, ParticipantStateChanger participantStateChanger, ConversationEventsListener conversationEventsListener) {
        this.store = participantStore;
        this.participantStateChanger = participantStateChanger;
        this.stateListener = conversationEventsListener;
    }

    private final long getOwnStateSetupTime(State state) {
        ParticipantId externalId = this.store.getMe().getExternalId();
        if (externalId == null) {
            return 0L;
        }
        return getStateSetupTime(externalId, state);
    }

    private final long getStateSetupTime(ParticipantId participantId, State state) {
        Long l;
        Map<CallParticipant.ParticipantId, Long> map = this.statesMap.get(state);
        if (map == null || (l = map.get(toInternal(participantId))) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final boolean isParticipantStateOn(ParticipantId participantId, State state) {
        Map<CallParticipant.ParticipantId, Long> map = this.statesMap.get(state);
        if (map != null) {
            return map.containsKey(toInternal(participantId));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lowerHandForAll$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lowerHandForAll$lambda$1(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new Exception(jSONObject.toString()));
        }
    }

    private final StateValue mapBooleanFlagToStateValue(boolean z) {
        return z ? STATE_ON : STATE_OFF;
    }

    private final void notifyCurrentState(State state, ParticipantStatesManager.Listener listener) {
        Map<CallParticipant.ParticipantId, Long> map = this.statesMap.get(state);
        if (map == null || map.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<CallParticipant.ParticipantId, Long> entry : map.entrySet()) {
            ParticipantId external = toExternal(entry.getKey());
            ParticipantStatesManager.ParticipantStateChange participantStateChange = external == null ? null : new ParticipantStatesManager.ParticipantStateChange(external, true, entry.getValue().longValue());
            if (participantStateChange != null) {
                arrayList.add(participantStateChange);
            }
        }
        listener.onParticipantStateChanged(this, new ParticipantStatesManager.StateChangedEvent(arrayList));
    }

    public static /* synthetic */ void resetStates$default(ParticipantStatesManagerImpl participantStatesManagerImpl, State state, SessionRoomId.Room room, Signaling.Listener listener, Signaling.Listener listener2, int i, Object obj) {
        if ((i & 4) != 0) {
            listener = null;
        }
        if ((i & 8) != 0) {
            listener2 = null;
        }
        participantStatesManagerImpl.resetStates(state, room, listener, listener2);
    }

    private final ParticipantId toExternal(CallParticipant.ParticipantId participantId) {
        ConversationParticipant byInternal = this.store.getByInternal(participantId);
        if (byInternal != null) {
            return byInternal.getExternalId();
        }
        return null;
    }

    private final CallParticipant.ParticipantId toInternal(ParticipantId participantId) {
        ConversationParticipant conversationParticipant = this.store.get(participantId);
        if (conversationParticipant != null) {
            return conversationParticipant.getInternalId();
        }
        return null;
    }

    public static /* synthetic */ void updateMyStates$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, Signaling.Listener listener, Signaling.Listener listener2, int i, Object obj) {
        if ((i & 2) != 0) {
            listener = null;
        }
        if ((i & 4) != 0) {
            listener2 = null;
        }
        participantStatesManagerImpl.updateMyStates(map, listener, listener2);
    }

    public static /* synthetic */ void updateOwnState$default(ParticipantStatesManagerImpl participantStatesManagerImpl, State state, StateValue stateValue, Signaling.Listener listener, Signaling.Listener listener2, int i, Object obj) {
        if ((i & 4) != 0) {
            listener = null;
        }
        if ((i & 8) != 0) {
            listener2 = null;
        }
        participantStatesManagerImpl.updateOwnState(state, stateValue, listener, listener2);
    }

    private final void updateOwnStateInternal(final Map<String, String> map, final Signaling.Listener listener, Signaling.Listener listener2) {
        if (map.isEmpty()) {
            return;
        }
        this.participantStateChanger.changeMyState(map, new Signaling.Listener() { // from class: xsna.dl90
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                ParticipantStatesManagerImpl.updateOwnStateInternal$lambda$0(Signaling.Listener.this, this, map, jSONObject);
            }
        }, listener2);
    }

    public static /* synthetic */ void updateOwnStateInternal$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, Signaling.Listener listener, Signaling.Listener listener2, int i, Object obj) {
        if ((i & 2) != 0) {
            listener = null;
        }
        if ((i & 4) != 0) {
            listener2 = null;
        }
        participantStatesManagerImpl.updateOwnStateInternal(map, listener, listener2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateOwnStateInternal$lambda$0(Signaling.Listener listener, ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, JSONObject jSONObject) {
        if (listener != null) {
            listener.onResponse(jSONObject);
        }
        participantStatesManagerImpl.updateOwnStateInternal(map);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void addAssistanceRequestListener(ParticipantStatesManager.Listener listener) {
        Map<State, ParticipantStatesListenerProxy> map = this.listenersMap;
        State state = State.ASSISTANCE_REQUESTED;
        ParticipantStatesListenerProxy participantStatesListenerProxy = map.get(state);
        if (participantStatesListenerProxy == null) {
            participantStatesListenerProxy = new ParticipantStatesListenerProxy(this);
            map.put(state, participantStatesListenerProxy);
        }
        participantStatesListenerProxy.addListener(listener);
        notifyCurrentState(state, listener);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void addHandListener(ParticipantStatesManager.Listener listener) {
        Map<State, ParticipantStatesListenerProxy> map = this.listenersMap;
        State state = State.HAND_RAISED;
        ParticipantStatesListenerProxy participantStatesListenerProxy = map.get(state);
        if (participantStatesListenerProxy == null) {
            participantStatesListenerProxy = new ParticipantStatesListenerProxy(this);
            map.put(state, participantStatesListenerProxy);
        }
        participantStatesListenerProxy.addListener(listener);
        notifyCurrentState(state, listener);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public Set<ParticipantId> getAssistanceRequestIds() {
        Map<CallParticipant.ParticipantId, Long> map = this.statesMap.get(State.ASSISTANCE_REQUESTED);
        Set<ParticipantId> set = null;
        Set<CallParticipant.ParticipantId> keySet = map != null ? map.keySet() : null;
        if (keySet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                ParticipantId external = toExternal((CallParticipant.ParticipantId) it.next());
                if (external != null) {
                    arrayList.add(external);
                }
            }
            set = j5g.S0(arrayList);
        }
        return set == null ? EmptySet.b : set;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getAssistanceRequestTime() {
        return getOwnStateSetupTime(State.ASSISTANCE_REQUESTED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getHandRaiseTime(ParticipantId participantId) {
        return getStateSetupTime(participantId, State.HAND_RAISED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getOwnHandRaiseTime() {
        return getOwnStateSetupTime(State.HAND_RAISED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public Set<ParticipantId> getRaisedHandIds() {
        Map<CallParticipant.ParticipantId, Long> map = this.statesMap.get(State.HAND_RAISED);
        Set<ParticipantId> set = null;
        Set<CallParticipant.ParticipantId> keySet = map != null ? map.keySet() : null;
        if (keySet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                ParticipantId external = toExternal((CallParticipant.ParticipantId) it.next());
                if (external != null) {
                    arrayList.add(external);
                }
            }
            set = j5g.S0(arrayList);
        }
        return set == null ? EmptySet.b : set;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isAssistanceRequested() {
        return isOwnStateOn(State.ASSISTANCE_REQUESTED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isHandRaised(ParticipantId participantId) {
        return isParticipantStateOn(participantId, State.HAND_RAISED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isOwnHandRaised() {
        return isOwnStateOn(State.HAND_RAISED);
    }

    public final boolean isOwnStateOn(State state) {
        ParticipantId externalId = this.store.getMe().getExternalId();
        if (externalId == null) {
            return false;
        }
        return isParticipantStateOn(externalId, state);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void lowerHandForAll(final gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.participantStateChanger.lowerHandForAll(new Signaling.Listener() { // from class: xsna.cl90
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                ParticipantStatesManagerImpl.lowerHandForAll$lambda$0(gzs.this, jSONObject);
            }
        }, new xui0(2, izsVar));
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void lowerHandParticipant(ParticipantId participantId) {
        CallParticipant.ParticipantId internalId;
        ParticipantStateChanger participantStateChanger = this.participantStateChanger;
        ConversationParticipant conversationParticipant = this.store.get(participantId);
        if (conversationParticipant == null || (internalId = conversationParticipant.getInternalId()) == null) {
            return;
        }
        ParticipantStateChanger.changeParticipantState$default(participantStateChanger, internalId, dt.b(State.HAND_RAISED.getKey(), "0"), null, null, 8, null);
    }

    public final void onParticipantsRemoved(List<? extends ConversationParticipant> list) {
        for (ConversationParticipant conversationParticipant : list) {
            Iterator<T> it = this.statesMap.values().iterator();
            while (it.hasNext()) {
                ((Map) it.next()).remove(conversationParticipant.getInternalId());
            }
        }
    }

    public final void onStateChanged(CallParticipant.ParticipantId participantId, CallParticipant.ParticipantState participantState) {
        ParticipantId external;
        ParticipantStatesListenerProxy participantStatesListenerProxy;
        for (State state : State.getEntries()) {
            CallParticipant.ParticipantState.ParticipantStateItem participantStateItem = participantState.items.get(state.getKey());
            ParticipantStatesManager.ParticipantStateChange participantStateChange = null;
            String str = participantStateItem != null ? participantStateItem.value : null;
            if (epx.f(str, "1")) {
                Map<CallParticipant.ParticipantId, Long> map = this.statesMap.get(state);
                if (map == null) {
                    this.statesMap.put(state, pn00.m(new Pair(participantId, Long.valueOf(participantStateItem.updateTs))));
                    ParticipantId external2 = toExternal(participantId);
                    if (external2 != null) {
                        participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external2, true, participantStateItem.updateTs);
                    }
                } else if (map.get(participantId) == null) {
                    map.put(participantId, Long.valueOf(participantStateItem.updateTs));
                    ParticipantId external3 = toExternal(participantId);
                    if (external3 != null) {
                        participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external3, true, participantStateItem.updateTs);
                    }
                } else {
                    map.put(participantId, Long.valueOf(participantStateItem.updateTs));
                }
            } else if (epx.f(str, "0")) {
                Map<CallParticipant.ParticipantId, Long> map2 = this.statesMap.get(state);
                if ((map2 != null ? map2.remove(participantId) : null) != null && (external = toExternal(participantId)) != null) {
                    participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external, false, 0L);
                }
            }
            if (participantStateChange != null && (participantStatesListenerProxy = this.listenersMap.get(state)) != null) {
                participantStatesListenerProxy.onParticipantStateChanged(this, new ParticipantStatesManager.StateChangedEvent(Collections.singletonList(participantStateChange)));
            }
        }
    }

    public final void release() {
        Iterator<T> it = this.listenersMap.values().iterator();
        while (it.hasNext()) {
            ((ParticipantStatesListenerProxy) it.next()).release();
        }
        this.listenersMap.clear();
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void removeAssistanceRequestListener(ParticipantStatesManager.Listener listener) {
        ParticipantStatesListenerProxy participantStatesListenerProxy = this.listenersMap.get(State.ASSISTANCE_REQUESTED);
        if (participantStatesListenerProxy != null) {
            participantStatesListenerProxy.removeListener(listener);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void removeHandListener(ParticipantStatesManager.Listener listener) {
        ParticipantStatesListenerProxy participantStatesListenerProxy = this.listenersMap.get(State.HAND_RAISED);
        if (participantStatesListenerProxy != null) {
            participantStatesListenerProxy.removeListener(listener);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void resetAssistanceRequests(SessionRoomId.Room room) {
        resetStates$default(this, State.ASSISTANCE_REQUESTED, room, null, null, 12, null);
    }

    public final void resetStates(State state, SessionRoomId.Room room, Signaling.Listener listener, Signaling.Listener listener2) {
        Set<CallParticipant.ParticipantId> keySet;
        Map<CallParticipant.ParticipantId, Long> map = this.statesMap.get(state);
        if (map == null || (keySet = map.keySet()) == null) {
            return;
        }
        Collection<ConversationParticipant> participants = this.store.getParticipants(room);
        ArrayList arrayList = new ArrayList(c5g.u(participants, 10));
        Iterator<T> it = participants.iterator();
        while (it.hasNext()) {
            arrayList.add(((ConversationParticipant) it.next()).getInternalId());
        }
        Set S0 = j5g.S0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : keySet) {
            if (S0.contains((CallParticipant.ParticipantId) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.participantStateChanger.changeParticipantState((CallParticipant.ParticipantId) it2.next(), dt.b(state.getKey(), "0"), listener, listener2);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void setAssistanceRequested(boolean z) {
        updateOwnState$default(this, State.ASSISTANCE_REQUESTED, z ? STATE_ON : STATE_OFF, null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void setOwnHandRaised(boolean z) {
        updateOwnState$default(this, State.HAND_RAISED, z ? STATE_ON : STATE_OFF, null, null, 12, null);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map) {
        updateMyStates$default(this, map, null, null, 6, null);
    }

    public final void updateOwnState(Map<String, String> map) {
        updateOwnState$default(this, map, null, null, 6, null);
    }

    public static /* synthetic */ void updateOwnState$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, Signaling.Listener listener, Signaling.Listener listener2, int i, Object obj) {
        if ((i & 2) != 0) {
            listener = null;
        }
        if ((i & 4) != 0) {
            listener2 = null;
        }
        participantStatesManagerImpl.updateOwnState((Map<String, String>) map, listener, listener2);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getAssistanceRequestTime(ParticipantId participantId) {
        return getStateSetupTime(participantId, State.ASSISTANCE_REQUESTED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isAssistanceRequested(ParticipantId participantId) {
        return isParticipantStateOn(participantId, State.ASSISTANCE_REQUESTED);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map, Signaling.Listener listener) {
        updateMyStates$default(this, map, listener, null, 4, null);
    }

    public final void updateOwnState(Map<String, String> map, Signaling.Listener listener) {
        updateOwnState$default(this, map, listener, null, 4, null);
    }

    private final void updateOwnStateInternal(Map<String, String> map) {
        ConversationParticipant me2 = this.store.getMe();
        CallParticipant.ParticipantId internalId = me2.getInternalId();
        CallParticipant.ParticipantState participantState = new CallParticipant.ParticipantState(internalId);
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            participantState.add(entry.getKey(), entry.getValue(), currentTimeMillis);
        }
        this.stateListener.onStateChanged(me2, participantState);
        onStateChanged(internalId, participantState);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map, Signaling.Listener listener, Signaling.Listener listener2) {
        CallParticipant.ParticipantId internalId = this.store.getMe().getInternalId();
        if (internalId == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<State, ? extends StateValue> entry : map.entrySet()) {
            StateValue value = entry.getValue();
            Map<CallParticipant.ParticipantId, Long> map2 = this.statesMap.get(entry.getKey());
            if (value != mapBooleanFlagToStateValue(map2 != null ? map2.containsKey(internalId) : false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((State) entry2.getKey()).getKey(), ((StateValue) entry2.getValue()).getValue()));
        }
        updateOwnStateInternal(pn00.s(arrayList), listener, listener2);
    }

    public final void updateOwnState(State state, StateValue stateValue) {
        updateOwnState$default(this, state, stateValue, null, null, 12, null);
    }

    public final void updateOwnState(State state, StateValue stateValue, Signaling.Listener listener) {
        updateOwnState$default(this, state, stateValue, listener, null, 8, null);
    }

    public final void updateOwnState(State state, StateValue stateValue, Signaling.Listener listener, Signaling.Listener listener2) {
        updateMyStates(on00.f(new Pair(state, stateValue)), listener, listener2);
    }

    public final void updateOwnState(Map<String, String> map, Signaling.Listener listener, Signaling.Listener listener2) {
        updateOwnStateInternal(map, listener, listener2);
    }
}
