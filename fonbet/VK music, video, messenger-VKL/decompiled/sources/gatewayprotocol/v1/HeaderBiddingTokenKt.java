package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Map;
import xsna.zcl;

/* compiled from: HeaderBiddingTokenKt.kt */
/* loaded from: classes8.dex */
public final class HeaderBiddingTokenKt {
    public static final HeaderBiddingTokenKt INSTANCE = new HeaderBiddingTokenKt();

    /* compiled from: HeaderBiddingTokenKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder _builder;

        /* compiled from: HeaderBiddingTokenKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: HeaderBiddingTokenKt.kt */
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.HeaderBiddingToken _build() {
            return this._builder.build();
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            this._builder.clearExtras();
        }

        public final void clearInitializationData() {
            this._builder.clearInitializationData();
        }

        public final void clearLimitedSessionToken() {
            this._builder.clearLimitedSessionToken();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearOfferwallEnabled() {
            this._builder.clearOfferwallEnabled();
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearScarSignalsCollected() {
            this._builder.clearScarSignalsCollected();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearTestData() {
            this._builder.clearTestData();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final void clearTokenCounters() {
            this._builder.clearTokenCounters();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            return this._builder.getAdFormat();
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final AdRequestOuterClass.BannerSize getBannerSize() {
            return this._builder.getBannerSize();
        }

        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(Dsl dsl) {
            return HeaderBiddingTokenKtKt.getBannerSizeOrNull(dsl._builder);
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            return this._builder.getCampaignState();
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            return this._builder.getClientInfo();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            return this._builder.getDynamicDeviceInfo();
        }

        public final String getExternalUserIdentifier() {
            return this._builder.getExternalUserIdentifier();
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            return new DslMap(this._builder.getExtrasMap());
        }

        public final InitializationDataOuterClass.InitializationData getInitializationData() {
            return this._builder.getInitializationData();
        }

        public final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(Dsl dsl) {
            return HeaderBiddingTokenKtKt.getInitializationDataOrNull(dsl._builder);
        }

        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            return this._builder.getLimitedSessionToken();
        }

        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
            return HeaderBiddingTokenKtKt.getLimitedSessionTokenOrNull(dsl._builder);
        }

        public final String getMediationAdUnitId() {
            return this._builder.getMediationAdUnitId();
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            return this._builder.getMediationInfo();
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(Dsl dsl) {
            return HeaderBiddingTokenKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final boolean getOfferwallEnabled() {
            return this._builder.getOfferwallEnabled();
        }

        public final PiiOuterClass.Pii getPii() {
            return this._builder.getPii();
        }

        public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
            return HeaderBiddingTokenKtKt.getPiiOrNull(dsl._builder);
        }

        public final String getPlacementId() {
            return this._builder.getPlacementId();
        }

        public final boolean getScarSignalsCollected() {
            return this._builder.getScarSignalsCollected();
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            return this._builder.getSessionCounters();
        }

        public final ByteString getSessionToken() {
            return this._builder.getSessionToken();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            return this._builder.getStaticDeviceInfo();
        }

        public final ByteString getTcf() {
            return this._builder.getTcf();
        }

        public final TestDataOuterClass.TestData getTestData() {
            return this._builder.getTestData();
        }

        public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
            return HeaderBiddingTokenKtKt.getTestDataOrNull(dsl._builder);
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            return this._builder.getTimestamps();
        }

        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            return this._builder.getTokenCounters();
        }

        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(Dsl dsl) {
            return HeaderBiddingTokenKtKt.getTokenCountersOrNull(dsl._builder);
        }

        public final ByteString getTokenId() {
            return this._builder.getTokenId();
        }

        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        public final boolean hasInitializationData() {
            return this._builder.hasInitializationData();
        }

        public final boolean hasLimitedSessionToken() {
            return this._builder.hasLimitedSessionToken();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasOfferwallEnabled() {
            return this._builder.hasOfferwallEnabled();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        public final boolean hasScarSignalsCollected() {
            return this._builder.hasScarSignalsCollected();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasTestData() {
            return this._builder.hasTestData();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final boolean hasTokenCounters() {
            return this._builder.hasTokenCounters();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            this._builder.putAllExtras(map);
        }

        /* renamed from: putExtras, reason: merged with bridge method [inline-methods] */
        public final void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String str, String str2) {
            this._builder.putExtras(str, str2);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String str) {
            this._builder.removeExtras(str);
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this._builder.setAdFormat(adFormat);
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void setBannerSize(AdRequestOuterClass.BannerSize bannerSize) {
            this._builder.setBannerSize(bannerSize);
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            this._builder.setCampaignState(campaignState);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            this._builder.setClientInfo(clientInfo);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setExternalUserIdentifier(String str) {
            this._builder.setExternalUserIdentifier(str);
        }

        public final void setInitializationData(InitializationDataOuterClass.InitializationData initializationData) {
            this._builder.setInitializationData(initializationData);
        }

        public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            this._builder.setLimitedSessionToken(limitedSessionToken);
        }

        public final void setMediationAdUnitId(String str) {
            this._builder.setMediationAdUnitId(str);
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            this._builder.setMediationInfo(mediationInfo);
        }

        public final void setOfferwallEnabled(boolean z) {
            this._builder.setOfferwallEnabled(z);
        }

        public final void setPii(PiiOuterClass.Pii pii) {
            this._builder.setPii(pii);
        }

        public final void setPlacementId(String str) {
            this._builder.setPlacementId(str);
        }

        public final void setScarSignalsCollected(boolean z) {
            this._builder.setScarSignalsCollected(z);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            this._builder.setSessionCounters(sessionCounters);
        }

        public final void setSessionToken(ByteString byteString) {
            this._builder.setSessionToken(byteString);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        public final void setTcf(ByteString byteString) {
            this._builder.setTcf(byteString);
        }

        public final void setTestData(TestDataOuterClass.TestData testData) {
            this._builder.setTestData(testData);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            this._builder.setTimestamps(timestamps);
        }

        public final void setTokenCounters(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters) {
            this._builder.setTokenCounters(tokenCounters);
        }

        public final void setTokenId(ByteString byteString) {
            this._builder.setTokenId(byteString);
        }

        public final void setTokenNumber(int i) {
            this._builder.setTokenNumber(i);
        }

        private Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
            this._builder = builder;
        }
    }

    private HeaderBiddingTokenKt() {
    }
}
