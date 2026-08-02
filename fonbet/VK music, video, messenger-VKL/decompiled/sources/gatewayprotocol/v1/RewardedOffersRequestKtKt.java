package gatewayprotocol.v1;

import gatewayprotocol.v1.RewardedOffersRequestKt;
import gatewayprotocol.v1.RewardedOffersRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: RewardedOffersRequestKt.kt */
/* loaded from: classes8.dex */
public final class RewardedOffersRequestKtKt {
    /* renamed from: -initializerewardedOffersRequest, reason: not valid java name */
    public static final RewardedOffersRequestOuterClass.RewardedOffersRequest m266initializerewardedOffersRequest(izs<? super RewardedOffersRequestKt.Dsl, s3q0> izsVar) {
        RewardedOffersRequestKt.Dsl _create = RewardedOffersRequestKt.Dsl.Companion._create(RewardedOffersRequestOuterClass.RewardedOffersRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final RewardedOffersRequestOuterClass.RewardedOffersRequest copy(RewardedOffersRequestOuterClass.RewardedOffersRequest rewardedOffersRequest, izs<? super RewardedOffersRequestKt.Dsl, s3q0> izsVar) {
        RewardedOffersRequestKt.Dsl _create = RewardedOffersRequestKt.Dsl.Companion._create(rewardedOffersRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
