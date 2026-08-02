package ru.ok.android.webrtc;

import java.util.Set;
import ru.ok.android.webrtc.connection.BadConnectionCallback;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.command.SignalingCommand;

/* loaded from: classes9.dex */
public final class m implements BadConnectionCallback {
    public boolean a = false;
    public final /* synthetic */ Call b;

    public m(Call call) {
        this.b = call;
    }

    @Override // ru.ok.android.webrtc.connection.BadConnectionCallback
    public final void onBadConnectionCauseSetChanged(Set set) {
        CallParticipant.ParticipantId opponentIdSafe;
        boolean dcReportNetworkStatEnabled = this.b.params.getBadNetworkIndicatorConfig().getSignalingConfig().getDcReportNetworkStatEnabled();
        Call call = this.b;
        if (call.r || !call.g0.is(Topology.DIRECT) || dcReportNetworkStatEnabled || (opponentIdSafe = this.b.getOpponentIdSafe()) == null) {
            return;
        }
        if (!this.a && (set.contains(BadConnectionCallback.Cause.LOCAL_RTT) || set.contains(BadConnectionCallback.Cause.LOCAL_LOSS))) {
            this.a = true;
            this.b.k.send(BadConnectionSignaling.createBadNetMessage(true, opponentIdSafe));
        } else {
            if (!this.a || set.contains(BadConnectionCallback.Cause.LOCAL_RTT) || set.contains(BadConnectionCallback.Cause.LOCAL_LOSS)) {
                return;
            }
            this.a = false;
            this.b.k.send(BadConnectionSignaling.createBadNetMessage(false, opponentIdSafe));
        }
    }

    @Override // ru.ok.android.webrtc.connection.BadConnectionCallback
    public final void onConnectionStats(double d, double d2, double d3, long j) {
        BadNetworkIndicatorConfig badNetworkIndicatorConfig = this.b.params.getBadNetworkIndicatorConfig();
        boolean dcReportNetworkStatEnabled = badNetworkIndicatorConfig.getSignalingConfig().getDcReportNetworkStatEnabled();
        BadNetworkIndicatorConfig.DebugLoggingConfig debugLoggingConfig = badNetworkIndicatorConfig.getDebugLoggingConfig();
        if (dcReportNetworkStatEnabled) {
            Call call = this.b;
            if (!call.r) {
                if (call.g0.is(Topology.DIRECT)) {
                    CallParticipant.ParticipantId opponentIdSafe = this.b.getOpponentIdSafe();
                    if (opponentIdSafe != null) {
                        SignalingCommand createBadNetMessage = BadConnectionSignaling.createBadNetMessage(opponentIdSafe, d, d2, d3);
                        debugLoggingConfig.log(this.b.logger, "OKRTCCall", "send bad-net message with bitrate: " + createBadNetMessage);
                        this.b.k.send(createBadNetMessage);
                        return;
                    }
                    return;
                }
                if (this.b.g0.is(Topology.SERVER) && !Double.isNaN(d3)) {
                    debugLoggingConfig.log(this.b.logger, "OKRTCCall", "send report-network-stat...");
                    this.b.g0.reportNetworkStat(j, (long) d3);
                    return;
                }
                debugLoggingConfig.logV(this.b.logger, "OKRTCCall", "no messages on Call::onConnectionsStats: topology: " + this.b.g0.getIdentity() + ", bitrate: " + d3);
                return;
            }
        }
        debugLoggingConfig.log(this.b.logger, "OKRTCCall", "ignore Call::onConnectionStats: newBadNetVersion && !destroy = " + dcReportNetworkStatEnabled + " && !" + this.b.r);
    }

    @Override // ru.ok.android.webrtc.connection.BadConnectionCallback
    public final void onBadConnection() {
    }

    @Override // ru.ok.android.webrtc.connection.BadConnectionCallback
    public final void onGoodConnection() {
    }
}
