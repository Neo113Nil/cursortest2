package com.yandex.pulse.metrics;

import android.content.Context;
import android.util.Log;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.pulse.ApplicationParams;
import com.yandex.pulse.LibraryParams;
import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ad20;
import defpackage.ax50;
import defpackage.c6w;
import defpackage.dd20;
import defpackage.ed20;
import defpackage.fd20;
import defpackage.gd20;
import defpackage.hd20;
import defpackage.i3y;
import defpackage.id20;
import defpackage.iy2;
import defpackage.j73;
import defpackage.jd20;
import defpackage.k0c;
import defpackage.kd20;
import defpackage.ld20;
import defpackage.lsb;
import defpackage.msb;
import defpackage.nlu;
import defpackage.ny61;
import defpackage.olu;
import defpackage.rd20;
import defpackage.rp50;
import defpackage.s59;
import defpackage.scy;
import defpackage.ssu;
import defpackage.tcy;
import defpackage.tje;
import defpackage.ud20;
import defpackage.vc20;
import defpackage.vd20;
import defpackage.vez0;
import defpackage.vku;
import defpackage.wc20;
import defpackage.wls;
import defpackage.xc20;
import defpackage.yku;
import defpackage.yoc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 o2\u00020\u0001:\u0004pqbrB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u000eJ\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010 J\u0015\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020)2\u0006\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020.¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010\u000eJ\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u00020\f¢\u0006\u0004\b3\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00107R\u0016\u0010W\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR0\u0010]\u001a\u001e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.0[j\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR0\u0010c\u001a\u001e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020b0[j\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020b`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010^R\u0016\u0010d\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0014\u0010j\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006s"}, d2 = {"Lcom/yandex/pulse/metrics/MetricsService;", "", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "Lad20;", "logUploaderClient", "", "enableHistogramLogging", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lad20;Z)V", "Lzy11;", "loadSessionId", "()V", "collectMetrics", "", "logType", "Lvc20;", "createLog", "(I)Lvc20;", "Lvku;", "histogram", "Lnlu;", "snapshot", "recordDelta", "(Lvku;Lnlu;)V", "recordDeltaWithLogging", "startSchedulerIfNecessary", "startScheduledUpload", "inIdle", "handleIdleSinceLastTransmission", "(Z)V", "newConnectionType", "onConnectionTypeChanged", "(I)V", "processCleanExitBeacon", "appInForeground", "initializeAndStartService", "Lcom/yandex/pulse/ApplicationParams;", "params", "Lcom/yandex/pulse/histogram/ComponentHistograms;", "registerApplication", "(Lcom/yandex/pulse/ApplicationParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "", "libraryName", "Lcom/yandex/pulse/LibraryParams;", "registerLibrary", "(Ljava/lang/String;Lcom/yandex/pulse/LibraryParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "onAppEnterForeground", "onAppEnterBackground", "onApplicationNotIdle", "Landroid/content/Context;", "Ljava/util/concurrent/Executor;", "Lad20;", "Z", "Lcom/yandex/pulse/metrics/NetworkChangeDetector;", "networkChangeDetector", "Lcom/yandex/pulse/metrics/NetworkChangeDetector;", "Lax50;", "networkMetricsProvider", "Lax50;", "Lcom/yandex/pulse/metrics/MetricsState;", "metricsState", "Lcom/yandex/pulse/metrics/MetricsState;", "Ldd20;", "reportingService", "Ldd20;", "Lwc20;", "logManager", "Lwc20;", "Lolu;", "histogramSnapshotManager", "Lolu;", "Lld20;", "stateManager", "Lld20;", "Led20;", "rotationScheduler", "Led20;", "Lk0c;", "cleanExitBeacon", "Lk0c;", "Lcom/yandex/pulse/metrics/f;", "stabilityMetricsProvider", "Lcom/yandex/pulse/metrics/f;", "idleSinceLastTransmission", "sessionId", CA20Status.STATUS_USER_I, "applicationParams", "Lcom/yandex/pulse/ApplicationParams;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "libraryParams", "Ljava/util/HashMap;", "Lud20;", "applicationSystemProfile", "Lud20;", "Lhd20;", "librarySystemProfile", "currentPrefix", "Ljava/lang/String;", "currentLibrary", "Lxc20;", "getLogStore", "()Lxc20;", "logStore", "", "getRotationInterval", "()J", "rotationInterval", "Companion", "fd20", "gd20", "id20", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MetricsService {
    private static final String TAG = "Pulse";
    private ApplicationParams applicationParams;
    private ud20 applicationSystemProfile;
    private final Executor backgroundExecutor;
    private k0c cleanExitBeacon;
    private final Context context;
    private String currentLibrary;
    private final boolean enableHistogramLogging;
    private olu histogramSnapshotManager;
    private boolean idleSinceLastTransmission;
    private wc20 logManager;
    private final ad20 logUploaderClient;
    private MetricsState metricsState;
    private NetworkChangeDetector networkChangeDetector;
    private ax50 networkMetricsProvider;
    private dd20 reportingService;
    private ed20 rotationScheduler;
    private int sessionId;
    private f stabilityMetricsProvider;
    private ld20 stateManager;
    public static final gd20 Companion = new gd20();
    private static final long ROTATION_INTERVAL_MS = MapiClientImpl.RETRIES_TIME_MILLIS;
    private static final long CELLULAR_ROTATION_INTERVAL_MS = 900000;
    private final HashMap<String, LibraryParams> libraryParams = new HashMap<>();
    private final HashMap<String, hd20> librarySystemProfile = new HashMap<>();
    private String currentPrefix = "";

    public MetricsService(Context context, Executor executor, ad20 ad20Var, boolean z) {
        this.context = context;
        this.backgroundExecutor = executor;
        this.logUploaderClient = ad20Var;
        this.enableHistogramLogging = z;
    }

    private final void collectMetrics() {
        boolean z;
        SystemProfileProtos$SystemProfileProto.Network.ConnectionType connectionType;
        wc20 wc20Var = this.logManager;
        if (wc20Var == null) {
            wc20Var = null;
        }
        vc20 vc20Var = wc20Var.a;
        this.librarySystemProfile.size();
        this.libraryParams.size();
        wc20 wc20Var2 = this.logManager;
        if (wc20Var2 == null) {
            wc20Var2 = null;
        }
        wc20Var2.a = createLog(1);
        wc20 wc20Var3 = this.logManager;
        if (wc20Var3 == null) {
            wc20Var3 = null;
        }
        vc20 vc20Var2 = wc20Var3.a;
        ax50 ax50Var = this.networkMetricsProvider;
        if (ax50Var == null) {
            ax50Var = null;
        }
        lsb lsbVar = vc20Var2.d;
        r rVar = (r) lsbVar.f().toBuilder();
        if (ax50Var != null) {
            if (ax50Var.b) {
                boolean z2 = ax50Var.d;
            }
            b2 newBuilder = SystemProfileProtos$SystemProfileProto.Network.newBuilder();
            newBuilder.d(ax50Var.b);
            switch (ax50Var.c) {
                case 0:
                    connectionType = SystemProfileProtos$SystemProfileProto.Network.ConnectionType.CONNECTION_UNKNOWN;
                    break;
                case 1:
                    connectionType = SystemProfileProtos$SystemProfileProto.Network.ConnectionType.CONNECTION_ETHERNET;
                    break;
                case 2:
                    connectionType = SystemProfileProtos$SystemProfileProto.Network.ConnectionType.CONNECTION_WIFI;
                    break;
                case 3:
                    connectionType = SystemProfileProtos$SystemProfileProto.Network.ConnectionType.CONNECTION_2G;
                    break;
                case 4:
                    connectionType = SystemProfileProtos$SystemProfileProto.Network.ConnectionType.CONNECTION_3G;
                    break;
                case 5:
                    connectionType = SystemProfileProtos$SystemProfileProto.Network.ConnectionType.CONNECTION_4G;
                    break;
                case 6:
                    connectionType = SystemProfileProtos$SystemProfileProto.Network.ConnectionType.CONNECTION_NONE;
                    break;
                case 7:
                    connectionType = SystemProfileProtos$SystemProfileProto.Network.ConnectionType.CONNECTION_BLUETOOTH;
                    break;
                default:
                    connectionType = SystemProfileProtos$SystemProfileProto.Network.ConnectionType.CONNECTION_UNKNOWN;
                    break;
            }
            newBuilder.c(connectionType);
            SystemProfileProtos$SystemProfileProto.Network network = (SystemProfileProtos$SystemProfileProto.Network) newBuilder.build();
            int lastConnectionType = ax50Var.a.getLastConnectionType();
            ax50Var.c = lastConnectionType;
            if (lastConnectionType != 0) {
                ax50Var.d = true;
            }
            ax50Var.b = false;
            rVar.i(network);
        }
        Object obj = vc20Var2.b;
        if (obj != null) {
            yoc[] yocVarArr = (yoc[]) ((fd20) obj).c;
            ArrayList arrayList = new ArrayList(yocVarArr.length);
            for (yoc yocVar : yocVarArr) {
                y0 newBuilder2 = SystemProfileProtos$SystemProfileProto.e.newBuilder();
                newBuilder2.d(tje.I(yocVar.a));
                newBuilder2.c(tje.I(yocVar.b));
                arrayList.add((SystemProfileProtos$SystemProfileProto.e) newBuilder2.build());
            }
            rVar.c(kotlin.collections.a.J0(arrayList));
        }
        lsbVar.j((SystemProfileProtos$SystemProfileProto) rVar.build());
        f fVar = this.stabilityMetricsProvider;
        if (fVar == null) {
            fVar = null;
        }
        MetricsState metricsState = fVar.a;
        i3y i3yVar = fVar.c;
        int cleanResumeCount = metricsState.d.o().getCleanResumeCount();
        if (cleanResumeCount != 0) {
            ((vku) i3yVar.getValue()).a(0, cleanResumeCount);
            fVar.a(StabilityMetricsProvider$provideStabilityHistograms$1.w, false);
            z = true;
        } else {
            z = false;
        }
        int afterCrashResumeCount = metricsState.d.o().getAfterCrashResumeCount();
        if (afterCrashResumeCount != 0) {
            ((vku) i3yVar.getValue()).a(1, afterCrashResumeCount);
            fVar.a(StabilityMetricsProvider$provideStabilityHistograms$2.w, false);
            z = true;
        }
        if (z) {
            metricsState.a();
        }
        ApplicationParams applicationParams = this.applicationParams;
        if (applicationParams != null) {
            this.currentLibrary = null;
            this.currentPrefix = applicationParams.histogramPrefix;
            Object obj2 = ComponentHistograms.b;
            ComponentHistograms u = vez0.u();
            olu oluVar = this.histogramSnapshotManager;
            if (oluVar == null) {
                oluVar = null;
            }
            u.d(oluVar);
        }
        for (Map.Entry<String, LibraryParams> entry : this.libraryParams.entrySet()) {
            String key = entry.getKey();
            LibraryParams value = entry.getValue();
            this.currentLibrary = key;
            this.currentPrefix = value.histogramPrefix;
            Object obj3 = ComponentHistograms.b;
            ComponentHistograms A = vez0.A(key);
            olu oluVar2 = this.histogramSnapshotManager;
            if (oluVar2 == null) {
                oluVar2 = null;
            }
            A.d(oluVar2);
        }
        wc20 wc20Var4 = this.logManager;
        if (wc20Var4 == null) {
            wc20Var4 = null;
        }
        xc20 logStore = getLogStore();
        vc20 vc20Var3 = wc20Var4.a;
        lsb lsbVar2 = vc20Var3.d;
        ArrayList arrayList2 = vc20Var3.e.a;
        try {
            List J0 = kotlin.collections.a.J0(arrayList2);
            arrayList2.clear();
            lsbVar2.c(J0);
            hd20[] hd20VarArr = vc20Var3.c;
            c6w it = j73.F(hd20VarArr).iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                yku ykuVar = (yku) vc20Var3.f.get(hd20VarArr[nextInt].w);
                if (ykuVar != null) {
                    scy scyVar = (scy) lsbVar2.e(nextInt).toBuilder();
                    arrayList2 = ykuVar.a;
                    try {
                        List J02 = kotlin.collections.a.J0(arrayList2);
                        arrayList2.clear();
                        scyVar.c(J02);
                        lsbVar2.h(nextInt, (tcy) scyVar.build());
                    } finally {
                    }
                }
            }
            byte[] byteArray = ((msb) wc20Var4.a.d.build()).toByteArray();
            if (byteArray.length != 0) {
                int i = wc20Var4.a.a;
                if (i == 0) {
                    logStore.a.d(byteArray);
                } else if (i == 1) {
                    logStore.b.d(byteArray);
                }
            }
            wc20Var4.a = null;
        } finally {
        }
    }

    private final vc20 createLog(int logType) {
        Context context = this.context;
        ld20 ld20Var = this.stateManager;
        if (ld20Var == null) {
            ld20Var = null;
        }
        String g = ld20Var.a.d.g();
        int i = this.sessionId;
        ud20 ud20Var = this.applicationSystemProfile;
        Object[] array = this.librarySystemProfile.values().toArray(new hd20[0]);
        if (array != null) {
            return new vc20(context, g, i, logType, ud20Var, (hd20[]) array);
        }
        ny61.t("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return null;
    }

    private final xc20 getLogStore() {
        dd20 dd20Var = this.reportingService;
        if (dd20Var == null) {
            dd20Var = null;
        }
        return dd20Var.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getRotationInterval() {
        rp50 rp50Var = NetworkChangeDetector.Companion;
        NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
        if (networkChangeDetector == null) {
            networkChangeDetector = null;
        }
        int lastConnectionType = networkChangeDetector.getLastConnectionType();
        rp50Var.getClass();
        return (lastConnectionType == 3 || lastConnectionType == 4 || lastConnectionType == 5) ? CELLULAR_ROTATION_INTERVAL_MS : ROTATION_INTERVAL_MS;
    }

    private final void handleIdleSinceLastTransmission(boolean inIdle) {
        if (!inIdle && this.idleSinceLastTransmission) {
            startSchedulerIfNecessary();
        }
        this.idleSinceLastTransmission = inIdle;
    }

    private final void loadSessionId() {
        MetricsState metricsState = this.metricsState;
        if (metricsState == null) {
            metricsState = null;
        }
        int m = metricsState.d.m() + 1;
        this.sessionId = m;
        MetricsState metricsState2 = this.metricsState;
        if (metricsState2 == null) {
            metricsState2 = null;
        }
        metricsState2.d.s(m);
        MetricsState metricsState3 = this.metricsState;
        (metricsState3 != null ? metricsState3 : null).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnectionTypeChanged(int newConnectionType) {
        ax50 ax50Var = this.networkMetricsProvider;
        if (ax50Var == null) {
            ax50Var = null;
        }
        if (newConnectionType == 6) {
            ax50Var.d = true;
            return;
        }
        boolean z = ax50Var.d;
        if (!z) {
            int i = ax50Var.c;
        }
        int i2 = ax50Var.c;
        if (newConnectionType != i2 && i2 != 6 && z) {
            ax50Var.b = true;
        }
        ax50Var.d = true;
        ax50Var.c = newConnectionType;
    }

    private final void processCleanExitBeacon() {
        k0c k0cVar = this.cleanExitBeacon;
        if ((k0cVar == null ? null : k0cVar).b) {
            return;
        }
        if (k0cVar == null) {
            k0cVar = null;
        }
        k0cVar.a(true);
        f fVar = this.stabilityMetricsProvider;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        fVar.a(StabilityMetricsProvider$incrementResumeAfterCrash$1.w, true);
        f fVar2 = this.stabilityMetricsProvider;
        (fVar2 != null ? fVar2 : null).b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordDelta(vku histogram, nlu snapshot) {
        wc20 wc20Var = this.logManager;
        if (wc20Var == null) {
            wc20Var = null;
        }
        vc20 vc20Var = wc20Var.a;
        String str = this.currentLibrary;
        String str2 = this.currentPrefix;
        if (str == null) {
            vc20.a(vc20Var.e, str2, histogram.a, snapshot);
            return;
        }
        String str3 = histogram.a;
        HashMap hashMap = vc20Var.f;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new yku());
        }
        vc20.a((yku) hashMap.get(str), str2, str3, snapshot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordDeltaWithLogging(vku histogram, nlu snapshot) {
        recordDelta(histogram, snapshot);
        Log.i(TAG, "Histogram recorded: " + this.currentPrefix + histogram.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startScheduledUpload() {
        ed20 ed20Var;
        if (this.idleSinceLastTransmission) {
            ed20 ed20Var2 = this.rotationScheduler;
            if (ed20Var2 == null) {
                ed20Var2 = null;
            }
            ed20Var2.stop();
            ed20 ed20Var3 = this.rotationScheduler;
            ed20Var = ed20Var3 != null ? ed20Var3 : null;
            ed20Var.taskDone(((MetricsService) ed20Var.a.a).getRotationInterval());
            return;
        }
        if (getLogStore().b()) {
            dd20 dd20Var = this.reportingService;
            if (dd20Var == null) {
                dd20Var = null;
            }
            dd20Var.a();
            ed20 ed20Var4 = this.rotationScheduler;
            ed20Var = ed20Var4 != null ? ed20Var4 : null;
            ed20Var.taskDone(((MetricsService) ed20Var.a.a).getRotationInterval());
            return;
        }
        collectMetrics();
        dd20 dd20Var2 = this.reportingService;
        if (dd20Var2 == null) {
            dd20Var2 = null;
        }
        dd20Var2.a();
        ed20 ed20Var5 = this.rotationScheduler;
        ed20Var = ed20Var5 != null ? ed20Var5 : null;
        ed20Var.taskDone(((MetricsService) ed20Var.a.a).getRotationInterval());
        handleIdleSinceLastTransmission(true);
    }

    private final void startSchedulerIfNecessary() {
        ed20 ed20Var = this.rotationScheduler;
        if (ed20Var == null) {
            ed20Var = null;
        }
        ed20Var.start(15000L);
        dd20 dd20Var = this.reportingService;
        (dd20Var != null ? dd20Var : null).a();
    }

    public final void initializeAndStartService(boolean appInForeground) {
        MetricsService metricsService;
        wls metricsService$initializeAndStartService$3;
        NetworkChangeDetector networkChangeDetector = new NetworkChangeDetector(this.context, new jd20(this));
        this.networkChangeDetector = networkChangeDetector;
        this.networkMetricsProvider = new ax50(networkChangeDetector);
        this.metricsState = new MetricsState(this.context.getFilesDir(), this.backgroundExecutor);
        ad20 ad20Var = this.logUploaderClient;
        MetricsState metricsState = this.metricsState;
        if (metricsState == null) {
            metricsState = null;
        }
        this.reportingService = new dd20(ad20Var, metricsState);
        this.logManager = new wc20();
        if (this.enableHistogramLogging) {
            metricsService$initializeAndStartService$3 = new MetricsService$initializeAndStartService$2(this);
            metricsService = this;
        } else {
            metricsService = this;
            metricsService$initializeAndStartService$3 = new MetricsService$initializeAndStartService$3(2, metricsService, MetricsService.class, "recordDelta", "recordDelta(Lcom/yandex/pulse/histogram/HistogramBase;Lcom/yandex/pulse/histogram/HistogramSamples;)V", 0);
        }
        metricsService.histogramSnapshotManager = new olu(new kd20(metricsService$initializeAndStartService$3));
        MetricsState metricsState2 = metricsService.metricsState;
        if (metricsState2 == null) {
            metricsState2 = null;
        }
        metricsService.stateManager = new ld20(metricsState2);
        metricsService.rotationScheduler = new ed20(new ssu(14, metricsService), new s59(metricsService));
        MetricsState metricsState3 = metricsService.metricsState;
        if (metricsState3 == null) {
            metricsState3 = null;
        }
        metricsService.cleanExitBeacon = new k0c(metricsState3);
        MetricsState metricsState4 = metricsService.metricsState;
        if (metricsState4 == null) {
            metricsState4 = null;
        }
        metricsService.stabilityMetricsProvider = new f(metricsState4);
        metricsService.processCleanExitBeacon();
        dd20 dd20Var = metricsService.reportingService;
        if (dd20Var == null) {
            dd20Var = null;
        }
        xc20 xc20Var = dd20Var.b;
        xc20Var.a.b();
        xc20Var.b.b();
        xc20Var.c = true;
        vd20 vd20Var = new vd20(new ssu(13, dd20Var));
        vd20Var.a = 15000L;
        dd20Var.e = vd20Var;
        metricsService.loadSessionId();
        dd20 dd20Var2 = metricsService.reportingService;
        if (dd20Var2 == null) {
            dd20Var2 = null;
        }
        if (!dd20Var2.c) {
            dd20Var2.c = true;
            dd20Var2.a();
        }
        if (appInForeground) {
            metricsService.onAppEnterForeground();
            return;
        }
        dd20 dd20Var3 = metricsService.reportingService;
        vd20 vd20Var2 = (dd20Var3 != null ? dd20Var3 : null).e;
        if (vd20Var2 != null) {
            vd20Var2.stop();
        }
    }

    public final void onAppEnterBackground() {
        k0c k0cVar = this.cleanExitBeacon;
        if (k0cVar == null) {
            k0cVar = null;
        }
        k0cVar.a(true);
        NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
        if (networkChangeDetector == null) {
            networkChangeDetector = null;
        }
        networkChangeDetector.unregister();
        ed20 ed20Var = this.rotationScheduler;
        if (ed20Var == null) {
            ed20Var = null;
        }
        ed20Var.stop();
        dd20 dd20Var = this.reportingService;
        if (dd20Var == null) {
            dd20Var = null;
        }
        vd20 vd20Var = dd20Var.e;
        if (vd20Var != null) {
            vd20Var.stop();
        }
        collectMetrics();
        xc20 logStore = getLogStore();
        if (logStore.c) {
            logStore.a.c();
            logStore.b.c();
        }
        MetricsState metricsState = this.metricsState;
        MetricsState metricsState2 = metricsState != null ? metricsState : null;
        if (metricsState2.e) {
            metricsState2.e = false;
            metricsState2.b.removeMessages(0);
            metricsState2.c.execute(new iy2(22, metricsState2, ((rd20) metricsState2.d.build()).toByteArray()));
        }
    }

    public final void onAppEnterForeground() {
        k0c k0cVar = this.cleanExitBeacon;
        if (k0cVar == null) {
            k0cVar = null;
        }
        k0cVar.a(false);
        f fVar = this.stabilityMetricsProvider;
        if (fVar == null) {
            fVar = null;
        }
        if (fVar.b) {
            fVar.b = false;
        } else {
            fVar.a(StabilityMetricsProvider$incrementCleanResume$1.w, true);
        }
        NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
        (networkChangeDetector != null ? networkChangeDetector : null).register();
        startSchedulerIfNecessary();
    }

    public final void onApplicationNotIdle() {
        handleIdleSinceLastTransmission(false);
    }

    public final ComponentHistograms registerApplication(ApplicationParams params) {
        if (this.applicationParams != null || this.applicationSystemProfile != null) {
            ny61.r("Pulse application already registered");
            return null;
        }
        this.applicationSystemProfile = new id20(params);
        this.applicationParams = params;
        Log.i(TAG, "Application " + params.packageName + ':' + params.versionString + " was registered with prefix " + params.histogramPrefix);
        Object obj = ComponentHistograms.b;
        return vez0.u();
    }

    public final ComponentHistograms registerLibrary(String libraryName, LibraryParams params) {
        if (libraryName.equals("")) {
            ny61.g("Wrong library name");
            return null;
        }
        if (this.libraryParams.containsKey(libraryName) || this.librarySystemProfile.containsKey(libraryName)) {
            ny61.g("Duplicate library registration");
            return null;
        }
        this.librarySystemProfile.put(libraryName, new hd20(libraryName, params));
        this.libraryParams.put(libraryName, params);
        Log.i(TAG, "Library " + params.packageName + ':' + params.versionString + " was registered with prefix " + params.histogramPrefix);
        Object obj = ComponentHistograms.b;
        return vez0.A(libraryName);
    }
}
