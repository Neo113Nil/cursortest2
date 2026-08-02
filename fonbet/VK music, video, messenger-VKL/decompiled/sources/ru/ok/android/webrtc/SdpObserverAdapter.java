package ru.ok.android.webrtc;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* loaded from: classes9.dex */
public abstract class SdpObserverAdapter implements SdpObserver {
    @Override // org.webrtc.SdpObserver
    public void onCreateFailure(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.webrtc.SdpObserver
    public void onSetFailure(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.webrtc.SdpObserver
    public void onSetSuccess() {
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sessionDescription) {
    }
}
