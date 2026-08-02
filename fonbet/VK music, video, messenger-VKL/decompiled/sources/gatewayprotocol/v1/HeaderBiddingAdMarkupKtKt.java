package gatewayprotocol.v1;

import gatewayprotocol.v1.HeaderBiddingAdMarkupKt;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: HeaderBiddingAdMarkupKt.kt */
/* loaded from: classes8.dex */
public final class HeaderBiddingAdMarkupKtKt {
    /* renamed from: -initializeheaderBiddingAdMarkup, reason: not valid java name */
    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup m239initializeheaderBiddingAdMarkup(izs<? super HeaderBiddingAdMarkupKt.Dsl, s3q0> izsVar) {
        HeaderBiddingAdMarkupKt.Dsl _create = HeaderBiddingAdMarkupKt.Dsl.Companion._create(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup copy(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, izs<? super HeaderBiddingAdMarkupKt.Dsl, s3q0> izsVar) {
        HeaderBiddingAdMarkupKt.Dsl _create = HeaderBiddingAdMarkupKt.Dsl.Companion._create(headerBiddingAdMarkup.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
