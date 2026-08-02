package gatewayprotocol.v1;

import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseKt;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: InitializationResponseKt.kt */
/* loaded from: classes8.dex */
public final class InitializationResponseKtKt {
    /* renamed from: -initializeinitializationResponse, reason: not valid java name */
    public static final InitializationResponseOuterClass.InitializationResponse m245initializeinitializationResponse(izs<? super InitializationResponseKt.Dsl, s3q0> izsVar) {
        InitializationResponseKt.Dsl _create = InitializationResponseKt.Dsl.Companion._create(InitializationResponseOuterClass.InitializationResponse.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final InitializationResponseOuterClass.InitializationResponse copy(InitializationResponseOuterClass.InitializationResponse initializationResponse, izs<? super InitializationResponseKt.Dsl, s3q0> izsVar) {
        InitializationResponseKt.Dsl _create = InitializationResponseKt.Dsl.Companion._create(initializationResponse.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        if (initializationResponseOrBuilder.hasError()) {
            return initializationResponseOrBuilder.getError();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.NativeConfiguration getNativeConfigurationOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        if (initializationResponseOrBuilder.hasNativeConfiguration()) {
            return initializationResponseOrBuilder.getNativeConfiguration();
        }
        return null;
    }
}
