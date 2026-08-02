package ru.ok.android.externcalls.sdk.stat;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.stat.accept.AcceptCallStat;
import ru.ok.android.externcalls.sdk.stat.audio.AudioErrorStat;
import ru.ok.android.externcalls.sdk.stat.candidate.IceCandidateAddFailedStat;
import ru.ok.android.externcalls.sdk.stat.candidate.IceCandidateGatheringFailedStat;
import ru.ok.android.externcalls.sdk.stat.candidate.IceCandidatePairChangedStat;
import ru.ok.android.externcalls.sdk.stat.connect.ConversationConnectedToSignalingStat;
import ru.ok.android.externcalls.sdk.stat.connection.PeerConnectionChangedStat;
import ru.ok.android.externcalls.sdk.stat.finish.CallFinishStat;
import ru.ok.android.externcalls.sdk.stat.icerestart.IceRestartStat;
import ru.ok.android.externcalls.sdk.stat.init.CallInitStat;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.android.externcalls.sdk.stat.p2prelay.P2PRelayRequestedStat;
import ru.ok.android.externcalls.sdk.stat.signaling.SignalingTransportStat;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;
import ru.ok.android.externcalls.sdk.stat.topology.ServerTopologyRequestedStat;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;
import ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;
import xsna.lhx0;

/* compiled from: ConversationStats.kt */
/* loaded from: classes9.dex */
public final class ConversationStats {
    public final AcceptCallStat acceptCallStat;
    public final AudioErrorStat audioErrorStat;
    public final CallFinishStat callFinish;
    public final CallInitStat callInitStat;
    public final ConversationConnectedToSignalingStat connectedToSignalingStat;
    public final IceCandidateGatheringFailedStat iceCandidateGatheringFailedStat;
    public final IceCandidatePairChangedStat iceCandidatePairChangedStat;
    public final IceRestartStat iceRestartStat;
    public final MLDownloadStat mlDownloadStat;
    public final NegotiationErrorStat negotiationErrorStat;
    public final P2PRelayRequestedStat p2pRelayRequestedStat;
    public final PeerConnectionChangedStat peerConnectionStateChangedStat;
    public final ConversationPreparedStat preparedStat;
    public final ServerTopologyRequestedStat serverTopologyRequestedStat;
    public final ConversationStartedStat startedStat;
    public final IceCandidateAddFailedStat uceCandidateAddFailedStat;
    public final ConversationWebRTCStat webrtcStats;
    public final SignalingTransportStat wsSignalingStat;

    public ConversationStats(gzs<? extends CallEventualStatSender> gzsVar, lhx0 lhx0Var, Conversation.CallType callType, TimeProvider timeProvider, RTCLog rTCLog, boolean z, boolean z2) {
        this.connectedToSignalingStat = new ConversationConnectedToSignalingStat(timeProvider, gzsVar);
        this.preparedStat = new ConversationPreparedStat(timeProvider, gzsVar);
        this.startedStat = new ConversationStartedStat(callType, timeProvider, gzsVar);
        this.wsSignalingStat = new SignalingTransportStat(gzsVar, timeProvider, rTCLog, z2);
        this.callFinish = new CallFinishStat(gzsVar);
        this.callInitStat = new CallInitStat(callType, z, gzsVar);
        this.iceCandidatePairChangedStat = new IceCandidatePairChangedStat(gzsVar);
        this.iceRestartStat = new IceRestartStat(gzsVar);
        this.serverTopologyRequestedStat = new ServerTopologyRequestedStat(gzsVar, timeProvider);
        this.peerConnectionStateChangedStat = new PeerConnectionChangedStat(gzsVar);
        this.negotiationErrorStat = new NegotiationErrorStat(gzsVar);
        this.mlDownloadStat = new MLDownloadStat(gzsVar);
        this.p2pRelayRequestedStat = new P2PRelayRequestedStat(gzsVar);
        this.acceptCallStat = new AcceptCallStat(gzsVar);
        this.audioErrorStat = new AudioErrorStat(gzsVar);
        this.iceCandidateGatheringFailedStat = new IceCandidateGatheringFailedStat(gzsVar);
        this.uceCandidateAddFailedStat = new IceCandidateAddFailedStat(gzsVar);
        this.webrtcStats = new ConversationWebRTCStat(lhx0Var, rTCLog, timeProvider, gzsVar);
    }

    public final void release() {
        this.webrtcStats.release();
    }
}
