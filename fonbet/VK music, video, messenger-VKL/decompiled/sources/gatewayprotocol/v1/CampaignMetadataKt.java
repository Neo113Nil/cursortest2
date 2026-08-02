package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import xsna.zcl;

/* compiled from: CampaignMetadataKt.kt */
/* loaded from: classes8.dex */
public final class CampaignMetadataKt {
    public static final CampaignMetadataKt INSTANCE = new CampaignMetadataKt();

    /* compiled from: CampaignMetadataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignMetadataOuterClass.CampaignMetadata.Builder _builder;

        /* compiled from: CampaignMetadataKt.kt */
        public static final class AssetsToCacheProxy extends DslProxy {
            private AssetsToCacheProxy() {
            }
        }

        /* compiled from: CampaignMetadataKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(CampaignMetadataOuterClass.CampaignMetadata.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignMetadataOuterClass.CampaignMetadata _build() {
            return this._builder.build();
        }

        /* renamed from: addAllAssetsToCache, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllAssetsToCache(DslList dslList, Iterable iterable) {
            this._builder.addAllAssetsToCache(iterable);
        }

        /* renamed from: addAssetsToCache, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAssetsToCache(DslList dslList, CampaignMetadataOuterClass.CampaignAsset campaignAsset) {
            this._builder.addAssetsToCache(campaignAsset);
        }

        public final void clearAdDataRefreshDelayMs() {
            this._builder.clearAdDataRefreshDelayMs();
        }

        public final /* synthetic */ void clearAssetsToCache(DslList dslList) {
            this._builder.clearAssetsToCache();
        }

        public final void clearCampaignStateData() {
            this._builder.clearCampaignStateData();
        }

        public final void clearCampaignStateDataVersion() {
            this._builder.clearCampaignStateDataVersion();
        }

        public final void clearTtlSeconds() {
            this._builder.clearTtlSeconds();
        }

        public final int getAdDataRefreshDelayMs() {
            return this._builder.getAdDataRefreshDelayMs();
        }

        public final /* synthetic */ DslList getAssetsToCache() {
            return new DslList(this._builder.getAssetsToCacheList());
        }

        public final ByteString getCampaignStateData() {
            return this._builder.getCampaignStateData();
        }

        public final int getCampaignStateDataVersion() {
            return this._builder.getCampaignStateDataVersion();
        }

        public final int getTtlSeconds() {
            return this._builder.getTtlSeconds();
        }

        public final void setAdDataRefreshDelayMs(int i) {
            this._builder.setAdDataRefreshDelayMs(i);
        }

        public final /* synthetic */ void setAssetsToCache(DslList dslList, int i, CampaignMetadataOuterClass.CampaignAsset campaignAsset) {
            this._builder.setAssetsToCache(i, campaignAsset);
        }

        public final void setCampaignStateData(ByteString byteString) {
            this._builder.setCampaignStateData(byteString);
        }

        public final void setCampaignStateDataVersion(int i) {
            this._builder.setCampaignStateDataVersion(i);
        }

        public final void setTtlSeconds(int i) {
            this._builder.setTtlSeconds(i);
        }

        private Dsl(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignMetadataKt() {
    }
}
