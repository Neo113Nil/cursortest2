package gatewayprotocol.v1;

import gatewayprotocol.v1.AdDataRefreshResponseKt;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AdDataRefreshResponseKt.kt */
/* loaded from: classes8.dex */
public final class AdDataRefreshResponseKtKt {
    /* renamed from: -initializeadDataRefreshResponse, reason: not valid java name */
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse m207initializeadDataRefreshResponse(izs<? super AdDataRefreshResponseKt.Dsl, s3q0> izsVar) {
        AdDataRefreshResponseKt.Dsl _create = AdDataRefreshResponseKt.Dsl.Companion._create(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse copy(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse, izs<? super AdDataRefreshResponseKt.Dsl, s3q0> izsVar) {
        AdDataRefreshResponseKt.Dsl _create = AdDataRefreshResponseKt.Dsl.Companion._create(adDataRefreshResponse.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        if (adDataRefreshResponseOrBuilder.hasCampaignMetadata()) {
            return adDataRefreshResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        if (adDataRefreshResponseOrBuilder.hasError()) {
            return adDataRefreshResponseOrBuilder.getError();
        }
        return null;
    }
}
