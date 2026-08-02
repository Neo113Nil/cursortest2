package gatewayprotocol.v1;

import gatewayprotocol.v1.AdPlayerConfigResponseKt;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AdPlayerConfigResponseKt.kt */
/* loaded from: classes8.dex */
public final class AdPlayerConfigResponseKtKt {
    /* renamed from: -initializeadPlayerConfigResponse, reason: not valid java name */
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse m210initializeadPlayerConfigResponse(izs<? super AdPlayerConfigResponseKt.Dsl, s3q0> izsVar) {
        AdPlayerConfigResponseKt.Dsl _create = AdPlayerConfigResponseKt.Dsl.Companion._create(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse copy(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse, izs<? super AdPlayerConfigResponseKt.Dsl, s3q0> izsVar) {
        AdPlayerConfigResponseKt.Dsl _create = AdPlayerConfigResponseKt.Dsl.Companion._create(adPlayerConfigResponse.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        if (adPlayerConfigResponseOrBuilder.hasCampaignMetadata()) {
            return adPlayerConfigResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        if (adPlayerConfigResponseOrBuilder.hasError()) {
            return adPlayerConfigResponseOrBuilder.getError();
        }
        return null;
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        if (adPlayerConfigResponseOrBuilder.hasWebviewConfiguration()) {
            return adPlayerConfigResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }
}
