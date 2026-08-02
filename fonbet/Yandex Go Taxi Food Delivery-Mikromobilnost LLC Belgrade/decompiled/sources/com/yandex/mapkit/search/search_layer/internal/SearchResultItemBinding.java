package com.yandex.mapkit.search.search_layer.internal;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.SubtitleItem;
import com.yandex.mapkit.search.search_layer.SearchResultItem;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class SearchResultItemBinding implements SearchResultItem {
    private final NativeObject nativeObject;

    public SearchResultItemBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native List<SubtitleItem> details();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native String getCategoryClass();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native GeoObject getGeoObject();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native String getId();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native String getName();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native Point getPoint();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean hasDetails();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean isAdvertisement();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean isClosed();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean isCollection();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean isHighlighted();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean isOffline();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean isRelatedAdvertisement();
}
