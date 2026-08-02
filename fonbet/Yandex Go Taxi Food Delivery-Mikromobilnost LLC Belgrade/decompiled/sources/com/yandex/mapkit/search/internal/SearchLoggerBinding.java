package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.search.CardActionEvent;
import com.yandex.mapkit.search.CollectionActionEvent;
import com.yandex.mapkit.search.CollectionCardSource;
import com.yandex.mapkit.search.CollectionListItemEvent;
import com.yandex.mapkit.search.GeoObjectCardSource;
import com.yandex.mapkit.search.GeoObjectCardType;
import com.yandex.mapkit.search.GeoObjectListItemEvent;
import com.yandex.mapkit.search.SearchLogger;
import com.yandex.mapkit.search.SearchSource;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class SearchLoggerBinding implements SearchLogger {
    private final NativeObject nativeObject;

    public SearchLoggerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logCollectionCardAction(CollectionActionEvent collectionActionEvent, String str);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logCollectionCardClosed(String str);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logCollectionCardShown(CollectionCardSource collectionCardSource, String str);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logCollectionListItemShown(CollectionListItemEvent collectionListItemEvent, String str, int i);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logGeoObjectCardAction(CardActionEvent cardActionEvent, GeoObject geoObject);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logGeoObjectCardAdvertAction(String str, GeoObject geoObject);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logGeoObjectCardShown(GeoObjectCardType geoObjectCardType, GeoObjectCardSource geoObjectCardSource, GeoObject geoObject);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logGeoObjectListItemShown(GeoObjectListItemEvent geoObjectListItemEvent, GeoObject geoObject, int i);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logGeoObjectListItemShown(GeoObjectListItemEvent geoObjectListItemEvent, String str, int i);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logSearchResults(SearchSource searchSource, String str);

    @Override // com.yandex.mapkit.search.SearchLogger
    public native void logShowcaseShown();
}
