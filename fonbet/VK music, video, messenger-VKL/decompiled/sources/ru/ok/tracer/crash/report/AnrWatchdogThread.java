package ru.ok.tracer.crash.report;

import android.os.Handler;
import android.os.Looper;
import xsna.a72;
import xsna.gv2;
import xsna.hv2;
import xsna.zcl;

/* compiled from: AnrWatchdogThread.kt */
/* loaded from: classes9.dex */
public final class AnrWatchdogThread extends Thread {
    private static final long ABSOLUTE_MIN_SNAPSHOTS_DELAY_MS = 1000;
    private static final long ABSOLUTE_MIN_SNAPSHOTS_INTERVAL_MS = 100;
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_SNAPSHOTS_DELAY_MS = 3000;
    public static final long DEFAULT_SNAPSHOTS_INTERVAL_MS = 500;
    private volatile Handler bgHandler;
    private final Runnable bgSnapshotRunnable;
    private final Runnable bgWatchdogRunnable;
    private volatile Handler mainHandler;
    private final Runnable mainRunnable;
    private volatile boolean mainStuck;
    private volatile Thread mainThread;
    private final long snapshotIntervalMs;
    private final AnrSnapshotStorage snapshotStorage;
    private final long snapshotsDelayMs;
    private final long watchdogPeriodMs;

    /* compiled from: AnrWatchdogThread.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AnrWatchdogThread(AnrSnapshotStorage anrSnapshotStorage, long j, long j2, int i, zcl zclVar) {
        this(anrSnapshotStorage, (i & 2) != 0 ? 3000L : j, (i & 4) != 0 ? 500L : j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBgSnapshot() {
        if (this.mainStuck) {
            AnrSnapshotStorage anrSnapshotStorage = this.snapshotStorage;
            Thread thread = this.mainThread;
            if (thread == null) {
                thread = null;
            }
            anrSnapshotStorage.save(thread.getStackTrace());
            Handler handler = this.bgHandler;
            (handler != null ? handler : null).postDelayed(this.bgSnapshotRunnable, this.snapshotIntervalMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBgWatchdog() {
        this.mainStuck = true;
        this.snapshotStorage.clean();
        onBgSnapshot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMain() {
        this.mainThread = Thread.currentThread();
        this.mainStuck = false;
        Handler handler = this.bgHandler;
        if (handler == null) {
            handler = null;
        }
        handler.removeCallbacks(this.bgWatchdogRunnable);
        Handler handler2 = this.bgHandler;
        if (handler2 == null) {
            handler2 = null;
        }
        handler2.postDelayed(this.bgWatchdogRunnable, this.snapshotsDelayMs);
        Handler handler3 = this.mainHandler;
        (handler3 != null ? handler3 : null).postDelayed(this.mainRunnable, this.watchdogPeriodMs);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.bgHandler = new Handler(myLooper);
        this.mainHandler = new Handler(Looper.getMainLooper());
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = null;
        }
        handler.post(this.mainRunnable);
        Looper.loop();
    }

    public AnrWatchdogThread(AnrSnapshotStorage anrSnapshotStorage, long j, long j2) {
        super("tracer-watchdog");
        this.snapshotStorage = anrSnapshotStorage;
        this.snapshotsDelayMs = j >= 1000 ? j : 1000L;
        this.snapshotIntervalMs = j2 < ABSOLUTE_MIN_SNAPSHOTS_INTERVAL_MS ? 100L : j2;
        this.watchdogPeriodMs = j / 2;
        this.mainRunnable = new gv2(this, 0);
        this.bgWatchdogRunnable = new a72(this, 1);
        this.bgSnapshotRunnable = new hv2(this, 0);
    }
}
