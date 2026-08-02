package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DiagnosticEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class DiagnosticEventRequestKtKt {
    /* renamed from: -initializediagnosticEventRequest, reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest m229initializediagnosticEventRequest(izs<? super DiagnosticEventRequestKt.Dsl, s3q0> izsVar) {
        DiagnosticEventRequestKt.Dsl _create = DiagnosticEventRequestKt.Dsl.Companion._create(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest copy(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest, izs<? super DiagnosticEventRequestKt.Dsl, s3q0> izsVar) {
        DiagnosticEventRequestKt.Dsl _create = DiagnosticEventRequestKt.Dsl.Companion._create(diagnosticEventRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
