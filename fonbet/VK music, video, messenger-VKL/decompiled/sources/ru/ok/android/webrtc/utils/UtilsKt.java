package ru.ok.android.webrtc.utils;

import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.Size;

/* loaded from: classes9.dex */
public final class UtilsKt {
    public static final int getArea(Size size) {
        return size.width * size.height;
    }

    public static final int getMaxValue(Size size) {
        return Math.max(size.width, size.height);
    }

    public static final Size getToScaledSize(CropAndScaleParamsProvider.CropAndScaleParams cropAndScaleParams) {
        return new Size(cropAndScaleParams.getScaleWidth(), cropAndScaleParams.getScaleHeight());
    }
}
