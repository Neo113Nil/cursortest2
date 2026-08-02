package com.yandex.mapkit.search;

import com.yandex.mapkit.ConflictResolutionMode;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.search.advert_layer.AdvertLayer;
import com.yandex.mapkit.search.advert_layer.AssetProvider;
import com.yandex.mapkit.search.search_layer.SearchLayer;

/* loaded from: classes15.dex */
public interface Search {
    BillboardLogger billboardLogger();

    AdvertLayer createAdvertLayer(String str, MapWindow mapWindow, AssetProvider assetProvider);

    AdvertMenuManager createAdvertMenuManager(String str);

    BillboardRouteManager createBillboardRouteManager(String str);

    BillboardWindowManager createBillboardWindowManager(String str);

    BitmapDownloader createBitmapDownloader(StorageCaching storageCaching);

    SearchLayer createCustomSearchLayer(MapWindow mapWindow, String str, ConflictResolutionMode conflictResolutionMode);

    ImageDownloader createImageDownloader(StorageCaching storageCaching);

    MenuManager createMenuManager(String str);

    SearchLayer createSearchLayer(MapWindow mapWindow);

    SearchManager createSearchManager(SearchManagerType searchManagerType);

    ViaBannerManager createViaBannerManager(String str);

    ZeroSpeedBannerManager createZeroSpeedBannerManager(String str);

    boolean isValid();

    SearchLogger searchLogger();
}
