package ru.ok.android.externcalls.sdk.p2prelay;

import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.externcalls.sdk.stat.p2prelay.P2PRelayRequestReason;
import ru.ok.android.webrtc.RTCLog;
import xsna.gzs;
import xsna.jr;
import xsna.s3q0;
import xsna.w1j;
import xsna.zcl;

/* compiled from: P2pRelaySwitchTrigger.kt */
/* loaded from: classes9.dex */
public final class P2pRelaySwitchTrigger {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "P2pRelaySwitchTrigger";
    private final ConversationStats conversationStats;
    private final c getConfigDisposable;
    private boolean isActive = true;
    private final RTCLog logger;
    private final gzs<s3q0> onSwitchTrigger;
    private int rttViolationCount;
    private final StatMonitor statMonitor;
    private c statObserveDisposable;

    /* compiled from: P2pRelaySwitchTrigger.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public P2pRelaySwitchTrigger(StatMonitor statMonitor, RTCLog rTCLog, gzs<s3q0> gzsVar, ConversationStats conversationStats, P2PRelaySwitchConfigProvider p2PRelaySwitchConfigProvider) {
        this.statMonitor = statMonitor;
        this.logger = rTCLog;
        this.onSwitchTrigger = gzsVar;
        this.conversationStats = conversationStats;
        this.getConfigDisposable = p2PRelaySwitchConfigProvider.getConfig().k(a.b()).subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger$getConfigDisposable$1
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(P2PRelaySwitchConfig p2PRelaySwitchConfig) {
                P2pRelaySwitchTrigger.this.maybeStartObserveStat(p2PRelaySwitchConfig);
            }
        }, new f() { // from class: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger$getConfigDisposable$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
                RTCLog rTCLog2;
                rTCLog2 = P2pRelaySwitchTrigger.this.logger;
                rTCLog2.reportException("P2pRelaySwitchTrigger", "Error getting p2p relay switch config", th);
            }
        }, new w1j(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getConfigDisposable$lambda$0(P2pRelaySwitchTrigger p2pRelaySwitchTrigger) {
        p2pRelaySwitchTrigger.logger.log(LOG_TAG, "Remote config has not been provided");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStats(NetworkStat networkStat, P2PRelaySwitchConfig p2PRelaySwitchConfig) {
        Long rttMs = p2PRelaySwitchConfig.getRttMs();
        if (rttMs != null) {
            long longValue = rttMs.longValue();
            Integer rttMs2 = networkStat.getRttMs();
            if (rttMs2 != null) {
                int intValue = rttMs2.intValue();
                if (intValue >= longValue) {
                    this.rttViolationCount++;
                } else {
                    this.rttViolationCount = 0;
                }
                if (this.rttViolationCount >= p2PRelaySwitchConfig.getRttViolationCount()) {
                    RTCLog rTCLog = this.logger;
                    int i = this.rttViolationCount;
                    StringBuilder b = jr.b(intValue, "p2p relay switch triggered. actual rtt ", ", threshold ", longValue);
                    b.append(", violations ");
                    b.append(i);
                    rTCLog.log(LOG_TAG, b.toString());
                    this.onSwitchTrigger.invoke();
                    this.conversationStats.p2pRelayRequestedStat.onP2PRelayRequested(new P2PRelayRequestReason("rtt", longValue, p2PRelaySwitchConfig.getRttViolationCount()));
                    release();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeStartObserveStat(final P2PRelaySwitchConfig p2PRelaySwitchConfig) {
        this.logger.log(LOG_TAG, "got remote p2p relay config " + p2PRelaySwitchConfig);
        if (p2PRelaySwitchConfig.getRttMs() == null) {
            release();
            return;
        }
        c cVar = this.statObserveDisposable;
        if (cVar != null) {
            cVar.dispose();
        }
        this.statObserveDisposable = this.statMonitor.observeStat().a0(a.b()).subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger$maybeStartObserveStat$1
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(NetworkStat networkStat) {
                P2pRelaySwitchTrigger.this.handleStats(networkStat, p2PRelaySwitchConfig);
            }
        }, new f() { // from class: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger$maybeStartObserveStat$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
                RTCLog rTCLog;
                rTCLog = P2pRelaySwitchTrigger.this.logger;
                rTCLog.logException("P2pRelaySwitchTrigger", "Error during stat observing", th);
            }
        });
    }

    public final void release() {
        if (this.isActive) {
            this.isActive = false;
            this.logger.log(LOG_TAG, "Releasing");
            this.getConfigDisposable.dispose();
            c cVar = this.statObserveDisposable;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }
}
