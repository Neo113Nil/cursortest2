package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CampaignStateKt.kt */
/* loaded from: classes8.dex */
public final class CampaignStateKtKt {
    /* renamed from: -initializecampaignState, reason: not valid java name */
    public static final CampaignStateOuterClass.CampaignState m223initializecampaignState(izs<? super CampaignStateKt.Dsl, s3q0> izsVar) {
        CampaignStateKt.Dsl _create = CampaignStateKt.Dsl.Companion._create(CampaignStateOuterClass.CampaignState.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState copy(CampaignStateOuterClass.CampaignState campaignState, izs<? super CampaignStateKt.Dsl, s3q0> izsVar) {
        CampaignStateKt.Dsl _create = CampaignStateKt.Dsl.Companion._create(campaignState.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
