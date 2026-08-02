package gatewayprotocol.v1;

import gatewayprotocol.v1.AdRevenueEventRequestKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AdRevenueEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class AdRevenueEventRequestKtKt {
    /* renamed from: -initializeadRevenueEventRequest, reason: not valid java name */
    public static final AdRevenueEventRequestOuterClass.AdRevenueEventRequest m214initializeadRevenueEventRequest(izs<? super AdRevenueEventRequestKt.Dsl, s3q0> izsVar) {
        AdRevenueEventRequestKt.Dsl _create = AdRevenueEventRequestKt.Dsl.Companion._create(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueEventRequest copy(AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest, izs<? super AdRevenueEventRequestKt.Dsl, s3q0> izsVar) {
        AdRevenueEventRequestKt.Dsl _create = AdRevenueEventRequestKt.Dsl.Companion._create(adRevenueEventRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueData getAdRevenueDataOrNull(AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder adRevenueEventRequestOrBuilder) {
        if (adRevenueEventRequestOrBuilder.hasAdRevenueData()) {
            return adRevenueEventRequestOrBuilder.getAdRevenueData();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder adRevenueEventRequestOrBuilder) {
        if (adRevenueEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRevenueEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder adRevenueEventRequestOrBuilder) {
        if (adRevenueEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRevenueEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
