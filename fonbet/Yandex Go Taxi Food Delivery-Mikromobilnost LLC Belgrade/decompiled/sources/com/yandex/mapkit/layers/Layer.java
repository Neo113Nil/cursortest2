package com.yandex.mapkit.layers;

/* loaded from: classes7.dex */
public interface Layer {
    DataSourceLayer dataSourceLayer();

    DataSourceLayer dataSourceLayer(String str);

    boolean isValid();

    void remove();
}
