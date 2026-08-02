package ru.ok.android.webrtc;

/* loaded from: classes9.dex */
public interface RTCLogConfiguration {
    default boolean shouldHideSensitiveInformation() {
        return false;
    }

    default boolean shouldThrottleSignalingLogs() {
        return true;
    }
}
