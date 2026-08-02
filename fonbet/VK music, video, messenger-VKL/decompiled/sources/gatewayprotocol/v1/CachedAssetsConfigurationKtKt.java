package gatewayprotocol.v1;

import gatewayprotocol.v1.CachedAssetsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CachedAssetsConfigurationKt.kt */
/* loaded from: classes8.dex */
public final class CachedAssetsConfigurationKtKt {
    /* renamed from: -initializecachedAssetsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration m219initializecachedAssetsConfiguration(izs<? super CachedAssetsConfigurationKt.Dsl, s3q0> izsVar) {
        CachedAssetsConfigurationKt.Dsl _create = CachedAssetsConfigurationKt.Dsl.Companion._create(NativeConfigurationOuterClass.CachedAssetsConfiguration.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration copy(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration, izs<? super CachedAssetsConfigurationKt.Dsl, s3q0> izsVar) {
        CachedAssetsConfigurationKt.Dsl _create = CachedAssetsConfigurationKt.Dsl.Companion._create(cachedAssetsConfiguration.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
