package xsna;

import android.content.res.Resources;
import android.os.Build;
import android.os.strictmode.CleartextNetworkViolation;
import android.os.strictmode.ContentUriWithoutPermissionViolation;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.DiskWriteViolation;
import android.os.strictmode.FileUriExposedViolation;
import android.os.strictmode.InstanceCountViolation;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.os.strictmode.LeakedClosableViolation;
import android.os.strictmode.NetworkViolation;
import android.os.strictmode.NonSdkApiUsedViolation;
import android.os.strictmode.ResourceMismatchViolation;
import android.os.strictmode.ServiceConnectionLeakedViolation;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.os.strictmode.UnbufferedIoViolation;
import android.os.strictmode.UntaggedSocketViolation;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import com.vk.authutils.di.ImMultiaccountSessionHelperComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.design.inspector.DesignInspectorComponentImpl;
import com.vk.ecomm.catalog.impl.di.ClassifiedsComponentImpl;
import com.vk.im.engine.di.executor.ImCmdCoroutinesExecutorScopedComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.ml.MLFeatures;
import com.vk.musc.kidsmode.impl.di.MusicKidsModeComponentImpl;
import com.vk.sharing.im_engine_impl.di.SharingImEngineComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import xsna.vpm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wv8 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wv8(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        vpm0.a aVar;
        ExecutorService b;
        switch (this.b) {
            case 0:
                atv0.r();
                pc0.d();
                return s3q0.a;
            case 1:
                return ((ImMultiaccountSessionHelperComponent) ((k7m) m7m.f(com.vk.contacts.e.b)).a(fpf0.a(ImMultiaccountSessionHelperComponent.class))).t8();
            case 2:
                return com.vk.core.utils.newtork.b.a;
            case 3:
                return new ImCmdCoroutinesExecutorScopedComponentImpl.a();
            case 4:
                return Float.valueOf(Resources.getSystem().getDisplayMetrics().density);
            case 5:
                com.vk.ml.b bVar = MLFeatures.a;
                MLFeatures.a(false);
                return s3q0.a;
            case 6:
                return new hto();
            case 7:
                return new ClassifiedsComponentImpl.a();
            case 8:
                HashMap hashMap = new HashMap();
                int i = Build.VERSION.SDK_INT;
                vpm0.a.C3898a c3898a = vpm0.a.C3898a.a;
                hashMap.put(CleartextNetworkViolation.class, c3898a);
                hashMap.put(ContentUriWithoutPermissionViolation.class, c3898a);
                hashMap.put(CustomViolation.class, new vpm0.a.c(e43.a("com.vk.metrics.performance.handlertracking.LooperTasksChecker.start", "com.google.android.gms.chimera.container.GmsModuleProvider.query")));
                if (BuildInfo.t() || BuildInfo.g()) {
                    aVar = vpm0.a.b.a;
                } else {
                    ArrayList a = e43.a("ru.ok.tracer.crash.report.TracerCrashReport.report", "com.vk.core.performance.score.ProductScoreSessionTracker.initJankStats", "com.vk.toggle.internal.storage.database.toggle.app.AppToggleValueDao_Impl.readValue", "com.vk.toggle.internal.storage.database.toggle.app.AppToggleValueDao_Impl.readValues", "com.vk.toggle.internal.storage.database.toggle.user.UserToggleValueDao_Impl.readValues", "com.vk.toggle.internal.storage.database.toggle.meta.MetaToggleDao_Impl.readValue", "com.vk.toggle.internal.storage.mmaped.MemoryMappedFeatureSource.prepareStorage", "com.vk.toggle.internal.storage.mmaped.MemoryMappedFeatureSource.enabled", "com.vk.toggle.internal.storage.mmaped.MemoryMappedFeatureSource.<init>", "com.vk.debug.internal.DebugAppSettings.getApiVersion", "com.vk.debug.internal.DebugAppSettings.isDebugStatDailyAppStartsCheck", "com.vk.debug.internal.DebugAppSettings.isTestTooltipShow", "com.vk.core.jwdp.silencer.JWDPSilencerHook.init");
                    ArrayList a2 = e43.a("com.oneplus.uifirst.UIFirstUtils.setUxThread", "com.oneplus.theme.OpFontHelperInjector.onApplicationCreate", "com.oneplus.uifirst.UIFirstUtils.setSpecialUxThread", "com.oneplus.config.ConfigProvider.query", "io.qameta.allure.android.runners.AllureAndroidJUnitRunner.onCreate", "io.appmetrica.analytics.impl.a7.a", "androidx.core.app.AppLocalesStorageHelper.readLocales", "android.database.CursorToBulkCursorAdaptor.getBulkCursorDescriptor", "android.graphics.Typeface.getFullFlipFont", "android.graphics.Typeface.setFlipFonts", "android.graphics.Typeface.makeMtFontsDirectory", "android.os.TurboSchedMonitorImpl.getAppToken", "android.app.IdsController.doIds", "android.app.IdsController.openIdsWindow", "android.content.res.HwAssetManagerEx.getSharedResList", "android.content.res.OplusThemeResourcesSystem.checkUpdate", "android.content.ContextWrapper.getNoBackupFilesDir", "android.widget.OplusScrollOptimizationHelper.parseConfigFile", "android.hwtheme.HwThemeManager.getDataSkinThemePackages", "android.graphics.fonts.FontFamily.buildHwFonts", "android.graphics.fonts.SystemFonts.loadHwSystemFonts", "android.graphics.fonts.HwTypefaceEx.isUsingThemeFont", "android.graphics.fonts.HwTypefaceEx.isUsingOnlineVariableFont", "android.rms.iaware.BgFrameManagerImpl.handleCheckCgroup", "android.util.VivoConfigStorePropertyHelper.isZygote", "vivo.content.res.VivoThemeZipFile.isFileExist", "com.vivo.VivoSystemFrameworkFactoryImpl.createVivoDecorView", "com.vivo.services.themeicon.ThemeIconService.calculateThemePath", "huawei.android.hwutil.ZipFileCache.openZipFile", "huawei.cust.HwCfgFilePolicy.getCfgFile", "com.huawei.android.launcher.LauncherProvider.call", "com.huawei.hms.aaid.utils.PushPreferences.getString", "com.huawei.hms.aaid.utils.PushPreferences.<init>", "com.huawei.hms.aaid.utils.PushPreferences.containsKey", "com.huawei.hms.support.log.HMSLog", "com.huawei.hms.utils.ReadApkFileUtil.isCertFound", "com.huawei.hms.utils.ReadApkFileUtil.verifyApkHash", "com.huawei.hms.aaid.InitProvider.onCreate", "com.oplus.debug.InputLog.startWatching", "com.oplus.uifirst.OplusUIFirstManager.setUxThread", "com.oplus.uifirst.Utils.writeProcNode", "com.oneplus.embryo.EmbryoApp.checkHWUI", "com.oneplus.embryo.EmbryoApp.checkDecorLayout", "com.samsung.android.knox.custom.ProKioskManager.getProKioskState", "com.mediatek.boostfwk.utils.Util.isGameApp", "com.mediatek.scnmodule.ScnModule.isGameApp", "com.hihonor.fluency.FluencyDetectorManagerImpl.initFlingDetect", "com.mediatek.res.ResOptExtImpl.preloadRes", "com.xiaomi.freeform.MiuiFreeformImpl.hasSmallFreeformFeature", "dalvik.system.DexPathList.makeDexElements", "miui.util.font.MultiLangHelper.initMultiLangInfo", "miui.util.font.FontSettings.checkUsingThemeFont", "miui.util.font.FontSettings.loadFontSetting", "miui.util.font.MultiLangHelper.getMiuiFontPathByLocale", "miui.util.TypefaceUtils.initSystemFont", "miui.os.DeviceFeature.hasMirihiSupport", "miui.util.TypefaceHelper.createFamily", "com.miui.base.MiuiStubRegistry.init", "com.miui.server.AccessController.haveAccessControlPassword", "com.android.server.locksettings.LockSettingsStorage.readKeyValue", "com.transsion.scaler.view.SurfaceFactory.<clinit>");
                    ArrayList a3 = e43.a("ru.mail.libverify.platform.firebase", "ru.mail.libverify.api.VerificationFactory.hasInstallation", "ru.mail.libverify.api.VerificationFactory.refreshGcmToken", "com.vk.android.launcher.icons.special.SpecialEventIconPrefsStorage.isEventWasAvailableLastTime", "com.vk.android.launcher.icons.availability.VkLauncherIconAvailability.updateState", "com.vk.analytics.LocationInfo.isTrackingAllowed", "com.vk.attachpicker.screen.EditorScreenNewImpl$Companion.canEdit", "com.vk.core.fragments.FragmentEntry.newInstance", "com.vk.core.ui.themes.VKThemeHelper.getTheme", "com.vk.core.ui.tracking.internal.UiTrackingListener.track", "com.vk.core.ui.tracking.internal.UiTrackingStorage.setLastVisibleScreen", "com.vk.core.ui.tracking.internal.UiTrackingStorage.getLastVisibleScreen", "com.vk.core.utils.ConfigurationOverridingHelper$FontScale.getFontScaleName", "com.vk.core.util.DisplayCutoutHelper.update", "com.vk.core.util.DisplayCutoutHelper.getHasDisplayCutout", "com.vk.core.util.DisplayCutoutHelper.getStableInsetBottom", "com.vk.core.util.KeyboardController.loadSavedHeights", "com.vk.core.util.TimeoutLock.lock", "com.vk.core.firebase.providers.FirebaseWrapperController.init", "com.vk.core.firebase.providers.FirebaseInitProviderWrapper.onCreate", "com.vk.core.view.FitSystemWindowsFrameLayout$OnApplyWindowInsetsListenerImpl.onApplyWindowInsets", "com.vk.core.hms.providers.HmsInitializationController.checkFileExistence", "com.vk.core.hms.providers.HmsInitializationController.initProviders", "com.vk.core.native_loader.NativeLibLoader.loadLibraryWithSystem", "com.vk.media.utils.CpuUtilsBase.readCpuFrequencyFromFile", "com.vk.media.utils.CpuUtilsBase.<init>", "com.vk.menu.domain.interactor.MenuInteractor.isSuperAppCacheValid", "com.vk.menu.presentation.entity.MenuUiDataUtils.setSavedCurrentItemId", "com.vk.metrics.MetricPrefs.init", "com.vk.metrics.performance.appstart.IdleStateHandler", "com.vk.metrics.performance.utils.PerformanceStorage.clearScrollFreezeData", "com.vk.metrics.apptracer.AppTracer.readConfig", "com.vk.navigation.security.AllowedIntentIdsDelegate.getAllowedIntentIds", "com.vk.navigation.NavigationDelegate.getShouldOpenPreviousRoot", "com.vk.navigation.NavigationDelegate.setOpenedFragmentIds", "com.vk.notifications.list.impl.presentation.base.mvi.common.NotificationPrefs.setCurrentSourceId", "com.vk.tabbar.core.impl.data.TabbarRepositoryImpl.getTabbarState", "com.vk.permission.PermissionHelper.updatePrefsPermissionsState", "com.vk.permission.PermissionFragment.onPermissionsGranted", "com.vk.prefui.fragments.PreferenceFragmentCompat.addPreferencesFromResource", "com.vk.pushes.helpers.NotificationHelper.updateLauncherBadge", "com.vk.sharing.core.view.SharingV2ViewPreferencesWrapper.<init>", "com.vk.superapp.miniapp.MenuApiApplicationsCache.loadApps", "com.vk.update.core.InAppUpdateManager.checkForUpdate", "com.vkontakte.android.fragments.SettingsGeneralFragment.onCreate", "com.vk.core.ui.themes.VKThemeHelper.checkTheme", "com.vk.media.MediaUtils$Companion.getVideoDurationMs", "com.vkontakte.android.im.videomessage.ImVideoMessageCameraBridgeImpl.getPlaceHolderAsFile", "com.vk.cameraui.clips.ClipsDelegate.getClipVideoFile", "com.vk.debug.internal.DebugAppSettings.isVideoPlayerExtendedLogsEnable", "com.vk.mediastore.media.exo.ExoVideoCache.getDownloadManager", "com.vk.libvideo.VideoPlaybackSpeedPersistentRepository", "com.vk.libvideo.autoplay.VideoAutoPlay", "com.vk.libvideo.autoplay.mute.settings.MuteSettingsDefault.<init>", "com.vk.libvideo.autoplay.background.watching_restriction.SuperAppVideoWatchingRestrictionController.isAllowedToPlayVideoInBackground", "com.vk.libvideo.autoplay.PlaySettings.getAutoScrollInVideoFeed", "com.vk.libvideo.ui.videoopenstandaloneview.OpenVkVideoStandaloneResolver.<init>", "one.video.statistics.onelog.OneLogVideoPlayer.log", "com.vk.toggle.data.ThreadsSubstitutionConfig", "com.vkontakte.android.bridges.VkVideoBridge.isVideoBackgroundEnabledByPref", "com.vk.onboardingpromo.impl.data.OnboardingPromoRepositoryImpl.getPromoData", "com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment$Companion.getHostURI", "com.vk.superapp.browser.internal.delegates.presenters.CallArgumentsApiBridgeTracker.getMethods", "com.vk.superapp.advertisement.ad_cache.AdvertisementCacheImpl.blockingGetAdvertisementConfig", "com.vk.emoji.Emoji.getDownloadedSpriteVersionedSizedDirPath", "com.vk.calls.CallsApplication.initPrefs", "com.vk.contacts.ContactsSyncPrefs.saveSystemPermissionGranted", "com.vk.contacts.ContactsSyncPrefs.getInAppPermissionGranted", "com.vk.contacts.ContactsSyncPrefs.prefs", "com.vk.contacts.ContactsSyncPrefs$SharedPrefListener.onSharedPreferenceChanged", "com.vk.contactssync.impl.ui.ContactSyncColdStartModalImpl.showRequestContactsAccessModal", "com.vk.common.links.processor.BaseLinkProcessor.open", "com.vk.im.auth.credentials_storage.ImCredentialsStorage.loadExchangeDataOnLogout", "com.vk.im.ui.ImUiPrefs.getReactionsAssetsVersion", "com.vk.im.ui.ImUiPrefs.getMsgReadAsLastMsgData", "com.vk.im.ui.stories.ImStoriesInfoHelperImpl.<init>", "com.vk.im.engine.utils.background.BackgroundPrefetchUtils.prefetchBackgroundIfRequired", "com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment.setupTimetable", "com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment.initTimeTableSwitch", "com.vk.repository.internal.repos.stickers.StickersPrefs.getGlobalPromotions", "com.vk.repository.internal.repos.stickers.StickersPrefs.isAnimationsEnabled", "com.vkontakte.android.fragments.messages.chat.vc.MsgSendVc.updateWritebar", "com.vk.emoji.Emoji.getDownloadedEmojiSprites", "com.vk.content.design.view.camera.BaseMasksWrap.shouldAutoShowMasks", "com.vk.multiaccount.impl.data.file.AdditionalInfoDataSource.avatarIsNft", "com.vk.story.viewer.stat.di.StoryStatisticsComponentImpl", "com.vk.storycamera.analytics.StoriesPreviewEventsCache.getCache", "com.vk.story.settings.impl.domain.StoriesSettingsControllerImpl.hasFeature", "com.vk.camera.editor.stories.impl.util.StoryControlsTipsHelper.needShowTips", "com.vk.superapp.sessionmanagment.impl.SessionManagementImpl.provideDataSource", "com.vk.multiaccount.VkMultiAccountTogglesHelper.wasMigrationComplete", "com.vk.auth.AuthAnalyticsCompletedDelegate.<init>", "com.vk.auth.VKAuthUtils.loadLightAccount", "com.vk.newsfeed.impl.controllers.NewsfeedController.putListId", "com.vk.newsfeed.impl.presentation.newsfeed_backstage.NewsfeedFragment3.onViewCreated", "com.vk.newsfeed.impl.controllers.NewsfeedController.isNewsfeedTop", "com.vk.newsfeed.impl.controllers.NewsfeedController.isStartFromInterestingPending", "com.vk.newsfeed.impl.controllers.posting.PostingItemController.refreshListId", "com.vk.newsfeed.impl.requests.GetWallInfo.<init>", "com.vk.newsfeed.utils.Newsfeed2DebugOverlay.isFreshNewsEnabled", "com.vk.newsfeed.utils.stats.ViewPostDebugConfigurationProvider.getDebugConfiguration", "com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment.<init>", "com.vk.camera.CameraExperiments.<clinit>", "com.vk.camera.clips.core.drafts.ClipsDraftCounterInteractor.getUnseenCount", "com.vk.cameraui.utils.CameraTracker.<init>", "com.vk.cameraui.masks.MasksLibDynamicLoader$callback$1.onLoadingSuccess", "com.vk.cameraui.clips.ClipsCameraSettingsController$Companion.isGridEnabled", "com.vk.content.design.view.camera.CameraUIView.showLoginDependentClipsUI", "com.vk.debug.internal.DebugAppSettings.isDebugDynamicMasksEnabled", "com.vk.ml.impl.tf.CpuReader.getTotalMem", "com.vk.media.layers.BaseLayersProviderImpl.getBlurredBitmap", "com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh.<init>", "com.vkontakte.android.audio.player.CacheUtils.getCacheDir", "com.vk.music.player.core.PlayerImpl.playUrl", "com.vk.music.player.playback.cache.PlaybackQueueCacheRepositoryImpl.clearListeningTimeEvents", "ru.ok.android.externcalls.sdk.ConversationImpl.<init>", "com.vk.core.tool.view.vkblur.VkBlurView", "com.vk.navigation.NavigationDelegateBottom", "com.vk.voip.ui.call_effects.VirtualBackgroundPreferences.getPreference", "com.vk.voip.vmoji.AnimojiDependencyImpl.preloadModel");
                    a3.addAll(a2);
                    a3.addAll(a);
                    s3q0 s3q0Var = s3q0.a;
                    aVar = new vpm0.a.c(a3);
                }
                hashMap.put(DiskReadViolation.class, aVar);
                ArrayList a4 = e43.a("com.oneplus.config.ConfigProvider.query", "com.oneplus.uifirst.UIFirstUtils.setSpecialUxThread", "com.oneplus.uifirst.UIFirstUtils.setUxThread", "android.app.IdsController.openIdsWindow", "com.huawei.android.launcher.utils.ProviderCallUtils.callBadge", "com.huawei.android.launcher.utils.ProviderCallUtils.notifyBadgeDatabase", "com.oplus.uifirst.Utils.writeProcNode", "com.vk.android.launcher.icons.availability.VkLauncherIconAvailability.updateState", "ru.mail.libverify.n0.e.a", "com.vk.music.player.core.PlayerImpl.playUrl", "com.vk.newsfeed.impl.presentation.newsfeed.NewsfeedTechStatsPlugin.onPageLoaded");
                a4.addAll(e43.a("com.vk.toggle.internal.storage.database.toggle.app.AppToggleValueDao_Impl.readValue", "com.vk.toggle.internal.storage.database.toggle.app.AppToggleValueDao_Impl.readValues", "com.vk.toggle.internal.storage.database.toggle.user.UserToggleValueDao_Impl.readValues", "com.vk.toggle.internal.storage.database.toggle.meta.MetaToggleDao_Impl.readValue", "com.vk.toggle.internal.storage.mmaped.MemoryMappedFeatureSource.prepareStorage", "ru.ok.tracer.crash.report.TracerCrashReport.report", "com.vk.core.tool.view.vkblur.VkBlurView"));
                s3q0 s3q0Var2 = s3q0.a;
                hashMap.put(DiskWriteViolation.class, new vpm0.a.c(a4));
                hashMap.put(FileUriExposedViolation.class, c3898a);
                hashMap.put(InstanceCountViolation.class, new vpm0.a.c(e43.a("com.vkontakte.android.FragmentWrapperActivity")));
                hashMap.put(IntentReceiverLeakedViolation.class, c3898a);
                hashMap.put(LeakedClosableViolation.class, new vpm0.a.c(e43.a("com.huawei.hms.analytics.database.AbstractDao.count", "com.huawei.agconnect.crash.internal.b.c$a.run", "com.vk.companion.user.CompanionUserStorage.getAuthorizedUserIds", "com.vk.repository.internal.repos.stickers.database.dao.ConfigsDao_Impl.get", "com.vk.repository.internal.repos.stickers.database.dao.PromoDao_Impl.get", "com.vk.repository.internal.repos.stickers.database.dao.RecentsDao_Impl.getRecentStickers", "sun.nio.fs.UnixDirectoryStream.finalize", "sun.nio.fs.UnixSecureDirectoryStream.finalize", "fi.iki.elonen.NanoHTTPD$ClientHandler.run", "com.my.tracker.obfuscated", "com.vk.clips.uploader.impl.ClipUploadTask.getRandomAccessFile", "com.vk.stat.storage.DatabaseStorage.getDbRead", "com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator", "com.facebook.imagepipeline.producers.LocalContentUriFetchProducer.getCameraImage", "com.vk.network.sse.internal.SseEventSourceImpl.next", "com.vk.music.offline.core.database.legacy.OfflineMusicDatabaseHelper.getTracksForMigration", "com.vk.im.converters.ImVideoConverter.compressVideo", "com.vk.core.sensor.extensions.RxSensorsKt.observeSensorData", "android.view.SurfaceControl.finalize")));
                hashMap.put(NetworkViolation.class, c3898a);
                hashMap.put(NonSdkApiUsedViolation.class, c3898a);
                hashMap.put(ResourceMismatchViolation.class, c3898a);
                hashMap.put(ServiceConnectionLeakedViolation.class, vpm0.a.b.a);
                hashMap.put(SqliteObjectLeakedViolation.class, c3898a);
                hashMap.put(UnbufferedIoViolation.class, c3898a);
                hashMap.put(UntaggedSocketViolation.class, c3898a);
                hashMap.put(WebViewMethodCalledOnWrongThreadViolation.class, c3898a);
                hashMap.put(ServiceConnectionLeakedViolation.class, c3898a);
                if (i >= 29) {
                    hashMap.put(g32.e(), c3898a);
                    hashMap.put(h32.c(), c3898a);
                }
                if (i >= 31) {
                    hashMap.put(ehj.d(), new vpm0.a.c(e43.a("com.appsflyer.internal.y.valueOf", "com.my.target.common.MyTargetUtils.collectInfo", "com.vk.core.ui.VKLayoutInflater.<init>", "com.vk.core.ui.preinflate.LayoutPreInflater$", "com.vk.core.util.Screen.getPhysicalDisplaySize", "com.vk.core.util.parallax.RotationSensorEventInterpreter.init", "com.vk.imageloader.view.VKDraweeView.<init>", "com.vk.reactions.touch.ScrollTouchDetector.<init>")));
                    hashMap.put(ahj.a(), new vpm0.a.c(e43.a("act=com.vk.im.ACTION_APP_BACKGROUND", "act=com.vk.im.ACTION_APP_FOREGROUND", "act=com.vk.im.ACTION_APP_UI_DESTROYED", "act=com.vkontakte.android.ACTION_DRAWER_MENU_CHAGNED", "act=com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED", "act=com.vkontakte.android.ACTION_GIFT_SENT", "act=com.vkontakte.android.ACTION_ORDER_CREATED", "act=com.vkontakte.android.ACTION_PROFILE_UPDATED", "act=com.vkontakte.android.ACTION_PROFILE_UPDATED", "act=com.vkontakte.android.ACTION_SHARING_ERROR_STATUS", "act=com.vkontakte.android.ACTION_USER_IMAGE_STATUS_CHANGED", "act=com.vkontakte.android.COUNTERS_UPDATED", "act=com.vkontakte.android.DONUT_SUBSCRIPTION_PAID", "act=com.vkontakte.android.FRIEND_COUNTER_CHANGED", "act=com.vkontakte.android.FRIEND_LIST_CHANGED", "act=com.vkontakte.android.FRIEND_REQUESTS_CHANGED", "act=com.vkontakte.android.RELOAD_PROFILE", "act=com.vkontakte.android.STATE_CHANGED", "act=com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED", "act=com.vkontakte.android.STICKERS_NUM_NEW_ACCESSORIES", "act=com.vkontakte.android.STICKERS_NUM_NEW_ITEMS", "act=com.vkontakte.android.STICKERS_NUM_UPDATES", "act=com.vkontakte.android.STICKERS_RELOADED", "act=com.vkontakte.android.STICKERS_STYLE_UPDATED", "act=com.vkontakte.android.STICKERS_UPDATED", "act=com.vkontakte.android.USER_COVER_CHANGED", "act=com.vkontakte.android.USER_NAME_CHANGED", "act=com.vkontakte.android.USER_PHOTO_CHANGED", "act=com.vkontakte.android.USER_PRESENCE", "act=com.vkontakte.android.USER_STATUS_CHANGED", "act=picture_in_picture_action_close", "act=pip_mini_app_action_update", "cmp=ru.vk.store/com.vk.push.authsdk.ipc.AuthService", "com.google.android.gms.common.internal.BaseGmsClient.connect", "com.huawei.hms.runtimekit.stub.HMSKitCoreStubService2", "com.vkontakte.android.MainActivity.startAuth")));
                }
                if (i >= 34) {
                    hashMap.put(vw6.k(), c3898a);
                }
                return hashMap;
            case 9:
                return new w2n0(VkmSuccessRateEventBuilder.EventName.REPLY_OPEN);
            case 10:
                return zr.a("https://", "api.".concat(a0a.d), "/method");
            case 11:
                VKApplication.a aVar2 = VKApplication.c;
                return ((BridgeComponent) m7m.e().a(fpf0.a(BridgeComponent.class))).s();
            case 12:
                return new MusicKidsModeComponentImpl.a();
            case 13:
                return new SharingImEngineComponentImpl.a();
            case 14:
                return new DesignInspectorComponentImpl.a();
            case 15:
                asu0.a.getClass();
                return asu0.y() ? asu0.n() : asu0.E(asu0.C.invoke(), "vk-fresco-background-pool-thread-");
            case 16:
                b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "voip-incoming-call-processor");
                return b;
            default:
                return new fgr0();
        }
    }

    public /* synthetic */ wv8(VKApplication vKApplication) {
        this.b = 11;
    }
}
