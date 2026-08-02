package ru.ok.android.externcalls.sdk.stat.signaling;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.stat.signaling.SignalingTracker;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.signaling.api.SignalingStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.erm0;
import xsna.gzs;
import xsna.j5g;
import xsna.s3q0;
import xsna.zcl;
import xsna.zr;

/* compiled from: SignalingTransportStat.kt */
/* loaded from: classes9.dex */
public final class SignalingTransportStat implements SignalingStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "SignalingTransportStat";
    private boolean connectedAtLeastOnceInCall;
    private Long firstFailTime;
    private final gzs<CallEventualStatSender> getEventualStatSender;
    private final boolean isSummaryStatsEnabled;
    private long lastMessageReceived;
    private final RTCLog log;
    private final SignalingTracker signalingPingTracker;
    private final SignalingTracker signalingTracker;
    private long startConnectTime;
    private final TimeProvider timeProvider;

    /* compiled from: SignalingTransportStat.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignalingTransportStat(gzs<? extends CallEventualStatSender> gzsVar, TimeProvider timeProvider, RTCLog rTCLog, boolean z) {
        this.getEventualStatSender = gzsVar;
        this.timeProvider = timeProvider;
        this.log = rTCLog;
        this.isSummaryStatsEnabled = z;
        this.signalingTracker = z ? new SignalingTracker(timeProvider) : null;
        this.signalingPingTracker = z ? new SignalingTracker(timeProvider) : null;
    }

    private final void addCommonStats(EventItemsMap eventItemsMap, SignalingTracker.StatisticsInfo statisticsInfo) {
        eventItemsMap.set(StatCustomFieldKey.MIN_VALUE, Long.valueOf(statisticsInfo.getMinValue()));
        eventItemsMap.set(StatCustomFieldKey.MAX_VALUE, Long.valueOf(statisticsInfo.getMaxValue()));
        eventItemsMap.set(StatCustomFieldKey.AVG_VALUE, Long.valueOf(statisticsInfo.getAverage()));
        Long median = statisticsInfo.getMedian();
        Long quantile95 = statisticsInfo.getQuantile95();
        if (median == null || quantile95 == null) {
            this.log.reportException(LOG_TAG, "issue with OnlineQuantilesApproximator", new IllegalStateException(zr.a("NaN or Inf in statistics tracking ", statisticsInfo.getName(), " signaling request")));
        }
        eventItemsMap.set(StatCustomFieldKey.MEDIAN_VALUE, median);
        eventItemsMap.set(StatCustomFieldKey.P95_VALUE, quantile95);
        eventItemsMap.set(StatCustomFieldKey.VALUES_COUNT, Integer.valueOf(statisticsInfo.getCount()));
    }

    private final void onFailed() {
        if (this.firstFailTime == null) {
            this.firstFailTime = Long.valueOf(this.timeProvider.getMsSinceBoot());
        }
    }

    private final void report(String str, Integer num) {
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            CallEventualStatSender.send$default(invoke, str, num != null ? EventItemValueKt.toEventItemValue(num.intValue()) : null, null, 4, null);
        }
    }

    public static /* synthetic */ void report$default(SignalingTransportStat signalingTransportStat, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        signalingTransportStat.report(str, num);
    }

    private final void reportCommandSummary() {
        SignalingTracker signalingTracker;
        Collection<SignalingTracker.StatisticsInfo> extractStatistics;
        if (!this.isSummaryStatsEnabled || (signalingTracker = this.signalingTracker) == null || (extractStatistics = signalingTracker.extractStatistics()) == null) {
            return;
        }
        for (SignalingTracker.StatisticsInfo statisticsInfo : extractStatistics) {
            CallEventualStatSender invoke = this.getEventualStatSender.invoke();
            if (invoke != null) {
                EventItemsMap eventItemsMap = new EventItemsMap();
                eventItemsMap.set(StatCustomFieldKey.API_METHOD, statisticsInfo.getName());
                addCommonStats(eventItemsMap, statisticsInfo);
                s3q0 s3q0Var = s3q0.a;
                CallEventualStatSender.send$default(invoke, CallEventualStatName.SIGNALING_COMMAND_SUMMARY, null, eventItemsMap, 2, null);
            }
        }
    }

    private final void reportPingSummary() {
        SignalingTracker signalingTracker;
        Collection<SignalingTracker.StatisticsInfo> extractStatistics;
        SignalingTracker.StatisticsInfo statisticsInfo;
        CallEventualStatSender invoke;
        if (!this.isSummaryStatsEnabled || (signalingTracker = this.signalingPingTracker) == null || (extractStatistics = signalingTracker.extractStatistics()) == null || (statisticsInfo = (SignalingTracker.StatisticsInfo) j5g.Z(extractStatistics)) == null || (invoke = this.getEventualStatSender.invoke()) == null) {
            return;
        }
        EventItemsMap eventItemsMap = new EventItemsMap();
        addCommonStats(eventItemsMap, statisticsInfo);
        s3q0 s3q0Var = s3q0.a;
        CallEventualStatSender.send$default(invoke, CallEventualStatName.SIGNALING_PING_SUMMARY, null, eventItemsMap, 2, null);
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onCallFinished() {
        reportCommandSummary();
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onCommandSent(SignalingStat.SignalingType signalingType, String str, boolean z) {
        SignalingTracker signalingTracker;
        if (!this.isSummaryStatsEnabled || str == null || z || (signalingTracker = this.signalingTracker) == null) {
            return;
        }
        signalingTracker.onRequest(str);
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onConnect(SignalingStat.SignalingType signalingType) {
        this.startConnectTime = this.timeProvider.getMsSinceBoot();
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onConnected(SignalingStat.SignalingType signalingType) {
        this.firstFailTime = null;
        this.lastMessageReceived = 0L;
        long msSinceBoot = this.timeProvider.getMsSinceBoot() - this.startConnectTime;
        if (this.connectedAtLeastOnceInCall) {
            report(signalingType.getEventByType(SignalingStat.SignalingEventType.RECONNECTED), Integer.valueOf((int) msSinceBoot));
        } else {
            this.connectedAtLeastOnceInCall = true;
            report(signalingType.getEventByType(SignalingStat.SignalingEventType.CONNECTED), Integer.valueOf((int) msSinceBoot));
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onDisconnectedSuccessfully(SignalingStat.SignalingType signalingType) {
        reportPingSummary();
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onFailedByException(SignalingStat.SignalingType signalingType, Throwable th) {
        onFailed();
        String message = th.getMessage();
        if (message == null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            message = stringWriter.toString();
        }
        report(signalingType.getEventByType(SignalingStat.SignalingEventType.FAILED_BY_EXCEPTION), erm0.D0(300, message));
        reportPingSummary();
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onFailedByPings(SignalingStat.SignalingType signalingType) {
        long msSinceBoot = this.timeProvider.getMsSinceBoot() - this.lastMessageReceived;
        onFailed();
        report(signalingType.getEventByType(SignalingStat.SignalingEventType.FAILED_BY_PINGS), Integer.valueOf((int) msSinceBoot));
        reportPingSummary();
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onMessageReceived(SignalingStat.SignalingType signalingType, String str, boolean z) {
        this.lastMessageReceived = this.timeProvider.getMsSinceBoot();
        if (!this.isSummaryStatsEnabled || str == null) {
            return;
        }
        if (!z) {
            SignalingTracker signalingTracker = this.signalingTracker;
            if (signalingTracker != null) {
                signalingTracker.onAnswer(str);
                return;
            }
            return;
        }
        SignalingTracker signalingTracker2 = this.signalingPingTracker;
        if (signalingTracker2 != null) {
            signalingTracker2.onAnswer(str);
        }
        SignalingTracker signalingTracker3 = this.signalingPingTracker;
        if (signalingTracker3 != null) {
            signalingTracker3.onRequest(str);
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onRestart(SignalingStat.SignalingType signalingType) {
        report$default(this, signalingType.getEventByType(SignalingStat.SignalingEventType.RESTART), null, 2, null);
    }

    @Override // ru.ok.android.webrtc.signaling.api.SignalingStat
    public void onTimeout(SignalingStat.SignalingType signalingType) {
        Long l = this.firstFailTime;
        Long valueOf = l != null ? Long.valueOf(this.timeProvider.getMsSinceBoot() - l.longValue()) : null;
        report(signalingType.getEventByType(SignalingStat.SignalingEventType.TIMEOUT), Integer.valueOf(valueOf != null ? (int) valueOf.longValue() : 0));
        reportPingSummary();
    }

    private final void report(String str, String str2) {
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            CallEventualStatSender.send$default(invoke, str, EventItemValueKt.toEventItemValue(str2), null, 4, null);
        }
    }
}
