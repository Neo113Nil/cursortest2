package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.view.View;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/SingleViewBalloonTexture;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTexture;", "view", "Landroid/view/View;", "balloonParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "scaleFactor", "", "<init>", "(Landroid/view/View;Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;F)V", "getView", "balloonAnchor", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SingleViewBalloonTexture extends BalloonTexture {
    private final View view;

    public SingleViewBalloonTexture(View view, BalloonParams balloonParams, float f) {
        super(balloonParams, f);
        this.view = view;
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.BalloonTexture
    public View getView(BalloonAnchor balloonAnchor) {
        return this.view;
    }
}
