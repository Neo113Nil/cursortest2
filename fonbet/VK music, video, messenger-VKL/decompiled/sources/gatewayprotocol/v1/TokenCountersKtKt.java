package gatewayprotocol.v1;

import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.TokenCountersKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TokenCountersKt.kt */
/* loaded from: classes8.dex */
public final class TokenCountersKtKt {
    /* renamed from: -initializetokenCounters, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.TokenCounters m275initializetokenCounters(izs<? super TokenCountersKt.Dsl, s3q0> izsVar) {
        TokenCountersKt.Dsl _create = TokenCountersKt.Dsl.Companion._create(HeaderBiddingTokenOuterClass.TokenCounters.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters copy(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters, izs<? super TokenCountersKt.Dsl, s3q0> izsVar) {
        TokenCountersKt.Dsl _create = TokenCountersKt.Dsl.Companion._create(tokenCounters.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
