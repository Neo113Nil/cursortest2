package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import xsna.zcl;

/* compiled from: InitializationDeviceInfoKt.kt */
/* loaded from: classes8.dex */
public final class InitializationDeviceInfoKt {
    public static final InitializationDeviceInfoKt INSTANCE = new InitializationDeviceInfoKt();

    /* compiled from: InitializationDeviceInfoKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InitializationDeviceInfo.Builder _builder;

        /* compiled from: InitializationDeviceInfoKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationDeviceInfo _build() {
            return this._builder.build();
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearCurrentUiTheme() {
            this._builder.clearCurrentUiTheme();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGridToken() {
            this._builder.clearGridToken();
        }

        public final void clearHashedDeviceName() {
            this._builder.clearHashedDeviceName();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLocalList() {
            this._builder.clearLocalList();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearSystemBootTime() {
            this._builder.clearSystemBootTime();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearTrackingAuthStatus() {
            this._builder.clearTrackingAuthStatus();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final String getBundleId() {
            return this._builder.getBundleId();
        }

        public final String getBundleVersion() {
            return this._builder.getBundleVersion();
        }

        public final String getConnectionType() {
            return this._builder.getConnectionType();
        }

        public final long getCurrentUiTheme() {
            return this._builder.getCurrentUiTheme();
        }

        public final String getDeviceMake() {
            return this._builder.getDeviceMake();
        }

        public final String getDeviceModel() {
            return this._builder.getDeviceModel();
        }

        public final long getGridToken() {
            return this._builder.getGridToken();
        }

        public final String getHashedDeviceName() {
            return this._builder.getHashedDeviceName();
        }

        public final String getLanguage() {
            return this._builder.getLanguage();
        }

        public final String getLocalList() {
            return this._builder.getLocalList();
        }

        public final String getNetworkOperator() {
            return this._builder.getNetworkOperator();
        }

        public final String getOsVersion() {
            return this._builder.getOsVersion();
        }

        public final long getSystemBootTime() {
            return this._builder.getSystemBootTime();
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final int getTrackingAuthStatus() {
            return this._builder.getTrackingAuthStatus();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasGridToken() {
            return this._builder.hasGridToken();
        }

        public final boolean hasTrackingAuthStatus() {
            return this._builder.hasTrackingAuthStatus();
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void setBundleId(String str) {
            this._builder.setBundleId(str);
        }

        public final void setBundleVersion(String str) {
            this._builder.setBundleVersion(str);
        }

        public final void setConnectionType(String str) {
            this._builder.setConnectionType(str);
        }

        public final void setCurrentUiTheme(long j) {
            this._builder.setCurrentUiTheme(j);
        }

        public final void setDeviceMake(String str) {
            this._builder.setDeviceMake(str);
        }

        public final void setDeviceModel(String str) {
            this._builder.setDeviceModel(str);
        }

        public final void setGridToken(long j) {
            this._builder.setGridToken(j);
        }

        public final void setHashedDeviceName(String str) {
            this._builder.setHashedDeviceName(str);
        }

        public final void setLanguage(String str) {
            this._builder.setLanguage(str);
        }

        public final void setLocalList(String str) {
            this._builder.setLocalList(str);
        }

        public final void setNetworkOperator(String str) {
            this._builder.setNetworkOperator(str);
        }

        public final void setOsVersion(String str) {
            this._builder.setOsVersion(str);
        }

        public final void setSystemBootTime(long j) {
            this._builder.setSystemBootTime(j);
        }

        public final void setTotalDiskSpace(long j) {
            this._builder.setTotalDiskSpace(j);
        }

        public final void setTotalRamMemory(long j) {
            this._builder.setTotalRamMemory(j);
        }

        public final void setTrackingAuthStatus(int i) {
            this._builder.setTrackingAuthStatus(i);
        }

        private Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationDeviceInfoKt() {
    }
}
