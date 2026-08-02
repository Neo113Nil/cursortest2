package gatewayprotocol.v1;

import gatewayprotocol.v1.MediationInfoKt;
import gatewayprotocol.v1.MediationInfoOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MediationInfoKt.kt */
/* loaded from: classes8.dex */
public final class MediationInfoKtKt {
    /* renamed from: -initializemediationInfo, reason: not valid java name */
    public static final MediationInfoOuterClass.MediationInfo m249initializemediationInfo(izs<? super MediationInfoKt.Dsl, s3q0> izsVar) {
        MediationInfoKt.Dsl _create = MediationInfoKt.Dsl.Companion._create(MediationInfoOuterClass.MediationInfo.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final MediationInfoOuterClass.MediationInfo copy(MediationInfoOuterClass.MediationInfo mediationInfo, izs<? super MediationInfoKt.Dsl, s3q0> izsVar) {
        MediationInfoKt.Dsl _create = MediationInfoKt.Dsl.Companion._create(mediationInfo.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
