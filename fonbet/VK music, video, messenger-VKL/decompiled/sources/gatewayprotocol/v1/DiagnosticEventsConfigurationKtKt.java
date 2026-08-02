package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DiagnosticEventsConfigurationKt.kt */
/* loaded from: classes8.dex */
public final class DiagnosticEventsConfigurationKtKt {
    /* renamed from: -initializediagnosticEventsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration m230initializediagnosticEventsConfiguration(izs<? super DiagnosticEventsConfigurationKt.Dsl, s3q0> izsVar) {
        DiagnosticEventsConfigurationKt.Dsl _create = DiagnosticEventsConfigurationKt.Dsl.Companion._create(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration copy(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration, izs<? super DiagnosticEventsConfigurationKt.Dsl, s3q0> izsVar) {
        DiagnosticEventsConfigurationKt.Dsl _create = DiagnosticEventsConfigurationKt.Dsl.Companion._create(diagnosticEventsConfiguration.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
