package com.yandex.mapkit.map;

import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.model.AnimatedModelProvider;

/* loaded from: classes15.dex */
public interface PlacemarkAnimation extends PlacemarkPresentation {
    boolean isReversed();

    void pause();

    void play();

    void play(Callback callback);

    void resume();

    void setIcon(AnimatedImageProvider animatedImageProvider, IconStyle iconStyle);

    void setIcon(AnimatedImageProvider animatedImageProvider, IconStyle iconStyle, Callback callback);

    void setIconStyle(IconStyle iconStyle);

    @Deprecated
    void setModel(AnimatedModelProvider animatedModelProvider, ModelStyle modelStyle);

    @Deprecated
    void setModel(AnimatedModelProvider animatedModelProvider, ModelStyle modelStyle, Callback callback);

    @Deprecated
    void setModelStyle(ModelStyle modelStyle);

    void setReversed(boolean z);

    void stop();
}
