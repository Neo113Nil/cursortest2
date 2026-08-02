package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import xsna.zcl;

/* compiled from: AdDataRefreshResponseKt.kt */
/* loaded from: classes8.dex */
public final class AdDataRefreshResponseKt {
    public static final AdDataRefreshResponseKt INSTANCE = new AdDataRefreshResponseKt();

    /* compiled from: AdDataRefreshResponseKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder _builder;

        /* compiled from: AdDataRefreshResponseKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ AdDataRefreshResponseOuterClass.AdDataRefreshResponse _build() {
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

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
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
            return AdDataRefreshResponseKtKt.getCampaignMetadataOrNull(dsl._builder);
        }

        public final ErrorOuterClass.Error getError() {
            return this._builder.getError();
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            return AdDataRefreshResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final ByteString getTrackingToken() {
            return this._builder.getTrackingToken();
        }

        public final boolean hasCampaignMetadata() {
            return this._builder.hasCampaignMetadata();
        }

        public final boolean hasError() {
            return this._builder.hasError();
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

        public final void setTrackingToken(ByteString byteString) {
            this._builder.setTrackingToken(byteString);
        }

        private Dsl(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private AdDataRefreshResponseKt() {
    }
}
