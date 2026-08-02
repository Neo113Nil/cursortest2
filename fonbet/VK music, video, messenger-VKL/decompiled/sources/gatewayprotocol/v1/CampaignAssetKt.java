package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import xsna.zcl;

/* compiled from: CampaignAssetKt.kt */
/* loaded from: classes8.dex */
public final class CampaignAssetKt {
    public static final CampaignAssetKt INSTANCE = new CampaignAssetKt();

    /* compiled from: CampaignAssetKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignMetadataOuterClass.CampaignAsset.Builder _builder;

        /* compiled from: CampaignAssetKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignMetadataOuterClass.CampaignAsset.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(CampaignMetadataOuterClass.CampaignAsset.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignMetadataOuterClass.CampaignAsset _build() {
            return this._builder.build();
        }

        public final void clearPriority() {
            this._builder.clearPriority();
        }

        public final void clearRequired() {
            this._builder.clearRequired();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final int getPriority() {
            return this._builder.getPriority();
        }

        public final boolean getRequired() {
            return this._builder.getRequired();
        }

        public final String getUrl() {
            return this._builder.getUrl();
        }

        public final void setPriority(int i) {
            this._builder.setPriority(i);
        }

        public final void setRequired(boolean z) {
            this._builder.setRequired(z);
        }

        public final void setUrl(String str) {
            this._builder.setUrl(str);
        }

        private Dsl(CampaignMetadataOuterClass.CampaignAsset.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignAssetKt() {
    }
}
