package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MonitoringEventRequestKt;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MonitoringEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class MonitoringEventRequestKtKt {
    /* renamed from: -initializemonitoringEventRequest, reason: not valid java name */
    public static final MonitoringEventRequestOuterClass.MonitoringEventRequest m252initializemonitoringEventRequest(izs<? super MonitoringEventRequestKt.Dsl, s3q0> izsVar) {
        MonitoringEventRequestKt.Dsl _create = MonitoringEventRequestKt.Dsl.Companion._create(MonitoringEventRequestOuterClass.MonitoringEventRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final MonitoringEventRequestOuterClass.MonitoringEventRequest copy(MonitoringEventRequestOuterClass.MonitoringEventRequest monitoringEventRequest, izs<? super MonitoringEventRequestKt.Dsl, s3q0> izsVar) {
        MonitoringEventRequestKt.Dsl _create = MonitoringEventRequestKt.Dsl.Companion._create(monitoringEventRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder monitoringEventRequestOrBuilder) {
        if (monitoringEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return monitoringEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final MonitoringEventRequestOuterClass.MonitoringEvent getMonitoringEventOrNull(MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder monitoringEventRequestOrBuilder) {
        if (monitoringEventRequestOrBuilder.hasMonitoringEvent()) {
            return monitoringEventRequestOrBuilder.getMonitoringEvent();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder monitoringEventRequestOrBuilder) {
        if (monitoringEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return monitoringEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
