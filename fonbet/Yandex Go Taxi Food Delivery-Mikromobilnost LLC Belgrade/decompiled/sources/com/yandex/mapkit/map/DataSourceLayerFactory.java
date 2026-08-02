package com.yandex.mapkit.map;

import com.yandex.mapkit.layers.DataSourceLayer;
import com.yandex.mapkit.layers.LayerOptions;

/* loaded from: classes15.dex */
public interface DataSourceLayerFactory {
    DataSourceLayer addLayer(String str, DataSourceFactory dataSourceFactory);

    DataSourceLayer addTileLayer(String str, LayerOptions layerOptions, TileDataSourceFactory tileDataSourceFactory);

    boolean isValid();
}
