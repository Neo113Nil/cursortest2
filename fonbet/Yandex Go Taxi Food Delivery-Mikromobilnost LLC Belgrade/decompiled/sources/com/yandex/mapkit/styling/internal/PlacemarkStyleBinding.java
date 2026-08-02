package com.yandex.mapkit.styling.internal;

import android.graphics.PointF;
import com.yandex.mapkit.map.ModelStyle;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.runtime.DataProviderWithId;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.model.ModelProvider;
import java.util.List;

/* loaded from: classes15.dex */
public class PlacemarkStyleBinding implements PlacemarkStyle {
    private final NativeObject nativeObject;

    public PlacemarkStyleBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.styling.PlacemarkStyle
    public native boolean isValid();

    @Override // com.yandex.mapkit.styling.PlacemarkStyle
    public native void setAnimatedImage(AnimatedImageProvider animatedImageProvider);

    @Override // com.yandex.mapkit.styling.PlacemarkStyle
    public native void setArrowModel();

    @Override // com.yandex.mapkit.styling.PlacemarkStyle
    public native void setGltfModel(DataProviderWithId dataProviderWithId, ModelStyle modelStyle);

    @Override // com.yandex.mapkit.styling.PlacemarkStyle
    public native void setIconAnchor(PointF pointF);

    @Override // com.yandex.mapkit.styling.PlacemarkStyle
    public native void setImage(ImageProvider imageProvider);

    @Override // com.yandex.mapkit.styling.PlacemarkStyle
    public native void setMinZoomVisible(Float f);

    @Override // com.yandex.mapkit.styling.PlacemarkStyle
    @Deprecated
    public native void setModel(ModelProvider modelProvider, ModelStyle modelStyle);

    @Override // com.yandex.mapkit.styling.PlacemarkStyle
    public native void setScaleFunction(List<PointF> list);
}
