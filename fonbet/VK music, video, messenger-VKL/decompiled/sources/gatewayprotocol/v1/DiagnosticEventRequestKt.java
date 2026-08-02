package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import xsna.zcl;

/* compiled from: DiagnosticEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class DiagnosticEventRequestKt {
    public static final DiagnosticEventRequestKt INSTANCE = new DiagnosticEventRequestKt();

    /* compiled from: DiagnosticEventRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder _builder;

        /* compiled from: DiagnosticEventRequestKt.kt */
        public static final class BatchProxy extends DslProxy {
            private BatchProxy() {
            }
        }

        /* compiled from: DiagnosticEventRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEventRequest _build() {
            return this._builder.build();
        }

        /* renamed from: addAllBatch, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllBatch(DslList dslList, Iterable iterable) {
            this._builder.addAllBatch(iterable);
        }

        /* renamed from: addBatch, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignBatch(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            this._builder.addBatch(diagnosticEvent);
        }

        public final /* synthetic */ void clearBatch(DslList dslList) {
            this._builder.clearBatch();
        }

        public final /* synthetic */ DslList getBatch() {
            return new DslList(this._builder.getBatchList());
        }

        public final /* synthetic */ void setBatch(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            this._builder.setBatch(i, diagnosticEvent);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventRequestKt() {
    }
}
