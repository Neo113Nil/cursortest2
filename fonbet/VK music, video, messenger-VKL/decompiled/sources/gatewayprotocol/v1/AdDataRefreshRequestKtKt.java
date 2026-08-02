package gatewayprotocol.v1;

import gatewayprotocol.v1.AdDataRefreshRequestKt;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AdDataRefreshRequestKt.kt */
/* loaded from: classes8.dex */
public final class AdDataRefreshRequestKtKt {
    /* renamed from: -initializeadDataRefreshRequest, reason: not valid java name */
    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest m206initializeadDataRefreshRequest(izs<? super AdDataRefreshRequestKt.Dsl, s3q0> izsVar) {
        AdDataRefreshRequestKt.Dsl _create = AdDataRefreshRequestKt.Dsl.Companion._create(AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest copy(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest, izs<? super AdDataRefreshRequestKt.Dsl, s3q0> izsVar) {
        AdDataRefreshRequestKt.Dsl _create = AdDataRefreshRequestKt.Dsl.Companion._create(adDataRefreshRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        if (adDataRefreshRequestOrBuilder.hasCampaignState()) {
            return adDataRefreshRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        if (adDataRefreshRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adDataRefreshRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        if (adDataRefreshRequestOrBuilder.hasSessionCounters()) {
            return adDataRefreshRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        if (adDataRefreshRequestOrBuilder.hasStaticDeviceInfo()) {
            return adDataRefreshRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
