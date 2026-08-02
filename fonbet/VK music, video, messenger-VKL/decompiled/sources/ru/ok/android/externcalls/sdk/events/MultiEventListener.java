package ru.ok.android.externcalls.sdk.events;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.media.MuteEvent;
import xsna.hcy;
import xsna.iav;
import xsna.z4g;

/* compiled from: MultiEventListener.kt */
/* loaded from: classes9.dex */
public final class MultiEventListener implements ConversationEventsListener, Collection<ConversationEventsListener>, hcy {
    private final Collection<ConversationEventsListener> container;

    public MultiEventListener(Collection<ConversationEventsListener> collection) {
        this.container = collection;
    }

    @Override // java.util.Collection
    public boolean add(ConversationEventsListener conversationEventsListener) {
        return this.container.add(conversationEventsListener);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ConversationEventsListener> collection) {
        return this.container.addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        this.container.clear();
    }

    public boolean contains(ConversationEventsListener conversationEventsListener) {
        return this.container.contains(conversationEventsListener);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.container.containsAll(collection);
    }

    public int getSize() {
        return this.container.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.container.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<ConversationEventsListener> iterator() {
        return this.container.iterator();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onAdminInCallChanged(boolean z) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onAdminInCallChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onAnonJoinForbiddenChanged(boolean z) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onAnonJoinForbiddenChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallAccepted() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallAccepted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallAcceptedForAll() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallAcceptedForAll();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallEnded(ConversationEventsListener.CallEndInfo callEndInfo) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallEnded(callEndInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallIsUnfeasibleError(SignalingErrors.CallIsUnfeasibleError callIsUnfeasibleError) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallIsUnfeasibleError(callIsUnfeasibleError);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallParticipantsNetworkStatusChanged(List<? extends ConversationParticipant> list) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallParticipantsNetworkStatusChanged(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallSignalingConnected() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallSignalingConnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallStartResolutionFailed(List<ParticipantId> list) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallStartResolutionFailed(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCameraChanged() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCameraChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCameraForciblyMuted() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCameraForciblyMuted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onConnected() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onConnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onConversationIdChanged(String str, String str2) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onConversationIdChanged(str, str2);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCustomData(JSONObject jSONObject) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCustomData(jSONObject);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onDestroyed(String str) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onDestroyed(str);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onDisconnected() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onDisconnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            ParticipantId onExternalByInternalResolution = it.next().onExternalByInternalResolution(conversationParticipant);
            if (onExternalByInternalResolution != null) {
                return onExternalByInternalResolution;
            }
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onJoinLinkUpdated(String str) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onJoinLinkUpdated(str);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onLocalMediaChanged() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onLocalMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMeInWaitingRoomChanged(boolean z) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMeInWaitingRoomChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMicChanged(boolean z) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMicChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMicrophoneForciblyMuted() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMicrophoneForciblyMuted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMigratedToServerTopology() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMigratedToServerTopology();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMuteChanged(MuteEvent muteEvent) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMuteChanged(muteEvent);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMuteStateInitialized(MuteEvent muteEvent) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMuteStateInitialized(muteEvent);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onOpponentFingerprintChanged(long j) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onOpponentFingerprintChanged(j);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onOpponentMediaChanged() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onOpponentMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onOpponentRegistered() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onOpponentRegistered();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantHoldStateChanged(iav iavVar) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantHoldStateChanged(iavVar);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsAdded(List<? extends ConversationParticipant> list) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsAdded(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsChanged(List<? extends ConversationParticipant> list) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsChanged(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsDeAnonymized(List<? extends ConversationParticipant> list, Map<ParticipantId, ParticipantId> map) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsDeAnonymized(list, map);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsRemoved(List<? extends ConversationParticipant> list) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsRemoved(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsUpdated(Collection<? extends ConversationParticipant> collection) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsUpdated(collection);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onPinChanged(conversationParticipant, z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onRateCall(RateCallData rateCallData) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onRateCall(rateCallData);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onRecurringChanged(boolean z) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onRecurringChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onRolesChanged(ConversationParticipant conversationParticipant) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onRolesChanged(conversationParticipant);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onStateChanged(ConversationParticipant conversationParticipant, CallParticipant.ParticipantState participantState) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(conversationParticipant, participantState);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onWaitForAdminEnabled() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onWaitForAdminEnabled();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onWaitingRoomEnabledChanged(boolean z) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onWaitingRoomEnabledChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        }
    }

    public boolean remove(ConversationEventsListener conversationEventsListener) {
        return this.container.remove(conversationEventsListener);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.container.removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.container.retainAll(collection);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return z4g.h(this);
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ConversationEventsListener) {
            return contains((ConversationEventsListener) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ConversationEventsListener) {
            return remove((ConversationEventsListener) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) z4g.i(this, tArr);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallEnded(ConversationEndInfo conversationEndInfo) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallEnded(conversationEndInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onDestroyed(conversationDestroyedInfo);
        }
    }
}
