package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: RequestTimeoutPolicyKt.kt */
/* loaded from: classes8.dex */
public final class RequestTimeoutPolicyKtKt {
    /* renamed from: -initializerequestTimeoutPolicy, reason: not valid java name */
    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy m264initializerequestTimeoutPolicy(izs<? super RequestTimeoutPolicyKt.Dsl, s3q0> izsVar) {
        RequestTimeoutPolicyKt.Dsl _create = RequestTimeoutPolicyKt.Dsl.Companion._create(NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy copy(NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy, izs<? super RequestTimeoutPolicyKt.Dsl, s3q0> izsVar) {
        RequestTimeoutPolicyKt.Dsl _create = RequestTimeoutPolicyKt.Dsl.Companion._create(requestTimeoutPolicy.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
