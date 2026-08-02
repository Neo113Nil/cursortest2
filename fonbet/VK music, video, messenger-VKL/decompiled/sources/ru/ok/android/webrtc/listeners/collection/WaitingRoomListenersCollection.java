package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallWaitingRoomListener;

/* loaded from: classes9.dex */
public interface WaitingRoomListenersCollection {
    void addWaitingRoomListener(CallWaitingRoomListener callWaitingRoomListener);

    void removeWaitingRoomListener(CallWaitingRoomListener callWaitingRoomListener);
}
