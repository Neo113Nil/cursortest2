package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.b;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.LaneSignBalloon;
import com.yandex.mapkit.styling.automotive.balloons.BalloonColors;
import com.yandex.mapkit.styling.automotive.balloons.ManoeuvreBalloonColors;
import com.yandex.mapkit.styling.automotivenavigation.DayNightRes;
import com.yandex.mapkit.styling.automotivenavigation.R;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.wuj0;
import defpackage.yma1;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0018\u0010\f\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneSignBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/SingleViewBalloonTextureFactory;", "context", "Landroid/content/Context;", "colors", "Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;", "<init>", "(Landroid/content/Context;Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;)V", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "Landroid/view/View;", "resources", "Landroid/content/res/Resources;", "Landroid/content/res/Resources;", "balloonParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/mapkit/styling/automotivenavigation/DayNightRes;", "laneColor", "getBalloonParams", "balloon", "Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;", "isNightMode", "", "getShadowParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;", "getDayBackgroundColor", "", "getNightBackgroundColor", "createView", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LaneSignBalloonTextureFactory extends SingleViewBalloonTextureFactory {
    private final DayNightRes backgroundColor;
    private final BalloonParams balloonParams;
    private final Context context;
    private final DayNightRes laneColor;
    private final Resources resources;
    private final View view;

    public LaneSignBalloonTextureFactory(Context context, BalloonColors balloonColors) {
        ManoeuvreBalloonColors manoeuvre;
        Integer backgroundNight;
        ManoeuvreBalloonColors manoeuvre2;
        Integer backgroundDay;
        this.context = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_automotive_layout_lane_balloon, (ViewGroup) null);
        Resources resources = context.getResources();
        this.resources = resources;
        this.balloonParams = new BalloonParams(resources.getDimension(R.dimen.mapkit_styling_automotive_size_contextballoon_cornerleg), resources.getDimension(R.dimen.mapkit_styling_automotive_size_contextballoon_cornerleg_innerpart), resources.getDimension(R.dimen.mapkit_styling_automotive_width_contextballoon_centerleg), resources.getDimension(R.dimen.mapkit_styling_automotive_height_contextballoon_centerleg), resources.getDimension(R.dimen.mapkit_styling_automotive_offset_contextballoon_leg), resources.getDimension(R.dimen.mapkit_styling_automotive_cornerradius_contextballoon));
        this.backgroundColor = new DayNightRes((balloonColors == null || (manoeuvre2 = balloonColors.getManoeuvre()) == null || (backgroundDay = manoeuvre2.getBackgroundDay()) == null) ? context.getColor(R.color.mapkit_styling_automotive_balloon_background_day) : backgroundDay.intValue(), (balloonColors == null || (manoeuvre = balloonColors.getManoeuvre()) == null || (backgroundNight = manoeuvre.getBackgroundNight()) == null) ? context.getColor(R.color.mapkit_styling_automotive_balloon_background_night) : backgroundNight.intValue());
        this.laneColor = new DayNightRes(context.getColor(R.color.mapkit_styling_automotive_balloon_text_day), context.getColor(R.color.mapkit_styling_automotive_balloon_text_night));
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public View createView(Balloon balloon, boolean isNightMode) {
        LaneSignBalloon laneSign = balloon.getLaneSign();
        Resources resources = this.context.getResources();
        int i = R.drawable.mapkit_styling_automotive_contextballoon_background;
        ThreadLocal threadLocal = wuj0.a;
        Drawable b = yma1.b(resources, i, null);
        b.setTint(this.backgroundColor.get(isNightMode));
        View view = this.view;
        WeakHashMap weakHashMap = b.a;
        view.setBackground(b);
        LinearLayout linearLayout = (LinearLayout) this.view.findViewById(R.id.lanes_container);
        new LaneSignContainerBuilder(this.context, LaneUtils.createLaneItems(laneSign.getLaneSign(), this.context), linearLayout, this.laneColor.get(isNightMode)).build();
        return this.view;
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public BalloonParams getBalloonParams(Balloon balloon, boolean isNightMode) {
        return this.balloonParams;
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public int getDayBackgroundColor(Balloon balloon, boolean isNightMode) {
        return this.backgroundColor.getDayId();
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public int getNightBackgroundColor(Balloon balloon, boolean isNightMode) {
        return this.backgroundColor.getNightId();
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public ShadowParams getShadowParams(Balloon balloon, boolean isNightMode) {
        return null;
    }
}
