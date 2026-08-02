package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import xsna.zcl;

/* compiled from: LimitedSessionTokenKt.kt */
/* loaded from: classes8.dex */
public final class LimitedSessionTokenKt {
    public static final LimitedSessionTokenKt INSTANCE = new LimitedSessionTokenKt();

    /* compiled from: LimitedSessionTokenKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestOuterClass.LimitedSessionToken.Builder _builder;

        /* compiled from: LimitedSessionTokenKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.LimitedSessionToken _build() {
            return this._builder.build();
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final String getCustomMediationName() {
            return this._builder.getCustomMediationName();
        }

        public final String getDeviceMake() {
            return this._builder.getDeviceMake();
        }

        public final String getDeviceModel() {
            return this._builder.getDeviceModel();
        }

        public final String getGameId() {
            return this._builder.getGameId();
        }

        public final String getIdfi() {
            return this._builder.getIdfi();
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

        public final String getOsVersion() {
            return this._builder.getOsVersion();
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            return this._builder.getPlatform();
        }

        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            return this._builder.getSdkVersionName();
        }

        public final ByteString getSessionId() {
            return this._builder.getSessionId();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasSessionId() {
            return this._builder.hasSessionId();
        }

        public final void setCustomMediationName(String str) {
            this._builder.setCustomMediationName(str);
        }

        public final void setDeviceMake(String str) {
            this._builder.setDeviceMake(str);
        }

        public final void setDeviceModel(String str) {
            this._builder.setDeviceModel(str);
        }

        public final void setGameId(String str) {
            this._builder.setGameId(str);
        }

        public final void setIdfi(String str) {
            this._builder.setIdfi(str);
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

        public final void setOsVersion(String str) {
            this._builder.setOsVersion(str);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform platform) {
            this._builder.setPlatform(platform);
        }

        public final void setPlatformValue(int i) {
            this._builder.setPlatformValue(i);
        }

        public final void setSdkVersion(int i) {
            this._builder.setSdkVersion(i);
        }

        public final void setSdkVersionName(String str) {
            this._builder.setSdkVersionName(str);
        }

        public final void setSessionId(ByteString byteString) {
            this._builder.setSessionId(byteString);
        }

        private Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
            this._builder = builder;
        }
    }

    private LimitedSessionTokenKt() {
    }
}
