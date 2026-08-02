package ru.ok.android.externcalls.sdk.audio;

import ru.ok.android.external.sdk.MicSampleListener;

/* compiled from: MicrophoneManager.kt */
/* loaded from: classes9.dex */
public interface MicrophoneManager {
    boolean isMicEnabled();

    void registerAudioSampleCallback(long j, MicSampleListener micSampleListener);

    void removeAudioSampleCallback(MicSampleListener micSampleListener);

    void setMicEnabled(boolean z);
}
