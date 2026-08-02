package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.ModelStyle;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.model.AnimatedModelProvider;

/* loaded from: classes15.dex */
public class PlacemarkAnimationBinding extends PlacemarkPresentationBinding implements PlacemarkAnimation {
    public PlacemarkAnimationBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native boolean isReversed();

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void pause();

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void play();

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void play(Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void resume();

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void setIcon(AnimatedImageProvider animatedImageProvider, IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void setIcon(AnimatedImageProvider animatedImageProvider, IconStyle iconStyle, Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void setIconStyle(IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    @Deprecated
    public native void setModel(AnimatedModelProvider animatedModelProvider, ModelStyle modelStyle);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    @Deprecated
    public native void setModel(AnimatedModelProvider animatedModelProvider, ModelStyle modelStyle, Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    @Deprecated
    public native void setModelStyle(ModelStyle modelStyle);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void setReversed(boolean z);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void stop();
}
