package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.asr_online.data_channels.AsrRecvDataPackage;
import ru.ok.android.webrtc.listeners.CallAsrOnlineListener;
import ru.ok.android.webrtc.listeners.collection.AsrOnlineListenersCollection;

/* loaded from: classes9.dex */
public final class AsrOnlineListenerProxyImpl implements AsrOnlineListenersCollection, AsrOnlineListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.AsrOnlineListenersCollection
    public void addAsrOnlineListener(CallAsrOnlineListener callAsrOnlineListener) {
        this.a.add(callAsrOnlineListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallAsrOnlineListener
    public void onAsrDataPackage(AsrRecvDataPackage asrRecvDataPackage) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallAsrOnlineListener) it.next()).onAsrDataPackage(asrRecvDataPackage);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.AsrOnlineListenersCollection
    public void removeAsrOnlineListener(CallAsrOnlineListener callAsrOnlineListener) {
        this.a.remove(callAsrOnlineListener);
    }
}
