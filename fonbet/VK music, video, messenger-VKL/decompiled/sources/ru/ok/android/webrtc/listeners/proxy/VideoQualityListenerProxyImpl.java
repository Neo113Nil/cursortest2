package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallVideoQualityUpdateListener;
import ru.ok.android.webrtc.listeners.collection.VideoQualityListenersCollection;

/* loaded from: classes9.dex */
public final class VideoQualityListenerProxyImpl implements VideoQualityListenersCollection, VideoQualityListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.VideoQualityListenersCollection
    public void addVideoQualityUpdateListener(CallVideoQualityUpdateListener callVideoQualityUpdateListener) {
        this.a.add(callVideoQualityUpdateListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallVideoQualityUpdateListener
    public void onVideoQualityUpdate(CallVideoQualityUpdateListener.VideoQualityUpdateParams videoQualityUpdateParams) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallVideoQualityUpdateListener) it.next()).onVideoQualityUpdate(videoQualityUpdateParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.VideoQualityListenersCollection
    public void removeVideoQualityUpdateListener(CallVideoQualityUpdateListener callVideoQualityUpdateListener) {
        this.a.remove(callVideoQualityUpdateListener);
    }
}
