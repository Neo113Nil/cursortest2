package gatewayprotocol.v1;

import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DeveloperConsentOptionKt.kt */
/* loaded from: classes8.dex */
public final class DeveloperConsentOptionKtKt {
    /* renamed from: -initializedeveloperConsentOption, reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsentOption m227initializedeveloperConsentOption(izs<? super DeveloperConsentOptionKt.Dsl, s3q0> izsVar) {
        DeveloperConsentOptionKt.Dsl _create = DeveloperConsentOptionKt.Dsl.Companion._create(DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsentOption copy(DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption, izs<? super DeveloperConsentOptionKt.Dsl, s3q0> izsVar) {
        DeveloperConsentOptionKt.Dsl _create = DeveloperConsentOptionKt.Dsl.Companion._create(developerConsentOption.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
