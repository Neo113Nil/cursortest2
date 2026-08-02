package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.ManoeuvreWithLaneSignBalloon;
import com.yandex.mapkit.styling.automotive.balloons.BalloonColors;
import com.yandex.mapkit.styling.automotive.balloons.ManoeuvreBalloonColors;
import com.yandex.mapkit.styling.automotivenavigation.DayNightRes;
import com.yandex.mapkit.styling.automotivenavigation.R;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.wuj0;
import defpackage.yma1;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010!\u001a\n \u001b*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ManoeuvreWithLaneSignBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTextureFactory;", "Landroid/content/Context;", "context", "Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;", "colors", "<init>", "(Landroid/content/Context;Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;)V", "Landroid/view/View;", "view", "Lcom/yandex/mapkit/navigation/automotive/layer/ManoeuvreWithLaneSignBalloon;", "balloon", "", "isNightMode", "Lzy11;", "setupView", "(Landroid/view/View;Lcom/yandex/mapkit/navigation/automotive/layer/ManoeuvreWithLaneSignBalloon;Z)V", "setupNonCompactWidths", "(Landroid/view/View;)V", "setupCompactWidths", "Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;", "", "scaleFactor", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTexture;", "createTexture", "(Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;ZF)Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTexture;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "leftAlignedView", "Landroid/view/View;", "rightAlignedView", "compactView", "Landroid/content/res/Resources;", "resources", "Landroid/content/res/Resources;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "balloonParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "Lcom/yandex/mapkit/styling/automotivenavigation/DayNightRes;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/mapkit/styling/automotivenavigation/DayNightRes;", "textColor", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManoeuvreWithLaneSignBalloonTextureFactory implements BalloonTextureFactory {
    private final DayNightRes backgroundColor;
    private final BalloonParams balloonParams;
    private final View compactView;
    private final Context context;
    private final View leftAlignedView;
    private final Resources resources;
    private final View rightAlignedView;
    private final DayNightRes textColor;

    public ManoeuvreWithLaneSignBalloonTextureFactory(Context context, BalloonColors balloonColors) {
        ManoeuvreBalloonColors manoeuvre;
        Integer backgroundNight;
        ManoeuvreBalloonColors manoeuvre2;
        Integer backgroundDay;
        this.context = context;
        this.leftAlignedView = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_automotive_layout_jointballoon_vertical_left, (ViewGroup) null);
        this.rightAlignedView = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_automotive_layout_jointballoon_vertical_right, (ViewGroup) null);
        this.compactView = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_automotive_layout_jointballoon_compact, (ViewGroup) null);
        Resources resources = context.getResources();
        this.resources = resources;
        this.balloonParams = new BalloonParams(resources.getDimension(R.dimen.mapkit_styling_automotive_size_contextballoon_cornerleg), resources.getDimension(R.dimen.mapkit_styling_automotive_size_contextballoon_cornerleg_innerpart), resources.getDimension(R.dimen.mapkit_styling_automotive_width_contextballoon_centerleg), resources.getDimension(R.dimen.mapkit_styling_automotive_height_contextballoon_centerleg), resources.getDimension(R.dimen.mapkit_styling_automotive_offset_contextballoon_leg), resources.getDimension(R.dimen.mapkit_styling_automotive_cornerradius_contextballoon));
        this.backgroundColor = new DayNightRes((balloonColors == null || (manoeuvre2 = balloonColors.getManoeuvre()) == null || (backgroundDay = manoeuvre2.getBackgroundDay()) == null) ? context.getColor(R.color.mapkit_styling_automotive_balloon_background_day) : backgroundDay.intValue(), (balloonColors == null || (manoeuvre = balloonColors.getManoeuvre()) == null || (backgroundNight = manoeuvre.getBackgroundNight()) == null) ? context.getColor(R.color.mapkit_styling_automotive_balloon_background_night) : backgroundNight.intValue());
        this.textColor = new DayNightRes(context.getColor(R.color.mapkit_styling_automotive_balloon_text_day), context.getColor(R.color.mapkit_styling_automotive_balloon_text_night));
    }

    private final void setupCompactWidths(View view) {
        NextStreetTextView nextStreetTextView = (NextStreetTextView) view.findViewById(R.id.text_jointballoon_nextstreet);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.lanes_container);
        DirectionSignView directionSignView = (DirectionSignView) view.findViewById(R.id.roadsign_container);
        View findViewById = view.findViewById(R.id.distance_container);
        int measuredWidth = findViewById.getMeasuredWidth() + linearLayout.getMeasuredWidth();
        int round = Math.round(this.context.getResources().getDimension(R.dimen.mapkit_styling_automotive_maxwidth_nextstreet));
        if (round < measuredWidth) {
            round = measuredWidth;
        }
        nextStreetTextView.setMaximumWidth(round);
        int round2 = Math.round(this.context.getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_maxwidth));
        if (round2 >= measuredWidth) {
            measuredWidth = round2;
        }
        directionSignView.setMaxWidth(measuredWidth);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final void setupNonCompactWidths(View view) {
        NextStreetTextView nextStreetTextView = (NextStreetTextView) view.findViewById(R.id.text_jointballoon_nextstreet);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.lanes_container);
        DirectionSignView directionSignView = (DirectionSignView) view.findViewById(R.id.roadsign_container);
        int round = Math.round(this.context.getResources().getDimension(R.dimen.mapkit_styling_automotive_maxwidth_nextstreet));
        int measuredWidth = linearLayout.getMeasuredWidth();
        if (round < measuredWidth) {
            round = measuredWidth;
        }
        nextStreetTextView.setMaximumWidth(round);
        int round2 = Math.round(this.context.getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_maxwidth));
        int measuredWidth2 = linearLayout.getMeasuredWidth();
        if (round2 < measuredWidth2) {
            round2 = measuredWidth2;
        }
        directionSignView.setMaxWidth(round2);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final void setupView(View view, ManoeuvreWithLaneSignBalloon balloon, boolean isNightMode) {
        Resources resources = this.context.getResources();
        int i = R.drawable.mapkit_styling_automotive_contextballoon_background;
        ThreadLocal threadLocal = wuj0.a;
        Drawable b = yma1.b(resources, i, null);
        b.setTint(this.backgroundColor.get(isNightMode));
        WeakHashMap weakHashMap = b.a;
        view.setBackground(b);
        int i2 = this.textColor.get(isNightMode);
        NextStreetTextView nextStreetTextView = (NextStreetTextView) view.findViewById(R.id.text_jointballoon_nextstreet);
        ViewUtilsKt.setupNextStreetView(this.context, nextStreetTextView, balloon.getManoeuvre().getNextRoadName(), balloon.getDirectionSign());
        nextStreetTextView.setTextColor(i2);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_balloon_distance);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_balloon_metrics);
        ViewUtilsKt.setupDistanceAndMetricsViews(appCompatTextView, appCompatTextView2, balloon.getManoeuvre().getDistance().getText());
        appCompatTextView.setTextColor(i2);
        appCompatTextView2.setTextColor(i2);
        ViewUtilsKt.setupDirectionSignView((DirectionSignView) view.findViewById(R.id.roadsign_container), balloon.getDirectionSign());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.lanes_container);
        new LaneSignContainerBuilder(this.context, LaneUtils.createLaneItems(balloon.getLaneSign(), this.context), linearLayout, i2).build();
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.BalloonTextureFactory
    public BalloonTexture createTexture(Balloon balloon, boolean isNightMode, float scaleFactor) {
        View view;
        ManoeuvreWithLaneSignBalloon manoeuvreWithLaneSign = balloon.getManoeuvreWithLaneSign();
        setupView(this.leftAlignedView, manoeuvreWithLaneSign, isNightMode);
        setupView(this.rightAlignedView, manoeuvreWithLaneSign, isNightMode);
        setupNonCompactWidths(this.leftAlignedView);
        setupNonCompactWidths(this.rightAlignedView);
        if (manoeuvreWithLaneSign.getLaneSign().getLanes().size() <= this.context.getResources().getInteger(R.integer.mapkit_styling_automotive_max_lanes_compact_layout)) {
            setupView(this.compactView, manoeuvreWithLaneSign, isNightMode);
            setupCompactWidths(this.compactView);
            view = this.compactView;
        } else {
            view = null;
        }
        SideDependentTexture sideDependentTexture = new SideDependentTexture(this.leftAlignedView, this.rightAlignedView, view, this.balloonParams, scaleFactor);
        sideDependentTexture.setLegColor(this.backgroundColor.get(isNightMode));
        return sideDependentTexture;
    }
}
