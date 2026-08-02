package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: RequestPolicyKt.kt */
/* loaded from: classes8.dex */
public final class RequestPolicyKtKt {
    /* renamed from: -initializerequestPolicy, reason: not valid java name */
    public static final NativeConfigurationOuterClass.RequestPolicy m262initializerequestPolicy(izs<? super RequestPolicyKt.Dsl, s3q0> izsVar) {
        RequestPolicyKt.Dsl _create = RequestPolicyKt.Dsl.Companion._create(NativeConfigurationOuterClass.RequestPolicy.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestPolicy copy(NativeConfigurationOuterClass.RequestPolicy requestPolicy, izs<? super RequestPolicyKt.Dsl, s3q0> izsVar) {
        RequestPolicyKt.Dsl _create = RequestPolicyKt.Dsl.Companion._create(requestPolicy.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicyOrNull(NativeConfigurationOuterClass.RequestPolicyOrBuilder requestPolicyOrBuilder) {
        if (requestPolicyOrBuilder.hasRetryPolicy()) {
            return requestPolicyOrBuilder.getRetryPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicyOrNull(NativeConfigurationOuterClass.RequestPolicyOrBuilder requestPolicyOrBuilder) {
        if (requestPolicyOrBuilder.hasTimeoutPolicy()) {
            return requestPolicyOrBuilder.getTimeoutPolicy();
        }
        return null;
    }
}
