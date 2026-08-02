package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallFingerprintListener;

/* loaded from: classes9.dex */
public interface FingerprintListenersCollection {
    void addFingerprintListener(CallFingerprintListener callFingerprintListener);

    void removeFingerprintListener(CallFingerprintListener callFingerprintListener);
}
