package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.zcl;

/* compiled from: DiagnosticEventsConfigurationKt.kt */
/* loaded from: classes8.dex */
public final class DiagnosticEventsConfigurationKt {
    public static final DiagnosticEventsConfigurationKt INSTANCE = new DiagnosticEventsConfigurationKt();

    /* compiled from: DiagnosticEventsConfigurationKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder _builder;

        /* compiled from: DiagnosticEventsConfigurationKt.kt */
        public static final class AllowedEventsProxy extends DslProxy {
            private AllowedEventsProxy() {
            }
        }

        /* compiled from: DiagnosticEventsConfigurationKt.kt */
        public static final class BlockedEventsProxy extends DslProxy {
            private BlockedEventsProxy() {
            }
        }

        /* compiled from: DiagnosticEventsConfigurationKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DiagnosticEventsConfiguration _build() {
            return this._builder.build();
        }

        /* renamed from: addAllAllowedEvents, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllAllowedEvents(DslList dslList, Iterable iterable) {
            this._builder.addAllAllowedEvents(iterable);
        }

        /* renamed from: addAllBlockedEvents, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllBlockedEvents(DslList dslList, Iterable iterable) {
            this._builder.addAllBlockedEvents(iterable);
        }

        /* renamed from: addAllowedEvents, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllowedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            this._builder.addAllowedEvents(diagnosticEventType);
        }

        /* renamed from: addBlockedEvents, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignBlockedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            this._builder.addBlockedEvents(diagnosticEventType);
        }

        public final /* synthetic */ void clearAllowedEvents(DslList dslList) {
            this._builder.clearAllowedEvents();
        }

        public final /* synthetic */ void clearBlockedEvents(DslList dslList) {
            this._builder.clearBlockedEvents();
        }

        public final void clearEnabled() {
            this._builder.clearEnabled();
        }

        public final void clearMaxBatchIntervalMs() {
            this._builder.clearMaxBatchIntervalMs();
        }

        public final void clearMaxBatchSize() {
            this._builder.clearMaxBatchSize();
        }

        public final void clearSeverity() {
            this._builder.clearSeverity();
        }

        public final void clearTtmEnabled() {
            this._builder.clearTtmEnabled();
        }

        public final /* synthetic */ DslList getAllowedEvents() {
            return new DslList(this._builder.getAllowedEventsList());
        }

        public final /* synthetic */ DslList getBlockedEvents() {
            return new DslList(this._builder.getBlockedEventsList());
        }

        public final boolean getEnabled() {
            return this._builder.getEnabled();
        }

        public final int getMaxBatchIntervalMs() {
            return this._builder.getMaxBatchIntervalMs();
        }

        public final int getMaxBatchSize() {
            return this._builder.getMaxBatchSize();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            return this._builder.getSeverity();
        }

        public final int getSeverityValue() {
            return this._builder.getSeverityValue();
        }

        public final boolean getTtmEnabled() {
            return this._builder.getTtmEnabled();
        }

        public final /* synthetic */ void setAllowedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            this._builder.setAllowedEvents(i, diagnosticEventType);
        }

        public final /* synthetic */ void setBlockedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            this._builder.setBlockedEvents(i, diagnosticEventType);
        }

        public final void setEnabled(boolean z) {
            this._builder.setEnabled(z);
        }

        public final void setMaxBatchIntervalMs(int i) {
            this._builder.setMaxBatchIntervalMs(i);
        }

        public final void setMaxBatchSize(int i) {
            this._builder.setMaxBatchSize(i);
        }

        public final void setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
            this._builder.setSeverity(diagnosticEventsSeverity);
        }

        public final void setSeverityValue(int i) {
            this._builder.setSeverityValue(i);
        }

        public final void setTtmEnabled(boolean z) {
            this._builder.setTtmEnabled(z);
        }

        private Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventsConfigurationKt() {
    }
}
