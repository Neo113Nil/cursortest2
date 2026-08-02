package ru.ok.android.webrtc.mediaadaptation;

/* loaded from: classes9.dex */
public interface NetworkStateProvider {
    void addListener(NetworkStateListener networkStateListener);

    void release();

    void removeListener(NetworkStateListener networkStateListener);
}
