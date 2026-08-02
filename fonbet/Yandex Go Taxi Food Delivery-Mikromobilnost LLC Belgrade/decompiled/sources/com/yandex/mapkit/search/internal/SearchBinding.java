package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.ConflictResolutionMode;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.search.AdvertMenuManager;
import com.yandex.mapkit.search.BillboardLogger;
import com.yandex.mapkit.search.BillboardRouteManager;
import com.yandex.mapkit.search.BillboardWindowManager;
import com.yandex.mapkit.search.BitmapDownloader;
import com.yandex.mapkit.search.ImageDownloader;
import com.yandex.mapkit.search.MenuManager;
import com.yandex.mapkit.search.Search;
import com.yandex.mapkit.search.SearchLogger;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchManagerType;
import com.yandex.mapkit.search.StorageCaching;
import com.yandex.mapkit.search.ViaBannerManager;
import com.yandex.mapkit.search.ZeroSpeedBannerManager;
import com.yandex.mapkit.search.advert_layer.AdvertLayer;
import com.yandex.mapkit.search.advert_layer.AssetProvider;
import com.yandex.mapkit.search.search_layer.SearchLayer;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class SearchBinding implements Search {
    protected Subscription<AssetProvider> assetProviderSubscription = new Subscription<AssetProvider>(this) { // from class: com.yandex.mapkit.search.internal.SearchBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(AssetProvider assetProvider) {
            return SearchBinding.createAssetProvider(assetProvider);
        }
    };
    private final NativeObject nativeObject;

    public SearchBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createAssetProvider(AssetProvider assetProvider);

    @Override // com.yandex.mapkit.search.Search
    public native BillboardLogger billboardLogger();

    @Override // com.yandex.mapkit.search.Search
    public native AdvertLayer createAdvertLayer(String str, MapWindow mapWindow, AssetProvider assetProvider);

    @Override // com.yandex.mapkit.search.Search
    public native AdvertMenuManager createAdvertMenuManager(String str);

    @Override // com.yandex.mapkit.search.Search
    public native BillboardRouteManager createBillboardRouteManager(String str);

    @Override // com.yandex.mapkit.search.Search
    public native BillboardWindowManager createBillboardWindowManager(String str);

    @Override // com.yandex.mapkit.search.Search
    public native BitmapDownloader createBitmapDownloader(StorageCaching storageCaching);

    @Override // com.yandex.mapkit.search.Search
    public native SearchLayer createCustomSearchLayer(MapWindow mapWindow, String str, ConflictResolutionMode conflictResolutionMode);

    @Override // com.yandex.mapkit.search.Search
    public native ImageDownloader createImageDownloader(StorageCaching storageCaching);

    @Override // com.yandex.mapkit.search.Search
    public native MenuManager createMenuManager(String str);

    @Override // com.yandex.mapkit.search.Search
    public native SearchLayer createSearchLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.search.Search
    public native SearchManager createSearchManager(SearchManagerType searchManagerType);

    @Override // com.yandex.mapkit.search.Search
    public native ViaBannerManager createViaBannerManager(String str);

    @Override // com.yandex.mapkit.search.Search
    public native ZeroSpeedBannerManager createZeroSpeedBannerManager(String str);

    @Override // com.yandex.mapkit.search.Search
    public native boolean isValid();

    @Override // com.yandex.mapkit.search.Search
    public native SearchLogger searchLogger();
}
