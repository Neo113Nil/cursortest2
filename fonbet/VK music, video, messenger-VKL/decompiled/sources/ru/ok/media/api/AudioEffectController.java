package ru.ok.media.api;

/* loaded from: classes9.dex */
public interface AudioEffectController {
    long getFilePlaybackPositionMS();

    float getMicLevel();

    void pause();

    void play();

    void setAudioFilter(String str);

    void setFileShiftMS(int i);

    void setFileSpeakerVolume(float f);

    void setFileStreamVolume(float f);

    void setMicVolume(float f);

    void setMixToSpeakerEnabled(boolean z);

    void setMusicHalfTone(int i);

    void setNoiseSuppression(boolean z);

    void setPlaybackFile(String str);
}
