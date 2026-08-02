package gatewayprotocol.v1;

import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: InitializationRequestKt.kt */
/* loaded from: classes8.dex */
public final class InitializationRequestKtKt {
    /* renamed from: -initializeinitializationRequest, reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationRequest m244initializeinitializationRequest(izs<? super InitializationRequestKt.Dsl, s3q0> izsVar) {
        InitializationRequestKt.Dsl _create = InitializationRequestKt.Dsl.Companion._create(InitializationRequestOuterClass.InitializationRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest copy(InitializationRequestOuterClass.InitializationRequest initializationRequest, izs<? super InitializationRequestKt.Dsl, s3q0> izsVar) {
        InitializationRequestKt.Dsl _create = InitializationRequestKt.Dsl.Companion._create(initializationRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        if (initializationRequestOrBuilder.hasClientInfo()) {
            return initializationRequestOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        if (initializationRequestOrBuilder.hasDeviceInfo()) {
            return initializationRequestOrBuilder.getDeviceInfo();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.InstallReferrer getInstallReferrerOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        if (initializationRequestOrBuilder.hasInstallReferrer()) {
            return initializationRequestOrBuilder.getInstallReferrer();
        }
        return null;
    }
}
