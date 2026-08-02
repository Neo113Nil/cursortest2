package com.yandex.mobile.drive.sdk;

import android.util.Log;
import com.lib.flutter_blue_plus.FlutterBluePlusPlugin;
import com.yandex.mobile.drive.account_manager.a;
import com.yandex.mobile.drive.drive_native_features.b;
import com.yandex.mobile.drive.sdk.map.MapMobileSdkPlugin;
import defpackage.abj;
import defpackage.ax2;
import defpackage.b9v;
import defpackage.bh21;
import defpackage.dm00;
import defpackage.ihb0;
import defpackage.ira0;
import defpackage.jfm;
import defpackage.lkr0;
import defpackage.mfm;
import defpackage.nrr;
import defpackage.nrs;
import defpackage.nya0;
import defpackage.oj51;
import defpackage.oo7;
import defpackage.pvc0;
import defpackage.shm;
import defpackage.vp41;
import defpackage.yf5;
import defpackage.ywt0;
import defpackage.zcm;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.pathprovider.d;
import io.flutter.plugins.sharedpreferences.g;
import io.flutter.plugins.videoplayer.c;

/* loaded from: classes15.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.d.f(new ax2());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin app_settings, com.spencerccf.app_settings.AppSettingsPlugin", e);
        }
        try {
            flutterEngine.d.f(new yf5());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin battery_plus, dev.fluttercommunity.plus.battery.BatteryPlusPlugin", e2);
        }
        try {
            flutterEngine.d.f(new oo7());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin camera_android_camerax, io.flutter.plugins.camerax.CameraAndroidCameraxPlugin", e3);
        }
        try {
            flutterEngine.d.f(new abj());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e4);
        }
        try {
            flutterEngine.d.f(new a());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin drive_account_manager_go, com.yandex.mobile.drive.account_manager.DriveSdkAccountManagerPlugin", e5);
        }
        try {
            flutterEngine.d.f(new com.yandex.mobile.drive.analytics.a());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin drive_analytics_go, com.yandex.mobile.drive.analytics.SdkAnalyticsMobilePlugin", e6);
        }
        try {
            flutterEngine.d.f(new jfm());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin drive_bank_go, com.yandex.mobile.drive.bank.DriveSdkBankPlugin", e7);
        }
        try {
            flutterEngine.d.f(new zcm());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin drive_camera_type_detector, com.yandex.drive.drive_camera_type_detector.DriveCameraTypeDetectorPlugin", e8);
        }
        try {
            flutterEngine.d.f(new com.yandex.mobile.drive.map.geocoder.a());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin drive_map_geocoder_go, com.yandex.mobile.drive.map.geocoder.MapGeocoderGoPlugin", e9);
        }
        try {
            flutterEngine.d.f(new dm00());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin drive_map_mobile_core, com.yandex.mobile.drive.map.MapMobileCorePlugin", e10);
        }
        try {
            flutterEngine.d.f(new MapMobileSdkPlugin());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin drive_map_mobile_sdk, com.yandex.mobile.drive.sdk.map.MapMobileSdkPlugin", e11);
        }
        try {
            flutterEngine.d.f(new com.yandex.mobile.drive.drive_media_tools.a());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin drive_media_tools, com.yandex.mobile.drive.drive_media_tools.DriveMediaToolsPlugin", e12);
        }
        try {
            flutterEngine.d.f(new b());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin drive_native_features, com.yandex.mobile.drive.drive_native_features.DriveNativeFeaturesPlugin", e13);
        }
        try {
            flutterEngine.d.f(new pvc0());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin drive_platform_integration_mobile, com.yandex.mobile.drive.platform.PlatformIntegrationAndroid", e14);
        }
        try {
            flutterEngine.d.f(new mfm());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin drive_sdk_go, com.yandex.mobile.drive.sdk.DriveSdkGoPlugin", e15);
        }
        try {
            flutterEngine.d.f(new shm());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin drive_wallet_go, com.yandex.mobile.drive.wallet.DriveWalletGoPlugin", e16);
        }
        try {
            flutterEngine.d.f(new FlutterBluePlusPlugin());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin flutter_blue_plus_android, com.lib.flutter_blue_plus.FlutterBluePlusPlugin", e17);
        }
        try {
            flutterEngine.d.f(new b9v());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin flutter_image_compress_common, com.fluttercandies.flutter_image_compress.ImageCompressPlugin", e18);
        }
        try {
            flutterEngine.d.f(new nrr());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e19);
        }
        try {
            flutterEngine.d.f(new nrs());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin gal, studio.midoridesign.gal.GalPlugin", e20);
        }
        try {
            flutterEngine.d.f(new ImagePickerPlugin());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e21);
        }
        try {
            flutterEngine.d.f(new d());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e22);
        }
        try {
            flutterEngine.d.f(new ira0());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin pdfx, io.scer.pdfx.PdfxPlugin", e23);
        }
        try {
            flutterEngine.d.f(new nya0());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e24);
        }
        try {
            flutterEngine.d.f(new ihb0());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin photo_manager, com.fluttercandies.photo_manager.PhotoManagerPlugin", e25);
        }
        try {
            flutterEngine.d.f(new lkr0());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e26);
        }
        try {
            flutterEngine.d.f(new g());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e27);
        }
        try {
            flutterEngine.d.f(new ywt0());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e28);
        }
        try {
            flutterEngine.d.f(new bh21());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e29);
        }
        try {
            flutterEngine.d.f(new c());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e30);
        }
        try {
            flutterEngine.d.f(new vp41());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e31);
        }
        try {
            flutterEngine.d.f(new oj51());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin yx_logger, ru.yandex.yx_logger.YXLoggerPlugin", e32);
        }
    }
}
