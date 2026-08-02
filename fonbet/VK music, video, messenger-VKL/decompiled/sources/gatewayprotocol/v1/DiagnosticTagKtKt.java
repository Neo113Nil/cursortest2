package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticTagKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DiagnosticTagKt.kt */
/* loaded from: classes8.dex */
public final class DiagnosticTagKtKt {
    /* renamed from: -initializediagnosticTag, reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticTag m231initializediagnosticTag(izs<? super DiagnosticTagKt.Dsl, s3q0> izsVar) {
        DiagnosticTagKt.Dsl _create = DiagnosticTagKt.Dsl.Companion._create(DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticTag copy(DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag, izs<? super DiagnosticTagKt.Dsl, s3q0> izsVar) {
        DiagnosticTagKt.Dsl _create = DiagnosticTagKt.Dsl.Companion._create(diagnosticTag.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
