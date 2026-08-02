package com.yandex.mapkit.styling.automotivenavigation.balloons;

import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTextureFactory;", "", "createTexture", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTexture;", "balloon", "Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;", "isNightMode", "", "scaleFactor", "", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BalloonTextureFactory {
    BalloonTexture createTexture(Balloon balloon, boolean isNightMode, float scaleFactor);
}
