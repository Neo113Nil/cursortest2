package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: InitializationDeviceInfoKt.kt */
/* loaded from: classes8.dex */
public final class InitializationDeviceInfoKtKt {
    /* renamed from: -initializeinitializationDeviceInfo, reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationDeviceInfo m243initializeinitializationDeviceInfo(izs<? super InitializationDeviceInfoKt.Dsl, s3q0> izsVar) {
        InitializationDeviceInfoKt.Dsl _create = InitializationDeviceInfoKt.Dsl.Companion._create(InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo copy(InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo, izs<? super InitializationDeviceInfoKt.Dsl, s3q0> izsVar) {
        InitializationDeviceInfoKt.Dsl _create = InitializationDeviceInfoKt.Dsl.Companion._create(initializationDeviceInfo.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
