package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import xsna.zcl;

/* compiled from: CampaignKt.kt */
/* loaded from: classes8.dex */
public final class CampaignKt {
    public static final CampaignKt INSTANCE = new CampaignKt();

    /* compiled from: CampaignKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.Campaign.Builder _builder;

        /* compiled from: CampaignKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.Campaign.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.Campaign.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.Campaign _build() {
            return this._builder.build();
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        public final ByteString getData() {
            return this._builder.getData();
        }

        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        public final ByteString getImpressionOpportunityId() {
            return this._builder.getImpressionOpportunityId();
        }

        public final TimestampsOuterClass.Timestamps getLoadTimestamp() {
            return this._builder.getLoadTimestamp();
        }

        public final String getPlacementId() {
            return this._builder.getPlacementId();
        }

        public final TimestampsOuterClass.Timestamps getShowTimestamp() {
            return this._builder.getShowTimestamp();
        }

        public final TimestampsOuterClass.Timestamps getShowTimestampOrNull(Dsl dsl) {
            return CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        public final void setData(ByteString byteString) {
            this._builder.setData(byteString);
        }

        public final void setDataVersion(int i) {
            this._builder.setDataVersion(i);
        }

        public final void setImpressionOpportunityId(ByteString byteString) {
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setLoadTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            this._builder.setLoadTimestamp(timestamps);
        }

        public final void setPlacementId(String str) {
            this._builder.setPlacementId(str);
        }

        public final void setShowTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            this._builder.setShowTimestamp(timestamps);
        }

        private Dsl(CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignKt() {
    }
}
