package ru.ok.android.externcalls.sdk.rate;

import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import ru.ok.android.externcalls.sdk.rate.loss.LossHintConfig;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import xsna.epx;

/* compiled from: RateManagerConfig.kt */
/* loaded from: classes9.dex */
public final class RateManagerConfig {
    private final CandidateTypeHintConfig directCandidateTypeHintConfig;
    private final LossHintConfig lossHintConfig;
    private final RttRateHintConfig rttRateHintConfig;
    private final CandidateTypeHintConfig serverCandidateTypeHintConfig;

    public RateManagerConfig(RttRateHintConfig rttRateHintConfig, LossHintConfig lossHintConfig, CandidateTypeHintConfig candidateTypeHintConfig, CandidateTypeHintConfig candidateTypeHintConfig2) {
        this.rttRateHintConfig = rttRateHintConfig;
        this.lossHintConfig = lossHintConfig;
        this.directCandidateTypeHintConfig = candidateTypeHintConfig;
        this.serverCandidateTypeHintConfig = candidateTypeHintConfig2;
    }

    public static /* synthetic */ RateManagerConfig copy$default(RateManagerConfig rateManagerConfig, RttRateHintConfig rttRateHintConfig, LossHintConfig lossHintConfig, CandidateTypeHintConfig candidateTypeHintConfig, CandidateTypeHintConfig candidateTypeHintConfig2, int i, Object obj) {
        if ((i & 1) != 0) {
            rttRateHintConfig = rateManagerConfig.rttRateHintConfig;
        }
        if ((i & 2) != 0) {
            lossHintConfig = rateManagerConfig.lossHintConfig;
        }
        if ((i & 4) != 0) {
            candidateTypeHintConfig = rateManagerConfig.directCandidateTypeHintConfig;
        }
        if ((i & 8) != 0) {
            candidateTypeHintConfig2 = rateManagerConfig.serverCandidateTypeHintConfig;
        }
        return rateManagerConfig.copy(rttRateHintConfig, lossHintConfig, candidateTypeHintConfig, candidateTypeHintConfig2);
    }

    public final RttRateHintConfig component1() {
        return this.rttRateHintConfig;
    }

    public final LossHintConfig component2() {
        return this.lossHintConfig;
    }

    public final CandidateTypeHintConfig component3() {
        return this.directCandidateTypeHintConfig;
    }

    public final CandidateTypeHintConfig component4() {
        return this.serverCandidateTypeHintConfig;
    }

    public final RateManagerConfig copy(RttRateHintConfig rttRateHintConfig, LossHintConfig lossHintConfig, CandidateTypeHintConfig candidateTypeHintConfig, CandidateTypeHintConfig candidateTypeHintConfig2) {
        return new RateManagerConfig(rttRateHintConfig, lossHintConfig, candidateTypeHintConfig, candidateTypeHintConfig2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RateManagerConfig)) {
            return false;
        }
        RateManagerConfig rateManagerConfig = (RateManagerConfig) obj;
        return epx.f(this.rttRateHintConfig, rateManagerConfig.rttRateHintConfig) && epx.f(this.lossHintConfig, rateManagerConfig.lossHintConfig) && epx.f(this.directCandidateTypeHintConfig, rateManagerConfig.directCandidateTypeHintConfig) && epx.f(this.serverCandidateTypeHintConfig, rateManagerConfig.serverCandidateTypeHintConfig);
    }

    public final CandidateTypeHintConfig getDirectCandidateTypeHintConfig() {
        return this.directCandidateTypeHintConfig;
    }

    public final LossHintConfig getLossHintConfig() {
        return this.lossHintConfig;
    }

    public final RttRateHintConfig getRttRateHintConfig() {
        return this.rttRateHintConfig;
    }

    public final CandidateTypeHintConfig getServerCandidateTypeHintConfig() {
        return this.serverCandidateTypeHintConfig;
    }

    public int hashCode() {
        return this.serverCandidateTypeHintConfig.hashCode() + ((this.directCandidateTypeHintConfig.hashCode() + ((this.lossHintConfig.hashCode() + (this.rttRateHintConfig.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RateManagerConfig(rttRateHintConfig=" + this.rttRateHintConfig + ", lossHintConfig=" + this.lossHintConfig + ", directCandidateTypeHintConfig=" + this.directCandidateTypeHintConfig + ", serverCandidateTypeHintConfig=" + this.serverCandidateTypeHintConfig + ")";
    }
}
