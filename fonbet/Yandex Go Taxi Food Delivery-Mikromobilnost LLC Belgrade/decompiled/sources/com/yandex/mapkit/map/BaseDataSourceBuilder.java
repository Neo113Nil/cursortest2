package com.yandex.mapkit.map;

import com.yandex.mapkit.images.ImageUrlProvider;
import com.yandex.mapkit.resource_url_provider.ResourceUrlProvider;

/* loaded from: classes15.dex */
public interface BaseDataSourceBuilder {
    boolean isHasSharedIds();

    boolean isValid();

    void setGLTFModelUrlProvider(ResourceUrlProvider resourceUrlProvider);

    void setHasSharedIds(boolean z);

    void setImageUrlProvider(ImageUrlProvider imageUrlProvider);

    void setModelUrlProvider(ResourceUrlProvider resourceUrlProvider);
}
