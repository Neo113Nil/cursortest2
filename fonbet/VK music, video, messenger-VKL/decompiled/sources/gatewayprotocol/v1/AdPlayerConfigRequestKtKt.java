package gatewayprotocol.v1;

import gatewayprotocol.v1.AdPlayerConfigRequestKt;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AdPlayerConfigRequestKt.kt */
/* loaded from: classes8.dex */
public final class AdPlayerConfigRequestKtKt {
    /* renamed from: -initializeadPlayerConfigRequest, reason: not valid java name */
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest m209initializeadPlayerConfigRequest(izs<? super AdPlayerConfigRequestKt.Dsl, s3q0> izsVar) {
        AdPlayerConfigRequestKt.Dsl _create = AdPlayerConfigRequestKt.Dsl.Companion._create(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest copy(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest, izs<? super AdPlayerConfigRequestKt.Dsl, s3q0> izsVar) {
        AdPlayerConfigRequestKt.Dsl _create = AdPlayerConfigRequestKt.Dsl.Companion._create(adPlayerConfigRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder adPlayerConfigRequestOrBuilder) {
        if (adPlayerConfigRequestOrBuilder.hasMediationInfo()) {
            return adPlayerConfigRequestOrBuilder.getMediationInfo();
        }
        return null;
    }
}
