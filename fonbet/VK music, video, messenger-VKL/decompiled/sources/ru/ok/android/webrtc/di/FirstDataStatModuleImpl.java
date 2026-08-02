package ru.ok.android.webrtc.di;

import okcalls.n0;
import okcalls.o0;
import okcalls.p0;
import okcalls.q0;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.data.FirstDataStat;
import ru.ok.android.webrtc.stat.data.FirstDataStatCallParticipantsListener;
import ru.ok.android.webrtc.stat.data.FirstDataStatProxy;
import ru.ok.android.webrtc.stat.data.IncomingP2PFirstDataStat;
import ru.ok.android.webrtc.stat.data.JoinP2PFirstDataStat;
import ru.ok.android.webrtc.stat.data.OutgoingP2PFirstDataStat;
import ru.ok.android.webrtc.stat.data.ServerTopologyFirstDataStat;
import ru.ok.android.webrtc.stat.listener.mapper.WebRTCToInternalStatsMapper;
import ru.ok.android.webrtc.utils.TopologyProvider;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.e43;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class FirstDataStatModuleImpl implements FirstDataStatModule {
    public final TopologyProvider a;
    public final FirstDataStatProxy b;
    public final FirstDataStatCallParticipantsListener c;

    public FirstDataStatModuleImpl(CallEventualStatSender callEventualStatSender, WebRTCToInternalStatsMapper webRTCToInternalStatsMapper, TimeProvider timeProvider, boolean z, boolean z2, gzs<CallParticipant.ParticipantId> gzsVar, TopologyProvider topologyProvider, gzs<Integer> gzsVar2, RTCLog rTCLog) {
        this.a = topologyProvider;
        this.b = new FirstDataStatProxy(e43.l(new ServerTopologyFirstDataStat(z, gzsVar2, new q0(0, this, FirstDataStatModuleImpl.class, "isServerTopology", "isServerTopology()Z", 0), timeProvider, callEventualStatSender, rTCLog), new IncomingP2PFirstDataStat(new n0(0, this, FirstDataStatModuleImpl.class, "isServerTopology", "isServerTopology()Z", 0), z, z2, timeProvider, callEventualStatSender, rTCLog), new OutgoingP2PFirstDataStat(new p0(0, this, FirstDataStatModuleImpl.class, "isServerTopology", "isServerTopology()Z", 0), z, z2, timeProvider, callEventualStatSender, rTCLog), new JoinP2PFirstDataStat(new o0(0, this, FirstDataStatModuleImpl.class, "isServerTopology", "isServerTopology()Z", 0), z, z2, timeProvider, callEventualStatSender, rTCLog)));
        this.c = new FirstDataStatCallParticipantsListener(gzsVar, getFirstDataStat());
    }

    public static final boolean access$isServerTopology(FirstDataStatModuleImpl firstDataStatModuleImpl) {
        return firstDataStatModuleImpl.a.getIdentity() == Topology.SERVER;
    }

    @Override // ru.ok.android.webrtc.di.FirstDataStatModule
    public FirstDataStat getFirstDataStat() {
        return this.b;
    }

    @Override // ru.ok.android.webrtc.di.FirstDataStatModule
    public FirstDataStatCallParticipantsListener getFirstDataStatCallParticipantsListener() {
        return this.c;
    }
}
