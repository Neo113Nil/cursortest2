package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationDataKt;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: InitializationDataKt.kt */
/* loaded from: classes8.dex */
public final class InitializationDataKtKt {
    /* renamed from: -initializeinitializationData, reason: not valid java name */
    public static final InitializationDataOuterClass.InitializationData m242initializeinitializationData(izs<? super InitializationDataKt.Dsl, s3q0> izsVar) {
        InitializationDataKt.Dsl _create = InitializationDataKt.Dsl.Companion._create(InitializationDataOuterClass.InitializationData.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final InitializationDataOuterClass.InitializationData copy(InitializationDataOuterClass.InitializationData initializationData, izs<? super InitializationDataKt.Dsl, s3q0> izsVar) {
        InitializationDataKt.Dsl _create = InitializationDataKt.Dsl.Companion._create(initializationData.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        if (initializationDataOrBuilder.hasInitializationRequest()) {
            return initializationDataOrBuilder.getInitializationRequest();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        if (initializationDataOrBuilder.hasSharedData()) {
            return initializationDataOrBuilder.getSharedData();
        }
        return null;
    }
}
