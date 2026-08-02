package com.yandex.mapkit.styling.transportnavigation;

import android.view.View;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import com.yandex.mapkit.styling.transportnavigation.BalloonTextureFactory;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH$J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH$J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH$J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH$J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH$J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH$J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0015"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/SingleViewBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonTextureFactory;", "<init>", "()V", "getBalloonParams", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", "balloon", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;", "isNightMode", "", "getShadowParams", "Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;", "getOutlineParams", "Lcom/yandex/mapkit/styling/transportnavigation/OutlineParams;", "getDayBackgroundColor", "", "getNightBackgroundColor", "createView", "Landroid/view/View;", "createTexture", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonTexture;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SingleViewBalloonTextureFactory implements BalloonTextureFactory {
    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTextureFactory
    public BalloonTexture createTexture(Balloon balloon, boolean isNightMode) {
        View createView = createView(balloon, isNightMode);
        createView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        createView.layout(0, 0, createView.getMeasuredWidth(), createView.getMeasuredHeight());
        SingleViewBalloonTexture singleViewBalloonTexture = new SingleViewBalloonTexture(createView, getBalloonParams(balloon, isNightMode));
        singleViewBalloonTexture.setShadowParams(getShadowParams(balloon, isNightMode));
        singleViewBalloonTexture.setOutlineParams(getOutlineParams(balloon, isNightMode));
        if (isNightMode) {
            singleViewBalloonTexture.setColor(getNightBackgroundColor(balloon, isNightMode));
            return singleViewBalloonTexture;
        }
        singleViewBalloonTexture.setColor(getDayBackgroundColor(balloon, isNightMode));
        return singleViewBalloonTexture;
    }

    public abstract View createView(Balloon balloon, boolean isNightMode);

    public abstract BalloonParams getBalloonParams(Balloon balloon, boolean isNightMode);

    public abstract int getDayBackgroundColor(Balloon balloon, boolean isNightMode);

    public abstract int getNightBackgroundColor(Balloon balloon, boolean isNightMode);

    public abstract OutlineParams getOutlineParams(Balloon balloon, boolean isNightMode);

    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTextureFactory
    public List<BalloonAnchor> getPossibleAnchors() {
        return BalloonTextureFactory.DefaultImpls.getPossibleAnchors(this);
    }

    public abstract ShadowParams getShadowParams(Balloon balloon, boolean isNightMode);
}
