package ru.ok.tracer.opentelemetry.collect;

import android.net.TrafficStats;
import android.os.Process;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.opentelemetry.api.common.AttributeType;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.device.DeviceInfoUtils;
import ru.ok.tracer.opentelemetry.TracerOpenTelemetry;
import ru.ok.tracer.opentelemetry.record.LongRecorder;
import ru.ok.tracer.opentelemetry.record.OpenTelemetryRecorderProvider;
import xsna.i94;
import xsna.q94;
import xsna.xfx;

/* compiled from: NetworkIoProducer.kt */
/* loaded from: classes9.dex */
public final class NetworkIoProducer {
    private static final i94<String> ATTR_KEY_CONNECTION;
    private static final i94<String> ATTR_KEY_DIRECTION;
    public static final NetworkIoProducer INSTANCE = new NetworkIoProducer();
    private static final String RECEIVE = "receive";
    private static final String TRANSMIT = "transmit";
    private static final LongRecorder appNetworkCounter;
    private static final LongRecorder systemNetworkCounter;

    static {
        AttributeType attributeType = AttributeType.STRING;
        ATTR_KEY_DIRECTION = xfx.a(attributeType, "network.io.direction");
        ATTR_KEY_CONNECTION = xfx.a(attributeType, "apptracer.connection");
        TracerOpenTelemetry tracerOpenTelemetry = TracerOpenTelemetry.INSTANCE;
        OpenTelemetryRecorderProvider recorderProvider$tracer_opentelemetry_release = tracerOpenTelemetry.getRecorderProvider$tracer_opentelemetry_release();
        TechStatsCollectorManager techStatsCollectorManager = TechStatsCollectorManager.INSTANCE;
        appNetworkCounter = recorderProvider$tracer_opentelemetry_release.createLongRecorder(techStatsCollectorManager.getScope$tracer_opentelemetry_release(), "process.network.io", "Network I/O for this app in bytes", "B");
        systemNetworkCounter = tracerOpenTelemetry.getRecorderProvider$tracer_opentelemetry_release().createLongRecorder(techStatsCollectorManager.getScope$tracer_opentelemetry_release(), "system.network.io", "Network I/O for the system in bytes", "B");
    }

    private NetworkIoProducer() {
    }

    private final void collectAppNetwork() {
        int myUid = Process.myUid();
        Long valueOf = Long.valueOf(TrafficStats.getUidRxBytes(myUid));
        if (valueOf.longValue() < 0) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        Long valueOf2 = Long.valueOf(TrafficStats.getUidTxBytes(myUid));
        Long l = valueOf2.longValue() >= 0 ? valueOf2 : null;
        long longValue2 = l != null ? l.longValue() : 0L;
        String connectionInfo = DeviceInfoUtils.getConnectionInfo(Tracer.INSTANCE.getContext());
        if (connectionInfo == null) {
            connectionInfo = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        String str = connectionInfo;
        LongRecorder longRecorder = appNetworkCounter;
        recordIo(longRecorder, longValue, RECEIVE, str);
        recordIo(longRecorder, longValue2, TRANSMIT, str);
    }

    private final void collectSystemNetwork() {
        Long valueOf = Long.valueOf(TrafficStats.getTotalRxBytes());
        if (valueOf.longValue() < 0) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        Long valueOf2 = Long.valueOf(TrafficStats.getTotalTxBytes());
        Long l = valueOf2.longValue() >= 0 ? valueOf2 : null;
        long longValue2 = l != null ? l.longValue() : 0L;
        String connectionInfo = DeviceInfoUtils.getConnectionInfo(Tracer.INSTANCE.getContext());
        if (connectionInfo == null) {
            connectionInfo = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        String str = connectionInfo;
        LongRecorder longRecorder = systemNetworkCounter;
        recordIo(longRecorder, longValue, RECEIVE, str);
        recordIo(longRecorder, longValue2, TRANSMIT, str);
    }

    private final void recordIo(LongRecorder longRecorder, long j, String str, String str2) {
        if (j > 0) {
            LongRecorder.DefaultImpls.record$default(longRecorder, j, q94.k(ATTR_KEY_DIRECTION, str, ATTR_KEY_CONNECTION, str2), null, 4, null);
        }
    }

    public final void collect() {
        collectAppNetwork();
    }
}
