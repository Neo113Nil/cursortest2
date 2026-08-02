package gatewayprotocol.v1;

import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseKt;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: RewardedOffersResponseKt.kt */
/* loaded from: classes8.dex */
public final class RewardedOffersResponseKtKt {
    /* renamed from: -initializerewardedOffersResponse, reason: not valid java name */
    public static final RewardedOffersResponseOuterClass.RewardedOffersResponse m267initializerewardedOffersResponse(izs<? super RewardedOffersResponseKt.Dsl, s3q0> izsVar) {
        RewardedOffersResponseKt.Dsl _create = RewardedOffersResponseKt.Dsl.Companion._create(RewardedOffersResponseOuterClass.RewardedOffersResponse.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final RewardedOffersResponseOuterClass.RewardedOffersResponse copy(RewardedOffersResponseOuterClass.RewardedOffersResponse rewardedOffersResponse, izs<? super RewardedOffersResponseKt.Dsl, s3q0> izsVar) {
        RewardedOffersResponseKt.Dsl _create = RewardedOffersResponseKt.Dsl.Companion._create(rewardedOffersResponse.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder rewardedOffersResponseOrBuilder) {
        if (rewardedOffersResponseOrBuilder.hasError()) {
            return rewardedOffersResponseOrBuilder.getError();
        }
        return null;
    }
}
