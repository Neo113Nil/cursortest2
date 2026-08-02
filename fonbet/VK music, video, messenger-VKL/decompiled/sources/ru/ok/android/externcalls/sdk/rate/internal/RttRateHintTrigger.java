package ru.ok.android.externcalls.sdk.rate.internal;

import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.webrtc.RTCLog;
import xsna.zcl;

/* compiled from: RttRateHintTrigger.kt */
/* loaded from: classes9.dex */
public final class RttRateHintTrigger implements HintTrigger {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "RateManager";
    private static final String RTT_HINT_REASON = "rtt_";
    private final RateHintCollection collection;
    private final RttRateHintConfig config;
    private int highRttCount;
    private final RTCLog log;
    private boolean wasReported;

    /* compiled from: RttRateHintTrigger.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public RttRateHintTrigger(RTCLog rTCLog, RttRateHintConfig rttRateHintConfig, RateHintCollection rateHintCollection) {
        this.log = rTCLog;
        this.config = rttRateHintConfig;
        this.collection = rateHintCollection;
    }

    @Override // ru.ok.android.externcalls.sdk.rate.internal.HintTrigger
    public void onNetworkStat(NetworkStat networkStat) {
        Integer rttMs = networkStat.getRttMs();
        int intValue = rttMs != null ? rttMs.intValue() : 0;
        if (this.wasReported || this.config.getRttMs() == null) {
            return;
        }
        this.log.log("RateManager", "measured rtt: " + intValue);
        if (intValue >= this.config.getRttMs().longValue()) {
            this.highRttCount++;
        } else {
            this.highRttCount = 0;
        }
        if (this.highRttCount >= this.config.getHighRttCount()) {
            this.collection.addRateHint(new RateHint(RTT_HINT_REASON + this.config.getRttMs()));
            this.wasReported = true;
        }
    }
}
