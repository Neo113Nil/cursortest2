package com.yandex.mapkit.layers;

import java.util.Map;

/* loaded from: classes15.dex */
public interface DataSourceLayer {
    void clear();

    boolean isActive();

    boolean isValid();

    void remove();

    void resetStyles();

    void setActive(boolean z);

    void setDataSourceListener(DataSourceListener dataSourceListener);

    void setFeatures(Map<String, String> map);

    void setLayerLoadedListener(LayerLoadedListener layerLoadedListener);

    boolean setStyle(int i, String str);
}
