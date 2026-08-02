package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.yandex.mapkit.directions.driving.Action;
import com.yandex.mapkit.directions.driving.DirectionSign;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.ManoeuvreBalloon;
import com.yandex.mapkit.styling.automotive.balloons.BalloonColors;
import com.yandex.mapkit.styling.automotive.balloons.ManoeuvreBalloonColors;
import com.yandex.mapkit.styling.automotivenavigation.DayNightRes;
import com.yandex.mapkit.styling.automotivenavigation.R;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.m810;
import defpackage.w511;
import defpackage.wuj0;
import defpackage.yma1;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010 \u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0018\u0010\f\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ManoeuvreBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/SingleViewBalloonTextureFactory;", "context", "Landroid/content/Context;", "colors", "Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;", "<init>", "(Landroid/content/Context;Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;)V", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "Landroid/view/View;", "resources", "Landroid/content/res/Resources;", "Landroid/content/res/Resources;", "balloonParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/mapkit/styling/automotivenavigation/DayNightRes;", "textColor", "getManoeuvreImageResourceId", "", "action", "Lcom/yandex/mapkit/directions/driving/Action;", "(Lcom/yandex/mapkit/directions/driving/Action;)Ljava/lang/Integer;", "getBalloonParams", "balloon", "Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;", "isNightMode", "", "getShadowParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;", "getDayBackgroundColor", "getNightBackgroundColor", "createView", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManoeuvreBalloonTextureFactory extends SingleViewBalloonTextureFactory {
    private final DayNightRes backgroundColor;
    private final BalloonParams balloonParams;
    private final Context context;
    private final Resources resources;
    private final DayNightRes textColor;
    private final View view;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.STRAIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.SLIGHT_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Action.SLIGHT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Action.LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Action.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Action.HARD_LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Action.HARD_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Action.FORK_LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Action.FORK_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Action.UTURN_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Action.UTURN_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Action.ENTER_ROUNDABOUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Action.LEAVE_ROUNDABOUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Action.BOARD_FERRY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Action.LEAVE_FERRY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Action.EXIT_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Action.EXIT_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Action.FINISH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Action.UNKNOWN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Action.WAYPOINT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ManoeuvreBalloonTextureFactory(Context context, BalloonColors balloonColors) {
        ManoeuvreBalloonColors manoeuvre;
        Integer backgroundNight;
        ManoeuvreBalloonColors manoeuvre2;
        Integer backgroundDay;
        this.context = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_automotive_layout_manoeuvre_balloon, (ViewGroup) null);
        Resources resources = context.getResources();
        this.resources = resources;
        this.balloonParams = new BalloonParams(resources.getDimension(R.dimen.mapkit_styling_automotive_size_contextballoon_cornerleg), resources.getDimension(R.dimen.mapkit_styling_automotive_size_contextballoon_cornerleg_innerpart), resources.getDimension(R.dimen.mapkit_styling_automotive_width_contextballoon_centerleg), resources.getDimension(R.dimen.mapkit_styling_automotive_height_contextballoon_centerleg), resources.getDimension(R.dimen.mapkit_styling_automotive_offset_contextballoon_leg), resources.getDimension(R.dimen.mapkit_styling_automotive_cornerradius_contextballoon));
        this.backgroundColor = new DayNightRes((balloonColors == null || (manoeuvre2 = balloonColors.getManoeuvre()) == null || (backgroundDay = manoeuvre2.getBackgroundDay()) == null) ? context.getColor(R.color.mapkit_styling_automotive_balloon_background_day) : backgroundDay.intValue(), (balloonColors == null || (manoeuvre = balloonColors.getManoeuvre()) == null || (backgroundNight = manoeuvre.getBackgroundNight()) == null) ? context.getColor(R.color.mapkit_styling_automotive_balloon_background_night) : backgroundNight.intValue());
        this.textColor = new DayNightRes(context.getColor(R.color.mapkit_styling_automotive_balloon_text_day), context.getColor(R.color.mapkit_styling_automotive_balloon_text_night));
    }

    private final Integer getManoeuvreImageResourceId(Action action) {
        switch (WhenMappings.$EnumSwitchMapping$0[action.ordinal()]) {
            case 1:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_forward);
            case 2:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_take_left);
            case 3:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_take_right);
            case 4:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_turn_left);
            case 5:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_turn_right);
            case 6:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_hard_turn_left);
            case 7:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_hard_turn_right);
            case 8:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_take_left);
            case 9:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_take_right);
            case 10:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_turn_back_left);
            case 11:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_turn_back_right);
            case 12:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_in_circular_movement);
            case 13:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_out_circular_movement);
            case 14:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_boardferry);
            case 15:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_boardferry);
            case 16:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_exit_left);
            case 17:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_exit_right);
            case 18:
                return Integer.valueOf(R.drawable.mapkit_styling_automotive_context_ra_finish);
            default:
                w511.b();
            case 19:
            case 20:
                return null;
        }
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public View createView(Balloon balloon, boolean isNightMode) {
        ManoeuvreBalloon manoeuvre = balloon.getManoeuvre();
        DirectionSign directionSign = manoeuvre.getDirectionSign();
        int i = this.textColor.get(isNightMode);
        NextStreetTextView nextStreetTextView = (NextStreetTextView) this.view.findViewById(R.id.text_nextstreet);
        ViewUtilsKt.setupNextStreetView(this.context, nextStreetTextView, manoeuvre.getManoeuvre().getNextRoadName(), directionSign);
        nextStreetTextView.setMaximumWidth(m810.b(this.context.getResources().getDimension(R.dimen.mapkit_styling_automotive_maxwidth_nextstreet)));
        nextStreetTextView.setTextColor(i);
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.view.findViewById(R.id.text_balloon_distance);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.view.findViewById(R.id.text_balloon_metrics);
        ViewUtilsKt.setupDistanceAndMetricsViews(appCompatTextView, appCompatTextView2, manoeuvre.getManoeuvre().getDistance().getText());
        appCompatTextView.setTextColor(i);
        appCompatTextView2.setTextColor(i);
        Integer manoeuvreImageResourceId = getManoeuvreImageResourceId(manoeuvre.getManoeuvre().getAction());
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.view.findViewById(R.id.image_manoeuvre_balloon_manoeuvre);
        if (manoeuvreImageResourceId != null) {
            Drawable drawable = this.context.getDrawable(manoeuvreImageResourceId.intValue());
            drawable.setTint(i);
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageDrawable(drawable);
        } else {
            appCompatImageView.setVisibility(8);
        }
        DirectionSignView directionSignView = (DirectionSignView) this.view.findViewById(R.id.roadsign_container);
        if (directionSign != null) {
            directionSignView.setVisibility(0);
            directionSignView.setItems(directionSign.getItems());
        } else {
            directionSignView.setVisibility(8);
        }
        Resources resources = this.context.getResources();
        int i2 = R.drawable.mapkit_styling_automotive_contextballoon_background;
        ThreadLocal threadLocal = wuj0.a;
        Drawable b = yma1.b(resources, i2, null);
        b.setTint(this.backgroundColor.get(isNightMode));
        View view = this.view;
        WeakHashMap weakHashMap = b.a;
        view.setBackground(b);
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
