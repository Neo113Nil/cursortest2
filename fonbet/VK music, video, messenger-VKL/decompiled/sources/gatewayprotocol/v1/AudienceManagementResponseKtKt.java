package gatewayprotocol.v1;

import gatewayprotocol.v1.AudienceManagementResponseKt;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AudienceManagementResponseKt.kt */
/* loaded from: classes8.dex */
public final class AudienceManagementResponseKtKt {
    /* renamed from: -initializeaudienceManagementResponse, reason: not valid java name */
    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse m217initializeaudienceManagementResponse(izs<? super AudienceManagementResponseKt.Dsl, s3q0> izsVar) {
        AudienceManagementResponseKt.Dsl _create = AudienceManagementResponseKt.Dsl.Companion._create(AudienceManagementResponseOuterClass.AudienceManagementResponse.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse copy(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse, izs<? super AudienceManagementResponseKt.Dsl, s3q0> izsVar) {
        AudienceManagementResponseKt.Dsl _create = AudienceManagementResponseKt.Dsl.Companion._create(audienceManagementResponse.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder audienceManagementResponseOrBuilder) {
        if (audienceManagementResponseOrBuilder.hasError()) {
            return audienceManagementResponseOrBuilder.getError();
        }
        return null;
    }
}
