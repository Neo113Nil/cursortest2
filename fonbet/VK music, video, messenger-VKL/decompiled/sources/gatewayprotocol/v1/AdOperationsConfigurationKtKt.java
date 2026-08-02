package gatewayprotocol.v1;

import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AdOperationsConfigurationKt.kt */
/* loaded from: classes8.dex */
public final class AdOperationsConfigurationKtKt {
    /* renamed from: -initializeadOperationsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.AdOperationsConfiguration m208initializeadOperationsConfiguration(izs<? super AdOperationsConfigurationKt.Dsl, s3q0> izsVar) {
        AdOperationsConfigurationKt.Dsl _create = AdOperationsConfigurationKt.Dsl.Companion._create(NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.AdOperationsConfiguration copy(NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration, izs<? super AdOperationsConfigurationKt.Dsl, s3q0> izsVar) {
        AdOperationsConfigurationKt.Dsl _create = AdOperationsConfigurationKt.Dsl.Companion._create(adOperationsConfiguration.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
