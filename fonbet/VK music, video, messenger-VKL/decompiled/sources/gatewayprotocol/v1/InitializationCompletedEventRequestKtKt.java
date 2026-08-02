package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestKt;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: InitializationCompletedEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class InitializationCompletedEventRequestKtKt {
    /* renamed from: -initializeinitializationCompletedEventRequest, reason: not valid java name */
    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest m241initializeinitializationCompletedEventRequest(izs<? super InitializationCompletedEventRequestKt.Dsl, s3q0> izsVar) {
        InitializationCompletedEventRequestKt.Dsl _create = InitializationCompletedEventRequestKt.Dsl.Companion._create(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest copy(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest, izs<? super InitializationCompletedEventRequestKt.Dsl, s3q0> izsVar) {
        InitializationCompletedEventRequestKt.Dsl _create = InitializationCompletedEventRequestKt.Dsl.Companion._create(initializationCompletedEventRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder initializationCompletedEventRequestOrBuilder) {
        if (initializationCompletedEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return initializationCompletedEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder initializationCompletedEventRequestOrBuilder) {
        if (initializationCompletedEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return initializationCompletedEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
