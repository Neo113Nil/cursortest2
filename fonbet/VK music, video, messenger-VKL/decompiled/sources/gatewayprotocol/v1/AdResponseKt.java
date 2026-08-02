package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import xsna.zcl;

/* compiled from: AdResponseKt.kt */
/* loaded from: classes8.dex */
public final class AdResponseKt {
    public static final AdResponseKt INSTANCE = new AdResponseKt();

    /* compiled from: AdResponseKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdResponseOuterClass.AdResponse.Builder _builder;

        /* compiled from: AdResponseKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdResponseOuterClass.AdResponse.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdResponseOuterClass.AdResponse.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ AdResponseOuterClass.AdResponse _build() {
            return this._builder.build();
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearCampaignMetadata() {
            this._builder.clearCampaignMetadata();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearImpressionConfiguration() {
            this._builder.clearImpressionConfiguration();
        }

        public final void clearImpressionConfigurationVersion() {
            this._builder.clearImpressionConfigurationVersion();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        public final void clearWebviewConfiguration() {
            this._builder.clearWebviewConfiguration();
        }

        public final ByteString getAdData() {
            return this._builder.getAdData();
        }

        public final ByteString getAdDataRefreshToken() {
            return this._builder.getAdDataRefreshToken();
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
            return this._builder.getCampaignMetadata();
        }

        public final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(Dsl dsl) {
            return AdResponseKtKt.getCampaignMetadataOrNull(dsl._builder);
        }

        public final ErrorOuterClass.Error getError() {
            return this._builder.getError();
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            return AdResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final ByteString getImpressionConfiguration() {
            return this._builder.getImpressionConfiguration();
        }

        public final int getImpressionConfigurationVersion() {
            return this._builder.getImpressionConfigurationVersion();
        }

        public final ByteString getTrackingToken() {
            return this._builder.getTrackingToken();
        }

        public final WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            return this._builder.getWebviewConfiguration();
        }

        public final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(Dsl dsl) {
            return AdResponseKtKt.getWebviewConfigurationOrNull(dsl._builder);
        }

        public final boolean hasCampaignMetadata() {
            return this._builder.hasCampaignMetadata();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasWebviewConfiguration() {
            return this._builder.hasWebviewConfiguration();
        }

        public final void setAdData(ByteString byteString) {
            this._builder.setAdData(byteString);
        }

        public final void setAdDataRefreshToken(ByteString byteString) {
            this._builder.setAdDataRefreshToken(byteString);
        }

        public final void setAdDataVersion(int i) {
            this._builder.setAdDataVersion(i);
        }

        public final void setCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
            this._builder.setCampaignMetadata(campaignMetadata);
        }

        public final void setError(ErrorOuterClass.Error error) {
            this._builder.setError(error);
        }

        public final void setImpressionConfiguration(ByteString byteString) {
            this._builder.setImpressionConfiguration(byteString);
        }

        public final void setImpressionConfigurationVersion(int i) {
            this._builder.setImpressionConfigurationVersion(i);
        }

        public final void setTrackingToken(ByteString byteString) {
            this._builder.setTrackingToken(byteString);
        }

        public final void setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            this._builder.setWebviewConfiguration(webViewConfiguration);
        }

        private Dsl(AdResponseOuterClass.AdResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private AdResponseKt() {
    }
}
