package gatewayprotocol.v1;

import gatewayprotocol.v1.DebugSettingsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DebugSettingsKt.kt */
/* loaded from: classes8.dex */
public final class DebugSettingsKtKt {
    /* renamed from: -initializedebugSettings, reason: not valid java name */
    public static final NativeConfigurationOuterClass.DebugSettings m225initializedebugSettings(izs<? super DebugSettingsKt.Dsl, s3q0> izsVar) {
        DebugSettingsKt.Dsl _create = DebugSettingsKt.Dsl.Companion._create(NativeConfigurationOuterClass.DebugSettings.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.DebugSettings copy(NativeConfigurationOuterClass.DebugSettings debugSettings, izs<? super DebugSettingsKt.Dsl, s3q0> izsVar) {
        DebugSettingsKt.Dsl _create = DebugSettingsKt.Dsl.Companion._create(debugSettings.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
