package ru.ok.android.externcalls.sdk.rate.internal;

import android.os.SystemClock;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.epx;
import xsna.rqi;
import xsna.xe9;
import xsna.zcl;

/* compiled from: CandidateTypeHintTrigger.kt */
/* loaded from: classes9.dex */
public final class CandidateTypeHintTrigger implements HintTrigger {
    private static final String CANDIDATE_TYPE_RATE_REASON = "ct";
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "RateManager";
    private final RateHintCollection collection;
    private final CandidateTypeHintConfig config;
    private String currentCandidateType;
    private long firstMetCurrentCandidateType;
    private final RTCLog log;
    private final String topology;
    private final Set<String> wasReported = new LinkedHashSet();

    /* compiled from: CandidateTypeHintTrigger.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CandidateTypeHintTrigger(RTCLog rTCLog, CandidateTypeHintConfig candidateTypeHintConfig, RateHintCollection rateHintCollection, String str) {
        this.log = rTCLog;
        this.config = candidateTypeHintConfig;
        this.collection = rateHintCollection;
        this.topology = str;
    }

    @Override // ru.ok.android.externcalls.sdk.rate.internal.HintTrigger
    public void onNetworkStat(NetworkStat networkStat) {
        Long l;
        String activeCandidateType = networkStat.getActiveCandidateType();
        if (activeCandidateType == null || this.config.isEmpty() || this.wasReported.contains(activeCandidateType) || (l = this.config.getLimits().get(activeCandidateType)) == null) {
            return;
        }
        long longValue = l.longValue();
        String str = this.currentCandidateType;
        if (str == null || !epx.f(str, activeCandidateType)) {
            this.firstMetCurrentCandidateType = SystemClock.elapsedRealtime();
            this.currentCandidateType = activeCandidateType;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.firstMetCurrentCandidateType;
        RTCLog rTCLog = this.log;
        StringBuilder d = rqi.d(elapsedRealtime, "measured candidate: ", activeCandidateType, ", time: ");
        d.append(UcumUtils.UCUM_MILLISECODS);
        rTCLog.log("RateManager", d.toString());
        if (elapsedRealtime >= TimeUnit.SECONDS.toMillis(longValue)) {
            RateHintCollection rateHintCollection = this.collection;
            StringBuilder a = xe9.a(CANDIDATE_TYPE_RATE_REASON, this.topology, BundleUtil.UNDERLINE_TAG, activeCandidateType, BundleUtil.UNDERLINE_TAG);
            a.append(longValue);
            rateHintCollection.addRateHint(new RateHint(a.toString()));
            this.wasReported.add(activeCandidateType);
        }
    }
}
