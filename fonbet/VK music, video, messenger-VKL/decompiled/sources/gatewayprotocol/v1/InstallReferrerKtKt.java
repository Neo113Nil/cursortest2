package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: InstallReferrerKt.kt */
/* loaded from: classes8.dex */
public final class InstallReferrerKtKt {
    /* renamed from: -initializeinstallReferrer, reason: not valid java name */
    public static final InitializationRequestOuterClass.InstallReferrer m246initializeinstallReferrer(izs<? super InstallReferrerKt.Dsl, s3q0> izsVar) {
        InstallReferrerKt.Dsl _create = InstallReferrerKt.Dsl.Companion._create(InitializationRequestOuterClass.InstallReferrer.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InstallReferrer copy(InitializationRequestOuterClass.InstallReferrer installReferrer, izs<? super InstallReferrerKt.Dsl, s3q0> izsVar) {
        InstallReferrerKt.Dsl _create = InstallReferrerKt.Dsl.Companion._create(installReferrer.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
