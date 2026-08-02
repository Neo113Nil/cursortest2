package com.yandex.mapkit.map;

import java.util.List;

/* loaded from: classes15.dex */
public interface SublayerFeatureFilter {
    List<String> getTags();

    SublayerFeatureFilterType getType();

    boolean isValid();

    void setTags(List<String> list);

    void setType(SublayerFeatureFilterType sublayerFeatureFilterType);
}
