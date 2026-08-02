package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import xsna.zcl;

/* compiled from: ClientInfoKt.kt */
/* loaded from: classes8.dex */
public final class ClientInfoKt {
    public static final ClientInfoKt INSTANCE = new ClientInfoKt();

    /* compiled from: ClientInfoKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ClientInfoOuterClass.ClientInfo.Builder _builder;

        /* compiled from: ClientInfoKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ClientInfoOuterClass.ClientInfo.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ClientInfoOuterClass.ClientInfo.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ ClientInfoOuterClass.ClientInfo _build() {
            return this._builder.build();
        }

        public final void clearAdQualitySdkVersion() {
            this._builder.clearAdQualitySdkVersion();
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIsFidAvailable() {
            this._builder.clearIsFidAvailable();
        }

        public final void clearMediationAdapterVersion() {
            this._builder.clearMediationAdapterVersion();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOfferwallVersion() {
            this._builder.clearOfferwallVersion();
        }

        public final void clearOmidPartnerVersion() {
            this._builder.clearOmidPartnerVersion();
        }

        public final void clearOmidVersion() {
            this._builder.clearOmidVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearScarVersionName() {
            this._builder.clearScarVersionName();
        }

        public final void clearSdkDevelopmentPlatform() {
            this._builder.clearSdkDevelopmentPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearTest() {
            this._builder.clearTest();
        }

        public final String getAdQualitySdkVersion() {
            return this._builder.getAdQualitySdkVersion();
        }

        public final String getCustomMediationName() {
            return this._builder.getCustomMediationName();
        }

        public final String getGameId() {
            return this._builder.getGameId();
        }

        public final boolean getIsFidAvailable() {
            return this._builder.getIsFidAvailable();
        }

        public final String getMediationAdapterVersion() {
            return this._builder.getMediationAdapterVersion();
        }

        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            return this._builder.getMediationProvider();
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        public final String getMediationVersion() {
            return this._builder.getMediationVersion();
        }

        public final String getOfferwallVersion() {
            return this._builder.getOfferwallVersion();
        }

        public final String getOmidPartnerVersion() {
            return this._builder.getOmidPartnerVersion();
        }

        public final String getOmidVersion() {
            return this._builder.getOmidVersion();
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            return this._builder.getPlatform();
        }

        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        public final String getScarVersionName() {
            return this._builder.getScarVersionName();
        }

        public final String getSdkDevelopmentPlatform() {
            return this._builder.getSdkDevelopmentPlatform();
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            return this._builder.getSdkVersionName();
        }

        public final boolean getTest() {
            return this._builder.getTest();
        }

        public final boolean hasAdQualitySdkVersion() {
            return this._builder.hasAdQualitySdkVersion();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasIsFidAvailable() {
            return this._builder.hasIsFidAvailable();
        }

        public final boolean hasMediationAdapterVersion() {
            return this._builder.hasMediationAdapterVersion();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasOfferwallVersion() {
            return this._builder.hasOfferwallVersion();
        }

        public final boolean hasOmidPartnerVersion() {
            return this._builder.hasOmidPartnerVersion();
        }

        public final boolean hasOmidVersion() {
            return this._builder.hasOmidVersion();
        }

        public final boolean hasScarVersionName() {
            return this._builder.hasScarVersionName();
        }

        public final boolean hasSdkDevelopmentPlatform() {
            return this._builder.hasSdkDevelopmentPlatform();
        }

        public final void setAdQualitySdkVersion(String str) {
            this._builder.setAdQualitySdkVersion(str);
        }

        public final void setCustomMediationName(String str) {
            this._builder.setCustomMediationName(str);
        }

        public final void setGameId(String str) {
            this._builder.setGameId(str);
        }

        public final void setIsFidAvailable(boolean z) {
            this._builder.setIsFidAvailable(z);
        }

        public final void setMediationAdapterVersion(String str) {
            this._builder.setMediationAdapterVersion(str);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            this._builder.setMediationProvider(mediationProvider);
        }

        public final void setMediationProviderValue(int i) {
            this._builder.setMediationProviderValue(i);
        }

        public final void setMediationVersion(String str) {
            this._builder.setMediationVersion(str);
        }

        public final void setOfferwallVersion(String str) {
            this._builder.setOfferwallVersion(str);
        }

        public final void setOmidPartnerVersion(String str) {
            this._builder.setOmidPartnerVersion(str);
        }

        public final void setOmidVersion(String str) {
            this._builder.setOmidVersion(str);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform platform) {
            this._builder.setPlatform(platform);
        }

        public final void setPlatformValue(int i) {
            this._builder.setPlatformValue(i);
        }

        public final void setScarVersionName(String str) {
            this._builder.setScarVersionName(str);
        }

        public final void setSdkDevelopmentPlatform(String str) {
            this._builder.setSdkDevelopmentPlatform(str);
        }

        public final void setSdkVersion(int i) {
            this._builder.setSdkVersion(i);
        }

        public final void setSdkVersionName(String str) {
            this._builder.setSdkVersionName(str);
        }

        public final void setTest(boolean z) {
            this._builder.setTest(z);
        }

        private Dsl(ClientInfoOuterClass.ClientInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private ClientInfoKt() {
    }
}
