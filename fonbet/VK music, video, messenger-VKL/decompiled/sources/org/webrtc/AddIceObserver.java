package org.webrtc;

/* loaded from: classes9.dex */
public interface AddIceObserver {
    @CalledByNative
    void onAddFailure(RTCErrorType rTCErrorType, String str);

    @CalledByNative
    void onAddSuccess();
}
