package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallAsrListener;
import ru.ok.android.webrtc.listeners.collection.AsrListenersCollection;

/* loaded from: classes9.dex */
public final class AsrListenerProxyImpl implements AsrListenersCollection, AsrListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.AsrListenersCollection
    public void addAsrListener(CallAsrListener callAsrListener) {
        this.a.add(callAsrListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallAsrListener
    public void onAsrRecordStarted(CallAsrListener.AsrRecordStartInfo asrRecordStartInfo) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallAsrListener) it.next()).onAsrRecordStarted(asrRecordStartInfo);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallAsrListener
    public void onAsrRecordStopped(CallAsrListener.AsrRecordStopInfo asrRecordStopInfo) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallAsrListener) it.next()).onAsrRecordStopped(asrRecordStopInfo);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.AsrListenersCollection
    public void removeAsrListener(CallAsrListener callAsrListener) {
        this.a.remove(callAsrListener);
    }
}
