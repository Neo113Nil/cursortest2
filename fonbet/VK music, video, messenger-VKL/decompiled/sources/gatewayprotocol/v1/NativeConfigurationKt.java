package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.zcl;

/* compiled from: NativeConfigurationKt.kt */
/* loaded from: classes8.dex */
public final class NativeConfigurationKt {
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    /* compiled from: NativeConfigurationKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        /* compiled from: NativeConfigurationKt.kt */
        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        /* compiled from: NativeConfigurationKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: NativeConfigurationKt.kt */
        public static final class MonitoringIdsProxy extends DslProxy {
            private MonitoringIdsProxy() {
            }
        }

        /* compiled from: NativeConfigurationKt.kt */
        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
            private ObservableAndroidActivitiesProxy() {
            }
        }

        /* compiled from: NativeConfigurationKt.kt */
        public static final class ObservableViewControllersProxy extends DslProxy {
            private ObservableViewControllersProxy() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            return this._builder.build();
        }

        /* renamed from: addAdditionalStorePackages, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList dslList, String str) {
            this._builder.addAdditionalStorePackages(str);
        }

        /* renamed from: addAllAdditionalStorePackages, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList dslList, Iterable iterable) {
            this._builder.addAllAdditionalStorePackages(iterable);
        }

        /* renamed from: addAllMonitoringIds, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllMonitoringIds(DslList dslList, Iterable iterable) {
            this._builder.addAllMonitoringIds(iterable);
        }

        /* renamed from: addAllObservableAndroidActivities, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllObservableAndroidActivities(DslList dslList, Iterable iterable) {
            this._builder.addAllObservableAndroidActivities(iterable);
        }

        /* renamed from: addAllObservableViewControllers, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllObservableViewControllers(DslList dslList, Iterable iterable) {
            this._builder.addAllObservableViewControllers(iterable);
        }

        /* renamed from: addMonitoringIds, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignMonitoringIds(DslList dslList, int i) {
            this._builder.addMonitoringIds(i);
        }

        /* renamed from: addObservableAndroidActivities, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignObservableAndroidActivities(DslList dslList, ByteString byteString) {
            this._builder.addObservableAndroidActivities(byteString);
        }

        /* renamed from: addObservableViewControllers, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignObservableViewControllers(DslList dslList, ByteString byteString) {
            this._builder.addObservableViewControllers(byteString);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final void clearCachedWebviewFilesConfiguration() {
            this._builder.clearCachedWebviewFilesConfiguration();
        }

        public final void clearDebugSettings() {
            this._builder.clearDebugSettings();
        }

        public final void clearDefaultShowCompletionState() {
            this._builder.clearDefaultShowCompletionState();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearDownloadPolicy() {
            this._builder.clearDownloadPolicy();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final void clearLevelPlayAppKey() {
            this._builder.clearLevelPlayAppKey();
        }

        public final void clearMaxExtrasSizeKb() {
            this._builder.clearMaxExtrasSizeKb();
        }

        public final void clearMaxReceiptSizeMb() {
            this._builder.clearMaxReceiptSizeMb();
        }

        public final /* synthetic */ void clearMonitoringIds(DslList dslList) {
            this._builder.clearMonitoringIds();
        }

        public final /* synthetic */ void clearObservableAndroidActivities(DslList dslList) {
            this._builder.clearObservableAndroidActivities();
        }

        public final /* synthetic */ void clearObservableViewControllers(DslList dslList) {
            this._builder.clearObservableViewControllers();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final void clearOverwriteIntentFlagActivity() {
            this._builder.clearOverwriteIntentFlagActivity();
        }

        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            return this._builder.getAdOperations();
        }

        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            return this._builder.getAdPolicy();
        }

        public final DslList<String, AdditionalStorePackagesProxy> getAdditionalStorePackages() {
            return new DslList<>(this._builder.getAdditionalStorePackagesList());
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            return this._builder.getCachedAssetsConfiguration();
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            return this._builder.getCachedWebviewFilesConfiguration();
        }

        public final NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            return this._builder.getDebugSettings();
        }

        public final NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            return this._builder.getDefaultShowCompletionState();
        }

        public final int getDefaultShowCompletionStateValue() {
            return this._builder.getDefaultShowCompletionStateValue();
        }

        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            return this._builder.getDiagnosticEvents();
        }

        public final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            return this._builder.getDownloadPolicy();
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            return this._builder.getFeatureFlags();
        }

        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            return this._builder.getInitPolicy();
        }

        public final String getLevelPlayAppKey() {
            return this._builder.getLevelPlayAppKey();
        }

        public final int getMaxExtrasSizeKb() {
            return this._builder.getMaxExtrasSizeKb();
        }

        public final int getMaxReceiptSizeMb() {
            return this._builder.getMaxReceiptSizeMb();
        }

        public final /* synthetic */ DslList getMonitoringIds() {
            return new DslList(this._builder.getMonitoringIdsList());
        }

        public final /* synthetic */ DslList getObservableAndroidActivities() {
            return new DslList(this._builder.getObservableAndroidActivitiesList());
        }

        public final /* synthetic */ DslList getObservableViewControllers() {
            return new DslList(this._builder.getObservableViewControllersList());
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            return this._builder.getOperativeEventPolicy();
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            return this._builder.getOtherPolicy();
        }

        public final int getOverwriteIntentFlagActivity() {
            return this._builder.getOverwriteIntentFlagActivity();
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        public final boolean hasCachedWebviewFilesConfiguration() {
            return this._builder.hasCachedWebviewFilesConfiguration();
        }

        public final boolean hasDebugSettings() {
            return this._builder.hasDebugSettings();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasDownloadPolicy() {
            return this._builder.hasDownloadPolicy();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasLevelPlayAppKey() {
            return this._builder.hasLevelPlayAppKey();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        public final void setAdOperations(NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            this._builder.setAdOperations(adOperationsConfiguration);
        }

        public final void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            this._builder.setAdPolicy(requestPolicy);
        }

        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i, String str) {
            this._builder.setAdditionalStorePackages(i, str);
        }

        public final void setCachedAssetsConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            this._builder.setCachedAssetsConfiguration(cachedAssetsConfiguration);
        }

        public final void setCachedWebviewFilesConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            this._builder.setCachedWebviewFilesConfiguration(cachedAssetsConfiguration);
        }

        public final void setDebugSettings(NativeConfigurationOuterClass.DebugSettings debugSettings) {
            this._builder.setDebugSettings(debugSettings);
        }

        public final void setDefaultShowCompletionState(NativeConfigurationOuterClass.ShowCompletionState showCompletionState) {
            this._builder.setDefaultShowCompletionState(showCompletionState);
        }

        public final void setDefaultShowCompletionStateValue(int i) {
            this._builder.setDefaultShowCompletionStateValue(i);
        }

        public final void setDiagnosticEvents(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            this._builder.setDiagnosticEvents(diagnosticEventsConfiguration);
        }

        public final void setDownloadPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            this._builder.setDownloadPolicy(requestPolicy);
        }

        public final void setEnableIapEvent(boolean z) {
            this._builder.setEnableIapEvent(z);
        }

        public final void setEnableOm(boolean z) {
            this._builder.setEnableOm(z);
        }

        public final void setFeatureFlags(NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            this._builder.setFeatureFlags(featureFlags);
        }

        public final void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            this._builder.setInitPolicy(requestPolicy);
        }

        public final void setLevelPlayAppKey(String str) {
            this._builder.setLevelPlayAppKey(str);
        }

        public final void setMaxExtrasSizeKb(int i) {
            this._builder.setMaxExtrasSizeKb(i);
        }

        public final void setMaxReceiptSizeMb(int i) {
            this._builder.setMaxReceiptSizeMb(i);
        }

        public final /* synthetic */ void setMonitoringIds(DslList dslList, int i, int i2) {
            this._builder.setMonitoringIds(i, i2);
        }

        public final /* synthetic */ void setObservableAndroidActivities(DslList dslList, int i, ByteString byteString) {
            this._builder.setObservableAndroidActivities(i, byteString);
        }

        public final /* synthetic */ void setObservableViewControllers(DslList dslList, int i, ByteString byteString) {
            this._builder.setObservableViewControllers(i, byteString);
        }

        public final void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            this._builder.setOperativeEventPolicy(requestPolicy);
        }

        public final void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            this._builder.setOtherPolicy(requestPolicy);
        }

        public final void setOverwriteIntentFlagActivity(int i) {
            this._builder.setOverwriteIntentFlagActivity(i);
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private NativeConfigurationKt() {
    }
}
