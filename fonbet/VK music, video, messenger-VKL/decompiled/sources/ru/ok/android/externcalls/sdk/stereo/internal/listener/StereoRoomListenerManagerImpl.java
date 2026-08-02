package ru.ok.android.externcalls.sdk.stereo.internal.listener;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

/* compiled from: StereoRoomListenerManagerImpl.kt */
/* loaded from: classes9.dex */
public final class StereoRoomListenerManagerImpl implements StereoRoomListenerManager, StereoRoomManagerListener {
    private final CopyOnWriteArrayList<StereoRoomManagerListener> listeners = new CopyOnWriteArrayList<>();

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void addListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listeners.add(stereoRoomManagerListener);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public void onHandStatusChange(StereoRoomManagerListener.HandStatusUpdated handStatusUpdated) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StereoRoomManagerListener) it.next()).onHandStatusChange(handStatusUpdated);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public void onListenersChanged(StereoRoomManagerListener.ListenersUpdated listenersUpdated) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StereoRoomManagerListener) it.next()).onListenersChanged(listenersUpdated);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public void onOwnPromotionChanged(boolean z) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StereoRoomManagerListener) it.next()).onOwnPromotionChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public void onPromotionRequestUpdated(StereoRoomManagerListener.PromotionRequestUpdated promotionRequestUpdated) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StereoRoomManagerListener) it.next()).onPromotionRequestUpdated(promotionRequestUpdated);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void removeListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listeners.remove(stereoRoomManagerListener);
    }
}
