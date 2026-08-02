package gatewayprotocol.v1;

import gatewayprotocol.v1.NetworkCapabilityTransportsKt;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: NetworkCapabilityTransportsKt.kt */
/* loaded from: classes8.dex */
public final class NetworkCapabilityTransportsKtKt {
    /* renamed from: -initializenetworkCapabilityTransports, reason: not valid java name */
    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports m255initializenetworkCapabilityTransports(izs<? super NetworkCapabilityTransportsKt.Dsl, s3q0> izsVar) {
        NetworkCapabilityTransportsKt.Dsl _create = NetworkCapabilityTransportsKt.Dsl.Companion._create(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports copy(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports, izs<? super NetworkCapabilityTransportsKt.Dsl, s3q0> izsVar) {
        NetworkCapabilityTransportsKt.Dsl _create = NetworkCapabilityTransportsKt.Dsl.Companion._create(networkCapabilityTransports.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
