package com.yandex.mapkit.navigation.automotive.layer.styling;

import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.BalloonGeometry;
import com.yandex.runtime.image.ImageProvider;
import java.util.List;

/* loaded from: classes15.dex */
public interface BalloonImageProvider {
    ImageProvider createImage(Balloon balloon, BalloonAnchor balloonAnchor, float f, boolean z);

    List<BalloonGeometry> geometriesForBalloon(Balloon balloon, float f, boolean z);
}
