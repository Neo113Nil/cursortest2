package gatewayprotocol.v1;

import gatewayprotocol.v1.PrivacyUpdateRequestKt;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: PrivacyUpdateRequestKt.kt */
/* loaded from: classes8.dex */
public final class PrivacyUpdateRequestKtKt {
    /* renamed from: -initializeprivacyUpdateRequest, reason: not valid java name */
    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest m260initializeprivacyUpdateRequest(izs<? super PrivacyUpdateRequestKt.Dsl, s3q0> izsVar) {
        PrivacyUpdateRequestKt.Dsl _create = PrivacyUpdateRequestKt.Dsl.Companion._create(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest copy(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest, izs<? super PrivacyUpdateRequestKt.Dsl, s3q0> izsVar) {
        PrivacyUpdateRequestKt.Dsl _create = PrivacyUpdateRequestKt.Dsl.Companion._create(privacyUpdateRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
