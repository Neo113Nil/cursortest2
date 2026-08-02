package com.yandex.mapkit.navigation.transport.layer.balloons.internal;

import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class BalloonViewBinding implements BalloonView {
    private final NativeObject nativeObject;

    public BalloonViewBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView
    public native BalloonAnchor getAnchor();

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView
    public native Balloon getBalloon();

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView
    public native Route getHostRoute();

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView
    public native boolean isIsEnabled();

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView
    public native boolean isIsVisible();

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView
    public native boolean isValid();

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView
    public native void setIsEnabled(boolean z);
}
