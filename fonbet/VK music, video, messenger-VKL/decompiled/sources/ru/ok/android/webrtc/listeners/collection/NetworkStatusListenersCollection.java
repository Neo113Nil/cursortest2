package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallNetworkStatusListener;

/* loaded from: classes9.dex */
public interface NetworkStatusListenersCollection {
    void addNetworkStatusListener(CallNetworkStatusListener callNetworkStatusListener);

    void removeNetworkStatusListener(CallNetworkStatusListener callNetworkStatusListener);
}
