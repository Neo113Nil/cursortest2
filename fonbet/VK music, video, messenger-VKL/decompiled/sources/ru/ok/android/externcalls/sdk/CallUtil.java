package ru.ok.android.externcalls.sdk;

import java.util.List;
import kotlin.collections.EmptyList;
import one.video.calls.sdk.experiments.c;
import one.video.calls.sdk.experiments.models.PcapLabelConfig;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.qcy;

/* compiled from: CallUtil.kt */
/* loaded from: classes9.dex */
public final class CallUtil {
    public static final CallUtil INSTANCE = new CallUtil();
    public static final RTCLogConfiguration LOG_CONFIGURATION = new RTCLogConfiguration() { // from class: ru.ok.android.externcalls.sdk.CallUtil$LOG_CONFIGURATION$1
    };

    private CallUtil() {
    }

    public static final CallParams.Bitrates createBitrates() {
        return new CallParams.Bitrates(204800, 512000, RtpSenderHelper.VIDEO_BITRATE_MAX, RtpSenderHelper.VIDEO_BITRATE_MAX, 8192, 16384, 32768, 65536, 65536);
    }

    public static final CallParams createCallParams(ConversationBuilder conversationBuilder) {
        CallParams.Bitrates bitrates = conversationBuilder.bitrates;
        if (bitrates == null) {
            bitrates = createBitrates();
        }
        CallParams.Bitrates bitrates2 = bitrates;
        one.video.calls.sdk.experiments.c cVar = conversationBuilder.experiments;
        boolean M = cVar.M();
        int b = cVar.b();
        c.a aVar = cVar.d;
        qcy<Object>[] qcyVarArr = one.video.calls.sdk.experiments.c.j0;
        CallParams.Timeouts timeouts = (CallParams.Timeouts) aVar.a(qcyVarArr[2]);
        one.video.calls.sdk.experiments.b bVar = new one.video.calls.sdk.experiments.b(M, b, timeouts, cVar.F(), cVar.c0(), cVar.z(), cVar.v(), cVar.C(), cVar.r(), cVar.k(), cVar.X(), cVar.m(), cVar.t(), cVar.x(), cVar.j(), cVar.u(), cVar.U(), cVar.R(), cVar.L(), cVar.d0(), cVar.Y(), cVar.K(), cVar.o(), cVar.a(), cVar.e0(), cVar.f(), cVar.S(), cVar.l(), cVar.V(), cVar.w(), cVar.P(), cVar.h(), cVar.E(), cVar.b0(), cVar.p(), cVar.T(), cVar.Z(), cVar.D(), cVar.e(), cVar.f0(), cVar.g(), cVar.G(), cVar.a0(), cVar.H(), cVar.d(), cVar.s(), cVar.y(), cVar.q(), cVar.B(), cVar.Q(), ((Boolean) cVar.a0.a(qcyVarArr[51])).booleanValue(), cVar.N(), cVar.I(), cVar.A(), cVar.n(), cVar.W(), cVar.J(), cVar.O(), cVar.c(), (PcapLabelConfig) cVar.W.a(qcyVarArr[47]));
        CallParams.Timeouts timeouts2 = timeouts == null ? new CallParams.Timeouts(30000, 5, 30000, 20000L, 10000L, 10000L, conversationBuilder.mediaReceivingTimeoutMs, 12000L) : timeouts;
        CallParams.MediaAdaptation mediaAdaptation = new CallParams.MediaAdaptation(new CallParams.MediaAdaptation.Settings(conversationBuilder.isMediaAdaptationFeatureEnabledForP2PCall, conversationBuilder.ptpCallMediaAdaptationConfig), new CallParams.MediaAdaptation.Settings(conversationBuilder.isMediaAdaptationFeatureEnabledForGroupCall, conversationBuilder.groupCallMediaAdaptationConfig));
        boolean z = conversationBuilder.dnsResolverEnabled;
        boolean z2 = conversationBuilder.isConsumerUpdateEnabled;
        boolean z3 = conversationBuilder.isOnDemandTracksEnabled;
        boolean z4 = conversationBuilder.enableLossRttBadConnectionHandling;
        List list = conversationBuilder.additionalWhitelistedCodecPrefixes;
        if (list == null) {
            list = EmptyList.b;
        }
        List list2 = list;
        boolean z5 = conversationBuilder.isDataChannelScreenshareRecvEnabled;
        boolean z6 = conversationBuilder.isDataChannelScreenshareSendEnabled;
        int i = conversationBuilder.videoTracksCount;
        boolean z7 = conversationBuilder.fastRecoverEnabled;
        boolean z8 = conversationBuilder.isWebRTCCodecFilteringEnabled;
        String[] strArr = conversationBuilder.audioCodecs;
        String[] strArr2 = conversationBuilder.videoCodecs;
        boolean z9 = conversationBuilder.showLocalVideoInOriginalQuality;
        boolean z10 = conversationBuilder.isAsrOnlineEnabled;
        boolean z11 = conversationBuilder.isFastScreenCaptureEnabled;
        boolean z12 = conversationBuilder.isDeviceAudioShareEnabled;
        BadNetworkIndicatorConfig badNetworkIndicatorConfig = conversationBuilder.badNetworkIndicatorConfig;
        if (badNetworkIndicatorConfig == null) {
            badNetworkIndicatorConfig = BadNetworkIndicatorConfig.DEFAULT;
        }
        return new CallParams(bitrates2, false, false, timeouts2, 1, z, z2, z3, z4, list2, z5, z6, i, z7, z8, strArr, strArr2, z9, mediaAdaptation, z10, bVar, z11, z12, badNetworkIndicatorConfig, true, conversationBuilder.waitForAdminEnabled);
    }
}
