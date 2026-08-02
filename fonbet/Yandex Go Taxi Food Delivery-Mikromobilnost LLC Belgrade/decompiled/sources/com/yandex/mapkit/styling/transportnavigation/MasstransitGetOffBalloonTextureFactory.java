package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/MasstransitGetOffBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/transportnavigation/SingleViewBalloonTextureFactory;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "Landroid/view/View;", "balloonParams", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "getBalloonParams", "balloon", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;", "isNightMode", "", "getShadowParams", "Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;", "getOutlineParams", "Lcom/yandex/mapkit/styling/transportnavigation/OutlineParams;", "getDayBackgroundColor", "getNightBackgroundColor", "createView", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MasstransitGetOffBalloonTextureFactory extends SingleViewBalloonTextureFactory {
    private final int backgroundColor;
    private final BalloonParams balloonParams;
    private final Context context;
    private final View view;

    public MasstransitGetOffBalloonTextureFactory(Context context) {
        this.context = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_transport_layout_masstransit_get_off_balloon, (ViewGroup) null);
        Resources resources = context.getResources();
        this.balloonParams = new BalloonParams(resources.getDimension(R.dimen.mapkit_styling_transport_masstransit_manoeuvre_balloon_size_corner_leg), resources.getDimension(R.dimen.mapkit_styling_transport_masstransit_manoeuvre_balloon_size_corner_leg_inner_part), resources.getDimension(R.dimen.mapkit_styling_transport_masstransit_manoeuvre_balloon_width_center_leg), resources.getDimension(R.dimen.mapkit_styling_transport_masstransit_manoeuvre_balloon_height_center_leg), resources.getDimension(R.dimen.mapkit_styling_transport_masstransit_manoeuvre_balloon_leg_offset), resources.getDimension(R.dimen.mapkit_styling_transport_masstransit_manoeuvre_balloon_corner_radius), resources.getDimension(R.dimen.mapkit_styling_transport_tip_thickness_masstransit_maneuver_balloon_leg));
        this.backgroundColor = context.getColor(R.color.mapkit_styling_transport_balloon_new_blue);
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public View createView(Balloon balloon, boolean isNightMode) {
        MasstransitManoeuvreKt.setupGetOffInfo(this.context, isNightMode, balloon.getMasstransitGetOff(), this.view.findViewById(R.id.masstransit_get_off_info));
        return this.view;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public BalloonParams getBalloonParams(Balloon balloon, boolean isNightMode) {
        return this.balloonParams;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public int getDayBackgroundColor(Balloon balloon, boolean isNightMode) {
        return this.backgroundColor;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public int getNightBackgroundColor(Balloon balloon, boolean isNightMode) {
        return this.backgroundColor;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public OutlineParams getOutlineParams(Balloon balloon, boolean isNightMode) {
        return null;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public ShadowParams getShadowParams(Balloon balloon, boolean isNightMode) {
        return null;
    }
}
