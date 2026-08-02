package com.yandex.mapkit.location.external_providers.internal;

import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.location.external_providers.SourceLocation;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class SourceLocationBinding implements SourceLocation {
    private final NativeObject nativeObject;

    public SourceLocationBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.location.external_providers.SourceLocation
    public native long age();

    @Override // com.yandex.mapkit.location.external_providers.SourceLocation
    public native Location getLocation();
}
