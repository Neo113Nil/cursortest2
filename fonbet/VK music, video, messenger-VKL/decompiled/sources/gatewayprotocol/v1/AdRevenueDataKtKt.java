package gatewayprotocol.v1;

import gatewayprotocol.v1.AdRevenueDataKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AdRevenueDataKt.kt */
/* loaded from: classes8.dex */
public final class AdRevenueDataKtKt {
    /* renamed from: -initializeadRevenueData, reason: not valid java name */
    public static final AdRevenueEventRequestOuterClass.AdRevenueData m213initializeadRevenueData(izs<? super AdRevenueDataKt.Dsl, s3q0> izsVar) {
        AdRevenueDataKt.Dsl _create = AdRevenueDataKt.Dsl.Companion._create(AdRevenueEventRequestOuterClass.AdRevenueData.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueData copy(AdRevenueEventRequestOuterClass.AdRevenueData adRevenueData, izs<? super AdRevenueDataKt.Dsl, s3q0> izsVar) {
        AdRevenueDataKt.Dsl _create = AdRevenueDataKt.Dsl.Companion._create(adRevenueData.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
