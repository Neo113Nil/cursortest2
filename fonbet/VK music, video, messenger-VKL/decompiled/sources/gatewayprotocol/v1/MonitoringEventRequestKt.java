package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.zcl;

/* compiled from: MonitoringEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class MonitoringEventRequestKt {
    public static final MonitoringEventRequestKt INSTANCE = new MonitoringEventRequestKt();

    /* compiled from: MonitoringEventRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MonitoringEventRequestOuterClass.MonitoringEventRequest.Builder _builder;

        /* compiled from: MonitoringEventRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MonitoringEventRequestOuterClass.MonitoringEventRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MonitoringEventRequestOuterClass.MonitoringEventRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ MonitoringEventRequestOuterClass.MonitoringEventRequest _build() {
            return this._builder.build();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearMonitoringEvent() {
            this._builder.clearMonitoringEvent();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            return this._builder.getDynamicDeviceInfo();
        }

        public final MonitoringEventRequestOuterClass.MonitoringEvent getMonitoringEvent() {
            return this._builder.getMonitoringEvent();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            return this._builder.getStaticDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasMonitoringEvent() {
            return this._builder.hasMonitoringEvent();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setMonitoringEvent(MonitoringEventRequestOuterClass.MonitoringEvent monitoringEvent) {
            this._builder.setMonitoringEvent(monitoringEvent);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        private Dsl(MonitoringEventRequestOuterClass.MonitoringEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private MonitoringEventRequestKt() {
    }
}
