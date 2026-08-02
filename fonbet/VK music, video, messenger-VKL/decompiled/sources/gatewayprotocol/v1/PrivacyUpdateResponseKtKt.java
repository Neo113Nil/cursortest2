package gatewayprotocol.v1;

import gatewayprotocol.v1.PrivacyUpdateResponseKt;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: PrivacyUpdateResponseKt.kt */
/* loaded from: classes8.dex */
public final class PrivacyUpdateResponseKtKt {
    /* renamed from: -initializeprivacyUpdateResponse, reason: not valid java name */
    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse m261initializeprivacyUpdateResponse(izs<? super PrivacyUpdateResponseKt.Dsl, s3q0> izsVar) {
        PrivacyUpdateResponseKt.Dsl _create = PrivacyUpdateResponseKt.Dsl.Companion._create(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse copy(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse, izs<? super PrivacyUpdateResponseKt.Dsl, s3q0> izsVar) {
        PrivacyUpdateResponseKt.Dsl _create = PrivacyUpdateResponseKt.Dsl.Companion._create(privacyUpdateResponse.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
