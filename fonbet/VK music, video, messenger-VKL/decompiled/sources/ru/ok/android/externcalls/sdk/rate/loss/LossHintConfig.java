package ru.ok.android.externcalls.sdk.rate.loss;

import xsna.epx;
import xsna.rzl;
import xsna.shy;
import xsna.zcl;

/* compiled from: LossHintConfig.kt */
/* loaded from: classes9.dex */
public final class LossHintConfig {
    public static final String AUDIO_LOSS = "audio_loss";
    public static final Companion Companion = new Companion(null);
    public static final String VIDEO_LOSS = "video_loss";
    private final Long audioLoss;
    private final int audioLossCount;
    private final Long videoLoss;
    private final int videoLossCount;

    /* compiled from: LossHintConfig.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public LossHintConfig() {
        this(null, null, 0, 0, 15, null);
    }

    public static /* synthetic */ LossHintConfig copy$default(LossHintConfig lossHintConfig, Long l, Long l2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            l = lossHintConfig.audioLoss;
        }
        if ((i3 & 2) != 0) {
            l2 = lossHintConfig.videoLoss;
        }
        if ((i3 & 4) != 0) {
            i = lossHintConfig.audioLossCount;
        }
        if ((i3 & 8) != 0) {
            i2 = lossHintConfig.videoLossCount;
        }
        return lossHintConfig.copy(l, l2, i, i2);
    }

    public final Long component1() {
        return this.audioLoss;
    }

    public final Long component2() {
        return this.videoLoss;
    }

    public final int component3() {
        return this.audioLossCount;
    }

    public final int component4() {
        return this.videoLossCount;
    }

    public final LossHintConfig copy(Long l, Long l2, int i, int i2) {
        return new LossHintConfig(l, l2, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LossHintConfig)) {
            return false;
        }
        LossHintConfig lossHintConfig = (LossHintConfig) obj;
        return epx.f(this.audioLoss, lossHintConfig.audioLoss) && epx.f(this.videoLoss, lossHintConfig.videoLoss) && this.audioLossCount == lossHintConfig.audioLossCount && this.videoLossCount == lossHintConfig.videoLossCount;
    }

    public final Long getAudioLoss() {
        return this.audioLoss;
    }

    public final int getAudioLossCount() {
        return this.audioLossCount;
    }

    public final Long getVideoLoss() {
        return this.videoLoss;
    }

    public final int getVideoLossCount() {
        return this.videoLossCount;
    }

    public int hashCode() {
        Long l = this.audioLoss;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.videoLoss;
        return Integer.hashCode(this.videoLossCount) + shy.a(this.audioLossCount, (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31);
    }

    public final boolean isNotEmpty() {
        return (this.audioLoss == null && this.videoLoss == null) ? false : true;
    }

    public String toString() {
        Long l = this.audioLoss;
        Long l2 = this.videoLoss;
        int i = this.audioLossCount;
        int i2 = this.videoLossCount;
        StringBuilder sb = new StringBuilder("LossHintConfig(audioLoss=");
        sb.append(l);
        sb.append(", videoLoss=");
        sb.append(l2);
        sb.append(", audioLossCount=");
        return rzl.a(i, i2, ", videoLossCount=", ")", sb);
    }

    public LossHintConfig(Long l, Long l2, int i, int i2) {
        this.audioLoss = l;
        this.videoLoss = l2;
        this.audioLossCount = i;
        this.videoLossCount = i2;
    }

    public /* synthetic */ LossHintConfig(Long l, Long l2, int i, int i2, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? null : l, (i3 & 2) != 0 ? null : l2, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? 1 : i2);
    }
}
