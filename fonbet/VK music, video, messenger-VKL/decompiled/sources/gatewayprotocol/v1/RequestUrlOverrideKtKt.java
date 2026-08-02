package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.RequestUrlOverrideKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: RequestUrlOverrideKt.kt */
/* loaded from: classes8.dex */
public final class RequestUrlOverrideKtKt {
    /* renamed from: -initializerequestUrlOverride, reason: not valid java name */
    public static final InitializationResponseOuterClass.RequestUrlOverride m265initializerequestUrlOverride(izs<? super RequestUrlOverrideKt.Dsl, s3q0> izsVar) {
        RequestUrlOverrideKt.Dsl _create = RequestUrlOverrideKt.Dsl.Companion._create(InitializationResponseOuterClass.RequestUrlOverride.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final InitializationResponseOuterClass.RequestUrlOverride copy(InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride, izs<? super RequestUrlOverrideKt.Dsl, s3q0> izsVar) {
        RequestUrlOverrideKt.Dsl _create = RequestUrlOverrideKt.Dsl.Companion._create(requestUrlOverride.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
