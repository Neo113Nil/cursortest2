package ru.ok.android.webrtc.stat.listener;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.observable.o0;
import io.reactivex.rxjava3.internal.operators.single.b;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.webrtc.StatsReport;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCStatsObserver;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.listener.StatListenerManager;
import ru.ok.android.webrtc.topology.ExtendedStatsCallback;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.topology.StatsObserver;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.cc3;
import xsna.epx;
import xsna.ii4;
import xsna.izs;
import xsna.q9y0;
import xsna.s3q0;
import xsna.vvi0;
import xsna.yjz0;

/* loaded from: classes9.dex */
public final class StatListenerManager {
    public final RTCLog a;
    public final izs b;
    public final izs c;
    public final ExtendedStatsObserver d;
    public final TimeProvider e;
    public final boolean f;
    public c j;
    public boolean k;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final LinkedHashSet h = new LinkedHashSet();
    public final HashMap i = new HashMap();
    public final StatListenerManager$statsReportRunnable$1 l = new StatListenerManager$statsReportRunnable$1(this);

    public interface ExtendedStatsObserver {
        void handleStatReports(ExtendedStatsCallback.ExtendedStats extendedStats);

        void handleStatReports(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, StatsObserver.MediaTrackMapping[] mediaTrackMappingArr, Map<CallParticipant.ParticipantId, ScreenshareRecvStat> map, Topology topology);
    }

    public StatListenerManager(RTCLog rTCLog, izs<? super StatsObserver, s3q0> izsVar, izs<? super StatsCallback, s3q0> izsVar2, ExtendedStatsObserver extendedStatsObserver, TimeProvider timeProvider, boolean z) {
        this.a = rTCLog;
        this.b = izsVar;
        this.c = izsVar2;
        this.d = extendedStatsObserver;
        this.e = timeProvider;
        this.f = z;
    }

    public static final void a(StatListenerManager statListenerManager, RTCStatsObserver rTCStatsObserver) {
        statListenerManager.registerRTCStatsObserver(rTCStatsObserver);
    }

    public static final void access$notifyStatisticsListeners(StatListenerManager statListenerManager, ExtendedStatsCallback.ExtendedStats extendedStats) {
        if (statListenerManager.f) {
            statListenerManager.d.handleStatReports(extendedStats);
        }
        long msSinceBoot = statListenerManager.e.getMsSinceBoot();
        for (Map.Entry entry : statListenerManager.i.entrySet()) {
            StatisticsListener statisticsListener = (StatisticsListener) entry.getKey();
            yjz0 yjz0Var = (yjz0) entry.getValue();
            if ((yjz0Var.b.toMillis(yjz0Var.a) + yjz0Var.c) - 10 < msSinceBoot) {
                yjz0Var.c = msSinceBoot;
                statisticsListener.onStatistics(extendedStats.getRtcStat());
            }
        }
    }

    public static final void b(StatListenerManager statListenerManager, RTCStatsObserver rTCStatsObserver) {
        statListenerManager.h.remove(rTCStatsObserver);
    }

    public final void addStatisticsListener(StatisticsListener statisticsListener, long j, TimeUnit timeUnit) {
        this.i.put(statisticsListener, new yjz0(j, timeUnit));
    }

    public final void registerRTCStatsObserver(RTCStatsObserver rTCStatsObserver) {
        if (!epx.f(this.g.getLooper().getThread(), Thread.currentThread())) {
            this.g.post(new cc3(7, this, rTCStatsObserver));
        } else {
            if (this.k) {
                return;
            }
            this.h.add(rTCStatsObserver);
        }
    }

    public final void release() {
        this.k = true;
        this.g.removeCallbacks(this.l);
        this.h.clear();
        c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
        this.j = null;
    }

    public final void removeRTCStatsObserver(RTCStatsObserver rTCStatsObserver) {
        if (epx.f(this.g.getLooper().getThread(), Thread.currentThread())) {
            this.h.remove(rTCStatsObserver);
        } else {
            this.g.post(new ii4(5, this, rTCStatsObserver));
        }
    }

    public final void removeStatisticsListener(StatisticsListener statisticsListener) {
        this.i.remove(statisticsListener);
    }

    public final void start() {
        if (!this.f) {
            this.g.removeCallbacks(this.l);
            this.g.postDelayed(this.l, 1000L);
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
        this.j = null;
        this.j = new o0(q.R(1L, TimeUnit.SECONDS).a0(a.b()), new q9y0(this)).a0(io.reactivex.rxjava3.schedulers.a.a()).a0(a.b()).subscribe(new f() { // from class: xsna.gfy0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                StatListenerManager.access$notifyStatisticsListeners(StatListenerManager.this, (ExtendedStatsCallback.ExtendedStats) obj);
            }
        });
    }

    public final x a() {
        return new b(new vvi0(this, 1)).q(a.b());
    }

    public static final void a(StatListenerManager statListenerManager, final y yVar) {
        statListenerManager.c.invoke(new ExtendedStatsCallback() { // from class: ru.ok.android.webrtc.stat.listener.StatListenerManager$statsCallbackSingle$1$1
            @Override // ru.ok.android.webrtc.topology.ExtendedStatsCallback
            public void onStatsReady(ExtendedStatsCallback.ExtendedStats extendedStats) {
                if (y.this.h()) {
                    return;
                }
                y.this.onSuccess(extendedStats);
            }
        });
    }
}
