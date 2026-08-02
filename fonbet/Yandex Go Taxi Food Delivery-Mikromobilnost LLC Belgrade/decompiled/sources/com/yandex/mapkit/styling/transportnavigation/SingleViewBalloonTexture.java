package com.yandex.mapkit.styling.transportnavigation;

import android.view.View;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/SingleViewBalloonTexture;", "Lcom/yandex/mapkit/styling/transportnavigation/LegBalloonTexture;", "view", "Landroid/view/View;", "balloonParams", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", "<init>", "(Landroid/view/View;Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;)V", "getView", "balloonAnchor", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SingleViewBalloonTexture extends LegBalloonTexture {
    private final View view;

    public SingleViewBalloonTexture(View view, BalloonParams balloonParams) {
        super(balloonParams);
        this.view = view;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTexture
    public View getView(BalloonAnchor balloonAnchor) {
        return this.view;
    }
}
