package com.yandex.mapkit.map;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.indoor.IndoorStateListener;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import com.yandex.mapkit.layers.Layer;
import com.yandex.mapkit.layers.LayerOptions;
import com.yandex.mapkit.logo.Logo;
import java.util.List;

/* loaded from: classes8.dex */
public interface Map {

    /* loaded from: classes12.dex */
    public interface CameraCallback {
        void onMoveFinished(boolean z);
    }

    /* loaded from: classes6.dex */
    public interface MapReadyCallback {
        void onMapReady();
    }

    void addCameraListener(CameraListener cameraListener);

    CompositeLayer addCompositeLayer(String str);

    void addIndoorStateListener(IndoorStateListener indoorStateListener);

    void addInertiaMoveListener(InertiaMoveListener inertiaMoveListener);

    void addInputListener(InputListener inputListener);

    RootMapObjectCollection addMapObjectLayer(String str);

    void addTapListener(GeoObjectTapListener geoObjectTapListener);

    Layer addTileLayer(String str, LayerOptions layerOptions, CreateTileDataSource createTileDataSource);

    void addYandexLayerId(String str);

    CameraPosition cameraPosition(Geometry geometry);

    CameraPosition cameraPosition(Geometry geometry, ScreenRect screenRect);

    CameraPosition cameraPosition(Geometry geometry, ScreenRect screenRect, Float f);

    CameraPosition cameraPosition(Geometry geometry, ScreenRect screenRect, Float f, Float f2);

    void deselectGeoObject();

    CameraBounds getCameraBounds();

    CameraPosition getCameraPosition();

    MapDebug getDebug();

    String getDiscoveryModeIntent();

    String getDiscoveryModeSessionId();

    DataSourceLayerFactory getGroundDataSourceLayerFactory();

    @Deprecated
    IconSet getLayerIconSet();

    Logo getLogo();

    RootMapObjectCollection getMapObjects();

    MapType getMapType();

    MapMode getMode();

    Integer getPoiLimit();

    SublayerManager getSublayerManager();

    VisibleRegion getVisibleRegion();

    boolean isAggregatedVisibleObjectsLoggerEnabled();

    boolean isAwesomeModelsEnabled();

    boolean isDebugInfoEnabled();

    boolean isDiscoveryModeEnabled();

    boolean isFastTapEnabled();

    boolean isHdModeEnabled();

    boolean isIndoorEnabled();

    boolean isModelsEnabled();

    boolean isNightModeEnabled();

    boolean isRoads3dCastShadowEnabled();

    boolean isRoads3dEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScrollGesturesEnabled();

    boolean isSingleTouchExtendedGesturesEnabled();

    boolean isTappableAreaRenderingEnabled();

    boolean isTileGridEnabled();

    boolean isTiltGesturesEnabled();

    boolean isValid();

    boolean isZLevelColorsEnabled();

    boolean isZoomGesturesEnabled();

    void move(CameraPosition cameraPosition);

    void move(CameraPosition cameraPosition, Animation animation);

    void move(CameraPosition cameraPosition, Animation animation, CameraCallback cameraCallback);

    Projection projection();

    void removeCameraListener(CameraListener cameraListener);

    void removeIndoorStateListener(IndoorStateListener indoorStateListener);

    void removeInertiaMoveListener(InertiaMoveListener inertiaMoveListener);

    void removeInputListener(InputListener inputListener);

    void removeTapListener(GeoObjectTapListener geoObjectTapListener);

    void resetMapStyles();

    void selectGeoObject(GeoObjectSelectionMetadata geoObjectSelectionMetadata);

    void set2DMode(boolean z);

    void setAggregatedVisibleObjectsLoggerEnabled(boolean z);

    void setAwesomeModelsEnabled(boolean z);

    void setBuildingsHeightScale(float f, float f2);

    void setDebugInfoEnabled(boolean z);

    void setDiscoveryModeEnabled(boolean z);

    void setDiscoveryModeIntent(String str);

    void setDisplayCacheMaxSizeMultiplier(String str, String str2, float f);

    void setFastTapEnabled(boolean z);

    void setHdModeEnabled(boolean z);

    void setHiddenBuildings(List<String> list);

    void setIndoorEnabled(boolean z);

    void setMapLoadedListener(MapLoadedListener mapLoadedListener);

    void setMapReadyCallback(MapReadyCallback mapReadyCallback);

    boolean setMapStyle(int i, String str);

    boolean setMapStyle(String str);

    void setMapType(MapType mapType);

    void setMode(MapMode mapMode);

    void setModelsEnabled(boolean z);

    void setNightModeEnabled(boolean z);

    void setPersonalizedPoiContext(String str);

    void setPoiLimit(Integer num);

    void setRoads3dCastShadowEnabled(boolean z);

    void setRoads3dEnabled(boolean z);

    void setRotateGesturesEnabled(boolean z);

    void setScrollGesturesEnabled(boolean z);

    void setSingleTouchExtendedGesturesEnabled(boolean z);

    void setTappableAreaRenderingEnabled(boolean z);

    void setTileGridEnabled(boolean z);

    void setTiltGesturesEnabled(boolean z);

    void setZLevelColorsEnabled(boolean z);

    void setZoomGesturesEnabled(boolean z);

    void startTileLoadMetricsCapture();

    String stopTileLoadMetricsCapture();

    @Deprecated
    List<GeoObject> visibleObjects(ScreenRect screenRect, String str);

    void visibleObjects(IntrospectionFilter introspectionFilter, IntrospectionListener introspectionListener);

    VisibleRegion visibleRegion(CameraPosition cameraPosition);

    void wipe();
}
