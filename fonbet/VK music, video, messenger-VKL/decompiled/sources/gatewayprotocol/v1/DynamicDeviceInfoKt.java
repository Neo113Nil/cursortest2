package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DynamicDeviceInfoKt.kt */
/* loaded from: classes8.dex */
public final class DynamicDeviceInfoKt {
    public static final DynamicDeviceInfoKt INSTANCE = new DynamicDeviceInfoKt();

    /* compiled from: DynamicDeviceInfoKt.kt */
    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        /* compiled from: DynamicDeviceInfoKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder _builder;

            /* compiled from: DynamicDeviceInfoKt.kt */
            public static final class Companion {
                public /* synthetic */ Companion(zcl zclVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder, zcl zclVar) {
                this(builder);
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android _build() {
                return this._builder.build();
            }

            public final void clearAccessibilityDisplayDaltonizer() {
                this._builder.clearAccessibilityDisplayDaltonizer();
            }

            public final void clearAdbEnabled() {
                this._builder.clearAdbEnabled();
            }

            public final void clearAirplaneMode() {
                this._builder.clearAirplaneMode();
            }

            public final void clearAnimatorScale() {
                this._builder.clearAnimatorScale();
            }

            public final void clearChargingType() {
                this._builder.clearChargingType();
            }

            public final void clearDeviceElapsedRealtime() {
                this._builder.clearDeviceElapsedRealtime();
            }

            public final void clearDeviceUpTime() {
                this._builder.clearDeviceUpTime();
            }

            public final void clearDisplayInversionEnabled() {
                this._builder.clearDisplayInversionEnabled();
            }

            public final void clearFontScale() {
                this._builder.clearFontScale();
            }

            public final void clearFreeDiskSpaceInternal() {
                this._builder.clearFreeDiskSpaceInternal();
            }

            public final void clearJvmFreeMemory() {
                this._builder.clearJvmFreeMemory();
            }

            public final void clearJvmTotalMemory() {
                this._builder.clearJvmTotalMemory();
            }

            public final void clearMaxVolume() {
                this._builder.clearMaxVolume();
            }

            public final void clearNetworkCapabilityTransports() {
                this._builder.clearNetworkCapabilityTransports();
            }

            public final void clearNetworkConnected() {
                this._builder.clearNetworkConnected();
            }

            public final void clearNetworkMetered() {
                this._builder.clearNetworkMetered();
            }

            public final void clearNetworkType() {
                this._builder.clearNetworkType();
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final void clearSdCardPresent() {
                this._builder.clearSdCardPresent();
            }

            public final void clearStayOnWhilePluggedIn() {
                this._builder.clearStayOnWhilePluggedIn();
            }

            public final void clearTelephonyManagerNetworkType() {
                this._builder.clearTelephonyManagerNetworkType();
            }

            public final void clearUsbConnected() {
                this._builder.clearUsbConnected();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final int getAccessibilityDisplayDaltonizer() {
                return this._builder.getAccessibilityDisplayDaltonizer();
            }

            public final boolean getAdbEnabled() {
                return this._builder.getAdbEnabled();
            }

            public final boolean getAirplaneMode() {
                return this._builder.getAirplaneMode();
            }

            public final float getAnimatorScale() {
                return this._builder.getAnimatorScale();
            }

            public final int getChargingType() {
                return this._builder.getChargingType();
            }

            public final long getDeviceElapsedRealtime() {
                return this._builder.getDeviceElapsedRealtime();
            }

            public final long getDeviceUpTime() {
                return this._builder.getDeviceUpTime();
            }

            public final boolean getDisplayInversionEnabled() {
                return this._builder.getDisplayInversionEnabled();
            }

            public final float getFontScale() {
                return this._builder.getFontScale();
            }

            public final long getFreeDiskSpaceInternal() {
                return this._builder.getFreeDiskSpaceInternal();
            }

            public final long getJvmFreeMemory() {
                return this._builder.getJvmFreeMemory();
            }

            public final long getJvmTotalMemory() {
                return this._builder.getJvmTotalMemory();
            }

            public final double getMaxVolume() {
                return this._builder.getMaxVolume();
            }

            public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                return this._builder.getNetworkCapabilityTransports();
            }

            public final boolean getNetworkConnected() {
                return this._builder.getNetworkConnected();
            }

            public final boolean getNetworkMetered() {
                return this._builder.getNetworkMetered();
            }

            public final int getNetworkType() {
                return this._builder.getNetworkType();
            }

            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            public final boolean getSdCardPresent() {
                return this._builder.getSdCardPresent();
            }

            public final boolean getStayOnWhilePluggedIn() {
                return this._builder.getStayOnWhilePluggedIn();
            }

            public final int getTelephonyManagerNetworkType() {
                return this._builder.getTelephonyManagerNetworkType();
            }

            public final boolean getUsbConnected() {
                return this._builder.getUsbConnected();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasAccessibilityDisplayDaltonizer() {
                return this._builder.hasAccessibilityDisplayDaltonizer();
            }

            public final boolean hasAdbEnabled() {
                return this._builder.hasAdbEnabled();
            }

            public final boolean hasAirplaneMode() {
                return this._builder.hasAirplaneMode();
            }

            public final boolean hasAnimatorScale() {
                return this._builder.hasAnimatorScale();
            }

            public final boolean hasChargingType() {
                return this._builder.hasChargingType();
            }

            public final boolean hasDeviceElapsedRealtime() {
                return this._builder.hasDeviceElapsedRealtime();
            }

            public final boolean hasDeviceUpTime() {
                return this._builder.hasDeviceUpTime();
            }

            public final boolean hasDisplayInversionEnabled() {
                return this._builder.hasDisplayInversionEnabled();
            }

            public final boolean hasFontScale() {
                return this._builder.hasFontScale();
            }

            public final boolean hasFreeDiskSpaceInternal() {
                return this._builder.hasFreeDiskSpaceInternal();
            }

            public final boolean hasJvmFreeMemory() {
                return this._builder.hasJvmFreeMemory();
            }

            public final boolean hasJvmTotalMemory() {
                return this._builder.hasJvmTotalMemory();
            }

            public final boolean hasMaxVolume() {
                return this._builder.hasMaxVolume();
            }

            public final boolean hasNetworkCapabilityTransports() {
                return this._builder.hasNetworkCapabilityTransports();
            }

            public final boolean hasNetworkConnected() {
                return this._builder.hasNetworkConnected();
            }

            public final boolean hasNetworkMetered() {
                return this._builder.hasNetworkMetered();
            }

            public final boolean hasNetworkType() {
                return this._builder.hasNetworkType();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final boolean hasSdCardPresent() {
                return this._builder.hasSdCardPresent();
            }

            public final boolean hasStayOnWhilePluggedIn() {
                return this._builder.hasStayOnWhilePluggedIn();
            }

            public final boolean hasTelephonyManagerNetworkType() {
                return this._builder.hasTelephonyManagerNetworkType();
            }

            public final boolean hasUsbConnected() {
                return this._builder.hasUsbConnected();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final void setAccessibilityDisplayDaltonizer(int i) {
                this._builder.setAccessibilityDisplayDaltonizer(i);
            }

            public final void setAdbEnabled(boolean z) {
                this._builder.setAdbEnabled(z);
            }

            public final void setAirplaneMode(boolean z) {
                this._builder.setAirplaneMode(z);
            }

            public final void setAnimatorScale(float f) {
                this._builder.setAnimatorScale(f);
            }

            public final void setChargingType(int i) {
                this._builder.setChargingType(i);
            }

            public final void setDeviceElapsedRealtime(long j) {
                this._builder.setDeviceElapsedRealtime(j);
            }

            public final void setDeviceUpTime(long j) {
                this._builder.setDeviceUpTime(j);
            }

            public final void setDisplayInversionEnabled(boolean z) {
                this._builder.setDisplayInversionEnabled(z);
            }

            public final void setFontScale(float f) {
                this._builder.setFontScale(f);
            }

            public final void setFreeDiskSpaceInternal(long j) {
                this._builder.setFreeDiskSpaceInternal(j);
            }

            public final void setJvmFreeMemory(long j) {
                this._builder.setJvmFreeMemory(j);
            }

            public final void setJvmTotalMemory(long j) {
                this._builder.setJvmTotalMemory(j);
            }

            public final void setMaxVolume(double d) {
                this._builder.setMaxVolume(d);
            }

            public final void setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                this._builder.setNetworkCapabilityTransports(networkCapabilityTransports);
            }

            public final void setNetworkConnected(boolean z) {
                this._builder.setNetworkConnected(z);
            }

            public final void setNetworkMetered(boolean z) {
                this._builder.setNetworkMetered(z);
            }

            public final void setNetworkType(int i) {
                this._builder.setNetworkType(i);
            }

            public final void setScreenBrightness(double d) {
                this._builder.setScreenBrightness(d);
            }

            public final void setSdCardPresent(boolean z) {
                this._builder.setSdCardPresent(z);
            }

            public final void setStayOnWhilePluggedIn(boolean z) {
                this._builder.setStayOnWhilePluggedIn(z);
            }

            public final void setTelephonyManagerNetworkType(int i) {
                this._builder.setTelephonyManagerNetworkType(i);
            }

            public final void setUsbConnected(boolean z) {
                this._builder.setUsbConnected(z);
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    /* compiled from: DynamicDeviceInfoKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        /* compiled from: DynamicDeviceInfoKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo _build() {
            return this._builder.build();
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppActive() {
            this._builder.clearAppActive();
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearFreeDiskSpace() {
            this._builder.clearFreeDiskSpace();
        }

        public final void clearFreeRamMemory() {
            this._builder.clearFreeRamMemory();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLimitedOpenAdTracking() {
            this._builder.clearLimitedOpenAdTracking();
        }

        public final void clearLimitedTracking() {
            this._builder.clearLimitedTracking();
        }

        public final void clearLowPowerMode() {
            this._builder.clearLowPowerMode();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearNetworkOperatorName() {
            this._builder.clearNetworkOperatorName();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final void clearTimeZone() {
            this._builder.clearTimeZone();
        }

        public final void clearTimeZoneOffset() {
            this._builder.clearTimeZoneOffset();
        }

        public final void clearUserId() {
            this._builder.clearUserId();
        }

        public final void clearWeb() {
            this._builder.clearWeb();
        }

        public final void clearWiredHeadset() {
            this._builder.clearWiredHeadset();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            return this._builder.getAndroid();
        }

        public final boolean getAppActive() {
            return this._builder.getAppActive();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            return this._builder.getConnectionType();
        }

        public final int getConnectionTypeValue() {
            return this._builder.getConnectionTypeValue();
        }

        public final long getFreeDiskSpace() {
            return this._builder.getFreeDiskSpace();
        }

        public final long getFreeRamMemory() {
            return this._builder.getFreeRamMemory();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            return this._builder.getIos();
        }

        public final String getLanguage() {
            return this._builder.getLanguage();
        }

        public final boolean getLimitedOpenAdTracking() {
            return this._builder.getLimitedOpenAdTracking();
        }

        public final boolean getLimitedTracking() {
            return this._builder.getLimitedTracking();
        }

        public final boolean getLowPowerMode() {
            return this._builder.getLowPowerMode();
        }

        public final String getNetworkOperator() {
            return this._builder.getNetworkOperator();
        }

        public final String getNetworkOperatorName() {
            return this._builder.getNetworkOperatorName();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            return this._builder.getPlatformSpecificCase();
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final String getTimeZone() {
            return this._builder.getTimeZone();
        }

        public final long getTimeZoneOffset() {
            return this._builder.getTimeZoneOffset();
        }

        public final String getUserId() {
            return this._builder.getUserId();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web getWeb() {
            return this._builder.getWeb();
        }

        public final boolean getWiredHeadset() {
            return this._builder.getWiredHeadset();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppActive() {
            return this._builder.hasAppActive();
        }

        public final boolean hasBatteryLevel() {
            return this._builder.hasBatteryLevel();
        }

        public final boolean hasBatteryStatus() {
            return this._builder.hasBatteryStatus();
        }

        public final boolean hasConnectionType() {
            return this._builder.hasConnectionType();
        }

        public final boolean hasFreeDiskSpace() {
            return this._builder.hasFreeDiskSpace();
        }

        public final boolean hasFreeRamMemory() {
            return this._builder.hasFreeRamMemory();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasLanguage() {
            return this._builder.hasLanguage();
        }

        public final boolean hasLimitedOpenAdTracking() {
            return this._builder.hasLimitedOpenAdTracking();
        }

        public final boolean hasLimitedTracking() {
            return this._builder.hasLimitedTracking();
        }

        public final boolean hasLowPowerMode() {
            return this._builder.hasLowPowerMode();
        }

        public final boolean hasNetworkOperator() {
            return this._builder.hasNetworkOperator();
        }

        public final boolean hasNetworkOperatorName() {
            return this._builder.hasNetworkOperatorName();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTimeZone() {
            return this._builder.hasTimeZone();
        }

        public final boolean hasTimeZoneOffset() {
            return this._builder.hasTimeZoneOffset();
        }

        public final boolean hasUserId() {
            return this._builder.hasUserId();
        }

        public final boolean hasWeb() {
            return this._builder.hasWeb();
        }

        public final boolean hasWiredHeadset() {
            return this._builder.hasWiredHeadset();
        }

        public final void setAndroid(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2) {
            this._builder.setAndroid(android2);
        }

        public final void setAppActive(boolean z) {
            this._builder.setAppActive(z);
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void setConnectionType(DynamicDeviceInfoOuterClass.ConnectionType connectionType) {
            this._builder.setConnectionType(connectionType);
        }

        public final void setConnectionTypeValue(int i) {
            this._builder.setConnectionTypeValue(i);
        }

        public final void setFreeDiskSpace(long j) {
            this._builder.setFreeDiskSpace(j);
        }

        public final void setFreeRamMemory(long j) {
            this._builder.setFreeRamMemory(j);
        }

        public final void setIos(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios) {
            this._builder.setIos(ios);
        }

        public final void setLanguage(String str) {
            this._builder.setLanguage(str);
        }

        public final void setLimitedOpenAdTracking(boolean z) {
            this._builder.setLimitedOpenAdTracking(z);
        }

        public final void setLimitedTracking(boolean z) {
            this._builder.setLimitedTracking(z);
        }

        public final void setLowPowerMode(boolean z) {
            this._builder.setLowPowerMode(z);
        }

        public final void setNetworkOperator(String str) {
            this._builder.setNetworkOperator(str);
        }

        public final void setNetworkOperatorName(String str) {
            this._builder.setNetworkOperatorName(str);
        }

        public final void setScreenHeight(int i) {
            this._builder.setScreenHeight(i);
        }

        public final void setScreenWidth(int i) {
            this._builder.setScreenWidth(i);
        }

        public final void setTimeZone(String str) {
            this._builder.setTimeZone(str);
        }

        public final void setTimeZoneOffset(long j) {
            this._builder.setTimeZoneOffset(j);
        }

        public final void setUserId(String str) {
            this._builder.setUserId(str);
        }

        public final void setWeb(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web web) {
            this._builder.setWeb(web);
        }

        public final void setWiredHeadset(boolean z) {
            this._builder.setWiredHeadset(z);
        }

        private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    /* compiled from: DynamicDeviceInfoKt.kt */
    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        /* compiled from: DynamicDeviceInfoKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            /* compiled from: DynamicDeviceInfoKt.kt */
            public static final class Companion {
                public /* synthetic */ Companion(zcl zclVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            public static final class LocaleListProxy extends DslProxy {
                private LocaleListProxy() {
                }
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            public static final class NwPathInterfacesProxy extends DslProxy {
                private NwPathInterfacesProxy() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder, zcl zclVar) {
                this(builder);
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios _build() {
                return this._builder.build();
            }

            /* renamed from: addAllLocaleList, reason: merged with bridge method [inline-methods] */
            public final /* synthetic */ void plusAssignAllLocaleList(DslList dslList, Iterable iterable) {
                this._builder.addAllLocaleList(iterable);
            }

            /* renamed from: addAllNwPathInterfaces, reason: merged with bridge method [inline-methods] */
            public final /* synthetic */ void plusAssignAllNwPathInterfaces(DslList dslList, Iterable iterable) {
                this._builder.addAllNwPathInterfaces(iterable);
            }

            /* renamed from: addLocaleList, reason: merged with bridge method [inline-methods] */
            public final /* synthetic */ void plusAssignLocaleList(DslList dslList, String str) {
                this._builder.addLocaleList(str);
            }

            /* renamed from: addNwPathInterfaces, reason: merged with bridge method [inline-methods] */
            public final /* synthetic */ void plusAssignNwPathInterfaces(DslList dslList, String str) {
                this._builder.addNwPathInterfaces(str);
            }

            public final void clearCurrentRadioAccessTechnology() {
                this._builder.clearCurrentRadioAccessTechnology();
            }

            public final void clearCurrentUiTheme() {
                this._builder.clearCurrentUiTheme();
            }

            public final void clearDeviceName() {
                this._builder.clearDeviceName();
            }

            public final void clearDeviceUpTimeWithSleep() {
                this._builder.clearDeviceUpTimeWithSleep();
            }

            public final void clearDeviceUpTimeWithoutSleep() {
                this._builder.clearDeviceUpTimeWithoutSleep();
            }

            public final void clearGrayscaleEnabled() {
                this._builder.clearGrayscaleEnabled();
            }

            public final void clearInvertColorsEnabled() {
                this._builder.clearInvertColorsEnabled();
            }

            public final /* synthetic */ void clearLocaleList(DslList dslList) {
                this._builder.clearLocaleList();
            }

            public final void clearNetworkReachabilityFlags() {
                this._builder.clearNetworkReachabilityFlags();
            }

            public final /* synthetic */ void clearNwPathInterfaces(DslList dslList) {
                this._builder.clearNwPathInterfaces();
            }

            public final void clearPreferredContentSizeCategory() {
                this._builder.clearPreferredContentSizeCategory();
            }

            public final void clearReduceMotionEnabled() {
                this._builder.clearReduceMotionEnabled();
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final void clearTrackingAuthStatus() {
                this._builder.clearTrackingAuthStatus();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final String getCurrentRadioAccessTechnology() {
                return this._builder.getCurrentRadioAccessTechnology();
            }

            public final int getCurrentUiTheme() {
                return this._builder.getCurrentUiTheme();
            }

            public final String getDeviceName() {
                return this._builder.getDeviceName();
            }

            public final long getDeviceUpTimeWithSleep() {
                return this._builder.getDeviceUpTimeWithSleep();
            }

            public final long getDeviceUpTimeWithoutSleep() {
                return this._builder.getDeviceUpTimeWithoutSleep();
            }

            public final boolean getGrayscaleEnabled() {
                return this._builder.getGrayscaleEnabled();
            }

            public final boolean getInvertColorsEnabled() {
                return this._builder.getInvertColorsEnabled();
            }

            public final DslList<String, LocaleListProxy> getLocaleList() {
                return new DslList<>(this._builder.getLocaleListList());
            }

            public final int getNetworkReachabilityFlags() {
                return this._builder.getNetworkReachabilityFlags();
            }

            public final DslList<String, NwPathInterfacesProxy> getNwPathInterfaces() {
                return new DslList<>(this._builder.getNwPathInterfacesList());
            }

            public final String getPreferredContentSizeCategory() {
                return this._builder.getPreferredContentSizeCategory();
            }

            public final boolean getReduceMotionEnabled() {
                return this._builder.getReduceMotionEnabled();
            }

            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            public final int getTrackingAuthStatus() {
                return this._builder.getTrackingAuthStatus();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasCurrentRadioAccessTechnology() {
                return this._builder.hasCurrentRadioAccessTechnology();
            }

            public final boolean hasCurrentUiTheme() {
                return this._builder.hasCurrentUiTheme();
            }

            public final boolean hasDeviceName() {
                return this._builder.hasDeviceName();
            }

            public final boolean hasDeviceUpTimeWithSleep() {
                return this._builder.hasDeviceUpTimeWithSleep();
            }

            public final boolean hasDeviceUpTimeWithoutSleep() {
                return this._builder.hasDeviceUpTimeWithoutSleep();
            }

            public final boolean hasGrayscaleEnabled() {
                return this._builder.hasGrayscaleEnabled();
            }

            public final boolean hasInvertColorsEnabled() {
                return this._builder.hasInvertColorsEnabled();
            }

            public final boolean hasNetworkReachabilityFlags() {
                return this._builder.hasNetworkReachabilityFlags();
            }

            public final boolean hasPreferredContentSizeCategory() {
                return this._builder.hasPreferredContentSizeCategory();
            }

            public final boolean hasReduceMotionEnabled() {
                return this._builder.hasReduceMotionEnabled();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final boolean hasTrackingAuthStatus() {
                return this._builder.hasTrackingAuthStatus();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final void setCurrentRadioAccessTechnology(String str) {
                this._builder.setCurrentRadioAccessTechnology(str);
            }

            public final void setCurrentUiTheme(int i) {
                this._builder.setCurrentUiTheme(i);
            }

            public final void setDeviceName(String str) {
                this._builder.setDeviceName(str);
            }

            public final void setDeviceUpTimeWithSleep(long j) {
                this._builder.setDeviceUpTimeWithSleep(j);
            }

            public final void setDeviceUpTimeWithoutSleep(long j) {
                this._builder.setDeviceUpTimeWithoutSleep(j);
            }

            public final void setGrayscaleEnabled(boolean z) {
                this._builder.setGrayscaleEnabled(z);
            }

            public final void setInvertColorsEnabled(boolean z) {
                this._builder.setInvertColorsEnabled(z);
            }

            public final /* synthetic */ void setLocaleList(DslList dslList, int i, String str) {
                this._builder.setLocaleList(i, str);
            }

            public final void setNetworkReachabilityFlags(int i) {
                this._builder.setNetworkReachabilityFlags(i);
            }

            public final /* synthetic */ void setNwPathInterfaces(DslList dslList, int i, String str) {
                this._builder.setNwPathInterfaces(i, str);
            }

            public final void setPreferredContentSizeCategory(String str) {
                this._builder.setPreferredContentSizeCategory(str);
            }

            public final void setReduceMotionEnabled(boolean z) {
                this._builder.setReduceMotionEnabled(z);
            }

            public final void setScreenBrightness(double d) {
                this._builder.setScreenBrightness(d);
            }

            public final void setTrackingAuthStatus(int i) {
                this._builder.setTrackingAuthStatus(i);
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    /* compiled from: DynamicDeviceInfoKt.kt */
    public static final class WebKt {
        public static final WebKt INSTANCE = new WebKt();

        /* compiled from: DynamicDeviceInfoKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder _builder;

            /* compiled from: DynamicDeviceInfoKt.kt */
            public static final class Companion {
                public /* synthetic */ Companion(zcl zclVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder builder) {
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder builder, zcl zclVar) {
                this(builder);
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web _build() {
                return this._builder.build();
            }

            public final void clearNetworkDownlink() {
                this._builder.clearNetworkDownlink();
            }

            public final void clearNetworkEffectiveType() {
                this._builder.clearNetworkEffectiveType();
            }

            public final void clearNetworkRtt() {
                this._builder.clearNetworkRtt();
            }

            public final void clearNetworkSaveData() {
                this._builder.clearNetworkSaveData();
            }

            public final void clearPrefersColorScheme() {
                this._builder.clearPrefersColorScheme();
            }

            public final void clearPrefersReducedMotion() {
                this._builder.clearPrefersReducedMotion();
            }

            public final double getNetworkDownlink() {
                return this._builder.getNetworkDownlink();
            }

            public final String getNetworkEffectiveType() {
                return this._builder.getNetworkEffectiveType();
            }

            public final int getNetworkRtt() {
                return this._builder.getNetworkRtt();
            }

            public final boolean getNetworkSaveData() {
                return this._builder.getNetworkSaveData();
            }

            public final String getPrefersColorScheme() {
                return this._builder.getPrefersColorScheme();
            }

            public final boolean getPrefersReducedMotion() {
                return this._builder.getPrefersReducedMotion();
            }

            public final boolean hasNetworkDownlink() {
                return this._builder.hasNetworkDownlink();
            }

            public final boolean hasNetworkEffectiveType() {
                return this._builder.hasNetworkEffectiveType();
            }

            public final boolean hasNetworkRtt() {
                return this._builder.hasNetworkRtt();
            }

            public final boolean hasNetworkSaveData() {
                return this._builder.hasNetworkSaveData();
            }

            public final boolean hasPrefersColorScheme() {
                return this._builder.hasPrefersColorScheme();
            }

            public final boolean hasPrefersReducedMotion() {
                return this._builder.hasPrefersReducedMotion();
            }

            public final void setNetworkDownlink(double d) {
                this._builder.setNetworkDownlink(d);
            }

            public final void setNetworkEffectiveType(String str) {
                this._builder.setNetworkEffectiveType(str);
            }

            public final void setNetworkRtt(int i) {
                this._builder.setNetworkRtt(i);
            }

            public final void setNetworkSaveData(boolean z) {
                this._builder.setNetworkSaveData(z);
            }

            public final void setPrefersColorScheme(String str) {
                this._builder.setPrefersColorScheme(str);
            }

            public final void setPrefersReducedMotion(boolean z) {
                this._builder.setPrefersReducedMotion(z);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.Builder builder) {
                this._builder = builder;
            }
        }

        private WebKt() {
        }
    }

    private DynamicDeviceInfoKt() {
    }

    /* renamed from: -initializeandroid, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android m232initializeandroid(izs<? super AndroidKt.Dsl, s3q0> izsVar) {
        AndroidKt.Dsl _create = AndroidKt.Dsl.Companion._create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    /* renamed from: -initializeios, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios m233initializeios(izs<? super IosKt.Dsl, s3q0> izsVar) {
        IosKt.Dsl _create = IosKt.Dsl.Companion._create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    /* renamed from: -initializeweb, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web m234initializeweb(izs<? super WebKt.Dsl, s3q0> izsVar) {
        WebKt.Dsl _create = WebKt.Dsl.Companion._create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
