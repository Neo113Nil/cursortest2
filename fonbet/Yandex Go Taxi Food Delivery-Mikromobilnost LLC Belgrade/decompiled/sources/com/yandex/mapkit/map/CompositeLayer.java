package com.yandex.mapkit.map;

import com.yandex.mapkit.layers.Layer;
import com.yandex.mapkit.resource_url_provider.ResourceUrlProvider;

/* loaded from: classes15.dex */
public interface CompositeLayer extends Layer {
    DataSourceLayerFactory getDataSourceLayerFactory();

    boolean isSkyEnabled();

    void setIndoorPlanUrlProvider(ResourceUrlProvider resourceUrlProvider);

    void setSkyEnabled(boolean z);

    void setStyle(byte[] bArr);
}
