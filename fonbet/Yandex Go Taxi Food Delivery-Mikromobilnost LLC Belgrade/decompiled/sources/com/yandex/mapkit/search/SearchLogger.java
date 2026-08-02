package com.yandex.mapkit.search;

import com.yandex.mapkit.GeoObject;

/* loaded from: classes15.dex */
public interface SearchLogger {
    void logCollectionCardAction(CollectionActionEvent collectionActionEvent, String str);

    void logCollectionCardClosed(String str);

    void logCollectionCardShown(CollectionCardSource collectionCardSource, String str);

    void logCollectionListItemShown(CollectionListItemEvent collectionListItemEvent, String str, int i);

    void logGeoObjectCardAction(CardActionEvent cardActionEvent, GeoObject geoObject);

    void logGeoObjectCardAdvertAction(String str, GeoObject geoObject);

    void logGeoObjectCardShown(GeoObjectCardType geoObjectCardType, GeoObjectCardSource geoObjectCardSource, GeoObject geoObject);

    void logGeoObjectListItemShown(GeoObjectListItemEvent geoObjectListItemEvent, GeoObject geoObject, int i);

    void logGeoObjectListItemShown(GeoObjectListItemEvent geoObjectListItemEvent, String str, int i);

    void logSearchResults(SearchSource searchSource, String str);

    void logShowcaseShown();
}
