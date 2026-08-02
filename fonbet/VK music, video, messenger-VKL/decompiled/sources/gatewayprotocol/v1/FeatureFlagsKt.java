package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.zcl;

/* compiled from: FeatureFlagsKt.kt */
/* loaded from: classes8.dex */
public final class FeatureFlagsKt {
    public static final FeatureFlagsKt INSTANCE = new FeatureFlagsKt();

    /* compiled from: FeatureFlagsKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.FeatureFlags.Builder _builder;

        /* compiled from: FeatureFlagsKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.FeatureFlags _build() {
            return this._builder.build();
        }

        public final void clearAppSheetBugCheckEnabled() {
            this._builder.clearAppSheetBugCheckEnabled();
        }

        public final void clearBoldSdkNextSessionEnabled() {
            this._builder.clearBoldSdkNextSessionEnabled();
        }

        public final void clearCollectGoogleAppId() {
            this._builder.clearCollectGoogleAppId();
        }

        public final void clearCollectIlrData() {
            this._builder.clearCollectIlrData();
        }

        public final void clearCollectLifecycleEvents() {
            this._builder.clearCollectLifecycleEvents();
        }

        public final void clearDisableCustomScheme() {
            this._builder.clearDisableCustomScheme();
        }

        public final void clearDisableGridCollection() {
            this._builder.clearDisableGridCollection();
        }

        public final void clearEnableCoherenceLibrary() {
            this._builder.clearEnableCoherenceLibrary();
        }

        public final void clearEnsureCacheFolderExistences() {
            this._builder.clearEnsureCacheFolderExistences();
        }

        public final void clearFullscreenNavBarMode() {
            this._builder.clearFullscreenNavBarMode();
        }

        public final void clearNativeStartMode() {
            this._builder.clearNativeStartMode();
        }

        public final void clearOpenglGpuEnabled() {
            this._builder.clearOpenglGpuEnabled();
        }

        public final void clearOpportunityIdPlacementValidation() {
            this._builder.clearOpportunityIdPlacementValidation();
        }

        public final void clearRecoverTerminatedWebviews() {
            this._builder.clearRecoverTerminatedWebviews();
        }

        public final void clearShouldHandleWebviewCaching() {
            this._builder.clearShouldHandleWebviewCaching();
        }

        public final void clearShouldInitAdqWithGameId() {
            this._builder.clearShouldInitAdqWithGameId();
        }

        public final void clearShouldSendIapHistory() {
            this._builder.clearShouldSendIapHistory();
        }

        public final void clearUseFilesDir() {
            this._builder.clearUseFilesDir();
        }

        public final void clearUseOptimisticWebviewCache() {
            this._builder.clearUseOptimisticWebviewCache();
        }

        public final void clearUseTryCatchInDownloadQueue() {
            this._builder.clearUseTryCatchInDownloadQueue();
        }

        public final void clearWebviewLessLoadParallelActivityLaunch() {
            this._builder.clearWebviewLessLoadParallelActivityLaunch();
        }

        public final boolean getAppSheetBugCheckEnabled() {
            return this._builder.getAppSheetBugCheckEnabled();
        }

        public final boolean getBoldSdkNextSessionEnabled() {
            return this._builder.getBoldSdkNextSessionEnabled();
        }

        public final boolean getCollectGoogleAppId() {
            return this._builder.getCollectGoogleAppId();
        }

        public final boolean getCollectIlrData() {
            return this._builder.getCollectIlrData();
        }

        public final boolean getCollectLifecycleEvents() {
            return this._builder.getCollectLifecycleEvents();
        }

        public final boolean getDisableCustomScheme() {
            return this._builder.getDisableCustomScheme();
        }

        public final boolean getDisableGridCollection() {
            return this._builder.getDisableGridCollection();
        }

        public final boolean getEnableCoherenceLibrary() {
            return this._builder.getEnableCoherenceLibrary();
        }

        public final boolean getEnsureCacheFolderExistences() {
            return this._builder.getEnsureCacheFolderExistences();
        }

        public final NativeConfigurationOuterClass.FullscreenNavBarMode getFullscreenNavBarMode() {
            return this._builder.getFullscreenNavBarMode();
        }

        public final int getFullscreenNavBarModeValue() {
            return this._builder.getFullscreenNavBarModeValue();
        }

        public final NativeConfigurationOuterClass.NativeStartMode getNativeStartMode() {
            return this._builder.getNativeStartMode();
        }

        public final int getNativeStartModeValue() {
            return this._builder.getNativeStartModeValue();
        }

        public final boolean getOpenglGpuEnabled() {
            return this._builder.getOpenglGpuEnabled();
        }

        public final boolean getOpportunityIdPlacementValidation() {
            return this._builder.getOpportunityIdPlacementValidation();
        }

        public final boolean getRecoverTerminatedWebviews() {
            return this._builder.getRecoverTerminatedWebviews();
        }

        public final boolean getShouldHandleWebviewCaching() {
            return this._builder.getShouldHandleWebviewCaching();
        }

        public final boolean getShouldInitAdqWithGameId() {
            return this._builder.getShouldInitAdqWithGameId();
        }

        public final boolean getShouldSendIapHistory() {
            return this._builder.getShouldSendIapHistory();
        }

        public final boolean getUseFilesDir() {
            return this._builder.getUseFilesDir();
        }

        public final boolean getUseOptimisticWebviewCache() {
            return this._builder.getUseOptimisticWebviewCache();
        }

        public final boolean getUseTryCatchInDownloadQueue() {
            return this._builder.getUseTryCatchInDownloadQueue();
        }

        public final boolean getWebviewLessLoadParallelActivityLaunch() {
            return this._builder.getWebviewLessLoadParallelActivityLaunch();
        }

        public final void setAppSheetBugCheckEnabled(boolean z) {
            this._builder.setAppSheetBugCheckEnabled(z);
        }

        public final void setBoldSdkNextSessionEnabled(boolean z) {
            this._builder.setBoldSdkNextSessionEnabled(z);
        }

        public final void setCollectGoogleAppId(boolean z) {
            this._builder.setCollectGoogleAppId(z);
        }

        public final void setCollectIlrData(boolean z) {
            this._builder.setCollectIlrData(z);
        }

        public final void setCollectLifecycleEvents(boolean z) {
            this._builder.setCollectLifecycleEvents(z);
        }

        public final void setDisableCustomScheme(boolean z) {
            this._builder.setDisableCustomScheme(z);
        }

        public final void setDisableGridCollection(boolean z) {
            this._builder.setDisableGridCollection(z);
        }

        public final void setEnableCoherenceLibrary(boolean z) {
            this._builder.setEnableCoherenceLibrary(z);
        }

        public final void setEnsureCacheFolderExistences(boolean z) {
            this._builder.setEnsureCacheFolderExistences(z);
        }

        public final void setFullscreenNavBarMode(NativeConfigurationOuterClass.FullscreenNavBarMode fullscreenNavBarMode) {
            this._builder.setFullscreenNavBarMode(fullscreenNavBarMode);
        }

        public final void setFullscreenNavBarModeValue(int i) {
            this._builder.setFullscreenNavBarModeValue(i);
        }

        public final void setNativeStartMode(NativeConfigurationOuterClass.NativeStartMode nativeStartMode) {
            this._builder.setNativeStartMode(nativeStartMode);
        }

        public final void setNativeStartModeValue(int i) {
            this._builder.setNativeStartModeValue(i);
        }

        public final void setOpenglGpuEnabled(boolean z) {
            this._builder.setOpenglGpuEnabled(z);
        }

        public final void setOpportunityIdPlacementValidation(boolean z) {
            this._builder.setOpportunityIdPlacementValidation(z);
        }

        public final void setRecoverTerminatedWebviews(boolean z) {
            this._builder.setRecoverTerminatedWebviews(z);
        }

        public final void setShouldHandleWebviewCaching(boolean z) {
            this._builder.setShouldHandleWebviewCaching(z);
        }

        public final void setShouldInitAdqWithGameId(boolean z) {
            this._builder.setShouldInitAdqWithGameId(z);
        }

        public final void setShouldSendIapHistory(boolean z) {
            this._builder.setShouldSendIapHistory(z);
        }

        public final void setUseFilesDir(boolean z) {
            this._builder.setUseFilesDir(z);
        }

        public final void setUseOptimisticWebviewCache(boolean z) {
            this._builder.setUseOptimisticWebviewCache(z);
        }

        public final void setUseTryCatchInDownloadQueue(boolean z) {
            this._builder.setUseTryCatchInDownloadQueue(z);
        }

        public final void setWebviewLessLoadParallelActivityLaunch(boolean z) {
            this._builder.setWebviewLessLoadParallelActivityLaunch(z);
        }

        private Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
            this._builder = builder;
        }
    }

    private FeatureFlagsKt() {
    }
}
