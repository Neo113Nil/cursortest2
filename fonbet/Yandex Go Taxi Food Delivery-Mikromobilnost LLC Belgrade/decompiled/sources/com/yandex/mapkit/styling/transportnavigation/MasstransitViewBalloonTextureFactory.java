package com.yandex.mapkit.styling.transportnavigation;

import android.view.View;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import com.yandex.mapkit.styling.transportnavigation.BalloonTextureFactory;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\u0005H$J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/MasstransitViewBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonTextureFactory;", "<init>", "()V", "createView", "Landroid/view/View;", "balloon", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;", "isNightMode", "", "getAnchorView", "createTexture", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonTexture;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MasstransitViewBalloonTextureFactory implements BalloonTextureFactory {
    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTextureFactory
    public BalloonTexture createTexture(Balloon balloon, boolean isNightMode) {
        View createView = createView(balloon, isNightMode);
        createView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        createView.layout(0, 0, createView.getMeasuredWidth(), createView.getMeasuredHeight());
        return new MasstransitViewBalloonTexture(createView, getAnchorView());
    }

    public abstract View createView(Balloon balloon, boolean isNightMode);

    public abstract View getAnchorView();

    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTextureFactory
    public List<BalloonAnchor> getPossibleAnchors() {
        return BalloonTextureFactory.DefaultImpls.getPossibleAnchors(this);
    }
}
