package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.SublayerFeatureFilter;
import com.yandex.mapkit.map.SublayerFeatureFilterType;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class SublayerFeatureFilterBinding implements SublayerFeatureFilter {
    private final NativeObject nativeObject;

    public SublayerFeatureFilterBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.SublayerFeatureFilter
    public native List<String> getTags();

    @Override // com.yandex.mapkit.map.SublayerFeatureFilter
    public native SublayerFeatureFilterType getType();

    @Override // com.yandex.mapkit.map.SublayerFeatureFilter
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.SublayerFeatureFilter
    public native void setTags(List<String> list);

    @Override // com.yandex.mapkit.map.SublayerFeatureFilter
    public native void setType(SublayerFeatureFilterType sublayerFeatureFilterType);
}
