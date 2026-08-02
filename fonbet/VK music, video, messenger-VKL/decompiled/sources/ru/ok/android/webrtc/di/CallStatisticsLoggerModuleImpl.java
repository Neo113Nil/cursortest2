package ru.ok.android.webrtc.di;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import kotlin.Lazy;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.CallAnalytics;
import ru.ok.android.webrtc.stat.call.CallStatisticsLogger;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.call.methods.CallStatLog;
import ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryRetriever;
import ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryStatSenderImpl;
import ru.ok.android.webrtc.stat.call.methods.call_stat.ConnectionStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.ConversationInfoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.NetworkInfoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.TopologyStatistics;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSenderImpl;
import ru.ok.android.webrtc.stat.codec.ActiveEncodersStats;
import ru.ok.android.webrtc.stat.cpu.HardwareInfoPeriodicRetriever;
import ru.ok.android.webrtc.stat.data.FirstDataSentStat;
import ru.ok.android.webrtc.utils.TopologyProvider;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.bpn0;
import xsna.ca;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CallStatisticsLoggerModuleImpl implements CallStatisticsLoggerModule {
    public final CallAnalytics a;
    public final Lazy b = new bpn0(new ca(this, 14));
    public final TopologyStatistics c;
    public final ConnectionStatistics d;
    public final ConversationInfoStatistics e;
    public final NetworkInfoStatistics f;
    public final CallStatLog g;
    public final HardwareInfoPeriodicRetriever h;
    public final CallEventualStatSenderImpl i;
    public final FirstDataSentStat j;
    public final ConnectivityTracker k;
    public final CallBatteryStatSenderImpl l;
    public final ActiveEncodersStats m;

    public CallStatisticsLoggerModuleImpl(Context context, CallAnalytics callAnalytics, TimeProvider timeProvider, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, RTCLog rTCLog, TopologyProvider topologyProvider, ConversationIdProvider conversationIdProvider, CallParams callParams) {
        this.a = callAnalytics;
        TopologyStatistics topologyStatistics = new TopologyStatistics(topologyProvider);
        this.c = topologyStatistics;
        ConnectionStatistics connectionStatistics = new ConnectionStatistics();
        this.d = connectionStatistics;
        ConversationInfoStatistics conversationInfoStatistics = new ConversationInfoStatistics(conversationIdProvider);
        this.e = conversationInfoStatistics;
        NetworkInfoStatistics networkInfoStatistics = new NetworkInfoStatistics(connectivityManager, rTCLog);
        this.f = networkInfoStatistics;
        this.g = new CallStatLog(callAnalytics, rTCLog, topologyStatistics, connectionStatistics, conversationInfoStatistics, networkInfoStatistics, timeProvider, callParams, topologyProvider);
        this.h = new HardwareInfoPeriodicRetriever();
        CallEventualStatSenderImpl callEventualStatSenderImpl = new CallEventualStatSenderImpl(callAnalytics.getAnalyticsSender(), timeProvider, topologyStatistics, conversationInfoStatistics, networkInfoStatistics, rTCLog);
        this.i = callEventualStatSenderImpl;
        this.j = new FirstDataSentStat(getCallEventualStatSender());
        this.k = new ConnectivityTracker(callAnalytics, rTCLog, new ConnectivityTracker.Config(callParams.getExperiments().r(), callParams.getExperiments().k(), callParams.getExperiments().X()));
        this.l = new CallBatteryStatSenderImpl(callAnalytics.getAnalyticsSender(), new CallBatteryRetriever(context, rTCLog, timeProvider), timeProvider);
        this.m = new ActiveEncodersStats(callEventualStatSenderImpl, timeProvider, rTCLog);
    }

    public static final CallStatisticsLogger a(CallStatisticsLoggerModuleImpl callStatisticsLoggerModuleImpl) {
        return new CallStatisticsLogger(callStatisticsLoggerModuleImpl.a, callStatisticsLoggerModuleImpl.c, callStatisticsLoggerModuleImpl.d, callStatisticsLoggerModuleImpl.e, callStatisticsLoggerModuleImpl.f, callStatisticsLoggerModuleImpl.g, callStatisticsLoggerModuleImpl.h, callStatisticsLoggerModuleImpl.i, callStatisticsLoggerModuleImpl.k, callStatisticsLoggerModuleImpl.l, callStatisticsLoggerModuleImpl.j, callStatisticsLoggerModuleImpl.m);
    }

    @Override // ru.ok.android.webrtc.di.CallStatisticsLoggerModule
    public CallEventualStatSender getCallEventualStatSender() {
        return this.i;
    }

    @Override // ru.ok.android.webrtc.di.CallStatisticsLoggerModule
    public CallStatisticsLogger getCallStatisticsLogger() {
        return (CallStatisticsLogger) this.b.getValue();
    }
}
