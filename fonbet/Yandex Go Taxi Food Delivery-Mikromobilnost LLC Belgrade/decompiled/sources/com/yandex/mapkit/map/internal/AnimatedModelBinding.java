package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.AnimatedModel;
import com.yandex.mapkit.map.AnimationState;
import com.yandex.mapkit.map.Callback;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class AnimatedModelBinding extends ModelBinding implements AnimatedModel {
    public AnimatedModelBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native int getLoopCount();

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native float getSpeed();

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native AnimationState getState();

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native void pause();

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native void play();

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native void selectAnimation(String str);

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native void setLoopCount(int i);

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native void setOnFinished(Callback callback);

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native void setSpeed(float f);

    @Override // com.yandex.mapkit.map.AnimatedModel
    public native void stop();
}
