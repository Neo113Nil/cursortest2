package com.yandex.pulse;

import android.content.Context;
import android.net.TrafficStats;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.yandex.pulse.ApplicationStatusMonitor;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.metrics.MetricsService;
import com.yandex.pulse.utils.WeakHandler;
import defpackage.am2;
import defpackage.bfh;
import defpackage.e89;
import defpackage.gzf0;
import defpackage.hzf0;
import defpackage.i03;
import defpackage.i3f;
import defpackage.izf0;
import defpackage.k5f0;
import defpackage.kp50;
import defpackage.l5f0;
import defpackage.na10;
import defpackage.ny61;
import defpackage.oa10;
import defpackage.q30;
import defpackage.t901;
import defpackage.u941;
import defpackage.y5e;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u0000 \\2\u00020\u0001:\u0003]\\^B\u0019\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001dH\u0002¢\u0006\u0004\b*\u0010\u001fJ\u000f\u0010+\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010\u001fJ\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0014\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u0010\u001fJ\u000f\u00101\u001a\u00020\u001dH\u0002¢\u0006\u0004\b1\u0010\u001fJ\u0017\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b5\u00106R\u0016\u00108\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0016\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010DR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0016\u0010J\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010U\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR$\u0010W\u001a\u00020-2\u0006\u0010V\u001a\u00020-8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010X¨\u0006_"}, d2 = {"Lcom/yandex/pulse/PulseService;", "", "Landroid/content/Context;", "context", "Lcom/yandex/pulse/ServiceParams;", "serviceParams", "<init>", "(Landroid/content/Context;Lcom/yandex/pulse/ServiceParams;)V", "Lcom/yandex/pulse/metrics/MetricsService;", "metricsService", "Lcom/yandex/pulse/PowerStateChangeDetector;", "powerStateChangeDetector", "Loa10;", "measurementScheduler", "Li03;", "applicationMonitor", "Ll5f0;", "processMonitor", "(Landroid/content/Context;Lcom/yandex/pulse/ServiceParams;Lcom/yandex/pulse/metrics/MetricsService;Lcom/yandex/pulse/PowerStateChangeDetector;Loa10;Li03;Ll5f0;)V", "Lcom/yandex/pulse/ApplicationParams;", "params", "Lcom/yandex/pulse/histogram/ComponentHistograms;", "registerApp", "(Lcom/yandex/pulse/ApplicationParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "", "libraryName", "Lcom/yandex/pulse/LibraryParams;", "registerLib", "(Ljava/lang/String;Lcom/yandex/pulse/LibraryParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "Lzy11;", "onSuspend", "()V", "onResume", "", "powerState", "chargingSource", "onPowerStateChanged", "(II)V", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)V", "onAppNotIdleImpl", "resetMeasurement", "Lcom/yandex/pulse/ProcessCpuMonitoringParams;", "", "changeMeasurementIntervals", "(Lcom/yandex/pulse/ProcessCpuMonitoringParams;)Z", "scheduleMeasurement", "restartMeasurement", "Ljava/util/concurrent/Executor;", "getBackgroundExecutor", "(Lcom/yandex/pulse/ServiceParams;)Ljava/util/concurrent/Executor;", "setPowerState", "(I)V", "Lcom/yandex/pulse/ApplicationStatusMonitor;", "applicationStatusMonitor", "Lcom/yandex/pulse/ApplicationStatusMonitor;", "Lcom/yandex/pulse/metrics/MetricsService;", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "Lcom/yandex/pulse/utils/WeakHandler;", "handler", "Lcom/yandex/pulse/utils/WeakHandler;", "Lu941;", "handlerCallback", "Lu941;", "Loa10;", "Li03;", "processCpuMonitor", "Ll5f0;", "Lcom/yandex/pulse/PowerStateChangeDetector;", "Landroid/content/Context;", "backgroundExecutor", "Ljava/util/concurrent/Executor;", "Lcom/yandex/pulse/MeasurementBroadcasterImpl;", "measurementBroadcaster", "Lcom/yandex/pulse/MeasurementBroadcasterImpl;", "", "foregroundMeasurementInterval", "J", "backgroundMeasurementInterval", "getMeasurementInterval", "()J", "measurementInterval", "value", "isForeground", "()Z", "setForeground", "(Z)V", "isCharging", "Companion", "gzf0", "hzf0", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PulseService {
    private static final int MSG_INIT = 0;
    private static final int MSG_INIT_APP = 5;
    private static final int MSG_ON_APP_NO_IDLE = 1;
    private static final int MSG_ON_CHANGE_POWER_STATE = 4;
    private static final int MSG_ON_RESUME = 3;
    private static final int MSG_ON_SUSPEND = 2;
    private static PulseService pulseService;
    private i03 applicationMonitor;
    private final ApplicationStatusMonitor applicationStatusMonitor;
    private Executor backgroundExecutor;
    private long backgroundMeasurementInterval;
    private Context context;
    private long foregroundMeasurementInterval;
    private final WeakHandler handler;
    private final u941 handlerCallback;
    private final HandlerThread handlerThread;
    private final MeasurementBroadcasterImpl measurementBroadcaster;
    private oa10 measurementScheduler;
    private final MetricsService metricsService;
    private PowerStateChangeDetector powerStateChangeDetector;
    private l5f0 processCpuMonitor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long INITIAL_DELAY_MS = 2000;
    private static final long FOREGROUND_MEASUREMENT_INTERVAL = 60000;
    private static final long BACKGROUND_MEASUREMENT_INTERVAL = 3600000;
    private static final long CHANGE_POWER_STATE_DELAY = 60000;
    private static final MeasurementListenersHolder measurementListenersHolder = new MeasurementListenersHolder();

    private PulseService(Context context, ServiceParams serviceParams) {
        bfh bfhVar = new bfh(5, this);
        this.handlerCallback = bfhVar;
        this.foregroundMeasurementInterval = FOREGROUND_MEASUREMENT_INTERVAL;
        this.backgroundMeasurementInterval = BACKGROUND_MEASUREMENT_INTERVAL;
        setForeground(!serviceParams.applicationStatusMonitor.isSuspended());
        ApplicationStatusMonitor applicationStatusMonitor = serviceParams.applicationStatusMonitor;
        this.applicationStatusMonitor = applicationStatusMonitor;
        applicationStatusMonitor.setCallback(new ApplicationStatusMonitor.ApplicationStatusCallback() { // from class: com.yandex.pulse.PulseService.1
            @Override // com.yandex.pulse.ApplicationStatusMonitor.ApplicationStatusCallback
            public void onResume() {
                PulseService.this.onResume();
            }

            @Override // com.yandex.pulse.ApplicationStatusMonitor.ApplicationStatusCallback
            public void onSuspend() {
                PulseService.this.onSuspend();
            }
        });
        this.context = context.getApplicationContext();
        Executor backgroundExecutor = getBackgroundExecutor(serviceParams);
        this.backgroundExecutor = backgroundExecutor;
        Context context2 = this.context;
        this.metricsService = new MetricsService(context2 == null ? null : context2, backgroundExecutor == null ? null : backgroundExecutor, new DefaultMetricsLogUploaderClient(backgroundExecutor == null ? null : backgroundExecutor, serviceParams.uploadURL, serviceParams.enableLogging), serviceParams.enableLogging);
        this.measurementBroadcaster = new MeasurementBroadcasterImpl(measurementListenersHolder);
        HandlerThread handlerThread = new HandlerThread("PulseService", 10);
        handlerThread.start();
        this.handlerThread = handlerThread;
        WeakHandler weakHandler = new WeakHandler(handlerThread.getLooper(), bfhVar);
        this.handler = weakHandler;
        Context context3 = this.context;
        context3 = context3 == null ? null : context3;
        Executor executor = this.backgroundExecutor;
        Executor executor2 = executor != null ? executor : null;
        applicationStatusMonitor.isSuspended();
        weakHandler.obtainMessage(0, new hzf0(context3, executor2)).sendToTarget();
    }

    private final boolean changeMeasurementIntervals(ProcessCpuMonitoringParams params) {
        long j = this.foregroundMeasurementInterval;
        long j2 = params.foregroundIntervalMilliseconds;
        boolean z = (j == j2 && this.backgroundMeasurementInterval == params.backgroundIntervalMilliseconds) ? false : true;
        this.foregroundMeasurementInterval = j2;
        this.backgroundMeasurementInterval = params.backgroundIntervalMilliseconds;
        return z;
    }

    private final Executor getBackgroundExecutor(ServiceParams serviceParams) {
        final Executor executor = serviceParams.backgroundExecutor;
        if (executor == null) {
            executor = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        return new Executor() { // from class: fzf0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                PulseService.m340getBackgroundExecutor$lambda4$lambda3(executor, this, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBackgroundExecutor$lambda-4$lambda-3, reason: not valid java name */
    public static final void m340getBackgroundExecutor$lambda4$lambda3(Executor executor, PulseService pulseService2, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable unused) {
            pulseService2.handler.post(runnable);
        }
    }

    private final long getMeasurementInterval() {
        return isForeground() ? this.foregroundMeasurementInterval : this.backgroundMeasurementInterval;
    }

    public static final na10 getMeasurementRegistrant() {
        return INSTANCE.getMeasurementRegistrant();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMessage(Message msg) {
        int i = msg.what;
        if (i == 0) {
            Object obj = msg.obj;
            if (obj == null) {
                ny61.t("null cannot be cast to non-null type com.yandex.pulse.PulseService.ServiceInitParams");
                return;
            }
            hzf0 hzf0Var = (hzf0) obj;
            this.metricsService.initializeAndStartService(isForeground());
            if (this.powerStateChangeDetector == null) {
                this.powerStateChangeDetector = new PowerStateChangeDetector(hzf0Var.a, new izf0(this), true);
            }
            this.powerStateChangeDetector.register();
            setPowerState(this.powerStateChangeDetector.getLastKnownPowerState());
            if (this.measurementScheduler == null) {
                this.measurementScheduler = new oa10();
            }
            if (this.applicationMonitor == null) {
                this.applicationMonitor = new i03(this.measurementScheduler);
            }
            i03 i03Var = this.applicationMonitor;
            boolean isForeground = isForeground();
            q30 q30Var = i03Var.a;
            q30Var.b = isForeground;
            q30Var.c = 0;
            long uptimeMillis = SystemClock.uptimeMillis();
            q30Var.d = uptimeMillis;
            q30Var.e = uptimeMillis;
            am2 am2Var = i03Var.b;
            t901 t901Var = (t901) am2Var.a;
            int i2 = t901Var.c;
            t901Var.e = TrafficStats.getUidRxBytes(i2);
            t901Var.f = TrafficStats.getUidTxBytes(i2);
            t901Var.d = SystemClock.uptimeMillis();
            oa10 oa10Var = (oa10) am2Var.b;
            k5f0 k5f0Var = (k5f0) am2Var.c;
            ArrayList arrayList = oa10Var.a;
            if (!arrayList.contains(k5f0Var)) {
                arrayList.add(k5f0Var);
            }
            scheduleMeasurement();
            return;
        }
        if (i == 1) {
            this.metricsService.onApplicationNotIdle();
            return;
        }
        if (i == 2) {
            if (isForeground()) {
                setForeground(false);
                i03 i03Var2 = this.applicationMonitor;
                if (i03Var2 != null) {
                    q30 q30Var2 = i03Var2.a;
                    if (q30Var2.b) {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        q30Var2.b(uptimeMillis2);
                        q30Var2.a(uptimeMillis2);
                        q30Var2.b = false;
                    }
                }
                this.metricsService.onAppEnterBackground();
                restartMeasurement();
                return;
            }
            return;
        }
        if (i == 3) {
            if (isForeground()) {
                return;
            }
            setForeground(true);
            i03 i03Var3 = this.applicationMonitor;
            if (i03Var3 != null) {
                q30 q30Var3 = i03Var3.a;
                if (!q30Var3.b) {
                    long uptimeMillis3 = SystemClock.uptimeMillis();
                    q30Var3.b(uptimeMillis3);
                    q30Var3.a(uptimeMillis3);
                    q30Var3.b = true;
                }
            }
            this.metricsService.onAppEnterForeground();
            restartMeasurement();
            return;
        }
        if (i == 4) {
            boolean isCharging = isCharging();
            setPowerState(msg.arg1);
            if (isCharging != isCharging()) {
                restartMeasurement();
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        Object obj2 = msg.obj;
        if (obj2 == null) {
            ny61.t("null cannot be cast to non-null type com.yandex.pulse.PulseService.ApplicationInitParams");
            return;
        }
        gzf0 gzf0Var = (gzf0) obj2;
        if (this.processCpuMonitor == null) {
            this.processCpuMonitor = new l5f0(gzf0Var.a, this.measurementScheduler, gzf0Var.b, gzf0Var.c, this.measurementBroadcaster);
        }
        l5f0 l5f0Var = this.processCpuMonitor;
        oa10 oa10Var2 = l5f0Var.d;
        k5f0 k5f0Var2 = l5f0Var.j;
        ArrayList arrayList2 = oa10Var2.a;
        if (!arrayList2.contains(k5f0Var2)) {
            arrayList2.add(k5f0Var2);
        }
        if (gzf0Var.d) {
            restartMeasurement();
        }
    }

    private final boolean isCharging() {
        return y5e.g0;
    }

    private final boolean isForeground() {
        return y5e.f0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAppNotIdleImpl() {
        this.handler.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerApp$lambda-0, reason: not valid java name */
    public static final ComponentHistograms m341registerApp$lambda0(PulseService pulseService2, ApplicationParams applicationParams) {
        return pulseService2.metricsService.registerApplication(applicationParams);
    }

    public static final ComponentHistograms registerApplication(ApplicationParams applicationParams) {
        return INSTANCE.registerApplication(applicationParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerLib$lambda-1, reason: not valid java name */
    public static final ComponentHistograms m342registerLib$lambda1(PulseService pulseService2, String str, LibraryParams libraryParams) {
        return pulseService2.metricsService.registerLibrary(str, libraryParams);
    }

    public static final ComponentHistograms registerLibrary(String str, LibraryParams libraryParams) {
        return INSTANCE.registerLibrary(str, libraryParams);
    }

    private final void resetMeasurement() {
        this.measurementScheduler.a();
    }

    private final void restartMeasurement() {
        resetMeasurement();
        scheduleMeasurement();
    }

    private final void scheduleMeasurement() {
        oa10 oa10Var = this.measurementScheduler;
        long j = INITIAL_DELAY_MS;
        long measurementInterval = getMeasurementInterval();
        oa10Var.a();
        oa10Var.c = measurementInterval;
        oa10Var.b.start(j);
    }

    private final void setForeground(boolean z) {
        y5e.f0 = z;
    }

    private final void setPowerState(int powerState) {
        y5e.g0 = powerState == 2 || powerState == 3;
    }

    public static final boolean startService(Context context, ServiceParams serviceParams) {
        return INSTANCE.startService(context, serviceParams);
    }

    public final void onPowerStateChanged(int powerState, int chargingSource) {
        this.handler.removeMessages(4);
        this.handler.sendMessageDelayed(this.handler.obtainMessage(4, powerState, chargingSource), CHANGE_POWER_STATE_DELAY);
    }

    public final void onResume() {
        this.handler.sendEmptyMessage(3);
    }

    public final void onSuspend() {
        this.handler.sendEmptyMessage(2);
    }

    public final ComponentHistograms registerApp(ApplicationParams params) {
        ComponentHistograms componentHistograms = (ComponentHistograms) kp50.I(this.handler, new e89(7, this, params));
        ProcessCpuMonitoringParams processCpuMonitoringParams = params.processCpuMonitoringParams;
        if (processCpuMonitoringParams != null) {
            boolean changeMeasurementIntervals = changeMeasurementIntervals(processCpuMonitoringParams);
            WeakHandler weakHandler = this.handler;
            Context context = this.context;
            if (context == null) {
                context = null;
            }
            Executor executor = this.backgroundExecutor;
            weakHandler.obtainMessage(5, new gzf0(context, executor != null ? executor : null, params.processCpuMonitoringParams, changeMeasurementIntervals)).sendToTarget();
        }
        return componentHistograms;
    }

    public final ComponentHistograms registerLib(String libraryName, LibraryParams params) {
        return (ComponentHistograms) kp50.I(this.handler, new i3f(7, this, libraryName, params));
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0003R\u001a\u0010\u001b\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010%\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/pulse/PulseService$Companion;", "", "<init>", "()V", "Lcom/yandex/pulse/ApplicationParams;", "params", "Lcom/yandex/pulse/histogram/ComponentHistograms;", "registerApplication", "(Lcom/yandex/pulse/ApplicationParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "", "libraryName", "Lcom/yandex/pulse/LibraryParams;", "registerLibrary", "(Ljava/lang/String;Lcom/yandex/pulse/LibraryParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "Landroid/content/Context;", "context", "Lcom/yandex/pulse/ServiceParams;", "serviceParams", "", "startService", "(Landroid/content/Context;Lcom/yandex/pulse/ServiceParams;)Z", "Lzy11;", "onAppNotIdle", "Lna10;", "getMeasurementRegistrant", "()Lna10;", "getMeasurementRegistrant$annotations", "measurementRegistrant", "", "CHANGE_POWER_STATE_DELAY", "J", "getCHANGE_POWER_STATE_DELAY", "()J", "BACKGROUND_MEASUREMENT_INTERVAL", "FOREGROUND_MEASUREMENT_INTERVAL", "INITIAL_DELAY_MS", "", "MSG_INIT", CA20Status.STATUS_USER_I, "MSG_INIT_APP", "MSG_ON_APP_NO_IDLE", "MSG_ON_CHANGE_POWER_STATE", "MSG_ON_RESUME", "MSG_ON_SUSPEND", "Lcom/yandex/pulse/MeasurementListenersHolder;", "measurementListenersHolder", "Lcom/yandex/pulse/MeasurementListenersHolder;", "Lcom/yandex/pulse/PulseService;", "pulseService", "Lcom/yandex/pulse/PulseService;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMeasurementRegistrant$annotations() {
        }

        public final long getCHANGE_POWER_STATE_DELAY() {
            return PulseService.CHANGE_POWER_STATE_DELAY;
        }

        public final na10 getMeasurementRegistrant() {
            return PulseService.measurementListenersHolder;
        }

        public final void onAppNotIdle() {
            PulseService pulseService = PulseService.pulseService;
            if (pulseService != null) {
                pulseService.onAppNotIdleImpl();
            }
        }

        public final ComponentHistograms registerApplication(ApplicationParams params) {
            if (PulseService.pulseService != null) {
                return PulseService.pulseService.registerApp(params);
            }
            ny61.r("PulseService is not started");
            return null;
        }

        public final ComponentHistograms registerLibrary(String libraryName, LibraryParams params) {
            if (PulseService.pulseService != null) {
                return PulseService.pulseService.registerLib(libraryName, params);
            }
            ny61.r("PulseService is not started");
            return null;
        }

        public final boolean startService(Context context, ServiceParams serviceParams) {
            if (PulseService.pulseService != null) {
                return false;
            }
            PulseService.pulseService = new PulseService(context, serviceParams, null);
            return true;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PulseService(Context context, ServiceParams serviceParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, serviceParams);
    }

    public PulseService(Context context, ServiceParams serviceParams, MetricsService metricsService, PowerStateChangeDetector powerStateChangeDetector, oa10 oa10Var, i03 i03Var, l5f0 l5f0Var) {
        bfh bfhVar = new bfh(5, this);
        this.handlerCallback = bfhVar;
        this.foregroundMeasurementInterval = FOREGROUND_MEASUREMENT_INTERVAL;
        this.backgroundMeasurementInterval = BACKGROUND_MEASUREMENT_INTERVAL;
        setForeground(true);
        Executor backgroundExecutor = getBackgroundExecutor(serviceParams);
        this.metricsService = metricsService;
        this.powerStateChangeDetector = powerStateChangeDetector;
        this.measurementScheduler = oa10Var;
        this.applicationMonitor = i03Var;
        this.processCpuMonitor = l5f0Var;
        this.measurementBroadcaster = new MeasurementBroadcasterImpl(measurementListenersHolder);
        this.applicationStatusMonitor = null;
        this.handlerThread = null;
        WeakHandler weakHandler = new WeakHandler(bfhVar);
        this.handler = weakHandler;
        weakHandler.obtainMessage(0, new hzf0(context.getApplicationContext(), backgroundExecutor)).sendToTarget();
    }
}
