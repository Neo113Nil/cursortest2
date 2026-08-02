package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignMetadataKt;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CampaignMetadataKt.kt */
/* loaded from: classes8.dex */
public final class CampaignMetadataKtKt {
    /* renamed from: -initializecampaignMetadata, reason: not valid java name */
    public static final CampaignMetadataOuterClass.CampaignMetadata m222initializecampaignMetadata(izs<? super CampaignMetadataKt.Dsl, s3q0> izsVar) {
        CampaignMetadataKt.Dsl _create = CampaignMetadataKt.Dsl.Companion._create(CampaignMetadataOuterClass.CampaignMetadata.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata copy(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata, izs<? super CampaignMetadataKt.Dsl, s3q0> izsVar) {
        CampaignMetadataKt.Dsl _create = CampaignMetadataKt.Dsl.Companion._create(campaignMetadata.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
