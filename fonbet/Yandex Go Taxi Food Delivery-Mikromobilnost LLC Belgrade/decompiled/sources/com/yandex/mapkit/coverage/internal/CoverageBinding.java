package com.yandex.mapkit.coverage.internal;

import com.yandex.mapkit.coverage.Coverage;
import com.yandex.mapkit.coverage.IsCoveredSession;
import com.yandex.mapkit.coverage.RegionsSession;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class CoverageBinding implements Coverage {
    private final NativeObject nativeObject;

    public CoverageBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.coverage.Coverage
    public native IsCoveredSession isCovered(LinearRing linearRing, int i, IsCoveredSession.IsCoveredListener isCoveredListener);

    @Override // com.yandex.mapkit.coverage.Coverage
    public native IsCoveredSession isCovered(Point point, int i, IsCoveredSession.IsCoveredListener isCoveredListener);

    @Override // com.yandex.mapkit.coverage.Coverage
    public native RegionsSession regions(Point point, int i, RegionsSession.RegionsListener regionsListener);

    @Override // com.yandex.mapkit.coverage.Coverage
    public native void setActiveArea(LinearRing linearRing, int i);
}
