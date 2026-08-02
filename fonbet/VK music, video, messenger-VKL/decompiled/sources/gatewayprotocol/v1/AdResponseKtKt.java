package gatewayprotocol.v1;

import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AdResponseKt.kt */
/* loaded from: classes8.dex */
public final class AdResponseKtKt {
    /* renamed from: -initializeadResponse, reason: not valid java name */
    public static final AdResponseOuterClass.AdResponse m212initializeadResponse(izs<? super AdResponseKt.Dsl, s3q0> izsVar) {
        AdResponseKt.Dsl _create = AdResponseKt.Dsl.Companion._create(AdResponseOuterClass.AdResponse.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AdResponseOuterClass.AdResponse copy(AdResponseOuterClass.AdResponse adResponse, izs<? super AdResponseKt.Dsl, s3q0> izsVar) {
        AdResponseKt.Dsl _create = AdResponseKt.Dsl.Companion._create(adResponse.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        if (adResponseOrBuilder.hasCampaignMetadata()) {
            return adResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        if (adResponseOrBuilder.hasError()) {
            return adResponseOrBuilder.getError();
        }
        return null;
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        if (adResponseOrBuilder.hasWebviewConfiguration()) {
            return adResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }
}
