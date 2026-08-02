package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import com.yandex.mapkit.navigation.transport.layer.balloons.RouteSummaryBalloon;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/RouteSummaryBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/transportnavigation/SingleViewBalloonTextureFactory;", "summaryConvertors", "Lcom/yandex/mapkit/styling/transportnavigation/SummaryConvertors;", "context", "Landroid/content/Context;", "<init>", "(Lcom/yandex/mapkit/styling/transportnavigation/SummaryConvertors;Landroid/content/Context;)V", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "Landroid/view/View;", "balloonParams", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", "shadowParams", "Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;", "getBalloonParams", "balloon", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;", "isNightMode", "", "getShadowParams", "getOutlineParams", "Lcom/yandex/mapkit/styling/transportnavigation/OutlineParams;", "getDayBackgroundColor", "", "getNightBackgroundColor", "createView", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RouteSummaryBalloonTextureFactory extends SingleViewBalloonTextureFactory {
    private final BalloonParams balloonParams;
    private final Context context;
    private final ShadowParams shadowParams;
    private final SummaryConvertors summaryConvertors;
    private final View view;

    public RouteSummaryBalloonTextureFactory(SummaryConvertors summaryConvertors, Context context) {
        this.summaryConvertors = summaryConvertors;
        this.context = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_transport_layout_masstransit_route_summary_balloon, (ViewGroup) null);
        Resources resources = context.getResources();
        this.balloonParams = new BalloonParams(resources.getDimension(R.dimen.mapkit_styling_transport_size_route_summary_balloon_corner_leg), resources.getDimension(R.dimen.mapkit_styling_transport_size_route_summary_balloon_corner_leg_innerpart), resources.getDimension(R.dimen.mapkit_styling_transport_width_route_summary_balloon_center_leg), resources.getDimension(R.dimen.mapkit_styling_transport_height_route_summary_balloon_center_leg), resources.getDimension(R.dimen.mapkit_styling_transport_offset_route_summary_balloon_leg), resources.getDimension(R.dimen.mapkit_styling_transport_corner_radius_route_summary_balloon), resources.getDimension(R.dimen.mapkit_styling_transport_tip_thickness_route_summary_balloon_leg));
        this.shadowParams = new ShadowParams(context.getColor(R.color.mapkit_styling_transport_route_summary_balloon_shadow), resources.getDimension(R.dimen.mapkit_styling_transport_radius_route_summary_balloon_shadow), new PointF(resources.getDimension(R.dimen.mapkit_styling_transport_offset_x_route_summary_balloon_shadow), resources.getDimension(R.dimen.mapkit_styling_transport_offset_y_route_summary_balloon_shadow)));
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public View createView(Balloon balloon, boolean isNightMode) {
        boolean isSelected;
        RouteSummaryBalloon routeSummary = balloon.getRouteSummary();
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.view.findViewById(R.id.textview_1);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.view.findViewById(R.id.textview_2);
        View findViewById = this.view.findViewById(R.id.space);
        isSelected = RouteSummaryBalloonTextureFactoryKt.isSelected(balloon);
        SummaryConvertors summaryConvertors = this.summaryConvertors;
        if (isSelected) {
            RouteSummaryBalloonTextureFactoryKt.setSelectedText(routeSummary, summaryConvertors, appCompatTextView, appCompatTextView2, findViewById, this.context);
        } else {
            RouteSummaryBalloonTextureFactoryKt.setAlternativeText(isNightMode, routeSummary, summaryConvertors, appCompatTextView, appCompatTextView2, findViewById, this.context);
        }
        return this.view;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public BalloonParams getBalloonParams(Balloon balloon, boolean isNightMode) {
        return this.balloonParams;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public int getDayBackgroundColor(Balloon balloon, boolean isNightMode) {
        int backgroundColorIdentifier;
        Context context = this.context;
        backgroundColorIdentifier = RouteSummaryBalloonTextureFactoryKt.backgroundColorIdentifier(balloon, isNightMode);
        return context.getColor(backgroundColorIdentifier);
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public int getNightBackgroundColor(Balloon balloon, boolean isNightMode) {
        int backgroundColorIdentifier;
        Context context = this.context;
        backgroundColorIdentifier = RouteSummaryBalloonTextureFactoryKt.backgroundColorIdentifier(balloon, isNightMode);
        return context.getColor(backgroundColorIdentifier);
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public OutlineParams getOutlineParams(Balloon balloon, boolean isNightMode) {
        return null;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public ShadowParams getShadowParams(Balloon balloon, boolean isNightMode) {
        return this.shadowParams;
    }
}
