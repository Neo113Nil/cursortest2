package com.yandex.mapkit.styling;

import android.graphics.PointF;
import com.yandex.mapkit.map.ModelStyle;
import com.yandex.runtime.DataProviderWithId;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.model.ModelProvider;
import java.util.List;

/* loaded from: classes15.dex */
public interface PlacemarkStyle {
    boolean isValid();

    void setAnimatedImage(AnimatedImageProvider animatedImageProvider);

    void setArrowModel();

    void setGltfModel(DataProviderWithId dataProviderWithId, ModelStyle modelStyle);

    void setIconAnchor(PointF pointF);

    void setImage(ImageProvider imageProvider);

    void setMinZoomVisible(Float f);

    @Deprecated
    void setModel(ModelProvider modelProvider, ModelStyle modelStyle);

    void setScaleFunction(List<PointF> list);
}
