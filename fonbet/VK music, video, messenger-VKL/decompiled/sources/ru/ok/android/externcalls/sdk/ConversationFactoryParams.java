package ru.ok.android.externcalls.sdk;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptationConfig;
import ru.ok.android.webrtc.rotation.RotationProvider;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import xsna.d0y;
import xsna.gzs;
import xsna.pz;
import xsna.s3q0;
import xsna.wyg0;

/* loaded from: classes9.dex */
public class ConversationFactoryParams {
    StartConversationDelegate confroomStartConversationDelegate;
    private boolean dnsResolverEnabled;
    private MediaAdaptationConfig groupCallMediaAdaptationConfig;
    d0y joinConversationDelegate;
    private MediaAdaptationConfig p2pCallMediaAdaptationConfig;
    StartConversationDelegate p2pStartConversationDelegate;
    private ScreenCapturePermissionProvider screenCapturePermissionProvider;
    private wyg0 sslProvider;
    private boolean forceRelayPolicy = false;
    private int audioLevelFrequencyMs = 250;
    private RotationProvider rotationProvider = RotationProvider.DISABLED;
    private String appVersion = "sdk-0.2.3";
    private boolean isWebRTCCodecFilteringEnabled = false;
    private String[] audioCodecs = null;
    private String[] videoCodecs = null;
    private boolean multipleDevicesEnabled = false;
    private boolean showLocalVideoInOriginalQuality = false;
    private boolean isFastScreenCaptureEnabled = false;
    private boolean isDeviceAudioShareEnabled = false;
    private boolean isAsrOnlineEnabled = false;

    @Deprecated
    private boolean isSignalingDefaultValuesFilteringEnabled = true;

    @Deprecated
    private boolean isWaitingRoomActivated = true;

    @Deprecated
    private boolean isSessionRoomsFeatureEnabled = true;
    private boolean isMediaAdaptationFeatureEnabledForP2PCall = true;
    private boolean isMediaAdaptationFeatureEnabledForGroupCall = true;
    private boolean isConsumerUpdateEnabled = true;
    private boolean onDemandTracksEnabled = true;
    private boolean dataChannelScreenshareRecvEnabled = true;
    private boolean dataChannelScreenshareSendEnabled = true;
    private int videoTracksCount = 10;
    private boolean fastRecoverEnabled = true;
    private long mediaReceivingTimeoutMs = 10000;
    private MediaConnectionSettings mediaConnectionSettings = new MediaConnectionSettings();
    private RttRateHintConfig rttRateHintConfig = new RttRateHintConfig();

    @Deprecated
    private boolean isAudienceModeEnabled = false;
    private boolean enableLossRttBadConnectionHandling = false;
    private CallParams.Bitrates bitrates = CallUtil.createBitrates();
    private List<String> additionalWhitelistedCodecPrefixes = Collections.EMPTY_LIST;
    private BadNetworkIndicatorConfig badNetworkIndicatorConfig = BadNetworkIndicatorConfig.DEFAULT;
    private boolean logExperimentChanges = false;
    protected RTCLog log = RTCLog.NoOp.INSTANCE;
    protected final one.video.calls.sdk.experiments.c experiments = new one.video.calls.sdk.experiments.c(new pz(this, 24));
    private ClientCapabilities clientCapabilities = null;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ s3q0 lambda$new$0(gzs gzsVar) {
        if (this.logExperimentChanges) {
            this.log.log("CallsSDKExp", (String) gzsVar.invoke());
        }
        return s3q0.a;
    }

    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    public ConversationBuilder getBaseBuilder(IdMappingWrapper idMappingWrapper) {
        ClientCapabilities clientCapabilities = this.clientCapabilities;
        if (clientCapabilities == null) {
            clientCapabilities = ClientCapabilities.getDefault().set(ClientCapabilities.Capability.WAITING_HALL, this.isWaitingRoomActivated).set(ClientCapabilities.Capability.SESSION_ROOMS, this.isSessionRoomsFeatureEnabled).set(ClientCapabilities.Capability.FILTER_DEFAULTS, this.isSignalingDefaultValuesFilteringEnabled).set(ClientCapabilities.Capability.AUDIENCE_MODE, this.isAudienceModeEnabled);
        }
        return new ConversationBuilder(idMappingWrapper, this.experiments).setClientCapabilities(clientCapabilities).setVersion(this.appVersion).setDnsResolverEnabled(this.dnsResolverEnabled).setConsumerUpdateEnabled(this.isConsumerUpdateEnabled).setOnDemandTracksEnabled(this.onDemandTracksEnabled).setAdditionalWhitelistedCodecPrefixes(this.additionalWhitelistedCodecPrefixes).setBitrates(this.bitrates).setEnableLossRttBadConnectionHandling(this.enableLossRttBadConnectionHandling).setDataChannelScreenshareRecvEnabled(this.dataChannelScreenshareRecvEnabled).setDataChannelScreenshareSendEnabled(this.dataChannelScreenshareSendEnabled).setVideoTracksCount(this.videoTracksCount).setFastRecoverEnabled(this.fastRecoverEnabled).setMediaReceivingTimeoutMs(this.mediaReceivingTimeoutMs).setForceRelayPolicy(this.forceRelayPolicy).setAudioLevelFrequencyMs(this.audioLevelFrequencyMs).setWebRTCCodecFilteringEnabled(this.isWebRTCCodecFilteringEnabled).setWebRTCAudioCodecs(this.audioCodecs).setWebRTCVideoCodecs(this.videoCodecs).setMultipleDevicesEnabled(this.multipleDevicesEnabled).setRotationProvider(this.rotationProvider).setRotationProvider(this.rotationProvider).showLocalVideoInOriginalQuality(this.showLocalVideoInOriginalQuality).setAsrOnlineEnabled(this.isAsrOnlineEnabled).setFastScreenCaptureEnabled(this.isFastScreenCaptureEnabled).setDeviceAudioShareEnabled(this.isDeviceAudioShareEnabled).setMediaAdaptationFeatureEnabledForP2PCall(this.isMediaAdaptationFeatureEnabledForP2PCall).setP2PCallMediaAdaptationConfig(this.p2pCallMediaAdaptationConfig).setMediaAdaptationFeatureEnabledForGroupCall(this.isMediaAdaptationFeatureEnabledForGroupCall).setGroupCallMediaAdaptationConfig(this.groupCallMediaAdaptationConfig).setMediaConnectionSettings(this.mediaConnectionSettings).setRttRateHintConfig(this.rttRateHintConfig).setBadNetworkIndicatorConfig(this.badNetworkIndicatorConfig).setScreenCapturePermissionProvider(this.screenCapturePermissionProvider).setSSLProvider(null);
    }

    public boolean isDnsResolverEnabled() {
        return this.dnsResolverEnabled;
    }

    public void setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
    }

    @Deprecated(forRemoval = true, since = "0.1.4")
    public void setAudienceModeEnabled(boolean z) {
        this.isAudienceModeEnabled = z;
    }

    public void setAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
    }

    public void setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
    }

    public void setBadNetworkIndicatorConfig(BadNetworkIndicatorConfig badNetworkIndicatorConfig) {
        if (badNetworkIndicatorConfig == null) {
            badNetworkIndicatorConfig = BadNetworkIndicatorConfig.DEFAULT;
        }
        this.badNetworkIndicatorConfig = badNetworkIndicatorConfig;
    }

    public void setBitrates(CallParams.Bitrates bitrates) {
        this.bitrates = bitrates;
    }

    public void setClientCapabilities(ClientCapabilities clientCapabilities) {
        if (clientCapabilities == null) {
            clientCapabilities = ClientCapabilities.getDefault();
        }
        this.clientCapabilities = clientCapabilities;
    }

    public void setConfroomStartConversationDelegate(StartConversationDelegate startConversationDelegate) {
        this.confroomStartConversationDelegate = startConversationDelegate;
    }

    public void setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
    }

    public void setDataChannelScreenshareRecvEnabled(boolean z) {
        this.dataChannelScreenshareRecvEnabled = z;
    }

    public void setDataChannelScreenshareSendEnabled(boolean z) {
        this.dataChannelScreenshareSendEnabled = z;
    }

    public void setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
    }

    public void setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
    }

    public void setEnabledDnsResolver(boolean z) {
        this.dnsResolverEnabled = z;
    }

    public void setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
    }

    public void setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
    }

    public void setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
    }

    public void setGroupCallMediaAdaptationConfig(MediaAdaptationConfig mediaAdaptationConfig) {
        this.groupCallMediaAdaptationConfig = mediaAdaptationConfig;
    }

    public void setIsMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
    }

    public void setIsMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
    }

    @Deprecated(forRemoval = true, since = "0.1.4")
    public void setIsWaitingRoomActivated(boolean z) {
        this.isWaitingRoomActivated = z;
    }

    public void setLogExperimentChanges(boolean z) {
        this.logExperimentChanges = z;
    }

    public void setMediaConnectionSettings(@NonNull MediaConnectionSettings mediaConnectionSettings) {
        this.mediaConnectionSettings = mediaConnectionSettings;
    }

    public void setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
    }

    public void setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
    }

    public void setOnDemandTracksEnabled(boolean z) {
        this.onDemandTracksEnabled = z;
    }

    public void setP2PCallMediaAdaptationConfig(MediaAdaptationConfig mediaAdaptationConfig) {
        this.p2pCallMediaAdaptationConfig = mediaAdaptationConfig;
    }

    public void setP2pStartConversationDelegate(StartConversationDelegate startConversationDelegate) {
        this.p2pStartConversationDelegate = startConversationDelegate;
    }

    public void setRotationProvider(RotationProvider rotationProvider) {
        this.rotationProvider = rotationProvider;
    }

    public void setRttRateHintConfig(@NonNull RttRateHintConfig rttRateHintConfig) {
        this.rttRateHintConfig = rttRateHintConfig;
    }

    public void setScreenCapturePermissionProvider(ScreenCapturePermissionProvider screenCapturePermissionProvider) {
        this.screenCapturePermissionProvider = screenCapturePermissionProvider;
    }

    @Deprecated(forRemoval = true, since = "0.1.4")
    public void setSessionRoomsEnabled(boolean z) {
        this.isSessionRoomsFeatureEnabled = z;
    }

    public void setShowLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
    }

    @Deprecated(forRemoval = true, since = "0.1.4")
    public void setSignalingDefaultValuesFilteringEnabled(boolean z) {
        this.isSignalingDefaultValuesFilteringEnabled = z;
    }

    public void setVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
    }

    public void setVideoTracksCount(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Video tracks count must be positive");
        }
        this.videoTracksCount = i;
    }

    public void setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
    }

    public void setJoinConversationDelegate(d0y d0yVar) {
    }

    public void setSslProvider(wyg0 wyg0Var) {
    }
}
