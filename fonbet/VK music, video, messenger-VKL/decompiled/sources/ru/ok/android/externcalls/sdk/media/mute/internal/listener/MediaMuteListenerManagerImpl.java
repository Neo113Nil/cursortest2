package ru.ok.android.externcalls.sdk.media.mute.internal.listener;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.webrtc.listeners.CallMediaMuteListener;
import ru.ok.android.webrtc.participant.media.MuteEvent;

/* compiled from: MediaMuteListenerManagerImpl.kt */
/* loaded from: classes9.dex */
public final class MediaMuteListenerManagerImpl implements MediaMuteListenerManager, CallMediaMuteListener {
    private final CopyOnWriteArraySet<MediaMuteManagerListener> listeners = new CopyOnWriteArraySet<>();

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager
    public void addListener(MediaMuteManagerListener mediaMuteManagerListener) {
        this.listeners.add(mediaMuteManagerListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallMediaMuteListener
    public void onMuteChanged(MuteEvent muteEvent) {
        Iterator<MediaMuteManagerListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMuteChanged(muteEvent);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallMediaMuteListener
    public void onMuteStateInitialized(MuteEvent muteEvent) {
        Iterator<MediaMuteManagerListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMuteStateInitialized(muteEvent);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager
    public void removeListener(MediaMuteManagerListener mediaMuteManagerListener) {
        this.listeners.remove(mediaMuteManagerListener);
    }
}
