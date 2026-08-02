package com.yandex.mapkit.styling.transportnavigation;

import android.graphics.PointF;
import android.view.View;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.BalloonGeometry;
import com.yandex.runtime.image.ImageProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0004¨\u0006\u000f"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/BalloonTexture;", "", "<init>", "()V", "getBalloonGeometry", "Lcom/yandex/mapkit/navigation/balloons/BalloonGeometry;", "balloonAnchor", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "create", "Lcom/yandex/runtime/image/ImageProvider;", "getView", "Landroid/view/View;", "getBodySize", "Landroid/graphics/PointF;", "view", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class BalloonTexture {
    public abstract ImageProvider create(BalloonAnchor balloonAnchor);

    public abstract BalloonGeometry getBalloonGeometry(BalloonAnchor balloonAnchor);

    public final PointF getBodySize(View view) {
        return new PointF(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public abstract View getView(BalloonAnchor balloonAnchor);
}
