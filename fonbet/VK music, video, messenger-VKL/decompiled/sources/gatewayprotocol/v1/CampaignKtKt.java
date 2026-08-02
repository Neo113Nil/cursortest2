package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CampaignKt.kt */
/* loaded from: classes8.dex */
public final class CampaignKtKt {
    /* renamed from: -initializecampaign, reason: not valid java name */
    public static final CampaignStateOuterClass.Campaign m221initializecampaign(izs<? super CampaignKt.Dsl, s3q0> izsVar) {
        CampaignKt.Dsl _create = CampaignKt.Dsl.Companion._create(CampaignStateOuterClass.Campaign.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.Campaign copy(CampaignStateOuterClass.Campaign campaign, izs<? super CampaignKt.Dsl, s3q0> izsVar) {
        CampaignKt.Dsl _create = CampaignKt.Dsl.Companion._create(campaign.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps getLoadTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        if (campaignOrBuilder.hasLoadTimestamp()) {
            return campaignOrBuilder.getLoadTimestamp();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getShowTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        if (campaignOrBuilder.hasShowTimestamp()) {
            return campaignOrBuilder.getShowTimestamp();
        }
        return null;
    }
}
