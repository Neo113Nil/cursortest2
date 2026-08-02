package gatewayprotocol.v1;

import gatewayprotocol.v1.MonitoringEventKt;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MonitoringEventKt.kt */
/* loaded from: classes8.dex */
public final class MonitoringEventKtKt {
    /* renamed from: -initializemonitoringEvent, reason: not valid java name */
    public static final MonitoringEventRequestOuterClass.MonitoringEvent m251initializemonitoringEvent(izs<? super MonitoringEventKt.Dsl, s3q0> izsVar) {
        MonitoringEventKt.Dsl _create = MonitoringEventKt.Dsl.Companion._create(MonitoringEventRequestOuterClass.MonitoringEvent.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final MonitoringEventRequestOuterClass.MonitoringEvent copy(MonitoringEventRequestOuterClass.MonitoringEvent monitoringEvent, izs<? super MonitoringEventKt.Dsl, s3q0> izsVar) {
        MonitoringEventKt.Dsl _create = MonitoringEventKt.Dsl.Companion._create(monitoringEvent.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
