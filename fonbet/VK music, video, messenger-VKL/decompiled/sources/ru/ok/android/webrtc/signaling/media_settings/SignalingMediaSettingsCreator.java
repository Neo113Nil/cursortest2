package ru.ok.android.webrtc.signaling.media_settings;

import androidx.annotation.NonNull;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettings;

/* loaded from: classes9.dex */
public class SignalingMediaSettingsCreator {
    public SignalingMediaSettings create(@NonNull MutableMediaSettings mutableMediaSettings) {
        return new SignalingMediaSettings.Builder().setVideoEnabled(mutableMediaSettings.isVideoEnabled()).setScreenSharingEnabled(mutableMediaSettings.isScreenCaptureEnabled()).setFastScreenSharingEnabled(mutableMediaSettings.isFastScreenCaptureEnabled()).setAudioEnabled(mutableMediaSettings.isAudioEnabled()).setAnimojiEnabled(mutableMediaSettings.isAnimojiEnabled()).setAudioSharingEnabled(mutableMediaSettings.isAudioSharingEnabled()).build();
    }
}
