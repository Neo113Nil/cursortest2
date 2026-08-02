package ru.ok.android.externcalls.sdk.asr_online.internal.listeners;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineChunk;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.webrtc.asr_online.data_channels.AsrRecvDataPackage;
import ru.ok.android.webrtc.listeners.CallAsrOnlineListener;

/* compiled from: AsrOnlineListenerManagerImpl.kt */
/* loaded from: classes9.dex */
public final class AsrOnlineListenerManagerImpl implements AsrOnlineListenerManager, CallAsrOnlineListener {
    private volatile boolean lastIsAvailable;
    private final CopyOnWriteArraySet<AsrOnlineListener> listeners = new CopyOnWriteArraySet<>();
    private final ParticipantStore store;

    public AsrOnlineListenerManagerImpl(ParticipantStore participantStore) {
        this.store = participantStore;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void addAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        asrOnlineListener.onAsrAvailableChanged(this.lastIsAvailable);
        this.listeners.add(asrOnlineListener);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void onAsrAvailableChanged(boolean z) {
        this.lastIsAvailable = z;
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((AsrOnlineListener) it.next()).onAsrAvailableChanged(z);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallAsrOnlineListener
    public void onAsrDataPackage(AsrRecvDataPackage asrRecvDataPackage) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((AsrOnlineListener) it.next()).onAsrChunk(AsrOnlineChunk.Companion.chunkFromPackage$calls_sdk_release(this.store, asrRecvDataPackage));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void removeAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        this.listeners.remove(asrOnlineListener);
    }
}
