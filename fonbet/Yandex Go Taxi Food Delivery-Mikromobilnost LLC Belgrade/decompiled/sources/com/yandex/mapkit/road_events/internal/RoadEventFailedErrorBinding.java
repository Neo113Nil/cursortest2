package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.road_events.RoadEventFailedError;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.internal.ErrorBinding;

/* loaded from: classes12.dex */
public class RoadEventFailedErrorBinding extends ErrorBinding implements RoadEventFailedError {
    public RoadEventFailedErrorBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.road_events.RoadEventFailedError
    public native RoadEventFailedError.Code getCode();

    @Override // com.yandex.mapkit.road_events.RoadEventFailedError
    public native String getDescription();
}
