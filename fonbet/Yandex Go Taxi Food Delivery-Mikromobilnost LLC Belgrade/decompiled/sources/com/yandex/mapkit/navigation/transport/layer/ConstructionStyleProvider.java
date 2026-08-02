package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.transport.masstransit.ConstructionMask;

/* loaded from: classes15.dex */
public interface ConstructionStyleProvider {
    void provideStyle(ConstructionMask constructionMask, float f, boolean z, IndoorConnectorManoeuvre indoorConnectorManoeuvre, PlacemarkStyle placemarkStyle);
}
