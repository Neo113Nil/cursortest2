package ru.ok.android.externcalls.sdk.stat;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.RTCStatsObserver;
import ru.ok.android.webrtc.animoji.stats.AnimojiStat;
import ru.ok.android.webrtc.animoji.util.AnimojiControl;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.camera.CameraStat;
import ru.ok.android.webrtc.stat.camera.CameraStatProvider;
import ru.ok.android.webrtc.stat.cpu.CpuInfo;
import ru.ok.android.webrtc.stat.cpu.HardwareInfoPeriodicRetriever;
import ru.ok.android.webrtc.stat.listener.StatisticsListener;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.rtc.SsrcUtils;
import ru.ok.android.webrtc.topology.CallTopology;
import ru.ok.android.webrtc.topology.server.layout.DisplayLayouts;
import xsna.gzs;
import xsna.hbj0;
import xsna.s3q0;
import xsna.ttp0;

/* compiled from: StatProcessor.kt */
/* loaded from: classes9.dex */
public final class StatProcessor {
    private Conversation conversation;
    private final q<s3q0> observable;
    private RTCStat rtcStat;
    private Ssrc.Pack ssrcSplit;
    private final d<StatPack> statSubject;
    private CallTopology topology;
    private final StatObserver statObserver = new StatObserver(this, new hbj0(this, 4));
    private final HardwareInfoPeriodicRetriever hardwareInfoPeriodicRetriever = new HardwareInfoPeriodicRetriever();

    /* compiled from: StatProcessor.kt */
    public static final class StatObserver extends RTCStatsObserver implements StatisticsListener {
        private final gzs<Conversation> conversationProvider;
        private final StatProcessor processor;

        /* JADX WARN: Multi-variable type inference failed */
        public StatObserver(StatProcessor statProcessor, gzs<? extends Conversation> gzsVar) {
            super(1L);
            this.processor = statProcessor;
            this.conversationProvider = gzsVar;
        }

        @Override // ru.ok.android.webrtc.RTCStatsObserver
        public void onNewStat(RTCStat rTCStat, long j, CallTopology callTopology) {
            this.processor.onRTCStat(rTCStat, callTopology);
        }

        @Override // ru.ok.android.webrtc.stat.listener.StatisticsListener
        public void onStatistics(RTCStat rTCStat) {
            Call underlyingCall;
            CallTopology topology;
            Conversation invoke = this.conversationProvider.invoke();
            if (invoke == null || (underlyingCall = invoke.getUnderlyingCall()) == null || (topology = underlyingCall.getTopology()) == null) {
                return;
            }
            this.processor.onRTCStat(rTCStat, topology);
        }
    }

    public StatProcessor() {
        d<StatPack> N0 = d.N0();
        this.statSubject = N0;
        this.observable = N0.U(new l() { // from class: ru.ok.android.externcalls.sdk.stat.StatProcessor$observable$1
            public final void apply(StatPack statPack) {
            }

            @Override // io.reactivex.rxjava3.functions.l
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                apply((StatPack) obj);
                return s3q0.a;
            }
        });
        emit();
    }

    private final void emit() {
        LinkedHashMap linkedHashMap;
        CameraStatProvider cameraStatProvider;
        AnimojiControl animojiControl;
        NoiseSuppressionManager noiseSuppressionManager;
        DisplayLayouts displayLayouts;
        List<CallDisplayLayoutItem> latestDisplayLayouts;
        d<StatPack> dVar = this.statSubject;
        CallTopology callTopology = this.topology;
        CameraStat cameraStat = null;
        if (callTopology == null || (displayLayouts = callTopology.getDisplayLayouts()) == null || (latestDisplayLayouts = displayLayouts.getLatestDisplayLayouts()) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : latestDisplayLayouts) {
                CallParticipant.ParticipantId participantId = ((CallDisplayLayoutItem) obj).getVideoTrackParticipantKey().getParticipantId();
                Object obj2 = linkedHashMap2.get(participantId);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(participantId, obj2);
                }
                ((List) obj2).add(obj);
            }
            linkedHashMap = linkedHashMap2;
        }
        CallTopology callTopology2 = this.topology;
        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStats = callTopology2 != null ? callTopology2.getScreenshareRecvStats() : null;
        Conversation conversation = this.conversation;
        NoiseSuppressorActiveState nsActiveState = (conversation == null || (noiseSuppressionManager = conversation.getNoiseSuppressionManager()) == null) ? null : noiseSuppressionManager.getNsActiveState();
        Conversation conversation2 = this.conversation;
        AnimojiStat stat = (conversation2 == null || (animojiControl = conversation2.getAnimojiControl()) == null) ? null : animojiControl.getStat();
        Ssrc.Pack pack = this.ssrcSplit;
        RTCStat rTCStat = this.rtcStat;
        CpuInfo cpuInfo = this.hardwareInfoPeriodicRetriever.getCpuInfo();
        Conversation conversation3 = this.conversation;
        if (conversation3 != null && (cameraStatProvider = conversation3.getCameraStatProvider()) != null) {
            cameraStat = cameraStatProvider.getStat();
        }
        dVar.onNext(new StatPack(callTopology, linkedHashMap, screenshareRecvStats, nsActiveState, stat, pack, rTCStat, cpuInfo, cameraStat));
    }

    public static /* synthetic */ Map getStats$default(StatProcessor statProcessor, Set set, ExtractionContext extractionContext, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        return statProcessor.getStats(set, extractionContext, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRTCStat(RTCStat rTCStat, CallTopology callTopology) {
        this.rtcStat = rTCStat;
        this.ssrcSplit = SsrcUtils.split(rTCStat.ssrcs);
        this.topology = callTopology;
        emit();
    }

    private final void start() {
        DebugManager debugManager;
        Conversation conversation = this.conversation;
        if (conversation != null && (debugManager = conversation.getDebugManager()) != null) {
            debugManager.registerStatListener(this.statObserver, 2, TimeUnit.SECONDS);
        }
        HardwareInfoPeriodicRetriever.start$default(this.hardwareInfoPeriodicRetriever, 2000L, 0L, 2, null);
    }

    private final void stop() {
        DebugManager debugManager;
        Conversation conversation = this.conversation;
        if (conversation != null && (debugManager = conversation.getDebugManager()) != null) {
            debugManager.removeStatListener(this.statObserver);
        }
        this.hardwareInfoPeriodicRetriever.stop();
    }

    public final Conversation getConversation() {
        return this.conversation;
    }

    public final q<s3q0> getObservable() {
        return this.observable;
    }

    public final <V> Map<StatKey<V>, StatValue<V>> getStats(Set<? extends StatKey<? extends V>> set, ExtractionContext extractionContext, Map<StatKey<V>, StatValue<V>> map) {
        Map<StatKey<V>, StatValue<V>> map2;
        Conversation conversation = this.conversation;
        if (conversation != null) {
            StatPack P0 = this.statSubject.P0();
            if (P0 == null) {
                map2 = null;
            } else {
                InnerExtractionContext innerExtractionContext = new InnerExtractionContext(conversation, this, ttp0.c(map), extractionContext);
                map.clear();
                Iterator<? extends StatKey<? extends V>> it = set.iterator();
                while (it.hasNext()) {
                    StatProcessorKt.extractOrEmpty(it.next(), P0, innerExtractionContext);
                }
                map2 = map;
            }
            if (map2 != null) {
                return map2;
            }
        }
        for (StatKey<? extends V> statKey : set) {
            map.put(statKey, new StatValue<>(statKey, null));
        }
        return map;
    }

    public final void setConversation(Conversation conversation) {
        if (this.conversation != null) {
            stop();
        }
        this.conversation = conversation;
        if (conversation != null) {
            start();
        }
    }
}
