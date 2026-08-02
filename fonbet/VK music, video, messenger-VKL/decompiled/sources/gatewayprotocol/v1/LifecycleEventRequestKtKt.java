package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.LifecycleEventRequestKt;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: LifecycleEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class LifecycleEventRequestKtKt {
    /* renamed from: -initializelifecycleEventRequest, reason: not valid java name */
    public static final LifecycleEventRequestOuterClass.LifecycleEventRequest m247initializelifecycleEventRequest(izs<? super LifecycleEventRequestKt.Dsl, s3q0> izsVar) {
        LifecycleEventRequestKt.Dsl _create = LifecycleEventRequestKt.Dsl.Companion._create(LifecycleEventRequestOuterClass.LifecycleEventRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final LifecycleEventRequestOuterClass.LifecycleEventRequest copy(LifecycleEventRequestOuterClass.LifecycleEventRequest lifecycleEventRequest, izs<? super LifecycleEventRequestKt.Dsl, s3q0> izsVar) {
        LifecycleEventRequestKt.Dsl _create = LifecycleEventRequestKt.Dsl.Companion._create(lifecycleEventRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder lifecycleEventRequestOrBuilder) {
        if (lifecycleEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return lifecycleEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder lifecycleEventRequestOrBuilder) {
        if (lifecycleEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return lifecycleEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
