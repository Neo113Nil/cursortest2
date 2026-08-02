package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallMediaMuteListener;
import ru.ok.android.webrtc.listeners.collection.MediaMuteListenerCollection;
import ru.ok.android.webrtc.participant.media.MuteEvent;

/* loaded from: classes9.dex */
public final class MediaMuteListenerProxyImpl implements MediaMuteListenerProxy, MediaMuteListenerCollection {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.MediaMuteListenerCollection
    public void addMediaMuteListener(CallMediaMuteListener callMediaMuteListener) {
        this.a.add(callMediaMuteListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallMediaMuteListener
    public void onMuteChanged(MuteEvent muteEvent) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallMediaMuteListener) it.next()).onMuteChanged(muteEvent);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallMediaMuteListener
    public void onMuteStateInitialized(MuteEvent muteEvent) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallMediaMuteListener) it.next()).onMuteStateInitialized(muteEvent);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.MediaMuteListenerCollection
    public void removeMediaMuteListener(CallMediaMuteListener callMediaMuteListener) {
        this.a.remove(callMediaMuteListener);
    }
}
