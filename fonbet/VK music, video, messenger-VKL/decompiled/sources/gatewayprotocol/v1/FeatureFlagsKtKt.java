package gatewayprotocol.v1;

import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: FeatureFlagsKt.kt */
/* loaded from: classes8.dex */
public final class FeatureFlagsKtKt {
    /* renamed from: -initializefeatureFlags, reason: not valid java name */
    public static final NativeConfigurationOuterClass.FeatureFlags m237initializefeatureFlags(izs<? super FeatureFlagsKt.Dsl, s3q0> izsVar) {
        FeatureFlagsKt.Dsl _create = FeatureFlagsKt.Dsl.Companion._create(NativeConfigurationOuterClass.FeatureFlags.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.FeatureFlags copy(NativeConfigurationOuterClass.FeatureFlags featureFlags, izs<? super FeatureFlagsKt.Dsl, s3q0> izsVar) {
        FeatureFlagsKt.Dsl _create = FeatureFlagsKt.Dsl.Companion._create(featureFlags.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
