package ru.ok.gleffects;

/* loaded from: classes9.dex */
public interface EffectAudioController {
    int addAudioStream(String str);

    void pause(int i);

    void release(int i);

    void resume(int i);

    void setVolume(int i, float f);

    void start(int i, boolean z, boolean z2, float f, long j);

    void stop(int i);
}
