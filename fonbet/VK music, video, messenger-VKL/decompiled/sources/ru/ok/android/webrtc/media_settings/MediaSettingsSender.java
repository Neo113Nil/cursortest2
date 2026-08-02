package ru.ok.android.webrtc.media_settings;

import androidx.annotation.NonNull;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettings;

/* loaded from: classes9.dex */
public interface MediaSettingsSender {
    void release();

    void send(@NonNull SignalingMediaSettings signalingMediaSettings);

    void setActualSettings(@NonNull SignalingMediaSettings signalingMediaSettings);
}
