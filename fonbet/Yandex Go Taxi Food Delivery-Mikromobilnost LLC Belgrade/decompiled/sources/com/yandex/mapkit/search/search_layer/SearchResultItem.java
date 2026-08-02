package com.yandex.mapkit.search.search_layer;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.SubtitleItem;
import java.util.List;

/* loaded from: classes15.dex */
public interface SearchResultItem {
    List<SubtitleItem> details();

    String getCategoryClass();

    GeoObject getGeoObject();

    String getId();

    String getName();

    Point getPoint();

    boolean hasDetails();

    boolean isAdvertisement();

    boolean isClosed();

    boolean isCollection();

    boolean isHighlighted();

    boolean isOffline();

    boolean isRelatedAdvertisement();
}
