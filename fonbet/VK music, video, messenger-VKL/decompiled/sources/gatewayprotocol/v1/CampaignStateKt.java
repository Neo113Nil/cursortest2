package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignStateOuterClass;
import xsna.zcl;

/* compiled from: CampaignStateKt.kt */
/* loaded from: classes8.dex */
public final class CampaignStateKt {
    public static final CampaignStateKt INSTANCE = new CampaignStateKt();

    /* compiled from: CampaignStateKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.CampaignState.Builder _builder;

        /* compiled from: CampaignStateKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.CampaignState.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: CampaignStateKt.kt */
        public static final class LoadedCampaignsProxy extends DslProxy {
            private LoadedCampaignsProxy() {
            }
        }

        /* compiled from: CampaignStateKt.kt */
        public static final class ShownCampaignsProxy extends DslProxy {
            private ShownCampaignsProxy() {
            }
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.CampaignState.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.CampaignState _build() {
            return this._builder.build();
        }

        /* renamed from: addAllLoadedCampaigns, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllLoadedCampaigns(DslList dslList, Iterable iterable) {
            this._builder.addAllLoadedCampaigns(iterable);
        }

        /* renamed from: addAllShownCampaigns, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllShownCampaigns(DslList dslList, Iterable iterable) {
            this._builder.addAllShownCampaigns(iterable);
        }

        /* renamed from: addLoadedCampaigns, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignLoadedCampaigns(DslList dslList, CampaignStateOuterClass.Campaign campaign) {
            this._builder.addLoadedCampaigns(campaign);
        }

        /* renamed from: addShownCampaigns, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignShownCampaigns(DslList dslList, CampaignStateOuterClass.Campaign campaign) {
            this._builder.addShownCampaigns(campaign);
        }

        public final /* synthetic */ void clearLoadedCampaigns(DslList dslList) {
            this._builder.clearLoadedCampaigns();
        }

        public final /* synthetic */ void clearShownCampaigns(DslList dslList) {
            this._builder.clearShownCampaigns();
        }

        public final /* synthetic */ DslList getLoadedCampaigns() {
            return new DslList(this._builder.getLoadedCampaignsList());
        }

        public final /* synthetic */ DslList getShownCampaigns() {
            return new DslList(this._builder.getShownCampaignsList());
        }

        public final /* synthetic */ void setLoadedCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign campaign) {
            this._builder.setLoadedCampaigns(i, campaign);
        }

        public final /* synthetic */ void setShownCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign campaign) {
            this._builder.setShownCampaigns(i, campaign);
        }

        private Dsl(CampaignStateOuterClass.CampaignState.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignStateKt() {
    }
}
