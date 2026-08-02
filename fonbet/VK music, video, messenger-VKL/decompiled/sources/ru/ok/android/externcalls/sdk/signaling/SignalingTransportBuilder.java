package ru.ok.android.externcalls.sdk.signaling;

import java.util.List;
import java.util.concurrent.ExecutorService;
import one.video.calls.sdk.net.signaling.WSSignaling;
import one.video.calls.sdk.net.signaling.WTSignaling;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingStat;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;
import xsna.wyg0;
import xsna.zcl;
import xsna.zy60;

/* compiled from: SignalingTransportBuilder.kt */
/* loaded from: classes9.dex */
public final class SignalingTransportBuilder {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "SignalingBuilder";
    private final CallParams callParams;
    private final Signaling.ConnectFailureListener connectFailureListener;
    private final ConversationStats conversationStats;
    private final EndpointParameters.Builder endpointParametersBuilder;
    private final ExecutorService executorService;
    private final gzs<Boolean> isReplaceParametersInEndpointEnabled;
    private final RTCLog log;
    private final RTCLogConfiguration logConfiguration;
    private final gzs<Long> peerIdGenerator;
    private final wyg0 sslProvider;
    private final TimeProvider timeProvider;
    private final SignalingTransport.Timeouts timeouts;
    private final String wsEndpointBaseUrl;
    private final List<String> wsIps;
    private final String wtEndpointBaseUrl;
    private final List<String> wtIps;
    private final SignalingTransport.FallbackParams wtToWsFallbackParams;

    /* compiled from: SignalingTransportBuilder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public SignalingTransportBuilder(EndpointParameters.Builder builder, String str, List<String> list, String str2, List<String> list2, CallParams callParams, Signaling.ConnectFailureListener connectFailureListener, ExecutorService executorService, ConversationStats conversationStats, gzs<Boolean> gzsVar, TimeProvider timeProvider, SignalingTransport.FallbackParams fallbackParams, RTCLogConfiguration rTCLogConfiguration, gzs<Long> gzsVar2, SignalingTransport.Timeouts timeouts, wyg0 wyg0Var, RTCLog rTCLog) {
        this.endpointParametersBuilder = builder;
        this.wtEndpointBaseUrl = str;
        this.wtIps = list;
        this.wsEndpointBaseUrl = str2;
        this.wsIps = list2;
        this.callParams = callParams;
        this.connectFailureListener = connectFailureListener;
        this.executorService = executorService;
        this.conversationStats = conversationStats;
        this.isReplaceParametersInEndpointEnabled = gzsVar;
        this.timeProvider = timeProvider;
        this.wtToWsFallbackParams = fallbackParams;
        this.logConfiguration = rTCLogConfiguration;
        this.peerIdGenerator = gzsVar2;
        this.timeouts = timeouts;
        this.log = rTCLog;
    }

    public final Signaling.Transport build(SignalingTransportAdapter.Params params) {
        ru.ok.android.webrtc.signaling.api.SignalingTransportBuilder builder;
        String str;
        boolean z = (params.getForceWebSocket() || (str = this.wtEndpointBaseUrl) == null || str.length() == 0) ? false : true;
        this.log.log(TAG, zy60.c("Build signaling transport. wt=", ", prefer_ws=", z, params.getForceWebSocket()));
        if (z) {
            this.endpointParametersBuilder.setEndpointBaseUrl(this.wtEndpointBaseUrl);
            this.endpointParametersBuilder.setEndpointIPs(this.wtIps);
        } else {
            this.endpointParametersBuilder.setEndpointBaseUrl(this.wsEndpointBaseUrl);
            this.endpointParametersBuilder.setEndpointIPs(this.wsIps);
        }
        Long peerId = params.getPeerId();
        if (peerId != null) {
            this.endpointParametersBuilder.setPeerid(Long.valueOf(peerId.longValue()));
        }
        String conversationId = params.getConversationId();
        if (conversationId != null) {
            this.endpointParametersBuilder.setConversationId(conversationId);
        }
        this.endpointParametersBuilder.setRecoverTs(params.getRecoverTs());
        if (z) {
            this.endpointParametersBuilder.setCompression(WTSignaling.Companion.getDefaultCompression());
            builder = new WTSignaling.Builder().setFallbackParams(this.wtToWsFallbackParams);
        } else {
            this.endpointParametersBuilder.setCompression(null);
            builder = new WSSignaling.Builder();
        }
        return builder.setTimeoutMS(this.callParams.getTimeouts().getSignalingMaxRetryTimeout()).setConnectFailureListener(this.connectFailureListener).setSignalingStat((SignalingStat) this.conversationStats.wsSignalingStat).setExecutor(this.executorService).setLog(this.log).setTimeProvider(this.timeProvider).setLogConfiguration(this.logConfiguration).setServerPingTimeoutMs(this.callParams.getTimeouts().getSignalingPingTimeout()).setFastRecoverEnabled(this.callParams.isFastRecoverEnabled()).setEndpointParameters(this.endpointParametersBuilder.build()).setIsReplaceParametersInEndpointEnabled(this.isReplaceParametersInEndpointEnabled.invoke().booleanValue()).setIsSummaryStatsEnabled(this.callParams.getExperiments().Y()).setIsSignalingLogThrottlingEnabled(this.callParams.getExperiments().K()).setUseOfIPEnabled(this.callParams.getExperiments().p()).setSNIEnabled(this.callParams.getExperiments().T()).setPeerIdGenerator(this.peerIdGenerator).setTimeouts(this.timeouts).setSSLProvider(null).build();
    }
}
