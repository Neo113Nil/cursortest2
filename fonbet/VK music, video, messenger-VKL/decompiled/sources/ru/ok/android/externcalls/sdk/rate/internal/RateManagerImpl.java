package ru.ok.android.externcalls.sdk.rate.internal;

import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.RateManagerConfig;
import ru.ok.android.externcalls.sdk.rate.RateManagerConfigProvider;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.Topology;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.gzs;
import xsna.rg60;
import xsna.zcl;

/* compiled from: RateManagerImpl.kt */
/* loaded from: classes9.dex */
public final class RateManagerImpl implements RateManager {
    public static final Companion Companion = new Companion(null);
    public static final String LOG_TAG = "RateManager";
    private final List<RateHint> _rateHints;
    private final gzs<Topology> currentTopology;
    private CandidateTypeHintTrigger directCandidateTypeTrigger;
    private final c initDisposable;
    private final RTCLog log;
    private LossHintTrigger lossTrigger;
    private c observeDisposable;
    private final List<RateHint> rateHints;
    private RttRateHintTrigger rttTrigger;
    private CandidateTypeHintTrigger serverCandidateTypeTrigger;
    private final StatMonitor statMonitor;

    /* compiled from: RateManagerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RateManagerImpl(RTCLog rTCLog, RateManagerConfigProvider rateManagerConfigProvider, gzs<? extends Topology> gzsVar, StatMonitor statMonitor) {
        this.log = rTCLog;
        this.currentTopology = gzsVar;
        this.statMonitor = statMonitor;
        ArrayList arrayList = new ArrayList();
        this._rateHints = arrayList;
        this.rateHints = arrayList;
        this.initDisposable = rateManagerConfigProvider.getConfig().k(a.b()).subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.1
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(RateManagerConfig rateManagerConfig) {
                RateManagerImpl.this.onConfigReceived(rateManagerConfig);
            }
        }, new f() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
                RateManagerImpl.this.log.reportException("RateManager", "Can't get rate manager config", th);
            }
        }, new rg60(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RateManagerImpl rateManagerImpl) {
        rateManagerImpl.log.log("RateManager", "Remote config has not been provided");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addRateHint(RateHint rateHint) {
        this._rateHints.add(rateHint);
        this.log.log("RateManager", "addRateHint " + rateHint);
    }

    private final c observeStats() {
        return this.statMonitor.observeStat().a0(a.b()).subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$observeStats$1

            /* compiled from: RateManagerImpl.kt */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Topology.values().length];
                    try {
                        iArr[Topology.DIRECT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Topology.SERVER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Topology.DUMMY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(NetworkStat networkStat) {
                RttRateHintTrigger rttRateHintTrigger;
                LossHintTrigger lossHintTrigger;
                gzs gzsVar;
                CandidateTypeHintTrigger candidateTypeHintTrigger;
                CandidateTypeHintTrigger candidateTypeHintTrigger2;
                rttRateHintTrigger = RateManagerImpl.this.rttTrigger;
                if (rttRateHintTrigger != null) {
                    rttRateHintTrigger.onNetworkStat(networkStat);
                }
                lossHintTrigger = RateManagerImpl.this.lossTrigger;
                if (lossHintTrigger != null) {
                    lossHintTrigger.onNetworkStat(networkStat);
                }
                gzsVar = RateManagerImpl.this.currentTopology;
                int i = WhenMappings.$EnumSwitchMapping$0[((Topology) gzsVar.invoke()).ordinal()];
                if (i == 1) {
                    candidateTypeHintTrigger = RateManagerImpl.this.directCandidateTypeTrigger;
                    if (candidateTypeHintTrigger != null) {
                        candidateTypeHintTrigger.onNetworkStat(networkStat);
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    candidateTypeHintTrigger2 = RateManagerImpl.this.serverCandidateTypeTrigger;
                    if (candidateTypeHintTrigger2 != null) {
                        candidateTypeHintTrigger2.onNetworkStat(networkStat);
                    }
                }
            }
        }, new f() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$observeStats$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
                RateManagerImpl.this.log.reportException("RateManager", "Can't get rate manager config", th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfigReceived(RateManagerConfig rateManagerConfig) {
        if (rateManagerConfig.getRttRateHintConfig().isNotEmpty()) {
            this.rttTrigger = new RttRateHintTrigger(this.log, rateManagerConfig.getRttRateHintConfig(), new RateManagerImpl$onConfigReceived$1(this));
        }
        if (rateManagerConfig.getLossHintConfig().isNotEmpty()) {
            this.lossTrigger = new LossHintTrigger(this.log, rateManagerConfig.getLossHintConfig(), new RateManagerImpl$onConfigReceived$2(this));
        }
        if (rateManagerConfig.getDirectCandidateTypeHintConfig().isNotEmpty()) {
            this.directCandidateTypeTrigger = new CandidateTypeHintTrigger(this.log, rateManagerConfig.getDirectCandidateTypeHintConfig(), new RateManagerImpl$onConfigReceived$3(this), "");
        }
        if (rateManagerConfig.getServerCandidateTypeHintConfig().isNotEmpty()) {
            this.serverCandidateTypeTrigger = new CandidateTypeHintTrigger(this.log, rateManagerConfig.getServerCandidateTypeHintConfig(), new RateManagerImpl$onConfigReceived$4(this), UcumUtils.UCUM_SECONDS);
        }
        this.observeDisposable = observeStats();
    }

    @Override // ru.ok.android.externcalls.sdk.rate.RateManager
    public List<RateHint> getRateHints() {
        return this.rateHints;
    }

    public final void logHints() {
        this.log.log("RateManager", "rateHints = " + getRateHints() + ", shouldRateConversation=" + getShouldRateConversation());
    }

    public final void release() {
        this.initDisposable.dispose();
        c cVar = this.observeDisposable;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
