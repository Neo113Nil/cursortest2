package ru.ok.android.externcalls.sdk.rate.internal;

import com.huawei.hms.framework.common.BundleUtil;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.rate.loss.LossHintConfig;
import ru.ok.android.webrtc.RTCLog;
import xsna.zcl;

/* compiled from: LossHintTrigger.kt */
/* loaded from: classes9.dex */
public final class LossHintTrigger implements HintTrigger {
    private static final String AUDIO_LOSS_HINT_REASON = "audioloss";
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "RateManager";
    private static final String VIDEO_LOSS_HINT_REASON = "videoloss";
    private final LossReporter audioReporter;
    private final RateHintCollection collection;
    private final LossHintConfig config;
    private final RTCLog log;
    private final LossReporter videoReporter;

    /* compiled from: LossHintTrigger.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: LossHintTrigger.kt */
    public final class LossReporter {
        private final String hintKey;
        private final int lossCount;
        private int lossDetectionCount;
        private final long maxLoss;
        private boolean wasReported;

        public LossReporter(long j, int i, String str) {
            this.maxLoss = j;
            this.lossCount = i;
            this.hintKey = str;
        }

        public final String getHintKey() {
            return this.hintKey;
        }

        public final int getLossCount() {
            return this.lossCount;
        }

        public final long getMaxLoss() {
            return this.maxLoss;
        }

        public final boolean getWasReported() {
            return this.wasReported;
        }

        public final void onNewLoss(float f) {
            float f2 = this.maxLoss / 100;
            LossHintTrigger.this.log.log("RateManager", "measured " + this.hintKey + ": " + f);
            if (f >= f2) {
                this.lossDetectionCount++;
            } else {
                this.lossDetectionCount = 0;
            }
            if (this.lossDetectionCount >= this.lossCount) {
                LossHintTrigger.this.collection.addRateHint(new RateHint(this.hintKey + BundleUtil.UNDERLINE_TAG + this.maxLoss));
                this.wasReported = true;
            }
        }
    }

    public LossHintTrigger(RTCLog rTCLog, LossHintConfig lossHintConfig, RateHintCollection rateHintCollection) {
        LossHintTrigger lossHintTrigger;
        LossReporter lossReporter;
        LossHintTrigger lossHintTrigger2;
        this.log = rTCLog;
        this.config = lossHintConfig;
        this.collection = rateHintCollection;
        Long audioLoss = lossHintConfig.getAudioLoss();
        LossReporter lossReporter2 = null;
        if (audioLoss != null) {
            lossHintTrigger = this;
            lossReporter = lossHintTrigger.new LossReporter(audioLoss.longValue(), lossHintConfig.getAudioLossCount(), AUDIO_LOSS_HINT_REASON);
        } else {
            lossHintTrigger = this;
            lossReporter = null;
        }
        lossHintTrigger.audioReporter = lossReporter;
        Long videoLoss = lossHintConfig.getVideoLoss();
        if (videoLoss != null) {
            lossHintTrigger2 = this;
            lossReporter2 = lossHintTrigger2.new LossReporter(videoLoss.longValue(), lossHintConfig.getVideoLossCount(), VIDEO_LOSS_HINT_REASON);
        } else {
            lossHintTrigger2 = lossHintTrigger;
        }
        lossHintTrigger2.videoReporter = lossReporter2;
    }

    @Override // ru.ok.android.externcalls.sdk.rate.internal.HintTrigger
    public void onNetworkStat(NetworkStat networkStat) {
        Float videoLoss;
        Float audioLoss;
        LossReporter lossReporter = this.audioReporter;
        if (lossReporter != null && !lossReporter.getWasReported() && (audioLoss = networkStat.getAudioLoss()) != null) {
            this.audioReporter.onNewLoss(audioLoss.floatValue());
        }
        LossReporter lossReporter2 = this.videoReporter;
        if (lossReporter2 == null || lossReporter2.getWasReported() || (videoLoss = networkStat.getVideoLoss()) == null) {
            return;
        }
        this.videoReporter.onNewLoss(videoLoss.floatValue());
    }
}
