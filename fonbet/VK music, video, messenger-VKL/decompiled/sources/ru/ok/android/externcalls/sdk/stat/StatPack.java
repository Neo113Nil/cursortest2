package ru.ok.android.externcalls.sdk.stat;

import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.animoji.stats.AnimojiStat;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.camera.CameraStat;
import ru.ok.android.webrtc.stat.cpu.CpuInfo;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.topology.CallTopology;
import xsna.epx;

/* compiled from: StatDefinitions.kt */
/* loaded from: classes9.dex */
public final class StatPack {
    private final AnimojiStat animojiStat;
    private final CameraStat cameraStat;
    private final CpuInfo cpuInfo;
    private final Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> latestLayouts;
    private final NoiseSuppressorActiveState noiseSuppressorState;
    private final RTCStat rtcStat;
    private final Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat;
    private final Ssrc.Pack ssrcSplit;
    private final CallTopology topology;

    /* JADX WARN: Multi-variable type inference failed */
    public StatPack(CallTopology callTopology, Map<CallParticipant.ParticipantId, ? extends List<CallDisplayLayoutItem>> map, Map<CallParticipant.ParticipantId, ? extends ScreenshareRecvStat> map2, NoiseSuppressorActiveState noiseSuppressorActiveState, AnimojiStat animojiStat, Ssrc.Pack pack, RTCStat rTCStat, CpuInfo cpuInfo, CameraStat cameraStat) {
        this.topology = callTopology;
        this.latestLayouts = map;
        this.screenshareRecvStat = map2;
        this.noiseSuppressorState = noiseSuppressorActiveState;
        this.animojiStat = animojiStat;
        this.ssrcSplit = pack;
        this.rtcStat = rTCStat;
        this.cpuInfo = cpuInfo;
        this.cameraStat = cameraStat;
    }

    public static /* synthetic */ StatPack copy$default(StatPack statPack, CallTopology callTopology, Map map, Map map2, NoiseSuppressorActiveState noiseSuppressorActiveState, AnimojiStat animojiStat, Ssrc.Pack pack, RTCStat rTCStat, CpuInfo cpuInfo, CameraStat cameraStat, int i, Object obj) {
        if ((i & 1) != 0) {
            callTopology = statPack.topology;
        }
        if ((i & 2) != 0) {
            map = statPack.latestLayouts;
        }
        if ((i & 4) != 0) {
            map2 = statPack.screenshareRecvStat;
        }
        if ((i & 8) != 0) {
            noiseSuppressorActiveState = statPack.noiseSuppressorState;
        }
        if ((i & 16) != 0) {
            animojiStat = statPack.animojiStat;
        }
        if ((i & 32) != 0) {
            pack = statPack.ssrcSplit;
        }
        if ((i & 64) != 0) {
            rTCStat = statPack.rtcStat;
        }
        if ((i & 128) != 0) {
            cpuInfo = statPack.cpuInfo;
        }
        if ((i & 256) != 0) {
            cameraStat = statPack.cameraStat;
        }
        CpuInfo cpuInfo2 = cpuInfo;
        CameraStat cameraStat2 = cameraStat;
        Ssrc.Pack pack2 = pack;
        RTCStat rTCStat2 = rTCStat;
        AnimojiStat animojiStat2 = animojiStat;
        Map map3 = map2;
        return statPack.copy(callTopology, map, map3, noiseSuppressorActiveState, animojiStat2, pack2, rTCStat2, cpuInfo2, cameraStat2);
    }

    public final CallTopology component1() {
        return this.topology;
    }

    public final Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> component2() {
        return this.latestLayouts;
    }

    public final Map<CallParticipant.ParticipantId, ScreenshareRecvStat> component3() {
        return this.screenshareRecvStat;
    }

    public final NoiseSuppressorActiveState component4() {
        return this.noiseSuppressorState;
    }

    public final AnimojiStat component5() {
        return this.animojiStat;
    }

    public final Ssrc.Pack component6() {
        return this.ssrcSplit;
    }

    public final RTCStat component7() {
        return this.rtcStat;
    }

    public final CpuInfo component8() {
        return this.cpuInfo;
    }

    public final CameraStat component9() {
        return this.cameraStat;
    }

    public final StatPack copy(CallTopology callTopology, Map<CallParticipant.ParticipantId, ? extends List<CallDisplayLayoutItem>> map, Map<CallParticipant.ParticipantId, ? extends ScreenshareRecvStat> map2, NoiseSuppressorActiveState noiseSuppressorActiveState, AnimojiStat animojiStat, Ssrc.Pack pack, RTCStat rTCStat, CpuInfo cpuInfo, CameraStat cameraStat) {
        return new StatPack(callTopology, map, map2, noiseSuppressorActiveState, animojiStat, pack, rTCStat, cpuInfo, cameraStat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatPack)) {
            return false;
        }
        StatPack statPack = (StatPack) obj;
        return epx.f(this.topology, statPack.topology) && epx.f(this.latestLayouts, statPack.latestLayouts) && epx.f(this.screenshareRecvStat, statPack.screenshareRecvStat) && epx.f(this.noiseSuppressorState, statPack.noiseSuppressorState) && epx.f(this.animojiStat, statPack.animojiStat) && epx.f(this.ssrcSplit, statPack.ssrcSplit) && epx.f(this.rtcStat, statPack.rtcStat) && epx.f(this.cpuInfo, statPack.cpuInfo) && epx.f(this.cameraStat, statPack.cameraStat);
    }

    public final AnimojiStat getAnimojiStat() {
        return this.animojiStat;
    }

    public final CameraStat getCameraStat() {
        return this.cameraStat;
    }

    public final CpuInfo getCpuInfo() {
        return this.cpuInfo;
    }

    public final Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> getLatestLayouts() {
        return this.latestLayouts;
    }

    public final NoiseSuppressorActiveState getNoiseSuppressorState() {
        return this.noiseSuppressorState;
    }

    public final RTCStat getRtcStat() {
        return this.rtcStat;
    }

    public final Map<CallParticipant.ParticipantId, ScreenshareRecvStat> getScreenshareRecvStat() {
        return this.screenshareRecvStat;
    }

    public final Ssrc.Pack getSsrcSplit() {
        return this.ssrcSplit;
    }

    public final CallTopology getTopology() {
        return this.topology;
    }

    public int hashCode() {
        CallTopology callTopology = this.topology;
        int hashCode = (callTopology == null ? 0 : callTopology.hashCode()) * 31;
        Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> map = this.latestLayouts;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> map2 = this.screenshareRecvStat;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        NoiseSuppressorActiveState noiseSuppressorActiveState = this.noiseSuppressorState;
        int hashCode4 = (hashCode3 + (noiseSuppressorActiveState == null ? 0 : noiseSuppressorActiveState.hashCode())) * 31;
        AnimojiStat animojiStat = this.animojiStat;
        int hashCode5 = (hashCode4 + (animojiStat == null ? 0 : animojiStat.hashCode())) * 31;
        Ssrc.Pack pack = this.ssrcSplit;
        int hashCode6 = (hashCode5 + (pack == null ? 0 : pack.hashCode())) * 31;
        RTCStat rTCStat = this.rtcStat;
        int hashCode7 = (hashCode6 + (rTCStat == null ? 0 : rTCStat.hashCode())) * 31;
        CpuInfo cpuInfo = this.cpuInfo;
        int hashCode8 = (hashCode7 + (cpuInfo == null ? 0 : cpuInfo.hashCode())) * 31;
        CameraStat cameraStat = this.cameraStat;
        return hashCode8 + (cameraStat != null ? cameraStat.hashCode() : 0);
    }

    public String toString() {
        return "StatPack(topology=" + this.topology + ", latestLayouts=" + this.latestLayouts + ", screenshareRecvStat=" + this.screenshareRecvStat + ", noiseSuppressorState=" + this.noiseSuppressorState + ", animojiStat=" + this.animojiStat + ", ssrcSplit=" + this.ssrcSplit + ", rtcStat=" + this.rtcStat + ", cpuInfo=" + this.cpuInfo + ", cameraStat=" + this.cameraStat + ")";
    }
}
