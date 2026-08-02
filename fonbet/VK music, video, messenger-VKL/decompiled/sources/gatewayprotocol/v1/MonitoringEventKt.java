package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import xsna.zcl;

/* compiled from: MonitoringEventKt.kt */
/* loaded from: classes8.dex */
public final class MonitoringEventKt {
    public static final MonitoringEventKt INSTANCE = new MonitoringEventKt();

    /* compiled from: MonitoringEventKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MonitoringEventRequestOuterClass.MonitoringEvent.Builder _builder;

        /* compiled from: MonitoringEventKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ MonitoringEventRequestOuterClass.MonitoringEvent _build() {
            return this._builder.build();
        }

        public final void clearDurationMs() {
            this._builder.clearDurationMs();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearImpressionNumber() {
            this._builder.clearImpressionNumber();
        }

        public final void clearMonitoringId() {
            this._builder.clearMonitoringId();
        }

        public final long getDurationMs() {
            return this._builder.getDurationMs();
        }

        public final MonitoringEventRequestOuterClass.MonitoringEventType getEventType() {
            return this._builder.getEventType();
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        public final long getImpressionNumber() {
            return this._builder.getImpressionNumber();
        }

        public final int getMonitoringId() {
            return this._builder.getMonitoringId();
        }

        public final boolean hasDurationMs() {
            return this._builder.hasDurationMs();
        }

        public final void setDurationMs(long j) {
            this._builder.setDurationMs(j);
        }

        public final void setEventType(MonitoringEventRequestOuterClass.MonitoringEventType monitoringEventType) {
            this._builder.setEventType(monitoringEventType);
        }

        public final void setEventTypeValue(int i) {
            this._builder.setEventTypeValue(i);
        }

        public final void setImpressionNumber(long j) {
            this._builder.setImpressionNumber(j);
        }

        public final void setMonitoringId(int i) {
            this._builder.setMonitoringId(i);
        }

        private Dsl(MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder) {
            this._builder = builder;
        }
    }

    private MonitoringEventKt() {
    }
}
