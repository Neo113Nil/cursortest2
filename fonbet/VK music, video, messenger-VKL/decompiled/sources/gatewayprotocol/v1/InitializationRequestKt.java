package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;
import xsna.zcl;

/* compiled from: InitializationRequestKt.kt */
/* loaded from: classes8.dex */
public final class InitializationRequestKt {
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    /* compiled from: InitializationRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        /* compiled from: InitializationRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: InitializationRequestKt.kt */
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            return this._builder.build();
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            this._builder.clearExtras();
        }

        public final void clearGoogleAppId() {
            this._builder.clearGoogleAppId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearInstallReferrer() {
            this._builder.clearInstallReferrer();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final void clearUnityBuildGuid() {
            this._builder.clearUnityBuildGuid();
        }

        public final void clearUnityInstallationId() {
            this._builder.clearUnityInstallationId();
        }

        public final void clearUnityMegaSessionId() {
            this._builder.clearUnityMegaSessionId();
        }

        public final String getAnalyticsUserId() {
            return this._builder.getAnalyticsUserId();
        }

        public final ByteString getAuid() {
            return this._builder.getAuid();
        }

        public final String getAuidString() {
            return this._builder.getAuidString();
        }

        public final ByteString getCache() {
            return this._builder.getCache();
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            return this._builder.getClientInfo();
        }

        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            return this._builder.getDeviceInfo();
        }

        public final String getExternalUserIdentifier() {
            return this._builder.getExternalUserIdentifier();
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            return new DslMap(this._builder.getExtrasMap());
        }

        public final String getGoogleAppId() {
            return this._builder.getGoogleAppId();
        }

        public final String getIdfi() {
            return this._builder.getIdfi();
        }

        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrer() {
            return this._builder.getInstallReferrer();
        }

        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrerOrNull(Dsl dsl) {
            return InitializationRequestKtKt.getInstallReferrerOrNull(dsl._builder);
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        public final String getLegacyFlowUserConsent() {
            return this._builder.getLegacyFlowUserConsent();
        }

        public final ByteString getPrivacy() {
            return this._builder.getPrivacy();
        }

        public final ByteString getSessionId() {
            return this._builder.getSessionId();
        }

        public final ByteString getUadsInitBlob() {
            return this._builder.getUadsInitBlob();
        }

        public final String getUnityBuildGuid() {
            return this._builder.getUnityBuildGuid();
        }

        public final ByteString getUnityInstallationId() {
            return this._builder.getUnityInstallationId();
        }

        public final ByteString getUnityMegaSessionId() {
            return this._builder.getUnityMegaSessionId();
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        public final boolean hasGoogleAppId() {
            return this._builder.hasGoogleAppId();
        }

        public final boolean hasInstallReferrer() {
            return this._builder.hasInstallReferrer();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final boolean hasUnityBuildGuid() {
            return this._builder.hasUnityBuildGuid();
        }

        public final boolean hasUnityInstallationId() {
            return this._builder.hasUnityInstallationId();
        }

        public final boolean hasUnityMegaSessionId() {
            return this._builder.hasUnityMegaSessionId();
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

        public final void setAnalyticsUserId(String str) {
            this._builder.setAnalyticsUserId(str);
        }

        public final void setAuid(ByteString byteString) {
            this._builder.setAuid(byteString);
        }

        public final void setAuidString(String str) {
            this._builder.setAuidString(str);
        }

        public final void setCache(ByteString byteString) {
            this._builder.setCache(byteString);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            this._builder.setClientInfo(clientInfo);
        }

        public final void setDeviceInfo(InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo) {
            this._builder.setDeviceInfo(initializationDeviceInfo);
        }

        public final void setExternalUserIdentifier(String str) {
            this._builder.setExternalUserIdentifier(str);
        }

        public final void setGoogleAppId(String str) {
            this._builder.setGoogleAppId(str);
        }

        public final void setIdfi(String str) {
            this._builder.setIdfi(str);
        }

        public final void setInstallReferrer(InitializationRequestOuterClass.InstallReferrer installReferrer) {
            this._builder.setInstallReferrer(installReferrer);
        }

        public final void setIsFirstInit(boolean z) {
            this._builder.setIsFirstInit(z);
        }

        public final void setLegacyFlowUserConsent(String str) {
            this._builder.setLegacyFlowUserConsent(str);
        }

        public final void setPrivacy(ByteString byteString) {
            this._builder.setPrivacy(byteString);
        }

        public final void setSessionId(ByteString byteString) {
            this._builder.setSessionId(byteString);
        }

        public final void setUadsInitBlob(ByteString byteString) {
            this._builder.setUadsInitBlob(byteString);
        }

        public final void setUnityBuildGuid(String str) {
            this._builder.setUnityBuildGuid(str);
        }

        public final void setUnityInstallationId(ByteString byteString) {
            this._builder.setUnityInstallationId(byteString);
        }

        public final void setUnityMegaSessionId(ByteString byteString) {
            this._builder.setUnityMegaSessionId(byteString);
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationRequestKt() {
    }
}
