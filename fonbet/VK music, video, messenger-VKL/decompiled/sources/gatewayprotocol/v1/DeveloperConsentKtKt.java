package gatewayprotocol.v1;

import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DeveloperConsentKt.kt */
/* loaded from: classes8.dex */
public final class DeveloperConsentKtKt {
    /* renamed from: -initializedeveloperConsent, reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsent m226initializedeveloperConsent(izs<? super DeveloperConsentKt.Dsl, s3q0> izsVar) {
        DeveloperConsentKt.Dsl _create = DeveloperConsentKt.Dsl.Companion._create(DeveloperConsentOuterClass.DeveloperConsent.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsent copy(DeveloperConsentOuterClass.DeveloperConsent developerConsent, izs<? super DeveloperConsentKt.Dsl, s3q0> izsVar) {
        DeveloperConsentKt.Dsl _create = DeveloperConsentKt.Dsl.Companion._create(developerConsent.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
