package com.yandex.mapkit.internal;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.PerformanceInfo;
import com.yandex.mapkit.PoiSource;
import com.yandex.mapkit.YSupplierName;
import com.yandex.mapkit.attestation_updater.AttestationManager;
import com.yandex.mapkit.car_info.CarInfoReceiver;
import com.yandex.mapkit.car_info.experimental.SensorInfoReceiver;
import com.yandex.mapkit.coverage.Coverage;
import com.yandex.mapkit.experiments.ExternalExperimentsManager;
import com.yandex.mapkit.experiments.TestBucketsProvider;
import com.yandex.mapkit.experiments.UiExperimentsProvider;
import com.yandex.mapkit.experiments.UiInstantExperimentsProvider;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.DummyLocationManager;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.location.LocationSequenceQualitySession;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.location.LocationSuggest;
import com.yandex.mapkit.location.SubscriptionSettings;
import com.yandex.mapkit.location.experimental.FusedProviderOptions;
import com.yandex.mapkit.location.external_providers.CellProviderConfig;
import com.yandex.mapkit.location.external_providers.LocationProvider;
import com.yandex.mapkit.location.external_providers.OutdoorProviderConfig;
import com.yandex.mapkit.location.external_providers.WifiProviderConfig;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.OffscreenMapWindow;
import com.yandex.mapkit.offline_cache.OfflineCacheManager;
import com.yandex.mapkit.personalized_poi.PersonalizedPoiLayer;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.yandex.mapkit.road_events_layer.StyleProvider;
import com.yandex.mapkit.sensors.ExternalLocationReceiver;
import com.yandex.mapkit.sensors.ExternalWifiScanReceiver;
import com.yandex.mapkit.sensors.SpoofingDetector;
import com.yandex.mapkit.sensors.SpoofingDetectorConfig;
import com.yandex.mapkit.storage.StorageManager;
import com.yandex.mapkit.traffic.TrafficLayer;
import com.yandex.mapkit.user_location.UserLocationLayer;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.auth.Account;
import com.yandex.runtime.init.MiidManager;
import com.yandex.runtime.real_time_clock.TestClock;
import com.yandex.runtime.subscription.Subscription;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes8.dex */
public class MapKitBinding implements MapKit {
    protected Subscription<LocationSequenceQualitySession.Listener> listenerSubscription = new Subscription<LocationSequenceQualitySession.Listener>(this) { // from class: com.yandex.mapkit.internal.MapKitBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(LocationSequenceQualitySession.Listener listener) {
            return MapKitBinding.createListener(listener);
        }
    };
    private final NativeObject nativeObject;

    public MapKitBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createListener(LocationSequenceQualitySession.Listener listener);

    @Override // com.yandex.mapkit.MapKit
    public native CarInfoReceiver carInfoReceiver();

    @Override // com.yandex.mapkit.MapKit
    public native void changeApiKey(String str);

    @Override // com.yandex.mapkit.MapKit
    public native LocationProvider createCellLocationProvider(CellProviderConfig cellProviderConfig);

    @Override // com.yandex.mapkit.MapKit
    public native DummyLocationManager createDummyLocationManager();

    @Override // com.yandex.mapkit.MapKit
    public native LocationManager createExperimentalYandexFusedSensorsLocationManager(FusedProviderOptions fusedProviderOptions);

    @Override // com.yandex.mapkit.MapKit
    public native Coverage createLocationJammingCoverage();

    @Override // com.yandex.mapkit.MapKit
    public native LocationManager createLocationManager();

    @Override // com.yandex.mapkit.MapKit
    public native LocationSequenceQualitySession createLocationSequenceQualitySession(LocationManager locationManager, SubscriptionSettings subscriptionSettings, LocationSequenceQualitySession.Listener listener);

    @Override // com.yandex.mapkit.MapKit
    public native LocationSimulator createLocationSimulator();

    @Override // com.yandex.mapkit.MapKit
    public native LocationSimulator createLocationSimulator(Polyline polyline);

    @Override // com.yandex.mapkit.MapKit
    public native MapWindow createMapWindow(PlatformView platformView);

    @Override // com.yandex.mapkit.MapKit
    public native MapWindow createMapWindow(PlatformView platformView, float f);

    @Override // com.yandex.mapkit.MapKit
    public native OffscreenMapWindow createOffscreenMapWindow(int i, int i2);

    @Override // com.yandex.mapkit.MapKit
    public native OffscreenMapWindow createOffscreenMapWindow(int i, int i2, float f);

    @Override // com.yandex.mapkit.MapKit
    public native LocationManager createOutdoorLocationManager();

    @Override // com.yandex.mapkit.MapKit
    public native LocationProvider createOutdoorLocationProvider(OutdoorProviderConfig outdoorProviderConfig);

    @Override // com.yandex.mapkit.MapKit
    public native PersonalizedPoiLayer createPersonalizedPoiLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.MapKit
    public native RoadEventsLayer createRoadEventsLayer(MapWindow mapWindow, StyleProvider styleProvider, RoadEventsManager roadEventsManager);

    @Override // com.yandex.mapkit.MapKit
    public native RoadEventsLayer createRoadEventsLayer(MapWindow mapWindow, StyleProvider styleProvider, RoadEventsManager roadEventsManager, boolean z);

    @Override // com.yandex.mapkit.MapKit
    public native RoadEventsManager createRoadEventsManager();

    @Override // com.yandex.mapkit.MapKit
    public native SpoofingDetector createSpoofingDetector(SpoofingDetectorConfig spoofingDetectorConfig);

    @Override // com.yandex.mapkit.MapKit
    public native TrafficLayer createTrafficLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.MapKit
    public native Coverage createTrafficLevelCoverage();

    @Override // com.yandex.mapkit.MapKit
    public native UserLocationLayer createUserLocationLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.MapKit
    public native LocationProvider createWifiLocationProvider(WifiProviderConfig wifiProviderConfig);

    @Override // com.yandex.mapkit.MapKit
    public native LocationManager createYandexFusedLocationManager();

    @Override // com.yandex.mapkit.MapKit
    public native void enableTerrainMap();

    @Override // com.yandex.mapkit.MapKit
    public native SensorInfoReceiver experimentalSensorInfoReceiver();

    @Override // com.yandex.mapkit.MapKit
    public native ExternalLocationReceiver externalLocationReceiver();

    @Override // com.yandex.mapkit.MapKit
    public native ExternalWifiScanReceiver externalWifiScanReceiver();

    @Override // com.yandex.mapkit.MapKit
    public native AttestationManager getAttestationManager();

    @Override // com.yandex.mapkit.MapKit
    public native ExternalExperimentsManager getExternalExperimentsManager();

    @Override // com.yandex.mapkit.MapKit
    public native LocationSuggest getLocationSuggest();

    @Override // com.yandex.mapkit.MapKit
    public native UiExperimentsProvider getMapsUiExperimentsProvider();

    @Override // com.yandex.mapkit.MapKit
    public native UiInstantExperimentsProvider getMapsUiInstantExperimentsProvider();

    @Override // com.yandex.mapkit.MapKit
    public native MiidManager getMiidManager();

    @Override // com.yandex.mapkit.MapKit
    public native OfflineCacheManager getOfflineCacheManager();

    @Override // com.yandex.mapkit.MapKit
    public native PerformanceInfo getPerformanceInfo();

    @Override // com.yandex.mapkit.MapKit
    public native PoiSource getPoiSource();

    @Override // com.yandex.mapkit.MapKit
    public native StorageManager getStorageManager();

    @Override // com.yandex.mapkit.MapKit
    public native TestBucketsProvider getTestBucketsProvider();

    @Override // com.yandex.mapkit.MapKit
    public native TestClock getTestClock();

    @Override // com.yandex.mapkit.MapKit
    public native String getVersion();

    @Override // com.yandex.mapkit.MapKit
    public native boolean isValid();

    @Override // com.yandex.mapkit.MapKit
    public native void onStart();

    @Override // com.yandex.mapkit.MapKit
    public native void onStop();

    @Override // com.yandex.mapkit.MapKit
    public native void onTerminate();

    @Override // com.yandex.mapkit.MapKit
    public native void resetLocationManagerToDefault();

    @Override // com.yandex.mapkit.MapKit
    public native void setAccount(Account account);

    @Override // com.yandex.mapkit.MapKit
    public native void setAdvertisingId(String str);

    @Override // com.yandex.mapkit.MapKit
    public native void setApiKey(String str);

    @Override // com.yandex.mapkit.MapKit
    public native void setIcookie(String str, String str2);

    @Override // com.yandex.mapkit.MapKit
    public native void setLocationManager(LocationManager locationManager);

    @Override // com.yandex.mapkit.MapKit
    public native void setMetricaIds(String str, String str2);

    @Override // com.yandex.mapkit.MapKit
    public native void setPoiSource(PoiSource poiSource);

    @Override // com.yandex.mapkit.MapKit
    public native void setScaleFactor(float f);

    @Override // com.yandex.mapkit.MapKit
    public native void setUserId(String str);

    @Override // com.yandex.mapkit.MapKit
    public native void setWebAuthAccount(Account account);

    @Override // com.yandex.mapkit.MapKit
    public native void setYSupplierName(YSupplierName ySupplierName);
}
