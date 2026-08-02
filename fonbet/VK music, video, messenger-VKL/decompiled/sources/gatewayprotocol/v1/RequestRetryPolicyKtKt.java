package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: RequestRetryPolicyKt.kt */
/* loaded from: classes8.dex */
public final class RequestRetryPolicyKtKt {
    /* renamed from: -initializerequestRetryPolicy, reason: not valid java name */
    public static final NativeConfigurationOuterClass.RequestRetryPolicy m263initializerequestRetryPolicy(izs<? super RequestRetryPolicyKt.Dsl, s3q0> izsVar) {
        RequestRetryPolicyKt.Dsl _create = RequestRetryPolicyKt.Dsl.Companion._create(NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestRetryPolicy copy(NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy, izs<? super RequestRetryPolicyKt.Dsl, s3q0> izsVar) {
        RequestRetryPolicyKt.Dsl _create = RequestRetryPolicyKt.Dsl.Companion._create(requestRetryPolicy.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
