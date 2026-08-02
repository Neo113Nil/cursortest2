package com.yandex.mapkit.navigation.automotive.internal;

import com.yandex.mapkit.directions.driving.Annotation;
import com.yandex.mapkit.navigation.RoutePosition;
import com.yandex.mapkit.navigation.automotive.UpcomingManoeuvre;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class UpcomingManoeuvreBinding implements UpcomingManoeuvre {
    private final NativeObject nativeObject;

    public UpcomingManoeuvreBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingManoeuvre
    public native Annotation getAnnotation();

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingManoeuvre
    public native RoutePosition getPosition();
}
