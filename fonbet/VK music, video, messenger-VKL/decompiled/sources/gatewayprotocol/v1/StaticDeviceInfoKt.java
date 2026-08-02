package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: StaticDeviceInfoKt.kt */
/* loaded from: classes8.dex */
public final class StaticDeviceInfoKt {
    public static final StaticDeviceInfoKt INSTANCE = new StaticDeviceInfoKt();

    /* compiled from: StaticDeviceInfoKt.kt */
    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        /* compiled from: StaticDeviceInfoKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder _builder;

            /* compiled from: StaticDeviceInfoKt.kt */
            public static final class Companion {
                public /* synthetic */ Companion(zcl zclVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder, zcl zclVar) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Android _build() {
                return this._builder.build();
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final void clearDisplayScreenDensity() {
                this._builder.clearDisplayScreenDensity();
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final void clearJvmMaxMemory() {
                this._builder.clearJvmMaxMemory();
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final void clearTotalDiskSpaceInternal() {
                this._builder.clearTotalDiskSpaceInternal();
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            public final String getAndroidFingerprint() {
                return this._builder.getAndroidFingerprint();
            }

            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            public final String getApkDeveloperSigningCertificateHash() {
                return this._builder.getApkDeveloperSigningCertificateHash();
            }

            public final String getAppInstaller() {
                return this._builder.getAppInstaller();
            }

            public final String getBuildBoard() {
                return this._builder.getBuildBoard();
            }

            public final String getBuildBootloader() {
                return this._builder.getBuildBootloader();
            }

            public final String getBuildBrand() {
                return this._builder.getBuildBrand();
            }

            public final String getBuildDevice() {
                return this._builder.getBuildDevice();
            }

            public final String getBuildDisplay() {
                return this._builder.getBuildDisplay();
            }

            public final String getBuildFingerprint() {
                return this._builder.getBuildFingerprint();
            }

            public final String getBuildHardware() {
                return this._builder.getBuildHardware();
            }

            public final String getBuildHost() {
                return this._builder.getBuildHost();
            }

            public final String getBuildId() {
                return this._builder.getBuildId();
            }

            public final String getBuildProduct() {
                return this._builder.getBuildProduct();
            }

            public final int getDisplayScreenDensity() {
                return this._builder.getDisplayScreenDensity();
            }

            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            public final long getJvmMaxMemory() {
                return this._builder.getJvmMaxMemory();
            }

            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            public final String getSimOperator() {
                return this._builder.getSimOperator();
            }

            public final long getTotalDiskSpaceInternal() {
                return this._builder.getTotalDiskSpaceInternal();
            }

            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final boolean hasDisplayScreenDensity() {
                return this._builder.hasDisplayScreenDensity();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final boolean hasJvmMaxMemory() {
                return this._builder.hasJvmMaxMemory();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }

            public final boolean hasTotalDiskSpaceInternal() {
                return this._builder.hasTotalDiskSpaceInternal();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            public final void setAndroidFingerprint(String str) {
                this._builder.setAndroidFingerprint(str);
            }

            public final void setApiLevel(int i) {
                this._builder.setApiLevel(i);
            }

            public final void setApkDeveloperSigningCertificateHash(String str) {
                this._builder.setApkDeveloperSigningCertificateHash(str);
            }

            public final void setAppInstaller(String str) {
                this._builder.setAppInstaller(str);
            }

            public final void setBuildBoard(String str) {
                this._builder.setBuildBoard(str);
            }

            public final void setBuildBootloader(String str) {
                this._builder.setBuildBootloader(str);
            }

            public final void setBuildBrand(String str) {
                this._builder.setBuildBrand(str);
            }

            public final void setBuildDevice(String str) {
                this._builder.setBuildDevice(str);
            }

            public final void setBuildDisplay(String str) {
                this._builder.setBuildDisplay(str);
            }

            public final void setBuildFingerprint(String str) {
                this._builder.setBuildFingerprint(str);
            }

            public final void setBuildHardware(String str) {
                this._builder.setBuildHardware(str);
            }

            public final void setBuildHost(String str) {
                this._builder.setBuildHost(str);
            }

            public final void setBuildId(String str) {
                this._builder.setBuildId(str);
            }

            public final void setBuildProduct(String str) {
                this._builder.setBuildProduct(str);
            }

            public final void setDisplayScreenDensity(int i) {
                this._builder.setDisplayScreenDensity(i);
            }

            public final void setExtensionVersion(int i) {
                this._builder.setExtensionVersion(i);
            }

            public final void setJvmMaxMemory(long j) {
                this._builder.setJvmMaxMemory(j);
            }

            public final void setPhoneType(int i) {
                this._builder.setPhoneType(i);
            }

            public final void setSimOperator(String str) {
                this._builder.setSimOperator(str);
            }

            public final void setTotalDiskSpaceInternal(long j) {
                this._builder.setTotalDiskSpaceInternal(j);
            }

            public final void setVersionCode(int i) {
                this._builder.setVersionCode(i);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    /* compiled from: StaticDeviceInfoKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        /* compiled from: StaticDeviceInfoKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: StaticDeviceInfoKt.kt */
        public static final class KeyboardLanguagesProxy extends DslProxy {
            private KeyboardLanguagesProxy() {
            }
        }

        /* compiled from: StaticDeviceInfoKt.kt */
        public static final class StoresProxy extends DslProxy {
            private StoresProxy() {
            }
        }

        public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo _build() {
            return this._builder.build();
        }

        /* renamed from: addAllKeyboardLanguages, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllKeyboardLanguages(DslList dslList, Iterable iterable) {
            this._builder.addAllKeyboardLanguages(iterable);
        }

        /* renamed from: addAllStores, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllStores(DslList dslList, Iterable iterable) {
            this._builder.addAllStores(iterable);
        }

        /* renamed from: addKeyboardLanguages, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignKeyboardLanguages(DslList dslList, String str) {
            this._builder.addKeyboardLanguages(str);
        }

        /* renamed from: addStores, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignStores(DslList dslList, String str) {
            this._builder.addStores(str);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final /* synthetic */ void clearKeyboardLanguages(DslList dslList) {
            this._builder.clearKeyboardLanguages();
        }

        public final void clearMadeWithUnity() {
            this._builder.clearMadeWithUnity();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final /* synthetic */ void clearStores(DslList dslList) {
            this._builder.clearStores();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalDiskSpaceBytes() {
            this._builder.clearTotalDiskSpaceBytes();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearWeb() {
            this._builder.clearWeb();
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            return this._builder.getAndroid();
        }

        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        public final String getBundleId() {
            return this._builder.getBundleId();
        }

        public final String getBundleVersion() {
            return this._builder.getBundleVersion();
        }

        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        public final String getCpuModel() {
            return this._builder.getCpuModel();
        }

        public final String getDeviceMake() {
            return this._builder.getDeviceMake();
        }

        public final String getDeviceModel() {
            return this._builder.getDeviceModel();
        }

        public final String getGpuModel() {
            return this._builder.getGpuModel();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            return this._builder.getIos();
        }

        public final DslList<String, KeyboardLanguagesProxy> getKeyboardLanguages() {
            return new DslList<>(this._builder.getKeyboardLanguagesList());
        }

        public final boolean getMadeWithUnity() {
            return this._builder.getMadeWithUnity();
        }

        public final String getOsVersion() {
            return this._builder.getOsVersion();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            return this._builder.getPlatformSpecificCase();
        }

        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final DslList<String, StoresProxy> getStores() {
            return new DslList<>(this._builder.getStoresList());
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalDiskSpaceBytes() {
            return this._builder.getTotalDiskSpaceBytes();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Web getWeb() {
            return this._builder.getWeb();
        }

        public final String getWebviewUa() {
            return this._builder.getWebviewUa();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
        }

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasMadeWithUnity() {
            return this._builder.hasMadeWithUnity();
        }

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final boolean hasTotalDiskSpaceBytes() {
            return this._builder.hasTotalDiskSpaceBytes();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final boolean hasWeb() {
            return this._builder.hasWeb();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        public final void setAndroid(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2) {
            this._builder.setAndroid(android2);
        }

        public final void setAppDebuggable(boolean z) {
            this._builder.setAppDebuggable(z);
        }

        public final void setBundleId(String str) {
            this._builder.setBundleId(str);
        }

        public final void setBundleVersion(String str) {
            this._builder.setBundleVersion(str);
        }

        public final void setCpuCount(long j) {
            this._builder.setCpuCount(j);
        }

        public final void setCpuModel(String str) {
            this._builder.setCpuModel(str);
        }

        public final void setDeviceMake(String str) {
            this._builder.setDeviceMake(str);
        }

        public final void setDeviceModel(String str) {
            this._builder.setDeviceModel(str);
        }

        public final void setGpuModel(String str) {
            this._builder.setGpuModel(str);
        }

        public final void setIos(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios) {
            this._builder.setIos(ios);
        }

        public final /* synthetic */ void setKeyboardLanguages(DslList dslList, int i, String str) {
            this._builder.setKeyboardLanguages(i, str);
        }

        public final void setMadeWithUnity(boolean z) {
            this._builder.setMadeWithUnity(z);
        }

        public final void setOsVersion(String str) {
            this._builder.setOsVersion(str);
        }

        public final void setRooted(boolean z) {
            this._builder.setRooted(z);
        }

        public final void setScreenDensity(int i) {
            this._builder.setScreenDensity(i);
        }

        public final void setScreenHeight(int i) {
            this._builder.setScreenHeight(i);
        }

        public final void setScreenSize(int i) {
            this._builder.setScreenSize(i);
        }

        public final void setScreenWidth(int i) {
            this._builder.setScreenWidth(i);
        }

        public final /* synthetic */ void setStores(DslList dslList, int i, String str) {
            this._builder.setStores(i, str);
        }

        public final void setTotalDiskSpace(long j) {
            this._builder.setTotalDiskSpace(j);
        }

        public final void setTotalDiskSpaceBytes(long j) {
            this._builder.setTotalDiskSpaceBytes(j);
        }

        public final void setTotalRamMemory(long j) {
            this._builder.setTotalRamMemory(j);
        }

        public final void setWeb(StaticDeviceInfoOuterClass.StaticDeviceInfo.Web web) {
            this._builder.setWeb(web);
        }

        public final void setWebviewUa(String str) {
            this._builder.setWebviewUa(str);
        }

        private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    /* compiled from: StaticDeviceInfoKt.kt */
    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        /* compiled from: StaticDeviceInfoKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            /* compiled from: StaticDeviceInfoKt.kt */
            public static final class Companion {
                public /* synthetic */ Companion(zcl zclVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            /* compiled from: StaticDeviceInfoKt.kt */
            public static final class SkadnetworkIdProxy extends DslProxy {
                private SkadnetworkIdProxy() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder, zcl zclVar) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios _build() {
                return this._builder.build();
            }

            /* renamed from: addAllSkadnetworkId, reason: merged with bridge method [inline-methods] */
            public final /* synthetic */ void plusAssignAllSkadnetworkId(DslList dslList, Iterable iterable) {
                this._builder.addAllSkadnetworkId(iterable);
            }

            /* renamed from: addSkadnetworkId, reason: merged with bridge method [inline-methods] */
            public final /* synthetic */ void plusAssignSkadnetworkId(DslList dslList, String str) {
                this._builder.addSkadnetworkId(str);
            }

            public final void clearAdAttributionKitSupported() {
                this._builder.clearAdAttributionKitSupported();
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final void clearBundleVersionFull() {
                this._builder.clearBundleVersionFull();
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            public final /* synthetic */ void clearSkadnetworkId(DslList dslList) {
                this._builder.clearSkadnetworkId();
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final void clearUserInterfaceIdiom() {
                this._builder.clearUserInterfaceIdiom();
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            public final boolean getAdAttributionKitSupported() {
                return this._builder.getAdAttributionKitSupported();
            }

            public final String getBuiltSdkVersion() {
                return this._builder.getBuiltSdkVersion();
            }

            public final String getBundleVersionFull() {
                return this._builder.getBundleVersionFull();
            }

            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            public final DslList<String, SkadnetworkIdProxy> getSkadnetworkId() {
                return new DslList<>(this._builder.getSkadnetworkIdList());
            }

            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            public final StaticDeviceInfoOuterClass.StaticDeviceInfo.UserInterfaceIdiom getUserInterfaceIdiom() {
                return this._builder.getUserInterfaceIdiom();
            }

            public final int getUserInterfaceIdiomValue() {
                return this._builder.getUserInterfaceIdiomValue();
            }

            public final String getXcodeBuildVersion() {
                return this._builder.getXcodeBuildVersion();
            }

            public final String getXcodeSdkBuildVersion() {
                return this._builder.getXcodeSdkBuildVersion();
            }

            public final String getXcodeVersion() {
                return this._builder.getXcodeVersion();
            }

            public final boolean hasAdAttributionKitSupported() {
                return this._builder.hasAdAttributionKitSupported();
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            public final boolean hasBundleVersionFull() {
                return this._builder.hasBundleVersionFull();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean hasUserInterfaceIdiom() {
                return this._builder.hasUserInterfaceIdiom();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            public final void setAdAttributionKitSupported(boolean z) {
                this._builder.setAdAttributionKitSupported(z);
            }

            public final void setBuiltSdkVersion(String str) {
                this._builder.setBuiltSdkVersion(str);
            }

            public final void setBundleVersionFull(String str) {
                this._builder.setBundleVersionFull(str);
            }

            public final void setCanMakePayments(boolean z) {
                this._builder.setCanMakePayments(z);
            }

            public final void setScreenScale(int i) {
                this._builder.setScreenScale(i);
            }

            public final void setSimulator(boolean z) {
                this._builder.setSimulator(z);
            }

            public final /* synthetic */ void setSkadnetworkId(DslList dslList, int i, String str) {
                this._builder.setSkadnetworkId(i, str);
            }

            public final void setSystemBootTime(long j) {
                this._builder.setSystemBootTime(j);
            }

            public final void setUserInterfaceIdiom(StaticDeviceInfoOuterClass.StaticDeviceInfo.UserInterfaceIdiom userInterfaceIdiom) {
                this._builder.setUserInterfaceIdiom(userInterfaceIdiom);
            }

            public final void setUserInterfaceIdiomValue(int i) {
                this._builder.setUserInterfaceIdiomValue(i);
            }

            public final void setXcodeBuildVersion(String str) {
                this._builder.setXcodeBuildVersion(str);
            }

            public final void setXcodeSdkBuildVersion(String str) {
                this._builder.setXcodeSdkBuildVersion(str);
            }

            public final void setXcodeVersion(String str) {
                this._builder.setXcodeVersion(str);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    /* compiled from: StaticDeviceInfoKt.kt */
    public static final class WebKt {
        public static final WebKt INSTANCE = new WebKt();

        /* compiled from: StaticDeviceInfoKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Web.Builder _builder;

            /* compiled from: StaticDeviceInfoKt.kt */
            public static final class Companion {
                public /* synthetic */ Companion(zcl zclVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Web.Builder builder) {
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Web.Builder builder, zcl zclVar) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Web _build() {
                return this._builder.build();
            }

            public final void clearBrowser() {
                this._builder.clearBrowser();
            }

            public final void clearBrowserVersion() {
                this._builder.clearBrowserVersion();
            }

            public final void clearUserAgentDataMobile() {
                this._builder.clearUserAgentDataMobile();
            }

            public final void clearUserAgentDataPlatform() {
                this._builder.clearUserAgentDataPlatform();
            }

            public final void clearWebglRenderer() {
                this._builder.clearWebglRenderer();
            }

            public final void clearWebglVendor() {
                this._builder.clearWebglVendor();
            }

            public final String getBrowser() {
                return this._builder.getBrowser();
            }

            public final String getBrowserVersion() {
                return this._builder.getBrowserVersion();
            }

            public final boolean getUserAgentDataMobile() {
                return this._builder.getUserAgentDataMobile();
            }

            public final String getUserAgentDataPlatform() {
                return this._builder.getUserAgentDataPlatform();
            }

            public final String getWebglRenderer() {
                return this._builder.getWebglRenderer();
            }

            public final String getWebglVendor() {
                return this._builder.getWebglVendor();
            }

            public final boolean hasBrowser() {
                return this._builder.hasBrowser();
            }

            public final boolean hasBrowserVersion() {
                return this._builder.hasBrowserVersion();
            }

            public final boolean hasUserAgentDataMobile() {
                return this._builder.hasUserAgentDataMobile();
            }

            public final boolean hasUserAgentDataPlatform() {
                return this._builder.hasUserAgentDataPlatform();
            }

            public final boolean hasWebglRenderer() {
                return this._builder.hasWebglRenderer();
            }

            public final boolean hasWebglVendor() {
                return this._builder.hasWebglVendor();
            }

            public final void setBrowser(String str) {
                this._builder.setBrowser(str);
            }

            public final void setBrowserVersion(String str) {
                this._builder.setBrowserVersion(str);
            }

            public final void setUserAgentDataMobile(boolean z) {
                this._builder.setUserAgentDataMobile(z);
            }

            public final void setUserAgentDataPlatform(String str) {
                this._builder.setUserAgentDataPlatform(str);
            }

            public final void setWebglRenderer(String str) {
                this._builder.setWebglRenderer(str);
            }

            public final void setWebglVendor(String str) {
                this._builder.setWebglVendor(str);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Web.Builder builder) {
                this._builder = builder;
            }
        }

        private WebKt() {
        }
    }

    private StaticDeviceInfoKt() {
    }

    /* renamed from: -initializeandroid, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android m269initializeandroid(izs<? super AndroidKt.Dsl, s3q0> izsVar) {
        AndroidKt.Dsl _create = AndroidKt.Dsl.Companion._create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    /* renamed from: -initializeios, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios m270initializeios(izs<? super IosKt.Dsl, s3q0> izsVar) {
        IosKt.Dsl _create = IosKt.Dsl.Companion._create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    /* renamed from: -initializeweb, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Web m271initializeweb(izs<? super WebKt.Dsl, s3q0> izsVar) {
        WebKt.Dsl _create = WebKt.Dsl.Companion._create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Web.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
