package ru.ok.android.externcalls.sdk.asr.internal.listeners;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.asr.AsrInfo;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.webrtc.listeners.CallAsrListener;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;

/* compiled from: AsrListenerManagerImpl.kt */
/* loaded from: classes9.dex */
public final class AsrListenerManagerImpl implements AsrListenerManager, CallAsrListener, CallSessionRoomsListener {
    private SessionRoomId activeRoomId;
    private final CopyOnWriteArraySet<AsrRecordListener> listeners = new CopyOnWriteArraySet<>();
    private final HashMap<SessionRoomId, AsrInfo> sessionRoomToAsrInfo = new HashMap<>();
    private final ParticipantStore store;

    public AsrListenerManagerImpl(ParticipantStore participantStore) {
        this.store = participantStore;
        this.activeRoomId = participantStore.getActiveRoomId();
    }

    private final void notifyAsrRecordStarted(AsrInfo asrInfo) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((AsrRecordListener) it.next()).onAsrRecordStarted(asrInfo);
        }
    }

    private final void notifyAsrRecordStopped() {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((AsrRecordListener) it.next()).onAsrRecordStopped();
        }
    }

    private final void notifyOnNewListener(AsrRecordListener asrRecordListener) {
        AsrInfo asrInfo = getAsrInfo();
        if (asrInfo == null) {
            return;
        }
        asrRecordListener.onAsrRecordStarted(asrInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager
    public void addAsrRecordListener(AsrRecordListener asrRecordListener) {
        this.listeners.add(asrRecordListener);
        notifyOnNewListener(asrRecordListener);
    }

    public final AsrInfo getAsrInfo() {
        return this.sessionRoomToAsrInfo.get(this.activeRoomId);
    }

    @Override // ru.ok.android.webrtc.listeners.CallAsrListener
    public void onAsrRecordStarted(CallAsrListener.AsrRecordStartInfo asrRecordStartInfo) {
        ConversationParticipant byInternal = this.store.getByInternal(asrRecordStartInfo.getCallAsrInfo().getInitiatorId());
        if (byInternal == null) {
            return;
        }
        AsrInfo asrInfo = new AsrInfo(byInternal, asrRecordStartInfo.getCallAsrInfo().getMovieId());
        this.sessionRoomToAsrInfo.put(asrRecordStartInfo.getSessionRoomId(), asrInfo);
        if (epx.f(asrRecordStartInfo.getSessionRoomId(), this.activeRoomId)) {
            notifyAsrRecordStarted(asrInfo);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallAsrListener
    public void onAsrRecordStopped(CallAsrListener.AsrRecordStopInfo asrRecordStopInfo) {
        AsrInfo remove = this.sessionRoomToAsrInfo.remove(asrRecordStopInfo.getSessionRoomId());
        if (!epx.f(asrRecordStopInfo.getSessionRoomId(), this.activeRoomId) || remove == null) {
            return;
        }
        notifyAsrRecordStopped();
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantActiveRoomChanged(CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        SessionRoomId roomId = activeRoomChangedParams.getRoomId();
        if (epx.f(roomId, this.activeRoomId)) {
            return;
        }
        SessionRoomId sessionRoomId = this.activeRoomId;
        this.activeRoomId = roomId;
        if (this.sessionRoomToAsrInfo.get(sessionRoomId) != null) {
            notifyAsrRecordStopped();
        }
        AsrInfo asrInfo = this.sessionRoomToAsrInfo.get(roomId);
        if (asrInfo != null) {
            notifyAsrRecordStarted(asrInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager
    public void removeAsrRecordListener(AsrRecordListener asrRecordListener) {
        this.listeners.remove(asrRecordListener);
    }
}
