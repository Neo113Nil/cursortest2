package ru.ok.media;

import android.os.Handler;
import one.video.streaming.tools.TimeMachine;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import ru.ok.media.ConnectionBenchmark;
import ru.ok.media.utils.PeriodicTasksManager;
import ru.ok.proto.NetPublisher;
import xsna.j0;
import xsna.ji;
import xsna.mf3;
import xsna.ne7;
import xsna.s1p0;
import xsna.sb;
import xsna.tto0;
import xsna.zvo0;

/* loaded from: classes9.dex */
public class ConnectionBenchmark {
    public static final int MAX_BW = 10000000;
    private static final int MIN_BENCH_TIME_MS = 1000;
    private static final String TAG = "Publisher";
    public TimeMachine _timeMachine;
    private final zvo0 benchStart;
    private volatile boolean benchmarkRunning;
    private s1p0 byteBucket;
    private zvo0 firstDataReceived;
    private final Handler handler;
    private final NetPublisher publisher;
    private volatile long resultBitrate;
    private boolean resultValid;
    private final PeriodicTasksManager tasksManager;
    private boolean m_background = false;
    private final Runnable benchIterationFunc = new j0(this, 6);
    private long nextRunDelay = 60000;
    public long bwLimit = 10000000;
    public long externalBwLimit = 10000000;

    public ConnectionBenchmark(TimeMachine timeMachine, Handler handler, NetPublisher netPublisher) {
        ne7.t(TAG, "ConnectionBenchmark()");
        this._timeMachine = timeMachine != null ? timeMachine : new tto0();
        this.benchStart = new zvo0(timeMachine);
        this.firstDataReceived = new zvo0(timeMachine);
        this.handler = handler;
        this.publisher = netPublisher;
        recreateByteBucket();
        this.tasksManager = new PeriodicTasksManager(handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void benchIteration() {
        if (!this.benchmarkRunning) {
            ne7.J(TAG, "benchIteration() - not running");
            return;
        }
        this.byteBucket.addTokens();
        long currentTimeMillis = this._timeMachine.currentTimeMillis();
        long min = Math.min(10000000L, this.externalBwLimit);
        while (this._timeMachine.currentTimeMillis() - currentTimeMillis < 20) {
            long networkBW = this.publisher.getNetworkBW(min);
            if (networkBW <= 0) {
                networkBW = 10000000;
            }
            this.bwLimit = Math.min(10000000L, Math.min((networkBW * 12) / 10, this.externalBwLimit));
            int requestTokens = (int) this.byteBucket.requestTokens(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
            if (requestTokens == 0) {
                break;
            }
            if (!this.publisher.sendBenchBytes(requestTokens)) {
                ne7.t(TAG, "benchIteration() - stopping...");
                this.benchmarkRunning = false;
                this.tasksManager.shutdown();
                return;
            }
            long networkBW2 = this.publisher.getNetworkBW(min);
            if (this.resultBitrate != networkBW2) {
                ne7.t(TAG, "benchIteration() - measured bitrate " + this.resultBitrate + " -> " + networkBW2);
            }
            this.resultBitrate = networkBW2;
            if (this.resultBitrate > 0) {
                this.firstDataReceived.c();
                if (this.firstDataReceived.a(0L) > 1000 && !this.resultValid) {
                    ne7.t(TAG, "benchIteration() - result valid (" + this.resultBitrate + ")");
                    this.resultValid = true;
                }
            }
        }
        if (this.benchStart.a(0L) > 6000) {
            this.resultBitrate = this.publisher.getNetworkBW(min);
            ne7.t(TAG, "benchIteration() - stopping after 6 seconds (" + this.resultBitrate + ")");
            this.tasksManager.removeTask(this.benchIterationFunc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBackground$2(int i, boolean z) {
        StringBuilder b = ji.b(i, "setBackground() - setBackground(", ") closure, running= ");
        b.append(this.benchmarkRunning);
        b.append(", background= ");
        b.append(this.m_background);
        ne7.m(TAG, b.toString());
        if (!this.benchmarkRunning || this.m_background == z) {
            return;
        }
        this.m_background = z;
        if (!z) {
            this.firstDataReceived = new zvo0(this._timeMachine);
            this.benchStart.b();
        }
        this.tasksManager.setPaused(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        ne7.m(TAG, "start() - start() closure");
        if (this.benchmarkRunning) {
            ne7.m(TAG, "start() closure - already running");
        }
        this.benchmarkRunning = true;
        this.publisher.resume();
        this.benchStart.b();
        recreateByteBucket();
        this.tasksManager.addTask(this.benchIterationFunc, 10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$1() {
        ne7.m(TAG, "stop() - stop() closure");
        if (!this.benchmarkRunning || this.publisher == null) {
            ne7.J(TAG, "stop() - stop() closure, not running or no publisher");
        }
        this.resultBitrate = this.publisher.getNetworkBW(0L);
        this.benchmarkRunning = false;
        this.publisher.dropBenchBytes();
    }

    private void recreateByteBucket() {
        ne7.t(TAG, "recreateByteBucket()");
        this.byteBucket = new s1p0(this._timeMachine, 0L, 1000L) { // from class: ru.ok.media.ConnectionBenchmark.1
            @Override // xsna.s1p0
            public long getBWLimit() {
                return ConnectionBenchmark.this.bwLimit;
            }
        };
    }

    public long getResultBitrate() {
        long j = this.resultValid ? this.resultBitrate : -1L;
        ne7.m(TAG, "getResultBitrate() - " + j);
        return j;
    }

    public boolean isRunning() {
        return this.benchmarkRunning;
    }

    public void limitBW(long j) {
        ne7.t(TAG, "limitBW(" + j + ")");
        this.externalBwLimit = j;
    }

    public void setBackground(final boolean z) {
        ne7.t(TAG, "setBackground(" + (z ? 1 : 0) + ")");
        Handler handler = this.handler;
        final int i = z ? 1 : 0;
        handler.post(new Runnable() { // from class: xsna.w3j
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionBenchmark.this.lambda$setBackground$2(i, z);
            }
        });
    }

    public void start() {
        ne7.t(TAG, "start()");
        this.handler.post(new sb(this, 4));
    }

    public void stop() {
        ne7.t(TAG, "stop()");
        this.tasksManager.shutdown();
        this.handler.post(new mf3(this, 4));
    }
}
