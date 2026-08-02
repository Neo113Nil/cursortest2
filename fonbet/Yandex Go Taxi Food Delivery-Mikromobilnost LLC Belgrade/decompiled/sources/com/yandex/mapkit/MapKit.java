package com.yandex.mapkit;

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
import com.yandex.runtime.auth.Account;
import com.yandex.runtime.init.MiidManager;
import com.yandex.runtime.real_time_clock.TestClock;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes15.dex */
public interface MapKit {
    CarInfoReceiver carInfoReceiver();

    void changeApiKey(String str);

    LocationProvider createCellLocationProvider(CellProviderConfig cellProviderConfig);

    DummyLocationManager createDummyLocationManager();

    LocationManager createExperimentalYandexFusedSensorsLocationManager(FusedProviderOptions fusedProviderOptions);

    Coverage createLocationJammingCoverage();

    LocationManager createLocationManager();

    LocationSequenceQualitySession createLocationSequenceQualitySession(LocationManager locationManager, SubscriptionSettings subscriptionSettings, LocationSequenceQualitySession.Listener listener);

    LocationSimulator createLocationSimulator();

    LocationSimulator createLocationSimulator(Polyline polyline);

    MapWindow createMapWindow(PlatformView platformView);

    MapWindow createMapWindow(PlatformView platformView, float f);

    OffscreenMapWindow createOffscreenMapWindow(int i, int i2);

    OffscreenMapWindow createOffscreenMapWindow(int i, int i2, float f);

    LocationManager createOutdoorLocationManager();

    LocationProvider createOutdoorLocationProvider(OutdoorProviderConfig outdoorProviderConfig);

    PersonalizedPoiLayer createPersonalizedPoiLayer(MapWindow mapWindow);

    RoadEventsLayer createRoadEventsLayer(MapWindow mapWindow, StyleProvider styleProvider, RoadEventsManager roadEventsManager);

    RoadEventsLayer createRoadEventsLayer(MapWindow mapWindow, StyleProvider styleProvider, RoadEventsManager roadEventsManager, boolean z);

    RoadEventsManager createRoadEventsManager();

    SpoofingDetector createSpoofingDetector(SpoofingDetectorConfig spoofingDetectorConfig);

    TrafficLayer createTrafficLayer(MapWindow mapWindow);

    Coverage createTrafficLevelCoverage();

    UserLocationLayer createUserLocationLayer(MapWindow mapWindow);

    LocationProvider createWifiLocationProvider(WifiProviderConfig wifiProviderConfig);

    LocationManager createYandexFusedLocationManager();

    void enableTerrainMap();

    SensorInfoReceiver experimentalSensorInfoReceiver();

    ExternalLocationReceiver externalLocationReceiver();

    ExternalWifiScanReceiver externalWifiScanReceiver();

    AttestationManager getAttestationManager();

    ExternalExperimentsManager getExternalExperimentsManager();

    LocationSuggest getLocationSuggest();

    UiExperimentsProvider getMapsUiExperimentsProvider();

    UiInstantExperimentsProvider getMapsUiInstantExperimentsProvider();

    MiidManager getMiidManager();

    OfflineCacheManager getOfflineCacheManager();

    PerformanceInfo getPerformanceInfo();

    PoiSource getPoiSource();

    StorageManager getStorageManager();

    TestBucketsProvider getTestBucketsProvider();

    TestClock getTestClock();

    String getVersion();

    boolean isValid();

    void onStart();

    void onStop();

    void onTerminate();

    void resetLocationManagerToDefault();

    void setAccount(Account account);

    void setAdvertisingId(String str);

    void setApiKey(String str);

    void setIcookie(String str, String str2);

    void setLocationManager(LocationManager locationManager);

    void setMetricaIds(String str, String str2);

    void setPoiSource(PoiSource poiSource);

    void setScaleFactor(float f);

    void setUserId(String str);

    void setWebAuthAccount(Account account);

    void setYSupplierName(YSupplierName ySupplierName);
}
