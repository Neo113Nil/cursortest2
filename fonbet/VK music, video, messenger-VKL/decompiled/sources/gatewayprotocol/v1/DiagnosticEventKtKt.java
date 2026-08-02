package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DiagnosticEventKt.kt */
/* loaded from: classes8.dex */
public final class DiagnosticEventKtKt {
    /* renamed from: -initializediagnosticEvent, reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent m228initializediagnosticEvent(izs<? super DiagnosticEventKt.Dsl, s3q0> izsVar) {
        DiagnosticEventKt.Dsl _create = DiagnosticEventKt.Dsl.Companion._create(DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent copy(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent, izs<? super DiagnosticEventKt.Dsl, s3q0> izsVar) {
        DiagnosticEventKt.Dsl _create = DiagnosticEventKt.Dsl.Companion._create(diagnosticEvent.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder diagnosticEventOrBuilder) {
        if (diagnosticEventOrBuilder.hasTimestamps()) {
            return diagnosticEventOrBuilder.getTimestamps();
        }
        return null;
    }
}
