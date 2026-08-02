package ru.ok.android.webrtc.protocol;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface RtcNotificationReceiver {
    void addListener(@NonNull Listener listener);

    void removeListener(@NonNull Listener listener);

    public interface Listener {
        default void onNotificationError(@NonNull Throwable th) {
        }

        default void onNotificationReceived(@NonNull RtcNotification rtcNotification) {
        }

        default void onRtcDataReceived(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
        }
    }
}
