package com.yandex.mapkit.styling.automotivenavigation;

import android.graphics.PointF;
import com.yandex.mapkit.navigation.automotive.layer.styling.HighlightMode;
import com.yandex.mapkit.navigation.automotive.layer.styling.HighlightStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.SpeedControlHighlightStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/DefaultHighlightStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/HighlightStyleProvider;", "<init>", "()V", "provideSpeedControlStyle", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/SpeedControlHighlightStyle;", "isNightMode", "", "highlightMode", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/HighlightMode;", "Companion", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultHighlightStyleProvider implements HighlightStyleProvider {
    private static final PointF ROAD_EVENT_IMAGE_PULSATION_CENTER = new PointF(0.5f, 0.42f);

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.HighlightStyleProvider
    public SpeedControlHighlightStyle provideSpeedControlStyle(boolean isNightMode, HighlightMode highlightMode) {
        boolean z = highlightMode == HighlightMode.SOFT_PULSATION;
        return new SpeedControlHighlightStyle(z ? -3842209 : -65536, 1.0f, z ? -3506562 : -43177, 60.0f, 1000L, ROAD_EVENT_IMAGE_PULSATION_CENTER);
    }
}
