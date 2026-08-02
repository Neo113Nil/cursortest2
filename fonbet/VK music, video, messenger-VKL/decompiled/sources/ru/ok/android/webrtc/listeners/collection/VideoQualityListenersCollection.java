package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallVideoQualityUpdateListener;

/* loaded from: classes9.dex */
public interface VideoQualityListenersCollection {
    void addVideoQualityUpdateListener(CallVideoQualityUpdateListener callVideoQualityUpdateListener);

    void removeVideoQualityUpdateListener(CallVideoQualityUpdateListener callVideoQualityUpdateListener);
}
