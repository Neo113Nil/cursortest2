package ru.ok.gl.effects.media.controller.audio;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes9.dex */
public class AudioMuxingData {
    long audioEndMcs;
    long audioStartMcs;
    boolean cyclic;
    volatile boolean pure;
    volatile float volume;

    public AudioMuxingData(long j, long j2, boolean z, float f) {
        this.cyclic = false;
        this.audioStartMcs = -1L;
        this.audioEndMcs = -1L;
        this.volume = 1.0f;
        this.pure = false;
        this.audioStartMcs = j;
        this.audioEndMcs = j2;
        this.cyclic = z;
        this.volume = f;
    }

    private long squeeze(long j, long j2, long j3) {
        return j < 0 ? j3 : Math.max(Math.min(j, j2), 0L);
    }

    private float squeezeVolume(float f) {
        return Math.max(Math.min(f, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public AudioMuxingData compress(long j) {
        this.audioStartMcs = squeeze(this.audioStartMcs, j, 0L);
        long squeeze = squeeze(this.audioEndMcs, j, j);
        this.audioEndMcs = squeeze;
        long j2 = this.audioStartMcs;
        if (squeeze - j2 < AudioMuxingSupplier.SAMPLE_DURATION_MCS) {
            return null;
        }
        return new AudioMuxingData(j2, squeeze, this.cyclic, 1.0f);
    }

    public float getCurrentVolume() {
        return this.volume;
    }

    public boolean isCompoundVolume() {
        return this.volume != 1.0f;
    }

    public void setVolume(float f) {
        this.volume = squeezeVolume(f);
    }

    public AudioMuxingData() {
        this.cyclic = false;
        this.audioStartMcs = -1L;
        this.audioEndMcs = -1L;
        this.volume = 1.0f;
        this.pure = false;
    }
}
