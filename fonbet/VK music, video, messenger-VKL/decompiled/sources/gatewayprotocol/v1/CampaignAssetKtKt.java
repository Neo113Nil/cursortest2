package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignAssetKt;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CampaignAssetKt.kt */
/* loaded from: classes8.dex */
public final class CampaignAssetKtKt {
    /* renamed from: -initializecampaignAsset, reason: not valid java name */
    public static final CampaignMetadataOuterClass.CampaignAsset m220initializecampaignAsset(izs<? super CampaignAssetKt.Dsl, s3q0> izsVar) {
        CampaignAssetKt.Dsl _create = CampaignAssetKt.Dsl.Companion._create(CampaignMetadataOuterClass.CampaignAsset.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignAsset copy(CampaignMetadataOuterClass.CampaignAsset campaignAsset, izs<? super CampaignAssetKt.Dsl, s3q0> izsVar) {
        CampaignAssetKt.Dsl _create = CampaignAssetKt.Dsl.Companion._create(campaignAsset.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
